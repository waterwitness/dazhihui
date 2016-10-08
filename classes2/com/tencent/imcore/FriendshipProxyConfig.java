package com.tencent.imcore;

public class FriendshipProxyConfig
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendshipProxyConfig()
  {
    this(internalJNI.new_FriendshipProxyConfig(), true);
  }
  
  protected FriendshipProxyConfig(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendshipProxyConfig paramFriendshipProxyConfig)
  {
    if (paramFriendshipProxyConfig == null) {
      return 0L;
    }
    return paramFriendshipProxyConfig.swigCPtr;
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
          internalJNI.delete_FriendshipProxyConfig(this.swigCPtr);
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
  
  public StrVec getCustom()
  {
    long l = internalJNI.FriendshipProxyConfig_custom_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public boolean getEnable()
  {
    return internalJNI.FriendshipProxyConfig_enable_get(this.swigCPtr, this);
  }
  
  public long getFlags()
  {
    return internalJNI.FriendshipProxyConfig_flags_get(this.swigCPtr, this);
  }
  
  public IFriendshipProxyListener getListener()
  {
    long l = internalJNI.FriendshipProxyConfig_listener_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipProxyListener(l, false);
  }
  
  public void setCustom(StrVec paramStrVec)
  {
    internalJNI.FriendshipProxyConfig_custom_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void setEnable(boolean paramBoolean)
  {
    internalJNI.FriendshipProxyConfig_enable_set(this.swigCPtr, this, paramBoolean);
  }
  
  public void setFlags(long paramLong)
  {
    internalJNI.FriendshipProxyConfig_flags_set(this.swigCPtr, this, paramLong);
  }
  
  public void setListener(IFriendshipProxyListener paramIFriendshipProxyListener)
  {
    internalJNI.FriendshipProxyConfig_listener_set(this.swigCPtr, this, IFriendshipProxyListener.getCPtr(paramIFriendshipProxyListener), paramIFriendshipProxyListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendshipProxyConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */