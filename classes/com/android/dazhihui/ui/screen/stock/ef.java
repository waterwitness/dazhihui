package com.android.dazhihui.ui.screen.stock;

import android.webkit.WebView;
import com.android.dazhihui.ui.widget.im;

class ef
  extends im
{
  ef(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    paramWebView.requestLayout();
    paramWebView.postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */