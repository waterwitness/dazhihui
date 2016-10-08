package org.apache.cordova;

import android.app.Activity;

class CordovaWebViewClient$1
  implements Runnable
{
  CordovaWebViewClient$1(CordovaWebViewClient paramCordovaWebViewClient) {}
  
  public void run()
  {
    try
    {
      Thread.sleep(2000L);
      this.this$0.cordova.getActivity().runOnUiThread(new CordovaWebViewClient.1.1(this));
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaWebViewClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */