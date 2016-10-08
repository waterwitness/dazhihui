package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.DiskLruCache.Editor;
import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.RequestHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.ResponseCache;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public final class HttpResponseCache
  extends ResponseCache
{
  private static final int ENTRY_BODY = 1;
  private static final int ENTRY_COUNT = 2;
  private static final int ENTRY_METADATA = 0;
  private static final int VERSION = 201105;
  private final DiskLruCache cache;
  private int hitCount;
  private int networkCount;
  final OkResponseCache okResponseCache = new HttpResponseCache.1(this);
  private int requestCount;
  private int writeAbortCount;
  private int writeSuccessCount;
  
  public HttpResponseCache(File paramFile, long paramLong)
  {
    this.cache = DiskLruCache.open(paramFile, 201105, 2, paramLong);
  }
  
  private void abortQuietly(DiskLruCache.Editor paramEditor)
  {
    if (paramEditor != null) {}
    try
    {
      paramEditor.abort();
      return;
    }
    catch (IOException paramEditor) {}
  }
  
  private HttpEngine getHttpEngine(URLConnection paramURLConnection)
  {
    if ((paramURLConnection instanceof HttpURLConnectionImpl)) {
      return ((HttpURLConnectionImpl)paramURLConnection).getHttpEngine();
    }
    if ((paramURLConnection instanceof HttpsURLConnectionImpl)) {
      return ((HttpsURLConnectionImpl)paramURLConnection).getHttpEngine();
    }
    return null;
  }
  
  private boolean maybeRemove(String paramString, URI paramURI)
  {
    if ((paramString.equals("POST")) || (paramString.equals("PUT")) || (paramString.equals("DELETE"))) {}
    try
    {
      this.cache.remove(uriToKey(paramURI));
      return true;
      return false;
    }
    catch (IOException paramString)
    {
      for (;;) {}
    }
  }
  
  private static InputStream newBodyInputStream(DiskLruCache.Snapshot paramSnapshot)
  {
    return new HttpResponseCache.2(paramSnapshot.getInputStream(1), paramSnapshot);
  }
  
  private void trackConditionalCacheHit()
  {
    try
    {
      this.hitCount += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void trackResponse(ResponseSource paramResponseSource)
  {
    for (;;)
    {
      try
      {
        this.requestCount += 1;
        int i = $SWITCH_TABLE$com$squareup$okhttp$ResponseSource()[paramResponseSource.ordinal()];
        switch (i)
        {
        default: 
          return;
        }
      }
      finally {}
      this.hitCount += 1;
      continue;
      this.networkCount += 1;
    }
  }
  
  private void update(CacheResponse paramCacheResponse, HttpURLConnection paramHttpURLConnection)
  {
    HttpEngine localHttpEngine = getHttpEngine(paramHttpURLConnection);
    URI localURI = localHttpEngine.getUri();
    ResponseHeaders localResponseHeaders = localHttpEngine.getResponseHeaders();
    paramHttpURLConnection = new HttpResponseCache.Entry(localURI, localHttpEngine.getRequestHeaders().getHeaders().getAll(localResponseHeaders.getVaryFields()), paramHttpURLConnection);
    if ((paramCacheResponse instanceof HttpResponseCache.EntryCacheResponse)) {}
    for (paramCacheResponse = HttpResponseCache.EntryCacheResponse.access$0((HttpResponseCache.EntryCacheResponse)paramCacheResponse);; paramCacheResponse = HttpResponseCache.EntrySecureCacheResponse.access$0((HttpResponseCache.EntrySecureCacheResponse)paramCacheResponse))
    {
      try
      {
        paramCacheResponse = paramCacheResponse.edit();
        if (paramCacheResponse == null) {}
      }
      catch (IOException paramCacheResponse)
      {
        paramCacheResponse = null;
      }
      try
      {
        paramHttpURLConnection.writeTo(paramCacheResponse);
        paramCacheResponse.commit();
        return;
      }
      catch (IOException paramHttpURLConnection)
      {
        for (;;) {}
      }
    }
    abortQuietly(paramCacheResponse);
  }
  
  private String uriToKey(URI paramURI)
  {
    return Util.hash(paramURI.toString());
  }
  
  public void close()
  {
    this.cache.close();
  }
  
  public void delete()
  {
    this.cache.delete();
  }
  
  public void flush()
  {
    this.cache.flush();
  }
  
  public CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
  {
    Object localObject = uriToKey(paramURI);
    try
    {
      localObject = this.cache.get((String)localObject);
      if (localObject == null) {
        return null;
      }
      HttpResponseCache.Entry localEntry = new HttpResponseCache.Entry(((DiskLruCache.Snapshot)localObject).getInputStream(0));
      if (!localEntry.matches(paramURI, paramString, paramMap))
      {
        ((DiskLruCache.Snapshot)localObject).close();
        return null;
      }
      if (HttpResponseCache.Entry.access$4(localEntry)) {
        return new HttpResponseCache.EntrySecureCacheResponse(localEntry, (DiskLruCache.Snapshot)localObject);
      }
      return new HttpResponseCache.EntryCacheResponse(localEntry, (DiskLruCache.Snapshot)localObject);
    }
    catch (IOException paramURI) {}
    return null;
  }
  
  public File getDirectory()
  {
    return this.cache.getDirectory();
  }
  
  public int getHitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getMaxSize()
  {
    return this.cache.getMaxSize();
  }
  
  public int getNetworkCount()
  {
    try
    {
      int i = this.networkCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getRequestCount()
  {
    try
    {
      int i = this.requestCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getSize()
  {
    return this.cache.size();
  }
  
  public int getWriteAbortCount()
  {
    try
    {
      int i = this.writeAbortCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getWriteSuccessCount()
  {
    try
    {
      int i = this.writeSuccessCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isClosed()
  {
    return this.cache.isClosed();
  }
  
  /* Error */
  public java.net.CacheRequest put(URI paramURI, URLConnection paramURLConnection)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 294
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_2
    //   10: checkcast 294	java/net/HttpURLConnection
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 297	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   18: astore_3
    //   19: aload_0
    //   20: aload_3
    //   21: aload_1
    //   22: invokespecial 85	com/squareup/okhttp/HttpResponseCache:maybeRemove	(Ljava/lang/String;Ljava/net/URI;)Z
    //   25: ifne -18 -> 7
    //   28: aload_3
    //   29: ldc_w 299
    //   32: invokevirtual 134	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: ifeq -28 -> 7
    //   38: aload_0
    //   39: aload_2
    //   40: invokespecial 167	com/squareup/okhttp/HttpResponseCache:getHttpEngine	(Ljava/net/URLConnection;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull -38 -> 7
    //   48: aload_3
    //   49: invokevirtual 177	com/squareup/okhttp/internal/http/HttpEngine:getResponseHeaders	()Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    //   52: astore 4
    //   54: aload 4
    //   56: invokevirtual 302	com/squareup/okhttp/internal/http/ResponseHeaders:hasVaryAll	()Z
    //   59: ifne -52 -> 7
    //   62: new 179	com/squareup/okhttp/HttpResponseCache$Entry
    //   65: dup
    //   66: aload_1
    //   67: aload_3
    //   68: invokevirtual 183	com/squareup/okhttp/internal/http/HttpEngine:getRequestHeaders	()Lcom/squareup/okhttp/internal/http/RequestHeaders;
    //   71: invokevirtual 189	com/squareup/okhttp/internal/http/RequestHeaders:getHeaders	()Lcom/squareup/okhttp/internal/http/RawHeaders;
    //   74: aload 4
    //   76: invokevirtual 195	com/squareup/okhttp/internal/http/ResponseHeaders:getVaryFields	()Ljava/util/Set;
    //   79: invokevirtual 201	com/squareup/okhttp/internal/http/RawHeaders:getAll	(Ljava/util/Set;)Lcom/squareup/okhttp/internal/http/RawHeaders;
    //   82: aload_2
    //   83: invokespecial 204	com/squareup/okhttp/HttpResponseCache$Entry:<init>	(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/HttpURLConnection;)V
    //   86: astore_2
    //   87: aload_0
    //   88: getfield 70	com/squareup/okhttp/HttpResponseCache:cache	Lcom/squareup/okhttp/internal/DiskLruCache;
    //   91: aload_0
    //   92: aload_1
    //   93: invokespecial 142	com/squareup/okhttp/HttpResponseCache:uriToKey	(Ljava/net/URI;)Ljava/lang/String;
    //   96: invokevirtual 305	com/squareup/okhttp/internal/DiskLruCache:edit	(Ljava/lang/String;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    //   99: astore_1
    //   100: aload_1
    //   101: ifnull -94 -> 7
    //   104: aload_2
    //   105: aload_1
    //   106: invokevirtual 216	com/squareup/okhttp/HttpResponseCache$Entry:writeTo	(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    //   109: new 307	com/squareup/okhttp/HttpResponseCache$CacheRequestImpl
    //   112: dup
    //   113: aload_0
    //   114: aload_1
    //   115: invokespecial 310	com/squareup/okhttp/HttpResponseCache$CacheRequestImpl:<init>	(Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    //   118: astore_2
    //   119: aload_2
    //   120: areturn
    //   121: astore_1
    //   122: aconst_null
    //   123: astore_1
    //   124: aload_0
    //   125: aload_1
    //   126: invokespecial 226	com/squareup/okhttp/HttpResponseCache:abortQuietly	(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    //   129: aconst_null
    //   130: areturn
    //   131: astore_2
    //   132: goto -8 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	HttpResponseCache
    //   0	135	1	paramURI	URI
    //   0	135	2	paramURLConnection	URLConnection
    //   18	50	3	localObject	Object
    //   52	23	4	localResponseHeaders	ResponseHeaders
    // Exception table:
    //   from	to	target	type
    //   87	100	121	java/io/IOException
    //   104	119	131	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\HttpResponseCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */