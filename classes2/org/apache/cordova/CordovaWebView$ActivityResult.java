package org.apache.cordova;

import android.content.Intent;

class CordovaWebView$ActivityResult
{
  Intent incoming;
  int request;
  int result;
  
  public CordovaWebView$ActivityResult(CordovaWebView paramCordovaWebView, int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.request = paramInt1;
    this.result = paramInt2;
    this.incoming = paramIntent;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaWebView$ActivityResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */