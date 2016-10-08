package com.kwlopen.sdk.camera;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class CameraHelper$1
  implements Camera.AutoFocusCallback
{
  CameraHelper$1(CameraHelper paramCameraHelper, Activity paramActivity, OnCaptureCallback paramOnCaptureCallback) {}
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    paramCamera.takePicture(new CameraHelper.1.1(this), null, new CameraHelper.1.2(this, this.val$context, this.val$callback));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\CameraHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */