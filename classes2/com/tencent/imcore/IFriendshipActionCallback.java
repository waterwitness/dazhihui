package com.tencent.imcore;

public class IFriendshipActionCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipActionCallback()
  {
    this(internalJNI.new_IFriendshipActionCallback(), true);
    internalJNI.IFriendshipActionCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipActionCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    if (paramIFriendshipActionCallback == null) {
      return 0L;
    }
    return paramIFriendshipActionCallback.swigCPtr;
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
          internalJNI.delete_IFriendshipActionCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FriendProfileVec paramFriendProfileVec)
  {
    if (getClass() == IFriendshipActionCallback.class)
    {
      internalJNI.IFriendshipActionCallback_done(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
      return;
    }
    internalJNI.IFriendshipActionCallback_doneSwigExplicitIFriendshipActionCallback(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipActionCallback.class)
    {
      internalJNI.IFriendshipActionCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipActionCallback_failSwigExplicitIFriendshipActionCallback(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendProfileVec getVecFriends()
  {
    long l = internalJNI.IFriendshipActionCallback_vecFriends_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfileVec(l, false);
  }
  
  public void setVecFriends(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.IFriendshipActionCallback_vecFriends_set(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IFriendshipActionCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipActionCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipActionCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */