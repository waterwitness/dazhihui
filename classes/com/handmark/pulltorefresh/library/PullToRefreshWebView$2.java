package com.handmark.pulltorefresh.library;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

class PullToRefreshWebView$2
  extends WebChromeClient
{
  PullToRefreshWebView$2(PullToRefreshWebView paramPullToRefreshWebView) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (paramInt == 100) {
      this.a.d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshWebView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */