package com.tencent;

import com.tencent.imsdk.QLog;
import java.util.Iterator;
import java.util.List;

final class ʻᵢ
  extends TIMFriendshipManager.ˆ<List<TIMUserProfile>>
{
  ʻᵢ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMFriendshipManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
  }
  
  public final void a(List<TIMUserProfile> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      TIMUserProfile localTIMUserProfile = (TIMUserProfile)localIterator.next();
      QLog.i("TIMFriendshipManager", 1, "get user profile: " + localTIMUserProfile.getIdentifier() + "nick: " + localTIMUserProfile.getNickName() + " face url: " + localTIMUserProfile.getFaceUrl());
    }
    this.a.onSuccess(paramList);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻᵢ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */