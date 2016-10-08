package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.StatusLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpRequestParser;
import org.apache.http.impl.io.HttpResponseWriter;
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
public abstract class AbstractHttpServerConnection
  implements HttpServerConnection
{
  private final EntityDeserializer entitydeserializer = createEntityDeserializer();
  private final EntitySerializer entityserializer = createEntitySerializer();
  private EofSensor eofSensor = null;
  private SessionInputBuffer inbuffer = null;
  private HttpConnectionMetricsImpl metrics = null;
  private SessionOutputBuffer outbuffer = null;
  private HttpMessageParser<HttpRequest> requestParser = null;
  private HttpMessageWriter<HttpResponse> responseWriter = null;
  
  protected abstract void assertOpen();
  
  protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics paramHttpTransportMetrics1, HttpTransportMetrics paramHttpTransportMetrics2)
  {
    return new HttpConnectionMetricsImpl(paramHttpTransportMetrics1, paramHttpTransportMetrics2);
  }
  
  protected EntityDeserializer createEntityDeserializer()
  {
    return new EntityDeserializer(new DisallowIdentityContentLengthStrategy(new LaxContentLengthStrategy(0)));
  }
  
  protected EntitySerializer createEntitySerializer()
  {
    return new EntitySerializer(new StrictContentLengthStrategy());
  }
  
  protected HttpRequestFactory createHttpRequestFactory()
  {
    return DefaultHttpRequestFactory.INSTANCE;
  }
  
  protected HttpMessageParser<HttpRequest> createRequestParser(SessionInputBuffer paramSessionInputBuffer, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    return new DefaultHttpRequestParser(paramSessionInputBuffer, null, paramHttpRequestFactory, paramHttpParams);
  }
  
  protected HttpMessageWriter<HttpResponse> createResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    return new HttpResponseWriter(paramSessionOutputBuffer, null, paramHttpParams);
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
    this.requestParser = createRequestParser(paramSessionInputBuffer, createHttpRequestFactory(), paramHttpParams);
    this.responseWriter = createResponseWriter(paramSessionOutputBuffer, paramHttpParams);
    this.metrics = createConnectionMetrics(paramSessionInputBuffer.getMetrics(), paramSessionOutputBuffer.getMetrics());
  }
  
  protected boolean isEof()
  {
    return (this.eofSensor != null) && (this.eofSensor.isEof());
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
    catch (IOException localIOException) {}
    return true;
  }
  
  public void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    assertOpen();
    paramHttpEntityEnclosingRequest.setEntity(this.entitydeserializer.deserialize(this.inbuffer, paramHttpEntityEnclosingRequest));
  }
  
  public HttpRequest receiveRequestHeader()
  {
    assertOpen();
    HttpRequest localHttpRequest = (HttpRequest)this.requestParser.parse();
    this.metrics.incrementRequestCount();
    return localHttpRequest;
  }
  
  public void sendResponseEntity(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse.getEntity() == null) {
      return;
    }
    this.entityserializer.serialize(this.outbuffer, paramHttpResponse, paramHttpResponse.getEntity());
  }
  
  public void sendResponseHeader(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    assertOpen();
    this.responseWriter.write(paramHttpResponse);
    if (paramHttpResponse.getStatusLine().getStatusCode() >= 200) {
      this.metrics.incrementResponseCount();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\AbstractHttpServerConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */