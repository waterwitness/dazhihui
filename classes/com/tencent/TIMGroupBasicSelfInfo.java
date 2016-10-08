package com.tencent;

import com.tencent.imcore.GroupSelfInfo;

public class TIMGroupBasicSelfInfo
{
  private long joinTime;
  private TIMGroupReceiveMessageOpt recvMsgOption = TIMGroupReceiveMessageOpt.ReceiveAndNotify;
  private TIMGroupMemberRoleType role = TIMGroupMemberRoleType.NotMember;
  
  TIMGroupBasicSelfInfo() {}
  
  TIMGroupBasicSelfInfo(GroupSelfInfo paramGroupSelfInfo)
  {
    if (paramGroupSelfInfo == null) {}
    for (;;)
    {
      return;
      setRole(paramGroupSelfInfo.getRole());
      setJoinTime(paramGroupSelfInfo.getJoinTime());
      TIMGroupReceiveMessageOpt[] arrayOfTIMGroupReceiveMessageOpt = TIMGroupReceiveMessageOpt.values();
      int j = arrayOfTIMGroupReceiveMessageOpt.length;
      int i = 0;
      while (i < j)
      {
        TIMGroupReceiveMessageOpt localTIMGroupReceiveMessageOpt = arrayOfTIMGroupReceiveMessageOpt[i];
        if (localTIMGroupReceiveMessageOpt.getValue() == paramGroupSelfInfo.getDwMsgFalg()) {
          setRecvMsgOption(localTIMGroupReceiveMessageOpt);
        }
        i += 1;
      }
    }
  }
  
  public long getJoinTime()
  {
    return this.joinTime;
  }
  
  public TIMGroupReceiveMessageOpt getRecvMsgOption()
  {
    return this.recvMsgOption;
  }
  
  public TIMGroupMemberRoleType getRole()
  {
    return this.role;
  }
  
  void setJoinTime(long paramLong)
  {
    this.joinTime = paramLong;
  }
  
  void setRecvMsgOption(TIMGroupReceiveMessageOpt paramTIMGroupReceiveMessageOpt)
  {
    this.recvMsgOption = paramTIMGroupReceiveMessageOpt;
  }
  
  void setRole(long paramLong)
  {
    TIMGroupMemberRoleType[] arrayOfTIMGroupMemberRoleType = TIMGroupMemberRoleType.values();
    int j = arrayOfTIMGroupMemberRoleType.length;
    int i = 0;
    while (i < j)
    {
      TIMGroupMemberRoleType localTIMGroupMemberRoleType = arrayOfTIMGroupMemberRoleType[i];
      if (paramLong == localTIMGroupMemberRoleType.getValue())
      {
        this.role = localTIMGroupMemberRoleType;
        return;
      }
      i += 1;
    }
    this.role = TIMGroupMemberRoleType.NotMember;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupBasicSelfInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */