package com.baidu.location.b;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class o
  extends org.apache.http.conn.ssl.SSLSocketFactory
{
  final SSLContext a = SSLContext.getInstance("TLS");
  
  public o(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    paramKeyStore = new w(this);
    this.a.init(null, new TrustManager[] { paramKeyStore }, null);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */