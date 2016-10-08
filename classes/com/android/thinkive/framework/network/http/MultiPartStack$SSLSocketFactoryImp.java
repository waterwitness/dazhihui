package com.android.thinkive.framework.network.http;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class MultiPartStack$SSLSocketFactoryImp
  extends org.apache.http.conn.ssl.SSLSocketFactory
{
  final SSLContext sslContext = SSLContext.getInstance("TLS");
  
  public MultiPartStack$SSLSocketFactoryImp(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    paramKeyStore = new MultiPartStack.SSLSocketFactoryImp.1(this);
    this.sslContext.init(null, new TrustManager[] { paramKeyStore }, null);
  }
  
  public Socket createSocket()
  {
    return this.sslContext.getSocketFactory().createSocket();
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.sslContext.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\MultiPartStack$SSLSocketFactoryImp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */