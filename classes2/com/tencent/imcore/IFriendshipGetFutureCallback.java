package com.tencent.imcore;

public class IFriendshipGetFutureCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipGetFutureCallback()
  {
    this(internalJNI.new_IFriendshipGetFutureCallback(), true);
    internalJNI.IFriendshipGetFutureCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipGetFutureCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback)
  {
    if (paramIFriendshipGetFutureCallback == null) {
      return 0L;
    }
    return paramIFriendshipGetFutureCallback.swigCPtr;
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
          internalJNI.delete_IFriendshipGetFutureCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FutureFriendMeta paramFutureFriendMeta, FriendFutureItemVec paramFriendFutureItemVec)
  {
    if (getClass() == IFriendshipGetFutureCallback.class)
    {
      internalJNI.IFriendshipGetFutureCallback_done(this.swigCPtr, this, FutureFriendMeta.getCPtr(paramFutureFriendMeta), paramFutureFriendMeta, FriendFutureItemVec.getCPtr(paramFriendFutureItemVec), paramFriendFutureItemVec);
      return;
    }
    internalJNI.IFriendshipGetFutureCallback_doneSwigExplicitIFriendshipGetFutureCallback(this.swigCPtr, this, FutureFriendMeta.getCPtr(paramFutureFriendMeta), paramFutureFriendMeta, FriendFutureItemVec.getCPtr(paramFriendFutureItemVec), paramFriendFutureItemVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipGetFutureCallback.class)
    {
      internalJNI.IFriendshipGetFutureCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipGetFutureCallback_failSwigExplicitIFriendshipGetFutureCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IFriendshipGetFutureCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipGetFutureCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipGetFutureCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */