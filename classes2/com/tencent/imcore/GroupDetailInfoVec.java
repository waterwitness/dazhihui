package com.tencent.imcore;

public class GroupDetailInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupDetailInfoVec()
  {
    this(internalJNI.new_GroupDetailInfoVec__SWIG_0(), true);
  }
  
  public GroupDetailInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupDetailInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupDetailInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupDetailInfoVec paramGroupDetailInfoVec)
  {
    if (paramGroupDetailInfoVec == null) {
      return 0L;
    }
    return paramGroupDetailInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupDetailInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupDetailInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupDetailInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupDetailInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupDetailInfo get(int paramInt)
  {
    return new GroupDetailInfo(internalJNI.GroupDetailInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupDetailInfo paramGroupDetailInfo)
  {
    internalJNI.GroupDetailInfoVec_pushBack(this.swigCPtr, this, GroupDetailInfo.getCPtr(paramGroupDetailInfo), paramGroupDetailInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupDetailInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupDetailInfo paramGroupDetailInfo)
  {
    internalJNI.GroupDetailInfoVec_set(this.swigCPtr, this, paramInt, GroupDetailInfo.getCPtr(paramGroupDetailInfo), paramGroupDetailInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupDetailInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupDetailInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */