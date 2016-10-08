package com.android.thinkive.framework.cache;

import android.graphics.Bitmap;
import android.support.v4.c.g;

class BitmapCache$1
  extends g<String, Bitmap>
{
  BitmapCache$1(BitmapCache paramBitmapCache, int paramInt)
  {
    super(paramInt);
  }
  
  protected int sizeOf(String paramString, Bitmap paramBitmap)
  {
    int j = paramBitmap.getByteCount() / 1024;
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\BitmapCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */