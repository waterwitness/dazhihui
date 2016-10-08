package com.android.thinkive.framework.displayingbitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class RecyclingBitmapDrawable
  extends BitmapDrawable
{
  static final String TAG = "CountingBitmapDrawable";
  private int mCacheRefCount = 0;
  private int mDisplayRefCount = 0;
  private boolean mHasBeenDisplayed;
  
  public RecyclingBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }
  
  private void checkState()
  {
    try
    {
      if ((this.mCacheRefCount <= 0) && (this.mDisplayRefCount <= 0) && (this.mHasBeenDisplayed) && (hasValidBitmap()))
      {
        if (com.android.thinkive.framework.util.Log.isDebug) {
          android.util.Log.d("CountingBitmapDrawable", "No longer being used or cached so recycling. " + toString());
        }
        getBitmap().recycle();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  private boolean hasValidBitmap()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 63	com/android/thinkive/framework/displayingbitmap/RecyclingBitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +18 -> 26
    //   11: aload_1
    //   12: invokevirtual 71	android/graphics/Bitmap:isRecycled	()Z
    //   15: istore_2
    //   16: iload_2
    //   17: ifne +9 -> 26
    //   20: iconst_1
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_2
    //   28: goto -6 -> 22
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	RecyclingBitmapDrawable
    //   6	6	1	localBitmap	Bitmap
    //   31	4	1	localObject	Object
    //   15	13	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   11	16	31	finally
  }
  
  public void setIsCached(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.mCacheRefCount += 1;
        checkState();
        return;
      }
      finally {}
      this.mCacheRefCount -= 1;
    }
  }
  
  public void setIsDisplayed(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        this.mDisplayRefCount += 1;
        this.mHasBeenDisplayed = true;
        checkState();
        return;
      }
      finally {}
      this.mDisplayRefCount -= 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\RecyclingBitmapDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */