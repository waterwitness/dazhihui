package com.tencent.imcore;

public class ThreadEntry
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected ThreadEntry(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ThreadEntry paramThreadEntry)
  {
    if (paramThreadEntry == null) {
      return 0L;
    }
    return paramThreadEntry.swigCPtr;
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
          internalJNI.delete_ThreadEntry(this.swigCPtr);
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
    internalJNI.ThreadEntry_release(this.swigCPtr, this);
  }
  
  public void run()
  {
    internalJNI.ThreadEntry_run(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ThreadEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */