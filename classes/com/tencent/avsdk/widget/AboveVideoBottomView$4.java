package com.tencent.avsdk.widget;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.widget.im;

class AboveVideoBottomView$4
  extends im
{
  AboveVideoBottomView$4(AboveVideoBottomView paramAboveVideoBottomView, ImageView paramImageView) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    this.val$image.setVisibility(0);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.val$image.setVisibility(4);
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt) {}
  
  public void onReceivedTitle(WebView paramWebView, String paramString) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      if (paramString.contains("dzh_browser_url"))
      {
        paramWebView = paramString;
        if (!paramString.startsWith("dzh_browser_url")) {
          paramWebView = paramString.substring(paramString.indexOf("dzh_browser_url"));
        }
        int i = Integer.parseInt(r.b("goto", paramWebView, "0"));
        int j = Integer.parseInt(r.b("screen", paramWebView, "-1"));
        if ((i == 0) && (j == 197))
        {
          AboveVideoBottomView.access$200(this.this$0).dismiss();
          this.this$0.showGift();
          return true;
        }
      }
    }
    catch (Exception paramWebView)
    {
      paramWebView.printStackTrace();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */