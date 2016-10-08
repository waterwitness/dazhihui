package com.tencent.imcore;

public class IFriendshipProxyListener
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipProxyListener()
  {
    this(internalJNI.new_IFriendshipProxyListener(), true);
    internalJNI.IFriendshipProxyListener_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipProxyListener(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipProxyListener paramIFriendshipProxyListener)
  {
    if (paramIFriendshipProxyListener == null) {
      return 0L;
    }
    return paramIFriendshipProxyListener.swigCPtr;
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
          internalJNI.delete_IFriendshipProxyListener(this.swigCPtr);
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
  
  public void onAddFriendNotify(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.IFriendshipProxyListener_onAddFriendNotify(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void onAddFriendReq(AddFriendReqVec paramAddFriendReqVec)
  {
    internalJNI.IFriendshipProxyListener_onAddFriendReq(this.swigCPtr, this, AddFriendReqVec.getCPtr(paramAddFriendReqVec), paramAddFriendReqVec);
  }
  
  public void onDeleteFriendNotify(StrVec paramStrVec)
  {
    internalJNI.IFriendshipProxyListener_onDeleteFriendNotify(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void onFriendProfileUpdate(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.IFriendshipProxyListener_onFriendProfileUpdate(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void onProxyStatusChange(FriendProxyStatus paramFriendProxyStatus)
  {
    internalJNI.IFriendshipProxyListener_onProxyStatusChange(this.swigCPtr, this, paramFriendProxyStatus.swigValue());
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IFriendshipProxyListener_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipProxyListener_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipProxyListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */