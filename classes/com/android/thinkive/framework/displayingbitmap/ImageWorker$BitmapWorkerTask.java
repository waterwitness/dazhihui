package com.android.thinkive.framework.displayingbitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

class ImageWorker$BitmapWorkerTask
  extends AsyncTask<Void, Void, BitmapDrawable>
{
  private final WeakReference<ImageView> imageViewReference;
  private Object mData;
  
  public ImageWorker$BitmapWorkerTask(ImageWorker paramImageWorker, Object paramObject, ImageView paramImageView)
  {
    this.mData = paramObject;
    this.imageViewReference = new WeakReference(paramImageView);
  }
  
  private ImageView getAttachedImageView()
  {
    ImageView localImageView = (ImageView)this.imageViewReference.get();
    if (this == ImageWorker.access$4(localImageView)) {
      return localImageView;
    }
    return null;
  }
  
  protected BitmapDrawable doInBackground(Void... arg1)
  {
    Void[] arrayOfVoid = null;
    if (com.android.thinkive.framework.util.Log.isDebug) {
      android.util.Log.d("ImageWorker", "doInBackground - starting work");
    }
    String str = String.valueOf(this.mData);
    for (;;)
    {
      synchronized (ImageWorker.access$0(this.this$0))
      {
        if ((!this.this$0.mPauseWork) || (isCancelled()))
        {
          if ((ImageWorker.access$1(this.this$0) == null) || (isCancelled()) || (getAttachedImageView() == null) || (ImageWorker.access$2(this.this$0))) {
            break label259;
          }
          ??? = ImageWorker.access$1(this.this$0).getBitmapFromDiskCache(str);
          Object localObject = ???;
          if (??? == null)
          {
            localObject = ???;
            if (!isCancelled())
            {
              localObject = ???;
              if (getAttachedImageView() != null)
              {
                localObject = ???;
                if (!ImageWorker.access$2(this.this$0)) {
                  localObject = this.this$0.processBitmap(this.mData);
                }
              }
            }
          }
          if (localObject != null)
          {
            if (!Utils.hasHoneycomb()) {
              break label240;
            }
            ??? = new BitmapDrawable(this.this$0.mResources, (Bitmap)localObject);
            arrayOfVoid = ???;
            if (ImageWorker.access$1(this.this$0) != null)
            {
              ImageWorker.access$1(this.this$0).addBitmapToCache(str, ???);
              arrayOfVoid = ???;
            }
          }
          if (com.android.thinkive.framework.util.Log.isDebug) {
            android.util.Log.d("ImageWorker", "doInBackground - finished work");
          }
          return arrayOfVoid;
        }
        else
        {
          try
          {
            ImageWorker.access$0(this.this$0).wait();
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
      label240:
      ??? = new RecyclingBitmapDrawable(this.this$0.mResources, localBitmap);
      continue;
      label259:
      ??? = null;
    }
  }
  
  protected void onCancelled(BitmapDrawable arg1)
  {
    super.onCancelled(???);
    synchronized (ImageWorker.access$0(this.this$0))
    {
      ImageWorker.access$0(this.this$0).notifyAll();
      return;
    }
  }
  
  protected void onPostExecute(BitmapDrawable paramBitmapDrawable)
  {
    if ((isCancelled()) || (ImageWorker.access$2(this.this$0))) {
      paramBitmapDrawable = null;
    }
    ImageView localImageView = getAttachedImageView();
    if ((paramBitmapDrawable != null) && (localImageView != null))
    {
      if (com.android.thinkive.framework.util.Log.isDebug) {
        android.util.Log.d("ImageWorker", "onPostExecute - setting bitmap");
      }
      ImageWorker.access$3(this.this$0, localImageView, paramBitmapDrawable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageWorker$BitmapWorkerTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */