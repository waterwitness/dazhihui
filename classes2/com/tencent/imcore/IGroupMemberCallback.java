package com.tencent.imcore;

public class IGroupMemberCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupMemberCallback()
  {
    this(internalJNI.new_IGroupMemberCallback(), true);
    internalJNI.IGroupMemberCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupMemberCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupMemberCallback paramIGroupMemberCallback)
  {
    if (paramIGroupMemberCallback == null) {
      return 0L;
    }
    return paramIGroupMemberCallback.swigCPtr;
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
          internalJNI.delete_IGroupMemberCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if (getClass() == IGroupMemberCallback.class)
    {
      internalJNI.IGroupMemberCallback_done(this.swigCPtr, this, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
      return;
    }
    internalJNI.IGroupMemberCallback_doneSwigExplicitIGroupMemberCallback(this.swigCPtr, this, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupMemberCallback.class)
    {
      internalJNI.IGroupMemberCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupMemberCallback_failSwigExplicitIGroupMemberCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupMemberCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupMemberCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupMemberCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */