package com.tencent.imcore;

public class SNSProfileItemVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SNSProfileItemVec()
  {
    this(internalJNI.new_SNSProfileItemVec__SWIG_0(), true);
  }
  
  public SNSProfileItemVec(long paramLong)
  {
    this(internalJNI.new_SNSProfileItemVec__SWIG_1(paramLong), true);
  }
  
  protected SNSProfileItemVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(SNSProfileItemVec paramSNSProfileItemVec)
  {
    if (paramSNSProfileItemVec == null) {
      return 0L;
    }
    return paramSNSProfileItemVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.SNSProfileItemVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.SNSProfileItemVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_SNSProfileItemVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.SNSProfileItemVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public SNSProfileItem get(int paramInt)
  {
    return new SNSProfileItem(internalJNI.SNSProfileItemVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(SNSProfileItem paramSNSProfileItem)
  {
    internalJNI.SNSProfileItemVec_pushBack(this.swigCPtr, this, SNSProfileItem.getCPtr(paramSNSProfileItem), paramSNSProfileItem);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.SNSProfileItemVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, SNSProfileItem paramSNSProfileItem)
  {
    internalJNI.SNSProfileItemVec_set(this.swigCPtr, this, paramInt, SNSProfileItem.getCPtr(paramSNSProfileItem), paramSNSProfileItem);
  }
  
  public long size()
  {
    return internalJNI.SNSProfileItemVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SNSProfileItemVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */