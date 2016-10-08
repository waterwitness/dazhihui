package com.tencent.imsdk;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.IMCoreWrapper;
import com.tencent.TIMCallBack;
import com.tencent.TIMLogLevel;
import com.tencent.TIMLogListener;
import com.tencent.TIMManager;
import com.tencent.TIMNetworkStatus;
import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.imcore.FriendshipManager;
import com.tencent.imcore.IMCore;
import com.tencent.imcore.IMCoreUser;
import com.tencent.openqq.IMCmdListener;
import com.tencent.openqq.IMPushListener;
import com.tencent.qalsdk.QALSDKManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import tencent.tls.platform.TLSHelper;
import tencent.tls.platform.TLSLoginHelper;

public class IMMsfCoreProxy
{
  private static String backupStorePath = Environment.getExternalStorageDirectory().getPath() + "/imsdk/files";
  static IMMsfCoreProxy coreProxy = new IMMsfCoreProxy();
  private static final char[] hexArray = "0123456789abcdef".toCharArray();
  public static Handler mainHandler = new Handler(Looper.getMainLooper());
  private static final String tag = "imsdk.IMMsfCoreProxy";
  private String accountType = "";
  private boolean buglyDebugMode = true;
  private boolean buglyInited = false;
  private Context context = null;
  private long count = 0L;
  private int env = 0;
  public volatile boolean inited = false;
  private TIMLogLevel logCbLevel = TIMLogLevel.WARN;
  private TIMLogListener logListener = null;
  private int mode = 1;
  public AtomicInteger msgSeq = new AtomicInteger(1000);
  private ConcurrentHashMap<String, IMMsfUserInfo> mutiUserMap = new ConcurrentHashMap();
  private TIMNetworkStatus networkStatus = TIMNetworkStatus.TIM_NETWORK_STATUS_DISCONNECTED;
  private boolean noCrashReport = false;
  private IMMsfUserInfo onlineMsfUser = null;
  private ExecutorService pool = Executors.newFixedThreadPool(10);
  public Random random = new Random();
  private long reqTimeout = 0L;
  private int sdkAppId = 0;
  private String sdkType = "openim";
  private long ttotal = 0L;
  
  public static void errorOnMainThread(TIMCallBack paramTIMCallBack, int paramInt, String paramString)
  {
    mainHandler.post(new ʻ(paramTIMCallBack, paramInt, paramString));
  }
  
  public static IMMsfCoreProxy get()
  {
    return coreProxy;
  }
  
  public static byte[] hex2bin(String paramString)
  {
    int j = 0;
    int k = paramString.length() / 2;
    byte[] arrayOfByte = new byte[k];
    int i = 0;
    while (j < k)
    {
      arrayOfByte[i] = ((byte)(hexdigit2byte(paramString.charAt(j * 2)) << 4 | hexdigit2byte(paramString.charAt(j * 2 + 1))));
      j += 1;
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static String hexDump(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length << 1];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i << 1)] = hexArray[(j >>> 4)];
      arrayOfChar[((i << 1) + 1)] = hexArray[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static byte hexdigit2byte(char paramChar)
  {
    switch (paramChar)
    {
    case '0': 
    default: 
      return 0;
    case '1': 
      return 1;
    case '2': 
      return 2;
    case '3': 
      return 3;
    case '4': 
      return 4;
    case '5': 
      return 5;
    case '6': 
      return 6;
    case '7': 
      return 7;
    case '8': 
      return 8;
    case '9': 
      return 9;
    case 'A': 
    case 'a': 
      return 10;
    case 'B': 
    case 'b': 
      return 11;
    case 'C': 
    case 'c': 
      return 12;
    case 'D': 
    case 'd': 
      return 13;
    case 'E': 
    case 'e': 
      return 14;
    }
    return 15;
  }
  
  private void initBugly(TIMUser paramTIMUser)
  {
    if ((!this.buglyInited) && (!this.noCrashReport)) {}
    try
    {
      Object localObject = Class.forName("com.tencent.bugly.imsdk.crashreport.CrashReport");
      Method localMethod = ((Class)localObject).getMethod("setSdkExtraData", new Class[] { Context.class, String.class, String.class });
      if (localMethod != null) {
        localMethod.invoke(null, new Object[] { this.context, "900011355", TIMManager.getInstance().getVersion() });
      }
      localMethod = ((Class)localObject).getMethod("initCrashReport", new Class[] { Context.class, String.class, Boolean.TYPE });
      if (localMethod != null)
      {
        localMethod.invoke(null, new Object[] { this.context, String.valueOf(this.sdkAppId), Boolean.valueOf(this.buglyDebugMode) });
        this.buglyInited = true;
        QLog.i("imsdk.IMMsfCoreProxy", 1, "init imsdk bugly succ");
      }
      localObject = ((Class)localObject).getMethod("setUserId", new Class[] { String.class });
      if (localObject != null) {
        ((Method)localObject).invoke(null, new Object[] { String.valueOf(this.sdkAppId) + "_" + paramTIMUser.getAccountType() + "_" + paramTIMUser.getIdentifier() });
      }
      return;
    }
    catch (ClassNotFoundException paramTIMUser)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "enable crashreport failed|ClassNotFoundException| do not have jar");
      return;
    }
    catch (NoSuchMethodException paramTIMUser)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "enable crashreport failed|NoSuchMethodException");
      return;
    }
    catch (InvocationTargetException paramTIMUser)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "enable crashreport failed|InvocationTargetException");
      return;
    }
    catch (IllegalAccessException paramTIMUser)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "enable crashreport failed|IllegalAccessException");
      return;
    }
    catch (Exception paramTIMUser)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "enable crashreport failed|" + paramTIMUser.toString());
    }
  }
  
  public void disableCrashReport()
  {
    this.noCrashReport = true;
  }
  
  public void enableBuglyDebugMode(boolean paramBoolean)
  {
    this.buglyDebugMode = paramBoolean;
  }
  
  public IMMsfUserInfo getAnyOnLineMsfUserInfo()
  {
    if ((this.onlineMsfUser != null) && (this.onlineMsfUser.isLoggedIn())) {
      return this.onlineMsfUser;
    }
    Iterator localIterator = this.mutiUserMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      IMMsfUserInfo localIMMsfUserInfo = (IMMsfUserInfo)((Map.Entry)localIterator.next()).getValue();
      if (localIMMsfUserInfo.isLoggedIn())
      {
        this.onlineMsfUser = localIMMsfUserInfo;
        return this.onlineMsfUser;
      }
    }
    return this.onlineMsfUser;
  }
  
  public Context getContext()
  {
    return this.context;
  }
  
  public int getEnv()
  {
    return this.env;
  }
  
  public int getMode()
  {
    return this.mode;
  }
  
  public IMMsfUserInfo getMsfUserInfo(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
    {
      str = TIMManager.getInstance().getIdentification();
      QLog.w("imsdk.IMMsfCoreProxy", 1, "IMMsfCoreProxy|getMsfUserInfo empty, take identifer id:" + str);
    }
    if (this.mutiUserMap.containsKey(str)) {
      return (IMMsfUserInfo)this.mutiUserMap.get(str);
    }
    return null;
  }
  
  public TIMNetworkStatus getNetworkStatus()
  {
    return this.networkStatus;
  }
  
  public long getReqTimeout()
  {
    return this.reqTimeout;
  }
  
  public String getSaveRootPath()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.context.getFilesDir();
        if (localObject1 != null) {
          continue;
        }
        localObject1 = this.context.getCacheDir();
        if (localObject1 != null) {
          continue;
        }
        QLog.d("imsdk.IMMsfCoreProxy", 1, "load cache dir is null");
        localObject1 = null;
        if (localObject1 != null) {
          continue;
        }
        localObject4 = backupStorePath;
        File localFile = new File((String)localObject4);
        localObject1 = localObject4;
        if (!localFile.exists())
        {
          localObject1 = localObject4;
          if (!localFile.mkdirs())
          {
            QLog.d("imsdk.IMMsfCoreProxy", 1, "create backupStore folder failed");
            localObject1 = localObject4;
          }
        }
        QLog.d("imsdk.IMMsfCoreProxy", 1, "load save root dir is " + (String)localObject1);
      }
      catch (Throwable localThrowable)
      {
        Object localObject1;
        Object localObject4;
        int i;
        QLog.d("imsdk.IMMsfCoreProxy", 1, "getSaveRootPath error ", localThrowable);
        Object localObject2 = null;
        continue;
      }
      finally {}
      return (String)localObject1;
      localObject4 = ((File)localObject1).getAbsolutePath();
      i = ((String)localObject4).lastIndexOf('/');
      localObject1 = localObject4;
      if (i != -1)
      {
        localObject1 = ((String)localObject4).substring(0, i);
        localObject1 = (String)localObject1 + "/files/";
        continue;
        localObject1 = ((File)localObject1).getAbsolutePath();
        continue;
        localObject4 = new File((String)localObject1);
        if ((!((File)localObject4).exists()) && (!((File)localObject4).mkdirs())) {
          QLog.d("imsdk.IMMsfCoreProxy", 1, "create backupStore folder failed");
        }
        if ((!((File)localObject4).exists()) || (!((File)localObject4).canWrite()))
        {
          localObject4 = backupStorePath;
          localObject1 = localObject4;
          if (!new File((String)localObject4).mkdirs())
          {
            QLog.d("imsdk.IMMsfCoreProxy", 1, "create backupStore folder failed");
            localObject1 = localObject4;
          }
        }
      }
    }
  }
  
  public int getSdkAppId()
  {
    return this.sdkAppId;
  }
  
  public String getSdkType()
  {
    return this.sdkType;
  }
  
  public String getUidType()
  {
    return this.accountType;
  }
  
  public ConcurrentHashMap<String, TIMValueCallBack<byte[]>> getUserPushCallBack(String paramString)
  {
    if (this.mutiUserMap.containsKey(paramString)) {
      return ((IMMsfUserInfo)this.mutiUserMap.get(paramString)).getCmd2PushCallBack();
    }
    return null;
  }
  
  public ConcurrentHashMap<String, IMPushListener> getUserPushListener(String paramString)
  {
    if (this.mutiUserMap.containsKey(paramString)) {
      return ((IMMsfUserInfo)this.mutiUserMap.get(paramString)).getCmd2PushListener();
    }
    return null;
  }
  
  /* Error */
  public boolean init(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 15
    //   6: iconst_1
    //   7: new 53	java/lang/StringBuilder
    //   10: dup
    //   11: ldc_w 452
    //   14: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: invokestatic 457	com/tencent/qalsdk/QALSDKManager:getInstance	()Lcom/tencent/qalsdk/QALSDKManager;
    //   20: invokevirtual 460	com/tencent/qalsdk/QALSDKManager:getQalAppId	()I
    //   23: invokevirtual 463	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   26: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 289	com/tencent/imsdk/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
    //   32: aload_0
    //   33: getfield 109	com/tencent/imsdk/IMMsfCoreProxy:inited	Z
    //   36: ifne +220 -> 256
    //   39: ldc 15
    //   41: iconst_1
    //   42: ldc_w 465
    //   45: invokestatic 289	com/tencent/imsdk/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
    //   48: aload_0
    //   49: aload_1
    //   50: putfield 133	com/tencent/imsdk/IMMsfCoreProxy:context	Landroid/content/Context;
    //   53: invokestatic 470	com/tencent/IMCoreWrapper:loadLib	()V
    //   56: invokestatic 472	com/tencent/imsdk/IMMsfCoreProxy:get	()Lcom/tencent/imsdk/IMMsfCoreProxy;
    //   59: invokevirtual 474	com/tencent/imsdk/IMMsfCoreProxy:getMode	()I
    //   62: iconst_1
    //   63: if_icmpne +183 -> 246
    //   66: getstatic 479	android/os/Build$VERSION:SDK_INT	I
    //   69: bipush 23
    //   71: if_icmplt +31 -> 102
    //   74: aload_1
    //   75: ldc_w 481
    //   78: invokestatic 487	android/support/v4/content/a:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   81: ifeq +21 -> 102
    //   84: ldc 15
    //   86: iconst_1
    //   87: ldc_w 489
    //   90: invokestatic 398	com/tencent/imsdk/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   93: invokestatic 492	com/tencent/IMCoreWrapper:get	()Lcom/tencent/IMCoreWrapper;
    //   96: getstatic 495	com/tencent/TIMLogLevel:OFF	Lcom/tencent/TIMLogLevel;
    //   99: invokevirtual 499	com/tencent/IMCoreWrapper:setLogLevel	(Lcom/tencent/TIMLogLevel;)V
    //   102: invokestatic 492	com/tencent/IMCoreWrapper:get	()Lcom/tencent/IMCoreWrapper;
    //   105: aload_1
    //   106: aload_0
    //   107: getfield 166	com/tencent/imsdk/IMMsfCoreProxy:logCbLevel	Lcom/tencent/TIMLogLevel;
    //   110: aload_0
    //   111: getfield 159	com/tencent/imsdk/IMMsfCoreProxy:logListener	Lcom/tencent/TIMLogListener;
    //   114: invokevirtual 503	com/tencent/IMCoreWrapper:initLog	(Landroid/content/Context;Lcom/tencent/TIMLogLevel;Lcom/tencent/TIMLogListener;)V
    //   117: invokestatic 492	com/tencent/IMCoreWrapper:get	()Lcom/tencent/IMCoreWrapper;
    //   120: aload_1
    //   121: invokevirtual 507	com/tencent/IMCoreWrapper:initPicCachePath	(Landroid/content/Context;)V
    //   124: invokestatic 492	com/tencent/IMCoreWrapper:get	()Lcom/tencent/IMCoreWrapper;
    //   127: aload_1
    //   128: invokevirtual 510	com/tencent/IMCoreWrapper:initVideoCachePath	(Landroid/content/Context;)V
    //   131: invokestatic 492	com/tencent/IMCoreWrapper:get	()Lcom/tencent/IMCoreWrapper;
    //   134: aload_1
    //   135: invokevirtual 513	com/tencent/IMCoreWrapper:initFileCachePath	(Landroid/content/Context;)V
    //   138: aload_0
    //   139: invokevirtual 516	com/tencent/imsdk/IMMsfCoreProxy:initQalSdk	()V
    //   142: aload_0
    //   143: iconst_1
    //   144: putfield 109	com/tencent/imsdk/IMMsfCoreProxy:inited	Z
    //   147: aload_1
    //   148: invokestatic 521	com/tencent/statistics/BeaconUtil:Init	(Landroid/content/Context;)V
    //   151: ldc 15
    //   153: iconst_1
    //   154: new 53	java/lang/StringBuilder
    //   157: dup
    //   158: ldc_w 523
    //   161: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: aload_0
    //   165: invokevirtual 526	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 289	com/tencent/imsdk/QLog:i	(Ljava/lang/String;ILjava/lang/String;)V
    //   174: aload_0
    //   175: monitorexit
    //   176: iload_3
    //   177: ireturn
    //   178: astore_2
    //   179: ldc 15
    //   181: iconst_1
    //   182: ldc_w 528
    //   185: invokestatic 306	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   188: invokestatic 257	com/tencent/TIMManager:getInstance	()Lcom/tencent/TIMManager;
    //   191: iconst_0
    //   192: invokevirtual 531	com/tencent/TIMManager:setMode	(I)V
    //   195: goto -139 -> 56
    //   198: astore_1
    //   199: aload_0
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: astore_2
    //   204: ldc 15
    //   206: iconst_1
    //   207: new 53	java/lang/StringBuilder
    //   210: dup
    //   211: ldc_w 533
    //   214: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   217: aload_2
    //   218: invokevirtual 318	java/lang/Exception:toString	()Ljava/lang/String;
    //   221: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: ldc_w 535
    //   227: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokestatic 306	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   236: invokestatic 257	com/tencent/TIMManager:getInstance	()Lcom/tencent/TIMManager;
    //   239: iconst_0
    //   240: invokevirtual 531	com/tencent/TIMManager:setMode	(I)V
    //   243: goto -187 -> 56
    //   246: invokestatic 539	com/tencent/imsdk/LogManager:init	()V
    //   249: aload_1
    //   250: invokestatic 541	com/tencent/imsdk/QLog:init	(Landroid/content/Context;)V
    //   253: goto -115 -> 138
    //   256: iconst_0
    //   257: istore_3
    //   258: goto -84 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	IMMsfCoreProxy
    //   0	261	1	paramContext	Context
    //   178	1	2	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   203	15	2	localException	Exception
    //   1	257	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   53	56	178	java/lang/UnsatisfiedLinkError
    //   4	53	198	finally
    //   53	56	198	finally
    //   56	102	198	finally
    //   102	138	198	finally
    //   138	174	198	finally
    //   179	195	198	finally
    //   204	243	198	finally
    //   246	253	198	finally
    //   53	56	203	java/lang/Exception
  }
  
  public boolean init(Context paramContext, int paramInt)
  {
    try
    {
      this.sdkAppId = paramInt;
      boolean bool = init(paramContext);
      return bool;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public boolean init(Context paramContext, int paramInt, String paramString)
  {
    try
    {
      this.sdkAppId = paramInt;
      this.accountType = paramString;
      boolean bool = init(paramContext);
      return bool;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public void initQalSdk()
  {
    QALSDKManager.getInstance().setTIMLogListener(new ʽ(this));
    QALSDKManager.getInstance().setConnectionListener(new ʾ(this));
    QALSDKManager.getInstance().setUserStatusListener(new ʿ(this));
    QALSDKManager.getInstance().addPushListener("im_open_push.msg_push", new ˆ(this));
    QALSDKManager.getInstance().setNoGuestMode();
    QALSDKManager.getInstance().init(this.context, this.sdkAppId);
  }
  
  public boolean isLoggedIn(String paramString)
  {
    if (this.mutiUserMap.containsKey(paramString)) {
      return ((IMMsfUserInfo)this.mutiUserMap.get(paramString)).isLoggedIn();
    }
    return false;
  }
  
  public void logBugly(TIMLogLevel paramTIMLogLevel, String paramString1, String paramString2)
  {
    if (this.noCrashReport) {}
    for (;;)
    {
      return;
      try
      {
        if (paramTIMLogLevel == TIMLogLevel.DEBUG)
        {
          paramTIMLogLevel = "d";
          Class.forName("com.tencent.bugly.imsdk.crashreport.BuglyLog").getMethod(paramTIMLogLevel, new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, paramString2 });
          return;
        }
      }
      catch (ClassNotFoundException paramTIMLogLevel)
      {
        for (;;)
        {
          QLog.e(paramString1, 1, "logBugly failed|ClassNotFoundException| do not have jar");
          return;
          if (paramTIMLogLevel == TIMLogLevel.INFO)
          {
            paramTIMLogLevel = "i";
          }
          else if (paramTIMLogLevel == TIMLogLevel.WARN)
          {
            paramTIMLogLevel = "w";
          }
          else
          {
            if (paramTIMLogLevel != TIMLogLevel.ERROR) {
              break;
            }
            paramTIMLogLevel = "e";
          }
        }
      }
      catch (NoSuchMethodException paramTIMLogLevel)
      {
        QLog.e(paramString1, 1, "logBugly failed|NoSuchMethodException");
        return;
      }
      catch (InvocationTargetException paramTIMLogLevel)
      {
        QLog.e(paramString1, 1, "logBugly failed|InvocationTargetException");
        return;
      }
      catch (IllegalAccessException paramTIMLogLevel)
      {
        QLog.e(paramString1, 1, "logBugly failed|IllegalAccessException");
        return;
      }
      catch (Exception paramTIMLogLevel)
      {
        QLog.e(paramString1, 1, "logBugly failed|" + paramTIMLogLevel.toString());
      }
    }
  }
  
  public void login(int paramInt, TIMUser paramTIMUser, String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramTIMUser == null)
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6017, "invalid TIMUser"));
      return;
    }
    if ((paramTIMUser.getIdentifier() == null) || (paramTIMUser.getIdentifier().length() <= 0))
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6017, "invalid Identifier"));
      return;
    }
    if ((paramTIMUser.getAppIdAt3rd() == null) || (paramTIMUser.getAppIdAt3rd().length() <= 0))
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6017, "invalid AppIdAt3rd"));
      return;
    }
    if ((paramTIMUser.getAccountType() == null) || (paramTIMUser.getAccountType().length() <= 0))
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6017, "invalid AccountType"));
      return;
    }
    if ((paramString == null) || (paramString.length() <= 0))
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6017, "invalid userKey"));
      return;
    }
    QLog.i("imsdk.IMMsfCoreProxy", 1, "Login|1-Begin|Succ|user=" + paramTIMUser + ", sdkappid=" + paramInt);
    QLog.i("imsdk.IMMsfCoreProxy", 1, "user sig: " + paramString);
    paramTIMUser.getIdentifier();
    IMMsfUserInfo localIMMsfUserInfo = new IMMsfUserInfo();
    this.sdkAppId = paramInt;
    localIMMsfUserInfo.setUser(paramTIMUser);
    this.accountType = paramTIMUser.getAccountType();
    this.mutiUserMap.put(paramTIMUser.getIdentifier(), localIMMsfUserInfo);
    QALSDKManager.getInstance().setSDKAppID(paramInt);
    initBugly(paramTIMUser);
    if (!QALSDKManager.getInstance().inited)
    {
      errorOnMainThread(paramTIMCallBack, 6013, "qalsdk not initialized");
      return;
    }
    י localי = new י(this, paramTIMUser, paramTIMCallBack, localIMMsfUserInfo);
    boolean bool = TLSLoginHelper.getInstance().needLogin(paramTIMUser.getIdentifier());
    QLog.e("imsdk.IMMsfCoreProxy", 1, "needLogin: " + bool);
    if (bool)
    {
      paramTIMCallBack = new ـ(this, paramTIMUser, localIMMsfUserInfo, localי, paramTIMCallBack);
      int i = 0;
      try
      {
        int j = Integer.valueOf(this.accountType).intValue();
        i = j;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          QLog.e("imsdk.IMMsfCoreProxy", 1, "invalid accountType: " + this.accountType);
        }
        TLSLoginHelper.getInstance().TLSExchangeTicket(paramInt, paramTIMUser.getIdentifier(), paramString, paramTIMCallBack);
        return;
      }
      if ((i > 0) && (i < 100))
      {
        QLog.i("imsdk.IMMsfCoreProxy", 1, "3rd login:" + this.accountType + ":" + paramTIMUser.getAppIdAt3rd() + ":" + paramTIMUser.getIdentifier() + ":" + paramString);
        TLSHelper.getInstance().setOpenAccountInfo(i, paramTIMUser.getAppIdAt3rd(), paramTIMUser.getIdentifier(), paramString);
        TLSHelper.getInstance().TLSOpenAccountLogin(paramTIMCallBack);
        return;
      }
    }
    QLog.e("imsdk.IMMsfCoreProxy", 1, "tkt exist");
    try
    {
      localIMMsfUserInfo.setTinyid(((Long)TLSLoginHelper.getInstance().getSSOTicket(paramTIMUser.getIdentifier()).get("tinyID")).longValue());
      QALSDKManager.getInstance().bindID(paramTIMUser.getIdentifier(), localException);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public void login(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (this.sdkAppId == 0)
    {
      mainHandler.post(new ʻ(paramTIMCallBack, 6013, "please init SDK with sdkAppId!!!"));
      return;
    }
    TIMUser localTIMUser = new TIMUser();
    localTIMUser.setIdentifier(paramString1);
    localTIMUser.setAccountType("0");
    localTIMUser.setAppIdAt3rd("0");
    login(this.sdkAppId, localTIMUser, paramString2, paramTIMCallBack);
  }
  
  public void logout(String paramString)
  {
    logout(paramString, null);
  }
  
  public void logout(String paramString, TIMCallBack paramTIMCallBack)
  {
    QLog.i("imsdk.IMMsfCoreProxy", 1, "Logout|1-Begin|Succ");
    IMMsfUserInfo localIMMsfUserInfo = getMsfUserInfo(paramString);
    if (localIMMsfUserInfo == null)
    {
      QLog.e("imsdk.IMMsfCoreProxy", 1, "user logout error user not found: " + paramString);
      if (paramTIMCallBack != null)
      {
        paramTIMCallBack.onError(6014, "user not found");
        QLog.e("imsdk.IMMsfCoreProxy", 1, "Logout|2-Callback|Succ|user not found");
      }
      return;
    }
    TIMUser localTIMUser = localIMMsfUserInfo.getUser();
    QLog.i("imsdk.IMMsfCoreProxy", 1, "user logout: " + localTIMUser);
    if (IMCoreWrapper.get().isReady())
    {
      TIMManager.getInstanceById(paramString).getCoreUser().getFriendShipMgr().clearAllData();
      if (getAnyOnLineMsfUserInfo() == null) {
        IMCoreWrapper.get().setReady(false);
      }
      TIMManager.getInstanceById(paramString).getCoreUser().cancelAllPicupTask();
      IMCore.get().unInitUser(localTIMUser.getIdentifier());
    }
    if ((localTIMUser != null) && (localIMMsfUserInfo.isLoggedIn())) {
      QALSDKManager.getInstance().unBindID(localTIMUser.getIdentifier(), new ʼ(this, paramTIMCallBack));
    }
    for (;;)
    {
      if (paramTIMCallBack == null) {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "Logout|2-Callback|Fail|user not set logout callback");
      }
      localIMMsfUserInfo.setTinyid(0L);
      localIMMsfUserInfo.setIsLoggedIn(false);
      return;
      if (paramTIMCallBack != null)
      {
        paramTIMCallBack.onSuccess();
        QLog.i("imsdk.IMMsfCoreProxy", 1, "Logout|2-Callback|Succ|logout succ");
      }
    }
  }
  
  public void performanceTest(String paramString)
  {
    long l1 = System.currentTimeMillis();
    this.count += 1L;
    int i = 0;
    while (i < 100)
    {
      IMCore.get().getUser(paramString).manualPush(new byte[] { 10, -99, 1, 10, -113, 1, 10, 30, 8, -76, 4, 16, 6, 24, -16, 80, 32, -87, -58, -100, 42, 40, -4, -121, -25, -72, 5, 48, -4, -121, -25, -72, 5, 64, -58, -59, -47, 2, 18, 99, 10, 19, 26, 17, 16, -79, -49, -118, -128, 2, 40, -3, -89, -55, -101, 5, 90, 3, 87, 101, 98, 34, 74, 8, -86, -62, -50, -84, -90, -128, -128, -128, 2, 16, -11, -72, -102, -97, -90, -128, -128, -128, 2, 24, 5, 32, 5, 42, 6, -25, -117, -105, -27, -72, -90, 56, -4, -55, -36, -120, 16, 66, 3, 66, 66, 67, 98, 14, 64, 84, 71, 83, 35, 50, 52, 72, 74, 79, 82, 65, 69, 77, 104, 0, 114, 11, 16, -56, 1, 50, 6, 120, 107, 97, 122, 101, 114, 58, 0, 34, 8, 34, 2, 8, 0, 40, 0, 80, 2, 18, 9, 10, 7, 18, 5, 10, 3, 10, 1, 51, 18, 21, 13, 10, -21, 8, 25, 21, 52, -127, 0, 0, 24, -44, -1, -53, -43, -90, -95, -4, -71, -88, 1 });
      i += 1;
    }
    l1 = System.currentTimeMillis() - l1;
    Log.e("XIAO", "totoal cost: " + l1 + "ms/" + i);
    Log.e("XIAO", "level: " + l1 / i + "mpm");
    long l2 = this.ttotal;
    this.ttotal = (l1 / i + l2);
    Log.e("XIAO", "ave: " + this.ttotal / this.count + "mpm/" + this.count);
  }
  
  public void request(String paramString1, String paramString2, byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    request(paramString1, paramString2, paramArrayOfByte, paramTIMValueCallBack, this.reqTimeout);
  }
  
  public void request(String paramString1, String paramString2, byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    ˎ localˎ = null;
    if (paramTIMValueCallBack != null) {
      localˎ = new ˎ(this, paramTIMValueCallBack, paramString2);
    }
    if (TextUtils.isEmpty(paramString1)) {
      paramString1 = TIMManager.getInstance().getIdentification();
    }
    for (;;)
    {
      QALSDKManager.getInstance().sendMsg(paramString1, paramString2, paramArrayOfByte, paramLong, localˎ);
      return;
    }
  }
  
  public void request(String paramString1, String paramString2, byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    ˑ localˑ = null;
    if (paramIMCmdListener != null) {
      localˑ = new ˑ(this, paramIMCmdListener);
    }
    request(paramString1, paramString2, paramArrayOfByte, localˑ);
  }
  
  public void setAvSDKVersionToBugly(String paramString1, String paramString2)
  {
    if (this.noCrashReport) {}
    for (;;)
    {
      return;
      if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed| invalid param");
        return;
      }
      try
      {
        Method localMethod = Class.forName("com.tencent.bugly.imsdk.crashreport.CrashReport").getMethod("setSdkExtraData", new Class[] { Context.class, String.class, String.class });
        if (localMethod != null)
        {
          localMethod.invoke(null, new Object[] { this.context, paramString1, paramString2 });
          return;
        }
      }
      catch (ClassNotFoundException paramString1)
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed|ClassNotFoundException| do not have jar");
        return;
      }
      catch (NoSuchMethodException paramString1)
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed|NoSuchMethodException");
        return;
      }
      catch (InvocationTargetException paramString1)
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed|InvocationTargetException");
        return;
      }
      catch (IllegalAccessException paramString1)
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed|IllegalAccessException");
        return;
      }
      catch (Exception paramString1)
      {
        QLog.e("imsdk.IMMsfCoreProxy", 1, "setAvSDKVersionToBugly failed|" + paramString1.toString());
      }
    }
  }
  
  public void setEnv(int paramInt)
  {
    this.env = paramInt;
    QALSDKManager.getInstance().setEnv(paramInt);
  }
  
  public void setMode(int paramInt)
  {
    this.mode = paramInt;
  }
  
  public void setReqTimeout(long paramLong)
  {
    this.reqTimeout = paramLong;
  }
  
  public void setSdkType(String paramString)
  {
    this.sdkType = paramString;
  }
  
  public void setTIMLogCbLevel(TIMLogLevel paramTIMLogLevel)
  {
    this.logCbLevel = paramTIMLogLevel;
  }
  
  public void setTIMLogListener(TIMLogListener paramTIMLogListener)
  {
    this.logListener = paramTIMLogListener;
    QLog.setSdkLogListener(paramTIMLogListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\IMMsfCoreProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */