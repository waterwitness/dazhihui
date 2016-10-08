package com.alipay.sdk.auth;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.j.j;
import com.alipay.sdk.j.k;

final class a
  extends WebViewClient
{
  private a(AuthActivity paramAuthActivity) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    AuthActivity.g(this.a);
    AuthActivity.f(this.a).removeCallbacks(AuthActivity.e(this.a));
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AuthActivity.d(this.a);
    AuthActivity.f(this.a).postDelayed(AuthActivity.e(this.a), 30000L);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AuthActivity.a(this.a);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (AuthActivity.b(this.a))
    {
      paramSslErrorHandler.proceed();
      AuthActivity.a(this.a, false);
      return;
    }
    this.a.runOnUiThread(new f(this, paramSslErrorHandler));
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    if ((paramString.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase())) || (paramString.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase()))) {
      try
      {
        paramWebView = j.a(this.a, "com.eg.android.AlipayGphone");
        if (paramWebView == null) {
          return bool;
        }
        if (paramWebView.a()) {
          return true;
        }
        paramWebView = paramString;
        if (paramString.startsWith("intent://platformapi/startapp")) {
          paramWebView = paramString.replaceFirst("intent://platformapi/startapp?", "alipays://platformapi/startApp?");
        }
        paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramWebView));
        this.a.startActivity(paramWebView);
        return true;
      }
      catch (Throwable paramWebView)
      {
        return true;
      }
    }
    if (AuthActivity.a(this.a, paramString))
    {
      paramWebView.stopLoading();
      return true;
    }
    bool = super.shouldOverrideUrlLoading(paramWebView, paramString);
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */