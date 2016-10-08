package com.tencent.av.opengl.texture;

import android.graphics.Bitmap;
import junit.framework.Assert;

public class BitmapTexture
  extends UploadedTexture
{
  protected Bitmap mContentBitmap;
  
  public BitmapTexture(Bitmap paramBitmap)
  {
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.mContentBitmap = paramBitmap;
      return;
    }
  }
  
  public Bitmap getBitmap()
  {
    return this.mContentBitmap;
  }
  
  protected void onFreeBitmap(Bitmap paramBitmap) {}
  
  protected Bitmap onGetBitmap()
  {
    return this.mContentBitmap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\texture\BitmapTexture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */