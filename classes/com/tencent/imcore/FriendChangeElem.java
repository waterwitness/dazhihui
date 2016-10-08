package com.tencent.imcore;

public class FriendChangeElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendChangeElem()
  {
    this(internalJNI.new_FriendChangeElem(), true);
  }
  
  protected FriendChangeElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendChangeElem paramFriendChangeElem)
  {
    if (paramFriendChangeElem == null) {
      return 0L;
    }
    return paramFriendChangeElem.swigCPtr;
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
          internalJNI.delete_FriendChangeElem(this.swigCPtr);
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
  
  public long getDdwDecideReportTimestamp()
  {
    return internalJNI.FriendChangeElem_ddwDecideReportTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwPendencyReportTimestamp()
  {
    return internalJNI.FriendChangeElem_ddwPendencyReportTimestamp_get(this.swigCPtr, this);
  }
  
  public long getDdwRecommendReportTimestamp()
  {
    return internalJNI.FriendChangeElem_ddwRecommendReportTimestamp_get(this.swigCPtr, this);
  }
  
  public long getType()
  {
    return internalJNI.FriendChangeElem_type_get(this.swigCPtr, this);
  }
  
  public FriendChangeInfoVec getUsers()
  {
    long l = internalJNI.FriendChangeElem_users_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendChangeInfoVec(l, false);
  }
  
  public void setDdwDecideReportTimestamp(long paramLong)
  {
    internalJNI.FriendChangeElem_ddwDecideReportTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwPendencyReportTimestamp(long paramLong)
  {
    internalJNI.FriendChangeElem_ddwPendencyReportTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDdwRecommendReportTimestamp(long paramLong)
  {
    internalJNI.FriendChangeElem_ddwRecommendReportTimestamp_set(this.swigCPtr, this, paramLong);
  }
  
  public void setType(long paramLong)
  {
    internalJNI.FriendChangeElem_type_set(this.swigCPtr, this, paramLong);
  }
  
  public void setUsers(FriendChangeInfoVec paramFriendChangeInfoVec)
  {
    internalJNI.FriendChangeElem_users_set(this.swigCPtr, this, FriendChangeInfoVec.getCPtr(paramFriendChangeInfoVec), paramFriendChangeInfoVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendChangeElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */