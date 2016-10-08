package com.tencent.av.camera;

import android.os.HandlerThread;
import com.tencent.av.sdk.AVUILoopProxy;

class VcCamera$4
  implements Runnable
{
  VcCamera$4(VcCamera paramVcCamera) {}
  
  public void run()
  {
    this.this$0.closeInternal();
    this.this$0.mCameraThread.quit();
    this.this$0.mCameraThread = null;
    AVUILoopProxy.postTaskToMainLooper(new VcCamera.CloseCompleteRunnable(this.this$0, this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */