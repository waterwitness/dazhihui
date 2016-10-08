package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;

@Deprecated
class HttpService$HttpRequestHandlerResolverAdapter
  implements HttpRequestHandlerMapper
{
  private final HttpRequestHandlerResolver resolver;
  
  public HttpService$HttpRequestHandlerResolverAdapter(HttpRequestHandlerResolver paramHttpRequestHandlerResolver)
  {
    this.resolver = paramHttpRequestHandlerResolver;
  }
  
  public HttpRequestHandler lookup(HttpRequest paramHttpRequest)
  {
    return this.resolver.lookup(paramHttpRequest.getRequestLine().getUri());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\protocol\HttpService$HttpRequestHandlerResolverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */