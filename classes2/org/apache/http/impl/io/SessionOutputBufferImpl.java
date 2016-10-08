package org.apache.http.impl.io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class SessionOutputBufferImpl
  implements BufferInfo, SessionOutputBuffer
{
  private static final byte[] CRLF = { 13, 10 };
  private ByteBuffer bbuf;
  private final ByteArrayBuffer buffer;
  private final CharsetEncoder encoder;
  private final int fragementSizeHint;
  private final HttpTransportMetricsImpl metrics;
  private OutputStream outstream;
  
  public SessionOutputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt)
  {
    this(paramHttpTransportMetricsImpl, paramInt, paramInt, null);
  }
  
  public SessionOutputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt1, int paramInt2, CharsetEncoder paramCharsetEncoder)
  {
    Args.positive(paramInt1, "Buffer size");
    Args.notNull(paramHttpTransportMetricsImpl, "HTTP transport metrcis");
    this.metrics = paramHttpTransportMetricsImpl;
    this.buffer = new ByteArrayBuffer(paramInt1);
    if (paramInt2 >= 0) {}
    for (;;)
    {
      this.fragementSizeHint = paramInt2;
      this.encoder = paramCharsetEncoder;
      return;
      paramInt2 = 0;
    }
  }
  
  private void flushBuffer()
  {
    int i = this.buffer.length();
    if (i > 0)
    {
      streamWrite(this.buffer.buffer(), 0, i);
      this.buffer.clear();
      this.metrics.incrementBytesTransferred(i);
    }
  }
  
  private void flushStream()
  {
    if (this.outstream != null) {
      this.outstream.flush();
    }
  }
  
  private void handleEncodingResult(CoderResult paramCoderResult)
  {
    if (paramCoderResult.isError()) {
      paramCoderResult.throwException();
    }
    this.bbuf.flip();
    while (this.bbuf.hasRemaining()) {
      write(this.bbuf.get());
    }
    this.bbuf.compact();
  }
  
  private void streamWrite(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Asserts.notNull(this.outstream, "Output stream");
    this.outstream.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private void writeEncoded(CharBuffer paramCharBuffer)
  {
    if (!paramCharBuffer.hasRemaining()) {
      return;
    }
    if (this.bbuf == null) {
      this.bbuf = ByteBuffer.allocate(1024);
    }
    this.encoder.reset();
    while (paramCharBuffer.hasRemaining()) {
      handleEncodingResult(this.encoder.encode(paramCharBuffer, this.bbuf, true));
    }
    handleEncodingResult(this.encoder.flush(this.bbuf));
    this.bbuf.clear();
  }
  
  public int available()
  {
    return capacity() - length();
  }
  
  public void bind(OutputStream paramOutputStream)
  {
    this.outstream = paramOutputStream;
  }
  
  public int capacity()
  {
    return this.buffer.capacity();
  }
  
  public void flush()
  {
    flushBuffer();
    flushStream();
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  public boolean isBound()
  {
    return this.outstream != null;
  }
  
  public int length()
  {
    return this.buffer.length();
  }
  
  public void write(int paramInt)
  {
    if (this.fragementSizeHint > 0)
    {
      if (this.buffer.isFull()) {
        flushBuffer();
      }
      this.buffer.append(paramInt);
      return;
    }
    flushBuffer();
    this.outstream.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    if ((paramInt2 > this.fragementSizeHint) || (paramInt2 > this.buffer.capacity()))
    {
      flushBuffer();
      streamWrite(paramArrayOfByte, paramInt1, paramInt2);
      this.metrics.incrementBytesTransferred(paramInt2);
      return;
    }
    if (paramInt2 > this.buffer.capacity() - this.buffer.length()) {
      flushBuffer();
    }
    this.buffer.append(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void writeLine(String paramString)
  {
    if (paramString == null) {
      return;
    }
    if (paramString.length() > 0)
    {
      if (this.encoder == null)
      {
        int i = 0;
        while (i < paramString.length())
        {
          write(paramString.charAt(i));
          i += 1;
        }
      }
      writeEncoded(CharBuffer.wrap(paramString));
    }
    write(CRLF);
  }
  
  public void writeLine(CharArrayBuffer paramCharArrayBuffer)
  {
    int j = 0;
    if (paramCharArrayBuffer == null) {
      return;
    }
    if (this.encoder == null)
    {
      int i = paramCharArrayBuffer.length();
      while (i > 0)
      {
        int k = Math.min(this.buffer.capacity() - this.buffer.length(), i);
        if (k > 0) {
          this.buffer.append(paramCharArrayBuffer, j, k);
        }
        if (this.buffer.isFull()) {
          flushBuffer();
        }
        j += k;
        i -= k;
      }
    }
    writeEncoded(CharBuffer.wrap(paramCharArrayBuffer.buffer(), 0, paramCharArrayBuffer.length()));
    write(CRLF);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\SessionOutputBufferImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */