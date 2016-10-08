package com.e.a.a;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

class d
  implements HttpResponseInterceptor
{
  d(b paramb) {}
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    paramHttpContext = paramHttpResponse.getEntity();
    if (paramHttpContext == null) {}
    for (;;)
    {
      return;
      Object localObject = paramHttpContext.getContentEncoding();
      if (localObject != null)
      {
        localObject = ((Header)localObject).getElements();
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          if (localObject[i].getName().equalsIgnoreCase("gzip"))
          {
            paramHttpResponse.setEntity(new g(paramHttpContext));
            return;
          }
          i += 1;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */