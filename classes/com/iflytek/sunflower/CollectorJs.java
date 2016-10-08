package com.iflytek.sunflower;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CollectorJs
{
  private Context a;
  
  public CollectorJs(Context paramContext, WebView paramWebView)
  {
    this(paramContext, paramWebView, null);
  }
  
  public CollectorJs(Context paramContext, WebView paramWebView, WebChromeClient paramWebChromeClient)
  {
    this.a = paramContext;
    paramWebView.getSettings().setJavaScriptEnabled(true);
    paramWebView.setWebChromeClient(new CollectorJs.a(this, paramWebChromeClient));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\CollectorJs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */