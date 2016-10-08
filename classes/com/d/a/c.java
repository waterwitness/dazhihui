package com.d.a;

import android.util.Log;
import com.d.a.a.h;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

public class c
  implements af
{
  InetSocketAddress a;
  com.d.a.d.a b;
  boolean c;
  h d;
  com.d.a.a.e e;
  com.d.a.a.a f;
  boolean g;
  Exception h;
  boolean i = false;
  private ak k;
  private SelectionKey l;
  private q m;
  private ai n = new ai();
  private com.d.a.a.a o;
  
  static
  {
    if (!c.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
      return;
    }
  }
  
  private void a(int paramInt)
  {
    if (!this.l.isValid()) {
      throw new IOException(new CancelledKeyException());
    }
    if (paramInt > 0)
    {
      if ((!j) && (this.k.c())) {
        throw new AssertionError();
      }
      this.l.interestOps(5);
      return;
    }
    this.l.interestOps(1);
  }
  
  private void m()
  {
    if (this.n.e()) {
      bo.a(this, this.n);
    }
  }
  
  public void a()
  {
    this.k.a();
  }
  
  public void a(com.d.a.a.a parama)
  {
    this.f = parama;
  }
  
  public void a(com.d.a.a.e parame)
  {
    this.e = parame;
  }
  
  public void a(h paramh)
  {
    this.d = paramh;
  }
  
  public void a(ai paramai)
  {
    if (this.m.b() != Thread.currentThread()) {
      this.m.b(new d(this, paramai));
    }
    do
    {
      return;
      if (this.k.b()) {
        break;
      }
    } while ((j) || (!this.k.c()));
    throw new AssertionError();
    try
    {
      int i1 = paramai.d();
      ByteBuffer[] arrayOfByteBuffer = paramai.b();
      this.k.a(arrayOfByteBuffer);
      paramai.a(arrayOfByteBuffer);
      a(paramai.d());
      this.m.b(i1 - paramai.d());
      return;
    }
    catch (IOException paramai)
    {
      e();
      c(paramai);
      a(paramai);
    }
  }
  
  void a(q paramq, SelectionKey paramSelectionKey)
  {
    this.m = paramq;
    this.l = paramSelectionKey;
  }
  
  protected void a(Exception paramException)
  {
    if (this.c) {}
    do
    {
      return;
      this.c = true;
    } while (this.f == null);
    this.f.a(paramException);
    this.f = null;
  }
  
  void a(SocketChannel paramSocketChannel, InetSocketAddress paramInetSocketAddress)
  {
    this.a = paramInetSocketAddress;
    this.b = new com.d.a.d.a();
    this.k = new bm(paramSocketChannel);
  }
  
  public void b()
  {
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public void b(com.d.a.a.a parama)
  {
    this.o = parama;
  }
  
  void b(Exception paramException)
  {
    if (this.g) {}
    do
    {
      return;
      this.g = true;
      if (this.o != null)
      {
        this.o.a(paramException);
        return;
      }
    } while (paramException == null);
    Log.e("NIO", "Unhandled exception", paramException);
  }
  
  int c()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    m();
    if (this.i) {
      return i3;
    }
    i3 = i2;
    for (;;)
    {
      long l1;
      try
      {
        ByteBuffer localByteBuffer = this.b.a();
        i3 = i2;
        l1 = this.k.read(localByteBuffer);
        if (l1 < 0L)
        {
          i3 = i2;
          e();
          i2 = 1;
          if (l1 <= 0L) {
            break label167;
          }
          i3 = i1;
          this.b.a(l1);
          i3 = i1;
          localByteBuffer.flip();
          i3 = i1;
          this.n.a(localByteBuffer);
          i3 = i1;
          bo.a(this, this.n);
          i3 = i1;
          if (i2 == 0) {
            break;
          }
          i3 = i1;
          c(null);
          i3 = i1;
          a(null);
          return i1;
        }
      }
      catch (Exception localException)
      {
        e();
        c(localException);
        a(localException);
        return i3;
      }
      i1 = (int)(0 + l1);
      i2 = 0;
      continue;
      label167:
      i3 = i1;
      ai.c(localException);
    }
  }
  
  void c(Exception paramException)
  {
    if (this.n.e())
    {
      this.h = paramException;
      return;
    }
    b(paramException);
  }
  
  public void d()
  {
    e();
    a(null);
  }
  
  public void e()
  {
    this.l.cancel();
    try
    {
      this.k.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public com.d.a.a.e f()
  {
    return this.e;
  }
  
  public h g()
  {
    return this.d;
  }
  
  public com.d.a.a.a h()
  {
    return this.o;
  }
  
  public boolean i()
  {
    return (this.k.b()) && (this.l.isValid());
  }
  
  public void j()
  {
    if (this.m.b() != Thread.currentThread()) {
      this.m.b(new e(this));
    }
    for (;;)
    {
      return;
      if (!this.i) {
        continue;
      }
      this.i = false;
      try
      {
        this.l.interestOps(this.l.interestOps() | 0x1);
        m();
        if (i()) {
          continue;
        }
        c(this.h);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public boolean k()
  {
    return this.i;
  }
  
  public q l()
  {
    return this.m;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */