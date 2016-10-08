package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public final class ResponseHeaders
{
  private static final String RECEIVED_MILLIS = Platform.get().getPrefix() + "-Received-Millis";
  static final String RESPONSE_SOURCE = Platform.get().getPrefix() + "-Response-Source";
  static final String SELECTED_TRANSPORT = Platform.get().getPrefix() + "-Selected-Transport";
  private static final String SENT_MILLIS = Platform.get().getPrefix() + "-Sent-Millis";
  private int ageSeconds = -1;
  private String connection;
  private String contentEncoding;
  private long contentLength = -1L;
  private String contentType;
  private String etag;
  private Date expires;
  private final RawHeaders headers;
  private boolean isPublic;
  private Date lastModified;
  private int maxAgeSeconds = -1;
  private boolean mustRevalidate;
  private boolean noCache;
  private boolean noStore;
  private long receivedResponseMillis;
  private int sMaxAgeSeconds = -1;
  private long sentRequestMillis;
  private Date servedDate;
  private String transferEncoding;
  private final URI uri;
  private Set<String> varyFields = Collections.emptySet();
  
  public ResponseHeaders(URI paramURI, RawHeaders paramRawHeaders)
  {
    this.uri = paramURI;
    this.headers = paramRawHeaders;
    paramURI = new ResponseHeaders.1(this);
    int i = 0;
    if (i >= paramRawHeaders.length()) {
      return;
    }
    Object localObject = paramRawHeaders.getFieldName(i);
    String str = paramRawHeaders.getValue(i);
    if ("Cache-Control".equalsIgnoreCase((String)localObject)) {
      HeaderParser.parseCacheControl(str, paramURI);
    }
    for (;;)
    {
      i += 1;
      break;
      if ("Date".equalsIgnoreCase((String)localObject))
      {
        this.servedDate = HttpDate.parse(str);
      }
      else if ("Expires".equalsIgnoreCase((String)localObject))
      {
        this.expires = HttpDate.parse(str);
      }
      else if ("Last-Modified".equalsIgnoreCase((String)localObject))
      {
        this.lastModified = HttpDate.parse(str);
      }
      else if ("ETag".equalsIgnoreCase((String)localObject))
      {
        this.etag = str;
      }
      else if ("Pragma".equalsIgnoreCase((String)localObject))
      {
        if ("no-cache".equalsIgnoreCase(str)) {
          this.noCache = true;
        }
      }
      else if ("Age".equalsIgnoreCase((String)localObject))
      {
        this.ageSeconds = HeaderParser.parseSeconds(str);
      }
      else if ("Vary".equalsIgnoreCase((String)localObject))
      {
        if (this.varyFields.isEmpty()) {
          this.varyFields = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        }
        localObject = str.split(",");
        int k = localObject.length;
        int j = 0;
        while (j < k)
        {
          str = localObject[j];
          this.varyFields.add(str.trim());
          j += 1;
        }
      }
      else if ("Content-Encoding".equalsIgnoreCase((String)localObject))
      {
        this.contentEncoding = str;
      }
      else if ("Transfer-Encoding".equalsIgnoreCase((String)localObject))
      {
        this.transferEncoding = str;
      }
      else if ("Content-Length".equalsIgnoreCase((String)localObject))
      {
        try
        {
          this.contentLength = Long.parseLong(str);
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
      else if ("Content-Type".equalsIgnoreCase(localNumberFormatException))
      {
        this.contentType = str;
      }
      else if ("Connection".equalsIgnoreCase(localNumberFormatException))
      {
        this.connection = str;
      }
      else if (SENT_MILLIS.equalsIgnoreCase(localNumberFormatException))
      {
        this.sentRequestMillis = Long.parseLong(str);
      }
      else if (RECEIVED_MILLIS.equalsIgnoreCase(localNumberFormatException))
      {
        this.receivedResponseMillis = Long.parseLong(str);
      }
    }
  }
  
  private long computeAge(long paramLong)
  {
    long l1 = 0L;
    if (this.servedDate != null) {
      l1 = Math.max(0L, this.receivedResponseMillis - this.servedDate.getTime());
    }
    long l2 = l1;
    if (this.ageSeconds != -1) {
      l2 = Math.max(l1, TimeUnit.SECONDS.toMillis(this.ageSeconds));
    }
    return l2 + (this.receivedResponseMillis - this.sentRequestMillis) + (paramLong - this.receivedResponseMillis);
  }
  
  private long computeFreshnessLifetime()
  {
    long l2 = 0L;
    if (this.maxAgeSeconds != -1) {
      l1 = TimeUnit.SECONDS.toMillis(this.maxAgeSeconds);
    }
    label72:
    do
    {
      do
      {
        return l1;
        if (this.expires != null)
        {
          if (this.servedDate != null)
          {
            l1 = this.servedDate.getTime();
            l1 = this.expires.getTime() - l1;
            if (l1 <= 0L) {
              break label72;
            }
          }
          for (;;)
          {
            return l1;
            l1 = this.receivedResponseMillis;
            break;
            l1 = 0L;
          }
        }
        l1 = l2;
      } while (this.lastModified == null);
      l1 = l2;
    } while (this.uri.getRawQuery() != null);
    if (this.servedDate != null) {}
    for (long l1 = this.servedDate.getTime();; l1 = this.sentRequestMillis)
    {
      long l3 = l1 - this.lastModified.getTime();
      l1 = l2;
      if (l3 <= 0L) {
        break;
      }
      return l3 / 10L;
    }
  }
  
  private static boolean isEndToEnd(String paramString)
  {
    return (!"Connection".equalsIgnoreCase(paramString)) && (!"Keep-Alive".equalsIgnoreCase(paramString)) && (!"Proxy-Authenticate".equalsIgnoreCase(paramString)) && (!"Proxy-Authorization".equalsIgnoreCase(paramString)) && (!"TE".equalsIgnoreCase(paramString)) && (!"Trailers".equalsIgnoreCase(paramString)) && (!"Transfer-Encoding".equalsIgnoreCase(paramString)) && (!"Upgrade".equalsIgnoreCase(paramString));
  }
  
  private boolean isFreshnessLifetimeHeuristic()
  {
    return (this.maxAgeSeconds == -1) && (this.expires == null);
  }
  
  public ResponseSource chooseResponseSource(long paramLong, RequestHeaders paramRequestHeaders)
  {
    long l3 = 0L;
    if (!isCacheable(paramRequestHeaders)) {
      return ResponseSource.NETWORK;
    }
    if ((paramRequestHeaders.isNoCache()) || (paramRequestHeaders.hasConditions())) {
      return ResponseSource.NETWORK;
    }
    long l4 = computeAge(paramLong);
    long l1 = computeFreshnessLifetime();
    paramLong = l1;
    if (paramRequestHeaders.getMaxAgeSeconds() != -1) {
      paramLong = Math.min(l1, TimeUnit.SECONDS.toMillis(paramRequestHeaders.getMaxAgeSeconds()));
    }
    if (paramRequestHeaders.getMinFreshSeconds() != -1) {}
    for (l1 = TimeUnit.SECONDS.toMillis(paramRequestHeaders.getMinFreshSeconds());; l1 = 0L)
    {
      long l2 = l3;
      if (!this.mustRevalidate)
      {
        l2 = l3;
        if (paramRequestHeaders.getMaxStaleSeconds() != -1) {
          l2 = TimeUnit.SECONDS.toMillis(paramRequestHeaders.getMaxStaleSeconds());
        }
      }
      if ((!this.noCache) && (l4 + l1 < l2 + paramLong))
      {
        if (l1 + l4 >= paramLong) {
          this.headers.add("Warning", "110 HttpURLConnection \"Response is stale\"");
        }
        if ((l4 > 86400000L) && (isFreshnessLifetimeHeuristic())) {
          this.headers.add("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
        }
        return ResponseSource.CACHE;
      }
      if (this.lastModified != null) {
        paramRequestHeaders.setIfModifiedSince(this.lastModified);
      }
      for (;;)
      {
        if (this.etag != null) {
          paramRequestHeaders.setIfNoneMatch(this.etag);
        }
        if (!paramRequestHeaders.hasConditions()) {
          break;
        }
        return ResponseSource.CONDITIONAL_CACHE;
        if (this.servedDate != null) {
          paramRequestHeaders.setIfModifiedSince(this.servedDate);
        }
      }
      return ResponseSource.NETWORK;
    }
  }
  
  public ResponseHeaders combine(ResponseHeaders paramResponseHeaders)
  {
    int j = 0;
    RawHeaders localRawHeaders = new RawHeaders();
    localRawHeaders.setStatusLine(this.headers.getStatusLine());
    int i = 0;
    if (i >= this.headers.length()) {
      i = j;
    }
    for (;;)
    {
      if (i >= paramResponseHeaders.headers.length())
      {
        return new ResponseHeaders(this.uri, localRawHeaders);
        str1 = this.headers.getFieldName(i);
        String str2 = this.headers.getValue(i);
        if (("Warning".equals(str1)) && (str2.startsWith("1"))) {}
        for (;;)
        {
          i += 1;
          break;
          if ((!isEndToEnd(str1)) || (paramResponseHeaders.headers.get(str1) == null)) {
            localRawHeaders.add(str1, str2);
          }
        }
      }
      String str1 = paramResponseHeaders.headers.getFieldName(i);
      if (isEndToEnd(str1)) {
        localRawHeaders.add(str1, paramResponseHeaders.headers.getValue(i));
      }
      i += 1;
    }
  }
  
  public String getConnection()
  {
    return this.connection;
  }
  
  public String getContentEncoding()
  {
    return this.contentEncoding;
  }
  
  public long getContentLength()
  {
    return this.contentLength;
  }
  
  public String getContentType()
  {
    return this.contentType;
  }
  
  public String getEtag()
  {
    return this.etag;
  }
  
  public Date getExpires()
  {
    return this.expires;
  }
  
  public RawHeaders getHeaders()
  {
    return this.headers;
  }
  
  public Date getLastModified()
  {
    return this.lastModified;
  }
  
  public int getMaxAgeSeconds()
  {
    return this.maxAgeSeconds;
  }
  
  public int getSMaxAgeSeconds()
  {
    return this.sMaxAgeSeconds;
  }
  
  public Date getServedDate()
  {
    return this.servedDate;
  }
  
  public URI getUri()
  {
    return this.uri;
  }
  
  public Set<String> getVaryFields()
  {
    return this.varyFields;
  }
  
  public boolean hasConnectionClose()
  {
    return "close".equalsIgnoreCase(this.connection);
  }
  
  public boolean hasVaryAll()
  {
    return this.varyFields.contains("*");
  }
  
  public boolean isCacheable(RequestHeaders paramRequestHeaders)
  {
    int i = this.headers.getResponseCode();
    if ((i != 200) && (i != 203) && (i != 300) && (i != 301) && (i != 410)) {}
    while (((paramRequestHeaders.hasAuthorization()) && (!this.isPublic) && (!this.mustRevalidate) && (this.sMaxAgeSeconds == -1)) || (this.noStore)) {
      return false;
    }
    return true;
  }
  
  public boolean isChunked()
  {
    return "chunked".equalsIgnoreCase(this.transferEncoding);
  }
  
  public boolean isContentEncodingGzip()
  {
    return "gzip".equalsIgnoreCase(this.contentEncoding);
  }
  
  public boolean isMustRevalidate()
  {
    return this.mustRevalidate;
  }
  
  public boolean isNoCache()
  {
    return this.noCache;
  }
  
  public boolean isNoStore()
  {
    return this.noStore;
  }
  
  public boolean isPublic()
  {
    return this.isPublic;
  }
  
  public void setLocalTimestamps(long paramLong1, long paramLong2)
  {
    this.sentRequestMillis = paramLong1;
    this.headers.add(SENT_MILLIS, Long.toString(paramLong1));
    this.receivedResponseMillis = paramLong2;
    this.headers.add(RECEIVED_MILLIS, Long.toString(paramLong2));
  }
  
  public void setResponseSource(ResponseSource paramResponseSource)
  {
    this.headers.set(RESPONSE_SOURCE, paramResponseSource.toString() + " " + this.headers.getResponseCode());
  }
  
  public void setTransport(String paramString)
  {
    this.headers.set(SELECTED_TRANSPORT, paramString);
  }
  
  public void stripContentEncoding()
  {
    this.contentEncoding = null;
    this.headers.removeAll("Content-Encoding");
  }
  
  public void stripContentLength()
  {
    this.contentLength = -1L;
    this.headers.removeAll("Content-Length");
  }
  
  public boolean validate(ResponseHeaders paramResponseHeaders)
  {
    if (paramResponseHeaders.headers.getResponseCode() == 304) {}
    while ((this.lastModified != null) && (paramResponseHeaders.lastModified != null) && (paramResponseHeaders.lastModified.getTime() < this.lastModified.getTime())) {
      return true;
    }
    return false;
  }
  
  public boolean varyMatches(Map<String, List<String>> paramMap1, Map<String, List<String>> paramMap2)
  {
    Iterator localIterator = this.varyFields.iterator();
    String str;
    do
    {
      if (!localIterator.hasNext()) {
        return true;
      }
      str = (String)localIterator.next();
    } while (Util.equal(paramMap1.get(str), paramMap2.get(str)));
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\ResponseHeaders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */