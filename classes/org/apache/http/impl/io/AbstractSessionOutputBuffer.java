package org.apache.http.impl.io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
@NotThreadSafe
public abstract class AbstractSessionOutputBuffer
  implements BufferInfo, SessionOutputBuffer
{
  private static final byte[] CRLF = { 13, 10 };
  private boolean ascii;
  private ByteBuffer bbuf;
  private ByteArrayBuffer buffer;
  private Charset charset;
  private CharsetEncoder encoder;
  private HttpTransportMetricsImpl metrics;
  private int minChunkLimit;
  private CodingErrorAction onMalformedCharAction;
  private CodingErrorAction onUnmappableCharAction;
  private OutputStream outstream;
  
  public AbstractSessionOutputBuffer() {}
  
  protected AbstractSessionOutputBuffer(OutputStream paramOutputStream, int paramInt1, Charset paramCharset, int paramInt2, CodingErrorAction paramCodingErrorAction1, CodingErrorAction paramCodingErrorAction2)
  {
    Args.notNull(paramOutputStream, "Input stream");
    Args.notNegative(paramInt1, "Buffer size");
    this.outstream = paramOutputStream;
    this.buffer = new ByteArrayBuffer(paramInt1);
    if (paramCharset != null)
    {
      this.charset = paramCharset;
      this.ascii = this.charset.equals(Consts.ASCII);
      this.encoder = null;
      if (paramInt2 < 0) {
        break label112;
      }
      label68:
      this.minChunkLimit = paramInt2;
      this.metrics = createTransportMetrics();
      if (paramCodingErrorAction1 == null) {
        break label120;
      }
      label87:
      this.onMalformedCharAction = paramCodingErrorAction1;
      if (paramCodingErrorAction2 == null) {
        break label128;
      }
    }
    for (;;)
    {
      this.onUnmappableCharAction = paramCodingErrorAction2;
      return;
      paramCharset = Consts.ASCII;
      break;
      label112:
      paramInt2 = 512;
      break label68;
      label120:
      paramCodingErrorAction1 = CodingErrorAction.REPORT;
      break label87;
      label128:
      paramCodingErrorAction2 = CodingErrorAction.REPORT;
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
  
  private void writeEncoded(CharBuffer paramCharBuffer)
  {
    if (!paramCharBuffer.hasRemaining()) {
      return;
    }
    if (this.encoder == null)
    {
      this.encoder = this.charset.newEncoder();
      this.encoder.onMalformedInput(this.onMalformedCharAction);
      this.encoder.onUnmappableCharacter(this.onUnmappableCharAction);
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
  
  public int capacity()
  {
    return this.buffer.capacity();
  }
  
  protected HttpTransportMetricsImpl createTransportMetrics()
  {
    return new HttpTransportMetricsImpl();
  }
  
  public void flush()
  {
    flushBuffer();
    this.outstream.flush();
  }
  
  protected void flushBuffer()
  {
    int i = this.buffer.length();
    if (i > 0)
    {
      this.outstream.write(this.buffer.buffer(), 0, i);
      this.buffer.clear();
      this.metrics.incrementBytesTransferred(i);
    }
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  protected void init(OutputStream paramOutputStream, int paramInt, HttpParams paramHttpParams)
  {
    Args.notNull(paramOutputStream, "Input stream");
    Args.notNegative(paramInt, "Buffer size");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.outstream = paramOutputStream;
    this.buffer = new ByteArrayBuffer(paramInt);
    paramOutputStream = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    if (paramOutputStream != null)
    {
      paramOutputStream = Charset.forName(paramOutputStream);
      this.charset = paramOutputStream;
      this.ascii = this.charset.equals(Consts.ASCII);
      this.encoder = null;
      this.minChunkLimit = paramHttpParams.getIntParameter("http.connection.min-chunk-limit", 512);
      this.metrics = createTransportMetrics();
      paramOutputStream = (CodingErrorAction)paramHttpParams.getParameter("http.malformed.input.action");
      if (paramOutputStream == null) {
        break label156;
      }
      label122:
      this.onMalformedCharAction = paramOutputStream;
      paramOutputStream = (CodingErrorAction)paramHttpParams.getParameter("http.unmappable.input.action");
      if (paramOutputStream == null) {
        break label163;
      }
    }
    for (;;)
    {
      this.onUnmappableCharAction = paramOutputStream;
      return;
      paramOutputStream = Consts.ASCII;
      break;
      label156:
      paramOutputStream = CodingErrorAction.REPORT;
      break label122;
      label163:
      paramOutputStream = CodingErrorAction.REPORT;
    }
  }
  
  public int length()
  {
    return this.buffer.length();
  }
  
  public void write(int paramInt)
  {
    if (this.buffer.isFull()) {
      flushBuffer();
    }
    this.buffer.append(paramInt);
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
    if ((paramInt2 > this.minChunkLimit) || (paramInt2 > this.buffer.capacity()))
    {
      flushBuffer();
      this.outstream.write(paramArrayOfByte, paramInt1, paramInt2);
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
      if (this.ascii)
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
    if (this.ascii)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\io\AbstractSessionOutputBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */