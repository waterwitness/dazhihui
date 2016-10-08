package com.tencent.imcore;

public class IGroupNotifyCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupNotifyCallback()
  {
    this(internalJNI.new_IGroupNotifyCallback(), true);
    internalJNI.IGroupNotifyCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupNotifyCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    if (paramIGroupNotifyCallback == null) {
      return 0L;
    }
    return paramIGroupNotifyCallback.swigCPtr;
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
          internalJNI.delete_IGroupNotifyCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == IGroupNotifyCallback.class)
    {
      internalJNI.IGroupNotifyCallback_done(this.swigCPtr, this);
      return;
    }
    internalJNI.IGroupNotifyCallback_doneSwigExplicitIGroupNotifyCallback(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupNotifyCallback.class)
    {
      internalJNI.IGroupNotifyCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupNotifyCallback_failSwigExplicitIGroupNotifyCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupNotifyCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupNotifyCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupNotifyCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */