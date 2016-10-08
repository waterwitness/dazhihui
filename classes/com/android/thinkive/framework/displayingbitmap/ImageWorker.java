package com.android.thinkive.framework.displayingbitmap;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

public abstract class ImageWorker
{
  private static final int FADE_IN_TIME = 200;
  private static final int MESSAGE_CLEAR = 0;
  private static final int MESSAGE_CLOSE = 3;
  private static final int MESSAGE_FLUSH = 2;
  private static final int MESSAGE_INIT_DISK_CACHE = 1;
  private static final String TAG = "ImageWorker";
  private boolean mExitTasksEarly = false;
  private boolean mFadeInBitmap = true;
  private ImageCache mImageCache;
  private ImageCache.ImageCacheParams mImageCacheParams;
  private Bitmap mLoadingBitmap;
  protected boolean mPauseWork = false;
  private final Object mPauseWorkLock = new Object();
  protected Resources mResources;
  
  protected ImageWorker(Context paramContext)
  {
    this.mResources = paramContext.getResources();
  }
  
  public static boolean cancelPotentialWork(Object paramObject, ImageView paramImageView)
  {
    paramImageView = getBitmapWorkerTask(paramImageView);
    if (paramImageView != null)
    {
      Object localObject = ImageWorker.BitmapWorkerTask.access$3(paramImageView);
      if ((localObject != null) && (localObject.equals(paramObject))) {
        break label62;
      }
      paramImageView.cancel(true);
      if (com.android.thinkive.framework.util.Log.isDebug) {
        android.util.Log.d("ImageWorker", "cancelPotentialWork - cancelled work for " + paramObject);
      }
    }
    return true;
    label62:
    return false;
  }
  
  public static void cancelWork(ImageView paramImageView)
  {
    paramImageView = getBitmapWorkerTask(paramImageView);
    if (paramImageView != null)
    {
      paramImageView.cancel(true);
      if (com.android.thinkive.framework.util.Log.isDebug)
      {
        paramImageView = ImageWorker.BitmapWorkerTask.access$3(paramImageView);
        android.util.Log.d("ImageWorker", "cancelWork - cancelled work for " + paramImageView);
      }
    }
  }
  
  private static ImageWorker.BitmapWorkerTask getBitmapWorkerTask(ImageView paramImageView)
  {
    if (paramImageView != null)
    {
      paramImageView = paramImageView.getDrawable();
      if ((paramImageView instanceof ImageWorker.AsyncDrawable)) {
        return ((ImageWorker.AsyncDrawable)paramImageView).getBitmapWorkerTask();
      }
    }
    return null;
  }
  
  private void setImageDrawable(ImageView paramImageView, Drawable paramDrawable)
  {
    if (this.mFadeInBitmap)
    {
      paramDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(17170445), paramDrawable });
      paramImageView.setBackgroundDrawable(new BitmapDrawable(this.mResources, this.mLoadingBitmap));
      paramImageView.setImageDrawable(paramDrawable);
      paramDrawable.startTransition(200);
      return;
    }
    paramImageView.setImageDrawable(paramDrawable);
  }
  
  public void addImageCache(Activity paramActivity, String paramString)
  {
    this.mImageCacheParams = new ImageCache.ImageCacheParams(paramActivity, paramString);
    this.mImageCache = ImageCache.getInstance(this.mImageCacheParams);
    new ImageWorker.CacheAsyncTask(this).execute(new Object[] { Integer.valueOf(1) });
  }
  
  public void addImageCache(ImageCache.ImageCacheParams paramImageCacheParams)
  {
    this.mImageCacheParams = paramImageCacheParams;
    this.mImageCache = ImageCache.getInstance(this.mImageCacheParams);
    new ImageWorker.CacheAsyncTask(this).execute(new Object[] { Integer.valueOf(1) });
  }
  
  public void clearCache()
  {
    new ImageWorker.CacheAsyncTask(this).execute(new Object[] { Integer.valueOf(0) });
  }
  
  protected void clearCacheInternal()
  {
    if (this.mImageCache != null) {
      this.mImageCache.clearCache();
    }
  }
  
  public void closeCache()
  {
    new ImageWorker.CacheAsyncTask(this).execute(new Object[] { Integer.valueOf(3) });
  }
  
  protected void closeCacheInternal()
  {
    if (this.mImageCache != null)
    {
      this.mImageCache.close();
      this.mImageCache = null;
    }
  }
  
  public void flushCache()
  {
    new ImageWorker.CacheAsyncTask(this).execute(new Object[] { Integer.valueOf(2) });
  }
  
  protected void flushCacheInternal()
  {
    if (this.mImageCache != null) {
      this.mImageCache.flush();
    }
  }
  
  protected ImageCache getImageCache()
  {
    return this.mImageCache;
  }
  
  protected void initDiskCacheInternal()
  {
    if (this.mImageCache != null) {
      this.mImageCache.initDiskCache();
    }
  }
  
  public void loadImage(Object paramObject, ImageView paramImageView)
  {
    if (paramObject == null) {}
    do
    {
      return;
      BitmapDrawable localBitmapDrawable = null;
      if (this.mImageCache != null) {
        localBitmapDrawable = this.mImageCache.getBitmapFromMemCache(String.valueOf(paramObject));
      }
      if (localBitmapDrawable != null)
      {
        paramImageView.setImageDrawable(localBitmapDrawable);
        return;
      }
    } while (!cancelPotentialWork(paramObject, paramImageView));
    paramObject = new ImageWorker.BitmapWorkerTask(this, paramObject, paramImageView);
    paramImageView.setImageDrawable(new ImageWorker.AsyncDrawable(this.mResources, this.mLoadingBitmap, (ImageWorker.BitmapWorkerTask)paramObject));
    ((ImageWorker.BitmapWorkerTask)paramObject).executeOnExecutor(AsyncTask.DUAL_THREAD_EXECUTOR, new Void[0]);
  }
  
  protected abstract Bitmap processBitmap(Object paramObject);
  
  public void setExitTasksEarly(boolean paramBoolean)
  {
    this.mExitTasksEarly = paramBoolean;
    setPauseWork(false);
  }
  
  public void setImageFadeIn(boolean paramBoolean)
  {
    this.mFadeInBitmap = paramBoolean;
  }
  
  public void setLoadingImage(int paramInt)
  {
    this.mLoadingBitmap = BitmapFactory.decodeResource(this.mResources, paramInt);
  }
  
  public void setLoadingImage(Bitmap paramBitmap)
  {
    this.mLoadingBitmap = paramBitmap;
  }
  
  public void setPauseWork(boolean paramBoolean)
  {
    synchronized (this.mPauseWorkLock)
    {
      this.mPauseWork = paramBoolean;
      if (!this.mPauseWork) {
        this.mPauseWorkLock.notifyAll();
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */