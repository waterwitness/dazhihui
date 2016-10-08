package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.InputStream;

class Dispatcher$RealResponseBody
  extends Response.Body
{
  private final InputStream in;
  private final ResponseHeaders responseHeaders;
  
  Dispatcher$RealResponseBody(ResponseHeaders paramResponseHeaders, InputStream paramInputStream)
  {
    this.responseHeaders = paramResponseHeaders;
    this.in = paramInputStream;
  }
  
  public InputStream byteStream()
  {
    return this.in;
  }
  
  public long contentLength()
  {
    return this.responseHeaders.getContentLength();
  }
  
  public MediaType contentType()
  {
    String str = this.responseHeaders.getContentType();
    if (str != null) {
      return MediaType.parse(str);
    }
    return null;
  }
  
  public boolean ready()
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Dispatcher$RealResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */