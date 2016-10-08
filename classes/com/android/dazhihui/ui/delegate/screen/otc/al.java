package com.android.dazhihui.ui.delegate.screen.otc;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class al
  extends WebViewClient
{
  al(TradeBrowser paramTradeBrowser) {}
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */