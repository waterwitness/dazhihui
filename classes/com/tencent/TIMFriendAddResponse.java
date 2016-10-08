package com.tencent;

public class TIMFriendAddResponse
{
  private String identifier = "";
  private String remark = "";
  private TIMFriendResponseType type;
  
  String getIdentifier()
  {
    return this.identifier;
  }
  
  String getRemark()
  {
    return this.remark;
  }
  
  TIMFriendResponseType getType()
  {
    return this.type;
  }
  
  public void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  public void setRemark(String paramString)
  {
    this.remark = paramString;
  }
  
  public void setType(TIMFriendResponseType paramTIMFriendResponseType)
  {
    this.type = paramTIMFriendResponseType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendAddResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */