package com.tencent;

import com.tencent.imcore.GroupSettings;

public class TIMGroupSettings
{
  TIMGroupSettings.Options groupInfoOptions = new TIMGroupSettings.Options(this);
  TIMGroupSettings.Options memberInfoOptions = new TIMGroupSettings.Options(this);
  
  GroupSettings convert(GroupSettings paramGroupSettings)
  {
    paramGroupSettings.setGroupInfoOpt(this.groupInfoOptions.convert());
    paramGroupSettings.setMemberInfoOpt(this.memberInfoOptions.convert());
    return paramGroupSettings;
  }
  
  public void setGroupInfoOptions(TIMGroupSettings.Options paramOptions)
  {
    this.groupInfoOptions = paramOptions;
  }
  
  public void setMemberInfoOptions(TIMGroupSettings.Options paramOptions)
  {
    this.memberInfoOptions = paramOptions;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */