package com.squareup.okhttp.internal.spdy;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.List;

final class Http20Draft06$Writer
  implements FrameWriter
{
  private final boolean client;
  private final ByteArrayOutputStream hpackBuffer;
  private final Hpack.Writer hpackWriter;
  private final DataOutputStream out;
  
  Http20Draft06$Writer(OutputStream paramOutputStream, boolean paramBoolean)
  {
    this.out = new DataOutputStream(paramOutputStream);
    this.client = paramBoolean;
    this.hpackBuffer = new ByteArrayOutputStream();
    this.hpackWriter = new Hpack.Writer(this.hpackBuffer);
  }
  
  private void headers(boolean paramBoolean, int paramInt1, int paramInt2, List<String> paramList)
  {
    this.hpackBuffer.reset();
    this.hpackWriter.writeHeaders(paramList);
    int k = this.hpackBuffer.size();
    int i = 4;
    if (paramBoolean) {
      i = 5;
    }
    int j = i;
    if (paramInt2 != -1) {
      j = i | 0x8;
    }
    this.out.writeInt(j & 0xFF | (k & 0xFFFF) << 16 | 0x100);
    this.out.writeInt(paramInt1 & 0x7FFFFFFF);
    if (paramInt2 != -1) {
      this.out.writeInt(paramInt2 & 0x7FFFFFFF);
    }
    this.hpackBuffer.writeTo(this.out);
  }
  
  public void close()
  {
    this.out.close();
  }
  
  /* Error */
  public void connectionHeader()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 28	com/squareup/okhttp/internal/spdy/Http20Draft06$Writer:client	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 26	com/squareup/okhttp/internal/spdy/Http20Draft06$Writer:out	Ljava/io/DataOutputStream;
    //   18: invokestatic 73	com/squareup/okhttp/internal/spdy/Http20Draft06:access$0	()[B
    //   21: invokevirtual 77	java/io/DataOutputStream:write	([B)V
    //   24: goto -13 -> 11
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	Writer
    //   27	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	27	finally
    //   14	24	27	finally
  }
  
  public void data(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    data(paramBoolean, paramInt, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void data(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 0;
    if (paramBoolean) {
      i = 1;
    }
    try
    {
      this.out.writeInt(i & 0xFF | (0xFFFF & paramInt3) << 16 | 0x0);
      this.out.writeInt(0x7FFFFFFF & paramInt1);
      this.out.write(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void goAway(int paramInt, ErrorCode paramErrorCode) {}
  
  public void headers(int paramInt, List<String> paramList)
  {
    try
    {
      headers(false, paramInt, -1, paramList);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public void noop()
  {
    try
    {
      throw new UnsupportedOperationException();
    }
    finally {}
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2) {}
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      throw new UnsupportedOperationException("TODO");
    }
    finally {}
  }
  
  public void settings(Settings paramSettings)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        int j = paramSettings.size();
        this.out.writeInt((j * 8 & 0xFFFF) << 16 | 0x400 | 0x0);
        this.out.writeInt(0);
        if (i >= 10) {
          return;
        }
        if (paramSettings.isSet(i))
        {
          this.out.writeInt(0xFFFFFF & i);
          this.out.writeInt(paramSettings.get(i));
        }
      }
      finally {}
      i += 1;
    }
  }
  
  public void synReply(boolean paramBoolean, int paramInt, List<String> paramList)
  {
    try
    {
      headers(paramBoolean, paramInt, -1, paramList);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public void synStream(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<String> paramList)
  {
    if (paramBoolean2) {
      try
      {
        throw new UnsupportedOperationException();
      }
      finally {}
    }
    headers(paramBoolean1, paramInt1, paramInt3, paramList);
  }
  
  public void windowUpdate(int paramInt1, int paramInt2) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Http20Draft06$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */