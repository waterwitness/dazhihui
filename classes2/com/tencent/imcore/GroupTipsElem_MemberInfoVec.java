package com.tencent.imcore;

public class GroupTipsElem_MemberInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupTipsElem_MemberInfoVec()
  {
    this(internalJNI.new_GroupTipsElem_MemberInfoVec__SWIG_0(), true);
  }
  
  public GroupTipsElem_MemberInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupTipsElem_MemberInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupTipsElem_MemberInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec)
  {
    if (paramGroupTipsElem_MemberInfoVec == null) {
      return 0L;
    }
    return paramGroupTipsElem_MemberInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupTipsElem_MemberInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupTipsElem_MemberInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupTipsElem_MemberInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupTipsElem_MemberInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public GroupTipsElem_MemberInfo get(int paramInt)
  {
    return new GroupTipsElem_MemberInfo(internalJNI.GroupTipsElem_MemberInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo)
  {
    internalJNI.GroupTipsElem_MemberInfoVec_pushBack(this.swigCPtr, this, GroupTipsElem_MemberInfo.getCPtr(paramGroupTipsElem_MemberInfo), paramGroupTipsElem_MemberInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupTipsElem_MemberInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo)
  {
    internalJNI.GroupTipsElem_MemberInfoVec_set(this.swigCPtr, this, paramInt, GroupTipsElem_MemberInfo.getCPtr(paramGroupTipsElem_MemberInfo), paramGroupTipsElem_MemberInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupTipsElem_MemberInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupTipsElem_MemberInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */