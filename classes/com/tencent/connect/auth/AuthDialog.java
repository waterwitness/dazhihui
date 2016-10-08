package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.open.a.f;
import com.tencent.open.c.c;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.Util;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.open.web.security.b;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthDialog
  extends Dialog
{
  private String a;
  private AuthDialog.OnTimeListener b;
  private IUiListener c;
  private Handler d;
  private FrameLayout e;
  private LinearLayout f;
  private FrameLayout g;
  private ProgressBar h;
  private String i;
  private c j;
  private Context k;
  private b l;
  private boolean m = false;
  private int n;
  private String o;
  private String p;
  private long q = 0L;
  private long r = 30000L;
  private HashMap<String, Runnable> s;
  
  static
  {
    try
    {
      Context localContext = Global.getContext();
      if (localContext != null)
      {
        if (new File(localContext.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists())
        {
          System.load(localContext.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
          f.c("openSDK_LOG.AuthDialog", "-->load lib success:" + AuthAgent.SECURE_LIB_NAME);
          return;
        }
        f.c("openSDK_LOG.AuthDialog", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
        return;
      }
    }
    catch (Exception localException)
    {
      f.b("openSDK_LOG.AuthDialog", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, localException);
      return;
    }
    f.c("openSDK_LOG.AuthDialog", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
  }
  
  public AuthDialog(Context paramContext, String paramString1, String paramString2, IUiListener paramIUiListener, QQToken paramQQToken)
  {
    super(paramContext, 16973840);
    this.k = paramContext;
    this.a = paramString2;
    this.b = new AuthDialog.OnTimeListener(this, paramString1, paramString2, paramQQToken.getAppId(), paramIUiListener);
    this.d = new AuthDialog.THandler(this, this.b, paramContext.getMainLooper());
    this.c = paramIUiListener;
    this.i = paramString1;
    this.l = new b();
    getWindow().setSoftInputMode(32);
  }
  
  private String a()
  {
    String str = this.a.substring(this.a.indexOf("?") + 1);
    str = "http://qzs.qq.com/open/mobile/login/qzsjump.html?" + str;
    f.c("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: http://qzs.qq.com/open/mobile/login/qzsjump.html?");
    return str;
  }
  
  private String a(String paramString)
  {
    paramString = new StringBuilder(paramString);
    if ((!TextUtils.isEmpty(this.p)) && (this.p.length() >= 4))
    {
      String str = this.p.substring(this.p.length() - 4);
      paramString.append("_u_").append(str);
    }
    return paramString.toString();
  }
  
  private void b()
  {
    c();
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.j = new c(this.k);
    this.j.setLayoutParams(localLayoutParams);
    this.e = new FrameLayout(this.k);
    localLayoutParams.gravity = 17;
    this.e.setLayoutParams(localLayoutParams);
    this.e.addView(this.j);
    this.e.addView(this.g);
    setContentView(this.e);
  }
  
  private static void b(Context paramContext, String paramString)
  {
    try
    {
      paramString = Util.parseJson(paramString);
      int i1 = paramString.getInt("type");
      paramString = paramString.getString("msg");
      Toast.makeText(paramContext.getApplicationContext(), paramString, i1).show();
      return;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void c()
  {
    this.h = new ProgressBar(this.k);
    Object localObject1 = new LinearLayout.LayoutParams(-2, -2);
    this.h.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.f = new LinearLayout(this.k);
    localObject1 = null;
    Object localObject2;
    if (this.i.equals("action_login"))
    {
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 16;
      ((LinearLayout.LayoutParams)localObject2).leftMargin = 5;
      localObject1 = new TextView(this.k);
      if (!Locale.getDefault().getLanguage().equals("zh")) {
        break label285;
      }
      ((TextView)localObject1).setText("登录中...");
    }
    for (;;)
    {
      ((TextView)localObject1).setTextColor(Color.rgb(255, 255, 255));
      ((TextView)localObject1).setTextSize(18.0F);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = new FrameLayout.LayoutParams(-2, -2);
      ((FrameLayout.LayoutParams)localObject2).gravity = 17;
      this.f.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.f.addView(this.h);
      if (localObject1 != null) {
        this.f.addView((View)localObject1);
      }
      this.g = new FrameLayout(this.k);
      localObject1 = new FrameLayout.LayoutParams(-1, -2);
      ((FrameLayout.LayoutParams)localObject1).leftMargin = 80;
      ((FrameLayout.LayoutParams)localObject1).rightMargin = 80;
      ((FrameLayout.LayoutParams)localObject1).topMargin = 40;
      ((FrameLayout.LayoutParams)localObject1).bottomMargin = 40;
      ((FrameLayout.LayoutParams)localObject1).gravity = 17;
      this.g.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.g.setBackgroundResource(17301504);
      this.g.addView(this.f);
      return;
      label285:
      ((TextView)localObject1).setText("Logging in...");
    }
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  private void d()
  {
    this.j.setVerticalScrollBarEnabled(false);
    this.j.setHorizontalScrollBarEnabled(false);
    this.j.setWebViewClient(new AuthDialog.LoginWebViewClient(this, null));
    this.j.setWebChromeClient(new WebChromeClient());
    this.j.clearFormData();
    this.j.clearSslPreferences();
    this.j.setOnLongClickListener(new AuthDialog.1(this));
    this.j.setOnTouchListener(new AuthDialog.2(this));
    WebSettings localWebSettings = this.j.getSettings();
    localWebSettings.setSavePassword(false);
    localWebSettings.setSaveFormData(false);
    localWebSettings.setCacheMode(-1);
    localWebSettings.setNeedInitialFocus(false);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setSupportZoom(true);
    localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setDatabaseEnabled(true);
    localWebSettings.setDatabasePath(this.k.getDir("databases", 0).getPath());
    localWebSettings.setDomStorageEnabled(true);
    f.a("openSDK_LOG.AuthDialog", "-->mUrl : " + this.a);
    this.o = this.a;
    this.j.loadUrl(this.a);
    this.j.setVisibility(4);
    this.j.getSettings().setSavePassword(false);
    this.l.a(new SecureJsInterface(), "SecureJsInterface");
    SecureJsInterface.isPWDEdit = false;
    super.setOnDismissListener(new AuthDialog.3(this));
  }
  
  private boolean e()
  {
    Object localObject1 = AuthMap.getInstance();
    String str = ((AuthMap)localObject1).makeKey();
    Object localObject2 = new AuthMap.Auth();
    ((AuthMap.Auth)localObject2).listener = this.c;
    ((AuthMap.Auth)localObject2).dialog = this;
    ((AuthMap.Auth)localObject2).key = str;
    localObject1 = ((AuthMap)localObject1).set((AuthMap.Auth)localObject2);
    localObject2 = this.a.substring(0, this.a.indexOf("?"));
    Bundle localBundle = Util.parseUrl(this.a);
    localBundle.putString("token_key", str);
    localBundle.putString("serial", (String)localObject1);
    localBundle.putString("browser", "1");
    this.a = ((String)localObject2 + "?" + Util.encodeUrl(localBundle));
    return Util.openBrowser(this.k, this.a);
  }
  
  public void callJs(String paramString1, String paramString2)
  {
    paramString1 = "javascript:" + paramString1 + "(" + paramString2 + ");void(" + System.currentTimeMillis() + ");";
    this.j.loadUrl(paramString1);
  }
  
  public void dismiss()
  {
    this.s.clear();
    this.d.removeCallbacksAndMessages(null);
    if (isShowing()) {
      super.dismiss();
    }
    if (this.j != null)
    {
      this.j.destroy();
      this.j = null;
    }
  }
  
  public void onBackPressed()
  {
    if (!this.m) {
      this.b.onCancel();
    }
    super.onBackPressed();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    b();
    d();
    this.s = new HashMap();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */