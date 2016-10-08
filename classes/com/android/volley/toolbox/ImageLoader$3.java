package com.android.volley.toolbox;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;

class ImageLoader$3
  implements Response.ErrorListener
{
  ImageLoader$3(ImageLoader paramImageLoader, String paramString) {}
  
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    this.this$0.onGetImageError(this.val$cacheKey, paramVolleyError);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */