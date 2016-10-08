package com.tencent.av.opengl.texture;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import junit.framework.Assert;

public class ResourceTexture
  extends UploadedTexture
{
  protected final Context mContext;
  protected final int mResId;
  
  public ResourceTexture(Context paramContext, int paramInt)
  {
    Assert.assertNotNull(paramContext);
    this.mContext = paramContext;
    this.mResId = paramInt;
    setOpaque(false);
  }
  
  protected void onFreeBitmap(Bitmap paramBitmap)
  {
    if (!inFinalizer()) {
      paramBitmap.recycle();
    }
  }
  
  protected Bitmap onGetBitmap()
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
    localOptions.inScaled = false;
    int i = this.mContext.getResources().getDisplayMetrics().widthPixels;
    if (i <= 480) {
      localOptions.inSampleSize = 2;
    }
    for (;;)
    {
      try
      {
        Bitmap localBitmap1 = BitmapFactory.decodeResource(this.mContext.getResources(), this.mResId, localOptions);
        return localBitmap1;
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        localOptions.inSampleSize *= 2;
        try
        {
          Bitmap localBitmap2 = BitmapFactory.decodeResource(this.mContext.getResources(), this.mResId, localOptions);
          return localBitmap2;
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
          localOptions.inSampleSize *= 2;
        }
      }
      if (i <= 720) {
        localOptions.inSampleSize = 1;
      } else {
        localOptions.inSampleSize = 1;
      }
    }
    return BitmapFactory.decodeResource(this.mContext.getResources(), this.mResId, localOptions);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\texture\ResourceTexture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */