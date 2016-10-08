package com.tencent.imcore;

public class IGetMsgs
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGetMsgs()
  {
    this(internalJNI.new_IGetMsgs(), true);
    internalJNI.IGetMsgs_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGetMsgs(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGetMsgs paramIGetMsgs)
  {
    if (paramIGetMsgs == null) {
      return 0L;
    }
    return paramIGetMsgs.swigCPtr;
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
          internalJNI.delete_IGetMsgs(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(MsgVec paramMsgVec)
  {
    if (getClass() == IGetMsgs.class)
    {
      internalJNI.IGetMsgs_done(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
      return;
    }
    internalJNI.IGetMsgs_doneSwigExplicitIGetMsgs(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGetMsgs.class)
    {
      internalJNI.IGetMsgs_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGetMsgs_failSwigExplicitIGetMsgs(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGetMsgs_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGetMsgs_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGetMsgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */