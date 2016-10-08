package com.squareup.okhttp.internal.http;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;

abstract interface Transport
{
  public abstract OutputStream createRequestBody();
  
  public abstract void flushRequest();
  
  public abstract InputStream getTransferStream(CacheRequest paramCacheRequest);
  
  public abstract boolean makeReusable(boolean paramBoolean, OutputStream paramOutputStream, InputStream paramInputStream);
  
  public abstract ResponseHeaders readResponseHeaders();
  
  public abstract void writeRequestBody(RetryableOutputStream paramRetryableOutputStream);
  
  public abstract void writeRequestHeaders();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Transport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */