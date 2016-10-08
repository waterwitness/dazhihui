package com.tencent.avsdk;

public class UserInfo
{
  private static String TAG = "ilvb";
  private static UserInfo sUserInfo = null;
  private String mAccountLevel;
  private String mHeadImagePath = "";
  private Boolean mIsCreater = Boolean.valueOf(false);
  private String mName = "";
  private String mPhone = "";
  private String mUserSig = "";
  
  public static UserInfo getInstance()
  {
    if (sUserInfo == null) {}
    try
    {
      if (sUserInfo == null) {
        sUserInfo = new UserInfo();
      }
      return sUserInfo;
    }
    finally {}
  }
  
  public String getAccountLevel()
  {
    return this.mAccountLevel;
  }
  
  public String getHeadImagePath()
  {
    return this.mHeadImagePath;
  }
  
  public String getUserName()
  {
    return this.mName;
  }
  
  public String getUserPhone()
  {
    return this.mPhone;
  }
  
  public String getUsersig()
  {
    return this.mUserSig;
  }
  
  public Boolean isCreater()
  {
    return this.mIsCreater;
  }
  
  public void setAccountLevel(String paramString)
  {
    this.mAccountLevel = paramString;
  }
  
  public void setHeadImagePath(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.mHeadImagePath = str;
  }
  
  public void setIsCreater(Boolean paramBoolean)
  {
    this.mIsCreater = paramBoolean;
  }
  
  public void setUserName(String paramString)
  {
    this.mName = paramString;
  }
  
  public void setUserPhone(String paramString)
  {
    this.mPhone = paramString;
  }
  
  public void setUsersig(String paramString)
  {
    this.mUserSig = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\UserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */