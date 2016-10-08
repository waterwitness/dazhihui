package com.tencent.imcore;

public class IInit
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IInit()
  {
    this(internalJNI.new_IInit(), true);
    internalJNI.IInit_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IInit(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IInit paramIInit)
  {
    if (paramIInit == null) {
      return 0L;
    }
    return paramIInit.swigCPtr;
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
          internalJNI.delete_IInit(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == IInit.class)
    {
      internalJNI.IInit_done(this.swigCPtr, this);
      return;
    }
    internalJNI.IInit_doneSwigExplicitIInit(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IInit.class)
    {
      internalJNI.IInit_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IInit_failSwigExplicitIInit(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IInit_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IInit_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IInit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */