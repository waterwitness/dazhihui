package com.tencent.imcore;

public class IFriendshipPendencyCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipPendencyCallback()
  {
    this(internalJNI.new_IFriendshipPendencyCallback(), true);
    internalJNI.IFriendshipPendencyCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipPendencyCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipPendencyCallback paramIFriendshipPendencyCallback)
  {
    if (paramIFriendshipPendencyCallback == null) {
      return 0L;
    }
    return paramIFriendshipPendencyCallback.swigCPtr;
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
          internalJNI.delete_IFriendshipPendencyCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FriendPendencyMeta paramFriendPendencyMeta, FriendPendencyItemVec paramFriendPendencyItemVec)
  {
    if (getClass() == IFriendshipPendencyCallback.class)
    {
      internalJNI.IFriendshipPendencyCallback_done(this.swigCPtr, this, FriendPendencyMeta.getCPtr(paramFriendPendencyMeta), paramFriendPendencyMeta, FriendPendencyItemVec.getCPtr(paramFriendPendencyItemVec), paramFriendPendencyItemVec);
      return;
    }
    internalJNI.IFriendshipPendencyCallback_doneSwigExplicitIFriendshipPendencyCallback(this.swigCPtr, this, FriendPendencyMeta.getCPtr(paramFriendPendencyMeta), paramFriendPendencyMeta, FriendPendencyItemVec.getCPtr(paramFriendPendencyItemVec), paramFriendPendencyItemVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipPendencyCallback.class)
    {
      internalJNI.IFriendshipPendencyCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipPendencyCallback_failSwigExplicitIFriendshipPendencyCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IFriendshipPendencyCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipPendencyCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipPendencyCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */