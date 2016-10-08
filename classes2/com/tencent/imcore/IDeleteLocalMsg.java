package com.tencent.imcore;

public class IDeleteLocalMsg
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IDeleteLocalMsg()
  {
    this(internalJNI.new_IDeleteLocalMsg(), true);
    internalJNI.IDeleteLocalMsg_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IDeleteLocalMsg(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IDeleteLocalMsg paramIDeleteLocalMsg)
  {
    if (paramIDeleteLocalMsg == null) {
      return 0L;
    }
    return paramIDeleteLocalMsg.swigCPtr;
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
          internalJNI.delete_IDeleteLocalMsg(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == IDeleteLocalMsg.class)
    {
      internalJNI.IDeleteLocalMsg_done(this.swigCPtr, this);
      return;
    }
    internalJNI.IDeleteLocalMsg_doneSwigExplicitIDeleteLocalMsg(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IDeleteLocalMsg.class)
    {
      internalJNI.IDeleteLocalMsg_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IDeleteLocalMsg_failSwigExplicitIDeleteLocalMsg(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IDeleteLocalMsg_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IDeleteLocalMsg_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IDeleteLocalMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */