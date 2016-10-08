package com.alipay.b.b.a.a;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class j
  implements HttpRequestInterceptor
{
  private j(i parami) {}
  
  public final void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    paramHttpContext = i.a(this.a);
    if ((paramHttpContext != null) && (k.a(paramHttpContext)) && ((paramHttpRequest instanceof HttpUriRequest))) {
      k.a(paramHttpContext, i.a((HttpUriRequest)paramHttpRequest));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */