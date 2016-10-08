package com.android.dazhihui.ui.delegate.screen.hk;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class cb
  extends WebViewClient
{
  cb(bz parambz) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */