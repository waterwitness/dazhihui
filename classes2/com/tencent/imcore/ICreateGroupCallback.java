package com.tencent.imcore;

public class ICreateGroupCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ICreateGroupCallback()
  {
    this(internalJNI.new_ICreateGroupCallback(), true);
    internalJNI.ICreateGroupCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected ICreateGroupCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ICreateGroupCallback paramICreateGroupCallback)
  {
    if (paramICreateGroupCallback == null) {
      return 0L;
    }
    return paramICreateGroupCallback.swigCPtr;
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
          internalJNI.delete_ICreateGroupCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(String paramString)
  {
    if (getClass() == ICreateGroupCallback.class)
    {
      internalJNI.ICreateGroupCallback_done(this.swigCPtr, this, paramString);
      return;
    }
    internalJNI.ICreateGroupCallback_doneSwigExplicitICreateGroupCallback(this.swigCPtr, this, paramString);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == ICreateGroupCallback.class)
    {
      internalJNI.ICreateGroupCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.ICreateGroupCallback_failSwigExplicitICreateGroupCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.ICreateGroupCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.ICreateGroupCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ICreateGroupCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */