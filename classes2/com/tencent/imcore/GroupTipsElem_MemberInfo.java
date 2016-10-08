package com.tencent.imcore;

public class GroupTipsElem_MemberInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupTipsElem_MemberInfo()
  {
    this(internalJNI.new_GroupTipsElem_MemberInfo(), true);
  }
  
  protected GroupTipsElem_MemberInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupTipsElem_MemberInfo paramGroupTipsElem_MemberInfo)
  {
    if (paramGroupTipsElem_MemberInfo == null) {
      return 0L;
    }
    return paramGroupTipsElem_MemberInfo.swigCPtr;
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
          internalJNI.delete_GroupTipsElem_MemberInfo(this.swigCPtr);
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
  
  public String getIdentifier()
  {
    return internalJNI.GroupTipsElem_MemberInfo_identifier_get(this.swigCPtr, this);
  }
  
  public long getShutup_time()
  {
    return internalJNI.GroupTipsElem_MemberInfo_shutup_time_get(this.swigCPtr, this);
  }
  
  public void setIdentifier(String paramString)
  {
    internalJNI.GroupTipsElem_MemberInfo_identifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setShutup_time(long paramLong)
  {
    internalJNI.GroupTipsElem_MemberInfo_shutup_time_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupTipsElem_MemberInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */