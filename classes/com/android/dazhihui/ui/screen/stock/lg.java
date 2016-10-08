package com.android.dazhihui.ui.screen.stock;

import android.webkit.WebView;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.im;

class lg
  extends im
{
  lg(kz paramkz) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if (this.a.t.b == 1)
    {
      this.a.t.setVisibility(0);
      return;
    }
    this.a.t.setAdvCode(105);
    this.a.addAdvert(this.a.t);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.contains("@img="))
    {
      int i = paramString.indexOf("@img=");
      paramWebView = paramString.substring("@img=".length() + i);
      ZoomImageScreen.a(this.a.s, paramWebView);
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */