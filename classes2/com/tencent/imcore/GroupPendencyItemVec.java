package com.tencent.imcore;

public class GroupPendencyItemVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupPendencyItemVec()
  {
    this(internalJNI.new_GroupPendencyItemVec__SWIG_0(), true);
  }
  
  public GroupPendencyItemVec(long paramLong)
  {
    this(internalJNI.new_GroupPendencyItemVec__SWIG_1(paramLong), true);
  }
  
  protected GroupPendencyItemVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupPendencyItemVec paramGroupPendencyItemVec)
  {
    if (paramGroupPendencyItemVec == null) {
      return 0L;
    }
    return paramGroupPendencyItemVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupPendencyItemVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupPendencyItemVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupPendencyItemVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupPendencyItemVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupPendencyItem get(int paramInt)
  {
    return new GroupPendencyItem(internalJNI.GroupPendencyItemVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupPendencyItem paramGroupPendencyItem)
  {
    internalJNI.GroupPendencyItemVec_pushBack(this.swigCPtr, this, GroupPendencyItem.getCPtr(paramGroupPendencyItem), paramGroupPendencyItem);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupPendencyItemVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupPendencyItem paramGroupPendencyItem)
  {
    internalJNI.GroupPendencyItemVec_set(this.swigCPtr, this, paramInt, GroupPendencyItem.getCPtr(paramGroupPendencyItem), paramGroupPendencyItem);
  }
  
  public long size()
  {
    return internalJNI.GroupPendencyItemVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupPendencyItemVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */