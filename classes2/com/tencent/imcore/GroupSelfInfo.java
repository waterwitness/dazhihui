package com.tencent.imcore;

public class GroupSelfInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupSelfInfo()
  {
    this(internalJNI.new_GroupSelfInfo__SWIG_0(), true);
  }
  
  protected GroupSelfInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public GroupSelfInfo(MemberInfo paramMemberInfo)
  {
    this(internalJNI.new_GroupSelfInfo__SWIG_1(MemberInfo.getCPtr(paramMemberInfo), paramMemberInfo), true);
  }
  
  protected static long getCPtr(GroupSelfInfo paramGroupSelfInfo)
  {
    if (paramGroupSelfInfo == null) {
      return 0L;
    }
    return paramGroupSelfInfo.swigCPtr;
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
          internalJNI.delete_GroupSelfInfo(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public long getDwMsgFalg()
  {
    return internalJNI.GroupSelfInfo_dwMsgFalg_get(this.swigCPtr, this);
  }
  
  public long getJoinTime()
  {
    return internalJNI.GroupSelfInfo_joinTime_get(this.swigCPtr, this);
  }
  
  public long getRole()
  {
    return internalJNI.GroupSelfInfo_role_get(this.swigCPtr, this);
  }
  
  public long getUnreadNum()
  {
    return internalJNI.GroupSelfInfo_unreadNum_get(this.swigCPtr, this);
  }
  
  public void setDwMsgFalg(long paramLong)
  {
    internalJNI.GroupSelfInfo_dwMsgFalg_set(this.swigCPtr, this, paramLong);
  }
  
  public void setJoinTime(long paramLong)
  {
    internalJNI.GroupSelfInfo_joinTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setRole(long paramLong)
  {
    internalJNI.GroupSelfInfo_role_set(this.swigCPtr, this, paramLong);
  }
  
  public void setUnreadNum(long paramLong)
  {
    internalJNI.GroupSelfInfo_unreadNum_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupSelfInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */