package com.tencent.avsdk.activity;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.widget.im;
import com.android.dazhihui.w;
import com.tencent.Util.IlvbRechargeManager;
import com.tencent.avsdk.UserilvbManager;

class IlvbAccountRechargeScreen$2
  extends im
{
  IlvbAccountRechargeScreen$2(IlvbAccountRechargeScreen paramIlvbAccountRechargeScreen) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    paramWebView.setVisibility(0);
    paramWebView.requestLayout();
    paramWebView.postInvalidate();
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    paramWebView.setVisibility(4);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    for (;;)
    {
      try
      {
        if (paramString.contains("dzh_browser_url"))
        {
          paramWebView = paramString;
          if (!paramString.startsWith("dzh_browser_url")) {
            paramWebView = paramString.substring(paramString.indexOf("dzh_browser_url"));
          }
          i = Integer.parseInt(r.b("goto", paramWebView, "0"));
          int j = Integer.parseInt(r.b("kind", paramWebView, "-1"));
          paramString = r.b("price", paramWebView, "");
          int k = Integer.parseInt(r.b("screen", paramWebView, "-1"));
          if ((i == 0) && (k == 182))
          {
            if (!w.a().l())
            {
              UserilvbManager.getInstance().showLoginDialog(this.this$0);
              return true;
            }
            double d = Double.parseDouble(paramString);
            if (IlvbAccountRechargeScreen.access$000(this.this$0) != 0) {
              break label170;
            }
            i = 0;
            new IlvbRechargeManager(this.this$0, new IlvbAccountRechargeScreen.2.1(this), i).sendOutTradeNo(Double.valueOf(d), j);
            return true;
          }
        }
      }
      catch (Exception paramWebView)
      {
        paramWebView.printStackTrace();
      }
      return false;
      label170:
      int i = IlvbAccountRechargeScreen.access$000(this.this$0);
      if (i == 1) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbAccountRechargeScreen$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */