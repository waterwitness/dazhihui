package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.Toast;

class MyWebView$2
  extends WebChromeClient
{
  MyWebView$2(MyWebView paramMyWebView) {}
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    super.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
    paramCallback.invoke(paramString, true, false);
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    if ((this.a.getContext() != null) && (!TextUtils.isEmpty(paramString2))) {
      Toast.makeText(this.a.getContext(), paramString2, 1).show();
    }
    paramJsResult.cancel();
    return true;
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (MyWebView.b(this.a) != null) {
      MyWebView.b(this.a).onProgressChanged(paramWebView, paramInt);
    }
    if (MyWebView.c(this.a) != null) {
      MyWebView.c(this.a).a(paramWebView, paramInt);
    }
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    super.onReceivedTitle(paramWebView, paramString);
    if (MyWebView.b(this.a) != null) {
      MyWebView.b(this.a).onReceivedTitle(paramWebView, paramString);
    }
  }
  
  public boolean onShowFileChooser(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    if (this.a.b != null)
    {
      this.a.b.onReceiveValue(null);
      this.a.b = null;
    }
    this.a.b = paramValueCallback;
    paramWebView = paramFileChooserParams.getAcceptTypes();
    int j = paramWebView.length;
    int i = 0;
    while (i < j)
    {
      if ("video/*".equals(paramWebView[i])) {
        try
        {
          paramWebView = new Intent("android.media.action.VIDEO_CAPTURE");
          ((Activity)this.a.getContext()).startActivityForResult(Intent.createChooser(paramWebView, "File Browser"), 2457);
          return true;
        }
        catch (Exception paramWebView)
        {
          this.a.b = null;
          return false;
        }
      }
      i += 1;
    }
    paramWebView = new Intent("android.intent.action.GET_CONTENT");
    paramWebView.addCategory("android.intent.category.OPENABLE");
    paramWebView.setType("*/*");
    try
    {
      ((Activity)this.a.getContext()).startActivityForResult(Intent.createChooser(paramWebView, "File Browser"), 2457);
      return true;
    }
    catch (Exception paramWebView)
    {
      this.a.b = null;
    }
    return false;
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback)
  {
    openFileChooser(paramValueCallback, "image/*");
  }
  
  public void openFileChooser(ValueCallback paramValueCallback, String paramString)
  {
    openFileChooser(paramValueCallback, "image/*", "*");
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    Log.i("GUH", "openFileChooser uploadMsg=" + paramValueCallback + " acceptType=" + paramString1 + " capture=" + paramString2);
    if (this.a.a != null) {
      return;
    }
    this.a.a = paramValueCallback;
    paramValueCallback = new Intent("android.intent.action.GET_CONTENT");
    if ("image/*".equals(paramString1))
    {
      paramValueCallback.addCategory("android.intent.category.OPENABLE");
      paramValueCallback.setType("image/*");
      ((Activity)this.a.getContext()).startActivityForResult(paramValueCallback, 2456);
      return;
    }
    if ("video/*".equals(paramString1))
    {
      paramValueCallback = new Intent("android.media.action.VIDEO_CAPTURE");
      ((Activity)this.a.getContext()).startActivityForResult(paramValueCallback, 2456);
      return;
    }
    if ("audio/*".equals(paramString1))
    {
      paramValueCallback = new Intent("android.provider.MediaStore.RECORD_SOUND");
      ((Activity)this.a.getContext()).startActivityForResult(paramValueCallback, 2456);
      return;
    }
    paramValueCallback.addCategory("android.intent.category.OPENABLE");
    paramValueCallback.setType("*/*");
    ((Activity)this.a.getContext()).startActivityForResult(Intent.createChooser(paramValueCallback, "File Chooser"), 2456);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MyWebView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */