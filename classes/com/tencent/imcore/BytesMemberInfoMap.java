package com.tencent.imcore;

public class BytesMemberInfoMap
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesMemberInfoMap()
  {
    this(internalJNI.new_BytesMemberInfoMap__SWIG_0(), true);
  }
  
  protected BytesMemberInfoMap(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public BytesMemberInfoMap(BytesMemberInfoMap paramBytesMemberInfoMap)
  {
    this(internalJNI.new_BytesMemberInfoMap__SWIG_1(getCPtr(paramBytesMemberInfoMap), paramBytesMemberInfoMap), true);
  }
  
  protected static long getCPtr(BytesMemberInfoMap paramBytesMemberInfoMap)
  {
    if (paramBytesMemberInfoMap == null) {
      return 0L;
    }
    return paramBytesMemberInfoMap.swigCPtr;
  }
  
  public void clear()
  {
    internalJNI.BytesMemberInfoMap_clear(this.swigCPtr, this);
  }
  
  public void del(byte[] paramArrayOfByte)
  {
    internalJNI.BytesMemberInfoMap_del(this.swigCPtr, this, paramArrayOfByte);
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
          internalJNI.delete_BytesMemberInfoMap(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.BytesMemberInfoMap_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public NewGroupMemberInfo get(byte[] paramArrayOfByte)
  {
    return new NewGroupMemberInfo(internalJNI.BytesMemberInfoMap_get(this.swigCPtr, this, paramArrayOfByte), false);
  }
  
  public boolean hasKey(byte[] paramArrayOfByte)
  {
    return internalJNI.BytesMemberInfoMap_hasKey(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void set(byte[] paramArrayOfByte, NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    internalJNI.BytesMemberInfoMap_set(this.swigCPtr, this, paramArrayOfByte, NewGroupMemberInfo.getCPtr(paramNewGroupMemberInfo), paramNewGroupMemberInfo);
  }
  
  public long size()
  {
    return internalJNI.BytesMemberInfoMap_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesMemberInfoMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */