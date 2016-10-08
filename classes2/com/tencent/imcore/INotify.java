package com.tencent.imcore;

public class INotify
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public INotify()
  {
    this(internalJNI.new_INotify(), true);
    internalJNI.INotify_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected INotify(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(INotify paramINotify)
  {
    if (paramINotify == null) {
      return 0L;
    }
    return paramINotify.swigCPtr;
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
          internalJNI.delete_INotify(this.swigCPtr);
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
  
  public void onMsgEvent(MsgVec paramMsgVec)
  {
    if (getClass() == INotify.class)
    {
      internalJNI.INotify_onMsgEvent(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
      return;
    }
    internalJNI.INotify_onMsgEventSwigExplicitINotify(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
  }
  
  public void onMsgUpdate(MsgVec paramMsgVec)
  {
    if (getClass() == INotify.class)
    {
      internalJNI.INotify_onMsgUpdate(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
      return;
    }
    internalJNI.INotify_onMsgUpdateSwigExplicitINotify(this.swigCPtr, this, MsgVec.getCPtr(paramMsgVec), paramMsgVec);
  }
  
  public void onRefresh()
  {
    if (getClass() == INotify.class)
    {
      internalJNI.INotify_onRefresh(this.swigCPtr, this);
      return;
    }
    internalJNI.INotify_onRefreshSwigExplicitINotify(this.swigCPtr, this);
  }
  
  public void onUploadProgress(Msg paramMsg, int paramInt1, int paramInt2, int paramInt3)
  {
    if (getClass() == INotify.class)
    {
      internalJNI.INotify_onUploadProgress(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, paramInt1, paramInt2, paramInt3);
      return;
    }
    internalJNI.INotify_onUploadProgressSwigExplicitINotify(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg, paramInt1, paramInt2, paramInt3);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.INotify_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.INotify_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\INotify.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */