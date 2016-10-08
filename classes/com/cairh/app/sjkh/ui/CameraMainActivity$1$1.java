package com.cairh.app.sjkh.ui;

import android.hardware.Camera;

class CameraMainActivity$1$1
  implements Runnable
{
  CameraMainActivity$1$1(CameraMainActivity.1 param1) {}
  
  public void run()
  {
    if (CameraMainActivity.1.access$0(this.this$1).isPreview) {
      CameraMainActivity.1.access$0(this.this$1).camera.autoFocus(CameraMainActivity.1.access$0(this.this$1).autoFocusCallback1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\CameraMainActivity$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */