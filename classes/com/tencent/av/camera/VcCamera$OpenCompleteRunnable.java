package com.tencent.av.camera;

import java.lang.ref.WeakReference;

class VcCamera$OpenCompleteRunnable
  implements Runnable
{
  WeakReference<VcCamera> mHost = null;
  boolean mResult = false;
  
  VcCamera$OpenCompleteRunnable(VcCamera paramVcCamera1, VcCamera paramVcCamera2, boolean paramBoolean)
  {
    this.mResult = paramBoolean;
    this.mHost = new WeakReference(paramVcCamera2);
  }
  
  public void run()
  {
    if (this.mHost.get() != null) {
      ((VcCamera)this.mHost.get()).onOpenCamera(this.mResult);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$OpenCompleteRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */