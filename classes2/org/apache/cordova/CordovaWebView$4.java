package org.apache.cordova;

import java.util.concurrent.ExecutorService;

class CordovaWebView$4
  implements Runnable
{
  CordovaWebView$4(CordovaWebView paramCordovaWebView1, Runnable paramRunnable, CordovaWebView paramCordovaWebView2, String paramString) {}
  
  public void run()
  {
    CordovaWebView.access$1(this.this$0).getThreadPool().execute(this.val$timeoutCheck);
    this.val$me.loadUrlNow(this.val$url);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaWebView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */