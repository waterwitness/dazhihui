package com.tencent.imcore;

public class StrVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public StrVec()
  {
    this(internalJNI.new_StrVec__SWIG_0(), true);
  }
  
  public StrVec(long paramLong)
  {
    this(internalJNI.new_StrVec__SWIG_1(paramLong), true);
  }
  
  protected StrVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(StrVec paramStrVec)
  {
    if (paramStrVec == null) {
      return 0L;
    }
    return paramStrVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.StrVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.StrVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_StrVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.StrVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public String get(int paramInt)
  {
    return internalJNI.StrVec_get(this.swigCPtr, this, paramInt);
  }
  
  public void pushBack(String paramString)
  {
    internalJNI.StrVec_pushBack(this.swigCPtr, this, paramString);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.StrVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, String paramString)
  {
    internalJNI.StrVec_set(this.swigCPtr, this, paramInt, paramString);
  }
  
  public long size()
  {
    return internalJNI.StrVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\StrVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */