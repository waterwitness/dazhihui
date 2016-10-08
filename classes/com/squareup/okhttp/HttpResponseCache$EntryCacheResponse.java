package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import com.squareup.okhttp.internal.http.RawHeaders;
import java.io.InputStream;
import java.net.CacheResponse;
import java.util.List;
import java.util.Map;

class HttpResponseCache$EntryCacheResponse
  extends CacheResponse
{
  private final HttpResponseCache.Entry entry;
  private final InputStream in;
  private final DiskLruCache.Snapshot snapshot;
  
  public HttpResponseCache$EntryCacheResponse(HttpResponseCache.Entry paramEntry, DiskLruCache.Snapshot paramSnapshot)
  {
    this.entry = paramEntry;
    this.snapshot = paramSnapshot;
    this.in = HttpResponseCache.access$8(paramSnapshot);
  }
  
  public InputStream getBody()
  {
    return this.in;
  }
  
  public Map<String, List<String>> getHeaders()
  {
    return HttpResponseCache.Entry.access$0(this.entry).toMultimap(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache$EntryCacheResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */