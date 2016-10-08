package com.tencent.av.camera;

import android.hardware.Camera;
import com.tencent.av.sdk.AVUILoopProxy;
import com.tencent.av.utils.QLog;

class VcCamera$3
  implements Runnable
{
  VcCamera$3(VcCamera paramVcCamera, int paramInt) {}
  
  public void run()
  {
    boolean bool = true;
    QLog.d("VcCamera", 0, "openCamera run.");
    if (VcCamera.isCameraOpened) {}
    for (;;)
    {
      VcCamera.isCameraOpened = bool;
      AVUILoopProxy.postTaskToMainLooper(new VcCamera.OpenCompleteRunnable(this.this$0, this.this$0, bool));
      QLog.d("VcCamera", 0, "openCamera end.");
      return;
      if (this.this$0.mContext == null)
      {
        QLog.d("VcCamera", 0, "openCamera context == null");
        bool = false;
      }
      else if (this.this$0.mHolder == null)
      {
        QLog.d("VcCamera", 0, "openCamera mHolder == null");
        bool = false;
      }
      else
      {
        if (this.this$0.NUM_CAMERA == 0) {
          this.this$0.NUM_CAMERA = VcCamera.access$200();
        }
        if (this.val$cameraId == 0)
        {
          if ((!VcCamera.access$300(this.this$0)) && (!VcCamera.access$400(this.this$0)))
          {
            QLog.d("VcCamera", 0, "openCamera failed");
            bool = false;
          }
        }
        else if ((!VcCamera.access$400(this.this$0)) && (!VcCamera.access$300(this.this$0)))
        {
          QLog.d("VcCamera", 0, "openCamera failed");
          bool = false;
          continue;
        }
        if (this.this$0.mCamera != null) {
          break;
        }
        QLog.d("VcCamera", 0, "openCamera camera == null");
        bool = false;
      }
    }
    VcCamera.access$000(this.this$0, VideoChatSettings.width, VideoChatSettings.height);
    for (;;)
    {
      try
      {
        if (this.this$0.mPreBuffer == null) {
          break label316;
        }
        this.this$0.mCamera.addCallbackBuffer(this.this$0.mPreBuffer);
        this.this$0.mCamera.setPreviewCallbackWithBuffer(VcCamera.access$100(this.this$0));
        this.this$0.mCamera.setPreviewDisplay(this.this$0.mHolder);
        this.this$0.mCamera.startPreview();
      }
      catch (Exception localException)
      {
        QLog.d("VcCamera", 0, "setPreviewDisplay error", localException);
        localException.printStackTrace();
        bool = false;
      }
      break;
      label316:
      this.this$0.mCamera.setPreviewCallback(VcCamera.access$100(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */