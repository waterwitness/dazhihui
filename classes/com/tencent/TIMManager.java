package com.tencent;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.imcore.FriendshipProxyConfig;
import com.tencent.imcore.GroupAssistantConfig;
import com.tencent.imcore.GroupSettings;
import com.tencent.imcore.IMCore;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.Session;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.statistics.BeaconUtil;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class TIMManager
{
  public static final int DEBUG = 4;
  public static final int ERROR = 1;
  public static final int INFO = 3;
  private static final int MAX_FILESIZE = 10485760;
  public static final int WARN = 2;
  static String defaultId = "";
  static ConcurrentHashMap<String, TIMManager> mutiMap = new ConcurrentHashMap();
  private static final String tag = "imsdk.TIMManager";
  private TIMConnListener connListener = null;
  private IMCoreUser coreUser;
  private TIMConversation defaultConversation = new TIMConversation("");
  private TIMExceptionListener exceptionListener;
  private TIMFriendshipProxyListener friendshipProxyListener;
  private TIMFriendshipSettings friendshipSettings = new TIMFriendshipSettings();
  private TIMGroupAssistantListener groupAssistantListener;
  private TIMGroupEventListener groupEventListener;
  private TIMGroupSettings groupSettings = new TIMGroupSettings();
  private String identification = "";
  private boolean isFriendshipStorageEnabled = false;
  private boolean isGrpStorageEnabled = false;
  private TIMGroupMemberUpdateListener memberUpdateListener;
  private TIMMessageListener msgListener = null;
  private HashSet<TIMMessageListener> msgListeners = new HashSet();
  private HashSet<TIMMessageUpdateListener> msgUpListeners = new HashSet();
  private TIMOfflinePushListener offlinePushListener;
  private TIMRefreshListener refreshListener;
  private TIMUploadProgressListener uploadProgressListener = null;
  private TIMUserStatusListener userStatusListener = null;
  
  private TIMManager(String paramString)
  {
    this.identification = paramString;
  }
  
  private void ensureId(String paramString)
  {
    if ((!TextUtils.isEmpty(this.identification)) && (!paramString.equals(this.identification))) {
      IMMsfCoreProxy.get().logout(this.identification);
    }
    setIdentification(paramString, true);
    this.coreUser = null;
    if (TextUtils.isEmpty(this.defaultConversation.getIdentifer())) {
      this.defaultConversation.setIdentifer(paramString);
    }
  }
  
  public static TIMManager getInstance()
  {
    return getInstanceById(defaultId);
  }
  
  public static TIMManager getInstanceById(String paramString)
  {
    Object localObject;
    if (TextUtils.isEmpty(paramString)) {
      localObject = defaultId;
    }
    while (mutiMap.containsKey(localObject))
    {
      return (TIMManager)mutiMap.get(localObject);
      localObject = paramString;
      if (TextUtils.isEmpty(defaultId))
      {
        if (mutiMap.containsKey(defaultId))
        {
          localObject = (TIMManager)mutiMap.get(defaultId);
          defaultId = paramString;
          ((TIMManager)localObject).setIdentification(paramString, false);
          return (TIMManager)localObject;
        }
        defaultId = paramString;
        QLog.d("imsdk.TIMManager", 1, "no default TIMManager->id:" + mutiMap.get(defaultId));
        localObject = paramString;
      }
    }
    if ((((String)localObject).equals(defaultId)) && (mutiMap.containsKey("")))
    {
      QLog.d("imsdk.TIMManager", 1, "getInstanceById->same id:" + (String)localObject);
      paramString = (TIMManager)mutiMap.get("");
      mutiMap.put(defaultId, paramString);
      return paramString;
    }
    paramString = new TIMManager((String)localObject);
    mutiMap.put(localObject, paramString);
    QLog.w("imsdk.TIMManager", 1, "TIMManager|add new TIMManager-> id:" + (String)localObject + "/" + paramString);
    return paramString;
  }
  
  public static ConcurrentHashMap<String, TIMManager> getMutiTIMMangerMap()
  {
    return mutiMap;
  }
  
  public void addMessageListener(TIMMessageListener paramTIMMessageListener)
  {
    this.msgListeners.add(paramTIMMessageListener);
  }
  
  public void addMessageUpdateListener(TIMMessageUpdateListener paramTIMMessageUpdateListener)
  {
    this.msgUpListeners.add(paramTIMMessageUpdateListener);
  }
  
  public boolean deleteConversation(TIMConversationType paramTIMConversationType, String paramString)
  {
    int j = 0;
    if (!IMCoreWrapper.get().isReady()) {
      return false;
    }
    if (paramString == null)
    {
      QLog.e("imsdk.TIMManager", 1, "delete conversation with null peer");
      return false;
    }
    QLog.i("imsdk.TIMManager", 1, "before deleteConversation");
    int k = (int)getConversationCount();
    int i = 0;
    while (i < k)
    {
      getConversationByIndex(i);
      i += 1;
    }
    paramTIMConversationType = TIMConversationType.getType(paramTIMConversationType);
    boolean bool = getCoreUser().deleteSession(paramTIMConversationType, paramString);
    QLog.i("imsdk.TIMManager", 1, "after deleteConversation");
    k = (int)getConversationCount();
    i = j;
    while (i < k)
    {
      getConversationByIndex(i);
      i += 1;
    }
    return bool;
  }
  
  public boolean deleteConversationAndLocalMsgs(TIMConversationType paramTIMConversationType, String paramString)
  {
    int j = 0;
    if (!IMCoreWrapper.get().isReady()) {
      return false;
    }
    if (paramString == null)
    {
      QLog.e("imsdk.TIMManager", 1, "delete conversation with null peer");
      return false;
    }
    QLog.i("imsdk.TIMManager", 1, "before deleteConversation");
    int k = (int)getConversationCount();
    int i = 0;
    while (i < k)
    {
      getConversationByIndex(i);
      i += 1;
    }
    paramTIMConversationType = TIMConversationType.getType(paramTIMConversationType);
    boolean bool = getCoreUser().deleteSessionAndMsgs(paramTIMConversationType, paramString);
    QLog.i("imsdk.TIMManager", 1, "after deleteConversation");
    k = (int)getConversationCount();
    i = j;
    while (i < k)
    {
      getConversationByIndex(i);
      i += 1;
    }
    return bool;
  }
  
  public void disableAutoReport()
  {
    if ((IMMsfCoreProxy.get().inited) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().disableAutoReport();
    }
  }
  
  public void disableBeaconReport()
  {
    BeaconUtil.setEnable(false);
  }
  
  public void disableCrashReport()
  {
    IMMsfCoreProxy.get().disableCrashReport();
  }
  
  public void disableRecentContact()
  {
    if ((IMMsfCoreProxy.get().inited) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().setRecentContactEnableFlag(false);
    }
  }
  
  public void disableStorage()
  {
    if ((IMMsfCoreProxy.get().inited) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().disableStorage();
    }
  }
  
  public void enableFriendshipStorage(boolean paramBoolean)
  {
    this.isFriendshipStorageEnabled = paramBoolean;
  }
  
  public void enableGroupInfoStorage(boolean paramBoolean)
  {
    this.isGrpStorageEnabled = paramBoolean;
  }
  
  public String getAccountType()
  {
    return IMMsfCoreProxy.get().getUidType();
  }
  
  public TIMConnListener getConnectionListener()
  {
    return this.connListener;
  }
  
  public TIMConversation getConversation(TIMConversationType paramTIMConversationType, String paramString)
  {
    if (!IMCoreWrapper.get().isReady()) {
      return this.defaultConversation;
    }
    if (paramString == null)
    {
      QLog.e("imsdk.TIMManager", 1, "get conversation with null peer");
      return this.defaultConversation;
    }
    TIMConversation localTIMConversation = new TIMConversation(this.identification);
    localTIMConversation.setPeer(paramString);
    localTIMConversation.setType(paramTIMConversationType);
    return localTIMConversation;
  }
  
  public TIMConversation getConversationByIndex(long paramLong)
  {
    if (!IMCoreWrapper.get().isReady()) {
      return this.defaultConversation;
    }
    Session localSession = getCoreUser().getSession(paramLong);
    TIMConversation localTIMConversation = new TIMConversation(this.identification);
    localTIMConversation.fromSession(localSession);
    QLog.i("imsdk.TIMManager", 1, "getConversationByIndex: " + paramLong + " type: " + localTIMConversation.getType() + " peer: " + localTIMConversation.getPeer());
    return localTIMConversation;
  }
  
  public long getConversationCount()
  {
    if (!IMCoreWrapper.get().isReady()) {
      return 0L;
    }
    long l = getCoreUser().sessionCount();
    QLog.i("imsdk.TIMManager", 1, "getConversationCount: " + l);
    return l;
  }
  
  public IMCoreUser getCoreUser()
  {
    if (this.coreUser == null)
    {
      QLog.w("imsdk.TIMManager", 1, "TIMManager|getCoreUser reload user from: " + this.identification);
      this.coreUser = IMCore.get().getUser(this.identification);
    }
    return this.coreUser;
  }
  
  public TIMExceptionListener getExceptionListener()
  {
    return this.exceptionListener;
  }
  
  String getFileCachePath()
  {
    return IMCoreWrapper.get().getFileCachePath();
  }
  
  TIMFriendshipProxyListener getFriendshipProxyListener()
  {
    return this.friendshipProxyListener;
  }
  
  TIMFriendshipSettings getFriendshipSettings()
  {
    return this.friendshipSettings;
  }
  
  TIMGroupAssistantListener getGroupAssistantListener()
  {
    return this.groupAssistantListener;
  }
  
  TIMGroupEventListener getGroupEventListener()
  {
    return this.groupEventListener;
  }
  
  TIMGroupMemberUpdateListener getGroupMemberUpdateListener()
  {
    return this.memberUpdateListener;
  }
  
  TIMGroupSettings getGroupSettings()
  {
    return this.groupSettings;
  }
  
  public String getIdentification()
  {
    return this.identification;
  }
  
  public boolean getIsLogPrintEnabled()
  {
    return IMCoreWrapper.get().getIsLogPrintEnabled();
  }
  
  public TIMLogLevel getLogLevel()
  {
    return IMCoreWrapper.get().getLogLevel();
  }
  
  public String getLogPath()
  {
    return IMCoreWrapper.get().getLogPath();
  }
  
  public String getLoginUser()
  {
    return this.identification;
  }
  
  Set<TIMMessageListener> getMessageListeners()
  {
    return this.msgListeners;
  }
  
  Set<TIMMessageUpdateListener> getMessageUpdateListeners()
  {
    return this.msgUpListeners;
  }
  
  public TIMNetworkStatus getNetworkStatus()
  {
    return IMMsfCoreProxy.get().getNetworkStatus();
  }
  
  public TIMOfflinePushListener getOfflinePushListener()
  {
    return this.offlinePushListener;
  }
  
  TIMRefreshListener getRefreshListener()
  {
    return this.refreshListener;
  }
  
  public int getSdkAppId()
  {
    return IMMsfCoreProxy.get().getSdkAppId();
  }
  
  public long getServerTimeDiff()
  {
    return QALSDKManager.getInstance().getServetTimeSecondInterv();
  }
  
  public TIMUploadProgressListener getUploadProgressListener()
  {
    return this.uploadProgressListener;
  }
  
  public TIMUserStatusListener getUserStatusListener()
  {
    return this.userStatusListener;
  }
  
  public String getVersion()
  {
    return "1.9.2" + ".6447.6451";
  }
  
  String getVideoCachePath()
  {
    return IMCoreWrapper.get().getVideoCachePath();
  }
  
  public void init(Context paramContext)
  {
    if ((IMMsfCoreProxy.get().init(paramContext)) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().initOpenIM(IMCoreWrapper.get().getGateWayIp(), paramContext.getFilesDir().toString(), ʻ.a());
    }
    QLog.d("imsdk.TIMManager", 1, "init finished");
  }
  
  public void init(Context paramContext, int paramInt)
  {
    if ((IMMsfCoreProxy.get().init(paramContext, paramInt)) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().initOpenIM("", paramContext.getFilesDir().toString(), ʻ.a());
    }
    QLog.d("imsdk.TIMManager", 1, "init finished");
  }
  
  public void init(Context paramContext, int paramInt, String paramString)
  {
    if ((IMMsfCoreProxy.get().init(paramContext, paramInt, paramString)) && (IMMsfCoreProxy.get().getMode() == 1)) {
      IMCore.get().initOpenIM("", paramContext.getFilesDir().toString(), ʻ.a());
    }
    QLog.d("imsdk.TIMManager", 1, "init finished");
  }
  
  public void initFriendshipSettings(long paramLong, List<String> paramList)
  {
    this.friendshipSettings.setSettings(paramLong, paramList);
  }
  
  public void initGroupSettings(TIMGroupSettings paramTIMGroupSettings)
  {
    if (paramTIMGroupSettings != null) {
      this.groupSettings = paramTIMGroupSettings;
    }
  }
  
  public void initLogSettings(boolean paramBoolean, String paramString)
  {
    if (!IMMsfCoreProxy.get().inited) {
      IMCoreWrapper.get().initLogSettings(paramBoolean, paramString);
    }
  }
  
  public void initStorage(int paramInt, TIMUser paramTIMUser, String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {}
    while ((!IMMsfCoreProxy.get().inited) || (IMMsfCoreProxy.get().getMode() != 1)) {
      return;
    }
    this.identification = paramTIMUser.getIdentifier();
    paramString = new FriendshipProxyConfig();
    paramString.setEnable(isFriendshipStorageEnabled());
    setFriendshipConfig(paramString);
    paramString.setListener(new IMCoreFriendshipProxyCallback(this.identification));
    GroupAssistantConfig localGroupAssistantConfig = new GroupAssistantConfig();
    GroupSettings localGroupSettings = new GroupSettings();
    localGroupSettings.setStorageEnabled(isGrpStorageEnabled());
    getGroupSettings().convert(localGroupSettings);
    localGroupAssistantConfig.setSettings(localGroupSettings);
    localGroupAssistantConfig.setCallback(new IMCoreGroupAssistantCallback(this.identification));
    IMCore.get().initUser(paramInt, paramTIMUser.getAccountType(), paramTIMUser.getAppIdAt3rd(), paramTIMUser.getIdentifier(), String.valueOf(0), "0".getBytes(), IMCoreWrapper.get().getGateWayIp(), IMMsfCoreProxy.get().getContext().getFilesDir().toString(), new ⁱ(paramTIMUser.getIdentifier()), paramString, localGroupAssistantConfig, new ˆᵔ(this, paramTIMCallBack));
  }
  
  public boolean isFriendshipStorageEnabled()
  {
    return this.isFriendshipStorageEnabled;
  }
  
  public boolean isGrpStorageEnabled()
  {
    return this.isGrpStorageEnabled;
  }
  
  public void log(int paramInt, String paramString1, String paramString2)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 4: 
      QLog.d(paramString1, 1, paramString2);
      return;
    case 3: 
      QLog.i(paramString1, 1, paramString2);
      return;
    case 2: 
      QLog.w(paramString1, 1, paramString2);
      return;
    }
    QLog.e(paramString1, 1, paramString2);
  }
  
  public void login(int paramInt, TIMUser paramTIMUser, String paramString, TIMCallBack paramTIMCallBack)
  {
    ensureId(paramTIMUser.getIdentifier());
    IMMsfCoreProxy.get().login(paramInt, paramTIMUser, paramString, paramTIMCallBack);
  }
  
  public void login(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    ensureId(paramString1);
    IMMsfCoreProxy.get().login(paramString1, paramString2, paramTIMCallBack);
  }
  
  public void logout()
  {
    IMMsfCoreProxy.get().logout(this.identification);
    mutiMap.remove(this.identification);
    if (defaultId.equals(this.identification))
    {
      QLog.d("imsdk.TIMManager", 1, "reset default id");
      this.identification = "";
      defaultId = "";
    }
  }
  
  public void logout(TIMCallBack paramTIMCallBack)
  {
    IMMsfCoreProxy.get().logout(this.identification, paramTIMCallBack);
    mutiMap.remove(this.identification);
    if (defaultId.equals(this.identification))
    {
      QLog.d("imsdk.TIMManager", 1, "reset default id");
      this.identification = "";
      defaultId = "";
    }
  }
  
  public void removeMessageListener(TIMMessageListener paramTIMMessageListener)
  {
    this.msgListeners.remove(paramTIMMessageListener);
  }
  
  public void removeMessageUpdateListener(TIMMessageUpdateListener paramTIMMessageUpdateListener)
  {
    this.msgUpListeners.remove(paramTIMMessageUpdateListener);
  }
  
  public void sendMessageToMultiUsers(List<String> paramList, TIMMessage paramTIMMessage, TIMSendMsgToMultiUserCallback paramTIMSendMsgToMultiUserCallback)
  {
    if (paramTIMSendMsgToMultiUserCallback == null) {
      return;
    }
    if ((paramList == null) || (paramList.size() == 0) || (paramTIMMessage == null))
    {
      paramTIMSendMsgToMultiUserCallback.onError(6017, "invalid params", new TIMBatchOprDetailInfo());
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMSendMsgToMultiUserCallback.onError(6013, "sdk not initialized", new TIMBatchOprDetailInfo());
      return;
    }
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getCoreUser().sendMsgToMultiUsers(localStrVec, paramTIMMessage.getMsg(), new ˆⁱ(this, paramTIMSendMsgToMultiUserCallback));
  }
  
  public void setConnectionListener(TIMConnListener paramTIMConnListener)
  {
    this.connListener = paramTIMConnListener;
  }
  
  public void setCoreUser(IMCoreUser paramIMCoreUser)
  {
    this.coreUser = paramIMCoreUser;
  }
  
  public void setEnv(int paramInt) {}
  
  public void setExceptionListener(TIMExceptionListener paramTIMExceptionListener)
  {
    this.exceptionListener = paramTIMExceptionListener;
  }
  
  protected void setFriendshipConfig(FriendshipProxyConfig paramFriendshipProxyConfig)
  {
    StrVec localStrVec = new StrVec();
    if (this.friendshipSettings.getCustomFields() != null)
    {
      Iterator localIterator = this.friendshipSettings.getCustomFields().iterator();
      while (localIterator.hasNext()) {
        localStrVec.pushBack((String)localIterator.next());
      }
    }
    paramFriendshipProxyConfig.setCustom(localStrVec);
    paramFriendshipProxyConfig.setFlags(this.friendshipSettings.getFlags());
  }
  
  public void setFriendshipProxyListener(TIMFriendshipProxyListener paramTIMFriendshipProxyListener)
  {
    this.friendshipProxyListener = paramTIMFriendshipProxyListener;
  }
  
  public void setGroupAssistantListener(TIMGroupAssistantListener paramTIMGroupAssistantListener)
  {
    this.groupAssistantListener = paramTIMGroupAssistantListener;
  }
  
  public void setGroupEventListener(TIMGroupEventListener paramTIMGroupEventListener)
  {
    this.groupEventListener = paramTIMGroupEventListener;
  }
  
  public void setGroupMemberUpdateListener(TIMGroupMemberUpdateListener paramTIMGroupMemberUpdateListener)
  {
    this.memberUpdateListener = paramTIMGroupMemberUpdateListener;
  }
  
  public void setIdentification(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      QLog.w("imsdk.TIMManager", 1, "setIdentification->enter with empty id");
    }
    while ((!TextUtils.isEmpty(this.identification)) && (paramString.equals(this.identification))) {
      return;
    }
    QLog.d("imsdk.TIMManager", 1, "setIdentification->update id:" + this.identification + "=>" + paramString + ", " + paramBoolean);
    if (!TextUtils.isEmpty(this.identification))
    {
      if ((TextUtils.isEmpty(defaultId)) || (this.identification.equals(defaultId))) {
        defaultId = paramString;
      }
      if ((paramBoolean) && (!TextUtils.isEmpty(this.identification)) && (mutiMap.containsKey(this.identification)) && (mutiMap.get(this.identification) == this)) {
        mutiMap.remove(this.identification);
      }
    }
    this.identification = paramString;
    mutiMap.put(paramString, this);
  }
  
  public void setLogLevel(TIMLogLevel paramTIMLogLevel)
  {
    if (!IMMsfCoreProxy.get().inited) {
      IMCoreWrapper.get().setLogLevel(paramTIMLogLevel);
    }
  }
  
  public void setLogListenCallBackLevel(TIMLogLevel paramTIMLogLevel)
  {
    IMMsfCoreProxy.get().setTIMLogCbLevel(paramTIMLogLevel);
  }
  
  public void setLogListener(TIMLogListener paramTIMLogListener)
  {
    IMMsfCoreProxy.get().setTIMLogListener(paramTIMLogListener);
  }
  
  public void setLogPrintEanble(boolean paramBoolean)
  {
    IMCoreWrapper.get().setIsLogPrintEnabled(paramBoolean);
  }
  
  public void setLogPrintEnable(boolean paramBoolean)
  {
    IMCoreWrapper.get().setIsLogPrintEnabled(paramBoolean);
  }
  
  public void setMode(int paramInt)
  {
    IMMsfCoreProxy.get().setMode(paramInt);
  }
  
  public void setOfflinePushListener(TIMOfflinePushListener paramTIMOfflinePushListener)
  {
    QLog.d("imsdk.TIMManager", 1, "registering offline push listener");
    this.offlinePushListener = paramTIMOfflinePushListener;
    paramTIMOfflinePushListener = new ˆᵢ(this, paramTIMOfflinePushListener);
    QALSDKManager.getInstance().setOffLinePushListener("im_open_push.msg_push", paramTIMOfflinePushListener);
  }
  
  public void setRefreshLiistener(TIMRefreshListener paramTIMRefreshListener)
  {
    this.refreshListener = paramTIMRefreshListener;
  }
  
  public void setRefreshListener(TIMRefreshListener paramTIMRefreshListener)
  {
    this.refreshListener = paramTIMRefreshListener;
  }
  
  public void setUploadProgressListener(TIMUploadProgressListener paramTIMUploadProgressListener)
  {
    this.uploadProgressListener = paramTIMUploadProgressListener;
  }
  
  public void setUserStatusListener(TIMUserStatusListener paramTIMUserStatusListener)
  {
    this.userStatusListener = paramTIMUserStatusListener;
  }
  
  public boolean uploadLogFile(String paramString1, String paramString2)
  {
    Object localObject = IMMsfCoreProxy.get().getMsfUserInfo(this.identification);
    if (localObject == null)
    {
      QLog.e(paramString2, 1, "uploadLogFile->find user failed: " + this.identification);
      return false;
    }
    try
    {
      String str1 = UUID.randomUUID().toString();
      int i = paramString1.lastIndexOf('.');
      String str2 = paramString1.substring(i - 8, i);
      localObject = paramString2 + "_" + str2 + "_" + ((IMMsfUserInfo)localObject).getTinyid() + ".lz4";
      str2 = "/" + 10002868 + "/" + "sdklog" + "/" + "imsdk" + "/" + (String)localObject;
      String str3 = "http://" + "web.file.myqcloud.com/files/v1" + str2;
      paramString1 = new RandomAccessFile(paramString1, "r");
      long l = paramString1.length();
      if (l > 10485760L) {
        paramString1.seek(l - 10485760L);
      }
      for (i = 10485760;; i = (int)l)
      {
        byte[] arrayOfByte1 = new byte[i];
        paramString1.read(arrayOfByte1);
        paramString1.close();
        byte[] arrayOfByte2 = IMFunc.gzCompress(new String(arrayOfByte1));
        paramString1 = IMFunc.getParamBytes(str1, "sha", "sha", IMFunc.calcSHA(arrayOfByte2));
        arrayOfByte1 = IMFunc.getParamBytes(str1, "biz_attr", "biz_attr", "");
        byte[] arrayOfByte3 = IMFunc.getParamBytes(str1, "filecontent", (String)localObject, arrayOfByte2);
        byte[] arrayOfByte4 = IMFunc.getParamBytes(str1, "op", "op", "upload");
        byte[] arrayOfByte5 = ("--" + str1 + "--\r\n").getBytes();
        arrayOfByte2 = new byte[paramString1.length + arrayOfByte1.length + arrayOfByte3.length + arrayOfByte4.length + arrayOfByte5.length];
        System.arraycopy(paramString1, 0, arrayOfByte2, 0, paramString1.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramString1.length, arrayOfByte1.length);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte2, paramString1.length + arrayOfByte1.length, arrayOfByte3.length);
        System.arraycopy(arrayOfByte4, 0, arrayOfByte2, paramString1.length + arrayOfByte1.length + arrayOfByte3.length, arrayOfByte4.length);
        i = paramString1.length;
        int j = arrayOfByte1.length;
        System.arraycopy(arrayOfByte5, 0, arrayOfByte2, arrayOfByte3.length + (i + j) + arrayOfByte4.length, arrayOfByte5.length);
        paramString1 = new HashMap();
        paramString1.put("Authorization", IMFunc.appSignature(10002868, "AKIDIsvZoS8DRMqxDPh0wQ5B3sF6SlCINL0G", "8whnoADaf5USGpmmio7JATVQWrj5BaSz", 60L, str2, "sdklog"));
        paramString1.put("Content-Type", "multipart/form-data; boundary=" + str1);
        QLog.i(paramString2, 1, "uploadLogFile->request: " + str3);
        IMFunc.httpPostReq(str3, arrayOfByte2, paramString1, new ˆᵎ(this, (String)localObject));
        return true;
      }
      return false;
    }
    catch (Exception paramString1)
    {
      QLog.e(paramString2, 1, "uploadLogFile->error: " + IMFunc.getExceptionInfo(paramString1));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */