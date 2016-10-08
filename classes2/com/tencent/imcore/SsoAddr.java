package com.tencent.imcore;

public class SsoAddr
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SsoAddr()
  {
    this(internalJNI.new_SsoAddr__SWIG_0(), true);
  }
  
  protected SsoAddr(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public SsoAddr(String paramString, long paramLong)
  {
    this(internalJNI.new_SsoAddr__SWIG_1(paramString, paramLong), true);
  }
  
  protected static long getCPtr(SsoAddr paramSsoAddr)
  {
    if (paramSsoAddr == null) {
      return 0L;
    }
    return paramSsoAddr.swigCPtr;
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
          internalJNI.delete_SsoAddr(this.swigCPtr);
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
  
  public String getIp()
  {
    return internalJNI.SsoAddr_ip_get(this.swigCPtr, this);
  }
  
  public long getPort()
  {
    return internalJNI.SsoAddr_port_get(this.swigCPtr, this);
  }
  
  public void setIp(String paramString)
  {
    internalJNI.SsoAddr_ip_set(this.swigCPtr, this, paramString);
  }
  
  public void setPort(long paramLong)
  {
    internalJNI.SsoAddr_port_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SsoAddr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */