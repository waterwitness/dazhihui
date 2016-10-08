package com.android.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

class ImageLoader$4
  implements Runnable
{
  ImageLoader$4(ImageLoader paramImageLoader) {}
  
  public void run()
  {
    Iterator localIterator1 = ImageLoader.access$1(this.this$0).values().iterator();
    for (;;)
    {
      if (!localIterator1.hasNext())
      {
        ImageLoader.access$1(this.this$0).clear();
        ImageLoader.access$2(this.this$0, null);
        return;
      }
      ImageLoader.BatchedImageRequest localBatchedImageRequest = (ImageLoader.BatchedImageRequest)localIterator1.next();
      Iterator localIterator2 = ImageLoader.BatchedImageRequest.access$0(localBatchedImageRequest).iterator();
      while (localIterator2.hasNext())
      {
        ImageLoader.ImageContainer localImageContainer = (ImageLoader.ImageContainer)localIterator2.next();
        if (ImageLoader.ImageContainer.access$0(localImageContainer) != null) {
          if (localBatchedImageRequest.getError() == null)
          {
            ImageLoader.ImageContainer.access$1(localImageContainer, ImageLoader.BatchedImageRequest.access$2(localBatchedImageRequest));
            ImageLoader.ImageContainer.access$0(localImageContainer).onResponse(localImageContainer, false);
          }
          else
          {
            ImageLoader.ImageContainer.access$0(localImageContainer).onErrorResponse(localBatchedImageRequest.getError());
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */