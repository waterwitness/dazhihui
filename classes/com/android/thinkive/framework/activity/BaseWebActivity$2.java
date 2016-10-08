package com.android.thinkive.framework.activity;

import android.net.Uri;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.WebViewDialogHelper;

class BaseWebActivity$2
  extends WebChromeClient
{
  BaseWebActivity$2(BaseWebActivity paramBaseWebActivity) {}
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    BaseWebActivity.access$3(this.this$0).showAlert(paramString2, new BaseWebActivity.2.1(this, paramJsResult));
    return true;
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    BaseWebActivity.access$3(this.this$0).showConfirm(paramString2, new BaseWebActivity.2.2(this, paramJsResult));
    return true;
  }
  
  public boolean onShowFileChooser(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    Log.d("onShowFileChooser !!!");
    BaseWebActivity.access$2(this.this$0, null, paramValueCallback);
    return true;
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback)
  {
    openFileChooser(paramValueCallback, "");
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString)
  {
    Log.d("openFileChooser111 !!!");
    openFileChooser(paramValueCallback, paramString, null);
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    Log.d("openFileChooser222 !!!");
    BaseWebActivity.access$2(this.this$0, paramValueCallback, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\activity\BaseWebActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */