package com.tencent.qalsdk.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.util.ByteArrayBuffer;
import qalsdk.at;

public class MsfSocketInputBuffer
  extends AbsSessionInputBuffer
{
  private static final Class SOCKET_TIMEOUT_CLASS = ;
  private int inputBufferSize = 0;
  public InputStream instream;
  private final Socket socket;
  
  public MsfSocketInputBuffer(Socket paramSocket, int paramInt1, String paramString, int paramInt2)
  {
    if (paramSocket == null) {
      throw new IllegalArgumentException("Socket may not be null");
    }
    this.socket = paramSocket;
    if (paramInt1 < 0) {
      paramInt1 = paramSocket.getReceiveBufferSize();
    }
    for (;;)
    {
      if (paramInt1 < 1024) {
        paramInt1 = i;
      }
      for (;;)
      {
        paramSocket = paramSocket.getInputStream();
        if (!at.i.contains(paramSocket.toString())) {
          at.i.add(paramSocket.toString());
        }
        init(paramSocket, paramInt1, paramString, paramInt2);
        return;
      }
    }
  }
  
  private static Class SocketTimeoutExceptionClass()
  {
    try
    {
      Class localClass = Class.forName("java.net.SocketTimeoutException");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  private static boolean isSocketTimeoutException(InterruptedIOException paramInterruptedIOException)
  {
    if (SOCKET_TIMEOUT_CLASS != null) {
      return SOCKET_TIMEOUT_CLASS.isInstance(paramInterruptedIOException);
    }
    return true;
  }
  
  protected int fillBuffer()
  {
    if (this.bufferpos > 0)
    {
      i = this.bufferlen - this.bufferpos;
      if (i > 0) {
        System.arraycopy(this.buffer, this.bufferpos, this.buffer, 0, i);
      }
      this.bufferpos = 0;
      this.bufferlen = i;
    }
    int i = this.bufferlen;
    int j = this.buffer.length;
    j = this.instream.read(this.buffer, i, j - i);
    if (j == -1) {
      return -1;
    }
    this.bufferlen = (i + j);
    this.metrics.incrementBytesTransferred(j);
    return j;
  }
  
  protected void init(InputStream paramInputStream, int paramInt1, String paramString, int paramInt2)
  {
    boolean bool = false;
    if (paramInputStream == null) {
      throw new IllegalArgumentException("Input stream may not be null");
    }
    if (paramInt1 <= 0) {
      throw new IllegalArgumentException("Buffer size may not be negative or zero");
    }
    this.instream = paramInputStream;
    this.inputBufferSize = paramInt1;
    this.buffer = new byte[this.inputBufferSize];
    this.bufferpos = 0;
    this.bufferlen = 0;
    this.linebuffer = new ByteArrayBuffer(paramInt1);
    this.charset = paramString;
    if ((this.charset.equalsIgnoreCase("US-ASCII")) || (this.charset.equalsIgnoreCase("ASCII"))) {
      bool = true;
    }
    this.ascii = bool;
    this.maxLineLen = paramInt2;
    this.metrics = new HttpTransportMetricsImpl();
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    boolean bool2 = hasBufferedData();
    boolean bool1 = bool2;
    if (!bool2) {
      try
      {
        if (fillBuffer() == -1) {
          throw new IOException("readData return -1");
        }
      }
      catch (InterruptedIOException localInterruptedIOException)
      {
        bool1 = bool2;
        if (!isSocketTimeoutException(localInterruptedIOException))
        {
          throw localInterruptedIOException;
          bool1 = hasBufferedData();
        }
      }
    }
    return bool1;
  }
  
  public void reset()
  {
    if (this.buffer != null) {
      this.buffer = new byte[this.inputBufferSize];
    }
    this.bufferpos = 0;
    this.bufferlen = 0;
    if (this.linebuffer != null) {
      this.linebuffer.clear();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\MsfSocketInputBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */