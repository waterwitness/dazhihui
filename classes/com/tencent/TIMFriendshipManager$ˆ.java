package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.IFriendshipActionCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMFriendshipManager$ˆ<T>
  extends IFriendshipActionCallback
{
  public TIMValueCallBack<T> a;
  
  public TIMFriendshipManager$ˆ(TIMValueCallBack<T> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMUserProfile> paramList);
  
  public void done(FriendProfileVec paramFriendProfileVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramFriendProfileVec.size())
    {
      localArrayList.add(new TIMUserProfile(paramFriendProfileVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʽـ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽٴ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */