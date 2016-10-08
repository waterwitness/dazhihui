package com.tencent;

import com.tencent.imcore.GroupCacheInfo;

public class TIMGroupCacheInfo
{
  private TIMGroupDetailInfo groupInfo;
  private TIMGroupBasicSelfInfo selfInfo;
  
  TIMGroupCacheInfo() {}
  
  TIMGroupCacheInfo(GroupCacheInfo paramGroupCacheInfo)
  {
    if (paramGroupCacheInfo == null) {
      return;
    }
    setGroupInfo(new TIMGroupDetailInfo(paramGroupCacheInfo.getGroupInfo()));
    setSelfInfo(new TIMGroupBasicSelfInfo(paramGroupCacheInfo.getSelfInfo()));
  }
  
  public TIMGroupDetailInfo getGroupInfo()
  {
    return this.groupInfo;
  }
  
  public TIMGroupBasicSelfInfo getSelfInfo()
  {
    return this.selfInfo;
  }
  
  void setGroupInfo(TIMGroupDetailInfo paramTIMGroupDetailInfo)
  {
    this.groupInfo = paramTIMGroupDetailInfo;
  }
  
  void setSelfInfo(TIMGroupBasicSelfInfo paramTIMGroupBasicSelfInfo)
  {
    this.selfInfo = paramTIMGroupBasicSelfInfo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupCacheInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */