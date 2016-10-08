package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkResponseCache;
import com.squareup.okhttp.ResponseSource;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.ResponseCache;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public final class OkResponseCacheAdapter
  implements OkResponseCache
{
  private final ResponseCache responseCache;
  
  public OkResponseCacheAdapter(ResponseCache paramResponseCache)
  {
    this.responseCache = paramResponseCache;
  }
  
  public CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
  {
    return this.responseCache.get(paramURI, paramString, paramMap);
  }
  
  public void maybeRemove(String paramString, URI paramURI) {}
  
  public CacheRequest put(URI paramURI, URLConnection paramURLConnection)
  {
    return this.responseCache.put(paramURI, paramURLConnection);
  }
  
  public void trackConditionalCacheHit() {}
  
  public void trackResponse(ResponseSource paramResponseSource) {}
  
  public void update(CacheResponse paramCacheResponse, HttpURLConnection paramHttpURLConnection) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\OkResponseCacheAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */