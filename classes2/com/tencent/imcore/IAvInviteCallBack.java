package com.tencent.imcore;

public class IAvInviteCallBack
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IAvInviteCallBack()
  {
    this(internalJNI.new_IAvInviteCallBack(), true);
    internalJNI.IAvInviteCallBack_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IAvInviteCallBack(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IAvInviteCallBack paramIAvInviteCallBack)
  {
    if (paramIAvInviteCallBack == null) {
      return 0L;
    }
    return paramIAvInviteCallBack.swigCPtr;
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
          internalJNI.delete_IAvInviteCallBack(this.swigCPtr);
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
  
  public void onAvInviteBuf(byte[] paramArrayOfByte)
  {
    if (getClass() == IAvInviteCallBack.class)
    {
      internalJNI.IAvInviteCallBack_onAvInviteBuf(this.swigCPtr, this, paramArrayOfByte);
      return;
    }
    internalJNI.IAvInviteCallBack_onAvInviteBufSwigExplicitIAvInviteCallBack(this.swigCPtr, this, paramArrayOfByte);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IAvInviteCallBack_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IAvInviteCallBack_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IAvInviteCallBack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */