package com.tencent.avsdkhost.activity;

import android.util.Log;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdkhost.control.MessageControlHost;
import com.tencent.avsdkhost.control.RoomControl.CallBack;

class AvHostActivity$7
  implements RoomControl.CallBack
{
  AvHostActivity$7(AvHostActivity paramAvHostActivity, boolean paramBoolean) {}
  
  public void onCallBack(boolean paramBoolean, String paramString)
  {
    Log.d("ilvb", "AvHostActivity onCloseVideo isTrue=" + paramBoolean + " msg=" + paramString);
    if (paramBoolean) {
      AvHostActivity.access$702(this.this$0, 0);
    }
    if ((AvHostActivity.access$200(this.this$0) != null) && (AvHostActivity.access$200(this.this$0).getAVContext() != null) && (AvHostActivity.access$200(this.this$0).getAVContext().getAudioCtrl() != null)) {
      AvHostActivity.access$200(this.this$0).getAVContext().getAudioCtrl().stopTRAEService();
    }
    if (AvHostActivity.access$1300(this.this$0) != null)
    {
      AvHostActivity.access$1300(this.this$0).destroy();
      AvHostActivity.access$1302(this.this$0, null);
    }
    if ((AvHostActivity.access$1100(this.this$0) != null) && (AvHostActivity.access$1100(this.this$0).getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)) {
      AvHostActivity.access$1100(this.this$0).exitRoom();
    }
    if (this.val$finishActivity) {
      this.this$0.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */