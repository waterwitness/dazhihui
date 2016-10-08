package com.tencent.imcore;

public class IApplyDownloadFileCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IApplyDownloadFileCallback()
  {
    this(internalJNI.new_IApplyDownloadFileCallback(), true);
    internalJNI.IApplyDownloadFileCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IApplyDownloadFileCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IApplyDownloadFileCallback paramIApplyDownloadFileCallback)
  {
    if (paramIApplyDownloadFileCallback == null) {
      return 0L;
    }
    return paramIApplyDownloadFileCallback.swigCPtr;
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
          internalJNI.delete_IApplyDownloadFileCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(StrVec paramStrVec)
  {
    if (getClass() == IApplyDownloadFileCallback.class)
    {
      internalJNI.IApplyDownloadFileCallback_done(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
      return;
    }
    internalJNI.IApplyDownloadFileCallback_doneSwigExplicitIApplyDownloadFileCallback(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IApplyDownloadFileCallback.class)
    {
      internalJNI.IApplyDownloadFileCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IApplyDownloadFileCallback_failSwigExplicitIApplyDownloadFileCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IApplyDownloadFileCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IApplyDownloadFileCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IApplyDownloadFileCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */