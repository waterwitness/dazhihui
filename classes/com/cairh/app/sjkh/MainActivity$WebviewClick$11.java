package com.cairh.app.sjkh;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.cairh.app.sjkh.util.CacheUtil;

class MainActivity$WebviewClick$11
  implements Runnable
{
  MainActivity$WebviewClick$11(MainActivity.WebviewClick paramWebviewClick) {}
  
  public void run()
  {
    try
    {
      CookieSyncManager.createInstance(MainActivity.WebviewClick.access$0(this.this$1).context);
      CookieSyncManager.getInstance().startSync();
      CookieManager.getInstance().removeSessionCookie();
      CacheUtil.clearWebViewCache(MainActivity.WebviewClick.access$0(this.this$1).context, MainActivity.WebviewClick.access$0(this.this$1).appCacheDir);
      MainActivity.access$0(MainActivity.WebviewClick.access$0(this.this$1)).clearCache(true);
      MainActivity.access$0(MainActivity.WebviewClick.access$0(this.this$1)).loadUrl(MainActivity.WebviewClick.access$0(this.this$1).appUrl);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */