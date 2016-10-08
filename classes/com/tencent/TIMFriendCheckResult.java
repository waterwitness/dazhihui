package com.tencent;

public class TIMFriendCheckResult
{
  String identifier;
  String relationType;
  long status;
  
  TIMFriendCheckResult(TIMFriendResult paramTIMFriendResult)
  {
    this.identifier = paramTIMFriendResult.getIdentifer();
    this.status = paramTIMFriendResult.getStatus().getValue();
    this.relationType = paramTIMFriendResult.getRelationType();
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public TIMFriendRelationType getRelationType()
  {
    TIMFriendRelationType[] arrayOfTIMFriendRelationType = TIMFriendRelationType.values();
    int j = arrayOfTIMFriendRelationType.length;
    int i = 0;
    while (i < j)
    {
      TIMFriendRelationType localTIMFriendRelationType = arrayOfTIMFriendRelationType[i];
      if (this.relationType.equals(localTIMFriendRelationType.getValue())) {
        return localTIMFriendRelationType;
      }
      i += 1;
    }
    return TIMFriendRelationType.TIM_FRIEND_RELATION_TYPE_NONE;
  }
  
  public TIMFriendStatus getStatus()
  {
    TIMFriendStatus[] arrayOfTIMFriendStatus = TIMFriendStatus.values();
    int j = arrayOfTIMFriendStatus.length;
    int i = 0;
    while (i < j)
    {
      TIMFriendStatus localTIMFriendStatus = arrayOfTIMFriendStatus[i];
      if (this.status == localTIMFriendStatus.getValue()) {
        return localTIMFriendStatus;
      }
      i += 1;
    }
    return TIMFriendStatus.TIM_FRIEND_STATUS_UNKNOWN;
  }
  
  void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  void setRelationType(String paramString)
  {
    this.relationType = paramString;
  }
  
  void setStatus(long paramLong)
  {
    this.status = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendCheckResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */