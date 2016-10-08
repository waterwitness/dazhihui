package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.LinkedList;

class ImageLoader$BatchedImageRequest
{
  private final LinkedList<ImageLoader.ImageContainer> mContainers = new LinkedList();
  private VolleyError mError;
  private final Request<?> mRequest;
  private Bitmap mResponseBitmap;
  
  public ImageLoader$BatchedImageRequest(Request<?> paramRequest, ImageLoader.ImageContainer paramImageContainer)
  {
    this.mRequest = paramImageContainer;
    Object localObject;
    this.mContainers.add(localObject);
  }
  
  public void addContainer(ImageLoader.ImageContainer paramImageContainer)
  {
    this.mContainers.add(paramImageContainer);
  }
  
  public VolleyError getError()
  {
    return this.mError;
  }
  
  public boolean removeContainerAndCancelIfNecessary(ImageLoader.ImageContainer paramImageContainer)
  {
    this.mContainers.remove(paramImageContainer);
    if (this.mContainers.size() == 0)
    {
      this.mRequest.cancel();
      return true;
    }
    return false;
  }
  
  public void setError(VolleyError paramVolleyError)
  {
    this.mError = paramVolleyError;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$BatchedImageRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */