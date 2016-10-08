package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;

final class Spdy3$Writer
  implements FrameWriter
{
  private final boolean client;
  private final ByteArrayOutputStream nameValueBlockBuffer;
  private final DataOutputStream nameValueBlockOut;
  private final DataOutputStream out;
  
  Spdy3$Writer(OutputStream paramOutputStream, boolean paramBoolean)
  {
    this.out = new DataOutputStream(paramOutputStream);
    this.client = paramBoolean;
    paramOutputStream = new Deflater();
    paramOutputStream.setDictionary(Spdy3.DICTIONARY);
    this.nameValueBlockBuffer = new ByteArrayOutputStream();
    this.nameValueBlockOut = new DataOutputStream(Platform.get().newDeflaterOutputStream(this.nameValueBlockBuffer, paramOutputStream, true));
  }
  
  private void writeNameValueBlockToBuffer(List<String> paramList)
  {
    this.nameValueBlockBuffer.reset();
    int i = paramList.size() / 2;
    this.nameValueBlockOut.writeInt(i);
    paramList = paramList.iterator();
    for (;;)
    {
      if (!paramList.hasNext())
      {
        this.nameValueBlockOut.flush();
        return;
      }
      String str = (String)paramList.next();
      this.nameValueBlockOut.writeInt(str.length());
      this.nameValueBlockOut.write(str.getBytes("UTF-8"));
    }
  }
  
  public void close()
  {
    Util.closeAll(this.out, this.nameValueBlockOut);
  }
  
  public void connectionHeader() {}
  
  public void data(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      data(paramBoolean, paramInt, paramArrayOfByte, 0, paramArrayOfByte.length);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void data(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      try
      {
        this.out.writeInt(0x7FFFFFFF & paramInt1);
        this.out.writeInt((i & 0xFF) << 24 | 0xFFFFFF & paramInt3);
        this.out.write(paramArrayOfByte, paramInt2, paramInt3);
        return;
      }
      finally {}
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
  
  public void goAway(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      if (paramErrorCode.spdyGoAwayCode == -1) {
        throw new IllegalArgumentException();
      }
    }
    finally {}
    this.out.writeInt(-2147287033);
    this.out.writeInt(8);
    this.out.writeInt(paramInt);
    this.out.writeInt(paramErrorCode.spdyGoAwayCode);
    this.out.flush();
  }
  
  public void headers(int paramInt, List<String> paramList)
  {
    try
    {
      writeNameValueBlockToBuffer(paramList);
      int i = this.nameValueBlockBuffer.size();
      this.out.writeInt(-2147287032);
      this.out.writeInt(i + 4 & 0xFFFFFF | 0x0);
      this.out.writeInt(0x7FFFFFFF & paramInt);
      this.nameValueBlockBuffer.writeTo(this.out);
      this.out.flush();
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
      this.out.writeInt(-2147287035);
      this.out.writeInt(0);
      this.out.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    for (;;)
    {
      try
      {
        int i = this.client;
        if (paramInt1 % 2 == 1)
        {
          if (paramBoolean == (paramInt2 ^ i)) {
            break;
          }
          throw new IllegalArgumentException("payload != reply");
        }
      }
      finally {}
      paramInt2 = 0;
    }
    this.out.writeInt(-2147287034);
    this.out.writeInt(4);
    this.out.writeInt(paramInt1);
    this.out.flush();
  }
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      if (paramErrorCode.spdyRstCode == -1) {
        throw new IllegalArgumentException();
      }
    }
    finally {}
    this.out.writeInt(-2147287037);
    this.out.writeInt(8);
    this.out.writeInt(0x7FFFFFFF & paramInt);
    this.out.writeInt(paramErrorCode.spdyRstCode);
    this.out.flush();
  }
  
  public void settings(Settings paramSettings)
  {
    for (;;)
    {
      int i;
      try
      {
        i = paramSettings.size();
        this.out.writeInt(-2147287036);
        this.out.writeInt(i * 8 + 4 & 0xFFFFFF | 0x0);
        this.out.writeInt(i);
        i = 0;
        if (i > 10)
        {
          this.out.flush();
          return;
        }
        if (paramSettings.isSet(i))
        {
          int j = paramSettings.flags(i);
          this.out.writeInt((j & 0xFF) << 24 | i & 0xFFFFFF);
          this.out.writeInt(paramSettings.get(i));
        }
      }
      finally {}
      i += 1;
    }
  }
  
  /* Error */
  public void synReply(boolean paramBoolean, int paramInt, List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_3
    //   4: invokespecial 140	com/squareup/okhttp/internal/spdy/Spdy3$Writer:writeNameValueBlockToBuffer	(Ljava/util/List;)V
    //   7: iload_1
    //   8: ifeq +80 -> 88
    //   11: iconst_1
    //   12: istore 4
    //   14: aload_0
    //   15: getfield 45	com/squareup/okhttp/internal/spdy/Spdy3$Writer:nameValueBlockBuffer	Ljava/io/ByteArrayOutputStream;
    //   18: invokevirtual 141	java/io/ByteArrayOutputStream:size	()I
    //   21: istore 5
    //   23: aload_0
    //   24: getfield 25	com/squareup/okhttp/internal/spdy/Spdy3$Writer:out	Ljava/io/DataOutputStream;
    //   27: ldc -76
    //   29: invokevirtual 73	java/io/DataOutputStream:writeInt	(I)V
    //   32: aload_0
    //   33: getfield 25	com/squareup/okhttp/internal/spdy/Spdy3$Writer:out	Ljava/io/DataOutputStream;
    //   36: iload 4
    //   38: sipush 255
    //   41: iand
    //   42: bipush 24
    //   44: ishl
    //   45: iload 5
    //   47: iconst_4
    //   48: iadd
    //   49: ldc 121
    //   51: iand
    //   52: ior
    //   53: invokevirtual 73	java/io/DataOutputStream:writeInt	(I)V
    //   56: aload_0
    //   57: getfield 25	com/squareup/okhttp/internal/spdy/Spdy3$Writer:out	Ljava/io/DataOutputStream;
    //   60: ldc 120
    //   62: iload_2
    //   63: iand
    //   64: invokevirtual 73	java/io/DataOutputStream:writeInt	(I)V
    //   67: aload_0
    //   68: getfield 45	com/squareup/okhttp/internal/spdy/Spdy3$Writer:nameValueBlockBuffer	Ljava/io/ByteArrayOutputStream;
    //   71: aload_0
    //   72: getfield 25	com/squareup/okhttp/internal/spdy/Spdy3$Writer:out	Ljava/io/DataOutputStream;
    //   75: invokevirtual 145	java/io/ByteArrayOutputStream:writeTo	(Ljava/io/OutputStream;)V
    //   78: aload_0
    //   79: getfield 25	com/squareup/okhttp/internal/spdy/Spdy3$Writer:out	Ljava/io/DataOutputStream;
    //   82: invokevirtual 86	java/io/DataOutputStream:flush	()V
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: iconst_0
    //   89: istore 4
    //   91: goto -77 -> 14
    //   94: astore_3
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_3
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	Writer
    //   0	99	1	paramBoolean	boolean
    //   0	99	2	paramInt	int
    //   0	99	3	paramList	List<String>
    //   12	78	4	i	int
    //   21	28	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	7	94	finally
    //   14	85	94	finally
  }
  
  public void synStream(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<String> paramList)
  {
    int j = 0;
    for (;;)
    {
      try
      {
        writeNameValueBlockToBuffer(paramList);
        int k = this.nameValueBlockBuffer.size();
        int i;
        if (paramBoolean1)
        {
          i = 1;
          break label148;
          this.out.writeInt(-2147287039);
          this.out.writeInt(((j | i) & 0xFF) << 24 | k + 10 & 0xFFFFFF);
          this.out.writeInt(paramInt1 & 0x7FFFFFFF);
          this.out.writeInt(paramInt2 & 0x7FFFFFFF);
          this.out.writeShort((paramInt3 & 0x7) << 13 | 0x0 | paramInt4 & 0xFF);
          this.nameValueBlockBuffer.writeTo(this.out);
          this.out.flush();
        }
        else
        {
          i = 0;
        }
      }
      finally {}
      label148:
      if (paramBoolean2) {
        j = 2;
      }
    }
  }
  
  public void windowUpdate(int paramInt1, int paramInt2)
  {
    try
    {
      this.out.writeInt(-2147287031);
      this.out.writeInt(8);
      this.out.writeInt(paramInt1);
      this.out.writeInt(paramInt2);
      this.out.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Spdy3$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */