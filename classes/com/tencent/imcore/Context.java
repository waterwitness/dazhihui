package com.tencent.imcore;

public class Context
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public Context()
  {
    this(internalJNI.new_Context(), true);
  }
  
  protected Context(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(Context paramContext)
  {
    if (paramContext == null) {
      return 0L;
    }
    return paramContext.swigCPtr;
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
          internalJNI.delete_Context(this.swigCPtr);
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
  
  public long getBid()
  {
    return internalJNI.Context_bid_get(this.swigCPtr, this);
  }
  
  public boolean getIsLogPrintEnabled()
  {
    return internalJNI.Context_isLogPrintEnabled_get(this.swigCPtr, this);
  }
  
  public String getLogPath()
  {
    return internalJNI.Context_logPath_get(this.swigCPtr, this);
  }
  
  public String getPicCachePath()
  {
    return internalJNI.Context_picCachePath_get(this.swigCPtr, this);
  }
  
  public long getPlatform()
  {
    return internalJNI.Context_platform_get(this.swigCPtr, this);
  }
  
  public long getSvr_time_diff()
  {
    return internalJNI.Context_svr_time_diff_get(this.swigCPtr, this);
  }
  
  public void setBid(long paramLong)
  {
    internalJNI.Context_bid_set(this.swigCPtr, this, paramLong);
  }
  
  public void setIsLogPrintEnabled(boolean paramBoolean)
  {
    internalJNI.Context_isLogPrintEnabled_set(this.swigCPtr, this, paramBoolean);
  }
  
  public void setLogPath(String paramString)
  {
    internalJNI.Context_logPath_set(this.swigCPtr, this, paramString);
  }
  
  public void setPicCachePath(String paramString)
  {
    internalJNI.Context_picCachePath_set(this.swigCPtr, this, paramString);
  }
  
  public void setPlatform(long paramLong)
  {
    internalJNI.Context_platform_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSvr_time_diff(long paramLong)
  {
    internalJNI.Context_svr_time_diff_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\Context.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */