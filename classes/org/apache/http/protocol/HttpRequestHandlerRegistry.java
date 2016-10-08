package org.apache.http.protocol;

import java.util.Map;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@Deprecated
@ThreadSafe
public class HttpRequestHandlerRegistry
  implements HttpRequestHandlerResolver
{
  private final UriPatternMatcher<HttpRequestHandler> matcher = new UriPatternMatcher();
  
  public Map<String, HttpRequestHandler> getHandlers()
  {
    return this.matcher.getObjects();
  }
  
  public HttpRequestHandler lookup(String paramString)
  {
    return (HttpRequestHandler)this.matcher.lookup(paramString);
  }
  
  public void register(String paramString, HttpRequestHandler paramHttpRequestHandler)
  {
    Args.notNull(paramString, "URI request pattern");
    Args.notNull(paramHttpRequestHandler, "Request handler");
    this.matcher.register(paramString, paramHttpRequestHandler);
  }
  
  public void setHandlers(Map<String, HttpRequestHandler> paramMap)
  {
    this.matcher.setObjects(paramMap);
  }
  
  public void unregister(String paramString)
  {
    this.matcher.unregister(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\protocol\HttpRequestHandlerRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */