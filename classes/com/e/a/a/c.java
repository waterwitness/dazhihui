package com.e.a.a;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

class c
  implements HttpRequestInterceptor
{
  c(b paramb) {}
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    if (!paramHttpRequest.containsHeader("Accept-Encoding")) {
      paramHttpRequest.addHeader("Accept-Encoding", "gzip");
    }
    paramHttpContext = b.a(this.a).keySet().iterator();
    for (;;)
    {
      if (!paramHttpContext.hasNext()) {
        return;
      }
      String str = (String)paramHttpContext.next();
      if (paramHttpRequest.containsHeader(str))
      {
        Header localHeader = paramHttpRequest.getFirstHeader(str);
        Log.d("AsyncHttpClient", String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", new Object[] { str, b.a(this.a).get(str), localHeader.getName(), localHeader.getValue() }));
        paramHttpRequest.removeHeader(localHeader);
      }
      paramHttpRequest.addHeader(str, (String)b.a(this.a).get(str));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */