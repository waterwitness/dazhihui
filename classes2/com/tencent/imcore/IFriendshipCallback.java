package com.tencent.imcore;

public class IFriendshipCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipCallback()
  {
    this(internalJNI.new_IFriendshipCallback(), true);
    internalJNI.IFriendshipCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipCallback paramIFriendshipCallback)
  {
    if (paramIFriendshipCallback == null) {
      return 0L;
    }
    return paramIFriendshipCallback.swigCPtr;
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
          internalJNI.delete_IFriendshipCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done()
  {
    if (getClass() == IFriendshipCallback.class)
    {
      internalJNI.IFriendshipCallback_done(this.swigCPtr, this);
      return;
    }
    internalJNI.IFriendshipCallback_doneSwigExplicitIFriendshipCallback(this.swigCPtr, this);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipCallback.class)
    {
      internalJNI.IFriendshipCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipCallback_failSwigExplicitIFriendshipCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IFriendshipCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */