package com.tencent.imcore;

public class IBatchOprCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IBatchOprCallback()
  {
    this(internalJNI.new_IBatchOprCallback(), true);
    internalJNI.IBatchOprCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IBatchOprCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IBatchOprCallback paramIBatchOprCallback)
  {
    if (paramIBatchOprCallback == null) {
      return 0L;
    }
    return paramIBatchOprCallback.swigCPtr;
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
          internalJNI.delete_IBatchOprCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == IBatchOprCallback.class)
    {
      internalJNI.IBatchOprCallback_done(this.swigCPtr, this);
      return;
    }
    internalJNI.IBatchOprCallback_doneSwigExplicitIBatchOprCallback(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo)
  {
    if (getClass() == IBatchOprCallback.class)
    {
      internalJNI.IBatchOprCallback_fail(this.swigCPtr, this, paramInt, paramString, IBatchOprCallback.BatchOprDetailInfo.getCPtr(paramBatchOprDetailInfo), paramBatchOprDetailInfo);
      return;
    }
    internalJNI.IBatchOprCallback_failSwigExplicitIBatchOprCallback(this.swigCPtr, this, paramInt, paramString, IBatchOprCallback.BatchOprDetailInfo.getCPtr(paramBatchOprDetailInfo), paramBatchOprDetailInfo);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public void setLogin(String paramString, boolean paramBoolean)
  {
    if (getClass() == IBatchOprCallback.class)
    {
      internalJNI.IBatchOprCallback_setLogin(this.swigCPtr, this, paramString, paramBoolean);
      return;
    }
    internalJNI.IBatchOprCallback_setLoginSwigExplicitIBatchOprCallback(this.swigCPtr, this, paramString, paramBoolean);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IBatchOprCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IBatchOprCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IBatchOprCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */