package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendProfile;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.IFriendshipActionCallbackV2;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.List;

abstract class TIMFriendshipManager$ʻ
  extends IFriendshipActionCallbackV2
{
  public TIMValueCallBack<TIMUserSearchSucc> a;
  
  public TIMFriendshipManager$ʻ(TIMValueCallBack<TIMUserSearchSucc> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMUserSearchSucc paramTIMUserSearchSucc);
  
  public void done(long paramLong, FriendProfileVec paramFriendProfileVec)
  {
    QLog.d("TIMFriendshipManager", 1, "totalNum:" + paramLong + "|vecSize:" + paramFriendProfileVec.size());
    TIMUserSearchSucc localTIMUserSearchSucc = new TIMUserSearchSucc();
    localTIMUserSearchSucc.totalNum = paramLong;
    localTIMUserSearchSucc.infoList = new ArrayList();
    int i = 0;
    while (i < paramFriendProfileVec.size())
    {
      FriendProfile localFriendProfile = paramFriendProfileVec.get(i);
      localTIMUserSearchSucc.infoList.add(new TIMUserProfile(localFriendProfile));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʽʿ(this, localTIMUserSearchSucc));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽˆ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */