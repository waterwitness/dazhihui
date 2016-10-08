package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkResponseCache;
import com.squareup.okhttp.ResponseSource;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.RouteDatabase;
import com.squareup.okhttp.TunnelRequest;
import com.squareup.okhttp.internal.Dns;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class HttpEngine
{
  private static final CacheResponse GATEWAY_TIMEOUT_RESPONSE = new HttpEngine.1();
  public static final int HTTP_CONTINUE = 100;
  private boolean automaticallyReleaseConnectionToPool;
  private CacheRequest cacheRequest;
  private CacheResponse cacheResponse;
  private InputStream cachedResponseBody;
  private ResponseHeaders cachedResponseHeaders;
  protected final OkHttpClient client;
  boolean connected;
  protected Connection connection;
  private boolean connectionReleased;
  protected final String method;
  protected final Policy policy;
  private OutputStream requestBodyOut;
  final RequestHeaders requestHeaders;
  private InputStream responseBodyIn;
  ResponseHeaders responseHeaders;
  private ResponseSource responseSource;
  private InputStream responseTransferIn;
  protected RouteSelector routeSelector;
  long sentRequestMillis = -1L;
  private boolean transparentGzip;
  private Transport transport;
  final URI uri;
  
  public HttpEngine(OkHttpClient paramOkHttpClient, Policy paramPolicy, String paramString, RawHeaders paramRawHeaders, Connection paramConnection, RetryableOutputStream paramRetryableOutputStream)
  {
    this.client = paramOkHttpClient;
    this.policy = paramPolicy;
    this.method = paramString;
    this.connection = paramConnection;
    this.requestBodyOut = paramRetryableOutputStream;
    try
    {
      this.uri = Platform.get().toUriLenient(paramPolicy.getURL());
      this.requestHeaders = new RequestHeaders(this.uri, new RawHeaders(paramRawHeaders));
      return;
    }
    catch (URISyntaxException paramOkHttpClient)
    {
      throw new IOException(paramOkHttpClient.getMessage());
    }
  }
  
  public static String getDefaultUserAgent()
  {
    String str = System.getProperty("http.agent");
    if (str != null) {
      return str;
    }
    return "Java" + System.getProperty("java.version");
  }
  
  public static String getOriginAddress(URL paramURL)
  {
    int i = paramURL.getPort();
    String str2 = paramURL.getHost();
    String str1 = str2;
    if (i > 0)
    {
      str1 = str2;
      if (i != Util.getDefaultPort(paramURL.getProtocol())) {
        str1 = str2 + ":" + i;
      }
    }
    return str1;
  }
  
  private void initContentStream(InputStream paramInputStream)
  {
    this.responseTransferIn = paramInputStream;
    if ((this.transparentGzip) && (this.responseHeaders.isContentEncodingGzip()))
    {
      this.responseHeaders.stripContentEncoding();
      this.responseHeaders.stripContentLength();
      this.responseBodyIn = new GZIPInputStream(paramInputStream);
      return;
    }
    this.responseBodyIn = paramInputStream;
  }
  
  private void initResponseSource()
  {
    this.responseSource = ResponseSource.NETWORK;
    if (!this.policy.getUseCaches()) {}
    Object localObject1;
    do
    {
      do
      {
        return;
        localObject1 = this.client.getOkResponseCache();
      } while (localObject1 == null);
      localObject1 = ((OkResponseCache)localObject1).get(this.uri, this.method, this.requestHeaders.getHeaders().toMultimap(false));
    } while (localObject1 == null);
    Object localObject2 = ((CacheResponse)localObject1).getHeaders();
    this.cachedResponseBody = ((CacheResponse)localObject1).getBody();
    if ((!acceptCacheResponseType((CacheResponse)localObject1)) || (localObject2 == null) || (this.cachedResponseBody == null))
    {
      Util.closeQuietly(this.cachedResponseBody);
      return;
    }
    localObject2 = RawHeaders.fromMultimap((Map)localObject2, true);
    this.cachedResponseHeaders = new ResponseHeaders(this.uri, (RawHeaders)localObject2);
    long l = System.currentTimeMillis();
    this.responseSource = this.cachedResponseHeaders.chooseResponseSource(l, this.requestHeaders);
    if (this.responseSource == ResponseSource.CACHE)
    {
      this.cacheResponse = ((CacheResponse)localObject1);
      setResponse(this.cachedResponseHeaders, this.cachedResponseBody);
      return;
    }
    if (this.responseSource == ResponseSource.CONDITIONAL_CACHE)
    {
      this.cacheResponse = ((CacheResponse)localObject1);
      return;
    }
    if (this.responseSource == ResponseSource.NETWORK)
    {
      Util.closeQuietly(this.cachedResponseBody);
      return;
    }
    throw new AssertionError();
  }
  
  private void maybeCache()
  {
    if (!this.policy.getUseCaches()) {}
    OkResponseCache localOkResponseCache;
    do
    {
      return;
      localOkResponseCache = this.client.getOkResponseCache();
    } while (localOkResponseCache == null);
    HttpURLConnection localHttpURLConnection = this.policy.getHttpConnectionToCache();
    if (!this.responseHeaders.isCacheable(this.requestHeaders))
    {
      localOkResponseCache.maybeRemove(localHttpURLConnection.getRequestMethod(), this.uri);
      return;
    }
    this.cacheRequest = localOkResponseCache.put(this.uri, localHttpURLConnection);
  }
  
  private void prepareRawRequestHeaders()
  {
    this.requestHeaders.getHeaders().setRequestLine(getRequestLine());
    if (this.requestHeaders.getUserAgent() == null) {
      this.requestHeaders.setUserAgent(getDefaultUserAgent());
    }
    if (this.requestHeaders.getHost() == null) {
      this.requestHeaders.setHost(getOriginAddress(this.policy.getURL()));
    }
    if (((this.connection == null) || (this.connection.getHttpMinorVersion() != 0)) && (this.requestHeaders.getConnection() == null)) {
      this.requestHeaders.setConnection("Keep-Alive");
    }
    if (this.requestHeaders.getAcceptEncoding() == null)
    {
      this.transparentGzip = true;
      this.requestHeaders.setAcceptEncoding("gzip");
    }
    if ((hasRequestBody()) && (this.requestHeaders.getContentType() == null)) {
      this.requestHeaders.setContentType("application/x-www-form-urlencoded");
    }
    long l = this.policy.getIfModifiedSince();
    if (l != 0L) {
      this.requestHeaders.setIfModifiedSince(new Date(l));
    }
    CookieHandler localCookieHandler = this.client.getCookieHandler();
    if (localCookieHandler != null) {
      this.requestHeaders.addCookies(localCookieHandler.get(this.uri, this.requestHeaders.getHeaders().toMultimap(false)));
    }
  }
  
  public static String requestPath(URL paramURL)
  {
    String str = paramURL.getFile();
    if (str == null) {
      paramURL = "/";
    }
    do
    {
      return paramURL;
      paramURL = str;
    } while (str.startsWith("/"));
    return "/" + str;
  }
  
  private String requestString()
  {
    URL localURL = this.policy.getURL();
    if (includeAuthorityInRequestLine()) {
      return localURL.toString();
    }
    return requestPath(localURL);
  }
  
  private void sendSocketRequest()
  {
    if (this.connection == null) {
      connect();
    }
    if (this.transport != null) {
      throw new IllegalStateException();
    }
    this.transport = ((Transport)this.connection.newTransport(this));
    if ((hasRequestBody()) && (this.requestBodyOut == null)) {
      this.requestBodyOut = this.transport.createRequestBody();
    }
  }
  
  private void setResponse(ResponseHeaders paramResponseHeaders, InputStream paramInputStream)
  {
    if (this.responseBodyIn != null) {
      throw new IllegalStateException();
    }
    this.responseHeaders = paramResponseHeaders;
    if (paramInputStream != null) {
      initContentStream(paramInputStream);
    }
  }
  
  protected boolean acceptCacheResponseType(CacheResponse paramCacheResponse)
  {
    return true;
  }
  
  public final void automaticallyReleaseConnectionToPool()
  {
    this.automaticallyReleaseConnectionToPool = true;
    if ((this.connection != null) && (this.connectionReleased))
    {
      this.client.getConnectionPool().recycle(this.connection);
      this.connection = null;
    }
  }
  
  protected final void connect()
  {
    HostnameVerifier localHostnameVerifier = null;
    if (this.connection != null) {
      return;
    }
    String str;
    SSLSocketFactory localSSLSocketFactory;
    if (this.routeSelector == null)
    {
      str = this.uri.getHost();
      if (str == null) {
        throw new UnknownHostException(this.uri.toString());
      }
      if (!this.uri.getScheme().equalsIgnoreCase("https")) {
        break label304;
      }
      localSSLSocketFactory = this.client.getSslSocketFactory();
      localHostnameVerifier = this.client.getHostnameVerifier();
    }
    for (;;)
    {
      this.routeSelector = new RouteSelector(new Address(str, Util.getEffectivePort(this.uri), localSSLSocketFactory, localHostnameVerifier, this.client.getAuthenticator(), this.client.getProxy(), this.client.getTransports()), this.uri, this.client.getProxySelector(), this.client.getConnectionPool(), Dns.DEFAULT, this.client.getRoutesDatabase());
      this.connection = this.routeSelector.next(this.method);
      if (!this.connection.isConnected())
      {
        this.connection.connect(this.client.getConnectTimeout(), this.client.getReadTimeout(), getTunnelConfig());
        this.client.getConnectionPool().maybeShare(this.connection);
        this.client.getRoutesDatabase().connected(this.connection.getRoute());
      }
      for (;;)
      {
        connected(this.connection);
        if (this.connection.getRoute().getProxy() == this.client.getProxy()) {
          break;
        }
        this.requestHeaders.getHeaders().setRequestLine(getRequestLine());
        return;
        if (!this.connection.isSpdy()) {
          this.connection.updateReadTimeout(this.client.getReadTimeout());
        }
      }
      label304:
      localSSLSocketFactory = null;
    }
  }
  
  protected void connected(Connection paramConnection)
  {
    this.policy.setSelectedProxy(paramConnection.getRoute().getProxy());
    this.connected = true;
  }
  
  public final CacheResponse getCacheResponse()
  {
    return this.cacheResponse;
  }
  
  public final Connection getConnection()
  {
    return this.connection;
  }
  
  public final OutputStream getRequestBody()
  {
    if (this.responseSource == null) {
      throw new IllegalStateException();
    }
    return this.requestBodyOut;
  }
  
  public final RequestHeaders getRequestHeaders()
  {
    return this.requestHeaders;
  }
  
  String getRequestLine()
  {
    if ((this.connection == null) || (this.connection.getHttpMinorVersion() != 0)) {}
    for (String str = "HTTP/1.1";; str = "HTTP/1.0") {
      return this.method + " " + requestString() + " " + str;
    }
  }
  
  public final InputStream getResponseBody()
  {
    if (this.responseHeaders == null) {
      throw new IllegalStateException();
    }
    return this.responseBodyIn;
  }
  
  public final int getResponseCode()
  {
    if (this.responseHeaders == null) {
      throw new IllegalStateException();
    }
    return this.responseHeaders.getHeaders().getResponseCode();
  }
  
  public final ResponseHeaders getResponseHeaders()
  {
    if (this.responseHeaders == null) {
      throw new IllegalStateException();
    }
    return this.responseHeaders;
  }
  
  protected TunnelRequest getTunnelConfig()
  {
    return null;
  }
  
  public URI getUri()
  {
    return this.uri;
  }
  
  boolean hasRequestBody()
  {
    return (this.method.equals("POST")) || (this.method.equals("PUT")) || (this.method.equals("PATCH"));
  }
  
  public final boolean hasResponse()
  {
    return this.responseHeaders != null;
  }
  
  public final boolean hasResponseBody()
  {
    int i = this.responseHeaders.getHeaders().getResponseCode();
    if (this.method.equals("HEAD")) {}
    do
    {
      return false;
      if (((i < 100) || (i >= 200)) && (i != 204) && (i != 304)) {
        return true;
      }
    } while ((this.responseHeaders.getContentLength() == -1L) && (!this.responseHeaders.isChunked()));
    return true;
  }
  
  protected boolean includeAuthorityInRequestLine()
  {
    if (this.connection == null) {
      return this.policy.usingProxy();
    }
    return this.connection.getRoute().getProxy().type() == Proxy.Type.HTTP;
  }
  
  public final void readResponse()
  {
    if (hasResponse()) {
      this.responseHeaders.setResponseSource(this.responseSource);
    }
    do
    {
      return;
      if (this.responseSource == null) {
        throw new IllegalStateException("readResponse() without sendRequest()");
      }
    } while (!this.responseSource.requiresConnection());
    if (this.sentRequestMillis == -1L)
    {
      if ((this.requestBodyOut instanceof RetryableOutputStream))
      {
        int i = ((RetryableOutputStream)this.requestBodyOut).contentLength();
        this.requestHeaders.setContentLength(i);
      }
      this.transport.writeRequestHeaders();
    }
    if (this.requestBodyOut != null)
    {
      this.requestBodyOut.close();
      if ((this.requestBodyOut instanceof RetryableOutputStream)) {
        this.transport.writeRequestBody((RetryableOutputStream)this.requestBodyOut);
      }
    }
    this.transport.flushRequest();
    this.responseHeaders = this.transport.readResponseHeaders();
    this.responseHeaders.setLocalTimestamps(this.sentRequestMillis, System.currentTimeMillis());
    this.responseHeaders.setResponseSource(this.responseSource);
    if (this.responseSource == ResponseSource.CONDITIONAL_CACHE)
    {
      if (this.cachedResponseHeaders.validate(this.responseHeaders))
      {
        release(false);
        this.responseHeaders = this.cachedResponseHeaders.combine(this.responseHeaders);
        OkResponseCache localOkResponseCache = this.client.getOkResponseCache();
        localOkResponseCache.trackConditionalCacheHit();
        localOkResponseCache.update(this.cacheResponse, this.policy.getHttpConnectionToCache());
        initContentStream(this.cachedResponseBody);
        return;
      }
      Util.closeQuietly(this.cachedResponseBody);
    }
    if (hasResponseBody()) {
      maybeCache();
    }
    initContentStream(this.transport.getTransferStream(this.cacheRequest));
  }
  
  public void receiveHeaders(RawHeaders paramRawHeaders)
  {
    CookieHandler localCookieHandler = this.client.getCookieHandler();
    if (localCookieHandler != null) {
      localCookieHandler.put(this.uri, paramRawHeaders.toMultimap(true));
    }
  }
  
  public final void release(boolean paramBoolean)
  {
    if (this.responseBodyIn == this.cachedResponseBody) {
      Util.closeQuietly(this.responseBodyIn);
    }
    if ((!this.connectionReleased) && (this.connection != null))
    {
      this.connectionReleased = true;
      if ((this.transport != null) && (this.transport.makeReusable(paramBoolean, this.requestBodyOut, this.responseTransferIn))) {
        break label78;
      }
      Util.closeQuietly(this.connection);
      this.connection = null;
    }
    label78:
    while (!this.automaticallyReleaseConnectionToPool) {
      return;
    }
    this.client.getConnectionPool().recycle(this.connection);
    this.connection = null;
  }
  
  public final void sendRequest()
  {
    if (this.responseSource != null) {}
    do
    {
      return;
      prepareRawRequestHeaders();
      initResponseSource();
      Object localObject = this.client.getOkResponseCache();
      if (localObject != null) {
        ((OkResponseCache)localObject).trackResponse(this.responseSource);
      }
      if ((this.requestHeaders.isOnlyIfCached()) && (this.responseSource.requiresConnection()))
      {
        if (this.responseSource == ResponseSource.CONDITIONAL_CACHE) {
          Util.closeQuietly(this.cachedResponseBody);
        }
        this.responseSource = ResponseSource.CACHE;
        this.cacheResponse = GATEWAY_TIMEOUT_RESPONSE;
        localObject = RawHeaders.fromMultimap(this.cacheResponse.getHeaders(), true);
        setResponse(new ResponseHeaders(this.uri, (RawHeaders)localObject), this.cacheResponse.getBody());
      }
      if (this.responseSource.requiresConnection())
      {
        sendSocketRequest();
        return;
      }
    } while (this.connection == null);
    this.client.getConnectionPool().recycle(this.connection);
    this.connection = null;
  }
  
  public void writingRequestHeaders()
  {
    if (this.sentRequestMillis != -1L) {
      throw new IllegalStateException();
    }
    this.sentRequestMillis = System.currentTimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */