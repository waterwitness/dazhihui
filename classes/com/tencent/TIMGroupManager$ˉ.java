package com.tencent;

import android.os.Handler;
import com.tencent.imcore.IGroupNotifyCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMGroupManager$ˉ
  extends IGroupNotifyCallback
{
  public TIMCallBack a;
  
  public TIMGroupManager$ˉ(TIMGroupManager paramTIMGroupManager, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done()
  {
    IMMsfCoreProxy.mainHandler.post(new ˆʻ(this));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ˆʼ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ˉ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */