package com.tencent;

import java.util.List;

public class TIMFriendCheckParam
{
  boolean bidirection = true;
  List<String> identifiers;
  
  List<String> getIdentifiers()
  {
    return this.identifiers;
  }
  
  boolean isBidirection()
  {
    return this.bidirection;
  }
  
  public void setBidirection(boolean paramBoolean)
  {
    this.bidirection = paramBoolean;
  }
  
  public void setIdentifiers(List<String> paramList)
  {
    this.identifiers = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendCheckParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */