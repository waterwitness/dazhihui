package com.tencent;

import com.tencent.imsdk.QLog;
import java.util.List;

final class ʽʼ
  extends TIMFriendshipManager.ˆ<TIMUserProfile>
{
  ʽʼ(TIMFriendshipManager paramTIMFriendshipManager, TIMValueCallBack paramTIMValueCallBack)
  {
    super(paramTIMFriendshipManager, paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    this.a.onError(paramInt, paramString);
  }
  
  public final void a(List<TIMUserProfile> paramList)
  {
    paramList = (TIMUserProfile)paramList.get(0);
    QLog.i("TIMFriendshipManager", 1, "get self profile: " + paramList.getIdentifier() + "nick: " + paramList.getNickName() + " face url: " + paramList.getFaceUrl());
    this.a.onSuccess(paramList);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʽʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */