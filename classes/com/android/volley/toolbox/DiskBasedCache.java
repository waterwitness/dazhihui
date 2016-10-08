package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.Cache.Entry;
import com.android.volley.VolleyLog;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DiskBasedCache
  implements Cache
{
  private static final int CACHE_MAGIC = 538247942;
  private static final int DEFAULT_DISK_USAGE_BYTES = 5242880;
  private static final float HYSTERESIS_FACTOR = 0.9F;
  private final Map<String, DiskBasedCache.CacheHeader> mEntries = new LinkedHashMap(16, 0.75F, true);
  private final int mMaxCacheSizeInBytes;
  private final File mRootDirectory;
  private long mTotalSize = 0L;
  
  public DiskBasedCache(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  public DiskBasedCache(File paramFile, int paramInt)
  {
    this.mRootDirectory = paramFile;
    this.mMaxCacheSizeInBytes = paramInt;
  }
  
  private String getFilenameForKey(String paramString)
  {
    int i = paramString.length() / 2;
    return String.valueOf(paramString.substring(0, i).hashCode()) + String.valueOf(paramString.substring(i).hashCode());
  }
  
  private void pruneIfNeeded(int paramInt)
  {
    if (this.mTotalSize + paramInt < this.mMaxCacheSizeInBytes) {
      return;
    }
    long l1;
    long l2;
    Iterator localIterator;
    int i;
    label61:
    while (!VolleyLog.DEBUG)
    {
      if (VolleyLog.DEBUG) {
        VolleyLog.v("Pruning old cache entries.", new Object[0]);
      }
      l1 = this.mTotalSize;
      l2 = SystemClock.elapsedRealtime();
      localIterator = this.mEntries.entrySet().iterator();
      i = 0;
      if (localIterator.hasNext()) {
        break;
      }
    }
    VolleyLog.v("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.mTotalSize - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
    return;
    DiskBasedCache.CacheHeader localCacheHeader = (DiskBasedCache.CacheHeader)((Map.Entry)localIterator.next()).getValue();
    if (getFileForKey(localCacheHeader.key).delete()) {
      this.mTotalSize -= localCacheHeader.size;
    }
    for (;;)
    {
      localIterator.remove();
      int j = i + 1;
      i = j;
      if ((float)(this.mTotalSize + paramInt) < this.mMaxCacheSizeInBytes * 0.9F) {
        break;
      }
      i = j;
      break label61;
      VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] { localCacheHeader.key, getFilenameForKey(localCacheHeader.key) });
    }
  }
  
  private void putEntry(String paramString, DiskBasedCache.CacheHeader paramCacheHeader)
  {
    if (!this.mEntries.containsKey(paramString)) {}
    DiskBasedCache.CacheHeader localCacheHeader;
    long l;
    for (this.mTotalSize += paramCacheHeader.size;; this.mTotalSize = (paramCacheHeader.size - localCacheHeader.size + l))
    {
      this.mEntries.put(paramString, paramCacheHeader);
      return;
      localCacheHeader = (DiskBasedCache.CacheHeader)this.mEntries.get(paramString);
      l = this.mTotalSize;
    }
  }
  
  private static int read(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  static int readInt(InputStream paramInputStream)
  {
    return 0x0 | read(paramInputStream) << 0 | read(paramInputStream) << 8 | read(paramInputStream) << 16 | read(paramInputStream) << 24;
  }
  
  static long readLong(InputStream paramInputStream)
  {
    return 0L | (read(paramInputStream) & 0xFF) << 0 | (read(paramInputStream) & 0xFF) << 8 | (read(paramInputStream) & 0xFF) << 16 | (read(paramInputStream) & 0xFF) << 24 | (read(paramInputStream) & 0xFF) << 32 | (read(paramInputStream) & 0xFF) << 40 | (read(paramInputStream) & 0xFF) << 48 | (read(paramInputStream) & 0xFF) << 56;
  }
  
  static String readString(InputStream paramInputStream)
  {
    return new String(streamToBytes(paramInputStream, (int)readLong(paramInputStream)), "UTF-8");
  }
  
  static Map<String, String> readStringStringMap(InputStream paramInputStream)
  {
    int j = readInt(paramInputStream);
    Object localObject;
    int i;
    if (j == 0)
    {
      localObject = Collections.emptyMap();
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        return (Map<String, String>)localObject;
        localObject = new HashMap(j);
        break;
      }
      ((Map)localObject).put(readString(paramInputStream).intern(), readString(paramInputStream).intern());
      i += 1;
    }
  }
  
  private void removeEntry(String paramString)
  {
    DiskBasedCache.CacheHeader localCacheHeader = (DiskBasedCache.CacheHeader)this.mEntries.get(paramString);
    if (localCacheHeader != null)
    {
      this.mTotalSize -= localCacheHeader.size;
      this.mEntries.remove(paramString);
    }
  }
  
  private static byte[] streamToBytes(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    for (;;)
    {
      int j;
      if (i < paramInt)
      {
        j = paramInputStream.read(arrayOfByte, i, paramInt - i);
        if (j != -1) {}
      }
      else
      {
        if (i == paramInt) {
          break;
        }
        throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
      }
      i += j;
    }
    return arrayOfByte;
  }
  
  static void writeInt(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  static void writeLong(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void writeString(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    writeLong(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  static void writeStringStringMap(Map<String, String> paramMap, OutputStream paramOutputStream)
  {
    if (paramMap != null)
    {
      writeInt(paramOutputStream, paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      for (;;)
      {
        if (!paramMap.hasNext()) {
          return;
        }
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        writeString(paramOutputStream, (String)localEntry.getKey());
        writeString(paramOutputStream, (String)localEntry.getValue());
      }
    }
    writeInt(paramOutputStream, 0);
  }
  
  public void clear()
  {
    int i = 0;
    for (;;)
    {
      File[] arrayOfFile;
      int j;
      try
      {
        arrayOfFile = this.mRootDirectory.listFiles();
        if (arrayOfFile != null)
        {
          j = arrayOfFile.length;
          break label68;
        }
        this.mEntries.clear();
        this.mTotalSize = 0L;
        VolleyLog.d("Cache cleared.", new Object[0]);
        return;
      }
      finally {}
      arrayOfFile[i].delete();
      i += 1;
      label68:
      if (i < j) {}
    }
  }
  
  /* Error */
  public Cache.Entry get(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	com/android/volley/toolbox/DiskBasedCache:mEntries	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 183 2 0
    //   12: checkcast 143	com/android/volley/toolbox/DiskBasedCache$CacheHeader
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 151	com/android/volley/toolbox/DiskBasedCache:getFileForKey	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 5
    //   35: new 295	com/android/volley/toolbox/DiskBasedCache$CountingInputStream
    //   38: dup
    //   39: new 297	java/io/BufferedInputStream
    //   42: dup
    //   43: new 299	java/io/FileInputStream
    //   46: dup
    //   47: aload 5
    //   49: invokespecial 301	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: invokespecial 304	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: aconst_null
    //   56: invokespecial 307	com/android/volley/toolbox/DiskBasedCache$CountingInputStream:<init>	(Ljava/io/InputStream;Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)V
    //   59: astore_3
    //   60: aload_3
    //   61: astore_2
    //   62: aload_3
    //   63: invokestatic 311	com/android/volley/toolbox/DiskBasedCache$CacheHeader:readHeader	(Ljava/io/InputStream;)Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
    //   66: pop
    //   67: aload_3
    //   68: astore_2
    //   69: aload 4
    //   71: aload_3
    //   72: aload 5
    //   74: invokevirtual 313	java/io/File:length	()J
    //   77: aload_3
    //   78: invokestatic 317	com/android/volley/toolbox/DiskBasedCache$CountingInputStream:access$1	(Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)I
    //   81: i2l
    //   82: lsub
    //   83: l2i
    //   84: invokestatic 207	com/android/volley/toolbox/DiskBasedCache:streamToBytes	(Ljava/io/InputStream;I)[B
    //   87: invokevirtual 321	com/android/volley/toolbox/DiskBasedCache$CacheHeader:toCacheEntry	([B)Lcom/android/volley/Cache$Entry;
    //   90: astore 4
    //   92: aload 4
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: aload_3
    //   98: ifnull -74 -> 24
    //   101: aload_3
    //   102: invokevirtual 324	com/android/volley/toolbox/DiskBasedCache$CountingInputStream:close	()V
    //   105: aload_2
    //   106: astore_1
    //   107: goto -83 -> 24
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_1
    //   113: goto -89 -> 24
    //   116: astore 4
    //   118: aconst_null
    //   119: astore_3
    //   120: aload_3
    //   121: astore_2
    //   122: ldc_w 326
    //   125: iconst_2
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 5
    //   133: invokevirtual 329	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload 4
    //   141: invokevirtual 330	java/io/IOException:toString	()Ljava/lang/String;
    //   144: aastore
    //   145: invokestatic 169	com/android/volley/VolleyLog:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload_3
    //   149: astore_2
    //   150: aload_0
    //   151: aload_1
    //   152: invokevirtual 332	com/android/volley/toolbox/DiskBasedCache:remove	(Ljava/lang/String;)V
    //   155: aload_3
    //   156: ifnull +7 -> 163
    //   159: aload_3
    //   160: invokevirtual 324	com/android/volley/toolbox/DiskBasedCache$CountingInputStream:close	()V
    //   163: aconst_null
    //   164: astore_1
    //   165: goto -141 -> 24
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_1
    //   171: goto -147 -> 24
    //   174: astore_1
    //   175: aconst_null
    //   176: astore_2
    //   177: aload_2
    //   178: ifnull +7 -> 185
    //   181: aload_2
    //   182: invokevirtual 324	com/android/volley/toolbox/DiskBasedCache$CountingInputStream:close	()V
    //   185: aload_1
    //   186: athrow
    //   187: astore_1
    //   188: aload_0
    //   189: monitorexit
    //   190: aload_1
    //   191: athrow
    //   192: astore_1
    //   193: aconst_null
    //   194: astore_1
    //   195: goto -171 -> 24
    //   198: astore_1
    //   199: goto -22 -> 177
    //   202: astore 4
    //   204: goto -84 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	DiskBasedCache
    //   0	207	1	paramString	String
    //   61	121	2	localObject1	Object
    //   59	101	3	localCountingInputStream	DiskBasedCache.CountingInputStream
    //   15	78	4	localObject2	Object
    //   116	24	4	localIOException1	IOException
    //   202	1	4	localIOException2	IOException
    //   33	99	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   101	105	110	java/io/IOException
    //   35	60	116	java/io/IOException
    //   159	163	168	java/io/IOException
    //   35	60	174	finally
    //   2	17	187	finally
    //   28	35	187	finally
    //   101	105	187	finally
    //   159	163	187	finally
    //   181	185	187	finally
    //   185	187	187	finally
    //   181	185	192	java/io/IOException
    //   62	67	198	finally
    //   69	92	198	finally
    //   122	148	198	finally
    //   150	155	198	finally
    //   62	67	202	java/io/IOException
    //   69	92	202	java/io/IOException
  }
  
  public File getFileForKey(String paramString)
  {
    return new File(this.mRootDirectory, getFilenameForKey(paramString));
  }
  
  /* Error */
  public void initialize()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	com/android/volley/toolbox/DiskBasedCache:mRootDirectory	Ljava/io/File;
    //   6: invokevirtual 339	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 43	com/android/volley/toolbox/DiskBasedCache:mRootDirectory	Ljava/io/File;
    //   16: invokevirtual 342	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 344
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 43	com/android/volley/toolbox/DiskBasedCache:mRootDirectory	Ljava/io/File;
    //   35: invokevirtual 329	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 347	com/android/volley/VolleyLog:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 43	com/android/volley/toolbox/DiskBasedCache:mRootDirectory	Ljava/io/File;
    //   49: invokevirtual 288	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -12 -> 42
    //   57: aload_3
    //   58: arraylength
    //   59: istore 7
    //   61: iconst_0
    //   62: istore 6
    //   64: iload 6
    //   66: iload 7
    //   68: if_icmpge -26 -> 42
    //   71: aload_3
    //   72: iload 6
    //   74: aaload
    //   75: astore 4
    //   77: aconst_null
    //   78: astore_1
    //   79: new 297	java/io/BufferedInputStream
    //   82: dup
    //   83: new 299	java/io/FileInputStream
    //   86: dup
    //   87: aload 4
    //   89: invokespecial 301	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   92: invokespecial 304	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   95: astore_2
    //   96: aload_2
    //   97: astore_1
    //   98: aload_2
    //   99: invokestatic 311	com/android/volley/toolbox/DiskBasedCache$CacheHeader:readHeader	(Ljava/io/InputStream;)Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
    //   102: astore 5
    //   104: aload_2
    //   105: astore_1
    //   106: aload 5
    //   108: aload 4
    //   110: invokevirtual 313	java/io/File:length	()J
    //   113: putfield 159	com/android/volley/toolbox/DiskBasedCache$CacheHeader:size	J
    //   116: aload_2
    //   117: astore_1
    //   118: aload_0
    //   119: aload 5
    //   121: getfield 147	com/android/volley/toolbox/DiskBasedCache$CacheHeader:key	Ljava/lang/String;
    //   124: aload 5
    //   126: invokespecial 349	com/android/volley/toolbox/DiskBasedCache:putEntry	(Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;)V
    //   129: aload_2
    //   130: ifnull +7 -> 137
    //   133: aload_2
    //   134: invokevirtual 350	java/io/BufferedInputStream:close	()V
    //   137: iload 6
    //   139: iconst_1
    //   140: iadd
    //   141: istore 6
    //   143: goto -79 -> 64
    //   146: astore_1
    //   147: aconst_null
    //   148: astore_2
    //   149: aload 4
    //   151: ifnull +11 -> 162
    //   154: aload_2
    //   155: astore_1
    //   156: aload 4
    //   158: invokevirtual 156	java/io/File:delete	()Z
    //   161: pop
    //   162: aload_2
    //   163: ifnull -26 -> 137
    //   166: aload_2
    //   167: invokevirtual 350	java/io/BufferedInputStream:close	()V
    //   170: goto -33 -> 137
    //   173: astore_1
    //   174: goto -37 -> 137
    //   177: astore_3
    //   178: aload_1
    //   179: astore_2
    //   180: aload_3
    //   181: astore_1
    //   182: aload_2
    //   183: ifnull +7 -> 190
    //   186: aload_2
    //   187: invokevirtual 350	java/io/BufferedInputStream:close	()V
    //   190: aload_1
    //   191: athrow
    //   192: astore_1
    //   193: aload_0
    //   194: monitorexit
    //   195: aload_1
    //   196: athrow
    //   197: astore_2
    //   198: goto -8 -> 190
    //   201: astore_1
    //   202: goto -65 -> 137
    //   205: astore_3
    //   206: aload_1
    //   207: astore_2
    //   208: aload_3
    //   209: astore_1
    //   210: goto -28 -> 182
    //   213: astore_1
    //   214: goto -65 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	this	DiskBasedCache
    //   78	40	1	localObject1	Object
    //   146	1	1	localIOException1	IOException
    //   155	1	1	localObject2	Object
    //   173	6	1	localIOException2	IOException
    //   181	10	1	localObject3	Object
    //   192	4	1	localObject4	Object
    //   201	6	1	localIOException3	IOException
    //   209	1	1	localObject5	Object
    //   213	1	1	localIOException4	IOException
    //   95	92	2	localObject6	Object
    //   197	1	2	localIOException5	IOException
    //   207	1	2	localIOException6	IOException
    //   52	20	3	arrayOfFile	File[]
    //   177	4	3	localObject7	Object
    //   205	4	3	localObject8	Object
    //   75	82	4	localFile	File
    //   102	23	5	localCacheHeader	DiskBasedCache.CacheHeader
    //   62	80	6	i	int
    //   59	10	7	j	int
    // Exception table:
    //   from	to	target	type
    //   79	96	146	java/io/IOException
    //   166	170	173	java/io/IOException
    //   79	96	177	finally
    //   2	42	192	finally
    //   45	53	192	finally
    //   57	61	192	finally
    //   133	137	192	finally
    //   166	170	192	finally
    //   186	190	192	finally
    //   190	192	192	finally
    //   186	190	197	java/io/IOException
    //   133	137	201	java/io/IOException
    //   98	104	205	finally
    //   106	116	205	finally
    //   118	129	205	finally
    //   156	162	205	finally
    //   98	104	213	java/io/IOException
    //   106	116	213	java/io/IOException
    //   118	129	213	java/io/IOException
  }
  
  public void invalidate(String paramString, boolean paramBoolean)
  {
    try
    {
      Cache.Entry localEntry = get(paramString);
      if (localEntry != null)
      {
        localEntry.softTtl = 0L;
        if (paramBoolean) {
          localEntry.ttl = 0L;
        }
        put(paramString, localEntry);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void put(String paramString, Cache.Entry paramEntry)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: getfield 369	com/android/volley/Cache$Entry:data	[B
    //   7: arraylength
    //   8: invokespecial 371	com/android/volley/toolbox/DiskBasedCache:pruneIfNeeded	(I)V
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual 151	com/android/volley/toolbox/DiskBasedCache:getFileForKey	(Ljava/lang/String;)Ljava/io/File;
    //   16: astore_3
    //   17: new 373	java/io/BufferedOutputStream
    //   20: dup
    //   21: new 375	java/io/FileOutputStream
    //   24: dup
    //   25: aload_3
    //   26: invokespecial 376	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: invokespecial 379	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore 4
    //   34: new 143	com/android/volley/toolbox/DiskBasedCache$CacheHeader
    //   37: dup
    //   38: aload_1
    //   39: aload_2
    //   40: invokespecial 381	com/android/volley/toolbox/DiskBasedCache$CacheHeader:<init>	(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
    //   43: astore 5
    //   45: aload 5
    //   47: aload 4
    //   49: invokevirtual 385	com/android/volley/toolbox/DiskBasedCache$CacheHeader:writeHeader	(Ljava/io/OutputStream;)Z
    //   52: ifne +61 -> 113
    //   55: aload 4
    //   57: invokevirtual 386	java/io/BufferedOutputStream:close	()V
    //   60: ldc_w 388
    //   63: iconst_1
    //   64: anewarray 4	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_3
    //   70: invokevirtual 329	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   73: aastore
    //   74: invokestatic 169	com/android/volley/VolleyLog:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: new 241	java/io/IOException
    //   80: dup
    //   81: invokespecial 389	java/io/IOException:<init>	()V
    //   84: athrow
    //   85: astore_1
    //   86: aload_3
    //   87: invokevirtual 156	java/io/File:delete	()Z
    //   90: ifne +20 -> 110
    //   93: ldc_w 391
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_3
    //   103: invokevirtual 329	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 169	com/android/volley/VolleyLog:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: aload 4
    //   115: aload_2
    //   116: getfield 369	com/android/volley/Cache$Entry:data	[B
    //   119: invokevirtual 394	java/io/BufferedOutputStream:write	([B)V
    //   122: aload 4
    //   124: invokevirtual 386	java/io/BufferedOutputStream:close	()V
    //   127: aload_0
    //   128: aload_1
    //   129: aload 5
    //   131: invokespecial 349	com/android/volley/toolbox/DiskBasedCache:putEntry	(Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;)V
    //   134: goto -24 -> 110
    //   137: astore_1
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	DiskBasedCache
    //   0	142	1	paramString	String
    //   0	142	2	paramEntry	Cache.Entry
    //   16	87	3	localFile	File
    //   32	91	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   43	87	5	localCacheHeader	DiskBasedCache.CacheHeader
    // Exception table:
    //   from	to	target	type
    //   17	85	85	java/io/IOException
    //   113	134	85	java/io/IOException
    //   2	17	137	finally
    //   17	85	137	finally
    //   86	110	137	finally
    //   113	134	137	finally
  }
  
  public void remove(String paramString)
  {
    try
    {
      boolean bool = getFileForKey(paramString).delete();
      removeEntry(paramString);
      if (!bool) {
        VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, getFilenameForKey(paramString) });
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\DiskBasedCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */