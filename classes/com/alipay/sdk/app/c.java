package com.alipay.sdk.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.j.j;

public final class c
  extends WebViewClient
{
  boolean a;
  private Activity b;
  private boolean c;
  private Handler d;
  private com.alipay.sdk.k.a e;
  private Runnable f = new g(this);
  
  public c(Activity paramActivity)
  {
    this.b = paramActivity;
    this.d = new Handler(this.b.getMainLooper());
  }
  
  private void a()
  {
    if (this.e != null) {
      this.e.b();
    }
    this.e = null;
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    a();
    this.d.removeCallbacks(this.f);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (this.e == null) {
      this.e = new com.alipay.sdk.k.a(this.b, "正在加载");
    }
    this.e.a();
    this.d.postDelayed(this.f, 30000L);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.a = true;
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    com.alipay.sdk.app.a.a.a("net", "SSLError", "证书错误");
    if (this.c)
    {
      paramSslErrorHandler.proceed();
      this.c = false;
      return;
    }
    this.b.runOnUiThread(new d(this, paramSslErrorHandler));
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return j.a(paramWebView, paramString, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */