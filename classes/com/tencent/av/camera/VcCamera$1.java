package com.tencent.av.camera;

import android.hardware.Camera;

class VcCamera$1
  implements Runnable
{
  VcCamera$1(VcCamera paramVcCamera, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    if (this.this$0.mCamera == null) {
      return;
    }
    if (this.this$0.mPreBuffer != null)
    {
      this.this$0.mCamera.setPreviewCallbackWithBuffer(null);
      this.this$0.mCamera.stopPreview();
      VcCamera.access$000(this.this$0, this.val$w, this.val$h);
      if (this.this$0.mPreBuffer == null) {
        break label126;
      }
      this.this$0.mCamera.addCallbackBuffer(this.this$0.mPreBuffer);
      this.this$0.mCamera.setPreviewCallbackWithBuffer(VcCamera.access$100(this.this$0));
    }
    for (;;)
    {
      this.this$0.mCamera.startPreview();
      return;
      this.this$0.mCamera.setPreviewCallback(null);
      break;
      label126:
      this.this$0.mCamera.setPreviewCallback(VcCamera.access$100(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */