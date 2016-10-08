package com.tencent;

import java.util.ArrayList;
import java.util.List;

public class TIMSNSSystemElem
  extends TIMElem
{
  private long decideReportTimestamp;
  private List<TIMSNSChangeInfo> infoList = new ArrayList();
  private long pendencyReportTimestamp;
  private long recommendReportTimestamp;
  private TIMSNSSystemType subType;
  
  public TIMSNSSystemElem()
  {
    this.type = TIMElemType.SNSTips;
  }
  
  public List<TIMSNSChangeInfo> getChangeInfoList()
  {
    return this.infoList;
  }
  
  public long getDecideReportTimestamp()
  {
    return this.decideReportTimestamp;
  }
  
  public long getPendencyReportTimestamp()
  {
    return this.pendencyReportTimestamp;
  }
  
  public long getRecommendReportTimestamp()
  {
    return this.recommendReportTimestamp;
  }
  
  public TIMSNSSystemType getSubType()
  {
    return this.subType;
  }
  
  void setDecideReportTimestamp(long paramLong)
  {
    this.decideReportTimestamp = paramLong;
  }
  
  void setPendencyReportTimestamp(long paramLong)
  {
    this.pendencyReportTimestamp = paramLong;
  }
  
  void setRecommendReportTimestamp(long paramLong)
  {
    this.recommendReportTimestamp = paramLong;
  }
  
  void setSubType(long paramLong)
  {
    this.subType = TIMSNSSystemType.getType((int)paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMSNSSystemElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */