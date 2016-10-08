package com.tencent;

import com.tencent.imcore.FriendProfile;

public class TIMFriendResult
{
  private String identifer;
  private String relationType;
  private long status;
  
  public TIMFriendResult(FriendProfile paramFriendProfile)
  {
    this.identifer = paramFriendProfile.getSIdentifier();
    this.status = paramFriendProfile.getResult();
    this.relationType = paramFriendProfile.getSResponseAction();
  }
  
  public String getIdentifer()
  {
    return this.identifer;
  }
  
  protected String getRelationType()
  {
    return this.relationType;
  }
  
  public TIMFriendStatus getStatus()
  {
    TIMFriendStatus[] arrayOfTIMFriendStatus = TIMFriendStatus.values();
    int j = arrayOfTIMFriendStatus.length;
    int i = 0;
    while (i < j)
    {
      TIMFriendStatus localTIMFriendStatus = arrayOfTIMFriendStatus[i];
      if (localTIMFriendStatus.getValue() == this.status) {
        return localTIMFriendStatus;
      }
      i += 1;
    }
    return TIMFriendStatus.TIM_FRIEND_STATUS_UNKNOWN;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */