package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import java.util.HashMap;

public class ImageLoader
{
  private int mBatchResponseDelayMs = 100;
  private final HashMap<String, ImageLoader.BatchedImageRequest> mBatchedResponses = new HashMap();
  private final ImageLoader.ImageCache mCache;
  private final Handler mHandler = new Handler(Looper.getMainLooper());
  private final HashMap<String, ImageLoader.BatchedImageRequest> mInFlightRequests = new HashMap();
  private final RequestQueue mRequestQueue;
  private Runnable mRunnable;
  
  public ImageLoader(RequestQueue paramRequestQueue, ImageLoader.ImageCache paramImageCache)
  {
    this.mRequestQueue = paramRequestQueue;
    this.mCache = paramImageCache;
  }
  
  private void batchResponse(String paramString, ImageLoader.BatchedImageRequest paramBatchedImageRequest)
  {
    this.mBatchedResponses.put(paramString, paramBatchedImageRequest);
    if (this.mRunnable == null)
    {
      this.mRunnable = new ImageLoader.4(this);
      this.mHandler.postDelayed(this.mRunnable, this.mBatchResponseDelayMs);
    }
  }
  
  private static String getCacheKey(String paramString, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    return paramString.length() + 12 + "#W" + paramInt1 + "#H" + paramInt2 + "#S" + paramScaleType.ordinal() + paramString;
  }
  
  public static ImageLoader.ImageListener getImageListener(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    return new ImageLoader.1(paramInt2, paramImageView, paramInt1);
  }
  
  private void throwIfNotOnMainThread()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
    }
  }
  
  public ImageLoader.ImageContainer get(String paramString, ImageLoader.ImageListener paramImageListener)
  {
    return get(paramString, paramImageListener, 0, 0);
  }
  
  public ImageLoader.ImageContainer get(String paramString, ImageLoader.ImageListener paramImageListener, int paramInt1, int paramInt2)
  {
    return get(paramString, paramImageListener, paramInt1, paramInt2, ImageView.ScaleType.CENTER_INSIDE);
  }
  
  public ImageLoader.ImageContainer get(String paramString, ImageLoader.ImageListener paramImageListener, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    throwIfNotOnMainThread();
    String str = getCacheKey(paramString, paramInt1, paramInt2, paramScaleType);
    Object localObject = this.mCache.getBitmap(str);
    if (localObject != null)
    {
      paramString = new ImageLoader.ImageContainer(this, (Bitmap)localObject, paramString, null, null);
      paramImageListener.onResponse(paramString, true);
      return paramString;
    }
    localObject = new ImageLoader.ImageContainer(this, null, paramString, str, paramImageListener);
    paramImageListener.onResponse((ImageLoader.ImageContainer)localObject, true);
    paramImageListener = (ImageLoader.BatchedImageRequest)this.mInFlightRequests.get(str);
    if (paramImageListener != null)
    {
      paramImageListener.addContainer((ImageLoader.ImageContainer)localObject);
      return (ImageLoader.ImageContainer)localObject;
    }
    paramString = makeImageRequest(paramString, paramInt1, paramInt2, paramScaleType, str);
    this.mRequestQueue.add(paramString);
    this.mInFlightRequests.put(str, new ImageLoader.BatchedImageRequest(this, paramString, (ImageLoader.ImageContainer)localObject));
    return (ImageLoader.ImageContainer)localObject;
  }
  
  public boolean isCached(String paramString, int paramInt1, int paramInt2)
  {
    return isCached(paramString, paramInt1, paramInt2, ImageView.ScaleType.CENTER_INSIDE);
  }
  
  public boolean isCached(String paramString, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType)
  {
    throwIfNotOnMainThread();
    paramString = getCacheKey(paramString, paramInt1, paramInt2, paramScaleType);
    return this.mCache.getBitmap(paramString) != null;
  }
  
  protected Request<Bitmap> makeImageRequest(String paramString1, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType, String paramString2)
  {
    return new ImageRequest(paramString1, new ImageLoader.2(this, paramString2), paramInt1, paramInt2, paramScaleType, Bitmap.Config.RGB_565, new ImageLoader.3(this, paramString2));
  }
  
  protected void onGetImageError(String paramString, VolleyError paramVolleyError)
  {
    ImageLoader.BatchedImageRequest localBatchedImageRequest = (ImageLoader.BatchedImageRequest)this.mInFlightRequests.remove(paramString);
    if (localBatchedImageRequest != null)
    {
      localBatchedImageRequest.setError(paramVolleyError);
      batchResponse(paramString, localBatchedImageRequest);
    }
  }
  
  protected void onGetImageSuccess(String paramString, Bitmap paramBitmap)
  {
    this.mCache.putBitmap(paramString, paramBitmap);
    ImageLoader.BatchedImageRequest localBatchedImageRequest = (ImageLoader.BatchedImageRequest)this.mInFlightRequests.remove(paramString);
    if (localBatchedImageRequest != null)
    {
      ImageLoader.BatchedImageRequest.access$1(localBatchedImageRequest, paramBitmap);
      batchResponse(paramString, localBatchedImageRequest);
    }
  }
  
  public void setBatchedResponseDelay(int paramInt)
  {
    this.mBatchResponseDelayMs = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */