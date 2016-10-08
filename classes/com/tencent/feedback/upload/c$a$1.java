package com.tencent.feedback.upload;

import java.io.IOException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

final class c$a$1
  implements HttpRequestRetryHandler
{
  c$a$1(c.a parama) {}
  
  public final boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\upload\c$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */