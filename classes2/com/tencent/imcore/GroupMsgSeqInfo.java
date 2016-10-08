package com.tencent.imcore;

public class GroupMsgSeqInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupMsgSeqInfo()
  {
    this(internalJNI.new_GroupMsgSeqInfo(), true);
  }
  
  protected GroupMsgSeqInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupMsgSeqInfo paramGroupMsgSeqInfo)
  {
    if (paramGroupMsgSeqInfo == null) {
      return 0L;
    }
    return paramGroupMsgSeqInfo.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_GroupMsgSeqInfo(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public long getReadSeq()
  {
    return internalJNI.GroupMsgSeqInfo_readSeq_get(this.swigCPtr, this);
  }
  
  public long getSvrLatestSeq()
  {
    return internalJNI.GroupMsgSeqInfo_svrLatestSeq_get(this.swigCPtr, this);
  }
  
  public void setReadSeq(long paramLong)
  {
    internalJNI.GroupMsgSeqInfo_readSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSvrLatestSeq(long paramLong)
  {
    internalJNI.GroupMsgSeqInfo_svrLatestSeq_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupMsgSeqInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */