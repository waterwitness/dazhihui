package com.tencent.avsdk.control;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tencent.av.sdk.AVVideoCtrl.SwitchCameraCompleteCallback;
import java.lang.ref.WeakReference;

class AVCameraControl$2
  extends AVVideoCtrl.SwitchCameraCompleteCallback
{
  AVCameraControl$2(AVCameraControl paramAVCameraControl) {}
  
  protected void onComplete(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    super.onComplete(paramInt1, paramInt2);
    Log.d("ilvb", "AVCameraControl mSwitchCameraCompleteCallback.onComplete cameraId = " + paramInt1 + " result = " + paramInt2);
    AVCameraControl.access$302(this.this$0, false);
    if (paramInt1 == 0) {
      bool = true;
    }
    if (paramInt2 == 0) {
      AVCameraControl.access$402(this.this$0, bool);
    }
    this.this$0.dump("SwitchCameraCompleteCallback");
    if (!this.this$0.isContextOk()) {}
    do
    {
      return;
      localObject = (Handler)AVCameraControl.access$200(this.this$0).get();
    } while (localObject == null);
    Object localObject = ((Handler)localObject).obtainMessage(356);
    ((Message)localObject).arg1 = paramInt2;
    ((Message)localObject).arg2 = paramInt1;
    ((Message)localObject).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVCameraControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */