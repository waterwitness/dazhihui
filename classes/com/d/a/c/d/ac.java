package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.an;
import java.io.IOException;

final class ac
  implements h
{
  int a;
  int b;
  int c;
  int d;
  int e;
  boolean f;
  ai g = new ai();
  private final l h = new l();
  private final al i;
  private final boolean j;
  private final i k;
  private final an l;
  private final ai m = new ai();
  private final e n = new ad(this);
  private final e o = new ae(this);
  private final e p = new af(this);
  
  ac(al paramal, i parami, boolean paramBoolean)
  {
    this.i = paramal;
    this.k = parami;
    this.j = paramBoolean;
    paramal.b(new ag(this));
    this.l = new an();
    a();
  }
  
  private static IOException a(String paramString, Object... paramVarArgs)
  {
    throw new IOException(String.format(paramString, paramVarArgs));
  }
  
  private void a()
  {
    this.i.a(this.l);
    this.l.a(8, this.n);
  }
  
  private void a(ai paramai, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    int i1 = paramai.f();
    int i2 = paramai.f();
    paramai.h();
    paramai = this.h.a(paramai, paramInt2 - 10);
    boolean bool1;
    if ((paramInt1 & 0x1) != 0)
    {
      bool1 = true;
      if ((paramInt1 & 0x2) == 0) {
        break label82;
      }
    }
    for (;;)
    {
      this.k.a(bool2, bool1, i1 & 0x7FFFFFFF, i2 & 0x7FFFFFFF, paramai, n.a);
      return;
      bool1 = false;
      break;
      label82:
      bool2 = false;
    }
  }
  
  private void b(ai paramai, int paramInt1, int paramInt2)
  {
    int i1 = paramai.f();
    paramai = this.h.a(paramai, paramInt2 - 4);
    if ((paramInt1 & 0x1) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.k.a(false, bool, i1 & 0x7FFFFFFF, -1, paramai, n.b);
      return;
    }
  }
  
  private void c(ai paramai, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 8) {
      throw a("TYPE_RST_STREAM length: %d != 8", new Object[] { Integer.valueOf(paramInt2) });
    }
    paramInt1 = paramai.f();
    paramInt2 = paramai.f();
    paramai = g.a(paramInt2);
    if (paramai == null) {
      throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(paramInt2) });
    }
    this.k.a(paramInt1 & 0x7FFFFFFF, paramai);
  }
  
  private void d(ai paramai, int paramInt1, int paramInt2)
  {
    paramInt1 = paramai.f();
    paramai = this.h.a(paramai, paramInt2 - 4);
    this.k.a(false, false, paramInt1 & 0x7FFFFFFF, -1, paramai, n.c);
  }
  
  private void e(ai paramai, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 8) {
      throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] { Integer.valueOf(paramInt2) });
    }
    paramInt1 = paramai.f();
    long l1 = paramai.f() & 0x7FFFFFFF;
    if (l1 == 0L) {
      throw a("windowSizeIncrement was 0", new Object[] { Long.valueOf(l1) });
    }
    this.k.a(paramInt1 & 0x7FFFFFFF, l1);
  }
  
  private void f(ai paramai, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    if (paramInt2 != 4) {
      throw a("TYPE_PING length: %d != 4", new Object[] { Integer.valueOf(paramInt2) });
    }
    paramInt1 = paramai.f();
    boolean bool3 = this.j;
    if ((paramInt1 & 0x1) == 1)
    {
      bool1 = true;
      if (bool3 != bool1) {
        break label77;
      }
    }
    label77:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.k.a(bool1, paramInt1, 0);
      return;
      bool1 = false;
      break;
    }
  }
  
  private void g(ai paramai, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 8) {
      throw a("TYPE_GOAWAY length: %d != 8", new Object[] { Integer.valueOf(paramInt2) });
    }
    paramInt1 = paramai.f();
    paramInt2 = paramai.f();
    paramai = g.c(paramInt2);
    if (paramai == null) {
      throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(paramInt2) });
    }
    this.k.a(paramInt1 & 0x7FFFFFFF, paramai, f.a);
  }
  
  private void h(ai paramai, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    int i1 = paramai.f();
    if (paramInt2 != i1 * 8 + 4) {
      throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i1) });
    }
    aa localaa = new aa();
    paramInt2 = 0;
    if (paramInt2 >= i1) {
      if ((paramInt1 & 0x1) == 0) {
        break label118;
      }
    }
    for (;;)
    {
      this.k.a(bool, localaa);
      return;
      int i2 = paramai.f();
      localaa.a(i2 & 0xFFFFFF, (0xFF000000 & i2) >>> 24, paramai.f());
      paramInt2 += 1;
      break;
      label118:
      bool = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */