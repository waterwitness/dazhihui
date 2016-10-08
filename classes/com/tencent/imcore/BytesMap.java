package com.tencent.imcore;

public class BytesMap
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesMap()
  {
    this(internalJNI.new_BytesMap__SWIG_0(), true);
  }
  
  protected BytesMap(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public BytesMap(BytesMap paramBytesMap)
  {
    this(internalJNI.new_BytesMap__SWIG_1(getCPtr(paramBytesMap), paramBytesMap), true);
  }
  
  protected static long getCPtr(BytesMap paramBytesMap)
  {
    if (paramBytesMap == null) {
      return 0L;
    }
    return paramBytesMap.swigCPtr;
  }
  
  public void clear()
  {
    internalJNI.BytesMap_clear(this.swigCPtr, this);
  }
  
  public void del(byte[] paramArrayOfByte)
  {
    internalJNI.BytesMap_del(this.swigCPtr, this, paramArrayOfByte);
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
          internalJNI.delete_BytesMap(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.BytesMap_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] get(byte[] paramArrayOfByte)
  {
    return internalJNI.BytesMap_get(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public boolean hasKey(byte[] paramArrayOfByte)
  {
    return internalJNI.BytesMap_hasKey(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void set(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    internalJNI.BytesMap_set(this.swigCPtr, this, paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public long size()
  {
    return internalJNI.BytesMap_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */