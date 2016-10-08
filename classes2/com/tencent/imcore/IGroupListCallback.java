package com.tencent.imcore;

public class IGroupListCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupListCallback()
  {
    this(internalJNI.new_IGroupListCallback(), true);
    internalJNI.IGroupListCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupListCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupListCallback paramIGroupListCallback)
  {
    if (paramIGroupListCallback == null) {
      return 0L;
    }
    return paramIGroupListCallback.swigCPtr;
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
          internalJNI.delete_IGroupListCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(GroupBaseInfoVec paramGroupBaseInfoVec)
  {
    if (getClass() == IGroupListCallback.class)
    {
      internalJNI.IGroupListCallback_done(this.swigCPtr, this, GroupBaseInfoVec.getCPtr(paramGroupBaseInfoVec), paramGroupBaseInfoVec);
      return;
    }
    internalJNI.IGroupListCallback_doneSwigExplicitIGroupListCallback(this.swigCPtr, this, GroupBaseInfoVec.getCPtr(paramGroupBaseInfoVec), paramGroupBaseInfoVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupListCallback.class)
    {
      internalJNI.IGroupListCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupListCallback_failSwigExplicitIGroupListCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupListCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupListCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupListCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */