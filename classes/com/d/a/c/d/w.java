package com.d.a.c.d;

import com.d.a.ag;
import com.d.a.ai;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class w
  implements j
{
  private final ag a;
  private final boolean b;
  private final q c;
  private boolean d;
  private final ai e = new ai();
  
  w(ag paramag, boolean paramBoolean)
  {
    this.a = paramag;
    this.b = paramBoolean;
    this.c = new q();
  }
  
  private void a(ai paramai, int paramInt)
  {
    if (!paramai.e()) {
      return;
    }
    int i = Math.min(16383, paramai.d());
    if (paramai.d() - i == 0) {}
    for (byte b1 = 4;; b1 = 0)
    {
      a(paramInt, i, (byte)9, b1);
      paramai.a(this.e, i);
      this.a.a(this.e);
      break;
    }
  }
  
  public void a()
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    boolean bool = this.b;
    if (!bool) {}
    for (;;)
    {
      return;
      if (r.a().isLoggable(Level.FINE)) {
        r.a().fine(String.format(">> CONNECTION %s", new Object[] { r.b().b() }));
      }
      this.a.a(new ai(r.b().e()));
    }
  }
  
  void a(int paramInt, byte paramByte, ai paramai)
  {
    a(paramInt, paramai.d(), (byte)0, paramByte);
    this.a.a(paramai);
  }
  
  void a(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    if (r.a().isLoggable(Level.FINE)) {
      r.a().fine(s.a(false, paramInt1, paramInt2, paramByte1, paramByte2));
    }
    if (paramInt2 > 16383) {
      throw r.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(16383), Integer.valueOf(paramInt2) });
    }
    if ((0x80000000 & paramInt1) != 0) {
      throw r.b("reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) });
    }
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt((paramInt2 & 0x3FFF) << 16 | (paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
    localByteBuffer.putInt(0x7FFFFFFF & paramInt1);
    localByteBuffer.flip();
    this.a.a(this.e.a(localByteBuffer));
  }
  
  public void a(int paramInt1, int paramInt2, List<k> paramList)
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    paramList = this.c.a(paramList);
    long l = paramList.d();
    int i = (int)Math.min(16379L, l);
    if (l == i) {}
    for (byte b1 = 4;; b1 = 0)
    {
      a(paramInt1, i + 4, (byte)5, b1);
      ByteBuffer localByteBuffer = ai.c(8192).order(ByteOrder.BIG_ENDIAN);
      localByteBuffer.putInt(0x7FFFFFFF & paramInt2);
      localByteBuffer.flip();
      this.e.a(localByteBuffer);
      paramList.a(this.e, i);
      this.a.a(this.e);
      if (l > i) {
        a(paramList, paramInt1);
      }
      return;
    }
  }
  
  public void a(int paramInt, long paramLong)
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    if ((paramLong == 0L) || (paramLong > 2147483647L)) {
      throw r.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) });
    }
    a(paramInt, 4, (byte)8, (byte)0);
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt((int)paramLong);
    localByteBuffer.flip();
    this.a.a(this.e.a(localByteBuffer));
  }
  
  public void a(int paramInt, g paramg)
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramg.s == -1) {
      throw new IllegalArgumentException();
    }
    a(paramInt, 4, (byte)3, (byte)0);
    ByteBuffer localByteBuffer = ai.c(8192).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(paramg.r);
    localByteBuffer.flip();
    this.a.a(this.e.a(localByteBuffer));
  }
  
  public void a(aa paramaa)
  {
    int i = 0;
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    a(0, paramaa.b() * 6, (byte)4, (byte)0);
    ByteBuffer localByteBuffer = ai.c(8192).order(ByteOrder.BIG_ENDIAN);
    if (i >= 10)
    {
      localByteBuffer.flip();
      this.a.a(this.e.a(localByteBuffer));
      return;
    }
    if (!paramaa.a(i)) {
      break label132;
    }
    for (;;)
    {
      label93:
      localByteBuffer.putShort((short)j);
      localByteBuffer.putInt(paramaa.b(i));
      label132:
      do
      {
        if (i == 7)
        {
          j = 4;
          break label93;
        }
        j = i;
        break label93;
        i += 1;
        break;
      } while (i != 4);
      int j = 3;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    byte b1 = 0;
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramBoolean) {
      b1 = 1;
    }
    a(0, 8, (byte)6, b1);
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(paramInt1);
    localByteBuffer.putInt(paramInt2);
    localByteBuffer.flip();
    this.a.a(this.e.a(localByteBuffer));
  }
  
  public void a(boolean paramBoolean, int paramInt, ai paramai)
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    byte b1 = 0;
    if (paramBoolean) {
      b1 = (byte)1;
    }
    a(paramInt, b1, paramai);
  }
  
  void a(boolean paramBoolean, int paramInt, List<k> paramList)
  {
    if (this.d) {
      throw new IOException("closed");
    }
    paramList = this.c.a(paramList);
    long l = paramList.d();
    int i = (int)Math.min(16383L, l);
    if (l == i) {}
    for (byte b1 = 4;; b1 = 0)
    {
      byte b2 = b1;
      if (paramBoolean) {
        b2 = (byte)(b1 | 0x1);
      }
      a(paramInt, i, (byte)1, b2);
      paramList.a(this.e, i);
      this.a.a(this.e);
      if (l > i) {
        a(paramList, paramInt);
      }
      return;
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<k> paramList)
  {
    if (paramBoolean2) {
      try
      {
        throw new UnsupportedOperationException();
      }
      finally {}
    }
    if (this.d) {
      throw new IOException("closed");
    }
    a(paramBoolean1, paramInt1, paramList);
  }
  
  public void b()
  {
    try
    {
      if (this.d) {
        throw new IOException("closed");
      }
    }
    finally {}
    a(0, 0, (byte)4, (byte)1);
  }
  
  public void close()
  {
    try
    {
      this.d = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */