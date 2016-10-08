package com.cairh.app.sjkh.ui;

import android.hardware.Camera;

class FaceCameraActivity$1$1
  implements Runnable
{
  FaceCameraActivity$1$1(FaceCameraActivity.1 param1) {}
  
  public void run()
  {
    if (FaceCameraActivity.1.access$0(this.this$1).isPreview) {
      FaceCameraActivity.1.access$0(this.this$1).camera.autoFocus(FaceCameraActivity.1.access$0(this.this$1).autoFocusCallback1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\FaceCameraActivity$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */