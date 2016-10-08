package org.apache.cordova;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class CordovaActivity
  extends Activity
  implements CordovaInterface
{
  private static int ACTIVITY_EXITING = 2;
  private static int ACTIVITY_RUNNING;
  private static int ACTIVITY_STARTING;
  public static String TAG = "CordovaActivity";
  private Object LOG_TAG;
  protected CordovaPlugin activityResultCallback = null;
  protected boolean activityResultKeepRunning;
  private int activityState = 0;
  protected CordovaWebView appView;
  private int backgroundColor = -16777216;
  protected boolean cancelLoadUrl = false;
  private String initCallbackClass;
  protected boolean keepRunning = true;
  private Intent lastIntent;
  private int lastRequestCode;
  private Object lastResponseCode;
  protected int loadUrlTimeoutValue = 20000;
  private Object responseCode;
  protected LinearLayout root;
  protected ProgressDialog spinnerDialog = null;
  protected Dialog splashDialog;
  protected int splashscreen = 0;
  protected int splashscreenTime = 3000;
  private final ExecutorService threadPool = Executors.newCachedThreadPool();
  protected CordovaWebViewClient webViewClient;
  
  static
  {
    ACTIVITY_STARTING = 0;
    ACTIVITY_RUNNING = 1;
  }
  
  @Deprecated
  public void addService(String paramString1, String paramString2)
  {
    if ((this.appView != null) && (this.appView.pluginManager != null)) {
      this.appView.pluginManager.addService(paramString1, paramString2);
    }
  }
  
  public boolean backHistory()
  {
    if (this.appView != null) {
      return this.appView.backHistory();
    }
    return false;
  }
  
  @Deprecated
  public void cancelLoadUrl()
  {
    this.cancelLoadUrl = true;
  }
  
  public void clearAuthenticationTokens()
  {
    if ((this.appView != null) && (this.appView.viewClient != null)) {
      this.appView.viewClient.clearAuthenticationTokens();
    }
  }
  
  public void clearCache()
  {
    if (this.appView == null) {
      init();
    }
    this.appView.clearCache(true);
  }
  
  public void clearHistory()
  {
    this.appView.clearHistory();
  }
  
  public void displayError(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    runOnUiThread(new CordovaActivity.4(this, this, paramString2, paramString1, paramString3, paramBoolean));
  }
  
  public void endActivity()
  {
    this.activityState = ACTIVITY_EXITING;
    super.finish();
  }
  
  public Activity getActivity()
  {
    return this;
  }
  
  public AuthenticationToken getAuthenticationToken(String paramString1, String paramString2)
  {
    if ((this.appView != null) && (this.appView.viewClient != null)) {
      return this.appView.viewClient.getAuthenticationToken(paramString1, paramString2);
    }
    return null;
  }
  
  public boolean getBooleanProperty(String paramString, boolean paramBoolean)
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {}
    for (;;)
    {
      return paramBoolean;
      String str = paramString.toLowerCase(Locale.getDefault());
      try
      {
        paramString = (Boolean)localBundle.get(str);
        if (paramString == null) {
          continue;
        }
        return paramString.booleanValue();
      }
      catch (ClassCastException paramString)
      {
        for (;;)
        {
          if ("true".equals(localBundle.get(str).toString())) {
            paramString = Boolean.valueOf(true);
          } else {
            paramString = Boolean.valueOf(false);
          }
        }
      }
    }
  }
  
  @Deprecated
  public Context getContext()
  {
    LOG.d(TAG, "This will be deprecated December 2012");
    return this;
  }
  
  public double getDoubleProperty(String paramString, double paramDouble)
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {}
    for (;;)
    {
      return paramDouble;
      String str = paramString.toLowerCase(Locale.getDefault());
      try
      {
        paramString = (Double)localBundle.get(str);
        if (paramString == null) {
          continue;
        }
        return paramString.doubleValue();
      }
      catch (ClassCastException paramString)
      {
        for (;;)
        {
          paramString = Double.valueOf(Double.parseDouble(localBundle.get(str).toString()));
        }
      }
    }
  }
  
  public int getIntegerProperty(String paramString, int paramInt)
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {}
    for (;;)
    {
      return paramInt;
      String str = paramString.toLowerCase(Locale.getDefault());
      try
      {
        paramString = (Integer)localBundle.get(str);
        if (paramString == null) {
          continue;
        }
        return paramString.intValue();
      }
      catch (ClassCastException paramString)
      {
        for (;;)
        {
          paramString = Integer.valueOf(Integer.parseInt(localBundle.get(str).toString()));
        }
      }
    }
  }
  
  public String getStringProperty(String paramString1, String paramString2)
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {}
    do
    {
      return paramString2;
      paramString1 = localBundle.getString(paramString1.toLowerCase(Locale.getDefault()));
    } while (paramString1 == null);
    return paramString1;
  }
  
  public ExecutorService getThreadPool()
  {
    return this.threadPool;
  }
  
  public void init()
  {
    CordovaWebView localCordovaWebView = makeWebView();
    init(localCordovaWebView, makeWebViewClient(localCordovaWebView), makeChromeClient(localCordovaWebView));
  }
  
  @SuppressLint({"NewApi"})
  public void init(CordovaWebView paramCordovaWebView, CordovaWebViewClient paramCordovaWebViewClient, CordovaChromeClient paramCordovaChromeClient)
  {
    LOG.d(TAG, "CordovaActivity.init()");
    this.appView = paramCordovaWebView;
    this.appView.setId(100);
    this.appView.setWebViewClient(paramCordovaWebViewClient);
    this.appView.setWebChromeClient(paramCordovaChromeClient);
    paramCordovaWebViewClient.setWebView(this.appView);
    paramCordovaChromeClient.setWebView(this.appView);
    this.appView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
    if ((getBooleanProperty("DisallowOverscroll", false)) && (Build.VERSION.SDK_INT >= 9)) {
      this.appView.setOverScrollMode(2);
    }
    this.appView.setVisibility(4);
    this.root.addView(this.appView);
    setContentView(this.root);
    this.cancelLoadUrl = false;
  }
  
  public boolean isUrlWhiteListed(String paramString)
  {
    return Config.isUrlWhiteListed(paramString);
  }
  
  void loadSpinner()
  {
    String str1;
    String str2;
    if ((this.appView == null) || (!this.appView.canGoBack()))
    {
      str1 = getStringProperty("LoadingDialog", null);
      if (str1 != null)
      {
        if (str1.length() <= 0) {
          break label89;
        }
        int i = str1.indexOf(',');
        if (i <= 0) {
          break label82;
        }
        str2 = str1.substring(0, i);
        str1 = str1.substring(i + 1);
      }
    }
    for (;;)
    {
      spinnerStart(str2, str1);
      return;
      str1 = getStringProperty("LoadingPageDialog", null);
      break;
      label82:
      str2 = "";
      continue;
      label89:
      str1 = "Loading Application...";
      str2 = "";
    }
  }
  
  public void loadUrl(String paramString)
  {
    if (this.appView == null) {
      init();
    }
    this.splashscreenTime = getIntegerProperty("SplashScreenDelay", this.splashscreenTime);
    if (this.splashscreenTime > 0)
    {
      this.splashscreen = getIntegerProperty("SplashScreen", 0);
      if (this.splashscreen != 0) {
        showSplashScreen(this.splashscreenTime);
      }
    }
    this.backgroundColor = getIntegerProperty("BackgroundColor", -16777216);
    this.root.setBackgroundColor(this.backgroundColor);
    this.keepRunning = getBooleanProperty("KeepRunning", true);
    if (this.appView.getParent() != null) {
      loadSpinner();
    }
    if (this.splashscreen != 0)
    {
      this.appView.loadUrl(paramString, this.splashscreenTime);
      return;
    }
    this.appView.loadUrl(paramString);
  }
  
  public void loadUrl(String paramString, int paramInt)
  {
    this.splashscreenTime = paramInt;
    loadUrl(paramString);
  }
  
  protected CordovaChromeClient makeChromeClient(CordovaWebView paramCordovaWebView)
  {
    return new CordovaChromeClient(this, paramCordovaWebView);
  }
  
  protected CordovaWebView makeWebView()
  {
    return new CordovaWebView(this);
  }
  
  protected CordovaWebViewClient makeWebViewClient(CordovaWebView paramCordovaWebView)
  {
    if (Build.VERSION.SDK_INT < 11) {
      return new CordovaWebViewClient(this, paramCordovaWebView);
    }
    return new IceCreamCordovaWebViewClient(this, paramCordovaWebView);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    LOG.d(TAG, "Incoming Result");
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Log.d(TAG, "Request code = " + paramInt1);
    Object localObject2;
    if ((this.appView != null) && (paramInt1 == 5173))
    {
      localObject2 = this.appView.getWebChromeClient().getValueCallback();
      Log.d(TAG, "did we get here?");
      if (localObject2 == null) {
        return;
      }
      if ((paramIntent != null) && (paramInt2 == -1)) {
        break label201;
      }
    }
    label201:
    for (Object localObject1 = null;; localObject1 = paramIntent.getData())
    {
      Log.d(TAG, "result = " + localObject1);
      ((ValueCallback)localObject2).onReceiveValue(localObject1);
      localObject2 = this.activityResultCallback;
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.initCallbackClass != null)
        {
          this.activityResultCallback = this.appView.pluginManager.getPlugin(this.initCallbackClass);
          localObject1 = this.activityResultCallback;
        }
      }
      if (localObject1 == null) {
        break;
      }
      LOG.d(TAG, "We have a callback to send this result to");
      ((CordovaPlugin)localObject1).onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Config.init(this);
    LOG.d(TAG, "CordovaActivity.onCreate()");
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.initCallbackClass = paramBundle.getString("callbackClass");
    }
    if (!getBooleanProperty("ShowTitle", false)) {
      getWindow().requestFeature(1);
    }
    if (getBooleanProperty("SetFullscreen", false))
    {
      Log.d(TAG, "The SetFullscreen configuration is deprecated in favor of Fullscreen, and will be removed in a future version.");
      getWindow().setFlags(1024, 1024);
    }
    for (;;)
    {
      paramBundle = getWindowManager().getDefaultDisplay();
      this.root = new LinearLayoutSoftKeyboardDetect(this, paramBundle.getWidth(), paramBundle.getHeight());
      this.root.setOrientation(1);
      this.root.setBackgroundColor(this.backgroundColor);
      this.root.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0F));
      setVolumeControlStream(3);
      return;
      getWindow().setFlags(2048, 2048);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    postMessage("onCreateOptionsMenu", paramMenu);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    LOG.d(TAG, "CordovaActivity.onDestroy()");
    super.onDestroy();
    removeSplashScreen();
    if (this.appView != null)
    {
      this.appView.handleDestroy();
      return;
    }
    this.activityState = ACTIVITY_EXITING;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.appView != null) && (this.appView.getFocusedChild() != null) && ((paramInt == 4) || (paramInt == 82))) {
      return this.appView.onKeyDown(paramInt, paramKeyEvent);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.appView != null) && ((this.appView.isCustomViewShowing()) || (this.appView.getFocusedChild() != null)) && ((paramInt == 4) || (paramInt == 82))) {
      return this.appView.onKeyUp(paramInt, paramKeyEvent);
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public Object onMessage(String paramString, Object paramObject)
  {
    if (!"onScrollChanged".equals(paramString)) {
      LOG.d(TAG, "onMessage(" + paramString + "," + paramObject + ")");
    }
    if ("splashscreen".equals(paramString)) {
      if ("hide".equals(paramObject.toString())) {
        removeSplashScreen();
      }
    }
    for (;;)
    {
      return null;
      if ((this.splashDialog == null) || (!this.splashDialog.isShowing()))
      {
        this.splashscreen = getIntegerProperty("SplashScreen", 0);
        showSplashScreen(this.splashscreenTime);
        continue;
        if ("spinner".equals(paramString))
        {
          if ("stop".equals(paramObject.toString()))
          {
            spinnerStop();
            this.appView.setVisibility(0);
          }
        }
        else if ("onReceivedError".equals(paramString))
        {
          paramString = (JSONObject)paramObject;
          try
          {
            onReceivedError(paramString.getInt("errorCode"), paramString.getString("description"), paramString.getString("url"));
          }
          catch (JSONException paramString)
          {
            paramString.printStackTrace();
          }
        }
        else if ("exit".equals(paramString))
        {
          endActivity();
        }
      }
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (this.appView != null) {
      this.appView.onNewIntent(paramIntent);
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    postMessage("onOptionsItemSelected", paramMenuItem);
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
    LOG.d(TAG, "Paused the application!");
    if (this.activityState == ACTIVITY_EXITING) {}
    while (this.appView == null) {
      return;
    }
    this.appView.handlePause(this.keepRunning);
    removeSplashScreen();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    postMessage("onPrepareOptionsMenu", paramMenu);
    return true;
  }
  
  public void onReceivedError(int paramInt, String paramString1, String paramString2)
  {
    String str = getStringProperty("errorUrl", null);
    if ((str != null) && ((str.startsWith("file://")) || (Config.isUrlWhiteListed(str))) && (!paramString2.equals(str)))
    {
      runOnUiThread(new CordovaActivity.2(this, this, str));
      return;
    }
    if (paramInt == -2) {}
    for (boolean bool = false;; bool = true)
    {
      runOnUiThread(new CordovaActivity.3(this, bool, this, paramString1, paramString2));
      return;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    Config.init(this);
    LOG.d(TAG, "Resuming the App");
    String str = getStringProperty("ErrorUrl", null);
    LOG.d(TAG, "CB-3064: The errorUrl is " + str);
    if (this.activityState == ACTIVITY_STARTING) {
      this.activityState = ACTIVITY_RUNNING;
    }
    do
    {
      do
      {
        return;
      } while (this.appView == null);
      this.appView.handleResume(this.keepRunning, this.activityResultKeepRunning);
    } while (((this.keepRunning) && (!this.activityResultKeepRunning)) || (!this.activityResultKeepRunning));
    this.keepRunning = this.activityResultKeepRunning;
    this.activityResultKeepRunning = false;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.activityResultCallback != null) {
      paramBundle.putString("callbackClass", this.activityResultCallback.getClass().getName());
    }
  }
  
  public void postMessage(String paramString, Object paramObject)
  {
    if (this.appView != null) {
      this.appView.postMessage(paramString, paramObject);
    }
  }
  
  public AuthenticationToken removeAuthenticationToken(String paramString1, String paramString2)
  {
    if ((this.appView != null) && (this.appView.viewClient != null)) {
      return this.appView.viewClient.removeAuthenticationToken(paramString1, paramString2);
    }
    return null;
  }
  
  public void removeSplashScreen()
  {
    if ((this.splashDialog != null) && (this.splashDialog.isShowing()))
    {
      this.splashDialog.dismiss();
      this.splashDialog = null;
    }
  }
  
  public void sendJavascript(String paramString)
  {
    if (this.appView != null) {
      this.appView.jsMessageQueue.addJavaScript(paramString);
    }
  }
  
  public void setActivityResultCallback(CordovaPlugin paramCordovaPlugin)
  {
    this.activityResultCallback = paramCordovaPlugin;
  }
  
  public void setAuthenticationToken(AuthenticationToken paramAuthenticationToken, String paramString1, String paramString2)
  {
    if ((this.appView != null) && (this.appView.viewClient != null)) {
      this.appView.viewClient.setAuthenticationToken(paramAuthenticationToken, paramString1, paramString2);
    }
  }
  
  @Deprecated
  public void setBooleanProperty(String paramString, boolean paramBoolean)
  {
    Log.d(TAG, "Setting boolean properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
    getIntent().putExtra(paramString.toLowerCase(), paramBoolean);
  }
  
  @Deprecated
  public void setDoubleProperty(String paramString, double paramDouble)
  {
    Log.d(TAG, "Setting double properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
    getIntent().putExtra(paramString.toLowerCase(), paramDouble);
  }
  
  @Deprecated
  public void setIntegerProperty(String paramString, int paramInt)
  {
    Log.d(TAG, "Setting integer properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
    getIntent().putExtra(paramString.toLowerCase(), paramInt);
  }
  
  @Deprecated
  public void setStringProperty(String paramString1, String paramString2)
  {
    Log.d(TAG, "Setting string properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
    getIntent().putExtra(paramString1.toLowerCase(), paramString2);
  }
  
  protected void showSplashScreen(int paramInt)
  {
    runOnUiThread(new CordovaActivity.5(this, this, paramInt));
  }
  
  public void showWebPage(String paramString, boolean paramBoolean1, boolean paramBoolean2, HashMap<String, Object> paramHashMap)
  {
    if (this.appView != null) {
      this.appView.showWebPage(paramString, paramBoolean1, paramBoolean2, paramHashMap);
    }
  }
  
  public void spinnerStart(String paramString1, String paramString2)
  {
    if (this.spinnerDialog != null)
    {
      this.spinnerDialog.dismiss();
      this.spinnerDialog = null;
    }
    this.spinnerDialog = ProgressDialog.show(this, paramString1, paramString2, true, true, new CordovaActivity.1(this, this));
  }
  
  public void spinnerStop()
  {
    if ((this.spinnerDialog != null) && (this.spinnerDialog.isShowing()))
    {
      this.spinnerDialog.dismiss();
      this.spinnerDialog = null;
    }
  }
  
  public void startActivityForResult(CordovaPlugin paramCordovaPlugin, Intent paramIntent, int paramInt)
  {
    this.activityResultCallback = paramCordovaPlugin;
    this.activityResultKeepRunning = this.keepRunning;
    if (paramCordovaPlugin != null) {
      this.keepRunning = false;
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\CordovaActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */