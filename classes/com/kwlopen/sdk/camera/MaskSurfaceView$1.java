package com.kwlopen.sdk.camera;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class MaskSurfaceView$1
  implements Camera.AutoFocusCallback
{
  MaskSurfaceView$1(MaskSurfaceView paramMaskSurfaceView) {}
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    if (paramBoolean)
    {
      MaskSurfaceView.access$0(this.this$0).onFocusSuccess();
      return;
    }
    MaskSurfaceView.access$0(this.this$0).onFocusFailed();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\MaskSurfaceView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */