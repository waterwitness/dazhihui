package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

public class ImageLoader$ImageContainer
{
  private Bitmap mBitmap;
  private final String mCacheKey;
  private final ImageLoader.ImageListener mListener;
  private final String mRequestUrl;
  
  public ImageLoader$ImageContainer(ImageLoader paramImageLoader, Bitmap paramBitmap, String paramString1, String paramString2, ImageLoader.ImageListener paramImageListener)
  {
    this.mBitmap = paramBitmap;
    this.mRequestUrl = paramString1;
    this.mCacheKey = paramString2;
    this.mListener = paramImageListener;
  }
  
  public void cancelRequest()
  {
    if (this.mListener == null) {}
    ImageLoader.BatchedImageRequest localBatchedImageRequest;
    do
    {
      do
      {
        do
        {
          return;
          localBatchedImageRequest = (ImageLoader.BatchedImageRequest)ImageLoader.access$0(this.this$0).get(this.mCacheKey);
          if (localBatchedImageRequest == null) {
            break;
          }
        } while (!localBatchedImageRequest.removeContainerAndCancelIfNecessary(this));
        ImageLoader.access$0(this.this$0).remove(this.mCacheKey);
        return;
        localBatchedImageRequest = (ImageLoader.BatchedImageRequest)ImageLoader.access$1(this.this$0).get(this.mCacheKey);
      } while (localBatchedImageRequest == null);
      localBatchedImageRequest.removeContainerAndCancelIfNecessary(this);
    } while (ImageLoader.BatchedImageRequest.access$0(localBatchedImageRequest).size() != 0);
    ImageLoader.access$1(this.this$0).remove(this.mCacheKey);
  }
  
  public Bitmap getBitmap()
  {
    return this.mBitmap;
  }
  
  public String getRequestUrl()
  {
    return this.mRequestUrl;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$ImageContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */