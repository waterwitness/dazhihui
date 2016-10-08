package com.tencent.imcore;

public class ILogMsgCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ILogMsgCallback()
  {
    this(internalJNI.new_ILogMsgCallback(), true);
    internalJNI.ILogMsgCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected ILogMsgCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ILogMsgCallback paramILogMsgCallback)
  {
    if (paramILogMsgCallback == null) {
      return 0L;
    }
    return paramILogMsgCallback.swigCPtr;
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
          internalJNI.delete_ILogMsgCallback(this.swigCPtr);
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
  
  public void onLogMsg(String paramString1, LogLevel paramLogLevel, String paramString2)
  {
    if (getClass() == ILogMsgCallback.class)
    {
      internalJNI.ILogMsgCallback_onLogMsg(this.swigCPtr, this, paramString1, paramLogLevel.swigValue(), paramString2);
      return;
    }
    internalJNI.ILogMsgCallback_onLogMsgSwigExplicitILogMsgCallback(this.swigCPtr, this, paramString1, paramLogLevel.swigValue(), paramString2);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.ILogMsgCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.ILogMsgCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ILogMsgCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */