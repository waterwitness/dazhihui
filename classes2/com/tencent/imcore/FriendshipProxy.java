package com.tencent.imcore;

public class FriendshipProxy
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendshipProxy()
  {
    this(internalJNI.new_FriendshipProxy(), true);
  }
  
  protected FriendshipProxy(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendshipProxy paramFriendshipProxy)
  {
    if (paramFriendshipProxy == null) {
      return 0L;
    }
    return paramFriendshipProxy.swigCPtr;
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
          internalJNI.delete_FriendshipProxy(this.swigCPtr);
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
  
  public IFriendshipActionCallback getAddBlackList(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getAddBlackList(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipActionCallback getAddFriend2GroupCB(byte[] paramArrayOfByte, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getAddFriend2GroupCB(this.swigCPtr, this, paramArrayOfByte, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipActionCallback getCreateFriendGroupCB(BytesVec paramBytesVec, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getCreateFriendGroupCB(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public StrVec getCustom()
  {
    return new StrVec(internalJNI.FriendshipProxy_getCustom(this.swigCPtr, this), true);
  }
  
  public IFriendshipActionCallback getDelFriendCB(FriendDeleteType paramFriendDeleteType, FriendProfileVec paramFriendProfileVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getDelFriendCB(this.swigCPtr, this, paramFriendDeleteType.swigValue(), FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipActionCallback getDelFriendsFromGroupCB(byte[] paramArrayOfByte, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getDelFriendsFromGroupCB(this.swigCPtr, this, paramArrayOfByte, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipCallback getDeleteFriendGroup(BytesVec paramBytesVec, IFriendshipCallback paramIFriendshipCallback)
  {
    long l = internalJNI.FriendshipProxy_getDeleteFriendGroup(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipCallback(l, false);
  }
  
  public IFriendshipActionCallback getDoResponseCB(FriendProfileVec paramFriendProfileVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getDoResponseCB(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public long getFriendFlags()
  {
    return internalJNI.FriendshipProxy_getFriendFlags(this.swigCPtr, this);
  }
  
  public int getFriendGroup(BytesVec paramBytesVec, FriendGroupVec paramFriendGroupVec)
  {
    return internalJNI.FriendshipProxy_getFriendGroup(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, FriendGroupVec.getCPtr(paramFriendGroupVec), paramFriendGroupVec);
  }
  
  public int getFriendList(FriendProfileVec paramFriendProfileVec)
  {
    return internalJNI.FriendshipProxy_getFriendList(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public int getFriendProfile(StrVec paramStrVec, FriendProfileVec paramFriendProfileVec)
  {
    return internalJNI.FriendshipProxy_getFriendProfile(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public IFriendshipActionCallback getModifyFriendGroupName(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getModifyFriendGroupName(this.swigCPtr, this, paramArrayOfByte1, paramArrayOfByte2, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipActionCallback getMove2FriendGroup(String paramString1, String paramString2, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getMove2FriendGroup(this.swigCPtr, this, paramString1, paramString2, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public IFriendshipActionCallback getSetSnsProfileCB(SNSProfileItemVec paramSNSProfileItemVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    long l = internalJNI.FriendshipProxy_getSetSnsProfileCB(this.swigCPtr, this, SNSProfileItemVec.getCPtr(paramSNSProfileItemVec), paramSNSProfileItemVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
    if (l == 0L) {
      return null;
    }
    return new IFriendshipActionCallback(l, false);
  }
  
  public FriendProxyStatus getStatus()
  {
    return FriendProxyStatus.swigToEnum(internalJNI.FriendshipProxy_getStatus(this.swigCPtr, this));
  }
  
  public void init(String paramString, IFriendshipCallback paramIFriendshipCallback)
  {
    internalJNI.FriendshipProxy_init(this.swigCPtr, this, paramString, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean isEnable()
  {
    return internalJNI.FriendshipProxy_isEnable(this.swigCPtr, this);
  }
  
  public void onFriendshipEvent(SWIGTYPE_p_imcore__MsgNode paramSWIGTYPE_p_imcore__MsgNode)
  {
    internalJNI.FriendshipProxy_onFriendshipEvent(this.swigCPtr, this, SWIGTYPE_p_imcore__MsgNode.getCPtr(paramSWIGTYPE_p_imcore__MsgNode));
  }
  
  public void reset(String paramString)
  {
    internalJNI.FriendshipProxy_reset(this.swigCPtr, this, paramString);
  }
  
  public void setEnable(boolean paramBoolean)
  {
    internalJNI.FriendshipProxy_setEnable(this.swigCPtr, this, paramBoolean);
  }
  
  public void setFriendFlags(long paramLong, StrVec paramStrVec)
  {
    internalJNI.FriendshipProxy_setFriendFlags(this.swigCPtr, this, paramLong, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void setListner(IFriendshipProxyListener paramIFriendshipProxyListener)
  {
    internalJNI.FriendshipProxy_setListner(this.swigCPtr, this, IFriendshipProxyListener.getCPtr(paramIFriendshipProxyListener), paramIFriendshipProxyListener);
  }
  
  public void syncProxy()
  {
    internalJNI.FriendshipProxy_syncProxy(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendshipProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */