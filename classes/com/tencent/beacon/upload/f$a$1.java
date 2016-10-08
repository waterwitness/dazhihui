package com.tencent.beacon.upload;

import java.io.IOException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

final class f$a$1
  implements HttpRequestRetryHandler
{
  f$a$1(f.a parama) {}
  
  public final boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    if (paramInt >= 3) {}
    do
    {
      return false;
      if ((paramIOException instanceof NoHttpResponseException)) {
        return true;
      }
    } while (!(paramIOException instanceof ClientProtocolException));
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\f$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */