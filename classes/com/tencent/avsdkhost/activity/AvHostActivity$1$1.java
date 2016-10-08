package com.tencent.avsdkhost.activity;

import android.os.Handler;
import com.tencent.avsdkhost.control.RoomControl;
import com.tencent.avsdkhost.widget.MyUserInfoDialogHost;

class AvHostActivity$1$1
  implements Runnable
{
  AvHostActivity$1$1(AvHostActivity.1 param1, RoomControl paramRoomControl) {}
  
  public void run()
  {
    AvHostActivity.access$602(this.this$1.this$0, this.val$roomControl.mGroupId);
    AvHostActivity.access$702(this.this$1.this$0, this.val$roomControl.mRoomId);
    AvHostActivity.access$800(this.this$1.this$0).setRoomId(AvHostActivity.access$700(this.this$1.this$0));
    AvHostActivity.access$000(this.this$1.this$0).sendEmptyMessage(320);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */