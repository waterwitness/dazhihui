package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpsEngine;
import com.squareup.okhttp.internal.http.Policy;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.RequestHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;

final class Job
  implements Policy, Runnable
{
  private final OkHttpClient client;
  private final Dispatcher dispatcher;
  private Request request;
  private final Response.Receiver responseReceiver;
  
  public Job(Dispatcher paramDispatcher, OkHttpClient paramOkHttpClient, Request paramRequest, Response.Receiver paramReceiver)
  {
    this.dispatcher = paramDispatcher;
    this.client = paramOkHttpClient;
    this.request = paramRequest;
    this.responseReceiver = paramReceiver;
  }
  
  private Response execute()
  {
    Response localResponse = null;
    Object localObject1 = null;
    localObject1 = newEngine((Connection)localObject1);
    Object localObject2 = this.request.body();
    if (localObject2 != null)
    {
      MediaType localMediaType = ((Request.Body)localObject2).contentType();
      if (localMediaType == null) {
        throw new IllegalStateException("contentType == null");
      }
      if (((HttpEngine)localObject1).getRequestHeaders().getContentType() == null) {
        ((HttpEngine)localObject1).getRequestHeaders().setContentType(localMediaType.toString());
      }
    }
    ((HttpEngine)localObject1).sendRequest();
    if (localObject2 != null) {
      ((Request.Body)localObject2).writeTo(((HttpEngine)localObject1).getRequestBody());
    }
    ((HttpEngine)localObject1).readResponse();
    int i = ((HttpEngine)localObject1).getResponseCode();
    localObject2 = new Dispatcher.RealResponseBody(((HttpEngine)localObject1).getResponseHeaders(), ((HttpEngine)localObject1).getResponseBody());
    localResponse = new Response.Builder(this.request, i).rawHeaders(((HttpEngine)localObject1).getResponseHeaders().getHeaders()).body((Response.Body)localObject2).redirectedBy(localResponse).build();
    localObject2 = processResponse((HttpEngine)localObject1, localResponse);
    if (localObject2 == null)
    {
      ((HttpEngine)localObject1).automaticallyReleaseConnectionToPool();
      return localResponse;
    }
    if (sameConnection(this.request, (Request)localObject2)) {}
    for (localObject1 = ((HttpEngine)localObject1).getConnection();; localObject1 = null)
    {
      this.request = ((Request)localObject2);
      break;
    }
  }
  
  private Request processResponse(HttpEngine paramHttpEngine, Response paramResponse)
  {
    Request localRequest = paramResponse.request();
    int i;
    if (paramHttpEngine.getConnection() != null)
    {
      paramHttpEngine = paramHttpEngine.getConnection().getRoute().getProxy();
      i = paramResponse.code();
      switch (i)
      {
      }
    }
    do
    {
      do
      {
        do
        {
          return null;
          paramHttpEngine = this.client.getProxy();
          break;
          if (paramHttpEngine.type() != Proxy.Type.HTTP) {
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
          }
          RawHeaders localRawHeaders = localRequest.rawHeaders();
          if (HttpAuthenticator.processAuthHeader(this.client.getAuthenticator(), paramResponse.code(), paramResponse.rawHeaders(), localRawHeaders, paramHttpEngine, this.request.url())) {}
          for (paramHttpEngine = localRequest.newBuilder().rawHeaders(localRawHeaders).build();; paramHttpEngine = null) {
            return paramHttpEngine;
          }
          paramHttpEngine = localRequest.method();
        } while ((i == 307) && (!paramHttpEngine.equals("GET")) && (!paramHttpEngine.equals("HEAD")));
        paramHttpEngine = paramResponse.header("Location");
      } while (paramHttpEngine == null);
      paramHttpEngine = new URL(localRequest.url(), paramHttpEngine);
    } while ((!paramHttpEngine.getProtocol().equals("https")) && (!paramHttpEngine.getProtocol().equals("http")));
    return this.request.newBuilder().url(paramHttpEngine).build();
  }
  
  private boolean sameConnection(Request paramRequest1, Request paramRequest2)
  {
    return (paramRequest1.url().getHost().equals(paramRequest2.url().getHost())) && (Util.getEffectivePort(paramRequest1.url()) == Util.getEffectivePort(paramRequest2.url())) && (paramRequest1.url().getProtocol().equals(paramRequest2.url().getProtocol()));
  }
  
  public int getChunkLength()
  {
    if (this.request.body().contentLength() == -1L) {
      return 1024;
    }
    return -1;
  }
  
  public long getFixedContentLength()
  {
    return this.request.body().contentLength();
  }
  
  public HttpURLConnection getHttpConnectionToCache()
  {
    return null;
  }
  
  public long getIfModifiedSince()
  {
    return 0L;
  }
  
  public URL getURL()
  {
    return this.request.url();
  }
  
  public boolean getUseCaches()
  {
    return false;
  }
  
  HttpEngine newEngine(Connection paramConnection)
  {
    String str = this.request.url().getProtocol();
    RawHeaders localRawHeaders = this.request.rawHeaders();
    if (str.equals("http")) {
      return new HttpEngine(this.client, this, this.request.method(), localRawHeaders, paramConnection, null);
    }
    if (str.equals("https")) {
      return new HttpsEngine(this.client, this, this.request.method(), localRawHeaders, paramConnection, null);
    }
    throw new AssertionError();
  }
  
  public void run()
  {
    try
    {
      Response localResponse = execute();
      this.responseReceiver.onResponse(localResponse);
      return;
    }
    catch (IOException localIOException)
    {
      this.responseReceiver.onFailure(new Failure.Builder().request(this.request).exception(localIOException).build());
      return;
    }
    finally
    {
      this.dispatcher.finished(this);
    }
  }
  
  public void setSelectedProxy(Proxy paramProxy) {}
  
  Object tag()
  {
    return this.request.tag();
  }
  
  public boolean usingProxy()
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Job.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */