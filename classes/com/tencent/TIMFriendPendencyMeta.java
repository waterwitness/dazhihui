package com.tencent;

import com.tencent.imcore.FriendPendencyMeta;

public class TIMFriendPendencyMeta
{
  private long numPerPage;
  private long seq;
  private long timestamp;
  private long unReadCnt;
  
  public TIMFriendPendencyMeta() {}
  
  TIMFriendPendencyMeta(FriendPendencyMeta paramFriendPendencyMeta)
  {
    setNumPerPage(paramFriendPendencyMeta.getDdwNumPerPage());
    setSeq(paramFriendPendencyMeta.getDdwSeq());
    setTimestamp(paramFriendPendencyMeta.getDdwTimestamp());
    setUnReadCnt(paramFriendPendencyMeta.getDdwUnReadCnt());
  }
  
  public long getNumPerPage()
  {
    return this.numPerPage;
  }
  
  public long getSeq()
  {
    return this.seq;
  }
  
  public long getTimestamp()
  {
    return this.timestamp;
  }
  
  public long getUnReadCnt()
  {
    return this.unReadCnt;
  }
  
  public void setNumPerPage(long paramLong)
  {
    this.numPerPage = paramLong;
  }
  
  public void setSeq(long paramLong)
  {
    this.seq = paramLong;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.timestamp = paramLong;
  }
  
  void setUnReadCnt(long paramLong)
  {
    this.unReadCnt = paramLong;
  }
  
  FriendPendencyMeta toFriendPendencyMeta()
  {
    FriendPendencyMeta localFriendPendencyMeta = new FriendPendencyMeta();
    localFriendPendencyMeta.setDdwNumPerPage(getNumPerPage());
    localFriendPendencyMeta.setDdwSeq(getSeq());
    localFriendPendencyMeta.setDdwTimestamp(getTimestamp());
    localFriendPendencyMeta.setDdwUnReadCnt(getUnReadCnt());
    return localFriendPendencyMeta;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendPendencyMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */