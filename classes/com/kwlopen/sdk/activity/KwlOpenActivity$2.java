package com.kwlopen.sdk.activity;

import android.util.Log;
import android.webkit.WebView;
import android.widget.ProgressBar;
import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

class KwlOpenActivity$2
  extends CordovaChromeClient
{
  KwlOpenActivity$2(KwlOpenActivity paramKwlOpenActivity, CordovaInterface paramCordovaInterface, CordovaWebView paramCordovaWebView)
  {
    super(paramCordovaInterface, paramCordovaWebView);
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    KwlOpenActivity.access$0(this.this$0).setProgress(paramInt);
    Log.e("onProgressChanged", "");
    if (paramInt == 100)
    {
      KwlOpenActivity.access$0(this.this$0).setVisibility(8);
      this.this$0.stopRefresh();
    }
    while (KwlOpenActivity.access$0(this.this$0).getVisibility() != 8) {
      return;
    }
    KwlOpenActivity.access$0(this.this$0).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\KwlOpenActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */