package com.tencent.avsdk.activity;

import android.util.Log;
import com.tencent.TIMCallBack;
import com.tencent.avsdk.control.LoginControl;

class AvGuestActivity$2$3
  implements TIMCallBack
{
  AvGuestActivity$2$3(AvGuestActivity.2 param2) {}
  
  public void onError(int paramInt, String paramString)
  {
    if (paramInt != 10013)
    {
      Log.e("ilvb", "进入聊天失败:" + paramInt + " " + paramString);
      if (!this.this$1.this$0.isFinishing()) {
        this.this$1.this$0.onCloseVideo(true);
      }
      return;
    }
    Log.d("ilvb", "initJoinGroup onSuccess i=" + paramInt + " " + paramString);
    AvGuestActivity.access$1702(this.this$1.this$0, new LoginControl(this.this$1.this$0, AvGuestActivity.access$700(this.this$1.this$0)));
    AvGuestActivity.access$1800(this.this$1.this$0);
  }
  
  public void onSuccess()
  {
    Log.d("ilvb", "initJoinGroup onSuccess");
    AvGuestActivity.access$1702(this.this$1.this$0, new LoginControl(this.this$1.this$0, AvGuestActivity.access$700(this.this$1.this$0)));
    AvGuestActivity.access$1800(this.this$1.this$0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$2$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */