package com.tencent;

import com.tencent.imcore.MemberInfo;

public class TIMGroupSelfInfo
  extends TIMGroupMemberInfo
{
  private long recvOpt;
  
  TIMGroupSelfInfo() {}
  
  TIMGroupSelfInfo(MemberInfo paramMemberInfo)
  {
    super(paramMemberInfo);
    setRecvOpt(paramMemberInfo.getMsg_flag());
  }
  
  public TIMGroupReceiveMessageOpt getRecvOpt()
  {
    if (this.recvOpt == TIMGroupReceiveMessageOpt.ReceiveAndNotify.getValue()) {
      return TIMGroupReceiveMessageOpt.ReceiveAndNotify;
    }
    if (this.recvOpt == TIMGroupReceiveMessageOpt.NotReceive.getValue()) {
      return TIMGroupReceiveMessageOpt.NotReceive;
    }
    if (this.recvOpt == TIMGroupReceiveMessageOpt.ReceiveNotNotify.getValue()) {
      return TIMGroupReceiveMessageOpt.ReceiveNotNotify;
    }
    return null;
  }
  
  void setRecvOpt(long paramLong)
  {
    this.recvOpt = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupSelfInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */