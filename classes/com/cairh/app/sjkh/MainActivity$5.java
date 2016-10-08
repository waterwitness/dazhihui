package com.cairh.app.sjkh;

import android.app.AlertDialog.Builder;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

class MainActivity$5
  extends WebChromeClient
{
  MainActivity$5(MainActivity paramMainActivity) {}
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    paramWebView = new AlertDialog.Builder(this.this$0.context).setTitle("").setMessage(paramString2).setPositiveButton("关闭", new MainActivity.5.1(this, paramJsResult));
    paramWebView.setCancelable(true);
    paramWebView.create();
    paramWebView.show();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */