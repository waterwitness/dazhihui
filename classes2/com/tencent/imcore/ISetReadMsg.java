package com.tencent.imcore;

public class ISetReadMsg
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ISetReadMsg()
  {
    this(internalJNI.new_ISetReadMsg(), true);
    internalJNI.ISetReadMsg_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected ISetReadMsg(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ISetReadMsg paramISetReadMsg)
  {
    if (paramISetReadMsg == null) {
      return 0L;
    }
    return paramISetReadMsg.swigCPtr;
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
          internalJNI.delete_ISetReadMsg(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == ISetReadMsg.class)
    {
      internalJNI.ISetReadMsg_done(this.swigCPtr, this);
      return;
    }
    internalJNI.ISetReadMsg_doneSwigExplicitISetReadMsg(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == ISetReadMsg.class)
    {
      internalJNI.ISetReadMsg_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.ISetReadMsg_failSwigExplicitISetReadMsg(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.ISetReadMsg_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.ISetReadMsg_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ISetReadMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */