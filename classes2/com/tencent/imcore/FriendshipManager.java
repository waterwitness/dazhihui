package com.tencent.imcore;

public class FriendshipManager
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected FriendshipManager(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public FriendshipManager(String paramString)
  {
    this(internalJNI.new_FriendshipManager(paramString), true);
  }
  
  protected static long getCPtr(FriendshipManager paramFriendshipManager)
  {
    if (paramFriendshipManager == null) {
      return 0L;
    }
    return paramFriendshipManager.swigCPtr;
  }
  
  public boolean addBlackList(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_addBlackList(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean addFriend(FriendProfileVec paramFriendProfileVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_addFriend(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean addFriendToMap(FriendProfile paramFriendProfile)
  {
    return internalJNI.FriendshipManager_addFriendToMap(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public boolean addFriends2Group(byte[] paramArrayOfByte, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_addFriends2Group(this.swigCPtr, this, paramArrayOfByte, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean checkFriend(StrVec paramStrVec, String paramString, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_checkFriend(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, paramString, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public void clearAllData()
  {
    internalJNI.FriendshipManager_clearAllData(this.swigCPtr, this);
  }
  
  public boolean createFriendGroup(BytesVec paramBytesVec, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_createFriendGroup(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean delBlackList(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_delBlackList(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean delFriend(FriendDeleteType paramFriendDeleteType, FriendProfileVec paramFriendProfileVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_delFriend(this.swigCPtr, this, paramFriendDeleteType.swigValue(), FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean delFriendToMap(FriendProfile paramFriendProfile)
  {
    return internalJNI.FriendshipManager_delFriendToMap(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public boolean delFriendsFromGroup(byte[] paramArrayOfByte, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_delFriendsFromGroup(this.swigCPtr, this, paramArrayOfByte, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
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
          internalJNI.delete_FriendshipManager(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean deleteDecide(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_deleteDecide(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean deleteFriendGroup(BytesVec paramBytesVec, IFriendshipCallback paramIFriendshipCallback)
  {
    return internalJNI.FriendshipManager_deleteFriendGroup(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean deletePendency(PendencyType paramPendencyType, StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_deletePendency(this.swigCPtr, this, paramPendencyType.swigValue(), StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean deleteRecommend(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_deleteRecommend(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean doResponse(FriendProfileVec paramFriendProfileVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_doResponse(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public boolean getBlackList(IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getBlackList(this.swigCPtr, this, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean getFriendGroup(BytesVec paramBytesVec, boolean paramBoolean, IFriendGroupCallback paramIFriendGroupCallback)
  {
    return internalJNI.FriendshipManager_getFriendGroup(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec, paramBoolean, IFriendGroupCallback.getCPtr(paramIFriendGroupCallback), paramIFriendGroupCallback);
  }
  
  public boolean getFriendList(long paramLong, StrVec paramStrVec, FriendMetaInfo paramFriendMetaInfo, IFriendshipProxyActionCallback paramIFriendshipProxyActionCallback)
  {
    return internalJNI.FriendshipManager_getFriendList__SWIG_2(this.swigCPtr, this, paramLong, StrVec.getCPtr(paramStrVec), paramStrVec, FriendMetaInfo.getCPtr(paramFriendMetaInfo), paramFriendMetaInfo, IFriendshipProxyActionCallback.getCPtr(paramIFriendshipProxyActionCallback), paramIFriendshipProxyActionCallback);
  }
  
  public boolean getFriendList(GetProfileOption paramGetProfileOption, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getFriendList__SWIG_1(this.swigCPtr, this, GetProfileOption.getCPtr(paramGetProfileOption), paramGetProfileOption, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean getFriendList(IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getFriendList__SWIG_0(this.swigCPtr, this, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean getFriendListV2(long paramLong, StrVec paramStrVec, FriendMetaInfo paramFriendMetaInfo, IFriendshipGetFriendV2Callback paramIFriendshipGetFriendV2Callback)
  {
    return internalJNI.FriendshipManager_getFriendListV2(this.swigCPtr, this, paramLong, StrVec.getCPtr(paramStrVec), paramStrVec, FriendMetaInfo.getCPtr(paramFriendMetaInfo), paramFriendMetaInfo, IFriendshipGetFriendV2Callback.getCPtr(paramIFriendshipGetFriendV2Callback), paramIFriendshipGetFriendV2Callback);
  }
  
  public boolean getFriendProfile(StrVec paramStrVec, GetProfileOption paramGetProfileOption, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getFriendProfile(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, GetProfileOption.getCPtr(paramGetProfileOption), paramGetProfileOption, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean getFutureFriends(long paramLong1, long paramLong2, StrVec paramStrVec, FutureFriendMeta paramFutureFriendMeta, IFriendshipGetFutureCallback paramIFriendshipGetFutureCallback)
  {
    return internalJNI.FriendshipManager_getFutureFriends(this.swigCPtr, this, paramLong1, paramLong2, StrVec.getCPtr(paramStrVec), paramStrVec, FutureFriendMeta.getCPtr(paramFutureFriendMeta), paramFutureFriendMeta, IFriendshipGetFutureCallback.getCPtr(paramIFriendshipGetFutureCallback), paramIFriendshipGetFutureCallback);
  }
  
  public boolean getPendencyFromServer(FriendPendencyMeta paramFriendPendencyMeta, PendencyType paramPendencyType, IFriendshipPendencyCallback paramIFriendshipPendencyCallback)
  {
    return internalJNI.FriendshipManager_getPendencyFromServer(this.swigCPtr, this, FriendPendencyMeta.getCPtr(paramFriendPendencyMeta), paramFriendPendencyMeta, paramPendencyType.swigValue(), IFriendshipPendencyCallback.getCPtr(paramIFriendshipPendencyCallback), paramIFriendshipPendencyCallback);
  }
  
  public boolean getProfile(StrVec paramStrVec, GetProfileOption paramGetProfileOption, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getProfile__SWIG_1(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, GetProfileOption.getCPtr(paramGetProfileOption), paramGetProfileOption, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean getProfile(StrVec paramStrVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_getProfile__SWIG_0(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean modifyFriendGroupName(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_modifyFriendGroupName(this.swigCPtr, this, paramArrayOfByte1, paramArrayOfByte2, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public boolean pendencyReport(long paramLong, IFriendshipCallback paramIFriendshipCallback)
  {
    return internalJNI.FriendshipManager_pendencyReport(this.swigCPtr, this, paramLong, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean recommendReport(long paramLong, IFriendshipCallback paramIFriendshipCallback)
  {
    return internalJNI.FriendshipManager_recommendReport(this.swigCPtr, this, paramLong, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean searchFriendsUseNickName(String paramString, long paramLong1, long paramLong2, IFriendshipActionCallbackV2 paramIFriendshipActionCallbackV2)
  {
    return internalJNI.FriendshipManager_searchFriendsUseNickName(this.swigCPtr, this, paramString, paramLong1, paramLong2, IFriendshipActionCallbackV2.getCPtr(paramIFriendshipActionCallbackV2), paramIFriendshipActionCallbackV2);
  }
  
  public boolean searchUserUseIdentifier(String paramString, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_searchUserUseIdentifier(this.swigCPtr, this, paramString, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public void setExpire()
  {
    internalJNI.FriendshipManager_setExpire(this.swigCPtr, this);
  }
  
  public boolean setProfile(long paramLong1, String paramString, long paramLong2, IFriendshipCallback paramIFriendshipCallback)
  {
    return internalJNI.FriendshipManager_setProfile__SWIG_0(this.swigCPtr, this, paramLong1, paramString, paramLong2, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean setProfile(SetProfileOption paramSetProfileOption, IFriendshipCallback paramIFriendshipCallback)
  {
    return internalJNI.FriendshipManager_setProfile__SWIG_1(this.swigCPtr, this, SetProfileOption.getCPtr(paramSetProfileOption), paramSetProfileOption, IFriendshipCallback.getCPtr(paramIFriendshipCallback), paramIFriendshipCallback);
  }
  
  public boolean setSnsProfile(SNSProfileItemVec paramSNSProfileItemVec, IFriendshipActionCallback paramIFriendshipActionCallback)
  {
    return internalJNI.FriendshipManager_setSnsProfile(this.swigCPtr, this, SNSProfileItemVec.getCPtr(paramSNSProfileItemVec), paramSNSProfileItemVec, IFriendshipActionCallback.getCPtr(paramIFriendshipActionCallback), paramIFriendshipActionCallback);
  }
  
  public void updateFriendGroupSeq(long paramLong)
  {
    internalJNI.FriendshipManager_updateFriendGroupSeq(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendshipManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */