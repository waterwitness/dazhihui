package com.kwlopen.sdk.activity;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewClient;

class KwlOpenActivity$1
  extends CordovaWebViewClient
{
  KwlOpenActivity$1(KwlOpenActivity paramKwlOpenActivity, CordovaInterface paramCordovaInterface, CordovaWebView paramCordovaWebView)
  {
    super(paramCordovaInterface, paramCordovaWebView);
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    Log.e("onPageFinished", paramString);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    Log.e("onPageStarted", paramString);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    Log.e("shouldOverrideUrlLoading", paramString);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\KwlOpenActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */