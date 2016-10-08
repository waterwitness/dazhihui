package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Editor;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.OutputStream;
import java.net.CacheRequest;

final class HttpResponseCache$CacheRequestImpl
  extends CacheRequest
{
  private OutputStream body;
  private OutputStream cacheOut;
  private boolean done;
  private final DiskLruCache.Editor editor;
  
  public HttpResponseCache$CacheRequestImpl(HttpResponseCache paramHttpResponseCache, DiskLruCache.Editor paramEditor)
  {
    this.editor = paramEditor;
    this.cacheOut = paramEditor.newOutputStream(1);
    this.body = new HttpResponseCache.CacheRequestImpl.1(this, this.cacheOut, paramEditor);
  }
  
  public void abort()
  {
    synchronized (this.this$0)
    {
      if (this.done) {
        return;
      }
      this.done = true;
      HttpResponseCache localHttpResponseCache2 = this.this$0;
      HttpResponseCache.access$7(localHttpResponseCache2, HttpResponseCache.access$6(localHttpResponseCache2) + 1);
      Util.closeQuietly(this.cacheOut);
      try
      {
        this.editor.abort();
        return;
      }
      catch (IOException localIOException) {}
    }
  }
  
  public OutputStream getBody()
  {
    return this.body;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache$CacheRequestImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */