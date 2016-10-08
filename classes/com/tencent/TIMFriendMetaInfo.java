package com.tencent;

public class TIMFriendMetaInfo
{
  private long infoSeq;
  private long nextSeq;
  private boolean recover;
  private long timestamp;
  
  public long getInfoSeq()
  {
    return this.infoSeq;
  }
  
  public long getNextSeq()
  {
    return this.nextSeq;
  }
  
  public long getTimestamp()
  {
    return this.timestamp;
  }
  
  public boolean isRecover()
  {
    return this.recover;
  }
  
  public void setInfoSeq(long paramLong)
  {
    this.infoSeq = paramLong;
  }
  
  public void setNextSeq(long paramLong)
  {
    this.nextSeq = paramLong;
  }
  
  public void setRecover(boolean paramBoolean)
  {
    this.recover = paramBoolean;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.timestamp = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendMetaInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */