package com.kwlopen.sdk.activity;

import android.os.Handler;
import com.kwl.common.utils.BitmapUtils;
import com.kwl.common.utils.LogUtil;

class ImageShowActivity$2
  implements Runnable
{
  ImageShowActivity$2(ImageShowActivity paramImageShowActivity) {}
  
  public void run()
  {
    LogUtil.d("image_path ---->" + ImageShowActivity.access$3(this.this$0));
    ImageShowActivity.access$4(this.this$0, BitmapUtils.getPhotoFromSDCard(ImageShowActivity.access$3(this.this$0)));
    ImageShowActivity.access$5(this.this$0).sendEmptyMessage(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\ImageShowActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */