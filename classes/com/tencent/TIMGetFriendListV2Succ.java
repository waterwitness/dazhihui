package com.tencent;

import java.util.List;

public class TIMGetFriendListV2Succ
{
  private List<TIMUserProfile> friends;
  private TIMFriendMetaInfo metaInfo;
  
  public List<TIMUserProfile> getFriends()
  {
    return this.friends;
  }
  
  public TIMFriendMetaInfo getMetaInfo()
  {
    return this.metaInfo;
  }
  
  void setFriends(List<TIMUserProfile> paramList)
  {
    this.friends = paramList;
  }
  
  void setMetaInfo(TIMFriendMetaInfo paramTIMFriendMetaInfo)
  {
    this.metaInfo = paramTIMFriendMetaInfo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGetFriendListV2Succ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */