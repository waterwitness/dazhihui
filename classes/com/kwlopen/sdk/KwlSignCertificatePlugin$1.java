package com.kwlopen.sdk;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

class KwlSignCertificatePlugin$1
  implements Runnable
{
  KwlSignCertificatePlugin$1(KwlSignCertificatePlugin paramKwlSignCertificatePlugin, CallbackContext paramCallbackContext, JSONObject paramJSONObject) {}
  
  public void run()
  {
    this.val$callbackContext.success(this.val$retJsonObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlSignCertificatePlugin$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */