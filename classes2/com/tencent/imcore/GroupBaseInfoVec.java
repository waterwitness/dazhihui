package com.tencent.imcore;

public class GroupBaseInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupBaseInfoVec()
  {
    this(internalJNI.new_GroupBaseInfoVec__SWIG_0(), true);
  }
  
  public GroupBaseInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupBaseInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupBaseInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupBaseInfoVec paramGroupBaseInfoVec)
  {
    if (paramGroupBaseInfoVec == null) {
      return 0L;
    }
    return paramGroupBaseInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupBaseInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupBaseInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupBaseInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupBaseInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupBaseInfo get(int paramInt)
  {
    return new GroupBaseInfo(internalJNI.GroupBaseInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupBaseInfo paramGroupBaseInfo)
  {
    internalJNI.GroupBaseInfoVec_pushBack(this.swigCPtr, this, GroupBaseInfo.getCPtr(paramGroupBaseInfo), paramGroupBaseInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupBaseInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupBaseInfo paramGroupBaseInfo)
  {
    internalJNI.GroupBaseInfoVec_set(this.swigCPtr, this, paramInt, GroupBaseInfo.getCPtr(paramGroupBaseInfo), paramGroupBaseInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupBaseInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupBaseInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */