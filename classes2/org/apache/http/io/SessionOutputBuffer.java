package org.apache.http.io;

import org.apache.http.util.CharArrayBuffer;

public abstract interface SessionOutputBuffer
{
  public abstract void flush();
  
  public abstract HttpTransportMetrics getMetrics();
  
  public abstract void write(int paramInt);
  
  public abstract void write(byte[] paramArrayOfByte);
  
  public abstract void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void writeLine(String paramString);
  
  public abstract void writeLine(CharArrayBuffer paramCharArrayBuffer);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\io\SessionOutputBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */