package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import java.io.FilterInputStream;
import java.io.InputStream;

class HttpResponseCache$2
  extends FilterInputStream
{
  HttpResponseCache$2(InputStream paramInputStream, DiskLruCache.Snapshot paramSnapshot)
  {
    super(paramInputStream);
  }
  
  public void close()
  {
    this.val$snapshot.close();
    super.close();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */