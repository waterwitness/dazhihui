package com.kwlopen.sdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kwl.common.utils.LogUtil;
import com.kwl.common.utils.ResourceUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

public class KwlOpenActivity
  extends Activity
  implements View.OnClickListener, CordovaInterface
{
  public static CordovaPlugin cordovaPlugin = null;
  private ImageButton backBtn;
  private boolean canBack = false;
  CordovaWebView cordovaWebView;
  private String openUrl = "";
  private ProgressBar pbLoading;
  private ProgressBar progressBar;
  private ImageButton refreshBtn;
  private final ExecutorService threadPool = Executors.newCachedThreadPool();
  private String title = "";
  private RelativeLayout titleBar;
  private int titleBarBg = -16777216;
  private TextView tvTitle;
  
  public static void show(Context paramContext, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, KwlOpenActivity.class);
    localIntent.putExtra("openUrl", paramString1);
    localIntent.putExtra("title", paramString2);
    localIntent.putExtra("canBack", paramBoolean);
    localIntent.putExtra("titleBarBg", paramInt);
    paramContext.startActivity(localIntent);
  }
  
  public static void show(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    show(paramContext, paramString1, paramString2, -16777216, paramBoolean);
  }
  
  public Activity getActivity()
  {
    return this;
  }
  
  public ExecutorService getThreadPool()
  {
    return this.threadPool;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    LogUtil.writeLog("onActivityResult webMallFragment");
    if (cordovaPlugin == null)
    {
      LogUtil.writeLog("cordovaPlugin插件为空");
      return;
    }
    cordovaPlugin.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "titlebar_ibtn_left")) {
      if (this.cordovaWebView.canGoBack()) {
        this.cordovaWebView.goBack();
      }
    }
    while (paramView.getId() != ResourceUtil.getId(this, "title_refresh"))
    {
      return;
      getActivity().onBackPressed();
      return;
    }
    startRefresh();
    if (!this.openUrl.equals(this.cordovaWebView.getUrl()))
    {
      this.cordovaWebView.loadUrl(this.openUrl);
      return;
    }
    this.cordovaWebView.reload();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_my_cordova_frag"));
    this.openUrl = getIntent().getStringExtra("openUrl");
    this.title = getIntent().getStringExtra("title");
    this.canBack = getIntent().getBooleanExtra("canBack", false);
    this.titleBarBg = getIntent().getIntExtra("titleBarBg", -16777216);
    this.cordovaWebView = ((CordovaWebView)findViewById(ResourceUtil.getId(this, "cordovaWebView")));
    Config.init(getActivity());
    this.progressBar = ((ProgressBar)findViewById(ResourceUtil.getId(this, "progressBar1")));
    this.pbLoading = ((ProgressBar)findViewById(ResourceUtil.getId(this, "pb_title_refresh")));
    this.refreshBtn = ((ImageButton)findViewById(ResourceUtil.getId(this, "title_refresh")));
    this.backBtn = ((ImageButton)findViewById(ResourceUtil.getId(this, "titlebar_ibtn_left")));
    this.titleBar = ((RelativeLayout)findViewById(ResourceUtil.getId(this, "titleBar")));
    this.titleBar.setBackgroundColor(this.titleBarBg);
    if (this.canBack) {
      this.backBtn.setVisibility(0);
    }
    for (;;)
    {
      this.tvTitle = ((TextView)findViewById(ResourceUtil.getId(this, "titlebar_tv_title")));
      this.tvTitle.setText(this.title);
      this.backBtn.setOnClickListener(this);
      this.refreshBtn.setOnClickListener(this);
      Config.addWhiteListEntry("*", true);
      if (!this.openUrl.equals("")) {
        break;
      }
      return;
      this.backBtn.setVisibility(8);
    }
    this.cordovaWebView.loadUrl(this.openUrl);
    paramBundle = this.cordovaWebView.getSettings();
    paramBundle.setJavaScriptEnabled(true);
    paramBundle.setCacheMode(2);
    paramBundle.setDatabaseEnabled(false);
    this.cordovaWebView.setWebViewClient(new KwlOpenActivity.1(this, this, this.cordovaWebView));
    this.cordovaWebView.setWebChromeClient(new KwlOpenActivity.2(this, this, this.cordovaWebView));
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.cordovaWebView != null) {
      this.cordovaWebView.handleDestroy();
    }
    cordovaPlugin = null;
    LogUtil.writeLog("onActivityResult onDestroy");
  }
  
  public Object onMessage(String paramString, Object paramObject)
  {
    Log.e("onMessage", paramString);
    return null;
  }
  
  public void onResume()
  {
    super.onResume();
    LogUtil.writeLog("onActivityResult onResume");
  }
  
  public void setActivityResultCallback(CordovaPlugin paramCordovaPlugin)
  {
    LogUtil.writeLog("webMallFragment setActivityResultCallback");
    if (cordovaPlugin == null) {
      cordovaPlugin = paramCordovaPlugin;
    }
  }
  
  public void startActivityForResult(CordovaPlugin paramCordovaPlugin, Intent paramIntent, int paramInt)
  {
    if (cordovaPlugin == null) {
      cordovaPlugin = paramCordovaPlugin;
    }
    startActivityForResult(paramIntent, paramInt);
    LogUtil.writeLog("startActivityForResult webMallFragment");
  }
  
  public void startRefresh()
  {
    this.refreshBtn.setVisibility(8);
    this.pbLoading.setVisibility(0);
  }
  
  public void stopRefresh()
  {
    this.refreshBtn.setVisibility(0);
    this.pbLoading.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\KwlOpenActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */