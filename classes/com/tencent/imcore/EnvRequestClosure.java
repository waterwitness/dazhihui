package com.tencent.imcore;

public class EnvRequestClosure
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected EnvRequestClosure(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(EnvRequestClosure paramEnvRequestClosure)
  {
    if (paramEnvRequestClosure == null) {
      return 0L;
    }
    return paramEnvRequestClosure.swigCPtr;
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
          internalJNI.delete_EnvRequestClosure(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(byte[] paramArrayOfByte)
  {
    internalJNI.EnvRequestClosure_done(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void fail(int paramInt, String paramString)
  {
    internalJNI.EnvRequestClosure_fail(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public void release()
  {
    internalJNI.EnvRequestClosure_release(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\EnvRequestClosure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */