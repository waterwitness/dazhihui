package com.android.thinkive.framework.displayingbitmap;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;

public class ImageCache$ImageCacheParams
{
  public Bitmap.CompressFormat compressFormat = ImageCache.access$0();
  public int compressQuality = 70;
  public File diskCacheDir;
  public boolean diskCacheEnabled = true;
  public int diskCacheSize = 31457280;
  public boolean initDiskCacheOnCreate = false;
  public int memCacheSize = 5120;
  public boolean memoryCacheEnabled = true;
  
  public ImageCache$ImageCacheParams(Context paramContext, String paramString)
  {
    this.diskCacheDir = ImageCache.getDiskCacheDir(paramContext, paramString);
  }
  
  public void setMemCacheSizePercent(float paramFloat)
  {
    if ((paramFloat < 0.01F) || (paramFloat > 0.8F)) {
      throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
    }
    this.memCacheSize = Math.round((float)Runtime.getRuntime().maxMemory() * paramFloat / 1024.0F);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageCache$ImageCacheParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */