package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.tencent.open.a.f;
import com.tencent.open.c.c;
import com.tencent.open.utils.Util;
import com.tencent.open.web.security.b;
import com.tencent.tauth.UiError;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

class AuthDialog$LoginWebViewClient
  extends WebViewClient
{
  private AuthDialog$LoginWebViewClient(AuthDialog paramAuthDialog) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    f.a("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + paramString);
    AuthDialog.g(this.a).setVisibility(8);
    if (AuthDialog.e(this.a) != null) {
      AuthDialog.e(this.a).setVisibility(0);
    }
    if (!TextUtils.isEmpty(paramString)) {
      AuthDialog.n(this.a).removeCallbacks((Runnable)AuthDialog.p(this.a).remove(paramString));
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    f.a("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    AuthDialog.g(this.a).setVisibility(0);
    AuthDialog.a(this.a, SystemClock.elapsedRealtime());
    if (!TextUtils.isEmpty(AuthDialog.i(this.a))) {
      AuthDialog.n(this.a).removeCallbacks((Runnable)AuthDialog.p(this.a).remove(AuthDialog.i(this.a)));
    }
    AuthDialog.c(this.a, paramString);
    paramWebView = new AuthDialog.TimeOutRunable(this.a, AuthDialog.i(this.a));
    AuthDialog.p(this.a).put(paramString, paramWebView);
    AuthDialog.n(this.a).postDelayed(paramWebView, 120000L);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    f.c("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + paramInt + " | description: " + paramString1);
    if (!Util.checkNetWork(AuthDialog.a(this.a)))
    {
      AuthDialog.f(this.a).onError(new UiError(9001, "当前网络不可用，请稍后重试！", paramString2));
      this.a.dismiss();
      return;
    }
    if (!AuthDialog.i(this.a).startsWith("http://qzs.qq.com/open/mobile/login/qzsjump.html?"))
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = AuthDialog.j(this.a);
      if ((AuthDialog.k(this.a) < 1) && (l1 - l2 < AuthDialog.l(this.a)))
      {
        AuthDialog.m(this.a);
        AuthDialog.n(this.a).postDelayed(new AuthDialog.LoginWebViewClient.1(this), 500L);
        return;
      }
      AuthDialog.e(this.a).loadUrl(AuthDialog.o(this.a));
      return;
    }
    AuthDialog.f(this.a).onError(new UiError(paramInt, paramString1, paramString2));
    this.a.dismiss();
  }
  
  @TargetApi(8)
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.cancel();
    AuthDialog.f(this.a).onError(new UiError(paramSslError.getPrimaryError(), "请求不合法，请检查手机安全设置，如系统时间、代理等。", "ssl error"));
    this.a.dismiss();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.AuthDialog", "-->Redirect URL: " + paramString);
    if (paramString.startsWith("auth://browser"))
    {
      paramWebView = Util.parseUrlToJson(paramString);
      AuthDialog.a(this.a, AuthDialog.b(this.a));
      if (AuthDialog.c(this.a)) {}
      for (;;)
      {
        return true;
        if (paramWebView.optString("fail_cb", null) != null)
        {
          this.a.callJs(paramWebView.optString("fail_cb"), "");
        }
        else
        {
          if (paramWebView.optInt("fall_to_wv") == 1)
          {
            paramString = this.a;
            if (AuthDialog.d(this.a).indexOf("?") > -1) {}
            for (paramWebView = "&";; paramWebView = "?")
            {
              AuthDialog.a(paramString, paramWebView);
              AuthDialog.a(this.a, "browser_error=1");
              AuthDialog.e(this.a).loadUrl(AuthDialog.d(this.a));
              break;
            }
          }
          paramWebView = paramWebView.optString("redir", null);
          if (paramWebView != null) {
            AuthDialog.e(this.a).loadUrl(paramWebView);
          }
        }
      }
    }
    if (paramString.startsWith("auth://tauth.qq.com/"))
    {
      AuthDialog.f(this.a).onComplete(Util.parseUrlToJson(paramString));
      this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://cancel"))
    {
      AuthDialog.f(this.a).onCancel();
      this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://close"))
    {
      this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("download://")) {
      try
      {
        paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(paramString.substring("download://".length()))));
        paramWebView.addFlags(268435456);
        AuthDialog.a(this.a).startActivity(paramWebView);
        return true;
      }
      catch (Exception paramWebView)
      {
        for (;;)
        {
          f.b("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", paramWebView);
        }
      }
    }
    if (paramString.startsWith("auth://progress")) {
      try
      {
        paramWebView = Uri.parse(paramString).getPathSegments();
        if (paramWebView.isEmpty()) {
          return true;
        }
        int i = Integer.valueOf((String)paramWebView.get(0)).intValue();
        if (i == 0)
        {
          AuthDialog.g(this.a).setVisibility(8);
          AuthDialog.e(this.a).setVisibility(0);
        }
        else if (i == 1)
        {
          AuthDialog.g(this.a).setVisibility(0);
        }
      }
      catch (Exception paramWebView)
      {
        return true;
      }
    }
    if (paramString.startsWith("auth://onLoginSubmit")) {}
    try
    {
      paramWebView = Uri.parse(paramString).getPathSegments();
      if (!paramWebView.isEmpty()) {
        AuthDialog.b(this.a, (String)paramWebView.get(0));
      }
      return true;
      if (AuthDialog.h(this.a).a(AuthDialog.e(this.a), paramString)) {
        return true;
      }
      f.c("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
      return false;
    }
    catch (Exception paramWebView)
    {
      for (;;) {}
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog$LoginWebViewClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */