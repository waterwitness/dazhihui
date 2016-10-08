package com.d.a.c.d;

import com.d.a.ag;
import com.d.a.ai;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.zip.Deflater;

final class ah
  implements j
{
  ai a = new ai();
  ai b = new ai();
  private final ag c;
  private final boolean d;
  private boolean e;
  private ai f = new ai();
  private final Deflater g = new Deflater();
  
  ah(ag paramag, boolean paramBoolean)
  {
    this.c = paramag;
    this.d = paramBoolean;
    this.g.setDictionary(ab.a);
  }
  
  private ai a(List<k> paramList)
  {
    if (this.b.e()) {
      throw new IllegalStateException();
    }
    Object localObject1 = ai.c(8192).order(ByteOrder.BIG_ENDIAN);
    ((ByteBuffer)localObject1).putInt(paramList.size());
    int j = paramList.size();
    int i = 0;
    if (i >= j)
    {
      ((ByteBuffer)localObject1).flip();
      this.g.setInput(((ByteBuffer)localObject1).array(), 0, ((ByteBuffer)localObject1).remaining());
      label81:
      if (this.g.needsInput())
      {
        ai.c((ByteBuffer)localObject1);
        return this.b;
      }
    }
    else
    {
      Object localObject2 = ((k)paramList.get(i)).h;
      ((ByteBuffer)localObject1).putInt(((f)localObject2).d());
      ((ByteBuffer)localObject1).put(((f)localObject2).e());
      localObject2 = ((k)paramList.get(i)).i;
      ((ByteBuffer)localObject1).putInt(((f)localObject2).d());
      ((ByteBuffer)localObject1).put(((f)localObject2).e());
      if (((ByteBuffer)localObject1).remaining() >= ((ByteBuffer)localObject1).capacity() / 2) {
        break label269;
      }
      localObject2 = ai.c(((ByteBuffer)localObject1).capacity() * 2).order(ByteOrder.BIG_ENDIAN);
      ((ByteBuffer)localObject1).flip();
      ((ByteBuffer)localObject2).put((ByteBuffer)localObject1);
      ai.c((ByteBuffer)localObject1);
      localObject1 = localObject2;
    }
    label269:
    for (;;)
    {
      i += 1;
      break;
      paramList = ai.c(((ByteBuffer)localObject1).capacity()).order(ByteOrder.BIG_ENDIAN);
      paramList.limit(this.g.deflate(paramList.array(), 0, paramList.capacity(), 2));
      this.b.a(paramList);
      break label81;
    }
  }
  
  public void a() {}
  
  void a(int paramInt1, int paramInt2, ai paramai)
  {
    if (this.e) {
      throw new IOException("closed");
    }
    int i = paramai.d();
    if (i > 16777215L) {
      throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i);
    }
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(0x7FFFFFFF & paramInt1);
    localByteBuffer.putInt(i & 0xFFFFFF | (paramInt2 & 0xFF) << 24);
    localByteBuffer.flip();
    this.a.a(localByteBuffer).b(paramai);
    this.c.a(this.a);
  }
  
  public void a(int paramInt1, int paramInt2, List<k> paramList) {}
  
  public void a(int paramInt, long paramLong)
  {
    try
    {
      if (this.e) {
        throw new IOException("closed");
      }
    }
    finally {}
    if ((paramLong == 0L) || (paramLong > 2147483647L)) {
      throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + paramLong);
    }
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(-2147287031);
    localByteBuffer.putInt(8);
    localByteBuffer.putInt(paramInt);
    localByteBuffer.putInt((int)paramLong);
    localByteBuffer.flip();
    this.c.a(this.f.a(new ByteBuffer[] { localByteBuffer }));
  }
  
  public void a(int paramInt, g paramg)
  {
    try
    {
      if (this.e) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramg.s == -1) {
      throw new IllegalArgumentException();
    }
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(-2147287037);
    localByteBuffer.putInt(8);
    localByteBuffer.putInt(0x7FFFFFFF & paramInt);
    localByteBuffer.putInt(paramg.s);
    localByteBuffer.flip();
    this.c.a(this.f.a(new ByteBuffer[] { localByteBuffer }));
  }
  
  public void a(aa paramaa)
  {
    int i = 0;
    try
    {
      if (this.e) {
        throw new IOException("closed");
      }
    }
    finally {}
    int j = paramaa.b();
    ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
    localByteBuffer.putInt(-2147287036);
    localByteBuffer.putInt(j * 8 + 4 & 0xFFFFFF | 0x0);
    localByteBuffer.putInt(j);
    for (;;)
    {
      if (i > 10)
      {
        localByteBuffer.flip();
        this.c.a(this.f.a(new ByteBuffer[] { localByteBuffer }));
        return;
      }
      if (paramaa.a(i))
      {
        localByteBuffer.putInt((paramaa.c(i) & 0xFF) << 24 | i & 0xFFFFFF);
        localByteBuffer.putInt(paramaa.b(i));
      }
      i += 1;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    try
    {
      if (this.e) {
        throw new IOException("closed");
      }
    }
    finally {}
    int i = this.d;
    if ((paramInt1 & 0x1) == 1) {}
    for (;;)
    {
      if (paramBoolean != (paramInt2 ^ i)) {
        throw new IllegalArgumentException("payload != reply");
      }
      ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
      localByteBuffer.putInt(-2147287034);
      localByteBuffer.putInt(4);
      localByteBuffer.putInt(paramInt1);
      localByteBuffer.flip();
      this.c.a(this.f.a(new ByteBuffer[] { localByteBuffer }));
      return;
      paramInt2 = 0;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt, ai paramai)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      try
      {
        a(paramInt, i, paramai);
        return;
      }
      finally {}
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<k> paramList)
  {
    try
    {
      if (this.e) {
        throw new IOException("closed");
      }
    }
    finally {}
    paramList = a(paramList);
    int k = paramList.d();
    int i;
    if (paramBoolean1) {
      i = 1;
    }
    for (;;)
    {
      ByteBuffer localByteBuffer = ai.c(256).order(ByteOrder.BIG_ENDIAN);
      localByteBuffer.putInt(-2147287039);
      localByteBuffer.putInt(((j | i) & 0xFF) << 24 | k + 10 & 0xFFFFFF);
      localByteBuffer.putInt(paramInt1 & 0x7FFFFFFF);
      localByteBuffer.putInt(paramInt2 & 0x7FFFFFFF);
      localByteBuffer.putShort((short)0);
      localByteBuffer.flip();
      this.c.a(this.f.a(localByteBuffer).b(paramList));
      return;
      i = 0;
      while (!paramBoolean2)
      {
        j = 0;
        break;
      }
      int j = 2;
    }
  }
  
  public void b() {}
  
  public void close()
  {
    try
    {
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */