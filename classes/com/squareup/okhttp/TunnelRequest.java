package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.RawHeaders;

public final class TunnelRequest
{
  final String host;
  final int port;
  final String proxyAuthorization;
  final String userAgent;
  
  public TunnelRequest(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (paramString1 == null) {
      throw new NullPointerException("host == null");
    }
    if (paramString2 == null) {
      throw new NullPointerException("userAgent == null");
    }
    this.host = paramString1;
    this.port = paramInt;
    this.userAgent = paramString2;
    this.proxyAuthorization = paramString3;
  }
  
  RawHeaders getRequestHeaders()
  {
    RawHeaders localRawHeaders = new RawHeaders();
    localRawHeaders.setRequestLine("CONNECT " + this.host + ":" + this.port + " HTTP/1.1");
    if (this.port == Util.getDefaultPort("https")) {}
    for (String str = this.host;; str = this.host + ":" + this.port)
    {
      localRawHeaders.set("Host", str);
      localRawHeaders.set("User-Agent", this.userAgent);
      if (this.proxyAuthorization != null) {
        localRawHeaders.set("Proxy-Authorization", this.proxyAuthorization);
      }
      localRawHeaders.set("Proxy-Connection", "Keep-Alive");
      return localRawHeaders;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\TunnelRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */