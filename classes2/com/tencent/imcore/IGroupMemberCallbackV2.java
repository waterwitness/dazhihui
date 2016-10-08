package com.tencent.imcore;

public class IGroupMemberCallbackV2
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupMemberCallbackV2()
  {
    this(internalJNI.new_IGroupMemberCallbackV2(), true);
    internalJNI.IGroupMemberCallbackV2_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupMemberCallbackV2(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupMemberCallbackV2 paramIGroupMemberCallbackV2)
  {
    if (paramIGroupMemberCallbackV2 == null) {
      return 0L;
    }
    return paramIGroupMemberCallbackV2.swigCPtr;
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
          internalJNI.delete_IGroupMemberCallbackV2(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if (getClass() == IGroupMemberCallbackV2.class)
    {
      internalJNI.IGroupMemberCallbackV2_done(this.swigCPtr, this, paramLong, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
      return;
    }
    internalJNI.IGroupMemberCallbackV2_doneSwigExplicitIGroupMemberCallbackV2(this.swigCPtr, this, paramLong, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupMemberCallbackV2.class)
    {
      internalJNI.IGroupMemberCallbackV2_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupMemberCallbackV2_failSwigExplicitIGroupMemberCallbackV2(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IGroupMemberCallbackV2_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupMemberCallbackV2_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupMemberCallbackV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */