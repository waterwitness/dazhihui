package com.tencent.imcore;

public class IFriendGroupCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendGroupCallback()
  {
    this(internalJNI.new_IFriendGroupCallback(), true);
    internalJNI.IFriendGroupCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendGroupCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendGroupCallback paramIFriendGroupCallback)
  {
    if (paramIFriendGroupCallback == null) {
      return 0L;
    }
    return paramIFriendGroupCallback.swigCPtr;
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
          internalJNI.delete_IFriendGroupCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FriendGroupVec paramFriendGroupVec)
  {
    if (getClass() == IFriendGroupCallback.class)
    {
      internalJNI.IFriendGroupCallback_done(this.swigCPtr, this, FriendGroupVec.getCPtr(paramFriendGroupVec), paramFriendGroupVec);
      return;
    }
    internalJNI.IFriendGroupCallback_doneSwigExplicitIFriendGroupCallback(this.swigCPtr, this, FriendGroupVec.getCPtr(paramFriendGroupVec), paramFriendGroupVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendGroupCallback.class)
    {
      internalJNI.IFriendGroupCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendGroupCallback_failSwigExplicitIFriendGroupCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IFriendGroupCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendGroupCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendGroupCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */