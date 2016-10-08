package com.tencent.imcore;

public class ErrInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ErrInfoVec()
  {
    this(internalJNI.new_ErrInfoVec__SWIG_0(), true);
  }
  
  public ErrInfoVec(long paramLong)
  {
    this(internalJNI.new_ErrInfoVec__SWIG_1(paramLong), true);
  }
  
  protected ErrInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ErrInfoVec paramErrInfoVec)
  {
    if (paramErrInfoVec == null) {
      return 0L;
    }
    return paramErrInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.ErrInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.ErrInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_ErrInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.ErrInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public IBatchOprCallback.BatchOprDetailInfo.ErrInfo get(int paramInt)
  {
    return new IBatchOprCallback.BatchOprDetailInfo.ErrInfo(internalJNI.ErrInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo)
  {
    internalJNI.ErrInfoVec_pushBack(this.swigCPtr, this, IBatchOprCallback.BatchOprDetailInfo.ErrInfo.getCPtr(paramErrInfo), paramErrInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.ErrInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo)
  {
    internalJNI.ErrInfoVec_set(this.swigCPtr, this, paramInt, IBatchOprCallback.BatchOprDetailInfo.ErrInfo.getCPtr(paramErrInfo), paramErrInfo);
  }
  
  public long size()
  {
    return internalJNI.ErrInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\ErrInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */