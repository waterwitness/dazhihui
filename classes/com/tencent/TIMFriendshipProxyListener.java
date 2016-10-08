package com.tencent;

import java.util.List;

public abstract interface TIMFriendshipProxyListener
{
  public abstract void OnAddFriendGroups(List<TIMFriendGroup> paramList);
  
  public abstract void OnAddFriendReqs(List<TIMSNSChangeInfo> paramList);
  
  public abstract void OnAddFriends(List<TIMUserProfile> paramList);
  
  public abstract void OnDelFriendGroups(List<String> paramList);
  
  public abstract void OnDelFriends(List<String> paramList);
  
  public abstract void OnFriendGroupUpdate(List<TIMFriendGroup> paramList);
  
  public abstract void OnFriendProfileUpdate(List<TIMUserProfile> paramList);
  
  public abstract void OnProxyStatusChange(TIMFriendshipProxyStatus paramTIMFriendshipProxyStatus);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipProxyListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */