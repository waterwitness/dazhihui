package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;

abstract class AbstractHttpInputStream
  extends InputStream
{
  private final OutputStream cacheBody;
  private final CacheRequest cacheRequest;
  protected boolean closed;
  protected final HttpEngine httpEngine;
  protected final InputStream in;
  
  AbstractHttpInputStream(InputStream paramInputStream, HttpEngine paramHttpEngine, CacheRequest paramCacheRequest)
  {
    this.in = paramInputStream;
    this.httpEngine = paramHttpEngine;
    if (paramCacheRequest != null) {}
    for (paramInputStream = paramCacheRequest.getBody();; paramInputStream = null)
    {
      if (paramInputStream == null) {
        paramCacheRequest = null;
      }
      this.cacheBody = paramInputStream;
      this.cacheRequest = paramCacheRequest;
      return;
    }
  }
  
  protected final void cacheWrite(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.cacheBody != null) {
      this.cacheBody.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  protected final void checkNotClosed()
  {
    if (this.closed) {
      throw new IOException("stream closed");
    }
  }
  
  protected final void endOfInput()
  {
    if (this.cacheRequest != null) {
      this.cacheBody.close();
    }
    this.httpEngine.release(false);
  }
  
  public final int read()
  {
    return Util.readSingleByte(this);
  }
  
  protected final void unexpectedEndOfInput()
  {
    if (this.cacheRequest != null) {
      this.cacheRequest.abort();
    }
    this.httpEngine.release(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\AbstractHttpInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */