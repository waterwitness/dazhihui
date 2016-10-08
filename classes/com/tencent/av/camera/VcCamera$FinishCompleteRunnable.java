package com.tencent.av.camera;

import java.lang.ref.WeakReference;

class VcCamera$FinishCompleteRunnable
  implements Runnable
{
  WeakReference<VcCamera> mHost = null;
  
  VcCamera$FinishCompleteRunnable(VcCamera paramVcCamera1, VcCamera paramVcCamera2)
  {
    this.mHost = new WeakReference(paramVcCamera2);
  }
  
  public void run()
  {
    if (this.mHost.get() != null) {
      ((VcCamera)this.mHost.get()).onFinishCamera();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$FinishCompleteRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */