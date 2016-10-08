package com.tencent.imcore;

public class FriendPendencyMeta
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendPendencyMeta()
  {
    this(internalJNI.new_FriendPendencyMeta(), true);
  }
  
  protected FriendPendencyMeta(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendPendencyMeta paramFriendPendencyMeta)
  {
    if (paramFriendPendencyMeta == null) {
      return 0L;
    }
    return paramFriendPendencyMeta.swigCPtr;
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
          internalJNI.delete_FriendPendencyMeta(this.swigCPtr);
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
  
  public long getDdwNumPerPage()
  {
    return internalJNI.FriendPendencyMeta_ddwNumPerPage_get(this.swigCPtr, this);
  }
  
  public long getDdwSeq()
  {
    return internalJNI.FriendPendencyMeta_ddwSeq_get(this.swigCPtr, this);
  }
  
  public long getDdwTimestamp()
  {
    return internalJNI.FriendPendencyMeta_ddwTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwUnReadCnt()
  {
    return internalJNI.FriendPendencyMeta_ddwUnReadCnt_get(this.swigCPtr, this);
  }
  
  public void setDdwNumPerPage(long paramLong)
  {
    internalJNI.FriendPendencyMeta_ddwNumPerPage_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwSeq(long paramLong)
  {
    internalJNI.FriendPendencyMeta_ddwSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwTimestamp(long paramLong)
  {
    internalJNI.FriendPendencyMeta_ddwTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwUnReadCnt(long paramLong)
  {
    internalJNI.FriendPendencyMeta_ddwUnReadCnt_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendPendencyMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */