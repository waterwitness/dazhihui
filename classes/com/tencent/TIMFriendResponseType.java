package com.tencent;

public enum TIMFriendResponseType
{
  Agree("Response_Action_Agree"),  AgreeAndAdd("Response_Action_AgreeAndAdd"),  Reject("Response_Action_Reject");
  
  private String action = "";
  
  private TIMFriendResponseType(String paramString)
  {
    this.action = paramString;
  }
  
  final String getAction()
  {
    return this.action;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendResponseType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */