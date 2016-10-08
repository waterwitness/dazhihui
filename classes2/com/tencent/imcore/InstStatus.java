package com.tencent.imcore;

public class InstStatus
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public InstStatus()
  {
    this(internalJNI.new_InstStatus(), true);
  }
  
  protected InstStatus(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(InstStatus paramInstStatus)
  {
    if (paramInstStatus == null) {
      return 0L;
    }
    return paramInstStatus.swigCPtr;
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
          internalJNI.delete_InstStatus(this.swigCPtr);
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
  
  public long getDdwClientType()
  {
    return internalJNI.InstStatus_ddwClientType_get(this.swigCPtr, this);
  }
  
  public String getSUserDefine()
  {
    return internalJNI.InstStatus_sUserDefine_get(this.swigCPtr, this);
  }
  
  public void setDdwClientType(long paramLong)
  {
    internalJNI.InstStatus_ddwClientType_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSUserDefine(String paramString)
  {
    internalJNI.InstStatus_sUserDefine_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\InstStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */