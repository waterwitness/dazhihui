package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.im;

class fa
  extends im
{
  fa(eu parameu, TextView paramTextView) {}
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (TextUtils.isEmpty(this.a.getText()))) {
      this.a.setText(paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */