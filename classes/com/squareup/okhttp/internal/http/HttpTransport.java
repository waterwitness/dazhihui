package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;
import java.net.Socket;

public final class HttpTransport
  implements Transport
{
  public static final int DEFAULT_CHUNK_LENGTH = 1024;
  private static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
  private final HttpEngine httpEngine;
  private OutputStream requestOut;
  private final InputStream socketIn;
  private final OutputStream socketOut;
  
  public HttpTransport(HttpEngine paramHttpEngine, OutputStream paramOutputStream, InputStream paramInputStream)
  {
    this.httpEngine = paramHttpEngine;
    this.socketOut = paramOutputStream;
    this.requestOut = paramOutputStream;
    this.socketIn = paramInputStream;
  }
  
  private static boolean discardStream(HttpEngine paramHttpEngine, InputStream paramInputStream)
  {
    paramHttpEngine = paramHttpEngine.connection;
    if (paramHttpEngine == null) {}
    do
    {
      return false;
      paramHttpEngine = paramHttpEngine.getSocket();
    } while (paramHttpEngine == null);
    try
    {
      int i = paramHttpEngine.getSoTimeout();
      paramHttpEngine.setSoTimeout(100);
      try
      {
        Util.skipAll(paramInputStream);
        return true;
      }
      finally
      {
        paramHttpEngine.setSoTimeout(i);
      }
      return false;
    }
    catch (IOException paramHttpEngine) {}
  }
  
  public OutputStream createRequestBody()
  {
    boolean bool2 = this.httpEngine.requestHeaders.isChunked();
    boolean bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (this.httpEngine.policy.getChunkLength() > 0)
      {
        bool1 = bool2;
        if (this.httpEngine.connection.getHttpMinorVersion() != 0)
        {
          this.httpEngine.requestHeaders.setChunked();
          bool1 = true;
        }
      }
    }
    if (bool1)
    {
      int j = this.httpEngine.policy.getChunkLength();
      int i = j;
      if (j == -1) {
        i = 1024;
      }
      writeRequestHeaders();
      return new HttpTransport.ChunkedOutputStream(this.requestOut, i, null);
    }
    long l = this.httpEngine.policy.getFixedContentLength();
    if (l != -1L)
    {
      this.httpEngine.requestHeaders.setContentLength(l);
      writeRequestHeaders();
      return new HttpTransport.FixedLengthOutputStream(this.requestOut, l, null);
    }
    l = this.httpEngine.requestHeaders.getContentLength();
    if (l > 2147483647L) {
      throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
    }
    if (l != -1L)
    {
      writeRequestHeaders();
      return new RetryableOutputStream((int)l);
    }
    return new RetryableOutputStream();
  }
  
  public void flushRequest()
  {
    this.requestOut.flush();
    this.requestOut = this.socketOut;
  }
  
  public InputStream getTransferStream(CacheRequest paramCacheRequest)
  {
    if (!this.httpEngine.hasResponseBody()) {
      return new HttpTransport.FixedLengthInputStream(this.socketIn, paramCacheRequest, this.httpEngine, 0L);
    }
    if (this.httpEngine.responseHeaders.isChunked()) {
      return new HttpTransport.ChunkedInputStream(this.socketIn, paramCacheRequest, this);
    }
    if (this.httpEngine.responseHeaders.getContentLength() != -1L) {
      return new HttpTransport.FixedLengthInputStream(this.socketIn, paramCacheRequest, this.httpEngine, this.httpEngine.responseHeaders.getContentLength());
    }
    return new UnknownLengthHttpInputStream(this.socketIn, paramCacheRequest, this.httpEngine);
  }
  
  public boolean makeReusable(boolean paramBoolean, OutputStream paramOutputStream, InputStream paramInputStream)
  {
    if (paramBoolean) {}
    while (((paramOutputStream != null) && (!((AbstractOutputStream)paramOutputStream).isClosed())) || (this.httpEngine.requestHeaders.hasConnectionClose()) || ((this.httpEngine.responseHeaders != null) && (this.httpEngine.responseHeaders.hasConnectionClose())) || ((paramInputStream instanceof UnknownLengthHttpInputStream))) {
      return false;
    }
    if (paramInputStream != null) {
      return discardStream(this.httpEngine, paramInputStream);
    }
    return true;
  }
  
  public ResponseHeaders readResponseHeaders()
  {
    Object localObject = RawHeaders.fromBytes(this.socketIn);
    this.httpEngine.connection.setHttpMinorVersion(((RawHeaders)localObject).getHttpMinorVersion());
    this.httpEngine.receiveHeaders((RawHeaders)localObject);
    localObject = new ResponseHeaders(this.httpEngine.uri, (RawHeaders)localObject);
    ((ResponseHeaders)localObject).setTransport("http/1.1");
    return (ResponseHeaders)localObject;
  }
  
  public void writeRequestBody(RetryableOutputStream paramRetryableOutputStream)
  {
    paramRetryableOutputStream.writeToSocket(this.requestOut);
  }
  
  public void writeRequestHeaders()
  {
    this.httpEngine.writingRequestHeaders();
    byte[] arrayOfByte = this.httpEngine.requestHeaders.getHeaders().toBytes();
    this.requestOut.write(arrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpTransport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */