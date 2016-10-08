package com.android.volley.toolbox;

import com.android.volley.VolleyError;

class NetworkImageView$1
  implements ImageLoader.ImageListener
{
  NetworkImageView$1(NetworkImageView paramNetworkImageView, boolean paramBoolean) {}
  
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    if (NetworkImageView.access$0(this.this$0) != 0) {
      this.this$0.setImageResource(NetworkImageView.access$0(this.this$0));
    }
  }
  
  public void onResponse(ImageLoader.ImageContainer paramImageContainer, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.val$isInLayoutPass)) {
      this.this$0.post(new NetworkImageView.1.1(this, paramImageContainer));
    }
    do
    {
      return;
      if (paramImageContainer.getBitmap() != null)
      {
        this.this$0.setImageBitmap(paramImageContainer.getBitmap());
        return;
      }
    } while (NetworkImageView.access$1(this.this$0) == 0);
    this.this$0.setImageResource(NetworkImageView.access$1(this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\NetworkImageView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */