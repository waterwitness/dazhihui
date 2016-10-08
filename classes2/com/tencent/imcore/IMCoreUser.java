package com.tencent.imcore;

public class IMCoreUser
{
  private boolean swigCMemOwn;
  private long swigCPtr;
  
  protected IMCoreUser(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IMCoreUser paramIMCoreUser)
  {
    if (paramIMCoreUser == null) {
      return 0L;
    }
    return paramIMCoreUser.swigCPtr;
  }
  
  public String a2()
  {
    return internalJNI.IMCoreUser_a2(this.swigCPtr, this);
  }
  
  public int applyDownloadFile(String paramString, long paramLong, IApplyDownloadFileCallback paramIApplyDownloadFileCallback)
  {
    return internalJNI.IMCoreUser_applyDownloadFile(this.swigCPtr, this, paramString, paramLong, IApplyDownloadFileCallback.getCPtr(paramIApplyDownloadFileCallback), paramIApplyDownloadFileCallback);
  }
  
  public int cancelAllPicupTask()
  {
    return internalJNI.IMCoreUser_cancelAllPicupTask(this.swigCPtr, this);
  }
  
  public void cancelTask(long paramLong)
  {
    internalJNI.IMCoreUser_cancelTask(this.swigCPtr, this, paramLong);
  }
  
  public void clearCookie()
  {
    internalJNI.IMCoreUser_clearCookie(this.swigCPtr, this);
  }
  
  public int compressPic(String paramString1, String paramString2, int paramInt)
  {
    return internalJNI.IMCoreUser_compressPic(this.swigCPtr, this, paramString1, paramString2, paramInt);
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
          internalJNI.delete_IMCoreUser(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean deleteGroupMsgs(String paramString, long paramLong1, long paramLong2)
  {
    return internalJNI.IMCoreUser_deleteGroupMsgs(this.swigCPtr, this, paramString, paramLong1, paramLong2);
  }
  
  public boolean deleteSession(SessionType paramSessionType, String paramString)
  {
    return internalJNI.IMCoreUser_deleteSession(this.swigCPtr, this, paramSessionType.swigValue(), paramString);
  }
  
  public boolean deleteSessionAndMsgs(SessionType paramSessionType, String paramString)
  {
    return internalJNI.IMCoreUser_deleteSessionAndMsgs(this.swigCPtr, this, paramSessionType.swigValue(), paramString);
  }
  
  public boolean fake()
  {
    return internalJNI.IMCoreUser_fake(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public IAvInviteCallBack getAvInviteCallBack()
  {
    long l = internalJNI.IMCoreUser_getAvInviteCallBack(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new IAvInviteCallBack(l, false);
  }
  
  public FileTranser getFileTranser()
  {
    long l = internalJNI.IMCoreUser_getFileTranser(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FileTranser(l, false);
  }
  
  public FriendshipManager getFriendShipMgr()
  {
    return new FriendshipManager(internalJNI.IMCoreUser_getFriendShipMgr(this.swigCPtr, this), false);
  }
  
  public FriendshipProxy getFriendShipPrxy()
  {
    return new FriendshipProxy(internalJNI.IMCoreUser_getFriendShipPrxy(this.swigCPtr, this), false);
  }
  
  public GroupAssistant getGroupAssistant()
  {
    return new GroupAssistant(internalJNI.IMCoreUser_getGroupAssistant(this.swigCPtr, this), false);
  }
  
  public GroupManager getGroupMgr()
  {
    return new GroupManager(internalJNI.IMCoreUser_getGroupMgr(this.swigCPtr, this), false);
  }
  
  public IGroupTipsEventCallback getGroupTipsEventCallback()
  {
    long l = internalJNI.IMCoreUser_getGroupTipsEventCallback(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new IGroupTipsEventCallback(l, false);
  }
  
  public IGroupUpdateCallback getGroupUpdateCallback()
  {
    long l = internalJNI.IMCoreUser_getGroupUpdateCallback(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new IGroupUpdateCallback(l, false);
  }
  
  public int getImageUploadProgrss(long paramLong)
  {
    return internalJNI.IMCoreUser_getImageUploadProgrss(this.swigCPtr, this, paramLong);
  }
  
  public FriendProfile getSelfProfile()
  {
    long l = internalJNI.IMCoreUser_getSelfProfile(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfile(l, false);
  }
  
  public Session getSession(long paramLong)
  {
    return new Session(internalJNI.IMCoreUser_getSession__SWIG_0(this.swigCPtr, this, paramLong), true);
  }
  
  public Session getSession(SessionType paramSessionType, String paramString)
  {
    return new Session(internalJNI.IMCoreUser_getSession__SWIG_1(this.swigCPtr, this, paramSessionType.swigValue(), paramString), true);
  }
  
  public StatusManager getStatusMgr()
  {
    return new StatusManager(internalJNI.IMCoreUser_getStatusMgr(this.swigCPtr, this), false);
  }
  
  public boolean httpRequest(HttpMethod paramHttpMethod, String paramString, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    return internalJNI.IMCoreUser_httpRequest(this.swigCPtr, this, paramHttpMethod.swigValue(), paramString, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
  }
  
  public String ip()
  {
    return internalJNI.IMCoreUser_ip(this.swigCPtr, this);
  }
  
  public void loginSyncCache()
  {
    internalJNI.IMCoreUser_loginSyncCache(this.swigCPtr, this);
  }
  
  public void loginSyncMsg()
  {
    internalJNI.IMCoreUser_loginSyncMsg(this.swigCPtr, this);
  }
  
  public int manualPush(byte[] paramArrayOfByte)
  {
    return internalJNI.IMCoreUser_manualPush(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public Session newSession(SessionType paramSessionType, String paramString)
  {
    return new Session(internalJNI.IMCoreUser_newSession(this.swigCPtr, this, paramSessionType.swigValue(), paramString), true);
  }
  
  public boolean runOnIOThread(SWIGTYPE_p_std__functionT_void_fF_t paramSWIGTYPE_p_std__functionT_void_fF_t)
  {
    return internalJNI.IMCoreUser_runOnIOThread(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(paramSWIGTYPE_p_std__functionT_void_fF_t));
  }
  
  public boolean runOnMainThread(SWIGTYPE_p_std__functionT_void_fF_t paramSWIGTYPE_p_std__functionT_void_fF_t)
  {
    return internalJNI.IMCoreUser_runOnMainThread(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(paramSWIGTYPE_p_std__functionT_void_fF_t));
  }
  
  public boolean runOnTaskThread(SWIGTYPE_p_std__functionT_void_fF_t paramSWIGTYPE_p_std__functionT_void_fF_t)
  {
    return internalJNI.IMCoreUser_runOnTaskThread(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(paramSWIGTYPE_p_std__functionT_void_fF_t));
  }
  
  public boolean sSORequest(String paramString, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure)
  {
    return internalJNI.IMCoreUser_sSORequest__SWIG_1(this.swigCPtr, this, paramString, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure);
  }
  
  public boolean sSORequest(String paramString, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure, long paramLong)
  {
    return internalJNI.IMCoreUser_sSORequest__SWIG_0(this.swigCPtr, this, paramString, paramArrayOfByte, EnvRequestClosure.getCPtr(paramEnvRequestClosure), paramEnvRequestClosure, paramLong);
  }
  
  public void saveSelfProfile(FriendProfile paramFriendProfile)
  {
    internalJNI.IMCoreUser_saveSelfProfile(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public long sdkAppId()
  {
    return internalJNI.IMCoreUser_sdkAppId(this.swigCPtr, this);
  }
  
  public void sendMsgToMultiUsers(StrVec paramStrVec, Msg paramMsg, IBatchOprCallback paramIBatchOprCallback)
  {
    internalJNI.IMCoreUser_sendMsgToMultiUsers(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, Msg.getCPtr(paramMsg), paramMsg, IBatchOprCallback.getCPtr(paramIBatchOprCallback), paramIBatchOprCallback);
  }
  
  public long sessionCount()
  {
    return internalJNI.IMCoreUser_sessionCount(this.swigCPtr, this);
  }
  
  public void setA2(String paramString)
  {
    internalJNI.IMCoreUser_setA2(this.swigCPtr, this, paramString);
  }
  
  public void setAvInviteCallBack(IAvInviteCallBack paramIAvInviteCallBack)
  {
    internalJNI.IMCoreUser_setAvInviteCallBack(this.swigCPtr, this, IAvInviteCallBack.getCPtr(paramIAvInviteCallBack), paramIAvInviteCallBack);
  }
  
  public void setGroupTipsEventCallback(IGroupTipsEventCallback paramIGroupTipsEventCallback)
  {
    internalJNI.IMCoreUser_setGroupTipsEventCallback(this.swigCPtr, this, IGroupTipsEventCallback.getCPtr(paramIGroupTipsEventCallback), paramIGroupTipsEventCallback);
  }
  
  public void setGroupUpdateCallback(IGroupUpdateCallback paramIGroupUpdateCallback)
  {
    internalJNI.IMCoreUser_setGroupUpdateCallback(this.swigCPtr, this, IGroupUpdateCallback.getCPtr(paramIGroupUpdateCallback), paramIGroupUpdateCallback);
  }
  
  public void setIp(String paramString)
  {
    internalJNI.IMCoreUser_setIp(this.swigCPtr, this, paramString);
  }
  
  public boolean setLogin(String paramString, boolean paramBoolean)
  {
    return internalJNI.IMCoreUser_setLogin(this.swigCPtr, this, paramString, paramBoolean);
  }
  
  public void setSdkAppId(long paramLong)
  {
    internalJNI.IMCoreUser_setSdkAppId(this.swigCPtr, this, paramLong);
  }
  
  public long submitUploadTask(String paramString, IImageUploadCallback paramIImageUploadCallback)
  {
    return internalJNI.IMCoreUser_submitUploadTask__SWIG_1(this.swigCPtr, this, paramString, IImageUploadCallback.getCPtr(paramIImageUploadCallback), paramIImageUploadCallback);
  }
  
  public long submitUploadTask(String paramString, IImageUploadCallback paramIImageUploadCallback, int paramInt)
  {
    return internalJNI.IMCoreUser_submitUploadTask__SWIG_0(this.swigCPtr, this, paramString, IImageUploadCallback.getCPtr(paramIImageUploadCallback), paramIImageUploadCallback, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IMCoreUser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */