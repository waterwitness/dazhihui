package com.android.volley.toolbox;

import android.widget.ImageView;
import com.android.volley.VolleyError;

class ImageLoader$1
  implements ImageLoader.ImageListener
{
  ImageLoader$1(int paramInt1, ImageView paramImageView, int paramInt2) {}
  
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    if (this.val$errorImageResId != 0) {
      this.val$view.setImageResource(this.val$errorImageResId);
    }
  }
  
  public void onResponse(ImageLoader.ImageContainer paramImageContainer, boolean paramBoolean)
  {
    if (paramImageContainer.getBitmap() != null) {
      this.val$view.setImageBitmap(paramImageContainer.getBitmap());
    }
    while (this.val$defaultImageResId == 0) {
      return;
    }
    this.val$view.setImageResource(this.val$defaultImageResId);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\ImageLoader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */