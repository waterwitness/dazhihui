package com.cairh.app.sjkh;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.cairh.app.sjkh.util.CacheUtil;

class MainActivity$8
  implements Runnable
{
  MainActivity$8(MainActivity paramMainActivity) {}
  
  public void run()
  {
    try
    {
      CookieSyncManager.createInstance(this.this$0.context);
      CookieSyncManager.getInstance().startSync();
      CookieManager.getInstance().removeSessionCookie();
      CacheUtil.clearWebViewCache(this.this$0.context, this.this$0.appCacheDir);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */