package com.tencent.open;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.a.f;
import com.tencent.open.c.b;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.Util;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;

class PKDialog$FbWebViewClient
  extends WebViewClient
{
  private PKDialog$FbWebViewClient(PKDialog paramPKDialog) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    PKDialog.access$500(this.this$0).setVisibility(0);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    f.a("openSDK_LOG.PKDialog", "Webview loading URL: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    PKDialog.access$400(this.this$0).onError(new UiError(paramInt, paramString1, paramString2));
    if ((PKDialog.access$300(this.this$0) != null) && (PKDialog.access$300(this.this$0).get() != null)) {
      Toast.makeText((Context)PKDialog.access$300(this.this$0).get(), "网络连接异常或系统错误", 0).show();
    }
    this.this$0.dismiss();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.PKDialog", "Redirect URL: " + paramString);
    if (paramString.startsWith(ServerSetting.getInstance().getEnvUrl((Context)PKDialog.access$300(this.this$0).get(), "auth://tauth.qq.com/")))
    {
      PKDialog.access$400(this.this$0).onComplete(Util.parseUrlToJson(paramString));
      this.this$0.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://cancel"))
    {
      PKDialog.access$400(this.this$0).onCancel();
      this.this$0.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://close"))
    {
      this.this$0.dismiss();
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\PKDialog$FbWebViewClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */