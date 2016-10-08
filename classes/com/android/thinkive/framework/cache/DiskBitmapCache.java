package com.android.thinkive.framework.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;
import com.android.thinkive.framework.util.DeviceUtil;
import com.android.thinkive.framework.util.SDCardInfo;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DiskBitmapCache
  implements ImageLoader.ImageCache
{
  private static final int APP_VERSION = 1;
  private static int IO_BUFFER_SIZE = 8192;
  private static final int VALUE_COUNT = 1;
  private Bitmap.CompressFormat mCompressFormat = Bitmap.CompressFormat.JPEG;
  private int mCompressQuality = 70;
  private DiskLruCache mDiskCache;
  
  public DiskBitmapCache(Context paramContext, String paramString, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2)
  {
    try
    {
      this.mDiskCache = DiskLruCache.open(getDiskCacheDir(paramContext, paramString), 1, 1, paramInt1);
      this.mCompressFormat = paramCompressFormat;
      this.mCompressQuality = paramInt2;
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private String createKey(String paramString)
  {
    return String.valueOf(paramString.hashCode());
  }
  
  private File getDiskCacheDir(Context paramContext, String paramString)
  {
    Object localObject = paramContext.getCacheDir().getPath();
    if (DeviceUtil.isExternalStorageAvailable())
    {
      localObject = Environment.getExternalStorageDirectory().getPath() + File.separator + "thinkive";
      return new File(localObject + File.separator + paramString);
    }
    HashMap localHashMap = DeviceUtil.getSDCardInfo(paramContext);
    Iterator localIterator = localHashMap.keySet().iterator();
    paramContext = (Context)localObject;
    for (;;)
    {
      localObject = paramContext;
      if (!localIterator.hasNext()) {
        break;
      }
      localObject = (SDCardInfo)localHashMap.get((String)localIterator.next());
      com.android.thinkive.framework.util.Log.i("sdcard info = " + ((SDCardInfo)localObject).getMountPoint() + " isMounted = " + ((SDCardInfo)localObject).isMounted());
      if (((SDCardInfo)localObject).isMounted()) {
        paramContext = ((SDCardInfo)localObject).getMountPoint() + File.separator + "thinkive";
      }
    }
  }
  
  private boolean writeBitmapToFile(Bitmap paramBitmap, DiskLruCache.Editor paramEditor)
  {
    try
    {
      paramEditor = new BufferedOutputStream(paramEditor.newOutputStream(0), IO_BUFFER_SIZE);
      boolean bool;
      if (paramEditor == null) {
        break label51;
      }
    }
    finally
    {
      try
      {
        bool = paramBitmap.compress(this.mCompressFormat, this.mCompressQuality, paramEditor);
        if (paramEditor != null) {
          paramEditor.close();
        }
        return bool;
      }
      finally {}
      paramBitmap = finally;
      paramEditor = null;
    }
    paramEditor.close();
    label51:
    throw paramBitmap;
  }
  
  public void clearCache()
  {
    android.util.Log.d("cache_test_DISK_", "disk cache CLEARED");
    try
    {
      this.mDiskCache.delete();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public boolean containsKey(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    try
    {
      paramString = this.mDiskCache.get(paramString);
      if (paramString != null) {
        bool1 = true;
      }
      bool2 = bool1;
      if (paramString != null)
      {
        paramString.close();
        bool2 = bool1;
      }
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    finally
    {
      if (0 == 0) {
        break label63;
      }
      throw new NullPointerException();
    }
    return bool2;
  }
  
  /* Error */
  public Bitmap getBitmap(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_0
    //   7: getfield 49	com/android/thinkive/framework/cache/DiskBitmapCache:mDiskCache	Lcom/android/thinkive/framework/cache/DiskLruCache;
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial 211	com/android/thinkive/framework/cache/DiskBitmapCache:createKey	(Ljava/lang/String;)Ljava/lang/String;
    //   15: invokevirtual 201	com/android/thinkive/framework/cache/DiskLruCache:get	(Ljava/lang/String;)Lcom/android/thinkive/framework/cache/DiskLruCache$Snapshot;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnonnull +13 -> 33
    //   23: aload_2
    //   24: ifnull +7 -> 31
    //   27: aload_2
    //   28: invokevirtual 204	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:close	()V
    //   31: aconst_null
    //   32: areturn
    //   33: aload_2
    //   34: astore_3
    //   35: aload_2
    //   36: iconst_0
    //   37: invokevirtual 215	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:getInputStream	(I)Ljava/io/InputStream;
    //   40: astore 6
    //   42: aload 4
    //   44: astore_3
    //   45: aload 6
    //   47: ifnull +25 -> 72
    //   50: aload_2
    //   51: astore_3
    //   52: new 217	java/io/BufferedInputStream
    //   55: dup
    //   56: aload 6
    //   58: getstatic 21	com/android/thinkive/framework/cache/DiskBitmapCache:IO_BUFFER_SIZE	I
    //   61: invokespecial 220	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   64: invokestatic 226	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   67: astore 4
    //   69: aload 4
    //   71: astore_3
    //   72: aload_3
    //   73: astore 4
    //   75: aload_2
    //   76: ifnull +10 -> 86
    //   79: aload_2
    //   80: invokevirtual 204	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:close	()V
    //   83: aload_3
    //   84: astore 4
    //   86: aload 4
    //   88: ifnonnull +59 -> 147
    //   91: ldc -28
    //   93: astore_1
    //   94: ldc -71
    //   96: aload_1
    //   97: invokestatic 193	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   100: pop
    //   101: aload 4
    //   103: areturn
    //   104: astore 4
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_2
    //   109: astore_3
    //   110: aload 4
    //   112: invokevirtual 52	java/io/IOException:printStackTrace	()V
    //   115: aload 5
    //   117: astore 4
    //   119: aload_2
    //   120: ifnull -34 -> 86
    //   123: aload_2
    //   124: invokevirtual 204	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:close	()V
    //   127: aload 5
    //   129: astore 4
    //   131: goto -45 -> 86
    //   134: astore_1
    //   135: aconst_null
    //   136: astore_3
    //   137: aload_3
    //   138: ifnull +7 -> 145
    //   141: aload_3
    //   142: invokevirtual 204	com/android/thinkive/framework/cache/DiskLruCache$Snapshot:close	()V
    //   145: aload_1
    //   146: athrow
    //   147: new 84	java/lang/StringBuilder
    //   150: dup
    //   151: ldc -26
    //   153: invokespecial 95	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: aload_1
    //   157: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: astore_1
    //   164: goto -70 -> 94
    //   167: astore_1
    //   168: goto -31 -> 137
    //   171: astore 4
    //   173: goto -65 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	DiskBitmapCache
    //   0	176	1	paramString	String
    //   18	106	2	localSnapshot	DiskLruCache.Snapshot
    //   34	108	3	localObject1	Object
    //   4	98	4	localObject2	Object
    //   104	7	4	localIOException1	IOException
    //   117	13	4	localObject3	Object
    //   171	1	4	localIOException2	IOException
    //   1	127	5	localObject4	Object
    //   40	17	6	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   6	19	104	java/io/IOException
    //   6	19	134	finally
    //   35	42	167	finally
    //   52	69	167	finally
    //   110	115	167	finally
    //   35	42	171	java/io/IOException
    //   52	69	171	java/io/IOException
  }
  
  public File getCacheFolder()
  {
    return this.mDiskCache.getDirectory();
  }
  
  public void putBitmap(String paramString, Bitmap paramBitmap)
  {
    Object localObject = null;
    try
    {
      localEditor = this.mDiskCache.edit(createKey(paramString));
      if (localEditor == null) {
        return;
      }
      localObject = localEditor;
      if (writeBitmapToFile(paramBitmap, localEditor))
      {
        localObject = localEditor;
        this.mDiskCache.flush();
        localObject = localEditor;
        localEditor.commit();
        localObject = localEditor;
        android.util.Log.d("cache_test_DISK_", "image put on disk cache " + paramString);
        return;
      }
    }
    catch (IOException paramBitmap)
    {
      DiskLruCache.Editor localEditor;
      android.util.Log.d("cache_test_DISK_", "ERROR on: image put on disk cache " + paramString);
      if (localObject != null)
      {
        try
        {
          ((DiskLruCache.Editor)localObject).abort();
          return;
        }
        catch (IOException paramString)
        {
          return;
        }
        localObject = localEditor;
        localEditor.abort();
        localObject = localEditor;
        android.util.Log.d("cache_test_DISK_", "ERROR on: image put on disk cache " + paramString);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DiskBitmapCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */