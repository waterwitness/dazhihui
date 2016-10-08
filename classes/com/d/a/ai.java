package com.d.a;

import android.annotation.TargetApi;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.PriorityQueue;

@TargetApi(9)
public class ai
{
  static PriorityQueue<ByteBuffer> c;
  public static int d;
  static int e;
  static int f;
  public static final ByteBuffer g;
  private static int j;
  private static final Object k;
  a<ByteBuffer> a = new a();
  ByteOrder b = ByteOrder.BIG_ENDIAN;
  private int i = 0;
  
  static
  {
    if (!ai.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      h = bool;
      c = new PriorityQueue(8, new aj());
      j = 1048576;
      d = 262144;
      e = 0;
      f = 0;
      k = new Object();
      g = ByteBuffer.allocate(0);
      return;
    }
  }
  
  public ai() {}
  
  public ai(byte[] paramArrayOfByte)
  {
    a(ByteBuffer.wrap(paramArrayOfByte));
  }
  
  public ai(ByteBuffer... paramVarArgs)
  {
    a(paramVarArgs);
  }
  
  public static ByteBuffer c(int paramInt)
  {
    PriorityQueue localPriorityQueue;
    if (paramInt <= f)
    {
      localPriorityQueue = p();
      if (localPriorityQueue == null) {}
    }
    ByteBuffer localByteBuffer;
    label123:
    do
    {
      for (;;)
      {
        synchronized (k)
        {
          if (localPriorityQueue.size() <= 0) {
            return ByteBuffer.allocate(Math.max(8192, paramInt));
          }
          localByteBuffer = (ByteBuffer)localPriorityQueue.remove();
          if (localPriorityQueue.size() == 0) {
            f = 0;
          }
          e -= localByteBuffer.capacity();
          if (h) {
            break;
          }
          if (localPriorityQueue.size() != 0)
          {
            m = 1;
            if (e != 0) {
              break label123;
            }
            n = 1;
            if ((n ^ m) != 0) {
              break;
            }
            throw new AssertionError();
          }
        }
        int m = 0;
        continue;
        int n = 0;
      }
    } while (localByteBuffer.capacity() < paramInt);
    return localByteBuffer;
  }
  
  public static void c(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer == null) || (paramByteBuffer.isDirect())) {}
    PriorityQueue localPriorityQueue;
    do
    {
      do
      {
        return;
      } while ((paramByteBuffer.arrayOffset() != 0) || (paramByteBuffer.array().length != paramByteBuffer.capacity()) || (paramByteBuffer.capacity() < 8192) || (paramByteBuffer.capacity() > d));
      localPriorityQueue = p();
    } while (localPriorityQueue == null);
    for (;;)
    {
      synchronized (k)
      {
        if ((e <= j) || (localPriorityQueue.size() <= 0) || (((ByteBuffer)localPriorityQueue.peek()).capacity() >= paramByteBuffer.capacity()))
        {
          if (e <= j) {
            break;
          }
          return;
        }
      }
      ByteBuffer localByteBuffer = (ByteBuffer)localPriorityQueue.remove();
      e -= localByteBuffer.capacity();
    }
    if ((!h) && (d(paramByteBuffer))) {
      throw new AssertionError();
    }
    paramByteBuffer.position(0);
    paramByteBuffer.limit(paramByteBuffer.capacity());
    e += paramByteBuffer.capacity();
    localPriorityQueue.add(paramByteBuffer);
    int m;
    if (!h)
    {
      if (localPriorityQueue.size() == 0) {
        break label247;
      }
      m = 1;
      if (e != 0) {
        break label253;
      }
    }
    label247:
    label253:
    for (int n = 1;; n = 0)
    {
      if ((n ^ m) == 0) {
        throw new AssertionError();
      }
      f = Math.max(f, paramByteBuffer.capacity());
      return;
      m = 0;
      break;
    }
  }
  
  private ByteBuffer d(int paramInt)
  {
    if (d() < paramInt) {
      throw new IllegalArgumentException("count : " + d() + "/" + paramInt);
    }
    for (Object localObject = (ByteBuffer)this.a.peek();; localObject = (ByteBuffer)this.a.peek())
    {
      if ((localObject == null) || (((ByteBuffer)localObject).hasRemaining()))
      {
        if (localObject != null) {
          break;
        }
        return g;
      }
      c((ByteBuffer)this.a.remove());
    }
    if (((ByteBuffer)localObject).remaining() >= paramInt) {
      return ((ByteBuffer)localObject).order(this.b);
    }
    ByteBuffer localByteBuffer2 = c(paramInt);
    localByteBuffer2.limit(paramInt);
    byte[] arrayOfByte = localByteBuffer2.array();
    int m = 0;
    localObject = null;
    for (;;)
    {
      if (m >= paramInt)
      {
        if ((localObject != null) && (((ByteBuffer)localObject).remaining() > 0)) {
          this.a.a(localObject);
        }
        this.a.a(localByteBuffer2);
        return localByteBuffer2.order(this.b);
      }
      ByteBuffer localByteBuffer1 = (ByteBuffer)this.a.remove();
      int n = Math.min(paramInt - m, localByteBuffer1.remaining());
      localByteBuffer1.get(arrayOfByte, m, n);
      n = m + n;
      localObject = localByteBuffer1;
      m = n;
      if (localByteBuffer1.remaining() == 0)
      {
        c(localByteBuffer1);
        localObject = null;
        m = n;
      }
    }
  }
  
  private static boolean d(ByteBuffer paramByteBuffer)
  {
    Iterator localIterator = c.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        return false;
      }
    } while ((ByteBuffer)localIterator.next() != paramByteBuffer);
    return true;
  }
  
  private void e(int paramInt)
  {
    if (d() >= 0) {
      this.i += paramInt;
    }
  }
  
  private static PriorityQueue<ByteBuffer> p()
  {
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      return null;
    }
    return c;
  }
  
  public ai a(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() <= 0)
    {
      c(paramByteBuffer);
      return this;
    }
    e(paramByteBuffer.remaining());
    if (this.a.size() > 0)
    {
      ByteBuffer localByteBuffer = (ByteBuffer)this.a.d();
      if (localByteBuffer.capacity() - localByteBuffer.limit() >= paramByteBuffer.remaining())
      {
        localByteBuffer.mark();
        localByteBuffer.position(localByteBuffer.limit());
        localByteBuffer.limit(localByteBuffer.capacity());
        localByteBuffer.put(paramByteBuffer);
        localByteBuffer.limit(localByteBuffer.position());
        localByteBuffer.reset();
        c(paramByteBuffer);
        l();
        return this;
      }
    }
    this.a.add(paramByteBuffer);
    l();
    return this;
  }
  
  public ai a(ByteOrder paramByteOrder)
  {
    this.b = paramByteOrder;
    return this;
  }
  
  public ai a(ByteBuffer... paramVarArgs)
  {
    int n = paramVarArgs.length;
    int m = 0;
    for (;;)
    {
      if (m >= n) {
        return this;
      }
      a(paramVarArgs[m]);
      m += 1;
    }
  }
  
  public void a(ai paramai)
  {
    a(paramai, d());
  }
  
  public void a(ai paramai, int paramInt)
  {
    if (d() < paramInt) {
      throw new IllegalArgumentException("length");
    }
    int m = 0;
    for (;;)
    {
      if (m >= paramInt) {}
      ByteBuffer localByteBuffer1;
      int n;
      ByteBuffer localByteBuffer2;
      do
      {
        this.i -= paramInt;
        return;
        localByteBuffer1 = (ByteBuffer)this.a.remove();
        n = localByteBuffer1.remaining();
        if (n == 0)
        {
          c(localByteBuffer1);
          break;
        }
        if (m + n <= paramInt) {
          break label172;
        }
        m = paramInt - m;
        localByteBuffer2 = c(m);
        localByteBuffer2.limit(m);
        localByteBuffer1.get(localByteBuffer2.array(), 0, m);
        paramai.a(localByteBuffer2);
        this.a.a(localByteBuffer1);
        if ((!h) && (localByteBuffer2.capacity() < m)) {
          throw new AssertionError();
        }
      } while ((h) || (localByteBuffer2.position() == 0));
      throw new AssertionError();
      label172:
      paramai.a(localByteBuffer1);
      m += n;
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (d() < paramInt2) {
      throw new IllegalArgumentException("length");
    }
    int n = paramInt2;
    int m = paramInt1;
    paramInt1 = n;
    for (;;)
    {
      if (paramInt1 <= 0)
      {
        this.i -= paramInt2;
        return;
      }
      ByteBuffer localByteBuffer1 = (ByteBuffer)this.a.peek();
      n = Math.min(localByteBuffer1.remaining(), paramInt1);
      if (paramArrayOfByte != null) {
        localByteBuffer1.get(paramArrayOfByte, m, n);
      }
      m += n;
      if (localByteBuffer1.remaining() == 0)
      {
        ByteBuffer localByteBuffer2 = (ByteBuffer)this.a.remove();
        if ((!h) && (localByteBuffer1 != localByteBuffer2)) {
          throw new AssertionError();
        }
        c(localByteBuffer1);
      }
      paramInt1 -= n;
    }
  }
  
  public byte[] a()
  {
    if (this.a.size() == 1)
    {
      localObject = (ByteBuffer)this.a.peek();
      if ((((ByteBuffer)localObject).capacity() == d()) && (((ByteBuffer)localObject).isDirect()))
      {
        this.i = 0;
        return ((ByteBuffer)this.a.remove()).array();
      }
    }
    Object localObject = new byte[d()];
    a((byte[])localObject);
    return (byte[])localObject;
  }
  
  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    a(arrayOfByte);
    return arrayOfByte;
  }
  
  public ai b(int paramInt)
  {
    a(null, 0, paramInt);
    return this;
  }
  
  public ai b(ai paramai)
  {
    paramai.a(this);
    return this;
  }
  
  public void b(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.remaining() <= 0)
    {
      c(paramByteBuffer);
      return;
    }
    e(paramByteBuffer.remaining());
    if (this.a.size() > 0)
    {
      ByteBuffer localByteBuffer = (ByteBuffer)this.a.c();
      if (localByteBuffer.position() >= paramByteBuffer.remaining())
      {
        localByteBuffer.position(localByteBuffer.position() - paramByteBuffer.remaining());
        localByteBuffer.mark();
        localByteBuffer.put(paramByteBuffer);
        localByteBuffer.reset();
        c(paramByteBuffer);
        return;
      }
    }
    this.a.a(paramByteBuffer);
  }
  
  public ByteBuffer[] b()
  {
    ByteBuffer[] arrayOfByteBuffer = new ByteBuffer[this.a.size()];
    arrayOfByteBuffer = (ByteBuffer[])this.a.toArray(arrayOfByteBuffer);
    this.a.clear();
    this.i = 0;
    return arrayOfByteBuffer;
  }
  
  public boolean c()
  {
    return this.i == 0;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public boolean e()
  {
    return d() > 0;
  }
  
  public int f()
  {
    int m = d(4).getInt();
    this.i -= 4;
    return m;
  }
  
  public char g()
  {
    char c1 = (char)d(1).get();
    this.i -= 1;
    return c1;
  }
  
  public short h()
  {
    short s = d(2).getShort();
    this.i -= 2;
    return s;
  }
  
  public byte i()
  {
    byte b1 = d(1).get();
    this.i -= 1;
    return b1;
  }
  
  public long j()
  {
    long l = d(8).getLong();
    this.i -= 8;
    return l;
  }
  
  public ByteBuffer k()
  {
    if (d() == 0) {
      return g;
    }
    d(d());
    return n();
  }
  
  public void l()
  {
    d(0);
  }
  
  public void m()
  {
    for (;;)
    {
      if (this.a.size() <= 0)
      {
        if ((h) || (this.a.size() == 0)) {
          break;
        }
        throw new AssertionError();
      }
      c((ByteBuffer)this.a.remove());
    }
    this.i = 0;
  }
  
  public ByteBuffer n()
  {
    ByteBuffer localByteBuffer = (ByteBuffer)this.a.remove();
    this.i -= localByteBuffer.remaining();
    return localByteBuffer;
  }
  
  public int o()
  {
    return this.a.size();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */