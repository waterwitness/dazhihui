package com.alipay.b.b.a.a;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

final class o
  implements ConnectionKeepAliveStrategy
{
  o(m paramm) {}
  
  public final long getKeepAliveDuration(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return 180000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */