package com.android.dazhihui.ui.delegate.domain;

public class UserInfo
{
  private String account;
  private String birthday;
  private String idNo;
  private String idType;
  private String loginPwd;
  private String mobileNo;
  private String name;
  private String partnerUserId;
  private String sex;
  
  public UserInfo() {}
  
  public UserInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.idType = paramString1;
    this.idNo = paramString2;
    this.name = paramString3;
    this.sex = paramString4;
    this.birthday = paramString5;
    this.mobileNo = paramString6;
    this.partnerUserId = paramString7;
    this.account = paramString8;
    this.loginPwd = paramString9;
  }
  
  public String getAccount()
  {
    return this.account;
  }
  
  public String getBirthday()
  {
    return this.birthday;
  }
  
  public String getIdNo()
  {
    return this.idNo;
  }
  
  public String getIdType()
  {
    return this.idType;
  }
  
  public String getLoginPwd()
  {
    return this.loginPwd;
  }
  
  public String getMobileNo()
  {
    return this.mobileNo;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPartnerUserId()
  {
    return this.partnerUserId;
  }
  
  public String getSex()
  {
    return this.sex;
  }
  
  public void setAccount(String paramString)
  {
    this.account = paramString;
  }
  
  public void setBirthday(String paramString)
  {
    this.birthday = paramString;
  }
  
  public void setIdNo(String paramString)
  {
    this.idNo = paramString;
  }
  
  public void setIdType(String paramString)
  {
    this.idType = paramString;
  }
  
  public void setLoginPwd(String paramString)
  {
    this.loginPwd = paramString;
  }
  
  public void setMobileNo(String paramString)
  {
    this.mobileNo = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setPartnerUserId(String paramString)
  {
    this.partnerUserId = paramString;
  }
  
  public void setSex(String paramString)
  {
    this.sex = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\domain\UserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */