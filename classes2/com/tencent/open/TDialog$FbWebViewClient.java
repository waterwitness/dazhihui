package com.tencent.open;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.a.f;
import com.tencent.open.c.b;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.Util;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;

class TDialog$FbWebViewClient
  extends WebViewClient
{
  private TDialog$FbWebViewClient(TDialog paramTDialog) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    TDialog.d(this.this$0).setVisibility(0);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    f.a("openSDK_LOG.TDialog", "Webview loading URL: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    TDialog.c(this.this$0).onError(new UiError(paramInt, paramString1, paramString2));
    if ((TDialog.a(this.this$0) != null) && (TDialog.a(this.this$0).get() != null)) {
      Toast.makeText((Context)TDialog.a(this.this$0).get(), "网络连接异常或系统错误", 0).show();
    }
    this.this$0.dismiss();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.TDialog", "Redirect URL: " + paramString);
    if (paramString.startsWith(ServerSetting.getInstance().getEnvUrl((Context)TDialog.a(this.this$0).get(), "auth://tauth.qq.com/")))
    {
      TDialog.c(this.this$0).onComplete(Util.parseUrlToJson(paramString));
      if (this.this$0.isShowing()) {
        this.this$0.dismiss();
      }
      return true;
    }
    if (paramString.startsWith("auth://cancel"))
    {
      TDialog.c(this.this$0).onCancel();
      if (this.this$0.isShowing()) {
        this.this$0.dismiss();
      }
      return true;
    }
    if (paramString.startsWith("auth://close"))
    {
      if (this.this$0.isShowing()) {
        this.this$0.dismiss();
      }
      return true;
    }
    if (paramString.startsWith("download://"))
    {
      paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(paramString.substring("download://".length()))));
      paramWebView.addFlags(268435456);
      if ((TDialog.a(this.this$0) != null) && (TDialog.a(this.this$0).get() != null)) {
        ((Context)TDialog.a(this.this$0).get()).startActivity(paramWebView);
      }
      return true;
    }
    return paramString.startsWith("auth://progress");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\TDialog$FbWebViewClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */