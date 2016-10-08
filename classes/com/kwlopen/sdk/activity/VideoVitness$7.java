package com.kwlopen.sdk.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.bairuitech.anychat.AnyChatCoreSDK;

class VideoVitness$7
  implements DialogInterface.OnClickListener
{
  VideoVitness$7(VideoVitness paramVideoVitness) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    VideoVitness.access$0(this.this$0).UserCameraControl(-1, 0);
    VideoVitness.access$0(this.this$0).UserSpeakControl(-1, 0);
    VideoVitness.access$0(this.this$0).UserSpeakControl(this.this$0.dwTargetUserId, 0);
    VideoVitness.access$0(this.this$0).UserCameraControl(this.this$0.dwTargetUserId, 0);
    VideoVitness.access$0(this.this$0).LeaveRoom(-1);
    VideoVitness.access$0(this.this$0).Logout();
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("errcode", -7);
    paramDialogInterface.putExtra("errmsg", "客户自动断开，认证不通过！");
    this.this$0.setResult(-1, paramDialogInterface);
    this.this$0.stopTimer();
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoVitness$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */