package org.apache.http.impl.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class SessionInputBufferImpl
  implements BufferInfo, SessionInputBuffer
{
  private final byte[] buffer;
  private int bufferlen;
  private int bufferpos;
  private CharBuffer cbuf;
  private final MessageConstraints constraints;
  private final CharsetDecoder decoder;
  private InputStream instream;
  private final ByteArrayBuffer linebuffer;
  private final HttpTransportMetricsImpl metrics;
  private final int minChunkLimit;
  
  public SessionInputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt)
  {
    this(paramHttpTransportMetricsImpl, paramInt, paramInt, null, null);
  }
  
  public SessionInputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt1, int paramInt2, MessageConstraints paramMessageConstraints, CharsetDecoder paramCharsetDecoder)
  {
    Args.notNull(paramHttpTransportMetricsImpl, "HTTP transport metrcis");
    Args.positive(paramInt1, "Buffer size");
    this.metrics = paramHttpTransportMetricsImpl;
    this.buffer = new byte[paramInt1];
    this.bufferpos = 0;
    this.bufferlen = 0;
    if (paramInt2 >= 0)
    {
      this.minChunkLimit = paramInt2;
      if (paramMessageConstraints == null) {
        break label86;
      }
    }
    for (;;)
    {
      this.constraints = paramMessageConstraints;
      this.linebuffer = new ByteArrayBuffer(paramInt1);
      this.decoder = paramCharsetDecoder;
      return;
      paramInt2 = 512;
      break;
      label86:
      paramMessageConstraints = MessageConstraints.DEFAULT;
    }
  }
  
  private int appendDecoded(CharArrayBuffer paramCharArrayBuffer, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    if (!paramByteBuffer.hasRemaining()) {
      return 0;
    }
    if (this.cbuf == null) {
      this.cbuf = CharBuffer.allocate(1024);
    }
    this.decoder.reset();
    while (paramByteBuffer.hasRemaining()) {
      i += handleDecodingResult(this.decoder.decode(paramByteBuffer, this.cbuf, true), paramCharArrayBuffer, paramByteBuffer);
    }
    int j = handleDecodingResult(this.decoder.flush(this.cbuf), paramCharArrayBuffer, paramByteBuffer);
    this.cbuf.clear();
    return i + j;
  }
  
  private int handleDecodingResult(CoderResult paramCoderResult, CharArrayBuffer paramCharArrayBuffer, ByteBuffer paramByteBuffer)
  {
    if (paramCoderResult.isError()) {
      paramCoderResult.throwException();
    }
    this.cbuf.flip();
    int i = this.cbuf.remaining();
    while (this.cbuf.hasRemaining()) {
      paramCharArrayBuffer.append(this.cbuf.get());
    }
    this.cbuf.compact();
    return i;
  }
  
  private int lineFromLineBuffer(CharArrayBuffer paramCharArrayBuffer)
  {
    int k = this.linebuffer.length();
    int i = k;
    if (k > 0)
    {
      int j = k;
      if (this.linebuffer.byteAt(k - 1) == 10) {
        j = k - 1;
      }
      i = j;
      if (j > 0)
      {
        i = j;
        if (this.linebuffer.byteAt(j - 1) == 13) {
          i = j - 1;
        }
      }
    }
    if (this.decoder == null) {
      paramCharArrayBuffer.append(this.linebuffer, 0, i);
    }
    for (;;)
    {
      this.linebuffer.clear();
      return i;
      i = appendDecoded(paramCharArrayBuffer, ByteBuffer.wrap(this.linebuffer.buffer(), 0, i));
    }
  }
  
  private int lineFromReadBuffer(CharArrayBuffer paramCharArrayBuffer, int paramInt)
  {
    int j = this.bufferpos;
    this.bufferpos = (paramInt + 1);
    int i = paramInt;
    if (paramInt > j)
    {
      i = paramInt;
      if (this.buffer[(paramInt - 1)] == 13) {
        i = paramInt - 1;
      }
    }
    paramInt = i - j;
    if (this.decoder == null)
    {
      paramCharArrayBuffer.append(this.buffer, j, paramInt);
      return paramInt;
    }
    return appendDecoded(paramCharArrayBuffer, ByteBuffer.wrap(this.buffer, j, paramInt));
  }
  
  private int locateLF()
  {
    int i = this.bufferpos;
    while (i < this.bufferlen)
    {
      if (this.buffer[i] == 10) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  private int streamRead(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Asserts.notNull(this.instream, "Input stream");
    return this.instream.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int available()
  {
    return capacity() - length();
  }
  
  public void bind(InputStream paramInputStream)
  {
    this.instream = paramInputStream;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public void clear()
  {
    this.bufferpos = 0;
    this.bufferlen = 0;
  }
  
  public int fillBuffer()
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
    j = streamRead(this.buffer, i, j - i);
    if (j == -1) {
      return -1;
    }
    this.bufferlen = (i + j);
    this.metrics.incrementBytesTransferred(j);
    return j;
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  public boolean hasBufferedData()
  {
    return this.bufferpos < this.bufferlen;
  }
  
  public boolean isBound()
  {
    return this.instream != null;
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    return hasBufferedData();
  }
  
  public int length()
  {
    return this.bufferlen - this.bufferpos;
  }
  
  public int read()
  {
    while (!hasBufferedData()) {
      if (fillBuffer() == -1) {
        return -1;
      }
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.bufferpos;
    this.bufferpos = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 0;
    }
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      paramInt1 = 0;
    }
    do
    {
      return paramInt1;
      if (hasBufferedData())
      {
        paramInt2 = Math.min(paramInt2, this.bufferlen - this.bufferpos);
        System.arraycopy(this.buffer, this.bufferpos, paramArrayOfByte, paramInt1, paramInt2);
        this.bufferpos += paramInt2;
        return paramInt2;
      }
      if (paramInt2 <= this.minChunkLimit) {
        break;
      }
      paramInt2 = streamRead(paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    } while (paramInt2 <= 0);
    this.metrics.incrementBytesTransferred(paramInt2);
    return paramInt2;
    while (!hasBufferedData()) {
      if (fillBuffer() == -1) {
        return -1;
      }
    }
    paramInt2 = Math.min(paramInt2, this.bufferlen - this.bufferpos);
    System.arraycopy(this.buffer, this.bufferpos, paramArrayOfByte, paramInt1, paramInt2);
    this.bufferpos += paramInt2;
    return paramInt2;
  }
  
  public int readLine(CharArrayBuffer paramCharArrayBuffer)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    int j = 1;
    int k = 0;
    if (j != 0)
    {
      int i = locateLF();
      int m;
      if (i != -1)
      {
        if (this.linebuffer.isEmpty()) {
          return lineFromReadBuffer(paramCharArrayBuffer, i);
        }
        j = this.bufferpos;
        this.linebuffer.append(this.buffer, this.bufferpos, i + 1 - j);
        this.bufferpos = (i + 1);
        i = 0;
        m = k;
      }
      for (;;)
      {
        int n = this.constraints.getMaxLineLength();
        j = i;
        k = m;
        if (n <= 0) {
          break;
        }
        j = i;
        k = m;
        if (this.linebuffer.length() < n) {
          break;
        }
        throw new MessageConstraintException("Maximum line length limit exceeded");
        if (hasBufferedData())
        {
          i = this.bufferlen;
          k = this.bufferpos;
          this.linebuffer.append(this.buffer, this.bufferpos, i - k);
          this.bufferpos = this.bufferlen;
        }
        k = fillBuffer();
        i = j;
        m = k;
        if (k == -1)
        {
          i = 0;
          m = k;
        }
      }
    }
    if ((k == -1) && (this.linebuffer.isEmpty())) {
      return -1;
    }
    return lineFromLineBuffer(paramCharArrayBuffer);
  }
  
  public String readLine()
  {
    CharArrayBuffer localCharArrayBuffer = new CharArrayBuffer(64);
    if (readLine(localCharArrayBuffer) != -1) {
      return localCharArrayBuffer.toString();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\SessionInputBufferImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */