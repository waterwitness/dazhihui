package com.alipay.sdk.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.alipay.sdk.j.j;
import java.lang.reflect.Method;

@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
public class AuthActivity
  extends Activity
{
  private WebView a;
  private String b;
  private com.alipay.sdk.k.a c;
  private Handler d;
  private boolean e;
  private boolean f;
  private Runnable g = new e(this);
  
  public void onBackPressed()
  {
    if (this.a.canGoBack())
    {
      if (this.f)
      {
        i.a(this, this.b + "?resultCode=150");
        finish();
      }
      return;
    }
    i.a(this, this.b + "?resultCode=150");
    finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    for (;;)
    {
      try
      {
        paramBundle = getIntent().getExtras();
        if (paramBundle == null)
        {
          finish();
          return;
        }
      }
      catch (Exception paramBundle)
      {
        finish();
        return;
      }
      try
      {
        this.b = paramBundle.getString("redirectUri");
        paramBundle = paramBundle.getString("params");
        if (!j.a(paramBundle))
        {
          finish();
          return;
        }
      }
      catch (Exception paramBundle)
      {
        finish();
        return;
      }
      super.requestWindowFeature(1);
      this.d = new Handler(getMainLooper());
      Object localObject = new LinearLayout(this);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
      ((LinearLayout)localObject).setOrientation(1);
      setContentView((View)localObject, localLayoutParams);
      this.a = new WebView(this);
      localLayoutParams.weight = 1.0F;
      this.a.setVisibility(0);
      ((LinearLayout)localObject).addView(this.a, localLayoutParams);
      localObject = this.a.getSettings();
      ((WebSettings)localObject).setUserAgentString(((WebSettings)localObject).getUserAgentString() + j.d(getApplicationContext()));
      ((WebSettings)localObject).setRenderPriority(WebSettings.RenderPriority.HIGH);
      ((WebSettings)localObject).setSupportMultipleWindows(true);
      ((WebSettings)localObject).setJavaScriptEnabled(true);
      ((WebSettings)localObject).setSavePassword(false);
      ((WebSettings)localObject).setJavaScriptCanOpenWindowsAutomatically(true);
      ((WebSettings)localObject).setMinimumFontSize(((WebSettings)localObject).getMinimumFontSize() + 8);
      ((WebSettings)localObject).setAllowFileAccess(false);
      ((WebSettings)localObject).setTextSize(WebSettings.TextSize.NORMAL);
      this.a.setVerticalScrollbarOverlay(true);
      this.a.setWebViewClient(new a(this, (byte)0));
      this.a.setWebChromeClient(new AuthActivity.a(this, (byte)0));
      this.a.setDownloadListener(new b(this));
      this.a.loadUrl(paramBundle);
      if (Build.VERSION.SDK_INT >= 7) {}
      for (;;)
      {
        try
        {
          paramBundle = this.a.getSettings().getClass().getMethod("setDomStorageEnabled", new Class[] { Boolean.TYPE });
          if (paramBundle != null) {
            paramBundle.invoke(this.a.getSettings(), new Object[] { Boolean.valueOf(true) });
          }
        }
        catch (Exception paramBundle)
        {
          continue;
        }
        try
        {
          this.a.removeJavascriptInterface("searchBoxJavaBridge_");
          this.a.removeJavascriptInterface("accessibility");
          this.a.removeJavascriptInterface("accessibilityTraversal");
          if (Build.VERSION.SDK_INT < 19) {
            break;
          }
          this.a.getSettings().setCacheMode(1);
          return;
        }
        catch (Throwable paramBundle)
        {
          try
          {
            paramBundle = this.a.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (paramBundle == null) {
              continue;
            }
            paramBundle.invoke(this.a, new Object[] { "searchBoxJavaBridge_" });
            paramBundle.invoke(this.a, new Object[] { "accessibility" });
            paramBundle.invoke(this.a, new Object[] { "accessibilityTraversal" });
          }
          catch (Throwable paramBundle) {}
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.a != null) {
      this.a.removeAllViews();
    }
    try
    {
      this.a.destroy();
      this.a = null;
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\AuthActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */