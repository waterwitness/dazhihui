package com.tencent;

public class TIMProfileSystemElem
  extends TIMElem
{
  private String fromUser = "";
  private String nickName = "";
  private TIMProfileSystemType subType;
  
  public TIMProfileSystemElem()
  {
    this.type = TIMElemType.ProfileTips;
  }
  
  public String getFromUser()
  {
    return this.fromUser;
  }
  
  public String getNickName()
  {
    return this.nickName;
  }
  
  public TIMProfileSystemType getSubType()
  {
    return this.subType;
  }
  
  void setFromUser(String paramString)
  {
    this.fromUser = paramString;
  }
  
  void setNickName(String paramString)
  {
    this.nickName = paramString;
  }
  
  void setSubType(long paramLong)
  {
    if (paramLong == TIMProfileSystemType.TIM_PROFILE_SYSTEM_FRIEND_PROFILE_CHANGE.ordinal())
    {
      this.subType = TIMProfileSystemType.TIM_PROFILE_SYSTEM_FRIEND_PROFILE_CHANGE;
      return;
    }
    this.subType = TIMProfileSystemType.INVALID;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMProfileSystemElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */