package com.tencent.imcore;

public class FutureFriendMeta
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FutureFriendMeta()
  {
    this(internalJNI.new_FutureFriendMeta(), true);
  }
  
  protected FutureFriendMeta(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FutureFriendMeta paramFutureFriendMeta)
  {
    if (paramFutureFriendMeta == null) {
      return 0L;
    }
    return paramFutureFriendMeta.swigCPtr;
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
          internalJNI.delete_FutureFriendMeta(this.swigCPtr);
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
  
  public long getDdwCurrentDecideTimestamp()
  {
    return internalJNI.FutureFriendMeta_ddwCurrentDecideTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwCurrentPendencyTimestamp()
  {
    return internalJNI.FutureFriendMeta_ddwCurrentPendencyTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwCurrentRecommendTimestamp()
  {
    return internalJNI.FutureFriendMeta_ddwCurrentRecommendTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwDecideSequence()
  {
    return internalJNI.FutureFriendMeta_ddwDecideSequence_get(this.swigCPtr, this);
  }
  
  public long getDdwDecideUnreadCnt()
  {
    return internalJNI.FutureFriendMeta_ddwDecideUnreadCnt_get(this.swigCPtr, this);
  }
  
  public long getDdwPendencySequence()
  {
    return internalJNI.FutureFriendMeta_ddwPendencySequence_get(this.swigCPtr, this);
  }
  
  public long getDdwPendencyUnReadCnt()
  {
    return internalJNI.FutureFriendMeta_ddwPendencyUnReadCnt_get(this.swigCPtr, this);
  }
  
  public long getDdwRecommendSequence()
  {
    return internalJNI.FutureFriendMeta_ddwRecommendSequence_get(this.swigCPtr, this);
  }
  
  public long getDdwRecommendUnReadCnt()
  {
    return internalJNI.FutureFriendMeta_ddwRecommendUnReadCnt_get(this.swigCPtr, this);
  }
  
  public long getDdwReqNum()
  {
    return internalJNI.FutureFriendMeta_ddwReqNum_get(this.swigCPtr, this);
  }
  
  public long getDdwTimestamp()
  {
    return internalJNI.FutureFriendMeta_ddwTimestamp_get(this.swigCPtr, this);
  }
  
  public int getIDirection()
  {
    return internalJNI.FutureFriendMeta_iDirection_get(this.swigCPtr, this);
  }
  
  public void setDdwCurrentDecideTimestamp(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwCurrentDecideTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwCurrentPendencyTimestamp(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwCurrentPendencyTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwCurrentRecommendTimestamp(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwCurrentRecommendTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwDecideSequence(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwDecideSequence_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwDecideUnreadCnt(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwDecideUnreadCnt_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwPendencySequence(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwPendencySequence_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwPendencyUnReadCnt(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwPendencyUnReadCnt_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwRecommendSequence(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwRecommendSequence_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwRecommendUnReadCnt(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwRecommendUnReadCnt_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwReqNum(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwReqNum_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwTimestamp(long paramLong)
  {
    internalJNI.FutureFriendMeta_ddwTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setIDirection(int paramInt)
  {
    internalJNI.FutureFriendMeta_iDirection_set(this.swigCPtr, this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FutureFriendMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */