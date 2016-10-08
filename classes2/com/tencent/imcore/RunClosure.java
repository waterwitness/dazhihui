package com.tencent.imcore;

public class RunClosure
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected RunClosure(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(RunClosure paramRunClosure)
  {
    if (paramRunClosure == null) {
      return 0L;
    }
    return paramRunClosure.swigCPtr;
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
          internalJNI.delete_RunClosure(this.swigCPtr);
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
  
  public void release()
  {
    internalJNI.RunClosure_release(this.swigCPtr, this);
  }
  
  public void run()
  {
    internalJNI.RunClosure_run(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\RunClosure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */