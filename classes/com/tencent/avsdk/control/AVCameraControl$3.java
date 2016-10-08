package com.tencent.avsdk.control;

import com.tencent.av.sdk.AVVideoCtrl.EnableCameraCompleteCallback;

class AVCameraControl$3
  extends AVVideoCtrl.EnableCameraCompleteCallback
{
  AVCameraControl$3(AVCameraControl paramAVCameraControl, int paramInt) {}
  
  protected void onComplete(boolean paramBoolean, int paramInt)
  {
    super.onComplete(paramBoolean, paramInt);
    if (paramInt == 0)
    {
      if (this.val$camera == 0) {
        AVCameraControl.access$402(this.this$0, true);
      }
    }
    else {
      return;
    }
    AVCameraControl.access$402(this.this$0, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVCameraControl$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */