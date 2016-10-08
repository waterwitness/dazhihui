package com.tencent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TIMGroupManager$CreateGroupParam
{
  TIMGroupAddOpt addOption;
  Map<String, byte[]> customInfo = new HashMap();
  String faceUrl;
  String groupId;
  String groupName;
  String groupType;
  String introduction;
  long maxMemberNum = 0L;
  List<TIMGroupMemberInfo> members;
  String notification;
  
  public TIMGroupManager$CreateGroupParam(TIMGroupManager paramTIMGroupManager) {}
  
  public void setAddOption(TIMGroupAddOpt paramTIMGroupAddOpt)
  {
    this.addOption = paramTIMGroupAddOpt;
  }
  
  public void setCustomInfo(String paramString, byte[] paramArrayOfByte)
  {
    this.customInfo.put(paramString, paramArrayOfByte);
  }
  
  public void setFaceUrl(String paramString)
  {
    this.faceUrl = paramString;
  }
  
  public void setGroupId(String paramString)
  {
    this.groupId = paramString;
  }
  
  public void setGroupName(String paramString)
  {
    this.groupName = paramString;
  }
  
  public void setGroupType(String paramString)
  {
    this.groupType = paramString;
  }
  
  public void setIntroduction(String paramString)
  {
    this.introduction = paramString;
  }
  
  public void setMaxMemberNum(long paramLong)
  {
    this.maxMemberNum = paramLong;
  }
  
  public void setMembers(List<TIMGroupMemberInfo> paramList)
  {
    this.members = paramList;
  }
  
  public void setNotification(String paramString)
  {
    this.notification = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$CreateGroupParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */