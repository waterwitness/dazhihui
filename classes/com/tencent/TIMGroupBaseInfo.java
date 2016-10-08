package com.tencent;

import com.tencent.imcore.GroupBaseInfo;
import java.io.UnsupportedEncodingException;

public class TIMGroupBaseInfo
{
  private String faceUrl = "";
  private String groupId = "";
  private String groupName = "";
  private String groupType = "";
  private TIMGroupBasicSelfInfo selfInfo = new TIMGroupBasicSelfInfo();
  
  TIMGroupBaseInfo() {}
  
  TIMGroupBaseInfo(GroupBaseInfo paramGroupBaseInfo)
  {
    setGroupId(paramGroupBaseInfo.getSGroupId());
    try
    {
      setGroupName(new String(paramGroupBaseInfo.getSGroupName(), "utf-8"));
      setFaceUrl(new String(paramGroupBaseInfo.getSFaceUrl(), "utf-8"));
      setGroupType(paramGroupBaseInfo.getSGroupType());
      this.selfInfo = new TIMGroupBasicSelfInfo(paramGroupBaseInfo.getStSelfInfo());
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public String getFaceUrl()
  {
    return this.faceUrl;
  }
  
  public String getGroupId()
  {
    return this.groupId;
  }
  
  public String getGroupName()
  {
    return this.groupName;
  }
  
  public String getGroupType()
  {
    return this.groupType;
  }
  
  public TIMGroupBasicSelfInfo getSelfInfo()
  {
    return this.selfInfo;
  }
  
  void setFaceUrl(String paramString)
  {
    this.faceUrl = paramString;
  }
  
  void setGroupId(String paramString)
  {
    this.groupId = paramString;
  }
  
  void setGroupName(String paramString)
  {
    this.groupName = paramString;
  }
  
  void setGroupType(String paramString)
  {
    this.groupType = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupBaseInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */