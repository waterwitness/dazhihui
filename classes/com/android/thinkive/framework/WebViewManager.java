package com.android.thinkive.framework;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.js.BaseJsInterface;
import com.android.thinkive.framework.util.AppUtil;
import com.android.thinkive.framework.util.FileUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.PreferencesUtil;
import com.android.thinkive.framework.view.MyWebView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class WebViewManager
{
  public static final String BROADCAST_H5_UNZIP_COMPLETE = "com.thinkive.android.h5.unzip.complete";
  private static final String DISABLE_WEBVIEWCACHE = "disableWebViewCache";
  private static final String JS_INTERFACE_NAME = "external";
  private static final String UNZIP_COMPLETE_FLAG = "isUnzipComplete";
  private static final String WEBVIEW_COUNT = "webviewCount";
  private static int sFixedWebViewCount = 5;
  private static WebViewManager sInstance;
  private HashMap<String, String> mCacheMap;
  private Context mContext = ThinkiveInitializer.getInstance().getContext();
  private ArrayList<MyWebView> mFixedWebViewList;
  private WebViewManager.unZipState mH5FileUnZipState;
  private String mH5FilesSavePath;
  private boolean mIsSupportH5Upgrade = false;
  private BroadcastReceiver mUpgradeCompleteReceiver = new WebViewManager.1(this);
  private ArrayList<MyWebView> mUsedWebViewList;
  
  private WebViewManager()
  {
    String str = ConfigManager.getInstance().getSystemConfigValue("webviewCount");
    if (!TextUtils.isEmpty(str)) {
      sFixedWebViewCount = Integer.parseInt(str);
    }
    this.mFixedWebViewList = new ArrayList(sFixedWebViewCount);
    this.mUsedWebViewList = new ArrayList();
    this.mCacheMap = new HashMap();
    str = ConfigManager.getInstance().getSystemConfigValue("disableWebViewCache");
    if ((!TextUtils.isEmpty(str)) && (Boolean.parseBoolean(str))) {
      return;
    }
    initWebView();
    initData();
  }
  
  /* Error */
  private void activateWebView(MyWebView paramMyWebView)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 149	com/android/thinkive/framework/view/MyWebView:isPersistence	()Z
    //   6: ifeq +24 -> 30
    //   9: aload_0
    //   10: getfield 97	com/android/thinkive/framework/WebViewManager:mFixedWebViewList	Ljava/util/ArrayList;
    //   13: aload_1
    //   14: invokevirtual 153	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   17: pop
    //   18: aload_0
    //   19: getfield 100	com/android/thinkive/framework/WebViewManager:mUsedWebViewList	Ljava/util/ArrayList;
    //   22: aload_1
    //   23: invokevirtual 156	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   26: pop
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: getfield 100	com/android/thinkive/framework/WebViewManager:mUsedWebViewList	Ljava/util/ArrayList;
    //   34: aload_1
    //   35: invokevirtual 156	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   38: pop
    //   39: goto -12 -> 27
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	WebViewManager
    //   0	47	1	paramMyWebView	MyWebView
    // Exception table:
    //   from	to	target	type
    //   2	27	42	finally
    //   30	39	42	finally
  }
  
  private MyWebView buildWebView(Context paramContext)
  {
    paramContext = new MyWebView(paramContext);
    Object localObject = paramContext.getContext().getApplicationContext().getDir("database", 0).getPath();
    paramContext.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramContext.getSettings().setJavaScriptEnabled(true);
    paramContext.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
    paramContext.getSettings().setDomStorageEnabled(true);
    paramContext.getSettings().setAppCachePath((String)localObject);
    paramContext.getSettings().setAllowFileAccess(true);
    paramContext.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    paramContext.getSettings().setAppCacheEnabled(true);
    paramContext.getSettings().setGeolocationDatabasePath((String)localObject);
    paramContext.getSettings().setGeolocationEnabled(true);
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.getSettings().setAllowFileAccessFromFileURLs(true);
    }
    paramContext.getSettings().setDatabaseEnabled(true);
    paramContext.getSettings().setDatabasePath((String)localObject);
    paramContext.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
    localObject = paramContext.getSettings().getUserAgentString();
    paramContext.getSettings().setUserAgentString(localObject + "/thinkive_android");
    if (((paramContext.getContext().getApplicationContext().getApplicationInfo().flags & 0x2) != 0) && (Build.VERSION.SDK_INT >= 19)) {
      enableRemoteDebugging();
    }
    paramContext.setWebViewClient(new WebViewManager.3(this));
    paramContext.setVerticalScrollBarEnabled(false);
    localObject = new BaseJsInterface(this.mContext, paramContext);
    paramContext.addJavascriptInterface(localObject, "external");
    if (Build.VERSION.SDK_INT >= 21)
    {
      CookieManager.getInstance().setAcceptCookie(true);
      CookieManager.getInstance().setAcceptThirdPartyCookies(paramContext, true);
    }
    paramContext.setJsInterface((BaseJsInterface)localObject);
    return paramContext;
  }
  
  @TargetApi(19)
  private void enableRemoteDebugging()
  {
    try
    {
      WebView.setWebContentsDebuggingEnabled(true);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Log.d("You have one job! To turn on Remote Web Debugging! YOU HAVE FAILED! ");
      localIllegalArgumentException.printStackTrace();
    }
  }
  
  public static WebViewManager getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new WebViewManager();
      }
      WebViewManager localWebViewManager = sInstance;
      return localWebViewManager;
    }
    finally {}
  }
  
  private MyWebView getPreloadWebView(String paramString)
  {
    int j = 0;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= this.mUsedWebViewList.size())
        {
          if (this.mFixedWebViewList.size() <= 0) {
            break label158;
          }
          i = j;
          if (i >= this.mFixedWebViewList.size())
          {
            localMyWebView1 = null;
            localMyWebView2 = localMyWebView1;
            if (localMyWebView1 == null)
            {
              localMyWebView2 = (MyWebView)this.mFixedWebViewList.get(0);
              localMyWebView2.setWebViewName(paramString);
            }
            activateWebView(localMyWebView2);
            return localMyWebView2;
          }
        }
        else
        {
          localMyWebView1 = (MyWebView)this.mUsedWebViewList.get(i);
          if (!paramString.equals(localMyWebView1.getWebViewName())) {
            break label163;
          }
          localMyWebView2 = localMyWebView1;
          if (localMyWebView1.getParent() == null) {
            continue;
          }
          break label163;
        }
        MyWebView localMyWebView1 = (MyWebView)this.mFixedWebViewList.get(i);
        boolean bool = paramString.equals(localMyWebView1.getWebViewName());
        if (bool) {
          continue;
        }
        i += 1;
        continue;
        MyWebView localMyWebView2 = null;
      }
      finally {}
      label158:
      continue;
      label163:
      i += 1;
    }
  }
  
  private void initData()
  {
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("com.thinkive.android.h5.upgrade.complete");
    this.mContext.registerReceiver(this.mUpgradeCompleteReceiver, (IntentFilter)localObject);
    for (;;)
    {
      try
      {
        localObject = this.mContext.getAssets().list("");
        j = localObject.length;
        i = 0;
        if (i < j) {
          continue;
        }
      }
      catch (IOException localIOException)
      {
        int j;
        int i;
        localIOException.printStackTrace();
        continue;
        this.mH5FileUnZipState = WebViewManager.unZipState.STATUS_FINISHED;
        return;
      }
      Log.e("mIsSupportH5Upgrade = " + this.mIsSupportH5Upgrade);
      this.mH5FilesSavePath = this.mContext.getFilesDir().getPath();
      if (!this.mIsSupportH5Upgrade) {
        break label254;
      }
      i = AppUtil.getH5VersionCode(this.mContext);
      j = AppUtil.getVersionCode(this.mContext);
      Log.d("h5VersionCode = " + i + " nativeVersionCode = " + j);
      if (j > i)
      {
        FileUtil.deleteFile(new File(this.mH5FilesSavePath, "www"));
        PreferencesUtil.putBoolean(this.mContext, "isUnzipComplete", false);
      }
      if (PreferencesUtil.getBoolean(this.mContext, "isUnzipComplete")) {
        continue;
      }
      this.mH5FileUnZipState = WebViewManager.unZipState.STATUS_PENDDING;
      ThreadManager.getInstance().submit(new WebViewManager.H5FileReadyThread(this, this.mContext));
      return;
      if (localObject[i].equals("m.zip")) {
        this.mIsSupportH5Upgrade = true;
      }
      i += 1;
    }
    label254:
    this.mH5FileUnZipState = WebViewManager.unZipState.STATUS_FINISHED;
  }
  
  private void initWebView()
  {
    int i = 0;
    for (;;)
    {
      if (i >= sFixedWebViewCount) {
        return;
      }
      MyWebView localMyWebView = buildWebView(this.mContext);
      localMyWebView.setIsPersistence(true);
      localMyWebView.setIsLoadComplete(false);
      this.mFixedWebViewList.add(localMyWebView);
      i += 1;
    }
  }
  
  private void loadUrl(MyWebView paramMyWebView, String paramString)
  {
    String[] arrayOfString = splitUrl(paramString);
    if (arrayOfString.length == 1)
    {
      paramMyWebView.setUrlPrefix(arrayOfString[0]);
      paramMyWebView.setUrlSuffix("");
    }
    for (;;)
    {
      ThinkiveInitializer.getInstance().getHandler().post(new WebViewManager.2(this, paramString, paramMyWebView));
      return;
      if (arrayOfString.length == 2)
      {
        paramMyWebView.setUrlPrefix(arrayOfString[0]);
        paramMyWebView.setUrlSuffix(arrayOfString[1]);
      }
      else
      {
        paramMyWebView.setUrlPrefix("");
        paramMyWebView.setUrlSuffix("");
      }
    }
  }
  
  private void updateH5VersionInfo()
  {
    int i = AppUtil.getVersionCode(this.mContext);
    String str = AppUtil.getVersionName(this.mContext);
    PreferencesUtil.putInt(this.mContext, "h5_version_code", i);
    PreferencesUtil.putString(this.mContext, "h5_version_name", str);
  }
  
  public ArrayList<MyWebView> getFixedWebViewList()
  {
    return this.mFixedWebViewList;
  }
  
  public WebViewManager.unZipState getH5UnZipState()
  {
    return this.mH5FileUnZipState;
  }
  
  public MyWebView getNewWebView(Context paramContext)
  {
    try
    {
      paramContext = buildWebView(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public MyWebView getWebView(String paramString)
  {
    int j = 0;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= this.mUsedWebViewList.size())
        {
          if (this.mFixedWebViewList.size() <= 0) {
            break label285;
          }
          i = j;
          if (i >= this.mFixedWebViewList.size())
          {
            if (0 != 0) {
              break label285;
            }
            localObject2 = (MyWebView)this.mFixedWebViewList.get(0);
            ((MyWebView)localObject2).setWebViewName(paramString);
            ((MyWebView)localObject2).setIsLoadComplete(false);
            localObject1 = (String)this.mCacheMap.get(paramString);
            if (!TextUtils.isEmpty((CharSequence)localObject1)) {
              loadUrl((MyWebView)localObject2, (String)localObject1);
            }
            activateWebView((MyWebView)localObject2);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = buildWebView(this.mContext);
              ((MyWebView)localObject1).setIsPersistence(false);
              ((MyWebView)localObject1).setWebViewName(paramString);
              ((MyWebView)localObject1).setIsLoadComplete(false);
              localObject2 = (String)this.mCacheMap.get(paramString);
              Log.d("cache webViewName = " + paramString + " url = " + (String)localObject2);
              if (!TextUtils.isEmpty((CharSequence)localObject2)) {
                loadUrl((MyWebView)localObject1, (String)localObject2);
              }
              activateWebView((MyWebView)localObject1);
            }
            return (MyWebView)localObject1;
          }
        }
        else
        {
          localObject2 = (MyWebView)this.mUsedWebViewList.get(i);
          if (!paramString.equals(((MyWebView)localObject2).getWebViewName())) {
            break label290;
          }
          localObject1 = localObject2;
          if (((MyWebView)localObject2).getParent() == null) {
            continue;
          }
          break label290;
        }
        Object localObject1 = (MyWebView)this.mFixedWebViewList.get(i);
        if ((paramString.equals(((MyWebView)localObject1).getWebViewName())) && (((MyWebView)localObject1).getParent() == null))
        {
          activateWebView((MyWebView)localObject1);
          continue;
        }
        i += 1;
      }
      finally {}
      continue;
      label285:
      Object localObject2 = null;
      continue;
      label290:
      i += 1;
    }
  }
  
  public boolean isSupportH5Upgrade()
  {
    return this.mIsSupportH5Upgrade;
  }
  
  public void preLoad(String paramString1, String paramString2, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        MyWebView localMyWebView = getPreloadWebView(paramString2);
        if (localMyWebView != null)
        {
          paramString2 = localMyWebView.getLoadUrl();
          Log.d("webview loaded Url = " + paramString2 + " current url = " + paramString1);
          if (!paramString1.equals(paramString2))
          {
            localMyWebView.setIsLoadComplete(false);
            loadUrl(localMyWebView, paramString1);
            return;
          }
          if (!paramBoolean) {
            continue;
          }
          localMyWebView.setIsLoadComplete(false);
          loadUrl(localMyWebView, paramString1);
          continue;
        }
        Log.e("webViewName = " + paramString2 + "预加载webview个数超过配置的数量，不执行!!!");
      }
      finally {}
      this.mCacheMap.put(paramString2, paramString1);
    }
  }
  
  public void release()
  {
    this.mContext.unregisterReceiver(this.mUpgradeCompleteReceiver);
    this.mFixedWebViewList.clear();
    this.mUsedWebViewList.clear();
    this.mCacheMap.clear();
    sInstance = null;
  }
  
  /* Error */
  public void releaseWebView(MyWebView paramMyWebView)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 259	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 571
    //   9: invokespecial 267	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: aload_1
    //   13: invokevirtual 574	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   16: ldc_w 576
    //   19: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_1
    //   23: invokevirtual 369	com/android/thinkive/framework/view/MyWebView:getWebViewName	()Ljava/lang/String;
    //   26: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc_w 539
    //   32: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: aload_1
    //   36: invokevirtual 547	com/android/thinkive/framework/view/MyWebView:getLoadUrl	()Ljava/lang/String;
    //   39: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc_w 578
    //   45: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_1
    //   49: invokevirtual 149	com/android/thinkive/framework/view/MyWebView:isPersistence	()Z
    //   52: invokevirtual 407	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   55: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokestatic 343	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   61: aload_1
    //   62: invokevirtual 149	com/android/thinkive/framework/view/MyWebView:isPersistence	()Z
    //   65: ifeq +24 -> 89
    //   68: aload_0
    //   69: getfield 100	com/android/thinkive/framework/WebViewManager:mUsedWebViewList	Ljava/util/ArrayList;
    //   72: aload_1
    //   73: invokevirtual 153	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   76: pop
    //   77: aload_0
    //   78: getfield 97	com/android/thinkive/framework/WebViewManager:mFixedWebViewList	Ljava/util/ArrayList;
    //   81: aload_1
    //   82: invokevirtual 156	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   85: pop
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: aload_0
    //   90: getfield 100	com/android/thinkive/framework/WebViewManager:mUsedWebViewList	Ljava/util/ArrayList;
    //   93: aload_1
    //   94: invokevirtual 153	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   97: pop
    //   98: goto -12 -> 86
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	WebViewManager
    //   0	106	1	paramMyWebView	MyWebView
    // Exception table:
    //   from	to	target	type
    //   2	86	101	finally
    //   89	98	101	finally
  }
  
  public String[] splitUrl(String paramString)
  {
    return paramString.split("#!/");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\WebViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */