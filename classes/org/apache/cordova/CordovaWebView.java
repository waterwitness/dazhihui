package org.apache.cordova;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class CordovaWebView
  extends WebView
{
  public static final String CORDOVA_VERSION = "3.5.0";
  static final FrameLayout.LayoutParams COVER_SCREEN_GRAVITY_CENTER = new FrameLayout.LayoutParams(-1, -1, 17);
  public static final String TAG = "CordovaWebView";
  private boolean bound;
  private CordovaChromeClient chromeClient;
  private CordovaInterface cordova;
  ExposedJsApi exposedJsApi;
  private boolean handleButton = false;
  NativeToJsMessageQueue jsMessageQueue;
  private ArrayList<Integer> keyDownCodes = new ArrayList();
  private ArrayList<Integer> keyUpCodes = new ArrayList();
  private long lastMenuEventTime = 0L;
  int loadUrlTimeout = 0;
  private View mCustomView;
  private WebChromeClient.CustomViewCallback mCustomViewCallback;
  private CordovaWebView.ActivityResult mResult = null;
  private boolean paused;
  public PluginManager pluginManager;
  private BroadcastReceiver receiver;
  private CordovaResourceApi resourceApi;
  private String url;
  CordovaWebViewClient viewClient;
  
  public CordovaWebView(Context paramContext)
  {
    super(paramContext);
    if (CordovaInterface.class.isInstance(paramContext)) {
      this.cordova = ((CordovaInterface)paramContext);
    }
    for (;;)
    {
      loadConfiguration();
      setup();
      return;
      Log.d("CordovaWebView", "Your activity must implement CordovaInterface to work");
    }
  }
  
  public CordovaWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (CordovaInterface.class.isInstance(paramContext)) {
      this.cordova = ((CordovaInterface)paramContext);
    }
    for (;;)
    {
      setWebChromeClient(new CordovaChromeClient(this.cordova, this));
      initWebViewClient(this.cordova);
      loadConfiguration();
      setup();
      return;
      Log.d("CordovaWebView", "Your activity must implement CordovaInterface to work");
    }
  }
  
  public CordovaWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (CordovaInterface.class.isInstance(paramContext)) {
      this.cordova = ((CordovaInterface)paramContext);
    }
    for (;;)
    {
      setWebChromeClient(new CordovaChromeClient(this.cordova, this));
      loadConfiguration();
      setup();
      return;
      Log.d("CordovaWebView", "Your activity must implement CordovaInterface to work");
    }
  }
  
  @TargetApi(11)
  public CordovaWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt, paramBoolean);
    if (CordovaInterface.class.isInstance(paramContext)) {
      this.cordova = ((CordovaInterface)paramContext);
    }
    for (;;)
    {
      setWebChromeClient(new CordovaChromeClient(this.cordova));
      initWebViewClient(this.cordova);
      loadConfiguration();
      setup();
      return;
      Log.d("CordovaWebView", "Your activity must implement CordovaInterface to work");
    }
  }
  
  private void exposeJsInterface()
  {
    if (Build.VERSION.SDK_INT < 17)
    {
      Log.i("CordovaWebView", "Disabled addJavascriptInterface() bridge since Android version is old.");
      return;
    }
    addJavascriptInterface(this.exposedJsApi, "_cordovaNative");
  }
  
  private void initWebViewClient(CordovaInterface paramCordovaInterface)
  {
    if ((Build.VERSION.SDK_INT < 11) || (Build.VERSION.SDK_INT > 17))
    {
      setWebViewClient(new CordovaWebViewClient(this.cordova, this));
      return;
    }
    setWebViewClient(new IceCreamCordovaWebViewClient(this.cordova, this));
  }
  
  private void loadConfiguration()
  {
    if ("true".equals(getProperty("Fullscreen", "false")))
    {
      this.cordova.getActivity().getWindow().clearFlags(2048);
      this.cordova.getActivity().getWindow().setFlags(1024, 1024);
    }
  }
  
  /* Error */
  @android.annotation.SuppressLint({"NewApi"})
  private void setup()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokevirtual 216	org/apache/cordova/CordovaWebView:setInitialScale	(I)V
    //   5: aload_0
    //   6: iconst_0
    //   7: invokevirtual 220	org/apache/cordova/CordovaWebView:setVerticalScrollBarEnabled	(Z)V
    //   10: aload_0
    //   11: invokevirtual 224	org/apache/cordova/CordovaWebView:shouldRequestFocusOnInit	()Z
    //   14: ifeq +8 -> 22
    //   17: aload_0
    //   18: invokevirtual 227	org/apache/cordova/CordovaWebView:requestFocusFromTouch	()Z
    //   21: pop
    //   22: aload_0
    //   23: invokevirtual 231	org/apache/cordova/CordovaWebView:getSettings	()Landroid/webkit/WebSettings;
    //   26: astore_1
    //   27: aload_1
    //   28: iconst_1
    //   29: invokevirtual 236	android/webkit/WebSettings:setJavaScriptEnabled	(Z)V
    //   32: aload_1
    //   33: iconst_1
    //   34: invokevirtual 239	android/webkit/WebSettings:setJavaScriptCanOpenWindowsAutomatically	(Z)V
    //   37: aload_1
    //   38: getstatic 245	android/webkit/WebSettings$LayoutAlgorithm:NORMAL	Landroid/webkit/WebSettings$LayoutAlgorithm;
    //   41: invokevirtual 249	android/webkit/WebSettings:setLayoutAlgorithm	(Landroid/webkit/WebSettings$LayoutAlgorithm;)V
    //   44: ldc -23
    //   46: ldc -5
    //   48: iconst_1
    //   49: anewarray 82	java/lang/Class
    //   52: dup
    //   53: iconst_0
    //   54: getstatic 257	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   57: aastore
    //   58: invokevirtual 261	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: astore_2
    //   62: getstatic 266	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   65: astore_3
    //   66: ldc 13
    //   68: new 268	java/lang/StringBuilder
    //   71: dup
    //   72: ldc_w 270
    //   75: invokespecial 273	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: aload_3
    //   79: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   88: pop
    //   89: getstatic 143	android/os/Build$VERSION:SDK_INT	I
    //   92: bipush 11
    //   94: if_icmpge +32 -> 126
    //   97: getstatic 266	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   100: ldc_w 283
    //   103: invokevirtual 287	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   106: ifeq +20 -> 126
    //   109: aload_2
    //   110: aload_1
    //   111: iconst_1
    //   112: anewarray 289	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: iconst_1
    //   118: invokestatic 293	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   121: aastore
    //   122: invokevirtual 299	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   125: pop
    //   126: aload_1
    //   127: iconst_0
    //   128: invokevirtual 302	android/webkit/WebSettings:setSaveFormData	(Z)V
    //   131: aload_1
    //   132: iconst_0
    //   133: invokevirtual 305	android/webkit/WebSettings:setSavePassword	(Z)V
    //   136: getstatic 143	android/os/Build$VERSION:SDK_INT	I
    //   139: bipush 15
    //   141: if_icmple +7 -> 148
    //   144: aload_1
    //   145: invokestatic 311	org/apache/cordova/CordovaWebView$Level16Apis:enableUniversalAccess	(Landroid/webkit/WebSettings;)V
    //   148: aload_0
    //   149: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   152: invokeinterface 185 1 0
    //   157: invokevirtual 315	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   160: ldc_w 317
    //   163: iconst_0
    //   164: invokevirtual 323	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   167: invokevirtual 328	java/io/File:getPath	()Ljava/lang/String;
    //   170: astore_2
    //   171: aload_1
    //   172: iconst_1
    //   173: invokevirtual 331	android/webkit/WebSettings:setDatabaseEnabled	(Z)V
    //   176: aload_1
    //   177: aload_2
    //   178: invokevirtual 334	android/webkit/WebSettings:setDatabasePath	(Ljava/lang/String;)V
    //   181: aload_0
    //   182: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   185: invokeinterface 185 1 0
    //   190: invokevirtual 337	android/app/Activity:getPackageName	()Ljava/lang/String;
    //   193: astore_3
    //   194: aload_0
    //   195: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   198: invokeinterface 185 1 0
    //   203: invokevirtual 341	android/app/Activity:getPackageManager	()Landroid/content/pm/PackageManager;
    //   206: aload_3
    //   207: sipush 128
    //   210: invokevirtual 347	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   213: getfield 352	android/content/pm/ApplicationInfo:flags	I
    //   216: iconst_2
    //   217: iand
    //   218: ifeq +15 -> 233
    //   221: getstatic 143	android/os/Build$VERSION:SDK_INT	I
    //   224: bipush 19
    //   226: if_icmplt +7 -> 233
    //   229: iconst_1
    //   230: invokestatic 355	org/apache/cordova/CordovaWebView:setWebContentsDebuggingEnabled	(Z)V
    //   233: aload_1
    //   234: aload_2
    //   235: invokevirtual 358	android/webkit/WebSettings:setGeolocationDatabasePath	(Ljava/lang/String;)V
    //   238: aload_1
    //   239: iconst_1
    //   240: invokevirtual 361	android/webkit/WebSettings:setDomStorageEnabled	(Z)V
    //   243: aload_1
    //   244: iconst_1
    //   245: invokevirtual 364	android/webkit/WebSettings:setGeolocationEnabled	(Z)V
    //   248: aload_1
    //   249: ldc2_w 365
    //   252: invokevirtual 370	android/webkit/WebSettings:setAppCacheMaxSize	(J)V
    //   255: aload_1
    //   256: aload_0
    //   257: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   260: invokeinterface 185 1 0
    //   265: invokevirtual 315	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   268: ldc_w 317
    //   271: iconst_0
    //   272: invokevirtual 323	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   275: invokevirtual 328	java/io/File:getPath	()Ljava/lang/String;
    //   278: invokevirtual 373	android/webkit/WebSettings:setAppCachePath	(Ljava/lang/String;)V
    //   281: aload_1
    //   282: iconst_1
    //   283: invokevirtual 376	android/webkit/WebSettings:setAppCacheEnabled	(Z)V
    //   286: aload_0
    //   287: invokespecial 135	org/apache/cordova/CordovaWebView:updateUserAgentString	()V
    //   290: new 378	android/content/IntentFilter
    //   293: dup
    //   294: invokespecial 379	android/content/IntentFilter:<init>	()V
    //   297: astore_1
    //   298: aload_1
    //   299: ldc_w 381
    //   302: invokevirtual 384	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   305: aload_0
    //   306: getfield 386	org/apache/cordova/CordovaWebView:receiver	Landroid/content/BroadcastReceiver;
    //   309: ifnonnull +33 -> 342
    //   312: aload_0
    //   313: new 388	org/apache/cordova/CordovaWebView$1
    //   316: dup
    //   317: aload_0
    //   318: invokespecial 390	org/apache/cordova/CordovaWebView$1:<init>	(Lorg/apache/cordova/CordovaWebView;)V
    //   321: putfield 386	org/apache/cordova/CordovaWebView:receiver	Landroid/content/BroadcastReceiver;
    //   324: aload_0
    //   325: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   328: invokeinterface 185 1 0
    //   333: aload_0
    //   334: getfield 386	org/apache/cordova/CordovaWebView:receiver	Landroid/content/BroadcastReceiver;
    //   337: aload_1
    //   338: invokevirtual 394	android/app/Activity:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   341: pop
    //   342: aload_0
    //   343: new 396	org/apache/cordova/PluginManager
    //   346: dup
    //   347: aload_0
    //   348: aload_0
    //   349: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   352: invokespecial 399	org/apache/cordova/PluginManager:<init>	(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;)V
    //   355: putfield 401	org/apache/cordova/CordovaWebView:pluginManager	Lorg/apache/cordova/PluginManager;
    //   358: aload_0
    //   359: new 403	org/apache/cordova/NativeToJsMessageQueue
    //   362: dup
    //   363: aload_0
    //   364: aload_0
    //   365: getfield 88	org/apache/cordova/CordovaWebView:cordova	Lorg/apache/cordova/CordovaInterface;
    //   368: invokespecial 404	org/apache/cordova/NativeToJsMessageQueue:<init>	(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;)V
    //   371: putfield 406	org/apache/cordova/CordovaWebView:jsMessageQueue	Lorg/apache/cordova/NativeToJsMessageQueue;
    //   374: aload_0
    //   375: new 408	org/apache/cordova/ExposedJsApi
    //   378: dup
    //   379: aload_0
    //   380: getfield 401	org/apache/cordova/CordovaWebView:pluginManager	Lorg/apache/cordova/PluginManager;
    //   383: aload_0
    //   384: getfield 406	org/apache/cordova/CordovaWebView:jsMessageQueue	Lorg/apache/cordova/NativeToJsMessageQueue;
    //   387: invokespecial 411	org/apache/cordova/ExposedJsApi:<init>	(Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V
    //   390: putfield 150	org/apache/cordova/CordovaWebView:exposedJsApi	Lorg/apache/cordova/ExposedJsApi;
    //   393: aload_0
    //   394: new 413	org/apache/cordova/CordovaResourceApi
    //   397: dup
    //   398: aload_0
    //   399: invokevirtual 416	org/apache/cordova/CordovaWebView:getContext	()Landroid/content/Context;
    //   402: aload_0
    //   403: getfield 401	org/apache/cordova/CordovaWebView:pluginManager	Lorg/apache/cordova/PluginManager;
    //   406: invokespecial 419	org/apache/cordova/CordovaResourceApi:<init>	(Landroid/content/Context;Lorg/apache/cordova/PluginManager;)V
    //   409: putfield 421	org/apache/cordova/CordovaWebView:resourceApi	Lorg/apache/cordova/CordovaResourceApi;
    //   412: aload_0
    //   413: invokespecial 423	org/apache/cordova/CordovaWebView:exposeJsInterface	()V
    //   416: return
    //   417: astore_2
    //   418: ldc 13
    //   420: ldc_w 425
    //   423: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   426: pop
    //   427: goto -301 -> 126
    //   430: astore_2
    //   431: ldc 13
    //   433: ldc_w 427
    //   436: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   439: pop
    //   440: goto -314 -> 126
    //   443: astore_2
    //   444: ldc 13
    //   446: ldc_w 429
    //   449: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   452: pop
    //   453: goto -327 -> 126
    //   456: astore_2
    //   457: ldc 13
    //   459: ldc_w 431
    //   462: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   465: pop
    //   466: goto -340 -> 126
    //   469: astore_3
    //   470: ldc 13
    //   472: ldc_w 433
    //   475: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   478: pop
    //   479: aload_3
    //   480: invokevirtual 436	java/lang/IllegalArgumentException:printStackTrace	()V
    //   483: goto -250 -> 233
    //   486: astore_3
    //   487: ldc 13
    //   489: ldc_w 438
    //   492: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   495: pop
    //   496: aload_3
    //   497: invokevirtual 439	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   500: goto -267 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	503	0	this	CordovaWebView
    //   26	312	1	localObject1	Object
    //   61	174	2	localObject2	Object
    //   417	1	2	localNoSuchMethodException	NoSuchMethodException
    //   430	1	2	localIllegalArgumentException1	IllegalArgumentException
    //   443	1	2	localIllegalAccessException	IllegalAccessException
    //   456	1	2	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   65	142	3	str	String
    //   469	11	3	localIllegalArgumentException2	IllegalArgumentException
    //   486	11	3	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    // Exception table:
    //   from	to	target	type
    //   44	126	417	java/lang/NoSuchMethodException
    //   44	126	430	java/lang/IllegalArgumentException
    //   44	126	443	java/lang/IllegalAccessException
    //   44	126	456	java/lang/reflect/InvocationTargetException
    //   181	233	469	java/lang/IllegalArgumentException
    //   181	233	486	android/content/pm/PackageManager$NameNotFoundException
  }
  
  private void updateUserAgentString()
  {
    getSettings().getUserAgentString();
  }
  
  public boolean backHistory()
  {
    if (super.canGoBack())
    {
      printBackForwardList();
      super.goBack();
      return true;
    }
    return false;
  }
  
  public void bindButton(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.keyDownCodes.add(Integer.valueOf(paramInt));
      return;
    }
    this.keyUpCodes.add(Integer.valueOf(paramInt));
  }
  
  public void bindButton(String paramString, boolean paramBoolean)
  {
    if (paramString.compareTo("volumeup") == 0) {
      this.keyDownCodes.add(Integer.valueOf(24));
    }
    while (paramString.compareTo("volumedown") != 0) {
      return;
    }
    this.keyDownCodes.add(Integer.valueOf(25));
  }
  
  public void bindButton(boolean paramBoolean)
  {
    this.bound = paramBoolean;
  }
  
  public String getProperty(String paramString1, String paramString2)
  {
    Bundle localBundle = this.cordova.getActivity().getIntent().getExtras();
    if (localBundle == null) {}
    do
    {
      return paramString2;
      paramString1 = localBundle.get(paramString1.toLowerCase(Locale.getDefault()));
    } while (paramString1 == null);
    return paramString1.toString();
  }
  
  public CordovaResourceApi getResourceApi()
  {
    return this.resourceApi;
  }
  
  public CordovaChromeClient getWebChromeClient()
  {
    return this.chromeClient;
  }
  
  public boolean hadKeyEvent()
  {
    return this.handleButton;
  }
  
  public void handleDestroy()
  {
    loadUrl("javascript:try{cordova.require('cordova/channel').onDestroy.fire();}catch(e){console.log('exception firing destroy event from native');};");
    loadUrl("about:blank");
    if (this.pluginManager != null) {
      this.pluginManager.onDestroy();
    }
    if (this.receiver != null) {}
    try
    {
      this.cordova.getActivity().unregisterReceiver(this.receiver);
      return;
    }
    catch (Exception localException)
    {
      Log.e("CordovaWebView", "Error unregistering configuration receiver: " + localException.getMessage(), localException);
    }
  }
  
  public void handlePause(boolean paramBoolean)
  {
    LOG.d("CordovaWebView", "Handle the pause");
    loadUrl("javascript:try{cordova.fireDocumentEvent('pause');}catch(e){console.log('exception firing pause event from native');};");
    if (this.pluginManager != null) {
      this.pluginManager.onPause(paramBoolean);
    }
    if (!paramBoolean) {
      pauseTimers();
    }
    this.paused = true;
  }
  
  public void handleResume(boolean paramBoolean1, boolean paramBoolean2)
  {
    loadUrl("javascript:try{cordova.fireDocumentEvent('resume');}catch(e){console.log('exception firing resume event from native');};");
    if (this.pluginManager != null) {
      this.pluginManager.onResume(paramBoolean1);
    }
    resumeTimers();
    this.paused = false;
  }
  
  public void hideCustomView()
  {
    Log.d("CordovaWebView", "Hiding Custom View");
    if (this.mCustomView == null) {
      return;
    }
    this.mCustomView.setVisibility(8);
    ((ViewGroup)getParent()).removeView(this.mCustomView);
    this.mCustomView = null;
    this.mCustomViewCallback.onCustomViewHidden();
    setVisibility(0);
  }
  
  public boolean isBackButtonBound()
  {
    return this.bound;
  }
  
  public boolean isCustomViewShowing()
  {
    return this.mCustomView != null;
  }
  
  public boolean isPaused()
  {
    return this.paused;
  }
  
  public void loadUrl(String paramString)
  {
    if ((paramString.equals("about:blank")) || (paramString.startsWith("javascript:")))
    {
      loadUrlNow(paramString);
      return;
    }
    String str = getProperty("url", null);
    if (str == null)
    {
      loadUrlIntoView(paramString);
      return;
    }
    loadUrlIntoView(str);
  }
  
  public void loadUrl(String paramString, int paramInt)
  {
    String str = getProperty("url", null);
    if (str == null)
    {
      loadUrlIntoView(paramString, paramInt);
      return;
    }
    loadUrlIntoView(str);
  }
  
  public void loadUrlIntoView(String paramString)
  {
    loadUrlIntoView(paramString, true);
  }
  
  public void loadUrlIntoView(String paramString, int paramInt)
  {
    if ((!paramString.startsWith("javascript:")) && (!canGoBack()))
    {
      LOG.d("CordovaWebView", "loadUrlIntoView(%s, %d)", new Object[] { paramString, Integer.valueOf(paramInt) });
      postMessage("splashscreen", "show");
    }
    loadUrlIntoView(paramString);
  }
  
  public void loadUrlIntoView(String paramString, boolean paramBoolean)
  {
    LOG.d("CordovaWebView", ">>> loadUrl(" + paramString + ")");
    if (paramBoolean)
    {
      this.url = paramString;
      this.pluginManager.init();
    }
    int i = this.loadUrlTimeout;
    CordovaWebView.3 local3 = new CordovaWebView.3(this, Integer.parseInt(getProperty("LoadUrlTimeoutValue", "20000")), this, i, new CordovaWebView.2(this, this, paramString));
    this.cordova.getActivity().runOnUiThread(new CordovaWebView.4(this, local3, this, paramString));
  }
  
  void loadUrlNow(String paramString)
  {
    if ((LOG.isLoggable(3)) && (!paramString.startsWith("javascript:"))) {
      LOG.d("CordovaWebView", ">>> loadUrlNow()");
    }
    if ((paramString.startsWith("file://")) || (paramString.startsWith("javascript:")) || (Config.isUrlWhiteListed(paramString))) {
      super.loadUrl(paramString);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.keyDownCodes.contains(Integer.valueOf(paramInt)))
    {
      if (paramInt == 25)
      {
        LOG.d("CordovaWebView", "Down Key Hit");
        loadUrl("javascript:cordova.fireDocumentEvent('volumedownbutton');");
        return true;
      }
      if (paramInt == 24)
      {
        LOG.d("CordovaWebView", "Up Key Hit");
        loadUrl("javascript:cordova.fireDocumentEvent('volumeupbutton');");
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    if (paramInt == 4) {
      return (!startOfHistory()) || (this.bound);
    }
    if (paramInt == 82)
    {
      View localView = getFocusedChild();
      if (localView != null)
      {
        ((InputMethodManager)this.cordova.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 0);
        this.cordova.getActivity().openOptionsMenu();
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 4) {
      if (this.mCustomView != null) {
        hideCustomView();
      }
    }
    do
    {
      for (;;)
      {
        bool = super.onKeyUp(paramInt, paramKeyEvent);
        do
        {
          return bool;
          if (this.bound)
          {
            loadUrl("javascript:cordova.fireDocumentEvent('backbutton');");
            return true;
          }
        } while (backHistory());
        this.cordova.getActivity().finish();
      }
      if (paramInt == 82)
      {
        if (this.lastMenuEventTime < paramKeyEvent.getEventTime()) {
          loadUrl("javascript:cordova.fireDocumentEvent('menubutton');");
        }
        this.lastMenuEventTime = paramKeyEvent.getEventTime();
        return super.onKeyUp(paramInt, paramKeyEvent);
      }
      if (paramInt == 84)
      {
        loadUrl("javascript:cordova.fireDocumentEvent('searchbutton');");
        return true;
      }
    } while (!this.keyUpCodes.contains(Integer.valueOf(paramInt)));
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    if (this.pluginManager != null) {
      this.pluginManager.onNewIntent(paramIntent);
    }
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    postMessage("onScrollChanged", new ScrollEvent(paramInt1, paramInt2, paramInt3, paramInt4, this));
  }
  
  public void postMessage(String paramString, Object paramObject)
  {
    if (this.pluginManager != null) {
      this.pluginManager.postMessage(paramString, paramObject);
    }
  }
  
  public void printBackForwardList()
  {
    WebBackForwardList localWebBackForwardList = copyBackForwardList();
    int j = localWebBackForwardList.getSize();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = localWebBackForwardList.getItemAtIndex(i).getUrl();
      LOG.d("CordovaWebView", "The URL at index: " + Integer.toString(i) + " is " + str);
      i += 1;
    }
  }
  
  public WebBackForwardList restoreState(Bundle paramBundle)
  {
    paramBundle = super.restoreState(paramBundle);
    Log.d("CordovaWebView", "WebView restoration crew now restoring!");
    this.pluginManager.init();
    return paramBundle;
  }
  
  public void sendJavascript(String paramString)
  {
    this.jsMessageQueue.addJavaScript(paramString);
  }
  
  public void sendPluginResult(PluginResult paramPluginResult, String paramString)
  {
    this.jsMessageQueue.addPluginResult(paramPluginResult, paramString);
  }
  
  public void setWebChromeClient(CordovaChromeClient paramCordovaChromeClient)
  {
    this.chromeClient = paramCordovaChromeClient;
    super.setWebChromeClient(paramCordovaChromeClient);
  }
  
  public void setWebViewClient(CordovaWebViewClient paramCordovaWebViewClient)
  {
    this.viewClient = paramCordovaWebViewClient;
    super.setWebViewClient(paramCordovaWebViewClient);
  }
  
  protected boolean shouldRequestFocusOnInit()
  {
    return true;
  }
  
  public void showCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    Log.d("CordovaWebView", "showing Custom View");
    if (this.mCustomView != null)
    {
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    this.mCustomView = paramView;
    this.mCustomViewCallback = paramCustomViewCallback;
    paramCustomViewCallback = (ViewGroup)getParent();
    paramCustomViewCallback.addView(paramView, COVER_SCREEN_GRAVITY_CENTER);
    setVisibility(8);
    paramCustomViewCallback.setVisibility(0);
    paramCustomViewCallback.bringToFront();
  }
  
  public void showWebPage(String paramString, boolean paramBoolean1, boolean paramBoolean2, HashMap<String, Object> paramHashMap)
  {
    LOG.d("CordovaWebView", "showWebPage(%s, %b, %b, HashMap", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (paramBoolean2) {
      clearHistory();
    }
    if (!paramBoolean1)
    {
      if ((paramString.startsWith("file://")) || (Config.isUrlWhiteListed(paramString)))
      {
        loadUrl(paramString);
        return;
      }
      LOG.w("CordovaWebView", "showWebPage: Cannot load URL into webview since it is not in white list.  Loading into browser instead. (URL=" + paramString + ")");
    }
    for (;;)
    {
      Uri localUri;
      try
      {
        paramHashMap = new Intent("android.intent.action.VIEW");
        localUri = Uri.parse(paramString);
        if ("file".equals(localUri.getScheme()))
        {
          paramHashMap.setDataAndType(localUri, this.resourceApi.getMimeType(localUri));
          this.cordova.getActivity().startActivity(paramHashMap);
          return;
        }
      }
      catch (ActivityNotFoundException paramHashMap)
      {
        LOG.e("CordovaWebView", "Error loading url " + paramString, paramHashMap);
        return;
      }
      paramHashMap.setData(localUri);
    }
  }
  
  public boolean startOfHistory()
  {
    boolean bool = false;
    Object localObject = copyBackForwardList().getItemAtIndex(0);
    if (localObject != null)
    {
      localObject = ((WebHistoryItem)localObject).getUrl();
      String str = getUrl();
      LOG.d("CordovaWebView", "The current URL is: " + str);
      LOG.d("CordovaWebView", "The URL at item 0 is: " + (String)localObject);
      bool = str.equals(localObject);
    }
    return bool;
  }
  
  public void stopLoading()
  {
    this.viewClient.isCurrentlyLoading = false;
    super.stopLoading();
  }
  
  public void storeResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mResult = new CordovaWebView.ActivityResult(this, paramInt1, paramInt2, paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\CordovaWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */