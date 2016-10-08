package com.tencent.imcore;

public class GroupMemberInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupMemberInfoVec()
  {
    this(internalJNI.new_GroupMemberInfoVec__SWIG_0(), true);
  }
  
  public GroupMemberInfoVec(long paramLong)
  {
    this(internalJNI.new_GroupMemberInfoVec__SWIG_1(paramLong), true);
  }
  
  protected GroupMemberInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if (paramGroupMemberInfoVec == null) {
      return 0L;
    }
    return paramGroupMemberInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupMemberInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupMemberInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupMemberInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupMemberInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public MemberInfo get(int paramInt)
  {
    return new MemberInfo(internalJNI.GroupMemberInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(MemberInfo paramMemberInfo)
  {
    internalJNI.GroupMemberInfoVec_pushBack(this.swigCPtr, this, MemberInfo.getCPtr(paramMemberInfo), paramMemberInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupMemberInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, MemberInfo paramMemberInfo)
  {
    internalJNI.GroupMemberInfoVec_set(this.swigCPtr, this, paramInt, MemberInfo.getCPtr(paramMemberInfo), paramMemberInfo);
  }
  
  public long size()
  {
    return internalJNI.GroupMemberInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupMemberInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */