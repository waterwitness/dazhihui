package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;

public class HttpURLConnectionImpl
  extends HttpURLConnection
  implements Policy
{
  public static final int HTTP_TEMP_REDIRECT = 307;
  private static final int MAX_REDIRECTS = 20;
  final OkHttpClient client;
  private long fixedContentLength = -1L;
  protected HttpEngine httpEngine;
  protected IOException httpEngineFailure;
  private final RawHeaders rawRequestHeaders = new RawHeaders();
  private int redirectionCount;
  private Proxy selectedProxy;
  
  public HttpURLConnectionImpl(URL paramURL, OkHttpClient paramOkHttpClient)
  {
    super(paramURL);
    this.client = paramOkHttpClient;
  }
  
  private boolean execute(boolean paramBoolean)
  {
    try
    {
      this.httpEngine.sendRequest();
      if (paramBoolean) {
        this.httpEngine.readResponse();
      }
      return true;
    }
    catch (IOException localIOException)
    {
      if (handleFailure(localIOException)) {
        return false;
      }
      throw localIOException;
    }
  }
  
  private HttpEngine getResponse()
  {
    initHttpEngine();
    if (this.httpEngine.hasResponse()) {
      return this.httpEngine;
    }
    HttpURLConnectionImpl.Retry localRetry;
    String str;
    OutputStream localOutputStream;
    int i;
    if (execute(true))
    {
      localRetry = processResponseHeaders();
      if (localRetry == HttpURLConnectionImpl.Retry.NONE)
      {
        this.httpEngine.automaticallyReleaseConnectionToPool();
        return this.httpEngine;
      }
      str = this.method;
      localOutputStream = this.httpEngine.getRequestBody();
      i = this.httpEngine.getResponseCode();
      if ((i != 300) && (i != 301) && (i != 302) && (i != 303)) {
        break label196;
      }
      localOutputStream = null;
      str = "GET";
    }
    label196:
    for (;;)
    {
      if ((localOutputStream != null) && (!(localOutputStream instanceof RetryableOutputStream))) {
        throw new HttpRetryException("Cannot retry streamed HTTP body", i);
      }
      if (localRetry == HttpURLConnectionImpl.Retry.DIFFERENT_CONNECTION) {
        this.httpEngine.automaticallyReleaseConnectionToPool();
      }
      this.httpEngine.release(false);
      this.httpEngine = newHttpEngine(str, this.rawRequestHeaders, this.httpEngine.getConnection(), (RetryableOutputStream)localOutputStream);
      if (localOutputStream != null) {
        break;
      }
      this.httpEngine.getRequestHeaders().removeContentLength();
      break;
      break;
    }
  }
  
  private boolean handleFailure(IOException paramIOException)
  {
    RouteSelector localRouteSelector = this.httpEngine.routeSelector;
    if ((localRouteSelector != null) && (this.httpEngine.connection != null)) {
      localRouteSelector.connectFailed(this.httpEngine.connection, paramIOException);
    }
    OutputStream localOutputStream = this.httpEngine.getRequestBody();
    if ((localOutputStream != null) && (!(localOutputStream instanceof RetryableOutputStream))) {}
    for (int i = 0; ((localRouteSelector == null) && (this.httpEngine.connection == null)) || ((localRouteSelector != null) && (!localRouteSelector.hasNext())) || (!isRecoverable(paramIOException)) || (i == 0); i = 1)
    {
      this.httpEngineFailure = paramIOException;
      return false;
    }
    this.httpEngine.release(true);
    paramIOException = (RetryableOutputStream)localOutputStream;
    this.httpEngine = newHttpEngine(this.method, this.rawRequestHeaders, null, paramIOException);
    this.httpEngine.routeSelector = localRouteSelector;
    return true;
  }
  
  private void initHttpEngine()
  {
    if (this.httpEngineFailure != null) {
      throw this.httpEngineFailure;
    }
    if (this.httpEngine != null) {
      return;
    }
    this.connected = true;
    do
    {
      try
      {
        if (this.doOutput)
        {
          if (this.method.equals("GET")) {
            this.method = "POST";
          }
        }
        else
        {
          this.httpEngine = newHttpEngine(this.method, this.rawRequestHeaders, null, null);
          return;
        }
      }
      catch (IOException localIOException)
      {
        this.httpEngineFailure = localIOException;
        throw localIOException;
      }
    } while ((this.method.equals("POST")) || (this.method.equals("PUT")) || (this.method.equals("PATCH")));
    throw new ProtocolException(this.method + " does not support writing");
  }
  
  private boolean isRecoverable(IOException paramIOException)
  {
    if (((paramIOException instanceof SSLHandshakeException)) && ((paramIOException.getCause() instanceof CertificateException))) {}
    for (int i = 1;; i = 0)
    {
      boolean bool = paramIOException instanceof ProtocolException;
      if ((i != 0) || (bool)) {
        break;
      }
      return true;
    }
    return false;
  }
  
  private static boolean isValidNonDirectProxy(Proxy paramProxy)
  {
    return (paramProxy != null) && (paramProxy.type() != Proxy.Type.DIRECT);
  }
  
  private HttpEngine newHttpEngine(String paramString, RawHeaders paramRawHeaders, Connection paramConnection, RetryableOutputStream paramRetryableOutputStream)
  {
    if (this.url.getProtocol().equals("http")) {
      return new HttpEngine(this.client, this, paramString, paramRawHeaders, paramConnection, paramRetryableOutputStream);
    }
    if (this.url.getProtocol().equals("https")) {
      return new HttpsEngine(this.client, this, paramString, paramRawHeaders, paramConnection, paramRetryableOutputStream);
    }
    throw new AssertionError();
  }
  
  private HttpURLConnectionImpl.Retry processResponseHeaders()
  {
    if (this.httpEngine.connection != null) {}
    for (Object localObject = this.httpEngine.connection.getRoute().getProxy();; localObject = this.client.getProxy())
    {
      i = getResponseCode();
      switch (i)
      {
      default: 
        return HttpURLConnectionImpl.Retry.NONE;
      }
    }
    if (((Proxy)localObject).type() != Proxy.Type.HTTP) {
      throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
    }
    if (HttpAuthenticator.processAuthHeader(this.client.getAuthenticator(), getResponseCode(), this.httpEngine.getResponseHeaders().getHeaders(), this.rawRequestHeaders, (Proxy)localObject, this.url)) {
      return HttpURLConnectionImpl.Retry.SAME_CONNECTION;
    }
    return HttpURLConnectionImpl.Retry.NONE;
    if (!getInstanceFollowRedirects()) {
      return HttpURLConnectionImpl.Retry.NONE;
    }
    int j = this.redirectionCount + 1;
    this.redirectionCount = j;
    if (j > 20) {
      throw new ProtocolException("Too many redirects: " + this.redirectionCount);
    }
    if ((i == 307) && (!this.method.equals("GET")) && (!this.method.equals("HEAD"))) {
      return HttpURLConnectionImpl.Retry.NONE;
    }
    localObject = getHeaderField("Location");
    if (localObject == null) {
      return HttpURLConnectionImpl.Retry.NONE;
    }
    URL localURL = this.url;
    this.url = new URL(localURL, (String)localObject);
    if ((!this.url.getProtocol().equals("https")) && (!this.url.getProtocol().equals("http"))) {
      return HttpURLConnectionImpl.Retry.NONE;
    }
    boolean bool1 = localURL.getProtocol().equals(this.url.getProtocol());
    if ((!bool1) && (!this.client.getFollowProtocolRedirects())) {
      return HttpURLConnectionImpl.Retry.NONE;
    }
    boolean bool2 = localURL.getHost().equals(this.url.getHost());
    if (Util.getEffectivePort(localURL) == Util.getEffectivePort(this.url)) {}
    for (int i = 1; (bool2) && (i != 0) && (bool1); i = 0) {
      return HttpURLConnectionImpl.Retry.SAME_CONNECTION;
    }
    return HttpURLConnectionImpl.Retry.DIFFERENT_CONNECTION;
  }
  
  private void setTransports(String paramString, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {
      localArrayList.addAll(this.client.getTransports());
    }
    paramString = paramString.split(",", -1);
    int j = paramString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        this.client.setTransports(localArrayList);
        return;
      }
      localArrayList.add(paramString[i]);
      i += 1;
    }
  }
  
  public final void addRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot add request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      Platform.get().logW("Ignoring header " + paramString1 + " because its value was null.");
      return;
    }
    if ("X-Android-Transports".equals(paramString1))
    {
      setTransports(paramString2, true);
      return;
    }
    this.rawRequestHeaders.add(paramString1, paramString2);
  }
  
  public final void connect()
  {
    initHttpEngine();
    while (!execute(false)) {}
  }
  
  public final void disconnect()
  {
    if (this.httpEngine != null)
    {
      if (this.httpEngine.hasResponse()) {
        Util.closeQuietly(this.httpEngine.getResponseBody());
      }
      this.httpEngine.release(true);
    }
  }
  
  public final int getChunkLength()
  {
    return this.chunkLength;
  }
  
  public int getConnectTimeout()
  {
    return this.client.getConnectTimeout();
  }
  
  public final InputStream getErrorStream()
  {
    Object localObject2 = null;
    try
    {
      HttpEngine localHttpEngine = getResponse();
      Object localObject1 = localObject2;
      if (localHttpEngine.hasResponseBody())
      {
        localObject1 = localObject2;
        if (localHttpEngine.getResponseCode() >= 400) {
          localObject1 = localHttpEngine.getResponseBody();
        }
      }
      return (InputStream)localObject1;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final long getFixedContentLength()
  {
    return this.fixedContentLength;
  }
  
  public final String getHeaderField(int paramInt)
  {
    try
    {
      String str = getResponse().getResponseHeaders().getHeaders().getValue(paramInt);
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final String getHeaderField(String paramString)
  {
    try
    {
      RawHeaders localRawHeaders = getResponse().getResponseHeaders().getHeaders();
      if (paramString == null) {
        return localRawHeaders.getStatusLine();
      }
      paramString = localRawHeaders.get(paramString);
      return paramString;
    }
    catch (IOException paramString) {}
    return null;
  }
  
  public final String getHeaderFieldKey(int paramInt)
  {
    try
    {
      String str = getResponse().getResponseHeaders().getHeaders().getFieldName(paramInt);
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final Map<String, List<String>> getHeaderFields()
  {
    try
    {
      Map localMap = getResponse().getResponseHeaders().getHeaders().toMultimap(true);
      return localMap;
    }
    catch (IOException localIOException) {}
    return Collections.emptyMap();
  }
  
  public HttpURLConnection getHttpConnectionToCache()
  {
    return this;
  }
  
  public HttpEngine getHttpEngine()
  {
    return this.httpEngine;
  }
  
  public final InputStream getInputStream()
  {
    if (!this.doInput) {
      throw new ProtocolException("This protocol does not support input");
    }
    Object localObject = getResponse();
    if (getResponseCode() >= 400) {
      throw new FileNotFoundException(this.url.toString());
    }
    localObject = ((HttpEngine)localObject).getResponseBody();
    if (localObject == null) {
      throw new ProtocolException("No response body exists; responseCode=" + getResponseCode());
    }
    return (InputStream)localObject;
  }
  
  public final OutputStream getOutputStream()
  {
    connect();
    OutputStream localOutputStream = this.httpEngine.getRequestBody();
    if (localOutputStream == null) {
      throw new ProtocolException("method does not support a request body: " + this.method);
    }
    if (this.httpEngine.hasResponse()) {
      throw new ProtocolException("cannot write request body after response has been read");
    }
    return localOutputStream;
  }
  
  public final Permission getPermission()
  {
    String str = getURL().getHost();
    int i = Util.getEffectivePort(getURL());
    if (usingProxy())
    {
      InetSocketAddress localInetSocketAddress = (InetSocketAddress)this.client.getProxy().address();
      str = localInetSocketAddress.getHostName();
      i = localInetSocketAddress.getPort();
    }
    return new SocketPermission(str + ":" + i, "connect, resolve");
  }
  
  public int getReadTimeout()
  {
    return this.client.getReadTimeout();
  }
  
  public final Map<String, List<String>> getRequestProperties()
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot access request header fields after connection is set");
    }
    return this.rawRequestHeaders.toMultimap(false);
  }
  
  public final String getRequestProperty(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return this.rawRequestHeaders.get(paramString);
  }
  
  public final int getResponseCode()
  {
    return getResponse().getResponseCode();
  }
  
  public String getResponseMessage()
  {
    return getResponse().getResponseHeaders().getHeaders().getResponseMessage();
  }
  
  public void setConnectTimeout(int paramInt)
  {
    this.client.setConnectTimeout(paramInt, TimeUnit.MILLISECONDS);
  }
  
  public void setFixedLengthStreamingMode(int paramInt)
  {
    setFixedLengthStreamingMode(paramInt);
  }
  
  public void setFixedLengthStreamingMode(long paramLong)
  {
    if (this.connected) {
      throw new IllegalStateException("Already connected");
    }
    if (this.chunkLength > 0) {
      throw new IllegalStateException("Already in chunked mode");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("contentLength < 0");
    }
    this.fixedContentLength = paramLong;
    this.fixedContentLength = ((int)Math.min(paramLong, 2147483647L));
  }
  
  public void setReadTimeout(int paramInt)
  {
    this.client.setReadTimeout(paramInt, TimeUnit.MILLISECONDS);
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot set request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      Platform.get().logW("Ignoring header " + paramString1 + " because its value was null.");
      return;
    }
    if ("X-Android-Transports".equals(paramString1))
    {
      setTransports(paramString2, false);
      return;
    }
    this.rawRequestHeaders.set(paramString1, paramString2);
  }
  
  public final void setSelectedProxy(Proxy paramProxy)
  {
    this.selectedProxy = paramProxy;
  }
  
  public final boolean usingProxy()
  {
    if (this.selectedProxy != null) {
      return isValidNonDirectProxy(this.selectedProxy);
    }
    return isValidNonDirectProxy(this.client.getProxy());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpURLConnectionImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */