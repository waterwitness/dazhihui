package com.android.thinkive.framework;

import android.text.TextUtils;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;
import java.io.File;

class WebViewManager$2
  implements Runnable
{
  WebViewManager$2(WebViewManager paramWebViewManager, String paramString, MyWebView paramMyWebView) {}
  
  public void run()
  {
    if (TextUtils.isEmpty(this.val$url))
    {
      Log.d("load url error, url is empty!!!");
      return;
    }
    if ((this.val$url.startsWith("file:///android_asset")) || (this.val$url.startsWith("http")) || (this.val$url.startsWith("https")))
    {
      this.val$webView.loadUrl(this.val$url);
      this.val$webView.setLoadUrl(this.val$url);
      return;
    }
    if (WebViewManager.access$6(this.this$0))
    {
      String str = "file://" + WebViewManager.access$4(this.this$0) + File.separator + this.val$url;
      this.val$webView.loadUrl(str);
      this.val$webView.setLoadUrl(this.val$url);
      Log.d("load url = " + str);
      return;
    }
    Log.d("url path error, when mIsSupportH5Upgrade = false,please use file:///android_asset path !!!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\WebViewManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */