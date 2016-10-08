package com.tencent;

import android.os.Handler;
import com.tencent.imcore.AddFriendReqVec;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.FriendProxyStatus;
import com.tencent.imcore.IFriendshipProxyListener;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

public class IMCoreFriendshipProxyCallback
  extends IFriendshipProxyListener
{
  String identify;
  
  public IMCoreFriendshipProxyCallback(String paramString)
  {
    this.identify = paramString;
    swigReleaseOwnership();
  }
  
  public void onAddFriendNotify(FriendProfileVec paramFriendProfileVec)
  {
    if (paramFriendProfileVec == null) {}
    long l;
    do
    {
      return;
      l = paramFriendProfileVec.size();
    } while ((l <= 0L) || (TIMManager.getInstanceById(this.identify).getFriendshipProxyListener() == null));
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(new TIMUserProfile(paramFriendProfileVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˈ(this, localArrayList));
  }
  
  public void onAddFriendReq(AddFriendReqVec paramAddFriendReqVec)
  {
    if (paramAddFriendReqVec == null) {}
    long l;
    do
    {
      return;
      l = paramAddFriendReqVec.size();
    } while ((l <= 0L) || (TIMManager.getInstanceById(this.identify).getFriendshipProxyListener() == null));
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(new TIMSNSChangeInfo(paramAddFriendReqVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˋ(this, localArrayList));
  }
  
  public void onDeleteFriendNotify(StrVec paramStrVec)
  {
    if (paramStrVec == null) {}
    long l;
    do
    {
      return;
      l = paramStrVec.size();
    } while ((l <= 0L) || (TIMManager.getInstanceById(this.identify).getFriendshipProxyListener() == null));
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(paramStrVec.get(i));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˉ(this, localArrayList));
  }
  
  public void onFriendProfileUpdate(FriendProfileVec paramFriendProfileVec)
  {
    if (paramFriendProfileVec == null) {}
    long l;
    do
    {
      return;
      l = paramFriendProfileVec.size();
    } while ((l <= 0L) || (TIMManager.getInstanceById(this.identify).getFriendshipProxyListener() == null));
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(new TIMUserProfile(paramFriendProfileVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˊ(this, localArrayList));
  }
  
  public void onProxyStatusChange(FriendProxyStatus paramFriendProxyStatus)
  {
    if (paramFriendProxyStatus == null) {}
    while (TIMManager.getInstanceById(this.identify).getFriendshipProxyListener() == null) {
      return;
    }
    Object localObject = TIMFriendshipProxyStatus.TIM_FRIENDSHIP_STATUS_NONE;
    TIMFriendshipProxyStatus[] arrayOfTIMFriendshipProxyStatus = TIMFriendshipProxyStatus.values();
    int j = arrayOfTIMFriendshipProxyStatus.length;
    int i = 0;
    if (i < j)
    {
      TIMFriendshipProxyStatus localTIMFriendshipProxyStatus = arrayOfTIMFriendshipProxyStatus[i];
      if (localTIMFriendshipProxyStatus.getStatus() != paramFriendProxyStatus.swigValue()) {
        break label87;
      }
      localObject = localTIMFriendshipProxyStatus;
    }
    label87:
    for (;;)
    {
      i += 1;
      break;
      IMMsfCoreProxy.mainHandler.post(new ˆ(this, (TIMFriendshipProxyStatus)localObject));
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreFriendshipProxyCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */