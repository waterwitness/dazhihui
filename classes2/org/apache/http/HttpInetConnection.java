package org.apache.http;

import java.net.InetAddress;

public abstract interface HttpInetConnection
  extends HttpConnection
{
  public abstract InetAddress getLocalAddress();
  
  public abstract int getLocalPort();
  
  public abstract InetAddress getRemoteAddress();
  
  public abstract int getRemotePort();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpInetConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */