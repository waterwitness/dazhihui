package com.tencent.imcore;

public class IFriendshipActionCallbackV2
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipActionCallbackV2()
  {
    this(internalJNI.new_IFriendshipActionCallbackV2(), true);
    internalJNI.IFriendshipActionCallbackV2_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipActionCallbackV2(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2)
  {
    if (paramIFriendshipActionCallbackV2 == null) {
      return 0L;
    }
    return paramIFriendshipActionCallbackV2.swigCPtr;
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
          internalJNI.delete_IFriendshipActionCallbackV2(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(long paramLong, FriendProfileVec paramFriendProfileVec)
  {
    if (getClass() == IFriendshipActionCallbackV2.class)
    {
      internalJNI.IFriendshipActionCallbackV2_done(this.swigCPtr, this, paramLong, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
      return;
    }
    internalJNI.IFriendshipActionCallbackV2_doneSwigExplicitIFriendshipActionCallbackV2(this.swigCPtr, this, paramLong, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipActionCallbackV2.class)
    {
      internalJNI.IFriendshipActionCallbackV2_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipActionCallbackV2_failSwigExplicitIFriendshipActionCallbackV2(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendProfileVec getVecFriends()
  {
    long l = internalJNI.IFriendshipActionCallbackV2_vecFriends_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfileVec(l, false);
  }
  
  public void setVecFriends(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.IFriendshipActionCallbackV2_vecFriends_set(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IFriendshipActionCallbackV2_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipActionCallbackV2_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipActionCallbackV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */