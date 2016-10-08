package com.tencent.imcore;

public class IGroupInfoListCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupInfoListCallback()
  {
    this(internalJNI.new_IGroupInfoListCallback(), true);
    internalJNI.IGroupInfoListCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupInfoListCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupInfoListCallback paramIGroupInfoListCallback)
  {
    if (paramIGroupInfoListCallback == null) {
      return 0L;
    }
    return paramIGroupInfoListCallback.swigCPtr;
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
          internalJNI.delete_IGroupInfoListCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(GroupDetailInfoVec paramGroupDetailInfoVec)
  {
    if (getClass() == IGroupInfoListCallback.class)
    {
      internalJNI.IGroupInfoListCallback_done(this.swigCPtr, this, GroupDetailInfoVec.getCPtr(paramGroupDetailInfoVec), paramGroupDetailInfoVec);
      return;
    }
    internalJNI.IGroupInfoListCallback_doneSwigExplicitIGroupInfoListCallback(this.swigCPtr, this, GroupDetailInfoVec.getCPtr(paramGroupDetailInfoVec), paramGroupDetailInfoVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupInfoListCallback.class)
    {
      internalJNI.IGroupInfoListCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupInfoListCallback_failSwigExplicitIGroupInfoListCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupInfoListCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupInfoListCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupInfoListCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */