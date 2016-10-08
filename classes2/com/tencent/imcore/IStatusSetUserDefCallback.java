package com.tencent.imcore;

public class IStatusSetUserDefCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IStatusSetUserDefCallback()
  {
    this(internalJNI.new_IStatusSetUserDefCallback(), true);
  }
  
  protected IStatusSetUserDefCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IStatusSetUserDefCallback paramIStatusSetUserDefCallback)
  {
    if (paramIStatusSetUserDefCallback == null) {
      return 0L;
    }
    return paramIStatusSetUserDefCallback.swigCPtr;
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
          internalJNI.delete_IStatusSetUserDefCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    internalJNI.IStatusSetUserDefCallback_done(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    internalJNI.IStatusSetUserDefCallback_fail(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IStatusSetUserDefCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */