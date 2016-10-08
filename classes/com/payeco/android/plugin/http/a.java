package com.payeco.android.plugin.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class a
  implements HostnameVerifier
{
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */