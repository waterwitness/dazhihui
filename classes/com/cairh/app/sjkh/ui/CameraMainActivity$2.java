package com.cairh.app.sjkh.ui;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class CameraMainActivity$2
  implements Camera.AutoFocusCallback
{
  CameraMainActivity$2(CameraMainActivity paramCameraMainActivity) {}
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    this.this$0.camera.takePicture(null, null, this.this$0.myJpegCallback);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\CameraMainActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */