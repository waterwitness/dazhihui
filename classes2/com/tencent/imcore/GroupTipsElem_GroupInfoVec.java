package com.tencent.imcore;

public class GroupTipsElem_GroupInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupTipsElem_GroupInfoVec()
  {
    this(internalJNI.new_GroupTipsElem_GroupInfoVec__SWIG_0(), true);
  }
  
  public GroupTipsElem_GroupInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupTipsElem_GroupInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupTipsElem_GroupInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec)
  {
    if (paramGroupTipsElem_GroupInfoVec == null) {
      return 0L;
    }
    return paramGroupTipsElem_GroupInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupTipsElem_GroupInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupTipsElem_GroupInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupTipsElem_GroupInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupTipsElem_GroupInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupTipsElem_GroupInfo get(int paramInt)
  {
    return new GroupTipsElem_GroupInfo(internalJNI.GroupTipsElem_GroupInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo)
  {
    internalJNI.GroupTipsElem_GroupInfoVec_pushBack(this.swigCPtr, this, GroupTipsElem_GroupInfo.getCPtr(paramGroupTipsElem_GroupInfo), paramGroupTipsElem_GroupInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupTipsElem_GroupInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo)
  {
    internalJNI.GroupTipsElem_GroupInfoVec_set(this.swigCPtr, this, paramInt, GroupTipsElem_GroupInfo.getCPtr(paramGroupTipsElem_GroupInfo), paramGroupTipsElem_GroupInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupTipsElem_GroupInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupTipsElem_GroupInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */