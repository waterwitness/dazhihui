package com.tencent.imcore;

public class ISendMsg
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ISendMsg()
  {
    this(internalJNI.new_ISendMsg(), true);
    internalJNI.ISendMsg_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected ISendMsg(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ISendMsg paramISendMsg)
  {
    if (paramISendMsg == null) {
      return 0L;
    }
    return paramISendMsg.swigCPtr;
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
          internalJNI.delete_ISendMsg(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == ISendMsg.class)
    {
      internalJNI.ISendMsg_done(this.swigCPtr, this);
      return;
    }
    internalJNI.ISendMsg_doneSwigExplicitISendMsg(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == ISendMsg.class)
    {
      internalJNI.ISendMsg_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.ISendMsg_failSwigExplicitISendMsg(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.ISendMsg_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.ISendMsg_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ISendMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */