package com.tencent.avsdk;

public class MemberInfo
{
  public boolean hasGetInfo = false;
  private String headImagePath = "";
  public String identifier = "";
  public boolean isShareMovie = false;
  public boolean isShareSrc = false;
  public boolean isSpeaking = false;
  public boolean isVideoIn = false;
  public String name;
  private String userId = "";
  private String userNickName;
  
  public MemberInfo() {}
  
  public MemberInfo(String paramString1, String paramString2, String paramString3)
  {
    this.userId = paramString1;
    this.userNickName = paramString2;
    this.headImagePath = paramString3;
  }
  
  public String getHeadImagePath()
  {
    return this.headImagePath;
  }
  
  public String getUserId()
  {
    return this.userId;
  }
  
  public String getUserNickName()
  {
    return this.userNickName;
  }
  
  public void setHeadImagePath(String paramString)
  {
    this.headImagePath = paramString;
  }
  
  public void setUserId(String paramString)
  {
    this.userId = paramString;
  }
  
  public void setUserNickName(String paramString)
  {
    this.userNickName = paramString;
  }
  
  public String toString()
  {
    return "MemberInfo identifier = " + this.identifier + ", isSpeaking = " + this.isSpeaking + ", isVideoIn = " + this.isVideoIn + ", isShareSrc = " + this.isShareSrc + ", isShareMovie = " + this.isShareMovie + ", hasGetInfo = " + this.hasGetInfo + ", name = " + this.name;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\MemberInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */