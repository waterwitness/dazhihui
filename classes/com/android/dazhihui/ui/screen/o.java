package com.android.dazhihui.ui.screen;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.stock.StockChartScreen;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.im;
import com.android.dazhihui.ui.widget.kb;

class o
  extends im
{
  o(i parami) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    i.b(this.a).loadUrl("javascript:window.handler.show(document.getElementById('erweima').src);");
    i.b(this.a).loadUrl("javascript:window.handler.show(document.title);");
    i.c(this.a).b();
    if (i.d(this.a))
    {
      i.a(this.a, false);
      if ((this.a.getActivity() != null) && ((this.a.getActivity() instanceof StockChartScreen))) {
        ((StockChartScreen)this.a.getActivity()).a().d(true);
      }
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    n.c("start ");
    i.a(this.a, paramString);
    i.e(this.a);
    i.c(this.a).a();
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    i.c(this.a).setProgress(paramInt);
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      i.f(this.a).setText(paramString);
      return;
    }
    i.f(this.a).setText(i.g(this.a));
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */