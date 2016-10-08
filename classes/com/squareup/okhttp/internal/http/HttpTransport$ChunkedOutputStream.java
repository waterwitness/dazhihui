package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class HttpTransport$ChunkedOutputStream
  extends AbstractOutputStream
{
  private static final byte[] CRLF = { 13, 10 };
  private static final byte[] FINAL_CHUNK = { 48, 13, 10, 13, 10 };
  private static final byte[] HEX_DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private final ByteArrayOutputStream bufferedChunk;
  private final byte[] hex;
  private final int maxChunkLength;
  private final OutputStream socketOut;
  
  private HttpTransport$ChunkedOutputStream(OutputStream paramOutputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[10];
    arrayOfByte[8] = 13;
    arrayOfByte[9] = 10;
    this.hex = arrayOfByte;
    this.socketOut = paramOutputStream;
    this.maxChunkLength = Math.max(1, dataLength(paramInt));
    this.bufferedChunk = new ByteArrayOutputStream(paramInt);
  }
  
  private int dataLength(int paramInt)
  {
    int j = 4;
    int i = paramInt - 4;
    for (;;)
    {
      if (i <= 0) {
        return paramInt - j;
      }
      j += 1;
      i >>= 4;
    }
  }
  
  private void writeBufferedChunkToSocket()
  {
    int i = this.bufferedChunk.size();
    if (i <= 0) {
      return;
    }
    writeHex(i);
    this.bufferedChunk.writeTo(this.socketOut);
    this.bufferedChunk.reset();
    this.socketOut.write(CRLF);
  }
  
  private void writeHex(int paramInt)
  {
    int i = 8;
    int j;
    int k;
    do
    {
      byte[] arrayOfByte = this.hex;
      j = i - 1;
      arrayOfByte[j] = HEX_DIGITS[(paramInt & 0xF)];
      k = paramInt >>> 4;
      i = j;
      paramInt = k;
    } while (k != 0);
    this.socketOut.write(this.hex, j, this.hex.length - j);
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 101	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:closed	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 101	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:closed	Z
    //   19: aload_0
    //   20: invokespecial 103	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:writeBufferedChunkToSocket	()V
    //   23: aload_0
    //   24: getfield 50	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:socketOut	Ljava/io/OutputStream;
    //   27: getstatic 41	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:FINAL_CHUNK	[B
    //   30: invokevirtual 93	java/io/OutputStream:write	([B)V
    //   33: goto -22 -> 11
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	ChunkedOutputStream
    //   36	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	36	finally
    //   14	33	36	finally
  }
  
  /* Error */
  public void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 101	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:closed	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokespecial 103	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:writeBufferedChunkToSocket	()V
    //   18: aload_0
    //   19: getfield 50	com/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream:socketOut	Ljava/io/OutputStream;
    //   22: invokevirtual 106	java/io/OutputStream:flush	()V
    //   25: goto -14 -> 11
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	ChunkedOutputStream
    //   28	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   14	25	28	finally
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i;
      try
      {
        checkNotClosed();
        Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
        if (paramInt2 <= 0) {
          return;
        }
        if ((this.bufferedChunk.size() > 0) || (paramInt2 < this.maxChunkLength))
        {
          int j = Math.min(paramInt2, this.maxChunkLength - this.bufferedChunk.size());
          this.bufferedChunk.write(paramArrayOfByte, paramInt1, j);
          i = j;
          if (this.bufferedChunk.size() == this.maxChunkLength)
          {
            writeBufferedChunkToSocket();
            i = j;
          }
        }
        else
        {
          i = this.maxChunkLength;
          writeHex(i);
          this.socketOut.write(paramArrayOfByte, paramInt1, i);
          this.socketOut.write(CRLF);
        }
      }
      finally {}
      paramInt1 += i;
      paramInt2 -= i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpTransport$ChunkedOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */