package com.android.thinkive.framework.cache;

import android.os.SystemClock;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.db.ThinkiveDatabase;
import com.android.thinkive.framework.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DataDiskCache
  implements Cache
{
  private static final int DEFAULT_DISK_USAGE_BYTES = 31457280;
  private static final float HYSTERESIS_FACTOR = 0.9F;
  private ThinkiveDatabase mDatabase;
  private final Map<String, DataDiskCache.CacheHeader> mEntries = new LinkedHashMap(16, 0.75F, true);
  private final int mMaxCacheSizeInBytes;
  private final File mRootDirectory;
  private long mTotalSize = 0L;
  
  public DataDiskCache(File paramFile)
  {
    this(paramFile, 31457280);
  }
  
  public DataDiskCache(File paramFile, int paramInt)
  {
    this.mRootDirectory = paramFile;
    this.mMaxCacheSizeInBytes = paramInt;
    this.mDatabase = ThinkiveDatabase.getInstance(ThinkiveInitializer.getInstance().getContext());
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
    long l = this.mTotalSize;
    SystemClock.elapsedRealtime();
    Iterator localIterator = this.mEntries.entrySet().iterator();
    int i = 0;
    label45:
    DataDiskCache.CacheHeader localCacheHeader;
    if (localIterator.hasNext())
    {
      localCacheHeader = (DataDiskCache.CacheHeader)((Map.Entry)localIterator.next()).getValue();
      if (!getFileForKey(localCacheHeader.key).delete()) {
        break label146;
      }
      this.mDatabase.deleteDataCache(localCacheHeader.key);
      this.mTotalSize -= localCacheHeader.size;
    }
    for (;;)
    {
      localIterator.remove();
      if ((float)(this.mTotalSize + paramInt) < this.mMaxCacheSizeInBytes * 0.9F) {
        break;
      }
      i += 1;
      break label45;
      break;
      label146:
      Log.d("Could not delete disk cache entry for key = " + localCacheHeader.key + ", filename = " + getFilenameForKey(localCacheHeader.key));
    }
  }
  
  private void putEntry(String paramString, DataDiskCache.CacheHeader paramCacheHeader)
  {
    if (!this.mEntries.containsKey(paramString)) {}
    DataDiskCache.CacheHeader localCacheHeader;
    long l;
    for (this.mTotalSize += paramCacheHeader.size;; this.mTotalSize = (paramCacheHeader.size - localCacheHeader.size + l))
    {
      this.mEntries.put(paramString, paramCacheHeader);
      return;
      localCacheHeader = (DataDiskCache.CacheHeader)this.mEntries.get(paramString);
      l = this.mTotalSize;
    }
  }
  
  private void removeEntry(String paramString)
  {
    DataDiskCache.CacheHeader localCacheHeader = (DataDiskCache.CacheHeader)this.mEntries.get(paramString);
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
  
  public void clear()
  {
    for (;;)
    {
      File[] arrayOfFile;
      int j;
      int i;
      try
      {
        arrayOfFile = this.mRootDirectory.listFiles();
        if (arrayOfFile != null)
        {
          j = arrayOfFile.length;
          i = 0;
          break label71;
        }
        this.mEntries.clear();
        this.mTotalSize = 0L;
        this.mDatabase.deleteAllDataCache();
        Log.d("Disk Cache cleared.");
        return;
      }
      finally {}
      arrayOfFile[i].delete();
      i += 1;
      label71:
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
    //   3: getfield 39	com/android/thinkive/framework/cache/DataDiskCache:mEntries	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 184 2 0
    //   12: checkcast 136	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader
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
    //   30: invokevirtual 144	com/android/thinkive/framework/cache/DataDiskCache:getFileForKey	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 5
    //   35: new 222	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream
    //   38: dup
    //   39: new 224	java/io/BufferedInputStream
    //   42: dup
    //   43: new 226	java/io/FileInputStream
    //   46: dup
    //   47: aload 5
    //   49: invokespecial 228	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: invokespecial 231	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: aconst_null
    //   56: invokespecial 234	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream:<init>	(Ljava/io/InputStream;Lcom/android/thinkive/framework/cache/DataDiskCache$CountingInputStream;)V
    //   59: astore_3
    //   60: aload_3
    //   61: astore_2
    //   62: aload 4
    //   64: aload_3
    //   65: aload 5
    //   67: invokevirtual 236	java/io/File:length	()J
    //   70: aload_3
    //   71: invokestatic 240	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream:access$1	(Lcom/android/thinkive/framework/cache/DataDiskCache$CountingInputStream;)I
    //   74: i2l
    //   75: lsub
    //   76: l2i
    //   77: invokestatic 242	com/android/thinkive/framework/cache/DataDiskCache:streamToBytes	(Ljava/io/InputStream;I)[B
    //   80: invokevirtual 246	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader:toCacheEntry	([B)Lcom/android/thinkive/framework/cache/Cache$Entry;
    //   83: astore 4
    //   85: aload 4
    //   87: astore_2
    //   88: aload_2
    //   89: astore_1
    //   90: aload_3
    //   91: ifnull -67 -> 24
    //   94: aload_3
    //   95: invokevirtual 249	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream:close	()V
    //   98: aload_2
    //   99: astore_1
    //   100: goto -76 -> 24
    //   103: astore_1
    //   104: aconst_null
    //   105: astore_1
    //   106: goto -82 -> 24
    //   109: astore 4
    //   111: aconst_null
    //   112: astore_3
    //   113: aload_3
    //   114: astore_2
    //   115: aload 4
    //   117: invokevirtual 252	java/io/IOException:printStackTrace	()V
    //   120: aload_3
    //   121: astore_2
    //   122: aload_0
    //   123: aload_1
    //   124: invokevirtual 254	com/android/thinkive/framework/cache/DataDiskCache:remove	(Ljava/lang/String;)V
    //   127: aload_3
    //   128: ifnull +7 -> 135
    //   131: aload_3
    //   132: invokevirtual 249	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream:close	()V
    //   135: aconst_null
    //   136: astore_1
    //   137: goto -113 -> 24
    //   140: astore_1
    //   141: aconst_null
    //   142: astore_1
    //   143: goto -119 -> 24
    //   146: astore_1
    //   147: aconst_null
    //   148: astore_2
    //   149: aload_2
    //   150: ifnull +7 -> 157
    //   153: aload_2
    //   154: invokevirtual 249	com/android/thinkive/framework/cache/DataDiskCache$CountingInputStream:close	()V
    //   157: aload_1
    //   158: athrow
    //   159: astore_1
    //   160: aload_0
    //   161: monitorexit
    //   162: aload_1
    //   163: athrow
    //   164: astore_1
    //   165: aconst_null
    //   166: astore_1
    //   167: goto -143 -> 24
    //   170: astore_1
    //   171: goto -22 -> 149
    //   174: astore 4
    //   176: goto -63 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	DataDiskCache
    //   0	179	1	paramString	String
    //   61	93	2	localObject1	Object
    //   59	73	3	localCountingInputStream	DataDiskCache.CountingInputStream
    //   15	71	4	localObject2	Object
    //   109	7	4	localIOException1	IOException
    //   174	1	4	localIOException2	IOException
    //   33	33	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   94	98	103	java/io/IOException
    //   35	60	109	java/io/IOException
    //   131	135	140	java/io/IOException
    //   35	60	146	finally
    //   2	17	159	finally
    //   28	35	159	finally
    //   94	98	159	finally
    //   131	135	159	finally
    //   153	157	159	finally
    //   157	159	159	finally
    //   153	157	164	java/io/IOException
    //   62	85	170	finally
    //   115	120	170	finally
    //   122	127	170	finally
    //   62	85	174	java/io/IOException
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
    //   3: getfield 43	com/android/thinkive/framework/cache/DataDiskCache:mRootDirectory	Ljava/io/File;
    //   6: invokevirtual 261	java/io/File:exists	()Z
    //   9: ifne +42 -> 51
    //   12: aload_0
    //   13: getfield 43	com/android/thinkive/framework/cache/DataDiskCache:mRootDirectory	Ljava/io/File;
    //   16: invokevirtual 264	java/io/File:mkdirs	()Z
    //   19: ifne +29 -> 48
    //   22: new 72	java/lang/StringBuilder
    //   25: dup
    //   26: ldc_w 266
    //   29: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield 43	com/android/thinkive/framework/cache/DataDiskCache:mRootDirectory	Ljava/io/File;
    //   36: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   39: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 272	com/android/thinkive/framework/util/Log:e	(Ljava/lang/String;)V
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload_0
    //   52: getfield 43	com/android/thinkive/framework/cache/DataDiskCache:mRootDirectory	Ljava/io/File;
    //   55: invokevirtual 212	java/io/File:listFiles	()[Ljava/io/File;
    //   58: ifnull -10 -> 48
    //   61: aload_0
    //   62: getfield 62	com/android/thinkive/framework/cache/DataDiskCache:mDatabase	Lcom/android/thinkive/framework/db/ThinkiveDatabase;
    //   65: invokevirtual 276	com/android/thinkive/framework/db/ThinkiveDatabase:getAllDataCache	()Ljava/util/ArrayList;
    //   68: invokevirtual 279	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   71: astore_1
    //   72: aload_1
    //   73: invokeinterface 125 1 0
    //   78: ifeq -30 -> 48
    //   81: aload_1
    //   82: invokeinterface 129 1 0
    //   87: checkcast 136	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader
    //   90: astore_2
    //   91: aload_0
    //   92: aload_2
    //   93: getfield 140	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader:key	Ljava/lang/String;
    //   96: aload_2
    //   97: invokespecial 281	com/android/thinkive/framework/cache/DataDiskCache:putEntry	(Ljava/lang/String;Lcom/android/thinkive/framework/cache/DataDiskCache$CacheHeader;)V
    //   100: goto -28 -> 72
    //   103: astore_1
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_1
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	DataDiskCache
    //   71	11	1	localIterator	Iterator
    //   103	4	1	localObject	Object
    //   90	7	2	localCacheHeader	DataDiskCache.CacheHeader
    // Exception table:
    //   from	to	target	type
    //   2	48	103	finally
    //   51	72	103	finally
    //   72	100	103	finally
  }
  
  public void invalidate(String paramString, boolean paramBoolean)
  {
    try
    {
      Cache.Entry localEntry = get(paramString);
      if (localEntry != null)
      {
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
    //   4: getfield 297	com/android/thinkive/framework/cache/Cache$Entry:data	[B
    //   7: arraylength
    //   8: invokespecial 299	com/android/thinkive/framework/cache/DataDiskCache:pruneIfNeeded	(I)V
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual 144	com/android/thinkive/framework/cache/DataDiskCache:getFileForKey	(Ljava/lang/String;)Ljava/io/File;
    //   16: astore_3
    //   17: new 301	java/io/BufferedOutputStream
    //   20: dup
    //   21: new 303	java/io/FileOutputStream
    //   24: dup
    //   25: aload_3
    //   26: invokespecial 304	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: invokespecial 307	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore 4
    //   34: new 136	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader
    //   37: dup
    //   38: aload_1
    //   39: aload_2
    //   40: invokespecial 309	com/android/thinkive/framework/cache/DataDiskCache$CacheHeader:<init>	(Ljava/lang/String;Lcom/android/thinkive/framework/cache/Cache$Entry;)V
    //   43: astore 5
    //   45: aload 4
    //   47: aload_2
    //   48: getfield 297	com/android/thinkive/framework/cache/Cache$Entry:data	[B
    //   51: invokevirtual 313	java/io/BufferedOutputStream:write	([B)V
    //   54: aload 4
    //   56: invokevirtual 314	java/io/BufferedOutputStream:close	()V
    //   59: aload_0
    //   60: aload_1
    //   61: aload 5
    //   63: invokespecial 281	com/android/thinkive/framework/cache/DataDiskCache:putEntry	(Ljava/lang/String;Lcom/android/thinkive/framework/cache/DataDiskCache$CacheHeader;)V
    //   66: aload_0
    //   67: getfield 62	com/android/thinkive/framework/cache/DataDiskCache:mDatabase	Lcom/android/thinkive/framework/db/ThinkiveDatabase;
    //   70: aload 5
    //   72: invokevirtual 318	com/android/thinkive/framework/db/ThinkiveDatabase:insertDataCache	(Lcom/android/thinkive/framework/cache/DataDiskCache$CacheHeader;)J
    //   75: pop2
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_1
    //   80: aload_1
    //   81: invokevirtual 252	java/io/IOException:printStackTrace	()V
    //   84: aload_3
    //   85: invokevirtual 149	java/io/File:delete	()Z
    //   88: ifne -12 -> 76
    //   91: new 72	java/lang/StringBuilder
    //   94: dup
    //   95: ldc_w 320
    //   98: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_3
    //   102: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   105: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 170	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   114: goto -38 -> 76
    //   117: astore_1
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	DataDiskCache
    //   0	122	1	paramString	String
    //   0	122	2	paramEntry	Cache.Entry
    //   16	86	3	localFile	File
    //   32	23	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   43	28	5	localCacheHeader	DataDiskCache.CacheHeader
    // Exception table:
    //   from	to	target	type
    //   17	76	79	java/io/IOException
    //   2	17	117	finally
    //   17	76	117	finally
    //   80	114	117	finally
  }
  
  public void remove(String paramString)
  {
    try
    {
      boolean bool = getFileForKey(paramString).delete();
      removeEntry(paramString);
      this.mDatabase.deleteDataCache(paramString);
      if (!bool) {
        Log.d("Could not delete disk cache entry for key = " + paramString + " filename = " + getFilenameForKey(paramString));
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DataDiskCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */