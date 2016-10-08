package org.apache.http.impl.io;

import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.HttpTransportMetrics;

@NotThreadSafe
public class HttpTransportMetricsImpl
  implements HttpTransportMetrics
{
  private long bytesTransferred = 0L;
  
  public long getBytesTransferred()
  {
    return this.bytesTransferred;
  }
  
  public void incrementBytesTransferred(long paramLong)
  {
    this.bytesTransferred += paramLong;
  }
  
  public void reset()
  {
    this.bytesTransferred = 0L;
  }
  
  public void setBytesTransferred(long paramLong)
  {
    this.bytesTransferred = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\HttpTransportMetricsImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */