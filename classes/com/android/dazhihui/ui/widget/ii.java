package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.dazhihui.d.be;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.screen.stock.uc;
import com.android.dazhihui.w;
import com.tencent.avsdk.Util;

class ii
  extends WebViewClient
{
  ii(MyWebView paramMyWebView) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    if (MyWebView.b(this.a) != null) {
      MyWebView.b(this.a).onPageFinished(paramWebView, paramString);
    }
    this.a.loadUrl("javascript:setUser(" + WebViewJsAndAndroid.getUseruserInfoJson() + ")");
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (MyWebView.b(this.a) != null) {
      MyWebView.b(this.a).onPageStarted(paramWebView, paramString, paramBitmap);
    }
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    int i = 0;
    String str;
    if (MyWebView.a(this.a) != -1)
    {
      str = paramWebView.getOriginalUrl();
      localObject = str;
      if (str == null) {
        localObject = paramWebView.getUrl();
      }
      localObject = be.a((String)localObject);
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (!paramString.startsWith((String)localObject))) {
        break label562;
      }
    }
    label562:
    for (Object localObject = paramString.substring(((String)localObject).length(), paramString.length());; localObject = paramString)
    {
      n.a((String)localObject, MyWebView.a(this.a));
      localObject = r.a(paramString, "");
      str = localObject[1];
      if ((Boolean.parseBoolean(localObject[2])) && (!w.a().l()))
      {
        LoginMainScreen.b = new ij(this, paramWebView, paramString);
        paramWebView = new Intent(this.a.getContext(), LoginMainScreen.class);
        paramWebView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        this.a.getContext().startActivity(paramWebView);
      }
      do
      {
        do
        {
          return true;
        } while ((MyWebView.b(this.a) != null) && (MyWebView.b(this.a).shouldOverrideUrlLoading(paramWebView, str)));
        if (localObject[0].equals("2")) {}
        while ((str != null) && (str.startsWith("http://www.welansh.com")) && (str.contains("pages_android")))
        {
          Util.closeILVBVideoScreen(this.a.getContext());
          paramWebView = new Bundle();
          paramWebView.putBoolean("HTML5_ACCOUNT", true);
          paramWebView.putString("HTML5_ACCOUNT_URL", str);
          if (m.a().M() == null)
          {
            paramString = new uc();
            m.a().a(paramString);
          }
          paramWebView.putString("HTML5_ACCOUNT_URL", str);
          paramString = new Intent(this.a.getContext(), BrowserActivity.class);
          paramString.putExtras(paramWebView);
          this.a.getContext().startActivity(paramString);
          return true;
          if (localObject[0].equals("1"))
          {
            paramWebView = new Intent();
            paramWebView.setAction("android.intent.action.VIEW");
            paramWebView.setData(Uri.parse(str));
            this.a.getContext().startActivity(paramWebView);
            return true;
          }
          if (localObject[0].equals("3"))
          {
            r.a(str, this.a.getContext());
            return true;
          }
          i = 1;
        }
        paramString = this.a.getContext().getString(2131165303);
        localObject = this.a.getContext().getString(2131165304);
        if (!str.startsWith(paramString)) {
          break;
        }
      } while (!str.equals(localObject));
      paramWebView = new Intent("android.intent.action.DIAL", Uri.parse(str));
      this.a.getContext().startActivity(paramWebView);
      return true;
      if (str.equals("http://sq.gw.com.cn/vote/index/id/28"))
      {
        this.a.loadUrl(str);
        return true;
      }
      localObject = paramWebView.getOriginalUrl();
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = paramWebView.getUrl();
      }
      paramWebView = be.a(paramString);
      if (i != 0)
      {
        r.a((Activity)this.a.getContext(), null, str, paramWebView);
        return true;
      }
      r.a((Activity)this.a.getContext(), this.a, str, paramWebView);
      return true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */