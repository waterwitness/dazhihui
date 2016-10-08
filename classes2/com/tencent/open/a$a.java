package com.tencent.open;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

public class a$a
{
  protected WeakReference<WebView> a;
  protected long b;
  protected String c;
  
  public a$a(WebView paramWebView, long paramLong, String paramString)
  {
    this.a = new WeakReference(paramWebView);
    this.b = paramLong;
    this.c = paramString;
  }
  
  public void a()
  {
    WebView localWebView = (WebView)this.a.get();
    if (localWebView == null) {
      return;
    }
    localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':1,'result':'no such method'})");
  }
  
  public void a(Object paramObject)
  {
    WebView localWebView = (WebView)this.a.get();
    if (localWebView == null) {
      return;
    }
    String str = "'undefined'";
    if ((paramObject instanceof String))
    {
      paramObject = ((String)paramObject).replace("\\", "\\\\").replace("'", "\\'");
      str = "'" + paramObject + "'";
    }
    for (;;)
    {
      localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':0,'result':" + str + "});");
      return;
      if (((paramObject instanceof Number)) || ((paramObject instanceof Long)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Double)) || ((paramObject instanceof Float))) {
        str = paramObject.toString();
      } else if ((paramObject instanceof Boolean)) {
        str = paramObject.toString();
      }
    }
  }
  
  public void a(String paramString)
  {
    WebView localWebView = (WebView)this.a.get();
    if (localWebView != null) {
      localWebView.loadUrl("javascript:" + paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */