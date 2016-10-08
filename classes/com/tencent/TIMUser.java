package com.tencent;

import com.tencent.imsdk.IMMsfCoreProxy;

public class TIMUser
{
  private String accountType = "";
  private String appIdAt3rd = "";
  private String identifier = "";
  private long tinyId = 0L;
  
  public TIMUser() {}
  
  public TIMUser(TIMUser paramTIMUser)
  {
    this.accountType = paramTIMUser.accountType;
    this.appIdAt3rd = paramTIMUser.appIdAt3rd;
    this.identifier = paramTIMUser.identifier;
    this.tinyId = paramTIMUser.tinyId;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return toString().equals(((TIMUser)paramObject).toString());
  }
  
  public String getAccountType()
  {
    return this.accountType;
  }
  
  public String getAppIdAt3rd()
  {
    return this.appIdAt3rd;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public long getTinyId()
  {
    return this.tinyId;
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
    this.accountType = paramString[0];
    this.appIdAt3rd = paramString[1];
    this.identifier = paramString[2];
  }
  
  public void setAccountType(String paramString)
  {
    this.accountType = paramString;
  }
  
  public void setAppIdAt3rd(String paramString)
  {
    this.appIdAt3rd = paramString;
  }
  
  public void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  public void setTinyId(long paramLong)
  {
    this.tinyId = paramLong;
  }
  
  public String toString()
  {
    return String.valueOf(IMMsfCoreProxy.get().getSdkAppId()) + ":" + this.accountType + ":" + this.identifier + ":" + this.appIdAt3rd;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMUser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */