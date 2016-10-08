package com.cairh.app.sjkh.ui;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.os.Handler;

class FaceCameraActivity$1
  implements Camera.AutoFocusCallback
{
  FaceCameraActivity$1(FaceCameraActivity paramFaceCameraActivity) {}
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    new Handler().postDelayed(new FaceCameraActivity.1.1(this), 5000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\FaceCameraActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */