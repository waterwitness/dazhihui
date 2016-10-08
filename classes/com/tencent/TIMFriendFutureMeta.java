package com.tencent;

import com.tencent.imcore.FutureFriendMeta;

public class TIMFriendFutureMeta
{
  private long currentDecideTimestamp = 0L;
  private long currentPendencyTimestamp = 0L;
  private long currentRecommendTimestamp = 0L;
  private long decideSeq = 0L;
  private long decideUnReadCnt = 0L;
  private TIMPageDirectionType directionType = TIMPageDirectionType.TIM_PAGE_DIRECTION_UP_TYPE;
  private long pendencySeq = 0L;
  private long pendencyUnReadCnt = 0L;
  private long recommendSeq = 0L;
  private long recommendUnReadCnt = 0L;
  private long reqNum = 10L;
  private long timestamp = 0L;
  
  public TIMFriendFutureMeta() {}
  
  TIMFriendFutureMeta(FutureFriendMeta paramFutureFriendMeta)
  {
    this.currentPendencyTimestamp = paramFutureFriendMeta.getDdwCurrentPendencyTimestamp();
    this.currentRecommendTimestamp = paramFutureFriendMeta.getDdwCurrentRecommendTimestamp();
    this.currentDecideTimestamp = paramFutureFriendMeta.getDdwCurrentDecideTimestamp();
    this.pendencySeq = paramFutureFriendMeta.getDdwPendencySequence();
    this.pendencyUnReadCnt = paramFutureFriendMeta.getDdwPendencyUnReadCnt();
    this.recommendSeq = paramFutureFriendMeta.getDdwRecommendSequence();
    this.recommendUnReadCnt = paramFutureFriendMeta.getDdwRecommendUnReadCnt();
    this.decideSeq = paramFutureFriendMeta.getDdwDecideSequence();
    this.decideUnReadCnt = paramFutureFriendMeta.getDdwDecideUnreadCnt();
    this.reqNum = paramFutureFriendMeta.getDdwReqNum();
    this.timestamp = paramFutureFriendMeta.getDdwTimestamp();
    this.directionType = TIMPageDirectionType.getType(paramFutureFriendMeta.getIDirection());
  }
  
  public long getCurrentDecideTimestamp()
  {
    return this.currentDecideTimestamp;
  }
  
  public long getCurrentPendencyTimestamp()
  {
    return this.currentPendencyTimestamp;
  }
  
  public long getCurrentRecommendTimestamp()
  {
    return this.currentRecommendTimestamp;
  }
  
  public long getDecideSeq()
  {
    return this.decideSeq;
  }
  
  public long getDecideUnReadCnt()
  {
    return this.decideUnReadCnt;
  }
  
  public TIMPageDirectionType getDirectionType()
  {
    return this.directionType;
  }
  
  FutureFriendMeta getFutureFriendMeta()
  {
    FutureFriendMeta localFutureFriendMeta = new FutureFriendMeta();
    localFutureFriendMeta.setDdwCurrentPendencyTimestamp(this.currentPendencyTimestamp);
    localFutureFriendMeta.setDdwCurrentRecommendTimestamp(this.currentRecommendTimestamp);
    localFutureFriendMeta.setDdwCurrentDecideTimestamp(this.currentDecideTimestamp);
    localFutureFriendMeta.setDdwPendencySequence(this.pendencySeq);
    localFutureFriendMeta.setDdwPendencyUnReadCnt(this.pendencyUnReadCnt);
    localFutureFriendMeta.setDdwRecommendSequence(this.recommendSeq);
    localFutureFriendMeta.setDdwRecommendUnReadCnt(this.recommendUnReadCnt);
    localFutureFriendMeta.setDdwDecideSequence(this.decideSeq);
    localFutureFriendMeta.setDdwDecideUnreadCnt(this.decideUnReadCnt);
    localFutureFriendMeta.setDdwReqNum(this.reqNum);
    localFutureFriendMeta.setDdwTimestamp(this.timestamp);
    localFutureFriendMeta.setIDirection(this.directionType.getValue());
    return localFutureFriendMeta;
  }
  
  public long getPendencySeq()
  {
    return this.pendencySeq;
  }
  
  public long getPendencyUnReadCnt()
  {
    return this.pendencyUnReadCnt;
  }
  
  public long getRecommendSeq()
  {
    return this.recommendSeq;
  }
  
  public long getRecommendUnReadCnt()
  {
    return this.recommendUnReadCnt;
  }
  
  public long getReqNum()
  {
    return this.reqNum;
  }
  
  public long getTimestamp()
  {
    return this.timestamp;
  }
  
  void setCurrentDecideTimestamp(long paramLong)
  {
    this.currentDecideTimestamp = paramLong;
  }
  
  void setCurrentPendencyTimestamp(long paramLong)
  {
    this.currentPendencyTimestamp = paramLong;
  }
  
  void setCurrentRecommendTimestamp(long paramLong)
  {
    this.currentRecommendTimestamp = paramLong;
  }
  
  public void setDecideSeq(long paramLong)
  {
    this.decideSeq = paramLong;
  }
  
  public void setDirectionType(TIMPageDirectionType paramTIMPageDirectionType)
  {
    this.directionType = paramTIMPageDirectionType;
  }
  
  public void setPendencySeq(long paramLong)
  {
    this.pendencySeq = paramLong;
  }
  
  public void setRecommendSeq(long paramLong)
  {
    this.recommendSeq = paramLong;
  }
  
  public void setReqNum(long paramLong)
  {
    if (paramLong > 30L)
    {
      this.reqNum = 30L;
      return;
    }
    if (paramLong < 0L)
    {
      this.reqNum = 10L;
      return;
    }
    this.reqNum = paramLong;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.timestamp = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendFutureMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */