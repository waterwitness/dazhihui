package com.android.thinkive.framework;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class WebViewManager$3
  extends WebViewClient
{
  WebViewManager$3(WebViewManager paramWebViewManager) {}
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")) || (paramString.startsWith("file://"))) {
      paramWebView.loadUrl(paramString);
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\WebViewManager$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */