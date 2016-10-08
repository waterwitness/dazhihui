package com.tencent;

import android.os.Environment;
import com.tencent.imcore.FileTranser;
import com.tencent.imcore.FriendshipProxyConfig;
import com.tencent.imcore.GroupAssistantConfig;
import com.tencent.imcore.GroupSettings;
import com.tencent.imcore.IMCore;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.qalsdk.QALSDKManager;
import java.io.File;
import java.util.Map;
import tencent.tls.platform.TLSLoginHelper;

public class IMCoreWrapper
{
  static IMCoreWrapper inst = new IMCoreWrapper();
  private static final String tag = "imsdk.IMCoreWrapper";
  private String fileCachePath = "";
  private boolean isLogInited = false;
  private boolean isLogPrintEnabled = true;
  private String logFileName = "imsdk";
  private TIMLogLevel logLevel = TIMLogLevel.DEBUG;
  private String logPath = "";
  private String picCachePath = "";
  private boolean ready = false;
  private String videoCachePath = "";
  
  public static IMCoreWrapper get()
  {
    return inst;
  }
  
  public static void loadLib()
  {
    System.loadLibrary("_imcore_jni_gyp");
  }
  
  public static void loadLib(boolean paramBoolean)
  {
    System.loadLibrary("_imcore_jni_gyp");
  }
  
  public String getFileCachePath()
  {
    return this.fileCachePath;
  }
  
  public String getGateWayIp()
  {
    String str = QALSDKManager.getInstance().getGatewayIp();
    if (str != null) {
      return str;
    }
    return "";
  }
  
  public boolean getIsLogPrintEnabled()
  {
    return this.isLogPrintEnabled;
  }
  
  public String getLogFileName()
  {
    return this.logFileName;
  }
  
  public TIMLogLevel getLogLevel()
  {
    return this.logLevel;
  }
  
  public String getLogPath()
  {
    return this.logPath;
  }
  
  public String getPicCachePath()
  {
    return this.picCachePath;
  }
  
  public String getVideoCachePath()
  {
    return this.videoCachePath;
  }
  
  public void init(android.content.Context paramContext, String paramString, TIMCallBack paramTIMCallBack)
  {
    QLog.i("imsdk.IMCoreWrapper", 1, "welcome to imsdk, version: " + TIMManager.getInstanceById(paramString).getVersion());
    this.ready = false;
    Object localObject = new com.tencent.imcore.Context();
    ((com.tencent.imcore.Context)localObject).setBid(QALSDKManager.getInstance().getQalAppId());
    ((com.tencent.imcore.Context)localObject).setLogPath(this.logPath);
    ((com.tencent.imcore.Context)localObject).setPicCachePath(this.picCachePath);
    ((com.tencent.imcore.Context)localObject).setIsLogPrintEnabled(this.isLogPrintEnabled);
    long l = TIMManager.getInstanceById(paramString).getServerTimeDiff();
    QLog.i("imsdk.IMCoreWrapper", 1, "servertimediff: " + l);
    ((com.tencent.imcore.Context)localObject).setSvr_time_diff(l);
    IMCore.get().setContext((com.tencent.imcore.Context)localObject);
    localObject = IMMsfCoreProxy.get().getMsfUserInfo(paramString);
    if (localObject == null)
    {
      QLog.e("imsdk.IMCoreWrapper", 1, "Login|4-InitIMCore|Fail| init failed, user not found:" + paramString);
      IMMsfCoreProxy.errorOnMainThread(paramTIMCallBack, 6014, "no user found!");
      return;
    }
    Map localMap = TLSLoginHelper.getInstance().getSSOTicket(((IMMsfUserInfo)localObject).getUser().getIdentifier());
    FriendshipProxyConfig localFriendshipProxyConfig = new FriendshipProxyConfig();
    localFriendshipProxyConfig.setEnable(TIMManager.getInstanceById(paramString).isFriendshipStorageEnabled());
    TIMManager.getInstanceById(paramString).setFriendshipConfig(localFriendshipProxyConfig);
    localFriendshipProxyConfig.setListener(new IMCoreFriendshipProxyCallback(paramString));
    GroupAssistantConfig localGroupAssistantConfig = new GroupAssistantConfig();
    GroupSettings localGroupSettings = new GroupSettings();
    localGroupSettings.setStorageEnabled(TIMManager.getInstanceById(paramString).isGrpStorageEnabled());
    TIMManager.getInstanceById(paramString).getGroupSettings().convert(localGroupSettings);
    localGroupAssistantConfig.setSettings(localGroupSettings);
    localGroupAssistantConfig.setCallback(new IMCoreGroupAssistantCallback(paramString));
    if (IMCore.get().initUser(IMMsfCoreProxy.get().getSdkAppId(), ((IMMsfUserInfo)localObject).getUidType(), String.valueOf(((IMMsfUserInfo)localObject).getsUerAppId()), ((IMMsfUserInfo)localObject).getUserId(), String.valueOf(((IMMsfUserInfo)localObject).getTinyid()), (byte[])localMap.get("A2"), getGateWayIp(), paramContext.getFilesDir().toString(), new ⁱ(paramString), localFriendshipProxyConfig, localGroupAssistantConfig, new ᴵᴵ(this, paramTIMCallBack, paramString)) == 0)
    {
      IMMsfCoreProxy.errorOnMainThread(paramTIMCallBack, 6019, "local database operation failed!");
      return;
    }
    paramContext = IMCore.get().getUser(((IMMsfUserInfo)localObject).getUserId());
    TIMManager.getInstanceById(paramString).setCoreUser(paramContext);
    TIMManager.getInstanceById(paramString).getCoreUser().getFileTranser().setCachePath(TIMManager.getInstance().getFileCachePath());
    paramContext.setAvInviteCallBack(new IMCoreAvInviteCallBack(paramString));
    paramContext.setGroupUpdateCallback(new ᴵ(paramString));
    paramContext.setGroupTipsEventCallback(new IMCoreGroupEventCallback(paramString));
  }
  
  public void initFileCachePath(android.content.Context paramContext)
  {
    int j;
    int i;
    try
    {
      paramContext = paramContext.getPackageName();
      this.fileCachePath = (Environment.getExternalStorageDirectory().getPath() + "/tencent/imsdkfilecache/" + paramContext.replace(".", "/") + "/");
      paramContext = new File(this.fileCachePath);
      if (!paramContext.exists())
      {
        if (!paramContext.mkdirs()) {
          QLog.d("imsdk.IMCoreWrapper", 1, "create imsdkfilecache folder failed");
        }
        return;
      }
    }
    catch (Exception paramContext)
    {
      do
      {
        do
        {
          for (;;)
          {
            paramContext = "unknown";
          }
        } while (!paramContext.isDirectory());
        paramContext = paramContext.listFiles();
      } while (paramContext == null);
      j = paramContext.length;
      i = 0;
    }
    while (i < j)
    {
      paramContext[i].delete();
      i += 1;
    }
  }
  
  public void initLog(android.content.Context paramContext, TIMLogLevel paramTIMLogLevel, TIMLogListener paramTIMLogListener)
  {
    try
    {
      paramContext = paramContext.getPackageName();
      if ((this.logPath == null) || (this.logPath.length() == 0)) {
        this.logPath = (Environment.getExternalStorageDirectory().getPath() + "/tencent/imsdklogs/" + paramContext.replace(".", "/") + "/");
      }
      paramContext = new File(this.logPath);
      if ((!paramContext.exists()) && (!paramContext.mkdirs())) {
        QLog.d("imsdk.IMCoreWrapper", 1, "create imsdklogs folder failed");
      }
      paramContext = null;
      if (paramTIMLogListener != null) {
        paramContext = new IMCoreLogMsgCallback(paramTIMLogListener);
      }
      IMCore.get().lOGGERINIT(this.logPath + this.logFileName, this.logLevel.getDescr(), this.isLogPrintEnabled, paramContext);
      IMCore.get().lOGGERSETLOGCBLEVEL(paramTIMLogLevel.getDescr());
      QALSDKManager.getInstance().setOutputLogLevel(this.logLevel.getIntLevel());
      setLogInited();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "unknown";
      }
    }
  }
  
  public void initLogSettings(boolean paramBoolean, String paramString)
  {
    this.isLogPrintEnabled = paramBoolean;
    if (paramString != null)
    {
      this.logPath = paramString;
      if (paramString.charAt(paramString.length() - 1) != '/') {
        this.logPath += "/";
      }
    }
  }
  
  public void initPicCachePath(android.content.Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageName();
      this.picCachePath = (Environment.getExternalStorageDirectory().getPath() + "/tencent/imsdkpiccache/" + paramContext.replace(".", "/") + "/");
      paramContext = new File(this.picCachePath);
      if ((!paramContext.exists()) && (!paramContext.mkdirs())) {
        QLog.d("imsdk.IMCoreWrapper", 1, "create imsdkpiccache folder failed");
      }
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "unknown";
      }
    }
  }
  
  public void initVideoCachePath(android.content.Context paramContext)
  {
    int j;
    int i;
    try
    {
      paramContext = paramContext.getPackageName();
      this.videoCachePath = (Environment.getExternalStorageDirectory().getPath() + "/tencent/imsdkvideocache/" + paramContext.replace(".", "/") + "/");
      paramContext = new File(this.videoCachePath);
      if (!paramContext.exists())
      {
        if (!paramContext.mkdirs()) {
          QLog.d("imsdk.IMCoreWrapper", 1, "create imsdkvideocache folder failed");
        }
        return;
      }
    }
    catch (Exception paramContext)
    {
      do
      {
        do
        {
          for (;;)
          {
            paramContext = "unknown";
          }
        } while (!paramContext.isDirectory());
        paramContext = paramContext.listFiles();
      } while (paramContext == null);
      j = paramContext.length;
      i = 0;
    }
    while (i < j)
    {
      paramContext[i].delete();
      i += 1;
    }
  }
  
  public boolean isLogInited()
  {
    return this.isLogInited;
  }
  
  public boolean isLogPrintEnabled()
  {
    return this.isLogPrintEnabled;
  }
  
  public boolean isReady()
  {
    return this.ready;
  }
  
  public void setIsLogPrintEnabled(boolean paramBoolean)
  {
    this.isLogPrintEnabled = paramBoolean;
  }
  
  public void setLogInited()
  {
    this.isLogInited = true;
  }
  
  public void setLogLevel(TIMLogLevel paramTIMLogLevel)
  {
    this.logLevel = paramTIMLogLevel;
  }
  
  public void setReady(boolean paramBoolean)
  {
    this.ready = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */