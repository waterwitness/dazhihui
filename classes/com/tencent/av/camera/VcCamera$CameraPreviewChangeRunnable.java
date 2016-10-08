package com.tencent.av.camera;

import com.tencent.av.sdk.AVVideoCtrl.CameraPreviewChangeCallback;

class VcCamera$CameraPreviewChangeRunnable
  implements Runnable
{
  int cameraId = -1;
  
  VcCamera$CameraPreviewChangeRunnable(VcCamera paramVcCamera, int paramInt)
  {
    this.cameraId = paramInt;
  }
  
  public void run()
  {
    if ((VcCamera.mCameraPreviewChangeCallback != null) && ((VcCamera.mCameraPreviewChangeCallback instanceof AVVideoCtrl.CameraPreviewChangeCallback))) {
      ((AVVideoCtrl.CameraPreviewChangeCallback)VcCamera.mCameraPreviewChangeCallback).onCameraPreviewChangeCallback(this.cameraId);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$CameraPreviewChangeRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */