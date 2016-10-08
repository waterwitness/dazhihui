package com.tencent.imcore;

public class FriendMetaInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendMetaInfo()
  {
    this(internalJNI.new_FriendMetaInfo(), true);
  }
  
  protected FriendMetaInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendMetaInfo paramFriendMetaInfo)
  {
    if (paramFriendMetaInfo == null) {
      return 0L;
    }
    return paramFriendMetaInfo.swigCPtr;
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
          internalJNI.delete_FriendMetaInfo(this.swigCPtr);
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
  
  public long getDdwInfoSeq()
  {
    return internalJNI.FriendMetaInfo_ddwInfoSeq_get(this.swigCPtr, this);
  }
  
  public long getDdwNextSeq()
  {
    return internalJNI.FriendMetaInfo_ddwNextSeq_get(this.swigCPtr, this);
  }
  
  public long getDdwTimestamp()
  {
    return internalJNI.FriendMetaInfo_ddwTimestamp_get(this.swigCPtr, this);
  }
  
  public boolean getRecover()
  {
    return internalJNI.FriendMetaInfo_recover_get(this.swigCPtr, this);
  }
  
  public void setDdwInfoSeq(long paramLong)
  {
    internalJNI.FriendMetaInfo_ddwInfoSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwNextSeq(long paramLong)
  {
    internalJNI.FriendMetaInfo_ddwNextSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwTimestamp(long paramLong)
  {
    internalJNI.FriendMetaInfo_ddwTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setRecover(boolean paramBoolean)
  {
    internalJNI.FriendMetaInfo_recover_set(this.swigCPtr, this, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendMetaInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */