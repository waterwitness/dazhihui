package com.android.thinkive.framework.displayingbitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

class ImageWorker$AsyncDrawable
  extends BitmapDrawable
{
  private final WeakReference<ImageWorker.BitmapWorkerTask> bitmapWorkerTaskReference;
  
  public ImageWorker$AsyncDrawable(Resources paramResources, Bitmap paramBitmap, ImageWorker.BitmapWorkerTask paramBitmapWorkerTask)
  {
    super(paramResources, paramBitmap);
    this.bitmapWorkerTaskReference = new WeakReference(paramBitmapWorkerTask);
  }
  
  public ImageWorker.BitmapWorkerTask getBitmapWorkerTask()
  {
    return (ImageWorker.BitmapWorkerTask)this.bitmapWorkerTaskReference.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageWorker$AsyncDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */