package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.internal.spdy.ErrorCode;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import com.squareup.okhttp.internal.spdy.SpdyStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;
import java.net.URI;
import java.net.URL;

public final class SpdyTransport
  implements Transport
{
  private final HttpEngine httpEngine;
  private final SpdyConnection spdyConnection;
  private SpdyStream stream;
  
  public SpdyTransport(HttpEngine paramHttpEngine, SpdyConnection paramSpdyConnection)
  {
    this.httpEngine = paramHttpEngine;
    this.spdyConnection = paramSpdyConnection;
  }
  
  public OutputStream createRequestBody()
  {
    long l = this.httpEngine.policy.getFixedContentLength();
    if (l != -1L) {
      this.httpEngine.requestHeaders.setContentLength(l);
    }
    writeRequestHeaders();
    return this.stream.getOutputStream();
  }
  
  public void flushRequest()
  {
    this.stream.getOutputStream().close();
  }
  
  public InputStream getTransferStream(CacheRequest paramCacheRequest)
  {
    return new UnknownLengthHttpInputStream(this.stream.getInputStream(), paramCacheRequest, this.httpEngine);
  }
  
  public boolean makeReusable(boolean paramBoolean, OutputStream paramOutputStream, InputStream paramInputStream)
  {
    if (paramBoolean)
    {
      if (this.stream != null) {
        this.stream.closeLater(ErrorCode.CANCEL);
      }
    }
    else {
      return true;
    }
    return false;
  }
  
  public ResponseHeaders readResponseHeaders()
  {
    Object localObject = RawHeaders.fromNameValueBlock(this.stream.getResponseHeaders());
    this.httpEngine.receiveHeaders((RawHeaders)localObject);
    localObject = new ResponseHeaders(this.httpEngine.uri, (RawHeaders)localObject);
    ((ResponseHeaders)localObject).setTransport("spdy/3");
    return (ResponseHeaders)localObject;
  }
  
  public void writeRequestBody(RetryableOutputStream paramRetryableOutputStream)
  {
    throw new UnsupportedOperationException();
  }
  
  public void writeRequestHeaders()
  {
    if (this.stream != null) {
      return;
    }
    this.httpEngine.writingRequestHeaders();
    RawHeaders localRawHeaders = this.httpEngine.requestHeaders.getHeaders();
    if (this.httpEngine.connection.getHttpMinorVersion() == 1) {}
    for (String str = "HTTP/1.1";; str = "HTTP/1.0")
    {
      URL localURL = this.httpEngine.policy.getURL();
      localRawHeaders.addSpdyRequestHeaders(this.httpEngine.method, HttpEngine.requestPath(localURL), str, HttpEngine.getOriginAddress(localURL), this.httpEngine.uri.getScheme());
      boolean bool = this.httpEngine.hasRequestBody();
      this.stream = this.spdyConnection.newStream(localRawHeaders.toNameValueBlock(), bool, true);
      this.stream.setReadTimeout(this.httpEngine.client.getReadTimeout());
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\SpdyTransport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */