package com.tencent;

import android.os.Handler;
import com.tencent.imcore.IFriendshipCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMFriendshipManager$ʼ
  extends IFriendshipCallback
{
  public TIMCallBack a;
  
  public TIMFriendshipManager$ʼ(TIMFriendshipManager paramTIMFriendshipManager, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done()
  {
    IMMsfCoreProxy.mainHandler.post(new ʽˈ(this));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽˉ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */