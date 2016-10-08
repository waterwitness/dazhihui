package com.bairuitech.bussinesscenter;

public class SessionItem
{
  public int roomId;
  public int sessionStatus;
  public int sessionType;
  public int sourceUserId;
  public int targetUserId;
  
  public SessionItem(int paramInt1, int paramInt2, int paramInt3)
  {
    this.sessionType = paramInt1;
    this.sourceUserId = paramInt2;
    this.targetUserId = paramInt3;
  }
  
  public int getPeerUserItem(int paramInt)
  {
    if (this.sourceUserId == paramInt) {
      return this.targetUserId;
    }
    if (this.targetUserId == paramInt) {
      return this.sourceUserId;
    }
    return 0;
  }
  
  public int getRoomId()
  {
    return this.roomId;
  }
  
  public int getSessionStatus()
  {
    return this.sessionStatus;
  }
  
  public int getSessionType()
  {
    return this.sessionType;
  }
  
  public int getSourceUserId()
  {
    return this.sourceUserId;
  }
  
  public int getTargetUserId()
  {
    return this.targetUserId;
  }
  
  public void setRoomId(int paramInt)
  {
    this.roomId = paramInt;
  }
  
  public void setSessionStatus(int paramInt)
  {
    this.sessionStatus = paramInt;
  }
  
  public void setSessionType(int paramInt)
  {
    this.sessionType = paramInt;
  }
  
  public void setSourceUserId(int paramInt)
  {
    this.sourceUserId = paramInt;
  }
  
  public void setTargetUserId(int paramInt)
  {
    this.targetUserId = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\bussinesscenter\SessionItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */