package com.squareup.okhttp.internal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

class Platform$Android23
  extends Platform
{
  protected final Class<?> openSslSocketClass;
  private final Method setHostname;
  private final Method setUseSessionTickets;
  
  private Platform$Android23(Class<?> paramClass, Method paramMethod1, Method paramMethod2)
  {
    this.openSslSocketClass = paramClass;
    this.setUseSessionTickets = paramMethod1;
    this.setHostname = paramMethod2;
  }
  
  public void connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    try
    {
      paramSocket.connect(paramInetSocketAddress, paramInt);
      return;
    }
    catch (SecurityException paramSocket)
    {
      paramInetSocketAddress = new IOException("Exception in connect");
      paramInetSocketAddress.initCause(paramSocket);
      throw paramInetSocketAddress;
    }
  }
  
  public void enableTlsExtensions(SSLSocket paramSSLSocket, String paramString)
  {
    super.enableTlsExtensions(paramSSLSocket, paramString);
    if (this.openSslSocketClass.isInstance(paramSSLSocket)) {}
    try
    {
      this.setUseSessionTickets.invoke(paramSSLSocket, new Object[] { Boolean.valueOf(true) });
      this.setHostname.invoke(paramSSLSocket, new Object[] { paramString });
      return;
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError(paramSSLSocket);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\Platform$Android23.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */