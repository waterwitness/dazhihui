package com.tencent.imcore;

public class StatusManager
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected StatusManager(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public StatusManager(String paramString)
  {
    this(internalJNI.new_StatusManager(paramString), true);
  }
  
  protected static long getCPtr(StatusManager paramStatusManager)
  {
    if (paramStatusManager == null) {
      return 0L;
    }
    return paramStatusManager.swigCPtr;
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
          internalJNI.delete_StatusManager(this.swigCPtr);
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
  
  public boolean getUserStatus(StrVec paramStrVec, IStatusCallback paramIStatusCallback)
  {
    return internalJNI.StatusManager_getUserStatus(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IStatusCallback.getCPtr(paramIStatusCallback), paramIStatusCallback);
  }
  
  public void setUsedefinedData(String paramString, IStatusSetUserDefCallback paramIStatusSetUserDefCallback)
  {
    internalJNI.StatusManager_setUsedefinedData(this.swigCPtr, this, paramString, IStatusSetUserDefCallback.getCPtr(paramIStatusSetUserDefCallback), paramIStatusSetUserDefCallback);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\StatusManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */