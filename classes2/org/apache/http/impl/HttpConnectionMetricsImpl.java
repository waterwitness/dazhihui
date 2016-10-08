package org.apache.http.impl;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.HttpTransportMetrics;

@NotThreadSafe
public class HttpConnectionMetricsImpl
  implements HttpConnectionMetrics
{
  public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
  public static final String REQUEST_COUNT = "http.request-count";
  public static final String RESPONSE_COUNT = "http.response-count";
  public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
  private final HttpTransportMetrics inTransportMetric;
  private Map<String, Object> metricsCache;
  private final HttpTransportMetrics outTransportMetric;
  private long requestCount = 0L;
  private long responseCount = 0L;
  
  public HttpConnectionMetricsImpl(HttpTransportMetrics paramHttpTransportMetrics1, HttpTransportMetrics paramHttpTransportMetrics2)
  {
    this.inTransportMetric = paramHttpTransportMetrics1;
    this.outTransportMetric = paramHttpTransportMetrics2;
  }
  
  public Object getMetric(String paramString)
  {
    if (this.metricsCache != null) {}
    for (Object localObject1 = this.metricsCache.get(paramString);; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        if (!"http.request-count".equals(paramString)) {
          break label43;
        }
        localObject2 = Long.valueOf(this.requestCount);
      }
      label43:
      do
      {
        return localObject2;
        if ("http.response-count".equals(paramString)) {
          return Long.valueOf(this.responseCount);
        }
        if ("http.received-bytes-count".equals(paramString))
        {
          if (this.inTransportMetric != null) {
            return Long.valueOf(this.inTransportMetric.getBytesTransferred());
          }
          return null;
        }
        localObject2 = localObject1;
      } while (!"http.sent-bytes-count".equals(paramString));
      if (this.outTransportMetric != null) {
        return Long.valueOf(this.outTransportMetric.getBytesTransferred());
      }
      return null;
    }
  }
  
  public long getReceivedBytesCount()
  {
    if (this.inTransportMetric != null) {
      return this.inTransportMetric.getBytesTransferred();
    }
    return -1L;
  }
  
  public long getRequestCount()
  {
    return this.requestCount;
  }
  
  public long getResponseCount()
  {
    return this.responseCount;
  }
  
  public long getSentBytesCount()
  {
    if (this.outTransportMetric != null) {
      return this.outTransportMetric.getBytesTransferred();
    }
    return -1L;
  }
  
  public void incrementRequestCount()
  {
    this.requestCount += 1L;
  }
  
  public void incrementResponseCount()
  {
    this.responseCount += 1L;
  }
  
  public void reset()
  {
    if (this.outTransportMetric != null) {
      this.outTransportMetric.reset();
    }
    if (this.inTransportMetric != null) {
      this.inTransportMetric.reset();
    }
    this.requestCount = 0L;
    this.responseCount = 0L;
    this.metricsCache = null;
  }
  
  public void setMetric(String paramString, Object paramObject)
  {
    if (this.metricsCache == null) {
      this.metricsCache = new HashMap();
    }
    this.metricsCache.put(paramString, paramObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\HttpConnectionMetricsImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */