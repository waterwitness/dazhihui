package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;
import java.net.URL;
import java.util.List;
import java.util.Set;

final class Request
{
  private final Request.Body body;
  private final RawHeaders headers;
  private final String method;
  private final Object tag;
  private final URL url;
  
  private Request(Request.Builder paramBuilder)
  {
    this.url = Request.Builder.access$0(paramBuilder);
    this.method = Request.Builder.access$1(paramBuilder);
    this.headers = new RawHeaders(Request.Builder.access$2(paramBuilder));
    this.body = Request.Builder.access$3(paramBuilder);
    if (Request.Builder.access$4(paramBuilder) != null) {}
    for (paramBuilder = Request.Builder.access$4(paramBuilder);; paramBuilder = this)
    {
      this.tag = paramBuilder;
      return;
    }
  }
  
  public Request.Body body()
  {
    return this.body;
  }
  
  public String header(String paramString)
  {
    return this.headers.get(paramString);
  }
  
  public int headerCount()
  {
    return this.headers.length();
  }
  
  public String headerName(int paramInt)
  {
    return this.headers.getFieldName(paramInt);
  }
  
  public Set<String> headerNames()
  {
    return this.headers.names();
  }
  
  public String headerValue(int paramInt)
  {
    return this.headers.getValue(paramInt);
  }
  
  public List<String> headers(String paramString)
  {
    return this.headers.values(paramString);
  }
  
  public String method()
  {
    return this.method;
  }
  
  Request.Builder newBuilder()
  {
    return new Request.Builder(this.url).method(this.method, this.body).rawHeaders(this.headers).tag(this.tag);
  }
  
  RawHeaders rawHeaders()
  {
    return new RawHeaders(this.headers);
  }
  
  public Object tag()
  {
    return this.tag;
  }
  
  public URL url()
  {
    return this.url;
  }
  
  public String urlString()
  {
    return this.url.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */