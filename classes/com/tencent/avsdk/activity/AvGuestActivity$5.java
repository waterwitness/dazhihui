package com.tencent.avsdk.activity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AvGuestActivity$5
  extends Handler
{
  AvGuestActivity$5(AvGuestActivity paramAvGuestActivity, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (this.this$0.isFinishing()) {}
    while (paramMessage == null) {
      return;
    }
    AvGuestActivity.access$3500(this.this$0, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */