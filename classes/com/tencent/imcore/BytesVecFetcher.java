package com.tencent.imcore;

public class BytesVecFetcher
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected BytesVecFetcher(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public BytesVecFetcher(BytesVec paramBytesVec)
  {
    this(internalJNI.new_BytesVecFetcher(BytesVec.getCPtr(paramBytesVec), paramBytesVec), true);
  }
  
  protected static long getCPtr(BytesVecFetcher paramBytesVecFetcher)
  {
    if (paramBytesVecFetcher == null) {
      return 0L;
    }
    return paramBytesVecFetcher.swigCPtr;
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
          internalJNI.delete_BytesVecFetcher(this.swigCPtr);
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
  
  public byte[] getBytesByIndex(int paramInt)
  {
    return internalJNI.BytesVecFetcher_getBytesByIndex(this.swigCPtr, this, paramInt);
  }
  
  public BytesVec getValues()
  {
    long l = internalJNI.BytesVecFetcher_values_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesVec(l, false);
  }
  
  public void setValues(BytesVec paramBytesVec)
  {
    internalJNI.BytesVecFetcher_values_set(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesVecFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */