package com.android.thinkive.framework;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.android.thinkive.framework.compatible.TaskScheduler;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.db.ThinkiveDatabase;
import com.android.thinkive.framework.download.DownloadManager;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.network.http.MultiPartStack;
import com.android.thinkive.framework.theme.ThemeManager;
import com.android.thinkive.framework.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpClientStack;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ThinkiveInitializer
{
  private static final String DEFAULT_CACHE_DIR = "volley";
  private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
  private static final String NETWORK_THREAD_COUNT = "networkThreadCount";
  private static final String TAG = "thinkive";
  private static boolean isExit;
  private static Context mContext;
  private static ThinkiveInitializer sInstance;
  private HashMap<String, Activity> mActivtyStack = new HashMap();
  private BackupServerManager mBackupServerManager;
  private DownloadManager mDownloadManager;
  private Handler mHandler = new Handler();
  private Handler mMessageHandler = new ThinkiveInitializer.1(this);
  private NetWorkService mNetWorkService;
  private RequestQueue mRequestQueue;
  private HashMap<String, RequestQueue> mRequestQueueMap;
  private TaskScheduler mTaskScheduler;
  private ThreadManager mThreadManager;
  private WebViewManager mWebViewManager;
  
  public static ThinkiveInitializer getInstance()
  {
    if (sInstance == null) {
      sInstance = new ThinkiveInitializer();
    }
    return sInstance;
  }
  
  public static boolean isExit()
  {
    return isExit;
  }
  
  private RequestQueue newRequestQueue(Context paramContext, HttpStack paramHttpStack)
  {
    int j = 4;
    String str = ConfigManager.getInstance().getSystemConfigValue("networkThreadCount");
    int i = j;
    if (!TextUtils.isEmpty(str))
    {
      i = j;
      if (Integer.parseInt(str) >= 1) {
        i = Integer.parseInt(str);
      }
    }
    return newRequestQueue(paramContext, paramHttpStack, i);
  }
  
  private RequestQueue newRequestQueue(Context paramContext, HttpStack paramHttpStack, int paramInt)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    Object localObject = "volley/0";
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      paramContext = str + "/" + paramContext.versionCode;
      localObject = paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      label142:
      for (;;) {}
    }
    paramContext = paramHttpStack;
    if (paramHttpStack == null) {
      if (Build.VERSION.SDK_INT < 9) {
        break label142;
      }
    }
    for (paramContext = new HurlStack();; paramContext = new HttpClientStack(AndroidHttpClient.newInstance((String)localObject)))
    {
      paramContext = new BasicNetwork(paramContext);
      Log.d("config network Thread Count = " + paramInt);
      paramContext = new RequestQueue(new DiskBasedCache(localFile), paramContext, paramInt);
      paramContext.start();
      return paramContext;
    }
  }
  
  public <T> void addToRequestQueue(Request<T> paramRequest)
  {
    paramRequest.setTag("thinkive");
    getRequestQueue().add(paramRequest);
  }
  
  public <T> void addToRequestQueue(Request<T> paramRequest, String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "thinkive";
    }
    paramRequest.setTag(str);
    VolleyLog.d("Add request to queue: %s", new Object[] { paramRequest.getUrl() });
    getRequestQueue().add(paramRequest);
  }
  
  public <T> void addToRequestQueue(Request<T> paramRequest, String paramString1, String paramString2)
  {
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "thinkive";
    }
    paramRequest.setTag(str);
    VolleyLog.d("Add request to queue: %s", new Object[] { paramRequest.getUrl() });
    getRequestQueue(paramString2).add(paramRequest);
  }
  
  public void cancelPendingRequests(Object paramObject)
  {
    if (this.mRequestQueue != null) {
      this.mRequestQueue.cancelAll(paramObject);
    }
    Iterator localIterator;
    if (this.mRequestQueueMap.size() > 0) {
      localIterator = this.mRequestQueueMap.entrySet().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((RequestQueue)((Map.Entry)localIterator.next()).getValue()).cancelAll(paramObject);
    }
  }
  
  public void clearActivityStack()
  {
    Iterator localIterator = this.mActivtyStack.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        this.mActivtyStack.clear();
        return;
      }
      String str = (String)localIterator.next();
      ((Activity)this.mActivtyStack.get(str)).finish();
    }
  }
  
  public void exit()
  {
    clearActivityStack();
    isExit = true;
    onTerminate();
    Process.killProcess(Process.myPid());
  }
  
  public Activity getActivity(String paramString)
  {
    return (Activity)this.mActivtyStack.get(paramString);
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  public Handler getHandler()
  {
    return this.mHandler;
  }
  
  public RequestQueue getRequestQueue()
  {
    try
    {
      if (this.mRequestQueue == null) {
        this.mRequestQueue = newRequestQueue(mContext, new MultiPartStack());
      }
      RequestQueue localRequestQueue = this.mRequestQueue;
      return localRequestQueue;
    }
    finally {}
  }
  
  /* Error */
  public RequestQueue getRequestQueue(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 250	com/android/thinkive/framework/ThinkiveInitializer:mRequestQueueMap	Ljava/util/HashMap;
    //   6: aload_1
    //   7: invokevirtual 289	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast 184	com/android/volley/RequestQueue
    //   13: astore_3
    //   14: aload_3
    //   15: astore_2
    //   16: aload_3
    //   17: ifnonnull +73 -> 90
    //   20: invokestatic 86	com/android/thinkive/framework/config/ConfigManager:getInstance	()Lcom/android/thinkive/framework/config/ConfigManager;
    //   23: invokevirtual 323	com/android/thinkive/framework/config/ConfigManager:getRequestQueueConfig	()Ljava/util/ArrayList;
    //   26: invokevirtual 326	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   29: astore_2
    //   30: iconst_2
    //   31: istore 4
    //   33: aload_2
    //   34: invokeinterface 269 1 0
    //   39: ifne +55 -> 94
    //   42: new 136	java/lang/StringBuilder
    //   45: dup
    //   46: ldc_w 328
    //   49: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   52: iload 4
    //   54: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokestatic 182	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   63: aload_0
    //   64: getstatic 71	com/android/thinkive/framework/ThinkiveInitializer:mContext	Landroid/content/Context;
    //   67: new 316	com/android/thinkive/framework/network/http/MultiPartStack
    //   70: dup
    //   71: invokespecial 317	com/android/thinkive/framework/network/http/MultiPartStack:<init>	()V
    //   74: iload 4
    //   76: invokespecial 105	com/android/thinkive/framework/ThinkiveInitializer:newRequestQueue	(Landroid/content/Context;Lcom/android/volley/toolbox/HttpStack;I)Lcom/android/volley/RequestQueue;
    //   79: astore_2
    //   80: aload_0
    //   81: getfield 250	com/android/thinkive/framework/ThinkiveInitializer:mRequestQueueMap	Ljava/util/HashMap;
    //   84: aload_1
    //   85: aload_2
    //   86: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_2
    //   93: areturn
    //   94: aload_2
    //   95: invokeinterface 273 1 0
    //   100: checkcast 334	com/android/thinkive/framework/config/RequestQueueBean
    //   103: astore_3
    //   104: aload_1
    //   105: aload_3
    //   106: invokevirtual 337	com/android/thinkive/framework/config/RequestQueueBean:getName	()Ljava/lang/String;
    //   109: invokevirtual 341	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   112: ifeq -79 -> 33
    //   115: aload_3
    //   116: invokevirtual 344	com/android/thinkive/framework/config/RequestQueueBean:getThreadCount	()I
    //   119: ifle -86 -> 33
    //   122: aload_3
    //   123: invokevirtual 344	com/android/thinkive/framework/config/RequestQueueBean:getThreadCount	()I
    //   126: istore 4
    //   128: goto -95 -> 33
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	ThinkiveInitializer
    //   0	136	1	paramString	String
    //   15	80	2	localObject1	Object
    //   13	110	3	localObject2	Object
    //   31	96	4	i	int
    // Exception table:
    //   from	to	target	type
    //   2	14	131	finally
    //   20	30	131	finally
    //   33	90	131	finally
    //   94	128	131	finally
  }
  
  public TaskScheduler getScheduler()
  {
    return this.mTaskScheduler;
  }
  
  public void initialze(Context paramContext)
  {
    if (mContext == null) {
      mContext = paramContext;
    }
    isExit = false;
    ConfigManager.getInstance().parseConfigFile(paramContext);
    ThemeManager.getInstance(paramContext).loadThemeInfo();
    String str = ConfigManager.getInstance().getSystemConfigValue("isDebug");
    if (!TextUtils.isEmpty(str)) {
      Log.isDebug = Boolean.parseBoolean(str);
    }
    this.mWebViewManager = WebViewManager.getInstance();
    this.mThreadManager = ThreadManager.getInstance();
    this.mDownloadManager = DownloadManager.getInstance(paramContext);
    this.mTaskScheduler = new TaskScheduler(this.mMessageHandler);
    this.mBackupServerManager = BackupServerManager.getInstance();
    this.mBackupServerManager.requestBackupServerUrl();
    new MultiAddressManager(paramContext).routeServerAddress();
    this.mNetWorkService = NetWorkService.getInstance();
    this.mRequestQueueMap = new HashMap();
  }
  
  public void onTerminate()
  {
    Log.d("ThinkiveInitializer onTerminate!!!");
    this.mWebViewManager.release();
    this.mThreadManager.shutdown();
    DownloadManager.getInstance(mContext).shutdown();
    this.mBackupServerManager.release();
    cancelPendingRequests("thinkive");
    ThinkiveDatabase.getInstance(mContext).close();
    this.mNetWorkService.release();
  }
  
  public void popActivity(String paramString)
  {
    this.mActivtyStack.remove(paramString);
  }
  
  public void pushActivity(String paramString, Activity paramActivity)
  {
    this.mActivtyStack.put(paramString, paramActivity);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\ThinkiveInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */