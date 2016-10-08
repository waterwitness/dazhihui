package com.tencent.imcore;

public class GroupCacheInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupCacheInfoVec()
  {
    this(internalJNI.new_GroupCacheInfoVec__SWIG_0(), true);
  }
  
  public GroupCacheInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupCacheInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupCacheInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupCacheInfoVec paramGroupCacheInfoVec)
  {
    if (paramGroupCacheInfoVec == null) {
      return 0L;
    }
    return paramGroupCacheInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupCacheInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupCacheInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupCacheInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupCacheInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupCacheInfo get(int paramInt)
  {
    return new GroupCacheInfo(internalJNI.GroupCacheInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupCacheInfo paramGroupCacheInfo)
  {
    internalJNI.GroupCacheInfoVec_pushBack(this.swigCPtr, this, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupCacheInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupCacheInfo paramGroupCacheInfo)
  {
    internalJNI.GroupCacheInfoVec_set(this.swigCPtr, this, paramInt, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupCacheInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupCacheInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */