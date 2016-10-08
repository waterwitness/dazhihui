package com.alipay.b.b.a.a;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

public class h
  implements HttpRequestRetryHandler
{
  static final String a = h.class.getSimpleName();
  
  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    if (paramInt >= 3) {}
    do
    {
      return false;
      if ((paramIOException instanceof NoHttpResponseException))
      {
        paramIOException = a;
        return true;
      }
    } while (((!(paramIOException instanceof SocketException)) && (!(paramIOException instanceof SSLException))) || (paramIOException.getMessage() == null) || (!paramIOException.getMessage().contains("Broken pipe")));
    paramIOException = a;
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */