package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendFutureItemVec;
import com.tencent.imcore.FutureFriendMeta;
import com.tencent.imcore.IFriendshipGetFutureCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMFriendshipManager$ʽ
  extends IFriendshipGetFutureCallback
{
  public TIMValueCallBack<TIMGetFriendFutureListSucc> a;
  
  public TIMFriendshipManager$ʽ(TIMValueCallBack<TIMGetFriendFutureListSucc> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGetFriendFutureListSucc paramTIMGetFriendFutureListSucc);
  
  public void done(FutureFriendMeta paramFutureFriendMeta, FriendFutureItemVec paramFriendFutureItemVec)
  {
    paramFutureFriendMeta = new TIMGetFriendFutureListSucc(paramFutureFriendMeta, paramFriendFutureItemVec);
    IMMsfCoreProxy.mainHandler.post(new ʽˊ(this, paramFutureFriendMeta));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽˋ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */