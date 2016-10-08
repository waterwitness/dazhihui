package com.tencent.av.camera;

import android.hardware.Camera;
import com.tencent.av.utils.QLog;

class VcCamera$SwitchCameraRunnable
  implements Runnable
{
  int mCameraId = 0;
  
  VcCamera$SwitchCameraRunnable(VcCamera paramVcCamera, int paramInt)
  {
    this.mCameraId = paramInt;
  }
  
  public void run()
  {
    int i = 1;
    if ((this.this$0.NUM_CAMERA < 2) || (this.this$0.mCamera == null)) {
      break label23;
    }
    label23:
    label75:
    label194:
    label214:
    label217:
    for (;;)
    {
      return;
      if (this.mCameraId != this.this$0.CUR_CAMERA)
      {
        this.this$0.closeInternal();
        if (this.mCameraId == 0)
        {
          if (!VcCamera.access$300(this.this$0)) {
            break label214;
          }
          VcCamera.access$000(this.this$0, VideoChatSettings.width, VideoChatSettings.height);
        }
        for (;;)
        {
          if (i == 0) {
            break label217;
          }
          for (;;)
          {
            try
            {
              if (this.this$0.mPreBuffer == null) {
                break label194;
              }
              this.this$0.mCamera.addCallbackBuffer(this.this$0.mPreBuffer);
              this.this$0.mCamera.setPreviewCallbackWithBuffer(VcCamera.access$100(this.this$0));
              this.this$0.mCamera.setPreviewDisplay(this.this$0.mHolder);
              this.this$0.mCamera.startPreview();
              return;
            }
            catch (Exception localException) {}
            if (!QLog.isColorLevel()) {
              break;
            }
            QLog.d("VcCamera", 0, "setPreviewDisplay error", localException);
            return;
            if (!VcCamera.access$400(this.this$0)) {
              break label214;
            }
            VcCamera.access$000(this.this$0, VideoChatSettings.width, VideoChatSettings.height);
            break label75;
            this.this$0.mCamera.setPreviewCallback(VcCamera.access$100(this.this$0));
          }
          i = 0;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$SwitchCameraRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */