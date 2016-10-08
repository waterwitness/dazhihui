package com.tencent.imcore;

public class IMCore
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected IMCore(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public static IMCore get()
  {
    return new IMCore(internalJNI.IMCore_get(), false);
  }
  
  protected static long getCPtr(IMCore paramIMCore)
  {
    if (paramIMCore == null) {
      return 0L;
    }
    return paramIMCore.swigCPtr;
  }
  
  public void clearLog(String paramString, long paramLong)
  {
    internalJNI.IMCore_clearLog__SWIG_3(this.swigCPtr, this, paramString, paramLong);
  }
  
  public void clearLog(String paramString1, long paramLong, String paramString2)
  {
    internalJNI.IMCore_clearLog__SWIG_2(this.swigCPtr, this, paramString1, paramLong, paramString2);
  }
  
  public void clearLog(String paramString1, long paramLong1, String paramString2, long paramLong2)
  {
    internalJNI.IMCore_clearLog__SWIG_1(this.swigCPtr, this, paramString1, paramLong1, paramString2, paramLong2);
  }
  
  public void clearLog(String paramString1, long paramLong1, String paramString2, long paramLong2, int paramInt)
  {
    internalJNI.IMCore_clearLog__SWIG_0(this.swigCPtr, this, paramString1, paramLong1, paramString2, paramLong2, paramInt);
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr == 0L) {
        break label43;
      }
      if (this.swigCMemOwn)
      {
        this.swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
    }
    finally {}
    this.swigCPtr = 0L;
    label43:
  }
  
  public void disableAutoReport()
  {
    internalJNI.IMCore_disableAutoReport(this.swigCPtr, this);
  }
  
  public void disableStorage()
  {
    internalJNI.IMCore_disableStorage(this.swigCPtr, this);
  }
  
  public String encodeHttpSsoListReq(String paramString1, String paramString2, boolean paramBoolean, String paramString3, long paramLong)
  {
    return internalJNI.IMCore_encodeHttpSsoListReq(this.swigCPtr, this, paramString1, paramString2, paramBoolean, paramString3, paramLong);
  }
  
  public Context getContext()
  {
    return new Context(internalJNI.IMCore_getContext(this.swigCPtr, this), false);
  }
  
  public boolean getRecentContactEnableFlag()
  {
    return internalJNI.IMCore_getRecentContactEnableFlag(this.swigCPtr, this);
  }
  
  public IMCoreUser getUser(String paramString)
  {
    long l = internalJNI.IMCore_getUser(this.swigCPtr, this, paramString);
    if (l == 0L) {
      return null;
    }
    return new IMCoreUser(l, true);
  }
  
  public String getVersion(int paramInt)
  {
    return internalJNI.IMCore_getVersion(this.swigCPtr, this, paramInt);
  }
  
  public boolean initOpenIM(String paramString1, String paramString2, IEnv paramIEnv)
  {
    return internalJNI.IMCore_initOpenIM(this.swigCPtr, this, paramString1, paramString2, IEnv.getCPtr(paramIEnv), paramIEnv);
  }
  
  public int initUser(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5, String paramString6, INotify paramINotify, FriendshipProxyConfig paramFriendshipProxyConfig, GroupAssistantConfig paramGroupAssistantConfig, IInit paramIInit)
  {
    return internalJNI.IMCore_initUser(this.swigCPtr, this, paramInt, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, paramString5, paramString6, INotify.getCPtr(paramINotify), paramINotify, FriendshipProxyConfig.getCPtr(paramFriendshipProxyConfig), paramFriendshipProxyConfig, GroupAssistantConfig.getCPtr(paramGroupAssistantConfig), paramGroupAssistantConfig, IInit.getCPtr(paramIInit), paramIInit);
  }
  
  public boolean isStorageEnabled()
  {
    return internalJNI.IMCore_isStorageEnabled(this.swigCPtr, this);
  }
  
  public void lOGGERINIT(String paramString1, String paramString2, boolean paramBoolean, ILogMsgCallback paramILogMsgCallback)
  {
    internalJNI.IMCore_lOGGERINIT(this.swigCPtr, this, paramString1, paramString2, paramBoolean, ILogMsgCallback.getCPtr(paramILogMsgCallback), paramILogMsgCallback);
  }
  
  public void lOGGERLOG(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4)
  {
    internalJNI.IMCore_lOGGERLOG(this.swigCPtr, this, paramInt1, paramString1, paramInt2, paramString2, paramString3, paramString4);
  }
  
  public void lOGGERSETLOGCBLEVEL(String paramString)
  {
    internalJNI.IMCore_lOGGERSETLOGCBLEVEL(this.swigCPtr, this, paramString);
  }
  
  public SsoAddrVec parseHttpSsoListRsp(String paramString)
  {
    return new SsoAddrVec(internalJNI.IMCore_parseHttpSsoListRsp(this.swigCPtr, this, paramString), true);
  }
  
  public SsoAddrVec parseSsoList(byte[] paramArrayOfByte)
  {
    return new SsoAddrVec(internalJNI.IMCore_parseSsoList(this.swigCPtr, this, paramArrayOfByte), true);
  }
  
  public void setContext(Context paramContext)
  {
    internalJNI.IMCore_setContext(this.swigCPtr, this, Context.getCPtr(paramContext), paramContext);
  }
  
  public void setRecentContactEnableFlag(boolean paramBoolean)
  {
    internalJNI.IMCore_setRecentContactEnableFlag(this.swigCPtr, this, paramBoolean);
  }
  
  public int unInitUser(String paramString)
  {
    return internalJNI.IMCore_unInitUser(this.swigCPtr, this, paramString);
  }
  
  public boolean uploadLogFile(String paramString1, String paramString2, String paramString3)
  {
    return internalJNI.IMCore_uploadLogFile(this.swigCPtr, this, paramString1, paramString2, paramString3);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IMCore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */