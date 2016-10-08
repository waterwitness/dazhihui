package org.apache.http;

import java.net.Socket;

public abstract interface HttpConnectionFactory<T extends HttpConnection>
{
  public abstract T createConnection(Socket paramSocket);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpConnectionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */