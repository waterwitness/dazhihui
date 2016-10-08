package com.tencent.imcore;

public class IGroupMemberResultCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupMemberResultCallback()
  {
    this(internalJNI.new_IGroupMemberResultCallback(), true);
    internalJNI.IGroupMemberResultCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupMemberResultCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupMemberResultCallback paramIGroupMemberResultCallback)
  {
    if (paramIGroupMemberResultCallback == null) {
      return 0L;
    }
    return paramIGroupMemberResultCallback.swigCPtr;
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
          internalJNI.delete_IGroupMemberResultCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(GroupMemberResultVec paramGroupMemberResultVec)
  {
    if (getClass() == IGroupMemberResultCallback.class)
    {
      internalJNI.IGroupMemberResultCallback_done(this.swigCPtr, this, GroupMemberResultVec.getCPtr(paramGroupMemberResultVec), paramGroupMemberResultVec);
      return;
    }
    internalJNI.IGroupMemberResultCallback_doneSwigExplicitIGroupMemberResultCallback(this.swigCPtr, this, GroupMemberResultVec.getCPtr(paramGroupMemberResultVec), paramGroupMemberResultVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupMemberResultCallback.class)
    {
      internalJNI.IGroupMemberResultCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupMemberResultCallback_failSwigExplicitIGroupMemberResultCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupMemberResultCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupMemberResultCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupMemberResultCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */