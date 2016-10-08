package com.tencent.avsdkhost.activity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AvHostActivity$6
  extends Handler
{
  AvHostActivity$6(AvHostActivity paramAvHostActivity, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (this.this$0.isFinishing()) {}
    while (paramMessage == null) {
      return;
    }
    AvHostActivity.access$2700(this.this$0, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */