package com.tencent;

import com.tencent.imcore.GroupPendencyMeta;

public class TIMGroupPendencyMeta
{
  private long nextStartTimestamp;
  private long reportedTimestamp;
  private long unReadCount;
  
  TIMGroupPendencyMeta(GroupPendencyMeta paramGroupPendencyMeta)
  {
    this.nextStartTimestamp = paramGroupPendencyMeta.getNext_start_time();
    this.reportedTimestamp = paramGroupPendencyMeta.getRead_time_seq();
    this.unReadCount = paramGroupPendencyMeta.getUnread_num();
  }
  
  public long getNextStartTimestamp()
  {
    return this.nextStartTimestamp;
  }
  
  public long getReportedTimestamp()
  {
    return this.reportedTimestamp;
  }
  
  public long getUnReadCount()
  {
    return this.unReadCount;
  }
  
  void setNextStartTimestamp(long paramLong)
  {
    this.nextStartTimestamp = paramLong;
  }
  
  void setReportedTimestamp(long paramLong)
  {
    this.reportedTimestamp = paramLong;
  }
  
  void setUnReadCount(long paramLong)
  {
    this.unReadCount = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupPendencyMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */