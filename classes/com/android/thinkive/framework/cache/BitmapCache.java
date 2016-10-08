package com.android.thinkive.framework.cache;

import android.graphics.Bitmap;
import android.support.v4.c.g;
import com.android.volley.toolbox.ImageLoader.ImageCache;

public class BitmapCache
  implements ImageLoader.ImageCache
{
  private static BitmapCache sInstance;
  private g<String, Bitmap> mCache = new BitmapCache.1(this, (int)(Runtime.getRuntime().maxMemory() / 1024L) / 8);
  
  public static BitmapCache getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new BitmapCache();
      }
      BitmapCache localBitmapCache = sInstance;
      return localBitmapCache;
    }
    finally {}
  }
  
  public Bitmap getBitmap(String paramString)
  {
    return (Bitmap)this.mCache.get(paramString);
  }
  
  public void putBitmap(String paramString, Bitmap paramBitmap)
  {
    this.mCache.put(paramString, paramBitmap);
  }
  
  public void removeCache(String paramString)
  {
    this.mCache.remove(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\BitmapCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */