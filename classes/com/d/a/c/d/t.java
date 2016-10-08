package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.an;
import java.io.IOException;

final class t
  implements h
{
  final p a;
  int b;
  int c;
  byte d;
  byte e;
  short f;
  int g;
  byte h;
  int i;
  int j;
  private final al k;
  private final boolean l;
  private final i m;
  private final an n;
  private final e o = new u(this);
  private final e p = new v(this);
  
  t(al paramal, i parami, int paramInt, boolean paramBoolean)
  {
    this.k = paramal;
    this.l = paramBoolean;
    this.a = new p(paramInt);
    this.m = parami;
    this.n = new an();
    a();
  }
  
  private void a()
  {
    this.k.a(this.n);
    this.n.a(8, this.o);
  }
  
  private void a(ai paramai, int paramInt)
  {
    int i1 = paramai.f();
    if ((0x80000000 & i1) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      int i2 = paramai.i();
      this.m.a(paramInt, i1 & 0x7FFFFFFF, (i2 & 0xFF) + 1, bool);
      return;
    }
  }
  
  private void a(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    short s1 = 0;
    if (paramInt == 0) {
      throw r.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }
    if ((paramByte & 0x8) != 0) {
      s1 = (short)(paramai.i() & 0xFF);
    }
    short s2 = paramShort;
    if ((paramByte & 0x20) != 0)
    {
      a(paramai, paramInt);
      s2 = (short)(paramShort - 5);
    }
    paramShort = r.a(s2, paramByte, s1);
    this.h = this.e;
    a(paramai, paramShort, s1, paramByte, paramInt);
  }
  
  private void a(ai paramai, short paramShort1, short paramShort2, byte paramByte, int paramInt)
  {
    boolean bool = true;
    paramai.b(paramShort2);
    this.a.a(paramai);
    this.a.a();
    this.a.b();
    if ((paramByte & 0x4) != 0)
    {
      if (this.h == 1)
      {
        if ((paramByte & 0x1) != 0) {}
        for (;;)
        {
          this.m.a(false, bool, paramInt, -1, this.a.c(), n.d);
          return;
          bool = false;
        }
      }
      if (this.h == 5)
      {
        this.m.a(paramInt, this.j, this.a.c());
        return;
      }
      throw new AssertionError("unknown header type");
    }
    this.i = paramInt;
  }
  
  private void b(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramInt != this.i) {
      throw new IOException("continuation stream id mismatch");
    }
    a(paramai, paramShort, (short)0, paramByte, paramInt);
  }
  
  private void c(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    int i1 = 1;
    short s = 0;
    boolean bool;
    if ((paramByte & 0x1) != 0)
    {
      bool = true;
      if ((paramByte & 0x20) == 0) {
        break label43;
      }
    }
    for (;;)
    {
      if (i1 == 0) {
        break label49;
      }
      throw r.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
      bool = false;
      break;
      label43:
      i1 = 0;
    }
    label49:
    if ((paramByte & 0x8) != 0) {
      s = (short)(paramai.i() & 0xFF);
    }
    r.a(paramShort, paramByte, s);
    this.m.a(bool, paramInt, paramai);
    paramai.b(s);
  }
  
  private void d(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramShort != 5) {
      throw r.a("TYPE_PRIORITY length: %d != 5", new Object[] { Short.valueOf(paramShort) });
    }
    if (paramInt == 0) {
      throw r.a("TYPE_PRIORITY streamId == 0", new Object[0]);
    }
    a(paramai, paramInt);
  }
  
  private void e(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramShort != 4) {
      throw r.a("TYPE_RST_STREAM length: %d != 4", new Object[] { Short.valueOf(paramShort) });
    }
    if (paramInt == 0) {
      throw r.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
    }
    paramByte = paramai.f();
    paramai = g.b(paramByte);
    if (paramai == null) {
      throw r.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(paramByte) });
    }
    this.m.a(paramInt, paramai);
  }
  
  private void f(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramInt != 0) {
      throw r.a("TYPE_SETTINGS streamId != 0", new Object[0]);
    }
    if ((paramByte & 0x1) != 0)
    {
      if (paramShort != 0) {
        throw r.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
      }
      this.m.b();
    }
    aa localaa;
    do
    {
      return;
      if (paramShort % 6 != 0) {
        throw r.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] { Short.valueOf(paramShort) });
      }
      localaa = new aa();
      paramByte = 0;
      if (paramByte < paramShort) {
        break;
      }
      this.m.a(false, localaa);
    } while (localaa.c() < 0);
    this.a.a(localaa.c());
    return;
    int i1 = paramai.h();
    int i2 = paramai.f();
    paramInt = i1;
    switch (i1)
    {
    default: 
      throw r.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] { Short.valueOf(i1) });
    case 2: 
      paramInt = i1;
      if (i2 != 0)
      {
        paramInt = i1;
        if (i2 != 1) {
          throw r.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
        }
      }
      break;
    case 3: 
      paramInt = 4;
    }
    do
    {
      localaa.a(paramInt, 0, i2);
      paramByte += 6;
      break;
      paramInt = 7;
    } while (i2 >= 0);
    throw r.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
  }
  
  private void g(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    short s1 = 0;
    if (paramInt == 0) {
      throw r.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }
    if ((paramByte & 0x8) != 0) {
      s1 = (short)(paramai.i() & 0xFF);
    }
    this.j = (paramai.f() & 0x7FFFFFFF);
    short s2 = r.a((short)(paramShort - 4), paramByte, s1);
    this.h = 5;
    a(paramai, s2, s1, paramByte, paramInt);
  }
  
  private void h(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    boolean bool = true;
    if (paramShort != 8) {
      throw r.a("TYPE_PING length != 8: %s", new Object[] { Short.valueOf(paramShort) });
    }
    if (paramInt != 0) {
      throw r.a("TYPE_PING streamId != 0", new Object[0]);
    }
    paramInt = paramai.f();
    int i1 = paramai.f();
    if ((paramByte & 0x1) != 0) {}
    for (;;)
    {
      this.m.a(bool, paramInt, i1);
      return;
      bool = false;
    }
  }
  
  private void i(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramShort < 8) {
      throw r.a("TYPE_GOAWAY length < 8: %s", new Object[] { Short.valueOf(paramShort) });
    }
    if (paramInt != 0) {
      throw r.a("TYPE_GOAWAY streamId != 0", new Object[0]);
    }
    paramByte = paramai.f();
    paramInt = paramai.f();
    int i1 = paramShort - 8;
    g localg = g.b(paramInt);
    if (localg == null) {
      throw r.a("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    f localf = f.a;
    if (i1 > 0) {
      localf = f.a(paramai.a(i1));
    }
    this.m.a(paramByte, localg, localf);
  }
  
  private void j(ai paramai, short paramShort, byte paramByte, int paramInt)
  {
    if (paramShort != 4) {
      throw r.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { Short.valueOf(paramShort) });
    }
    long l1 = paramai.f() & 0x7FFFFFFF;
    if (l1 == 0L) {
      throw r.a("windowSizeIncrement was 0", new Object[] { Long.valueOf(l1) });
    }
    this.m.a(paramInt, l1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */