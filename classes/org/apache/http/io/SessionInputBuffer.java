package org.apache.http.io;

import org.apache.http.util.CharArrayBuffer;

public abstract interface SessionInputBuffer
{
  public abstract HttpTransportMetrics getMetrics();
  
  @Deprecated
  public abstract boolean isDataAvailable(int paramInt);
  
  public abstract int read();
  
  public abstract int read(byte[] paramArrayOfByte);
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int readLine(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String readLine();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\io\SessionInputBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */