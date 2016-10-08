package com.tencent.imcore;

public class BytesVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesVec()
  {
    this(internalJNI.new_BytesVec__SWIG_0(), true);
  }
  
  public BytesVec(long paramLong)
  {
    this(internalJNI.new_BytesVec__SWIG_1(paramLong), true);
  }
  
  protected BytesVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(BytesVec paramBytesVec)
  {
    if (paramBytesVec == null) {
      return 0L;
    }
    return paramBytesVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.BytesVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.BytesVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_BytesVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.BytesVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] get(int paramInt)
  {
    return internalJNI.BytesVec_get(this.swigCPtr, this, paramInt);
  }
  
  public void pushBack(byte[] paramArrayOfByte)
  {
    internalJNI.BytesVec_pushBack(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.BytesVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, byte[] paramArrayOfByte)
  {
    internalJNI.BytesVec_set(this.swigCPtr, this, paramInt, paramArrayOfByte);
  }
  
  public long size()
  {
    return internalJNI.BytesVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */