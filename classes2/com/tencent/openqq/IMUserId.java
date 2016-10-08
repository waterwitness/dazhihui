package com.tencent.openqq;

public class IMUserId
{
  private String sUserAppId;
  private long tinyId;
  private String uidType;
  private long uin;
  private int userAppId;
  private String userId;
  
  public IMUserId() {}
  
  public IMUserId(IMUserId paramIMUserId)
  {
    this.uidType = paramIMUserId.uidType;
    this.userAppId = paramIMUserId.userAppId;
    this.userId = paramIMUserId.userId;
    this.tinyId = paramIMUserId.tinyId;
    this.uin = paramIMUserId.uin;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return toString().equals(((IMUserId)paramObject).toString());
  }
  
  public int getOpenAppId()
  {
    return this.userAppId;
  }
  
  public String getOpenId()
  {
    return this.userId;
  }
  
  public long getTinyId()
  {
    return this.tinyId;
  }
  
  public String getUidType()
  {
    return this.uidType;
  }
  
  public long getUin()
  {
    return this.uin;
  }
  
  public int getUserAppId()
  {
    return this.userAppId;
  }
  
  public String getUserId()
  {
    return this.userId;
  }
  
  public String getsUserAppId()
  {
    return this.sUserAppId;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public void parseFromString(String paramString)
  {
    if (paramString == null) {
      return;
    }
    paramString = paramString.split(":");
    this.uidType = paramString[0];
    this.userAppId = Integer.parseInt(paramString[1]);
    this.sUserAppId = paramString[1];
    this.userId = paramString[2];
  }
  
  public void setOpenAppId(int paramInt)
  {
    this.userAppId = paramInt;
  }
  
  public void setOpenId(String paramString)
  {
    this.userId = paramString;
  }
  
  public void setTinyId(long paramLong)
  {
    this.tinyId = paramLong;
  }
  
  public void setUidType(String paramString)
  {
    this.uidType = paramString;
  }
  
  public void setUin(long paramLong)
  {
    this.uin = paramLong;
  }
  
  public void setUserAppId(int paramInt)
  {
    this.userAppId = paramInt;
  }
  
  public void setUserId(String paramString)
  {
    this.userId = paramString;
  }
  
  public void setsUserAppId(String paramString)
  {
    this.sUserAppId = paramString;
  }
  
  public String toString()
  {
    return this.uidType + ":" + this.sUserAppId + ":" + this.userId;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\IMUserId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */