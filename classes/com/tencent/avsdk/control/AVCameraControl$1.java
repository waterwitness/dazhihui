package com.tencent.avsdk.control;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tencent.av.sdk.AVVideoCtrl.EnableCameraCompleteCallback;
import java.lang.ref.WeakReference;

class AVCameraControl$1
  extends AVVideoCtrl.EnableCameraCompleteCallback
{
  AVCameraControl$1(AVCameraControl paramAVCameraControl) {}
  
  protected void onComplete(boolean paramBoolean, int paramInt)
  {
    super.onComplete(paramBoolean, paramInt);
    Log.d("ilvb", "AVCameraControl mEnableCameraCompleteCallback.onComplete cameraOpened = " + paramBoolean + " result = " + paramInt);
    AVCameraControl.access$002(this.this$0, false);
    if (paramInt == 0) {
      AVCameraControl.access$102(this.this$0, paramBoolean);
    }
    this.this$0.dump("EnableCameraCompleteCallback");
    if (!this.this$0.isContextOk()) {}
    do
    {
      return;
      localObject = (Handler)AVCameraControl.access$200(this.this$0).get();
    } while (localObject == null);
    Object localObject = ((Handler)localObject).obtainMessage(355);
    ((Message)localObject).arg1 = paramInt;
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      ((Message)localObject).arg2 = paramInt;
      ((Message)localObject).sendToTarget();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVCameraControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */