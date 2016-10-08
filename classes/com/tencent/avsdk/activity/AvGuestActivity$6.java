package com.tencent.avsdk.activity;

import android.os.Handler;
import android.util.Log;
import com.tencent.avsdk.control.MessageControl;

class AvGuestActivity$6
  implements Runnable
{
  AvGuestActivity$6(AvGuestActivity paramAvGuestActivity) {}
  
  public void run()
  {
    Log.d("ilvb", "AvGuestActivity Checkpay成功了");
    AvGuestActivity.access$700(this.this$0).sendPing();
    AvGuestActivity.access$700(this.this$0).sendRoomInfo(AvGuestActivity.access$3600(this.this$0));
    AvGuestActivity.access$100(this.this$0).sendEmptyMessage(302);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */