package com.tencent.imcore;

public class BytesProfileMap
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesProfileMap()
  {
    this(internalJNI.new_BytesProfileMap__SWIG_0(), true);
  }
  
  protected BytesProfileMap(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public BytesProfileMap(BytesProfileMap paramBytesProfileMap)
  {
    this(internalJNI.new_BytesProfileMap__SWIG_1(getCPtr(paramBytesProfileMap), paramBytesProfileMap), true);
  }
  
  protected static long getCPtr(BytesProfileMap paramBytesProfileMap)
  {
    if (paramBytesProfileMap == null) {
      return 0L;
    }
    return paramBytesProfileMap.swigCPtr;
  }
  
  public void clear()
  {
    internalJNI.BytesProfileMap_clear(this.swigCPtr, this);
  }
  
  public void del(byte[] paramArrayOfByte)
  {
    internalJNI.BytesProfileMap_del(this.swigCPtr, this, paramArrayOfByte);
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
          internalJNI.delete_BytesProfileMap(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.BytesProfileMap_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendProfile get(byte[] paramArrayOfByte)
  {
    return new FriendProfile(internalJNI.BytesProfileMap_get(this.swigCPtr, this, paramArrayOfByte), false);
  }
  
  public boolean hasKey(byte[] paramArrayOfByte)
  {
    return internalJNI.BytesProfileMap_hasKey(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void set(byte[] paramArrayOfByte, FriendProfile paramFriendProfile)
  {
    internalJNI.BytesProfileMap_set(this.swigCPtr, this, paramArrayOfByte, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public long size()
  {
    return internalJNI.BytesProfileMap_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesProfileMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */