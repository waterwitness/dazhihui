package com.squareup.okhttp.internal;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractOutputStream
  extends OutputStream
{
  protected boolean closed;
  
  protected final void checkNotClosed()
  {
    if (this.closed) {
      throw new IOException("stream closed");
    }
  }
  
  public boolean isClosed()
  {
    return this.closed;
  }
  
  public final void write(int paramInt)
  {
    write(new byte[] { (byte)paramInt });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\AbstractOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */