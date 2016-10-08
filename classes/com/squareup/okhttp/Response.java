package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;
import java.util.List;
import java.util.Set;

final class Response
{
  private final Response.Body body;
  private final int code;
  private final RawHeaders headers;
  private final Response redirectedBy;
  private final Request request;
  
  private Response(Response.Builder paramBuilder)
  {
    this.request = Response.Builder.access$0(paramBuilder);
    this.code = Response.Builder.access$1(paramBuilder);
    this.headers = new RawHeaders(Response.Builder.access$2(paramBuilder));
    this.body = Response.Builder.access$3(paramBuilder);
    this.redirectedBy = Response.Builder.access$4(paramBuilder);
  }
  
  public Response.Body body()
  {
    return this.body;
  }
  
  public int code()
  {
    return this.code;
  }
  
  public String header(String paramString)
  {
    return header(paramString, null);
  }
  
  public String header(String paramString1, String paramString2)
  {
    paramString1 = this.headers.get(paramString1);
    if (paramString1 != null) {
      paramString2 = paramString1;
    }
    return paramString2;
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
  
  RawHeaders rawHeaders()
  {
    return new RawHeaders(this.headers);
  }
  
  public Response redirectedBy()
  {
    return this.redirectedBy;
  }
  
  public Request request()
  {
    return this.request;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */