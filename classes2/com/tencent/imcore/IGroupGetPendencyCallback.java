package com.tencent.imcore;

public class IGroupGetPendencyCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupGetPendencyCallback()
  {
    this(internalJNI.new_IGroupGetPendencyCallback(), true);
    internalJNI.IGroupGetPendencyCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupGetPendencyCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupGetPendencyCallback paramIGroupGetPendencyCallback)
  {
    if (paramIGroupGetPendencyCallback == null) {
      return 0L;
    }
    return paramIGroupGetPendencyCallback.swigCPtr;
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
          internalJNI.delete_IGroupGetPendencyCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(GroupPendencyMeta paramGroupPendencyMeta, GroupPendencyItemVec paramGroupPendencyItemVec)
  {
    if (getClass() == IGroupGetPendencyCallback.class)
    {
      internalJNI.IGroupGetPendencyCallback_done(this.swigCPtr, this, GroupPendencyMeta.getCPtr(paramGroupPendencyMeta), paramGroupPendencyMeta, GroupPendencyItemVec.getCPtr(paramGroupPendencyItemVec), paramGroupPendencyItemVec);
      return;
    }
    internalJNI.IGroupGetPendencyCallback_doneSwigExplicitIGroupGetPendencyCallback(this.swigCPtr, this, GroupPendencyMeta.getCPtr(paramGroupPendencyMeta), paramGroupPendencyMeta, GroupPendencyItemVec.getCPtr(paramGroupPendencyItemVec), paramGroupPendencyItemVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupGetPendencyCallback.class)
    {
      internalJNI.IGroupGetPendencyCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupGetPendencyCallback_failSwigExplicitIGroupGetPendencyCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupGetPendencyCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupGetPendencyCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupGetPendencyCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */