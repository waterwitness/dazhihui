package org.apache.http.impl;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.StatusLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpResponseParser;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
@NotThreadSafe
public abstract class AbstractHttpClientConnection
  implements HttpClientConnection
{
  private final EntityDeserializer entitydeserializer = createEntityDeserializer();
  private final EntitySerializer entityserializer = createEntitySerializer();
  private EofSensor eofSensor = null;
  private SessionInputBuffer inbuffer = null;
  private HttpConnectionMetricsImpl metrics = null;
  private SessionOutputBuffer outbuffer = null;
  private HttpMessageWriter<HttpRequest> requestWriter = null;
  private HttpMessageParser<HttpResponse> responseParser = null;
  
  protected abstract void assertOpen();
  
  protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics paramHttpTransportMetrics1, HttpTransportMetrics paramHttpTransportMetrics2)
  {
    return new HttpConnectionMetricsImpl(paramHttpTransportMetrics1, paramHttpTransportMetrics2);
  }
  
  protected EntityDeserializer createEntityDeserializer()
  {
    return new EntityDeserializer(new LaxContentLengthStrategy());
  }
  
  protected EntitySerializer createEntitySerializer()
  {
    return new EntitySerializer(new StrictContentLengthStrategy());
  }
  
  protected HttpResponseFactory createHttpResponseFactory()
  {
    return DefaultHttpResponseFactory.INSTANCE;
  }
  
  protected HttpMessageWriter<HttpRequest> createRequestWriter(SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    return new HttpRequestWriter(paramSessionOutputBuffer, null, paramHttpParams);
  }
  
  protected HttpMessageParser<HttpResponse> createResponseParser(SessionInputBuffer paramSessionInputBuffer, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    return new DefaultHttpResponseParser(paramSessionInputBuffer, null, paramHttpResponseFactory, paramHttpParams);
  }
  
  protected void doFlush()
  {
    this.outbuffer.flush();
  }
  
  public void flush()
  {
    assertOpen();
    doFlush();
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return this.metrics;
  }
  
  protected void init(SessionInputBuffer paramSessionInputBuffer, SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    this.inbuffer = ((SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Input session buffer"));
    this.outbuffer = ((SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Output session buffer"));
    if ((paramSessionInputBuffer instanceof EofSensor)) {
      this.eofSensor = ((EofSensor)paramSessionInputBuffer);
    }
    this.responseParser = createResponseParser(paramSessionInputBuffer, createHttpResponseFactory(), paramHttpParams);
    this.requestWriter = createRequestWriter(paramSessionOutputBuffer, paramHttpParams);
    this.metrics = createConnectionMetrics(paramSessionInputBuffer.getMetrics(), paramSessionOutputBuffer.getMetrics());
  }
  
  protected boolean isEof()
  {
    return (this.eofSensor != null) && (this.eofSensor.isEof());
  }
  
  public boolean isResponseAvailable(int paramInt)
  {
    assertOpen();
    try
    {
      boolean bool = this.inbuffer.isDataAvailable(paramInt);
      return bool;
    }
    catch (SocketTimeoutException localSocketTimeoutException) {}
    return false;
  }
  
  public boolean isStale()
  {
    if (!isOpen()) {}
    while (isEof()) {
      return true;
    }
    try
    {
      this.inbuffer.isDataAvailable(1);
      boolean bool = isEof();
      return bool;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      return false;
    }
    catch (IOException localIOException) {}
    return true;
  }
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    assertOpen();
    paramHttpResponse.setEntity(this.entitydeserializer.deserialize(this.inbuffer, paramHttpResponse));
  }
  
  public HttpResponse receiveResponseHeader()
  {
    assertOpen();
    HttpResponse localHttpResponse = (HttpResponse)this.responseParser.parse();
    if (localHttpResponse.getStatusLine().getStatusCode() >= 200) {
      this.metrics.incrementResponseCount();
    }
    return localHttpResponse;
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    assertOpen();
    if (paramHttpEntityEnclosingRequest.getEntity() == null) {
      return;
    }
    this.entityserializer.serialize(this.outbuffer, paramHttpEntityEnclosingRequest, paramHttpEntityEnclosingRequest.getEntity());
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    assertOpen();
    this.requestWriter.write(paramHttpRequest);
    this.metrics.incrementRequestCount();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\AbstractHttpClientConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */