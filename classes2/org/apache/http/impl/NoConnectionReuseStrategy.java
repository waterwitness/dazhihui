package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.protocol.HttpContext;

@Immutable
public class NoConnectionReuseStrategy
  implements ConnectionReuseStrategy
{
  public static final NoConnectionReuseStrategy INSTANCE = new NoConnectionReuseStrategy();
  
  public boolean keepAlive(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\NoConnectionReuseStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */