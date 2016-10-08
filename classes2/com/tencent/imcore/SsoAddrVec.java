package com.tencent.imcore;

public class SsoAddrVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SsoAddrVec()
  {
    this(internalJNI.new_SsoAddrVec__SWIG_0(), true);
  }
  
  public SsoAddrVec(long paramLong)
  {
    this(internalJNI.new_SsoAddrVec__SWIG_1(paramLong), true);
  }
  
  protected SsoAddrVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(SsoAddrVec paramSsoAddrVec)
  {
    if (paramSsoAddrVec == null) {
      return 0L;
    }
    return paramSsoAddrVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.SsoAddrVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.SsoAddrVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_SsoAddrVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.SsoAddrVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public SsoAddr get(int paramInt)
  {
    return new SsoAddr(internalJNI.SsoAddrVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(SsoAddr paramSsoAddr)
  {
    internalJNI.SsoAddrVec_pushBack(this.swigCPtr, this, SsoAddr.getCPtr(paramSsoAddr), paramSsoAddr);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.SsoAddrVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, SsoAddr paramSsoAddr)
  {
    internalJNI.SsoAddrVec_set(this.swigCPtr, this, paramInt, SsoAddr.getCPtr(paramSsoAddr), paramSsoAddr);
  }
  
  public long size()
  {
    return internalJNI.SsoAddrVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SsoAddrVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */