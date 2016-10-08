package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Response.Listener;

class ImageLoader$2
  implements Response.Listener<Bitmap>
{
  ImageLoader$2(ImageLoader paramImageLoader, String paramString) {}
  
  public void onResponse(Bitmap paramBitmap)
  {
    this.this$0.onGetImageSuccess(this.val$cacheKey, paramBitmap);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */