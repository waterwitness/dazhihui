package com.thinkive.mobile.account.activitys;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class IdentityPhotoActivity$1
  extends Handler
{
  IdentityPhotoActivity$1(IdentityPhotoActivity paramIdentityPhotoActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      IdentityPhotoActivity.a(this.a, (String)paramMessage.obj);
      IdentityPhotoActivity.b(this.a, IdentityPhotoActivity.a(this.a));
      return;
    }
    Toast.makeText(this.a, "获取图片失败,请重新从相册选择", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */