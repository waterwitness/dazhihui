package com.tencent.open.utils;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class HttpUtils$CustomSSLSocketFactory
  extends org.apache.http.conn.ssl.SSLSocketFactory
{
  private final SSLContext a = SSLContext.getInstance("TLS");
  
  public HttpUtils$CustomSSLSocketFactory(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    try
    {
      paramKeyStore = new HttpUtils.MyX509TrustManager();
      this.a.init(null, new TrustManager[] { paramKeyStore }, null);
      return;
    }
    catch (Exception paramKeyStore)
    {
      for (;;)
      {
        paramKeyStore = null;
      }
    }
  }
  
  public Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\HttpUtils$CustomSSLSocketFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */