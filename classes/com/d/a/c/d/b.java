package com.d.a.c.d;

import com.d.a.a.e;
import com.d.a.a.h;
import com.d.a.af;
import com.d.a.ai;
import com.d.a.b.l;
import com.d.a.bo;
import com.d.a.q;
import java.io.IOException;
import java.util.List;

public class b
  implements af
{
  long a;
  h b;
  final int c;
  com.d.a.a.a d;
  com.d.a.a.a e;
  e f;
  ai g;
  l<List<k>> h;
  boolean i;
  int j;
  boolean k;
  ai l;
  
  public b(int paramInt, boolean paramBoolean1, boolean paramBoolean2, List<k> paramList)
  {
    this.a = paramInt.l.d(65536);
    this.g = new ai();
    this.h = new l();
    this.i = true;
    this.l = new ai();
    this.c = paramBoolean1;
  }
  
  public void a()
  {
    try
    {
      this.m.d.a(true, this.c, this.l);
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  void a(int paramInt)
  {
    this.j += paramInt;
    if (this.j >= this.m.j.d(65536) / 2) {}
    try
    {
      this.m.d.a(this.c, this.j);
      this.j = 0;
      this.m.a(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  public void a(long paramLong)
  {
    long l1 = this.a;
    this.a += paramLong;
    if ((this.a > 0L) && (l1 <= 0L)) {
      bo.a(this.b);
    }
  }
  
  public void a(com.d.a.a.a parama)
  {
    this.d = parama;
  }
  
  public void a(e parame)
  {
    this.f = parame;
  }
  
  public void a(h paramh)
  {
    this.b = paramh;
  }
  
  public void a(ai paramai)
  {
    int n = (int)Math.min(this.a, this.m.k);
    n = Math.min(paramai.d(), n);
    if (n == 0) {
      return;
    }
    ai localai = paramai;
    if (n < paramai.d())
    {
      if (this.l.e()) {
        throw new AssertionError("wtf");
      }
      paramai.a(this.l, n);
      localai = this.l;
    }
    try
    {
      this.m.d.a(false, this.c, localai);
      this.a -= n;
      return;
    }
    catch (IOException paramai)
    {
      throw new AssertionError(paramai);
    }
  }
  
  public void a(List<k> paramList, n paramn)
  {
    this.h.b(paramList);
  }
  
  public a b()
  {
    return this.m;
  }
  
  public void b(com.d.a.a.a parama)
  {
    this.e = parama;
  }
  
  public l<List<k>> c()
  {
    return this.h;
  }
  
  public void d()
  {
    this.i = false;
  }
  
  public boolean e()
  {
    if ((this.c & 0x1) == 1) {}
    for (int n = 1; this.m.h == n; n = 0) {
      return true;
    }
    return false;
  }
  
  public e f()
  {
    return this.f;
  }
  
  public h g()
  {
    return this.b;
  }
  
  public com.d.a.a.a h()
  {
    return this.e;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public void j()
  {
    this.k = false;
  }
  
  public boolean k()
  {
    return this.k;
  }
  
  public q l()
  {
    return this.m.a.l();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */