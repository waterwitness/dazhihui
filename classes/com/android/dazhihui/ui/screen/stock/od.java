package com.android.dazhihui.ui.screen.stock;

import android.webkit.WebView;
import com.android.dazhihui.ui.widget.im;

class od
  extends im
{
  od(PlateLinkageActivity paramPlateLinkageActivity) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    paramWebView.requestLayout();
    paramWebView.postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */