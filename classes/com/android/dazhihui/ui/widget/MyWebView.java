package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;
import java.util.HashMap;
import java.util.Map;

public class MyWebView
  extends WebView
  implements ks
{
  public ValueCallback<Uri> a;
  public ValueCallback<Uri[]> b;
  public Uri c;
  WebViewJsAndAndroid d;
  private Context e;
  private in f = null;
  private int g = -1;
  private im h;
  private il i;
  
  public MyWebView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MyWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    setBackgroundColor(0);
    a();
  }
  
  public static String a(String paramString, y paramy)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    do
    {
      do
      {
        return str;
        str = paramString;
      } while (paramString.contains("javascript:"));
      if (paramString.contains("themeStyleVs="))
      {
        if (paramy == y.b) {
          return a(paramString, "themeStyleVs=", "1");
        }
        return a(paramString, "themeStyleVs=", "0");
      }
      str = paramString;
    } while (paramy != y.b);
    if (paramString.contains("?")) {
      return paramString + "&themeStyleVs=1";
    }
    return paramString + "?themeStyleVs=1";
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    int j = paramString1.indexOf(paramString2);
    if (j > 0)
    {
      localObject = String.valueOf(paramString1.charAt(j - 1));
      if ((((String)localObject).equals("&")) || (((String)localObject).equals("?"))) {}
    }
    else
    {
      return paramString1;
    }
    int k = paramString1.indexOf("&", j);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(paramString1.substring(0, j + paramString2.length()));
    ((StringBuffer)localObject).append(paramString3);
    if (k > 0) {
      ((StringBuffer)localObject).append(paramString1.substring(k));
    }
    return ((StringBuffer)localObject).toString();
  }
  
  private void a()
  {
    setWebViewClient(new ii(this));
    setWebChromeClient(new MyWebView.2(this));
    setDownloadListener(new ik(this));
    getSettings().setJavaScriptEnabled(true);
    getSettings().setBuiltInZoomControls(true);
    getSettings().setDisplayZoomControls(false);
    getSettings().setUseWideViewPort(true);
    getSettings().setLoadWithOverviewMode(true);
    setScrollBarStyle(33554432);
    getSettings().setSavePassword(false);
    getSettings().setGeolocationEnabled(true);
    getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    getSettings().setCacheMode(-1);
    getSettings().setDomStorageEnabled(true);
    if (Build.VERSION.SDK_INT >= 21) {
      getSettings().setMixedContentMode(0);
    }
    addJavascriptInterface(this, "TouchEventIntercept");
    this.d = new WebViewJsAndAndroid();
    this.d.setWebView(this);
    addJavascriptInterface(this.d, "DzhAppJs");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return (getScrollY() == 0) && (getTop() >= 0);
  }
  
  public il getOnCloseWebViewListener()
  {
    return this.i;
  }
  
  public void loadUrl(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    paramString = a(paramString, g.a().b());
    HashMap localHashMap = new HashMap();
    if ("app_dzh".equals("app_sb")) {
      localHashMap.put("httpdzh", "dzhtv-" + g.a().r());
    }
    for (;;)
    {
      super.loadUrl(paramString, localHashMap);
      return;
      localHashMap.put("httpdzh", "dzh-android-" + g.a().r());
    }
  }
  
  public void setOnCloseWebViewListener(il paramil)
  {
    this.i = paramil;
  }
  
  public void setStatisticsCountId(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void setTitleView(View paramView)
  {
    this.d.setTitle(paramView);
  }
  
  public void setWebViewLoadListener(im paramim)
  {
    this.h = paramim;
  }
  
  public void setWebViewProgressChangeListener(in paramin)
  {
    this.f = paramin;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MyWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */