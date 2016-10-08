package com.tencent.imcore;

public class IEnv
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IEnv()
  {
    this(internalJNI.new_IEnv(), true);
    internalJNI.IEnv_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IEnv(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IEnv paramIEnv)
  {
    if (paramIEnv == null) {
      return 0L;
    }
    return paramIEnv.swigCPtr;
  }
  
  public boolean createThread(ThreadEntry paramThreadEntry)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_createThread(this.swigCPtr, this, ThreadEntry.getCPtr(paramThreadEntry), paramThreadEntry);
    }
    return internalJNI.IEnv_createThreadSwigExplicitIEnv(this.swigCPtr, this, ThreadEntry.getCPtr(paramThreadEntry), paramThreadEntry);
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
          internalJNI.delete_IEnv(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public boolean httpRequest(String paramString1, HttpMethod paramHttpMethod, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_httpRequest(this.swigCPtr, this, paramString1, paramHttpMethod.swigValue(), paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
    }
    return internalJNI.IEnv_httpRequestSwigExplicitIEnv(this.swigCPtr, this, paramString1, paramHttpMethod.swigValue(), paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
  }
  
  public boolean runOnMainThread(RunClosure paramRunClosure)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_runOnMainThread(this.swigCPtr, this, RunClosure.getCPtr(paramRunClosure), paramRunClosure);
    }
    return internalJNI.IEnv_runOnMainThreadSwigExplicitIEnv(this.swigCPtr, this, RunClosure.getCPtr(paramRunClosure), paramRunClosure);
  }
  
  public boolean sSORequest(String paramString1, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_sSORequest__SWIG_1(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
    }
    return internalJNI.IEnv_sSORequestSwigExplicitIEnv__SWIG_1(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
  }
  
  public boolean sSORequest(String paramString1, String paramString2, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure, long paramLong)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_sSORequest__SWIG_0(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure, paramLong);
    }
    return internalJNI.IEnv_sSORequestSwigExplicitIEnv__SWIG_0(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure, paramLong);
  }
  
  public void setLogin(String paramString, boolean paramBoolean)
  {
    if (getClass() == IEnv.class)
    {
      internalJNI.IEnv_setLogin(this.swigCPtr, this, paramString, paramBoolean);
      return;
    }
    internalJNI.IEnv_setLoginSwigExplicitIEnv(this.swigCPtr, this, paramString, paramBoolean);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IEnv_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IEnv_change_ownership(this, this.swigCPtr, true);
  }
  
  public boolean uploadLogFile(String paramString1, String paramString2, String paramString3)
  {
    if (getClass() == IEnv.class) {
      return internalJNI.IEnv_uploadLogFile(this.swigCPtr, this, paramString1, paramString2, paramString3);
    }
    return internalJNI.IEnv_uploadLogFileSwigExplicitIEnv(this.swigCPtr, this, paramString1, paramString2, paramString3);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IEnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */