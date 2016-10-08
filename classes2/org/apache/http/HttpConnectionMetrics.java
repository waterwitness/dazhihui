package org.apache.http;

public abstract interface HttpConnectionMetrics
{
  public abstract Object getMetric(String paramString);
  
  public abstract long getReceivedBytesCount();
  
  public abstract long getRequestCount();
  
  public abstract long getResponseCount();
  
  public abstract long getSentBytesCount();
  
  public abstract void reset();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpConnectionMetrics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */