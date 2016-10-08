package com.cairh.app.sjkh.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.common.WriteLogFile;
import java.io.PrintStream;

public class GenericWebClient
  extends WebViewClient
{
  private MainActivity context;
  DialogInterface.OnClickListener listener = new GenericWebClient.1(this);
  private WebView view;
  
  public GenericWebClient(MainActivity paramMainActivity)
  {
    this.context = paramMainActivity;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    System.out.println(" >>> page finished...");
    this.context.dismissProgressDialog();
    paramWebView.requestFocus();
    this.context.refreshMainView();
    super.onPageFinished(paramWebView, paramString);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Log.e("GenericWebClient", "ReceivedError ...");
    this.view = paramWebView;
    this.context.dismissProgressDialog();
    AlertDialog localAlertDialog = new AlertDialog.Builder(this.context).create();
    localAlertDialog.setTitle("温馨提示");
    localAlertDialog.setMessage("无法连接到服务器，请检查网络设置");
    localAlertDialog.setButton("退出", this.listener);
    localAlertDialog.setButton2("重新加载", this.listener);
    localAlertDialog.setCanceledOnTouchOutside(false);
    if (!this.context.isFinishing()) {
      localAlertDialog.show();
    }
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    WriteLogFile.witeLog("开始连接服务器。。。");
    WriteLogFile.witeLog(">>>> errorCode  >>> " + paramInt);
    WriteLogFile.witeLog(">>>> description >>> " + paramString1);
    WriteLogFile.witeLog(">>>> failingUrl    >>> " + paramString2);
  }
  
  public void onReceivedHttpAuthRequest(WebView paramWebView, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    System.out.println(">>>>>>>>>>>>>>> host >>>>>>>>>>>>>>>>>> " + paramString1);
    super.onReceivedHttpAuthRequest(paramWebView, paramHttpAuthHandler, paramString1, paramString2);
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
    Log.e("GenericWebClient", "ReceivedSslError...");
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((paramString.startsWith("mailto:")) || (paramString.startsWith("geo:")) || (paramString.startsWith("tel:")))
    {
      paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      this.context.startActivity(paramWebView);
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\GenericWebClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */