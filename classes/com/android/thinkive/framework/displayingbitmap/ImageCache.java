package com.android.thinkive.framework.displayingbitmap;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.c.g;
import com.android.thinkive.framework.cache.DiskLruCache;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ImageCache
{
  private static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
  private static final int DEFAULT_COMPRESS_QUALITY = 70;
  private static final boolean DEFAULT_DISK_CACHE_ENABLED = true;
  private static final int DEFAULT_DISK_CACHE_SIZE = 31457280;
  private static final boolean DEFAULT_INIT_DISK_CACHE_ON_CREATE = false;
  private static final boolean DEFAULT_MEM_CACHE_ENABLED = true;
  private static final int DEFAULT_MEM_CACHE_SIZE = 5120;
  private static final int DISK_CACHE_INDEX = 0;
  private static final String TAG = "ImageCache";
  private static ImageCache sInstance;
  private ImageCache.ImageCacheParams mCacheParams;
  private final Object mDiskCacheLock = new Object();
  private boolean mDiskCacheStarting = true;
  private DiskLruCache mDiskLruCache;
  private g<String, BitmapDrawable> mMemoryCache;
  private Set<SoftReference<Bitmap>> mReusableBitmaps;
  
  private ImageCache(ImageCache.ImageCacheParams paramImageCacheParams)
  {
    init(paramImageCacheParams);
  }
  
  private static String bytesToHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte.length) {
        return localStringBuilder.toString();
      }
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() == 1) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i += 1;
    }
  }
  
  @TargetApi(19)
  private static boolean canUseForInBitmap(Bitmap paramBitmap, BitmapFactory.Options paramOptions)
  {
    if (!Utils.hasKitKat()) {
      if ((paramBitmap.getWidth() != paramOptions.outWidth) || (paramBitmap.getHeight() != paramOptions.outHeight) || (paramOptions.inSampleSize != 1)) {}
    }
    while (paramOptions.outWidth / paramOptions.inSampleSize * (paramOptions.outHeight / paramOptions.inSampleSize) * getBytesPerPixel(paramBitmap.getConfig()) <= paramBitmap.getAllocationByteCount())
    {
      return true;
      return false;
    }
    return false;
  }
  
  @TargetApi(19)
  public static int getBitmapSize(BitmapDrawable paramBitmapDrawable)
  {
    paramBitmapDrawable = paramBitmapDrawable.getBitmap();
    if (Utils.hasKitKat()) {
      return paramBitmapDrawable.getAllocationByteCount();
    }
    if (Utils.hasHoneycombMR1()) {
      return paramBitmapDrawable.getByteCount();
    }
    int i = paramBitmapDrawable.getRowBytes();
    return paramBitmapDrawable.getHeight() * i;
  }
  
  private static int getBytesPerPixel(Bitmap.Config paramConfig)
  {
    int j = 2;
    int i;
    if (paramConfig == Bitmap.Config.ARGB_8888) {
      i = 4;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (paramConfig == Bitmap.Config.RGB_565);
      i = j;
    } while (paramConfig == Bitmap.Config.ARGB_4444);
    if (paramConfig == Bitmap.Config.ALPHA_8) {
      return 1;
    }
    return 1;
  }
  
  public static File getDiskCacheDir(Context paramContext, String paramString)
  {
    if (("mounted".equals(Environment.getExternalStorageState())) || (!isExternalStorageRemovable())) {}
    for (paramContext = getExternalCacheDir(paramContext).getPath();; paramContext = paramContext.getCacheDir().getPath()) {
      return new File(paramContext + File.separator + paramString);
    }
  }
  
  @TargetApi(8)
  public static File getExternalCacheDir(Context paramContext)
  {
    if (Utils.hasFroyo()) {
      return paramContext.getExternalCacheDir();
    }
    paramContext = "/Android/data/" + paramContext.getPackageName() + "/cache/";
    return new File(Environment.getExternalStorageDirectory().getPath() + paramContext);
  }
  
  public static ImageCache getInstance(ImageCache.ImageCacheParams paramImageCacheParams)
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ImageCache(paramImageCacheParams);
      }
      paramImageCacheParams = sInstance;
      return paramImageCacheParams;
    }
    finally {}
  }
  
  @TargetApi(9)
  public static long getUsableSpace(File paramFile)
  {
    if (Utils.hasGingerbread()) {
      return paramFile.getUsableSpace();
    }
    paramFile = new StatFs(paramFile.getPath());
    long l = paramFile.getBlockSize();
    return paramFile.getAvailableBlocks() * l;
  }
  
  public static String hashKeyForDisk(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      localObject = bytesToHexString(((MessageDigest)localObject).digest());
      return (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return String.valueOf(paramString.hashCode());
  }
  
  private void init(ImageCache.ImageCacheParams paramImageCacheParams)
  {
    this.mCacheParams = paramImageCacheParams;
    if (this.mCacheParams.memoryCacheEnabled)
    {
      if (com.android.thinkive.framework.util.Log.isDebug) {
        android.util.Log.d("ImageCache", "Memory cache created (size = " + this.mCacheParams.memCacheSize + ")");
      }
      if (Utils.hasHoneycomb()) {
        this.mReusableBitmaps = Collections.synchronizedSet(new HashSet());
      }
      this.mMemoryCache = new ImageCache.1(this, this.mCacheParams.memCacheSize);
    }
    if (paramImageCacheParams.initDiskCacheOnCreate) {
      initDiskCache();
    }
  }
  
  @TargetApi(9)
  public static boolean isExternalStorageRemovable()
  {
    if (Utils.hasGingerbread()) {
      return Environment.isExternalStorageRemovable();
    }
    return true;
  }
  
  /* Error */
  public void addBitmapToCache(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_2
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: getfield 326	com/android/thinkive/framework/displayingbitmap/ImageCache:mMemoryCache	Landroid/support/v4/c/g;
    //   13: ifnull +31 -> 44
    //   16: ldc_w 341
    //   19: aload_2
    //   20: invokevirtual 346	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   23: ifeq +11 -> 34
    //   26: aload_2
    //   27: checkcast 341	com/android/thinkive/framework/displayingbitmap/RecyclingBitmapDrawable
    //   30: iconst_1
    //   31: invokevirtual 350	com/android/thinkive/framework/displayingbitmap/RecyclingBitmapDrawable:setIsCached	(Z)V
    //   34: aload_0
    //   35: getfield 326	com/android/thinkive/framework/displayingbitmap/ImageCache:mMemoryCache	Landroid/support/v4/c/g;
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual 356	android/support/v4/c/g:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: aload_0
    //   45: getfield 55	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskCacheLock	Ljava/lang/Object;
    //   48: astore 9
    //   50: aload 9
    //   52: monitorenter
    //   53: aload_0
    //   54: getfield 358	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskLruCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   57: ifnull +156 -> 213
    //   60: aload_1
    //   61: invokestatic 360	com/android/thinkive/framework/displayingbitmap/ImageCache:hashKeyForDisk	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore 10
    //   66: aconst_null
    //   67: astore 6
    //   69: aconst_null
    //   70: astore 7
    //   72: aconst_null
    //   73: astore 8
    //   75: aconst_null
    //   76: astore_3
    //   77: aload 6
    //   79: astore 4
    //   81: aload 7
    //   83: astore 5
    //   85: aload 8
    //   87: astore_1
    //   88: aload_0
    //   89: getfield 358	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskLruCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   92: aload 10
    //   94: invokevirtual 366	com/android/thinkive/framework/cache/DiskLruCache:get	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;
    //   97: astore 11
    //   99: aload 11
    //   101: ifnonnull +122 -> 223
    //   104: aload 6
    //   106: astore 4
    //   108: aload 7
    //   110: astore 5
    //   112: aload 8
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 358	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskLruCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   119: aload 10
    //   121: invokevirtual 370	com/android/thinkive/framework/cache/DiskLruCache:edit	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Editor;
    //   124: astore 10
    //   126: aload 10
    //   128: ifnull +77 -> 205
    //   131: aload 6
    //   133: astore 4
    //   135: aload 7
    //   137: astore 5
    //   139: aload 8
    //   141: astore_1
    //   142: aload 10
    //   144: iconst_0
    //   145: invokevirtual 376	com/android/thinkive/framework/cache/DiskLruCache$Editor:newOutputStream	(I)Ljava/io/OutputStream;
    //   148: astore_3
    //   149: aload_3
    //   150: astore 4
    //   152: aload_3
    //   153: astore 5
    //   155: aload_3
    //   156: astore_1
    //   157: aload_2
    //   158: invokevirtual 144	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   161: aload_0
    //   162: getfield 281	com/android/thinkive/framework/displayingbitmap/ImageCache:mCacheParams	Lcom/android/thinkive/framework/displayingbitmap/ImageCache$ImageCacheParams;
    //   165: getfield 379	com/android/thinkive/framework/displayingbitmap/ImageCache$ImageCacheParams:compressFormat	Landroid/graphics/Bitmap$CompressFormat;
    //   168: aload_0
    //   169: getfield 281	com/android/thinkive/framework/displayingbitmap/ImageCache:mCacheParams	Lcom/android/thinkive/framework/displayingbitmap/ImageCache$ImageCacheParams;
    //   172: getfield 382	com/android/thinkive/framework/displayingbitmap/ImageCache$ImageCacheParams:compressQuality	I
    //   175: aload_3
    //   176: invokevirtual 386	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   179: pop
    //   180: aload_3
    //   181: astore 4
    //   183: aload_3
    //   184: astore 5
    //   186: aload_3
    //   187: astore_1
    //   188: aload 10
    //   190: invokevirtual 389	com/android/thinkive/framework/cache/DiskLruCache$Editor:commit	()V
    //   193: aload_3
    //   194: astore 4
    //   196: aload_3
    //   197: astore 5
    //   199: aload_3
    //   200: astore_1
    //   201: aload_3
    //   202: invokevirtual 394	java/io/OutputStream:close	()V
    //   205: aload_3
    //   206: ifnull +7 -> 213
    //   209: aload_3
    //   210: invokevirtual 394	java/io/OutputStream:close	()V
    //   213: aload 9
    //   215: monitorexit
    //   216: return
    //   217: astore_1
    //   218: aload 9
    //   220: monitorexit
    //   221: aload_1
    //   222: athrow
    //   223: aload 6
    //   225: astore 4
    //   227: aload 7
    //   229: astore 5
    //   231: aload 8
    //   233: astore_1
    //   234: aload 11
    //   236: iconst_0
    //   237: invokevirtual 400	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:getInputStream	(I)Ljava/io/InputStream;
    //   240: invokevirtual 403	java/io/InputStream:close	()V
    //   243: goto -38 -> 205
    //   246: astore_2
    //   247: aload 4
    //   249: astore_1
    //   250: ldc 24
    //   252: new 70	java/lang/StringBuilder
    //   255: dup
    //   256: ldc_w 405
    //   259: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   262: aload_2
    //   263: invokevirtual 408	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 411	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   272: pop
    //   273: aload 4
    //   275: ifnull -62 -> 213
    //   278: aload 4
    //   280: invokevirtual 394	java/io/OutputStream:close	()V
    //   283: goto -70 -> 213
    //   286: astore_1
    //   287: goto -74 -> 213
    //   290: astore_2
    //   291: aload 5
    //   293: astore_1
    //   294: ldc 24
    //   296: new 70	java/lang/StringBuilder
    //   299: dup
    //   300: ldc_w 405
    //   303: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: aload_2
    //   307: invokevirtual 408	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokestatic 411	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   316: pop
    //   317: aload 5
    //   319: ifnull -106 -> 213
    //   322: aload 5
    //   324: invokevirtual 394	java/io/OutputStream:close	()V
    //   327: goto -114 -> 213
    //   330: astore_1
    //   331: goto -118 -> 213
    //   334: astore_2
    //   335: aload_1
    //   336: ifnull +7 -> 343
    //   339: aload_1
    //   340: invokevirtual 394	java/io/OutputStream:close	()V
    //   343: aload_2
    //   344: athrow
    //   345: astore_1
    //   346: goto -3 -> 343
    //   349: astore_1
    //   350: goto -137 -> 213
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	this	ImageCache
    //   0	353	1	paramString	String
    //   0	353	2	paramBitmapDrawable	BitmapDrawable
    //   76	134	3	localOutputStream	java.io.OutputStream
    //   79	200	4	localObject1	Object
    //   83	240	5	localObject2	Object
    //   67	157	6	localObject3	Object
    //   70	158	7	localObject4	Object
    //   73	159	8	localObject5	Object
    //   48	171	9	localObject6	Object
    //   64	125	10	localObject7	Object
    //   97	138	11	localSnapshot	com.android.thinkive.framework.cache.DiskLruCache.Snapshot
    // Exception table:
    //   from	to	target	type
    //   53	66	217	finally
    //   209	213	217	finally
    //   213	216	217	finally
    //   218	221	217	finally
    //   278	283	217	finally
    //   322	327	217	finally
    //   339	343	217	finally
    //   343	345	217	finally
    //   88	99	246	java/io/IOException
    //   115	126	246	java/io/IOException
    //   142	149	246	java/io/IOException
    //   157	180	246	java/io/IOException
    //   188	193	246	java/io/IOException
    //   201	205	246	java/io/IOException
    //   234	243	246	java/io/IOException
    //   278	283	286	java/io/IOException
    //   88	99	290	java/lang/Exception
    //   115	126	290	java/lang/Exception
    //   142	149	290	java/lang/Exception
    //   157	180	290	java/lang/Exception
    //   188	193	290	java/lang/Exception
    //   201	205	290	java/lang/Exception
    //   234	243	290	java/lang/Exception
    //   322	327	330	java/io/IOException
    //   88	99	334	finally
    //   115	126	334	finally
    //   142	149	334	finally
    //   157	180	334	finally
    //   188	193	334	finally
    //   201	205	334	finally
    //   234	243	334	finally
    //   250	273	334	finally
    //   294	317	334	finally
    //   339	343	345	java/io/IOException
    //   209	213	349	java/io/IOException
  }
  
  public void clearCache()
  {
    if (this.mMemoryCache != null)
    {
      this.mMemoryCache.evictAll();
      if (com.android.thinkive.framework.util.Log.isDebug) {
        android.util.Log.d("ImageCache", "Memory cache cleared");
      }
    }
    synchronized (this.mDiskCacheLock)
    {
      this.mDiskCacheStarting = true;
      if (this.mDiskLruCache != null)
      {
        boolean bool = this.mDiskLruCache.isClosed();
        if (bool) {}
      }
      try
      {
        this.mDiskLruCache.delete();
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageCache", "Disk cache cleared");
        }
        this.mDiskLruCache = null;
        initDiskCache();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageCache", "clearCache - " + localIOException);
        }
      }
    }
  }
  
  public void close()
  {
    synchronized (this.mDiskCacheLock)
    {
      DiskLruCache localDiskLruCache = this.mDiskLruCache;
      if (localDiskLruCache != null) {}
      try
      {
        if (!this.mDiskLruCache.isClosed())
        {
          this.mDiskLruCache.close();
          this.mDiskLruCache = null;
          if (com.android.thinkive.framework.util.Log.isDebug) {
            android.util.Log.d("ImageCache", "Disk cache closed");
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageCache", "close - " + localIOException);
        }
      }
    }
  }
  
  public void flush()
  {
    synchronized (this.mDiskCacheLock)
    {
      DiskLruCache localDiskLruCache = this.mDiskLruCache;
      if (localDiskLruCache != null) {}
      try
      {
        this.mDiskLruCache.flush();
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageCache", "Disk cache flushed");
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          android.util.Log.e("ImageCache", "flush - " + localIOException);
        }
      }
    }
  }
  
  /* Error */
  public Bitmap getBitmapFromDiskCache(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_1
    //   6: invokestatic 360	com/android/thinkive/framework/displayingbitmap/ImageCache:hashKeyForDisk	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 55	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskCacheLock	Ljava/lang/Object;
    //   14: astore 6
    //   16: aload 6
    //   18: monitorenter
    //   19: aload_0
    //   20: getfield 57	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskCacheStarting	Z
    //   23: ifne +102 -> 125
    //   26: aload_0
    //   27: getfield 358	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskLruCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   30: astore 4
    //   32: aload 5
    //   34: astore_3
    //   35: aload 4
    //   37: ifnull +83 -> 120
    //   40: aload_0
    //   41: getfield 358	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskLruCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   44: aload_1
    //   45: invokevirtual 366	com/android/thinkive/framework/cache/DiskLruCache:get	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;
    //   48: astore_1
    //   49: aload_1
    //   50: ifnull +178 -> 228
    //   53: getstatic 291	com/android/thinkive/framework/util/Log:isDebug	Z
    //   56: ifeq +12 -> 68
    //   59: ldc 24
    //   61: ldc_w 445
    //   64: invokestatic 307	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   67: pop
    //   68: aload_1
    //   69: iconst_0
    //   70: invokevirtual 400	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:getInputStream	(I)Ljava/io/InputStream;
    //   73: astore_1
    //   74: aload_1
    //   75: astore 4
    //   77: aload_1
    //   78: ifnull +28 -> 106
    //   81: aload_1
    //   82: astore_2
    //   83: aload_1
    //   84: checkcast 447	java/io/FileInputStream
    //   87: invokevirtual 451	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   90: ldc_w 452
    //   93: ldc_w 452
    //   96: aload_0
    //   97: invokestatic 458	com/android/thinkive/framework/displayingbitmap/ImageResizer:decodeSampledBitmapFromDescriptor	(Ljava/io/FileDescriptor;IILcom/android/thinkive/framework/displayingbitmap/ImageCache;)Landroid/graphics/Bitmap;
    //   100: astore_3
    //   101: aload_3
    //   102: astore_2
    //   103: aload_1
    //   104: astore 4
    //   106: aload_2
    //   107: astore_3
    //   108: aload 4
    //   110: ifnull +10 -> 120
    //   113: aload 4
    //   115: invokevirtual 403	java/io/InputStream:close	()V
    //   118: aload_2
    //   119: astore_3
    //   120: aload 6
    //   122: monitorexit
    //   123: aload_3
    //   124: areturn
    //   125: aload_0
    //   126: getfield 55	com/android/thinkive/framework/displayingbitmap/ImageCache:mDiskCacheLock	Ljava/lang/Object;
    //   129: invokevirtual 461	java/lang/Object:wait	()V
    //   132: goto -113 -> 19
    //   135: astore_3
    //   136: goto -117 -> 19
    //   139: astore_3
    //   140: aconst_null
    //   141: astore_1
    //   142: aload_1
    //   143: astore_2
    //   144: ldc 24
    //   146: new 70	java/lang/StringBuilder
    //   149: dup
    //   150: ldc_w 463
    //   153: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: aload_3
    //   157: invokevirtual 408	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 411	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   166: pop
    //   167: aload 5
    //   169: astore_3
    //   170: aload_1
    //   171: ifnull -51 -> 120
    //   174: aload_1
    //   175: invokevirtual 403	java/io/InputStream:close	()V
    //   178: aload 5
    //   180: astore_3
    //   181: goto -61 -> 120
    //   184: astore_1
    //   185: aload 5
    //   187: astore_3
    //   188: goto -68 -> 120
    //   191: astore_1
    //   192: aconst_null
    //   193: astore_2
    //   194: aload_2
    //   195: ifnull +7 -> 202
    //   198: aload_2
    //   199: invokevirtual 403	java/io/InputStream:close	()V
    //   202: aload_1
    //   203: athrow
    //   204: astore_1
    //   205: aload 6
    //   207: monitorexit
    //   208: aload_1
    //   209: athrow
    //   210: astore_2
    //   211: goto -9 -> 202
    //   214: astore_1
    //   215: aload_2
    //   216: astore_3
    //   217: goto -97 -> 120
    //   220: astore_1
    //   221: goto -27 -> 194
    //   224: astore_3
    //   225: goto -83 -> 142
    //   228: aconst_null
    //   229: astore 4
    //   231: goto -125 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	ImageCache
    //   0	234	1	paramString	String
    //   4	195	2	localObject1	Object
    //   210	6	2	localIOException1	IOException
    //   34	90	3	localObject2	Object
    //   135	1	3	localInterruptedException	InterruptedException
    //   139	18	3	localIOException2	IOException
    //   169	48	3	localObject3	Object
    //   224	1	3	localIOException3	IOException
    //   30	200	4	localObject4	Object
    //   1	185	5	localObject5	Object
    //   14	192	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   125	132	135	java/lang/InterruptedException
    //   40	49	139	java/io/IOException
    //   53	68	139	java/io/IOException
    //   68	74	139	java/io/IOException
    //   174	178	184	java/io/IOException
    //   40	49	191	finally
    //   53	68	191	finally
    //   68	74	191	finally
    //   19	32	204	finally
    //   113	118	204	finally
    //   120	123	204	finally
    //   125	132	204	finally
    //   174	178	204	finally
    //   198	202	204	finally
    //   202	204	204	finally
    //   205	208	204	finally
    //   198	202	210	java/io/IOException
    //   113	118	214	java/io/IOException
    //   83	101	220	finally
    //   144	167	220	finally
    //   83	101	224	java/io/IOException
  }
  
  public BitmapDrawable getBitmapFromMemCache(String paramString)
  {
    BitmapDrawable localBitmapDrawable = null;
    if (this.mMemoryCache != null) {
      localBitmapDrawable = (BitmapDrawable)this.mMemoryCache.get(paramString);
    }
    if ((com.android.thinkive.framework.util.Log.isDebug) && (localBitmapDrawable != null)) {
      android.util.Log.d("ImageCache", "Memory cache hit");
    }
    return localBitmapDrawable;
  }
  
  protected Bitmap getBitmapFromReusableSet(BitmapFactory.Options paramOptions)
  {
    if ((this.mReusableBitmaps != null) && (!this.mReusableBitmaps.isEmpty())) {
      for (;;)
      {
        Iterator localIterator;
        synchronized (this.mReusableBitmaps)
        {
          localIterator = this.mReusableBitmaps.iterator();
          if (!localIterator.hasNext())
          {
            paramOptions = null;
            return paramOptions;
          }
          Bitmap localBitmap = (Bitmap)((SoftReference)localIterator.next()).get();
          if ((localBitmap != null) && (localBitmap.isMutable()))
          {
            if (!canUseForInBitmap(localBitmap, paramOptions)) {
              continue;
            }
            localIterator.remove();
            paramOptions = localBitmap;
          }
        }
        localIterator.remove();
      }
    }
    return null;
  }
  
  public void initDiskCache()
  {
    synchronized (this.mDiskCacheLock)
    {
      File localFile;
      if ((this.mDiskLruCache == null) || (this.mDiskLruCache.isClosed()))
      {
        localFile = this.mCacheParams.diskCacheDir;
        if ((this.mCacheParams.diskCacheEnabled) && (localFile != null))
        {
          if (!localFile.exists()) {
            localFile.mkdirs();
          }
          long l = getUsableSpace(localFile);
          int i = this.mCacheParams.diskCacheSize;
          if (l <= i) {}
        }
      }
      try
      {
        this.mDiskLruCache = DiskLruCache.open(localFile, 1, 1, this.mCacheParams.diskCacheSize);
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("ImageCache", "Disk cache initialized");
        }
        this.mDiskCacheStarting = false;
        this.mDiskCacheLock.notifyAll();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.mCacheParams.diskCacheDir = null;
          android.util.Log.e("ImageCache", "initDiskCache - " + localIOException);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */