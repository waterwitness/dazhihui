package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendPendencyItemVec;
import com.tencent.imcore.FriendPendencyMeta;
import com.tencent.imcore.IFriendshipPendencyCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMFriendshipManager$ʿ
  extends IFriendshipPendencyCallback
{
  public TIMValueCallBack<TIMGetFriendPendencyListSucc> a;
  
  public TIMFriendshipManager$ʿ(TIMValueCallBack<TIMGetFriendPendencyListSucc> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGetFriendPendencyListSucc paramTIMGetFriendPendencyListSucc);
  
  public void done(FriendPendencyMeta paramFriendPendencyMeta, FriendPendencyItemVec paramFriendPendencyItemVec)
  {
    paramFriendPendencyMeta = new TIMGetFriendPendencyListSucc(paramFriendPendencyMeta, paramFriendPendencyItemVec);
    IMMsfCoreProxy.mainHandler.post(new ʽˑ(this, paramFriendPendencyMeta));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽי(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ʿ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */