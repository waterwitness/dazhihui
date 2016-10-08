package com.kwlopen.sdk.camera;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;

class CameraHelper$1$2
  implements Camera.PictureCallback
{
  CameraHelper$1$2(CameraHelper.1 param1, Activity paramActivity, OnCaptureCallback paramOnCaptureCallback) {}
  
  public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    paramArrayOfByte = CameraHelper.access$2(CameraHelper.1.access$0(this.this$1), this.val$context, paramArrayOfByte);
    boolean bool = false;
    if (paramArrayOfByte != null) {
      bool = true;
    }
    CameraHelper.access$3(CameraHelper.1.access$0(this.this$1));
    this.val$callback.onCapture(bool, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\CameraHelper$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */