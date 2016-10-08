package com.tencent.av.camera;

import java.lang.ref.WeakReference;

class VcCamera$CloseCompleteRunnable
  implements Runnable
{
  WeakReference<VcCamera> mHost = null;
  
  VcCamera$CloseCompleteRunnable(VcCamera paramVcCamera1, VcCamera paramVcCamera2)
  {
    this.mHost = new WeakReference(paramVcCamera2);
  }
  
  public void run()
  {
    if (this.mHost.get() != null) {
      ((VcCamera)this.mHost.get()).onCloseCamera();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$CloseCompleteRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */