package com.android.thinkive.framework.displayingbitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.android.thinkive.framework.cache.DiskLruCache;
import java.io.File;
import java.io.IOException;

public class ImageFetcher
  extends ImageResizer
{
  private static final int DISK_CACHE_INDEX = 0;
  private static final String HTTP_CACHE_DIR = "http";
  private static final int HTTP_CACHE_SIZE = 10485760;
  private static final int IO_BUFFER_SIZE = 8192;
  private static final String TAG = "ImageFetcher";
  private File mHttpCacheDir;
  private DiskLruCache mHttpDiskCache;
  private final Object mHttpDiskCacheLock = new Object();
  private boolean mHttpDiskCacheStarting = true;
  
  public ImageFetcher(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    init(paramContext);
  }
  
  public ImageFetcher(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1, paramInt2);
    init(paramContext);
  }
  
  private void checkConnection(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnectedOrConnecting()))
    {
      Toast.makeText(paramContext, "无网络连接!", 1).show();
      android.util.Log.e("ImageFetcher", "checkConnection - no connection found");
    }
  }
  
  public static void disableConnectionReuseIfNecessary()
  {
    if (Build.VERSION.SDK_INT < 8) {
      System.setProperty("http.keepAlive", "false");
    }
  }
  
  private void init(Context paramContext)
  {
    checkConnection(paramContext);
    this.mHttpCacheDir = ImageCache.getDiskCacheDir(paramContext, "http");
  }
  
  private void initHttpDiskCache()
  {
    if (!this.mHttpCacheDir.exists()) {
      this.mHttpCacheDir.mkdirs();
    }
    synchronized (this.mHttpDiskCacheLock)
    {
      long l = ImageCache.getUsableSpace(this.mHttpCacheDir);
      if (l > 10485760L) {}
      try
      {
        this.mHttpDiskCache = DiskLruCache.open(this.mHttpCacheDir, 1, 1, 10485760L);
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageFetcher", "HTTP cache initialized");
        }
        this.mHttpDiskCacheStarting = false;
        this.mHttpDiskCacheLock.notifyAll();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.mHttpDiskCache = null;
        }
      }
    }
  }
  
  /* Error */
  private Bitmap processBitmap(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: getstatic 143	com/android/thinkive/framework/util/Log:isDebug	Z
    //   6: ifeq +25 -> 31
    //   9: ldc 18
    //   11: new 159	java/lang/StringBuilder
    //   14: dup
    //   15: ldc -95
    //   17: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokestatic 148	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   30: pop
    //   31: aload_1
    //   32: invokestatic 176	com/android/thinkive/framework/displayingbitmap/ImageCache:hashKeyForDisk	(Ljava/lang/String;)Ljava/lang/String;
    //   35: astore 4
    //   37: aload_0
    //   38: getfield 39	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCacheLock	Ljava/lang/Object;
    //   41: astore 6
    //   43: aload 6
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 32	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCacheStarting	Z
    //   50: ifne +170 -> 220
    //   53: aload_0
    //   54: getfield 138	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   57: astore_2
    //   58: aload_2
    //   59: ifnull +364 -> 423
    //   62: aload_0
    //   63: getfield 138	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   66: aload 4
    //   68: invokevirtual 180	com/android/thinkive/framework/cache/DiskLruCache:get	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;
    //   71: astore_3
    //   72: aload_3
    //   73: astore_2
    //   74: aload_3
    //   75: ifnonnull +58 -> 133
    //   78: getstatic 143	com/android/thinkive/framework/util/Log:isDebug	Z
    //   81: ifeq +11 -> 92
    //   84: ldc 18
    //   86: ldc -74
    //   88: invokestatic 148	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   91: pop
    //   92: aload_0
    //   93: getfield 138	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   96: aload 4
    //   98: invokevirtual 186	com/android/thinkive/framework/cache/DiskLruCache:edit	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Editor;
    //   101: astore_2
    //   102: aload_2
    //   103: ifnull +20 -> 123
    //   106: aload_0
    //   107: aload_1
    //   108: aload_2
    //   109: iconst_0
    //   110: invokevirtual 192	com/android/thinkive/framework/cache/DiskLruCache$Editor:newOutputStream	(I)Ljava/io/OutputStream;
    //   113: invokevirtual 196	com/android/thinkive/framework/displayingbitmap/ImageFetcher:downloadUrlToStream	(Ljava/lang/String;Ljava/io/OutputStream;)Z
    //   116: ifeq +118 -> 234
    //   119: aload_2
    //   120: invokevirtual 199	com/android/thinkive/framework/cache/DiskLruCache$Editor:commit	()V
    //   123: aload_0
    //   124: getfield 138	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   127: aload 4
    //   129: invokevirtual 180	com/android/thinkive/framework/cache/DiskLruCache:get	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;
    //   132: astore_2
    //   133: aload_2
    //   134: ifnull +281 -> 415
    //   137: aload_2
    //   138: iconst_0
    //   139: invokevirtual 205	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:getInputStream	(I)Ljava/io/InputStream;
    //   142: checkcast 207	java/io/FileInputStream
    //   145: astore_1
    //   146: aload_1
    //   147: invokevirtual 211	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   150: astore_3
    //   151: aload_1
    //   152: astore 4
    //   154: aload_3
    //   155: astore_1
    //   156: aload 4
    //   158: astore_2
    //   159: aload_3
    //   160: ifnonnull +23 -> 183
    //   163: aload_3
    //   164: astore_1
    //   165: aload 4
    //   167: astore_2
    //   168: aload 4
    //   170: ifnull +13 -> 183
    //   173: aload 4
    //   175: invokevirtual 214	java/io/FileInputStream:close	()V
    //   178: aload 4
    //   180: astore_2
    //   181: aload_3
    //   182: astore_1
    //   183: aload 6
    //   185: monitorexit
    //   186: aload 5
    //   188: astore_3
    //   189: aload_1
    //   190: ifnull +20 -> 210
    //   193: aload_1
    //   194: aload_0
    //   195: getfield 217	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mImageWidth	I
    //   198: aload_0
    //   199: getfield 220	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mImageHeight	I
    //   202: aload_0
    //   203: invokevirtual 224	com/android/thinkive/framework/displayingbitmap/ImageFetcher:getImageCache	()Lcom/android/thinkive/framework/displayingbitmap/ImageCache;
    //   206: invokestatic 228	com/android/thinkive/framework/displayingbitmap/ImageFetcher:decodeSampledBitmapFromDescriptor	(Ljava/io/FileDescriptor;IILcom/android/thinkive/framework/displayingbitmap/ImageCache;)Landroid/graphics/Bitmap;
    //   209: astore_3
    //   210: aload_2
    //   211: ifnull +7 -> 218
    //   214: aload_2
    //   215: invokevirtual 214	java/io/FileInputStream:close	()V
    //   218: aload_3
    //   219: areturn
    //   220: aload_0
    //   221: getfield 39	com/android/thinkive/framework/displayingbitmap/ImageFetcher:mHttpDiskCacheLock	Ljava/lang/Object;
    //   224: invokevirtual 231	java/lang/Object:wait	()V
    //   227: goto -181 -> 46
    //   230: astore_2
    //   231: goto -185 -> 46
    //   234: aload_2
    //   235: invokevirtual 234	com/android/thinkive/framework/cache/DiskLruCache$Editor:abort	()V
    //   238: goto -115 -> 123
    //   241: astore_3
    //   242: aconst_null
    //   243: astore_2
    //   244: aload_2
    //   245: astore_1
    //   246: ldc 18
    //   248: new 159	java/lang/StringBuilder
    //   251: dup
    //   252: ldc -95
    //   254: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   257: aload_3
    //   258: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   261: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   264: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   267: pop
    //   268: aload_2
    //   269: astore_3
    //   270: iconst_0
    //   271: ifne +137 -> 408
    //   274: aload_2
    //   275: astore_3
    //   276: aload_2
    //   277: ifnull +131 -> 408
    //   280: aload_2
    //   281: invokevirtual 214	java/io/FileInputStream:close	()V
    //   284: aconst_null
    //   285: astore_1
    //   286: goto -103 -> 183
    //   289: astore_1
    //   290: aconst_null
    //   291: astore_1
    //   292: goto -109 -> 183
    //   295: astore_3
    //   296: aconst_null
    //   297: astore_2
    //   298: aload_2
    //   299: astore_1
    //   300: ldc 18
    //   302: new 159	java/lang/StringBuilder
    //   305: dup
    //   306: ldc -95
    //   308: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   311: aload_3
    //   312: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   315: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   321: pop
    //   322: aload_2
    //   323: astore_3
    //   324: iconst_0
    //   325: ifne +83 -> 408
    //   328: aload_2
    //   329: astore_3
    //   330: aload_2
    //   331: ifnull +77 -> 408
    //   334: aload_2
    //   335: invokevirtual 214	java/io/FileInputStream:close	()V
    //   338: aconst_null
    //   339: astore_1
    //   340: goto -157 -> 183
    //   343: astore_1
    //   344: aconst_null
    //   345: astore_1
    //   346: goto -163 -> 183
    //   349: astore_2
    //   350: aconst_null
    //   351: astore_1
    //   352: iconst_0
    //   353: ifne +11 -> 364
    //   356: aload_1
    //   357: ifnull +7 -> 364
    //   360: aload_1
    //   361: invokevirtual 214	java/io/FileInputStream:close	()V
    //   364: aload_2
    //   365: athrow
    //   366: astore_1
    //   367: aload 6
    //   369: monitorexit
    //   370: aload_1
    //   371: athrow
    //   372: astore_1
    //   373: goto -9 -> 364
    //   376: astore_1
    //   377: aload_3
    //   378: astore_1
    //   379: aload 4
    //   381: astore_2
    //   382: goto -199 -> 183
    //   385: astore_1
    //   386: aload_3
    //   387: areturn
    //   388: astore_2
    //   389: goto -37 -> 352
    //   392: astore_2
    //   393: goto -41 -> 352
    //   396: astore_3
    //   397: aload_1
    //   398: astore_2
    //   399: goto -101 -> 298
    //   402: astore_3
    //   403: aload_1
    //   404: astore_2
    //   405: goto -161 -> 244
    //   408: aconst_null
    //   409: astore_1
    //   410: aload_3
    //   411: astore_2
    //   412: goto -229 -> 183
    //   415: aconst_null
    //   416: astore 4
    //   418: aconst_null
    //   419: astore_3
    //   420: goto -266 -> 154
    //   423: aconst_null
    //   424: astore_2
    //   425: aconst_null
    //   426: astore_1
    //   427: goto -244 -> 183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	430	0	this	ImageFetcher
    //   0	430	1	paramString	String
    //   57	158	2	localObject1	Object
    //   230	5	2	localInterruptedException	InterruptedException
    //   243	92	2	localObject2	Object
    //   349	16	2	localObject3	Object
    //   381	1	2	str1	String
    //   388	1	2	localObject4	Object
    //   392	1	2	localObject5	Object
    //   398	27	2	localObject6	Object
    //   71	148	3	localObject7	Object
    //   241	17	3	localIOException1	IOException
    //   269	7	3	localObject8	Object
    //   295	17	3	localIllegalStateException1	IllegalStateException
    //   323	64	3	localObject9	Object
    //   396	1	3	localIllegalStateException2	IllegalStateException
    //   402	9	3	localIOException2	IOException
    //   419	1	3	localObject10	Object
    //   35	382	4	str2	String
    //   1	186	5	localObject11	Object
    //   41	327	6	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   220	227	230	java/lang/InterruptedException
    //   62	72	241	java/io/IOException
    //   78	92	241	java/io/IOException
    //   92	102	241	java/io/IOException
    //   106	123	241	java/io/IOException
    //   123	133	241	java/io/IOException
    //   137	146	241	java/io/IOException
    //   234	238	241	java/io/IOException
    //   280	284	289	java/io/IOException
    //   62	72	295	java/lang/IllegalStateException
    //   78	92	295	java/lang/IllegalStateException
    //   92	102	295	java/lang/IllegalStateException
    //   106	123	295	java/lang/IllegalStateException
    //   123	133	295	java/lang/IllegalStateException
    //   137	146	295	java/lang/IllegalStateException
    //   234	238	295	java/lang/IllegalStateException
    //   334	338	343	java/io/IOException
    //   62	72	349	finally
    //   78	92	349	finally
    //   92	102	349	finally
    //   106	123	349	finally
    //   123	133	349	finally
    //   137	146	349	finally
    //   234	238	349	finally
    //   46	58	366	finally
    //   173	178	366	finally
    //   183	186	366	finally
    //   220	227	366	finally
    //   280	284	366	finally
    //   334	338	366	finally
    //   360	364	366	finally
    //   364	366	366	finally
    //   367	370	366	finally
    //   360	364	372	java/io/IOException
    //   173	178	376	java/io/IOException
    //   214	218	385	java/io/IOException
    //   146	151	388	finally
    //   246	268	392	finally
    //   300	322	392	finally
    //   146	151	396	java/lang/IllegalStateException
    //   146	151	402	java/io/IOException
  }
  
  protected void clearCacheInternal()
  {
    super.clearCacheInternal();
    synchronized (this.mHttpDiskCacheLock)
    {
      if (this.mHttpDiskCache != null)
      {
        boolean bool = this.mHttpDiskCache.isClosed();
        if (bool) {}
      }
      try
      {
        this.mHttpDiskCache.delete();
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageFetcher", "HTTP cache cleared");
        }
        this.mHttpDiskCache = null;
        this.mHttpDiskCacheStarting = true;
        initHttpDiskCache();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageFetcher", "clearCacheInternal - " + localIOException);
        }
      }
    }
  }
  
  protected void closeCacheInternal()
  {
    super.closeCacheInternal();
    synchronized (this.mHttpDiskCacheLock)
    {
      DiskLruCache localDiskLruCache = this.mHttpDiskCache;
      if (localDiskLruCache != null) {}
      try
      {
        if (!this.mHttpDiskCache.isClosed())
        {
          this.mHttpDiskCache.close();
          this.mHttpDiskCache = null;
          if (com.android.thinkive.framework.util.Log.isDebug) {
            android.util.Log.d("ImageFetcher", "HTTP cache closed");
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageFetcher", "closeCacheInternal - " + localIOException);
        }
      }
    }
  }
  
  /* Error */
  public boolean downloadUrlToStream(String paramString, java.io.OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 6
    //   6: invokestatic 262	com/android/thinkive/framework/displayingbitmap/ImageFetcher:disableConnectionReuseIfNecessary	()V
    //   9: new 264	java/net/URL
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 265	java/net/URL:<init>	(Ljava/lang/String;)V
    //   17: invokevirtual 269	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   20: checkcast 271	java/net/HttpURLConnection
    //   23: astore_1
    //   24: new 273	java/io/BufferedInputStream
    //   27: dup
    //   28: aload_1
    //   29: invokevirtual 276	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   32: sipush 8192
    //   35: invokespecial 279	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   38: astore_3
    //   39: new 281	java/io/BufferedOutputStream
    //   42: dup
    //   43: aload_2
    //   44: sipush 8192
    //   47: invokespecial 284	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   50: astore 5
    //   52: aload_3
    //   53: invokevirtual 288	java/io/BufferedInputStream:read	()I
    //   56: istore 7
    //   58: iload 7
    //   60: iconst_m1
    //   61: if_icmpne +31 -> 92
    //   64: aload_1
    //   65: ifnull +7 -> 72
    //   68: aload_1
    //   69: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   72: aload 5
    //   74: ifnull +8 -> 82
    //   77: aload 5
    //   79: invokevirtual 292	java/io/BufferedOutputStream:close	()V
    //   82: aload_3
    //   83: ifnull +7 -> 90
    //   86: aload_3
    //   87: invokevirtual 293	java/io/BufferedInputStream:close	()V
    //   90: iconst_1
    //   91: ireturn
    //   92: aload 5
    //   94: iload 7
    //   96: invokevirtual 297	java/io/BufferedOutputStream:write	(I)V
    //   99: goto -47 -> 52
    //   102: astore_2
    //   103: aload 5
    //   105: astore 4
    //   107: aload_2
    //   108: astore 5
    //   110: aload_1
    //   111: astore_2
    //   112: aload_3
    //   113: astore_1
    //   114: aload 5
    //   116: astore_3
    //   117: ldc 18
    //   119: new 159	java/lang/StringBuilder
    //   122: dup
    //   123: ldc_w 299
    //   126: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: aload_3
    //   130: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   139: pop
    //   140: aload_2
    //   141: ifnull +7 -> 148
    //   144: aload_2
    //   145: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   148: aload 4
    //   150: ifnull +8 -> 158
    //   153: aload 4
    //   155: invokevirtual 292	java/io/BufferedOutputStream:close	()V
    //   158: aload_1
    //   159: ifnull +7 -> 166
    //   162: aload_1
    //   163: invokevirtual 293	java/io/BufferedInputStream:close	()V
    //   166: iconst_0
    //   167: ireturn
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_3
    //   171: aconst_null
    //   172: astore_2
    //   173: aload_2
    //   174: ifnull +7 -> 181
    //   177: aload_2
    //   178: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   181: aload_3
    //   182: ifnull +7 -> 189
    //   185: aload_3
    //   186: invokevirtual 292	java/io/BufferedOutputStream:close	()V
    //   189: aload 4
    //   191: ifnull +8 -> 199
    //   194: aload 4
    //   196: invokevirtual 293	java/io/BufferedInputStream:close	()V
    //   199: aload_1
    //   200: athrow
    //   201: astore_2
    //   202: goto -3 -> 199
    //   205: astore 5
    //   207: aconst_null
    //   208: astore_3
    //   209: aload_1
    //   210: astore_2
    //   211: aload 5
    //   213: astore_1
    //   214: goto -41 -> 173
    //   217: astore 4
    //   219: aconst_null
    //   220: astore 5
    //   222: aload_1
    //   223: astore_2
    //   224: aload 4
    //   226: astore_1
    //   227: aload_3
    //   228: astore 4
    //   230: aload 5
    //   232: astore_3
    //   233: goto -60 -> 173
    //   236: astore 4
    //   238: aload_1
    //   239: astore_2
    //   240: aload 4
    //   242: astore_1
    //   243: aload_3
    //   244: astore 4
    //   246: aload 5
    //   248: astore_3
    //   249: goto -76 -> 173
    //   252: astore 5
    //   254: aload 4
    //   256: astore_3
    //   257: aload_1
    //   258: astore 4
    //   260: aload 5
    //   262: astore_1
    //   263: goto -90 -> 173
    //   266: astore_1
    //   267: goto -101 -> 166
    //   270: astore_3
    //   271: aconst_null
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_2
    //   275: aload 6
    //   277: astore 4
    //   279: goto -162 -> 117
    //   282: astore_3
    //   283: aload_1
    //   284: astore_2
    //   285: aconst_null
    //   286: astore_1
    //   287: aload 6
    //   289: astore 4
    //   291: goto -174 -> 117
    //   294: astore 5
    //   296: aload_3
    //   297: astore_2
    //   298: aload_1
    //   299: astore 4
    //   301: aload 5
    //   303: astore_3
    //   304: aload_2
    //   305: astore_1
    //   306: aload 4
    //   308: astore_2
    //   309: aload 6
    //   311: astore 4
    //   313: goto -196 -> 117
    //   316: astore_1
    //   317: goto -227 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	320	0	this	ImageFetcher
    //   0	320	1	paramString	String
    //   0	320	2	paramOutputStream	java.io.OutputStream
    //   38	219	3	localObject1	Object
    //   270	1	3	localIOException1	IOException
    //   282	15	3	localIOException2	IOException
    //   303	1	3	localObject2	Object
    //   1	194	4	localObject3	Object
    //   217	8	4	localObject4	Object
    //   228	1	4	localObject5	Object
    //   236	5	4	localObject6	Object
    //   244	68	4	localObject7	Object
    //   50	65	5	localObject8	Object
    //   205	7	5	localObject9	Object
    //   220	27	5	localObject10	Object
    //   252	9	5	localObject11	Object
    //   294	8	5	localIOException3	IOException
    //   4	306	6	localObject12	Object
    //   56	39	7	i	int
    // Exception table:
    //   from	to	target	type
    //   52	58	102	java/io/IOException
    //   92	99	102	java/io/IOException
    //   9	24	168	finally
    //   185	189	201	java/io/IOException
    //   194	199	201	java/io/IOException
    //   24	39	205	finally
    //   39	52	217	finally
    //   52	58	236	finally
    //   92	99	236	finally
    //   117	140	252	finally
    //   153	158	266	java/io/IOException
    //   162	166	266	java/io/IOException
    //   9	24	270	java/io/IOException
    //   24	39	282	java/io/IOException
    //   39	52	294	java/io/IOException
    //   77	82	316	java/io/IOException
    //   86	90	316	java/io/IOException
  }
  
  protected void flushCacheInternal()
  {
    super.flushCacheInternal();
    synchronized (this.mHttpDiskCacheLock)
    {
      DiskLruCache localDiskLruCache = this.mHttpDiskCache;
      if (localDiskLruCache != null) {}
      try
      {
        this.mHttpDiskCache.flush();
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageFetcher", "HTTP cache flushed");
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageFetcher", "flush - " + localIOException);
        }
      }
    }
  }
  
  protected void initDiskCacheInternal()
  {
    super.initDiskCacheInternal();
    initHttpDiskCache();
  }
  
  protected Bitmap processBitmap(Object paramObject)
  {
    return processBitmap(String.valueOf(paramObject));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */