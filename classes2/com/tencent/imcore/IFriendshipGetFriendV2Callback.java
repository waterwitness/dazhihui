package com.tencent.imcore;

public class IFriendshipGetFriendV2Callback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFriendshipGetFriendV2Callback()
  {
    this(internalJNI.new_IFriendshipGetFriendV2Callback(), true);
    internalJNI.IFriendshipGetFriendV2Callback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFriendshipGetFriendV2Callback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback)
  {
    if (paramIFriendshipGetFriendV2Callback == null) {
      return 0L;
    }
    return paramIFriendshipGetFriendV2Callback.swigCPtr;
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
          internalJNI.delete_IFriendshipGetFriendV2Callback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FriendMetaInfo paramFriendMetaInfo, FriendProfileVec paramFriendProfileVec)
  {
    if (getClass() == IFriendshipGetFriendV2Callback.class)
    {
      internalJNI.IFriendshipGetFriendV2Callback_done(this.swigCPtr, this, FriendMetaInfo.getCPtr(paramFriendMetaInfo), paramFriendMetaInfo, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
      return;
    }
    internalJNI.IFriendshipGetFriendV2Callback_doneSwigExplicitIFriendshipGetFriendV2Callback(this.swigCPtr, this, FriendMetaInfo.getCPtr(paramFriendMetaInfo), paramFriendMetaInfo, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFriendshipGetFriendV2Callback.class)
    {
      internalJNI.IFriendshipGetFriendV2Callback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFriendshipGetFriendV2Callback_failSwigExplicitIFriendshipGetFriendV2Callback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IFriendshipGetFriendV2Callback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFriendshipGetFriendV2Callback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFriendshipGetFriendV2Callback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */