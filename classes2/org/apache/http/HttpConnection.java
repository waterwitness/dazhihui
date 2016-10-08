package org.apache.http;

import java.io.Closeable;

public abstract interface HttpConnection
  extends Closeable
{
  public abstract void close();
  
  public abstract HttpConnectionMetrics getMetrics();
  
  public abstract int getSocketTimeout();
  
  public abstract boolean isOpen();
  
  public abstract boolean isStale();
  
  public abstract void setSocketTimeout(int paramInt);
  
  public abstract void shutdown();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */