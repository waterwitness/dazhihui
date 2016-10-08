package com.tencent.av.camera;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;

class VcCamera$2
  implements Runnable
{
  VcCamera$2(VcCamera paramVcCamera, Object paramObject) {}
  
  public void run()
  {
    if ((this.val$cameraPara != null) && (this.this$0.mCamera != null) && ((this.val$cameraPara instanceof Camera.Parameters))) {}
    try
    {
      this.this$0.mCamera.setParameters((Camera.Parameters)this.val$cameraPara);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */