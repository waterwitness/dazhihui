package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.OkResponseCacheAdapter;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ResponseCache;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class OkHttpClient
  implements URLStreamHandlerFactory
{
  private static final List<String> DEFAULT_TRANSPORTS = Util.immutableList(Arrays.asList(new String[] { "spdy/3", "http/1.1" }));
  private OkAuthenticator authenticator;
  private int connectTimeout;
  private ConnectionPool connectionPool;
  private CookieHandler cookieHandler;
  private final Dispatcher dispatcher;
  private boolean followProtocolRedirects = true;
  private HostnameVerifier hostnameVerifier;
  private Proxy proxy;
  private ProxySelector proxySelector;
  private int readTimeout;
  private ResponseCache responseCache;
  private final RouteDatabase routeDatabase;
  private SSLSocketFactory sslSocketFactory;
  private List<String> transports;
  
  public OkHttpClient()
  {
    this.routeDatabase = new RouteDatabase();
    this.dispatcher = new Dispatcher();
  }
  
  private OkHttpClient(OkHttpClient paramOkHttpClient)
  {
    this.routeDatabase = paramOkHttpClient.routeDatabase;
    this.dispatcher = paramOkHttpClient.dispatcher;
  }
  
  private OkHttpClient copyWithDefaults()
  {
    OkHttpClient localOkHttpClient = new OkHttpClient(this);
    localOkHttpClient.proxy = this.proxy;
    if (this.proxySelector != null)
    {
      localObject = this.proxySelector;
      localOkHttpClient.proxySelector = ((ProxySelector)localObject);
      if (this.cookieHandler == null) {
        break label186;
      }
      localObject = this.cookieHandler;
      label46:
      localOkHttpClient.cookieHandler = ((CookieHandler)localObject);
      if (this.responseCache == null) {
        break label193;
      }
      localObject = this.responseCache;
      label63:
      localOkHttpClient.responseCache = ((ResponseCache)localObject);
      if (this.sslSocketFactory == null) {
        break label200;
      }
      localObject = this.sslSocketFactory;
      label80:
      localOkHttpClient.sslSocketFactory = ((SSLSocketFactory)localObject);
      if (this.hostnameVerifier == null) {
        break label207;
      }
      localObject = this.hostnameVerifier;
      label97:
      localOkHttpClient.hostnameVerifier = ((HostnameVerifier)localObject);
      if (this.authenticator == null) {
        break label214;
      }
      localObject = this.authenticator;
      label114:
      localOkHttpClient.authenticator = ((OkAuthenticator)localObject);
      if (this.connectionPool == null) {
        break label221;
      }
      localObject = this.connectionPool;
      label131:
      localOkHttpClient.connectionPool = ((ConnectionPool)localObject);
      localOkHttpClient.followProtocolRedirects = this.followProtocolRedirects;
      if (this.transports == null) {
        break label228;
      }
    }
    label186:
    label193:
    label200:
    label207:
    label214:
    label221:
    label228:
    for (Object localObject = this.transports;; localObject = DEFAULT_TRANSPORTS)
    {
      localOkHttpClient.transports = ((List)localObject);
      localOkHttpClient.connectTimeout = this.connectTimeout;
      localOkHttpClient.readTimeout = this.readTimeout;
      return localOkHttpClient;
      localObject = ProxySelector.getDefault();
      break;
      localObject = CookieHandler.getDefault();
      break label46;
      localObject = ResponseCache.getDefault();
      break label63;
      localObject = HttpsURLConnection.getDefaultSSLSocketFactory();
      break label80;
      localObject = OkHostnameVerifier.INSTANCE;
      break label97;
      localObject = HttpAuthenticator.SYSTEM_DEFAULT;
      break label114;
      localObject = ConnectionPool.getDefault();
      break label131;
    }
  }
  
  void cancel(Object paramObject)
  {
    this.dispatcher.cancel(paramObject);
  }
  
  public URLStreamHandler createURLStreamHandler(String paramString)
  {
    if ((!paramString.equals("http")) && (!paramString.equals("https"))) {
      return null;
    }
    return new OkHttpClient.1(this, paramString);
  }
  
  void enqueue(Request paramRequest, Response.Receiver paramReceiver)
  {
    this.dispatcher.enqueue(copyWithDefaults(), paramRequest, paramReceiver);
  }
  
  public OkAuthenticator getAuthenticator()
  {
    return this.authenticator;
  }
  
  public int getConnectTimeout()
  {
    return this.connectTimeout;
  }
  
  public ConnectionPool getConnectionPool()
  {
    return this.connectionPool;
  }
  
  public CookieHandler getCookieHandler()
  {
    return this.cookieHandler;
  }
  
  public boolean getFollowProtocolRedirects()
  {
    return this.followProtocolRedirects;
  }
  
  public HostnameVerifier getHostnameVerifier()
  {
    return this.hostnameVerifier;
  }
  
  public OkResponseCache getOkResponseCache()
  {
    if ((this.responseCache instanceof HttpResponseCache)) {
      return ((HttpResponseCache)this.responseCache).okResponseCache;
    }
    if (this.responseCache != null) {
      return new OkResponseCacheAdapter(this.responseCache);
    }
    return null;
  }
  
  public Proxy getProxy()
  {
    return this.proxy;
  }
  
  public ProxySelector getProxySelector()
  {
    return this.proxySelector;
  }
  
  public int getReadTimeout()
  {
    return this.readTimeout;
  }
  
  public ResponseCache getResponseCache()
  {
    return this.responseCache;
  }
  
  public RouteDatabase getRoutesDatabase()
  {
    return this.routeDatabase;
  }
  
  public SSLSocketFactory getSslSocketFactory()
  {
    return this.sslSocketFactory;
  }
  
  public List<String> getTransports()
  {
    return this.transports;
  }
  
  public HttpURLConnection open(URL paramURL)
  {
    return open(paramURL, this.proxy);
  }
  
  HttpURLConnection open(URL paramURL, Proxy paramProxy)
  {
    String str = paramURL.getProtocol();
    OkHttpClient localOkHttpClient = copyWithDefaults();
    localOkHttpClient.proxy = paramProxy;
    if (str.equals("http")) {
      return new HttpURLConnectionImpl(paramURL, localOkHttpClient);
    }
    if (str.equals("https")) {
      return new HttpsURLConnectionImpl(paramURL, localOkHttpClient);
    }
    throw new IllegalArgumentException("Unexpected protocol: " + str);
  }
  
  public OkHttpClient setAuthenticator(OkAuthenticator paramOkAuthenticator)
  {
    this.authenticator = paramOkAuthenticator;
    return this;
  }
  
  public void setConnectTimeout(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("timeout < 0");
    }
    if (paramTimeUnit == null) {
      throw new IllegalArgumentException("unit == null");
    }
    paramLong = paramTimeUnit.toMillis(paramLong);
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("Timeout too large.");
    }
    this.connectTimeout = ((int)paramLong);
  }
  
  public OkHttpClient setConnectionPool(ConnectionPool paramConnectionPool)
  {
    this.connectionPool = paramConnectionPool;
    return this;
  }
  
  public OkHttpClient setCookieHandler(CookieHandler paramCookieHandler)
  {
    this.cookieHandler = paramCookieHandler;
    return this;
  }
  
  public OkHttpClient setFollowProtocolRedirects(boolean paramBoolean)
  {
    this.followProtocolRedirects = paramBoolean;
    return this;
  }
  
  public OkHttpClient setHostnameVerifier(HostnameVerifier paramHostnameVerifier)
  {
    this.hostnameVerifier = paramHostnameVerifier;
    return this;
  }
  
  public OkHttpClient setProxy(Proxy paramProxy)
  {
    this.proxy = paramProxy;
    return this;
  }
  
  public OkHttpClient setProxySelector(ProxySelector paramProxySelector)
  {
    this.proxySelector = paramProxySelector;
    return this;
  }
  
  public void setReadTimeout(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("timeout < 0");
    }
    if (paramTimeUnit == null) {
      throw new IllegalArgumentException("unit == null");
    }
    paramLong = paramTimeUnit.toMillis(paramLong);
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("Timeout too large.");
    }
    this.readTimeout = ((int)paramLong);
  }
  
  public OkHttpClient setResponseCache(ResponseCache paramResponseCache)
  {
    this.responseCache = paramResponseCache;
    return this;
  }
  
  public OkHttpClient setSslSocketFactory(SSLSocketFactory paramSSLSocketFactory)
  {
    this.sslSocketFactory = paramSSLSocketFactory;
    return this;
  }
  
  public OkHttpClient setTransports(List<String> paramList)
  {
    paramList = Util.immutableList(paramList);
    if (!paramList.contains("http/1.1")) {
      throw new IllegalArgumentException("transports doesn't contain http/1.1: " + paramList);
    }
    if (paramList.contains(null)) {
      throw new IllegalArgumentException("transports must not contain null");
    }
    if (paramList.contains("")) {
      throw new IllegalArgumentException("transports contains an empty string");
    }
    this.transports = paramList;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\OkHttpClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */