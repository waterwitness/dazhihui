package com.tencent;

import android.os.Handler;
import com.tencent.imcore.FriendMetaInfo;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.IFriendshipGetFriendV2Callback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;

abstract class TIMFriendshipManager$ˈ<T>
  extends IFriendshipGetFriendV2Callback
{
  public TIMValueCallBack<T> a;
  
  public TIMFriendshipManager$ˈ(TIMValueCallBack<T> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGetFriendListV2Succ paramTIMGetFriendListV2Succ);
  
  public void done(FriendMetaInfo paramFriendMetaInfo, FriendProfileVec paramFriendProfileVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramFriendProfileVec.size())
    {
      localArrayList.add(new TIMUserProfile(paramFriendProfileVec.get(i)));
      i += 1;
    }
    paramFriendProfileVec = new TIMFriendMetaInfo();
    paramFriendProfileVec.setNextSeq(paramFriendMetaInfo.getDdwNextSeq());
    paramFriendProfileVec.setInfoSeq(paramFriendMetaInfo.getDdwInfoSeq());
    paramFriendProfileVec.setRecover(paramFriendMetaInfo.getRecover());
    paramFriendProfileVec.setTimestamp(paramFriendMetaInfo.getDdwTimestamp());
    paramFriendMetaInfo = new TIMGetFriendListV2Succ();
    paramFriendMetaInfo.setFriends(localArrayList);
    paramFriendMetaInfo.setMetaInfo(paramFriendProfileVec);
    IMMsfCoreProxy.mainHandler.post(new ʽᐧ(this, paramFriendMetaInfo));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʽᴵ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager$ˈ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */