package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendProfile;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.IFriendshipActionCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.List;

abstract class TIMFriendshipManager$ˉ<T>
  extends IFriendshipActionCallback
{
  public TIMValueCallBack<T> a;
  
  public TIMFriendshipManager$ˉ(TIMValueCallBack<T> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMFriendResult> paramList);
  
  public void done(FriendProfileVec paramFriendProfileVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramFriendProfileVec.size())
    {
      FriendProfile localFriendProfile = paramFriendProfileVec.get(i);
      localArrayList.add(new TIMFriendResult(localFriendProfile));
      QLog.d("TIMFriendshipManager", 1, "identifier: " + localFriendProfile.getSIdentifier() + " status: " + localFriendProfile.getResult());
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʽᵎ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽᵔ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ˉ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */