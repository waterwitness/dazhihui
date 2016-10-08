package com.android.dazhihui.ui.widget;

import android.widget.ImageView;
import android.widget.RelativeLayout;

class ni
  implements Runnable
{
  ni(WebViewJsAndAndroid paramWebViewJsAndAndroid) {}
  
  public void run()
  {
    if (WebViewJsAndAndroid.a(this.a) == -1)
    {
      WebViewJsAndAndroid.b(this.a).setVisibility(0);
      WebViewJsAndAndroid.c(this.a).invalidate();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */