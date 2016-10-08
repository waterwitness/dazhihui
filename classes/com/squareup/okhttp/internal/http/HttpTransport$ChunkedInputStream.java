package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheRequest;
import java.net.ProtocolException;

class HttpTransport$ChunkedInputStream
  extends AbstractHttpInputStream
{
  private static final int NO_CHUNK_YET = -1;
  private int bytesRemainingInChunk = -1;
  private boolean hasMoreChunks = true;
  private final HttpTransport transport;
  
  HttpTransport$ChunkedInputStream(InputStream paramInputStream, CacheRequest paramCacheRequest, HttpTransport paramHttpTransport)
  {
    super(paramInputStream, HttpTransport.access$1(paramHttpTransport), paramCacheRequest);
    this.transport = paramHttpTransport;
  }
  
  private void readChunkSize()
  {
    if (this.bytesRemainingInChunk != -1) {
      Util.readAsciiLine(this.in);
    }
    String str = Util.readAsciiLine(this.in);
    int i = str.indexOf(";");
    Object localObject = str;
    if (i != -1) {
      localObject = str.substring(0, i);
    }
    try
    {
      this.bytesRemainingInChunk = Integer.parseInt(((String)localObject).trim(), 16);
      if (this.bytesRemainingInChunk == 0)
      {
        this.hasMoreChunks = false;
        localObject = this.httpEngine.responseHeaders.getHeaders();
        RawHeaders.readHeaders(HttpTransport.access$2(this.transport), (RawHeaders)localObject);
        this.httpEngine.receiveHeaders((RawHeaders)localObject);
        endOfInput();
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new ProtocolException("Expected a hex chunk size but was " + (String)localObject);
    }
  }
  
  public int available()
  {
    checkNotClosed();
    if ((!this.hasMoreChunks) || (this.bytesRemainingInChunk == -1)) {
      return 0;
    }
    return Math.min(this.in.available(), this.bytesRemainingInChunk);
  }
  
  public void close()
  {
    if (this.closed) {
      return;
    }
    if ((this.hasMoreChunks) && (!HttpTransport.access$0(this.httpEngine, this))) {
      unexpectedEndOfInput();
    }
    this.closed = true;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
    checkNotClosed();
    if (!this.hasMoreChunks) {}
    do
    {
      return -1;
      if ((this.bytesRemainingInChunk != 0) && (this.bytesRemainingInChunk != -1)) {
        break;
      }
      readChunkSize();
    } while (!this.hasMoreChunks);
    paramInt2 = this.in.read(paramArrayOfByte, paramInt1, Math.min(paramInt2, this.bytesRemainingInChunk));
    if (paramInt2 == -1)
    {
      unexpectedEndOfInput();
      throw new IOException("unexpected end of stream");
    }
    this.bytesRemainingInChunk -= paramInt2;
    cacheWrite(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpTransport$ChunkedInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */