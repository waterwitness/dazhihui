package com.kwlopen.sdk.camera;

import android.hardware.Camera.ShutterCallback;
import android.media.ToneGenerator;

class CameraHelper$1$1
  implements Camera.ShutterCallback
{
  CameraHelper$1$1(CameraHelper.1 param1) {}
  
  public void onShutter()
  {
    if (CameraHelper.access$0(CameraHelper.1.access$0(this.this$1)) == null) {
      CameraHelper.access$1(CameraHelper.1.access$0(this.this$1), new ToneGenerator(3, 100));
    }
    CameraHelper.access$0(CameraHelper.1.access$0(this.this$1)).startTone(24);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\CameraHelper$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */