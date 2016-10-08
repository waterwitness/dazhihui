package com.squareup.okhttp;

import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public abstract interface OkResponseCache
{
  public abstract CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap);
  
  public abstract void maybeRemove(String paramString, URI paramURI);
  
  public abstract CacheRequest put(URI paramURI, URLConnection paramURLConnection);
  
  public abstract void trackConditionalCacheHit();
  
  public abstract void trackResponse(ResponseSource paramResponseSource);
  
  public abstract void update(CacheResponse paramCacheResponse, HttpURLConnection paramHttpURLConnection);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\OkResponseCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */