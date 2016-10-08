package com.tencent.imcore;

public class IBatchOprCallback$BatchOprDetailInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IBatchOprCallback$BatchOprDetailInfo()
  {
    this(internalJNI.new_IBatchOprCallback_BatchOprDetailInfo(), true);
  }
  
  protected IBatchOprCallback$BatchOprDetailInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(BatchOprDetailInfo paramBatchOprDetailInfo)
  {
    if (paramBatchOprDetailInfo == null) {
      return 0L;
    }
    return paramBatchOprDetailInfo.swigCPtr;
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
          internalJNI.delete_IBatchOprCallback_BatchOprDetailInfo(this.swigCPtr);
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
  
  public ErrInfoVec getErrs()
  {
    long l = internalJNI.IBatchOprCallback_BatchOprDetailInfo_errs_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new ErrInfoVec(l, false);
  }
  
  public long getFail_num()
  {
    return internalJNI.IBatchOprCallback_BatchOprDetailInfo_fail_num_get(this.swigCPtr, this);
  }
  
  public long getSucc_num()
  {
    return internalJNI.IBatchOprCallback_BatchOprDetailInfo_succ_num_get(this.swigCPtr, this);
  }
  
  public void setErrs(ErrInfoVec paramErrInfoVec)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_errs_set(this.swigCPtr, this, ErrInfoVec.getCPtr(paramErrInfoVec), paramErrInfoVec);
  }
  
  public void setFail_num(long paramLong)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_fail_num_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSucc_num(long paramLong)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_succ_num_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IBatchOprCallback$BatchOprDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */