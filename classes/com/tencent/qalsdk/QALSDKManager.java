package com.tencent.qalsdk;

import android.content.Context;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.sdk.e;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentHashMap;
import tencent.tls.platform.TLSHelper;

public class QALSDKManager
{
  private static int LANG = 2052;
  private static String appVer = "1.0";
  public static boolean bConsoleLog = true;
  private static int country = 86;
  public static String gateip = null;
  static QALSDKManager inst;
  public static int svrport = 0;
  private static final String tag = "QALSDKManager";
  private boolean bAppSetGuestMode = false;
  private boolean bOnlyUseConn = false;
  private boolean bSupportGuestMode = true;
  private QALConnListener connListener = null;
  private Context context = null;
  public volatile boolean inited = false;
  private ConcurrentHashMap<String, QALOfflinePushListener> mCmd2OfflinePushCallBack = new ConcurrentHashMap();
  private j msfCore = j.a();
  private String processName;
  private int sdkAppId;
  private QALUserStatusListener userStatusListener = null;
  
  public static QALSDKManager getInstance()
  {
    try
    {
      if (inst == null) {
        inst = new QALSDKManager();
      }
      return inst;
    }
    finally {}
  }
  
  private void initTLSSDK()
  {
    TLSHelper localTLSHelper = TLSHelper.getInstance().init(this.context, this.sdkAppId);
    localTLSHelper.setTimeOut(15000);
    localTLSHelper.setLocalId(LANG);
    QLog.d("QALSDKManager", 1, "init tls sdk done:" + this.sdkAppId);
  }
  
  public void addPushListener(String paramString, QALPushListener paramQALPushListener)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      QLog.e("QALSDKManager", "cmd null:" + paramString);
      return;
    }
    QLog.i("QALSDKManager", 1, "setPushCallBack: " + paramString);
    e.b().a(paramString, paramQALPushListener);
  }
  
  public void appSetGuestMode()
  {
    try
    {
      QLog.i("QALSDKManager", "appSetGuestMode");
      this.bSupportGuestMode = true;
      this.bAppSetGuestMode = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void bindID(String paramString, QALCallBack paramQALCallBack)
  {
    QLog.i("QALSDKManager", "begin bindID:" + paramString);
    e.b().b(paramString, paramQALCallBack);
  }
  
  public QALConnListener getConnectionListener()
  {
    try
    {
      QALConnListener localQALConnListener = this.connListener;
      return localQALConnListener;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Context getContext()
  {
    return this.context;
  }
  
  public String getGatewayIp()
  {
    return e.b().i();
  }
  
  public String getGuestIdentifier()
  {
    return e.b().d();
  }
  
  public boolean getGuestMode()
  {
    try
    {
      boolean bool = this.bSupportGuestMode;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  ConcurrentHashMap<String, QALOfflinePushListener> getOffLinePushListener()
  {
    try
    {
      ConcurrentHashMap localConcurrentHashMap = this.mCmd2OfflinePushCallBack;
      return localConcurrentHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getQalAppId()
  {
    return 537046243;
  }
  
  public int getSdkAppId()
  {
    return this.sdkAppId;
  }
  
  public String getSdkVersion()
  {
    return "1.4.1.99154";
  }
  
  public long getServetTimeSecondInterv()
  {
    return NetConnInfoCenter.servetTimeSecondInterv;
  }
  
  public QALUserStatusListener getUserStatusListener()
  {
    try
    {
      QALUserStatusListener localQALUserStatusListener = this.userStatusListener;
      return localQALUserStatusListener;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void init(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 19
    //   4: iconst_1
    //   5: ldc -55
    //   7: invokestatic 129	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   10: aload_0
    //   11: getfield 62	com/tencent/qalsdk/QALSDKManager:inited	Z
    //   14: ifne +105 -> 119
    //   17: aload_0
    //   18: aload_1
    //   19: putfield 72	com/tencent/qalsdk/QALSDKManager:context	Landroid/content/Context;
    //   22: aload_1
    //   23: invokestatic 204	com/tencent/qalsdk/util/QLog:init	(Landroid/content/Context;)V
    //   26: aload_1
    //   27: invokestatic 207	com/tencent/qalsdk/util/ALog:init	(Landroid/content/Context;)V
    //   30: aload_0
    //   31: iload_2
    //   32: putfield 96	com/tencent/qalsdk/QALSDKManager:sdkAppId	I
    //   35: aload_0
    //   36: aload_1
    //   37: invokestatic 213	com/tencent/qalsdk/sdk/MsfSdkUtils:getProcessName	(Landroid/content/Context;)Ljava/lang/String;
    //   40: putfield 215	com/tencent/qalsdk/QALSDKManager:processName	Ljava/lang/String;
    //   43: aload_0
    //   44: getfield 78	com/tencent/qalsdk/QALSDKManager:bOnlyUseConn	Z
    //   47: ifne +75 -> 122
    //   50: aload_0
    //   51: invokespecial 217	com/tencent/qalsdk/QALSDKManager:initTLSSDK	()V
    //   54: invokestatic 154	com/tencent/qalsdk/sdk/e:b	()Lcom/tencent/qalsdk/sdk/e;
    //   57: aload_1
    //   58: invokevirtual 219	com/tencent/qalsdk/sdk/e:a	(Landroid/content/Context;)V
    //   61: getstatic 224	android/os/Build$VERSION:SDK_INT	I
    //   64: bipush 14
    //   66: if_icmplt +7 -> 73
    //   69: aload_1
    //   70: invokestatic 227	qalsdk/p:a	(Landroid/content/Context;)V
    //   73: aload_0
    //   74: getfield 74	com/tencent/qalsdk/QALSDKManager:bSupportGuestMode	Z
    //   77: ifeq +9 -> 86
    //   80: invokestatic 232	com/tencent/qalsdk/util/GuestHelper:getInstance	()Lcom/tencent/qalsdk/util/GuestHelper;
    //   83: invokevirtual 234	com/tencent/qalsdk/util/GuestHelper:init	()V
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield 62	com/tencent/qalsdk/QALSDKManager:inited	Z
    //   91: ldc 19
    //   93: iconst_1
    //   94: new 109	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   101: aload_0
    //   102: getfield 215	com/tencent/qalsdk/QALSDKManager:processName	Ljava/lang/String;
    //   105: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc -20
    //   110: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokestatic 129	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   119: aload_0
    //   120: monitorexit
    //   121: return
    //   122: ldc 19
    //   124: iconst_1
    //   125: ldc -18
    //   127: invokestatic 240	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   130: goto -76 -> 54
    //   133: astore_1
    //   134: aload_0
    //   135: monitorexit
    //   136: aload_1
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	QALSDKManager
    //   0	138	1	paramContext	Context
    //   0	138	2	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   2	54	133	finally
    //   54	73	133	finally
    //   73	86	133	finally
    //   86	119	133	finally
    //   122	130	133	finally
  }
  
  public void login(String paramString1, String paramString2, String paramString3, QALCallBack paramQALCallBack)
  {
    if (TLSHelper.getInstance() == null)
    {
      QLog.e("QALSDKManager", 1, "tls login null");
      return;
    }
    TLSHelper.getInstance().TLSExchangeTicket(this.sdkAppId, paramString1, paramString3, new b(this, paramString1, paramQALCallBack));
  }
  
  public void sendMsg(String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong, QALValueCallBack paramQALValueCallBack)
  {
    QLog.d("QALSDKManager", "sendmsg:" + paramString1 + ":" + paramString2 + ":" + paramLong);
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      paramString1 = "0";
    }
    for (;;)
    {
      if (!this.inited)
      {
        QLog.e("QALSDKManager", "qalsdk should init first!");
        return;
      }
      if ((paramLong < 2000L) || (paramLong > 120000L)) {
        paramLong = 15000L;
      }
      for (;;)
      {
        e.b().a(paramString1, paramString2, paramArrayOfByte, paramQALValueCallBack, paramLong);
        return;
      }
    }
  }
  
  public void sendMsg(String paramString1, String paramString2, byte[] paramArrayOfByte, QALValueCallBack paramQALValueCallBack)
  {
    if (paramArrayOfByte != null)
    {
      sendMsg(paramString1, paramString2, paramArrayOfByte, e.b().b(paramArrayOfByte.length), paramQALValueCallBack);
      return;
    }
    sendMsg(paramString1, paramString2, paramArrayOfByte, 15000L, paramQALValueCallBack);
  }
  
  public void setAppEnv(String paramString1, String paramString2)
  {
    try
    {
      e.b().a(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void setAppQuit()
  {
    e.b().n();
  }
  
  public void setConnectionListener(QALConnListener paramQALConnListener)
  {
    try
    {
      this.connListener = paramQALConnListener;
      return;
    }
    finally
    {
      paramQALConnListener = finally;
      throw paramQALConnListener;
    }
  }
  
  public void setEnv(int paramInt) {}
  
  public void setNoGuestMode()
  {
    try
    {
      QLog.i("QALSDKManager", "setNoGuestMode");
      if (!this.bAppSetGuestMode) {
        this.bSupportGuestMode = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void setOffLinePushListener(String paramString, QALOfflinePushListener paramQALOfflinePushListener)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +10 -> 13
    //   6: aload_1
    //   7: invokevirtual 137	java/lang/String:length	()I
    //   10: ifne +30 -> 40
    //   13: ldc 19
    //   15: new 109	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   22: ldc -117
    //   24: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_1
    //   28: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokestatic 143	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 83	com/tencent/qalsdk/QALSDKManager:mCmd2OfflinePushCallBack	Ljava/util/concurrent/ConcurrentHashMap;
    //   44: aload_1
    //   45: aload_2
    //   46: invokevirtual 301	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: goto -13 -> 37
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	QALSDKManager
    //   0	58	1	paramString	String
    //   0	58	2	paramQALOfflinePushListener	QALOfflinePushListener
    // Exception table:
    //   from	to	target	type
    //   6	13	53	finally
    //   13	37	53	finally
    //   40	50	53	finally
  }
  
  public void setOnlyUseConn()
  {
    try
    {
      this.bOnlyUseConn = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setOutputLogLevel(int paramInt)
  {
    try
    {
      QLog.i("QALSDKManager", "setOutputLogLevel:" + paramInt);
      e.b().a(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setReqTimeout(long paramLong)
  {
    e.b().a(paramLong);
  }
  
  public void setSDKAppID(int paramInt)
  {
    this.sdkAppId = paramInt;
  }
  
  public void setTIMLogListener(QALLogListener paramQALLogListener)
  {
    QLog.setSdkLogListener(paramQALLogListener);
  }
  
  public void setUserStatusListener(QALUserStatusListener paramQALUserStatusListener)
  {
    try
    {
      this.userStatusListener = paramQALUserStatusListener;
      return;
    }
    finally
    {
      paramQALUserStatusListener = finally;
      throw paramQALUserStatusListener;
    }
  }
  
  public void unBindID(String paramString, QALCallBack paramQALCallBack)
  {
    QLog.i("QALSDKManager", "unBindID:" + paramString);
    if (!e.b().g().containsKey(paramString))
    {
      paramQALCallBack.onError(-2, "user is not registerd");
      QLog.e("QALSDKManager", "user is not registerd");
      return;
    }
    if (paramString.equals(e.b().d()))
    {
      paramQALCallBack.onError(-2, "guest user can't unbind");
      QLog.e("QALSDKManager", "guest user can't unbind");
      return;
    }
    e.b().a(paramString, paramQALCallBack);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\QALSDKManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */