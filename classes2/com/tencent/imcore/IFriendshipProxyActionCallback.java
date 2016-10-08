package com.tencent.imcore;

public class IFriendshipProxyActionCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected IFriendshipProxyActionCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback)
  {
    if (paramIFriendshipProxyActionCallback == null) {
      return 0L;
    }
    return paramIFriendshipProxyActionCallback.swigCPtr;
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
          internalJNI.delete_IFriendshipProxyActionCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FriendProfileVec paramFriendProfileVec, long paramLong1, long paramLong2)
  {
    internalJNI.IFriendshipProxyActionCallback_done(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, paramLong1, paramLong2);
  }
  
  public void fail(int paramInt, String paramString)
  {
    internalJNI.IFriendshipProxyActionCallback_fail(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public boolean getAllFlag()
  {
    return internalJNI.IFriendshipProxyActionCallback_getAllFlag(this.swigCPtr, this);
  }
  
  public FriendProfileVec getVecFriends()
  {
    long l = internalJNI.IFriendshipProxyActionCallback_vecFriends_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfileVec(l, false);
  }
  
  public void setAllFlag(boolean paramBoolean)
  {
    internalJNI.IFriendshipProxyActionCallback_setAllFlag(this.swigCPtr, this, paramBoolean);
  }
  
  public void setVecFriends(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.IFriendshipProxyActionCallback_vecFriends_set(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipProxyActionCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */