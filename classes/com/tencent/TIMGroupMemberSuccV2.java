package com.tencent;

import java.util.List;

public class TIMGroupMemberSuccV2
{
  private List<TIMGroupMemberInfo> memberInfoList;
  private long nextSeq;
  
  public List<TIMGroupMemberInfo> getMemberInfoList()
  {
    return this.memberInfoList;
  }
  
  public long getNextSeq()
  {
    return this.nextSeq;
  }
  
  void setMemberInfoList(List<TIMGroupMemberInfo> paramList)
  {
    this.memberInfoList = paramList;
  }
  
  void setNextSeq(long paramLong)
  {
    this.nextSeq = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupMemberSuccV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */