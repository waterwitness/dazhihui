package com.tencent.imcore;

public class GroupMemberResultVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupMemberResultVec()
  {
    this(internalJNI.new_GroupMemberResultVec__SWIG_0(), true);
  }
  
  public GroupMemberResultVec(long paramLong)
  {
    this(internalJNI.new_GroupMemberResultVec__SWIG_1(paramLong), true);
  }
  
  protected GroupMemberResultVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupMemberResultVec paramGroupMemberResultVec)
  {
    if (paramGroupMemberResultVec == null) {
      return 0L;
    }
    return paramGroupMemberResultVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.GroupMemberResultVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.GroupMemberResultVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_GroupMemberResultVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.GroupMemberResultVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public MemberResult get(int paramInt)
  {
    return new MemberResult(internalJNI.GroupMemberResultVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(MemberResult paramMemberResult)
  {
    internalJNI.GroupMemberResultVec_pushBack(this.swigCPtr, this, MemberResult.getCPtr(paramMemberResult), paramMemberResult);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.GroupMemberResultVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, MemberResult paramMemberResult)
  {
    internalJNI.GroupMemberResultVec_set(this.swigCPtr, this, paramInt, MemberResult.getCPtr(paramMemberResult), paramMemberResult);
  }
  
  public long size()
  {
    return internalJNI.GroupMemberResultVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupMemberResultVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */