package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.IFriendshipActionCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMFriendshipManager$ˋ
  extends IFriendshipActionCallback
{
  public TIMCallBack a;
  
  public TIMFriendshipManager$ˋ(TIMFriendshipManager paramTIMFriendshipManager, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done(FriendProfileVec paramFriendProfileVec)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽᵢ(this));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽⁱ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ˋ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */