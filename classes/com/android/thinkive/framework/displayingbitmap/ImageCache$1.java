package com.android.thinkive.framework.displayingbitmap;

import android.graphics.drawable.BitmapDrawable;
import android.support.v4.c.g;
import java.lang.ref.SoftReference;
import java.util.Set;

class ImageCache$1
  extends g<String, BitmapDrawable>
{
  ImageCache$1(ImageCache paramImageCache, int paramInt)
  {
    super(paramInt);
  }
  
  protected void entryRemoved(boolean paramBoolean, String paramString, BitmapDrawable paramBitmapDrawable1, BitmapDrawable paramBitmapDrawable2)
  {
    if (RecyclingBitmapDrawable.class.isInstance(paramBitmapDrawable1)) {
      ((RecyclingBitmapDrawable)paramBitmapDrawable1).setIsCached(false);
    }
    while (!Utils.hasHoneycomb()) {
      return;
    }
    ImageCache.access$1(this.this$0).add(new SoftReference(paramBitmapDrawable1.getBitmap()));
  }
  
  protected int sizeOf(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    int j = ImageCache.getBitmapSize(paramBitmapDrawable) / 1024;
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */