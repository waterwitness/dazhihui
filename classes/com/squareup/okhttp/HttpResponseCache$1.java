package com.squareup.okhttp;

import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

class HttpResponseCache$1
  implements OkResponseCache
{
  HttpResponseCache$1(HttpResponseCache paramHttpResponseCache) {}
  
  public CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
  {
    return this.this$0.get(paramURI, paramString, paramMap);
  }
  
  public void maybeRemove(String paramString, URI paramURI)
  {
    HttpResponseCache.access$0(this.this$0, paramString, paramURI);
  }
  
  public CacheRequest put(URI paramURI, URLConnection paramURLConnection)
  {
    return this.this$0.put(paramURI, paramURLConnection);
  }
  
  public void trackConditionalCacheHit()
  {
    HttpResponseCache.access$2(this.this$0);
  }
  
  public void trackResponse(ResponseSource paramResponseSource)
  {
    HttpResponseCache.access$3(this.this$0, paramResponseSource);
  }
  
  public void update(CacheResponse paramCacheResponse, HttpURLConnection paramHttpURLConnection)
  {
    HttpResponseCache.access$1(this.this$0, paramCacheResponse, paramHttpURLConnection);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */