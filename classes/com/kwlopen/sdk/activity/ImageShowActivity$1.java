package com.kwlopen.sdk.activity;

import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

class ImageShowActivity$1
  extends Handler
{
  ImageShowActivity$1(ImageShowActivity paramImageShowActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      ImageShowActivity.access$0(this.this$0);
      ImageShowActivity.access$1(this.this$0).setImageBitmap(ImageShowActivity.access$2(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\ImageShowActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */