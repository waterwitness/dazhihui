package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;

public class Response$Builder
{
  private Response.Body body;
  private final int code;
  private RawHeaders headers = new RawHeaders();
  private Response redirectedBy;
  private final Request request;
  
  public Response$Builder(Request paramRequest, int paramInt)
  {
    if (paramRequest == null) {
      throw new IllegalArgumentException("request == null");
    }
    if (paramInt <= 0) {
      throw new IllegalArgumentException("code <= 0");
    }
    this.request = paramRequest;
    this.code = paramInt;
  }
  
  public Builder addHeader(String paramString1, String paramString2)
  {
    this.headers.add(paramString1, paramString2);
    return this;
  }
  
  public Builder body(Response.Body paramBody)
  {
    this.body = paramBody;
    return this;
  }
  
  public Response build()
  {
    if (this.request == null) {
      throw new IllegalStateException("Response has no request.");
    }
    if (this.code == -1) {
      throw new IllegalStateException("Response has no code.");
    }
    return new Response(this, null);
  }
  
  public Builder header(String paramString1, String paramString2)
  {
    this.headers.set(paramString1, paramString2);
    return this;
  }
  
  Builder rawHeaders(RawHeaders paramRawHeaders)
  {
    this.headers = new RawHeaders(paramRawHeaders);
    return this;
  }
  
  public Builder redirectedBy(Response paramResponse)
  {
    this.redirectedBy = paramResponse;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Response$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */