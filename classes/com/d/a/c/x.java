package com.d.a.c;

import com.d.a.a.h;
import com.d.a.af;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.ao;
import com.d.a.as;
import com.d.a.q;

abstract class x
  extends as
  implements af, s, w
{
  private com.d.a.a.a d = new y(this);
  protected av e;
  boolean f = false;
  int g;
  String h;
  String i;
  ao j;
  private u l;
  private af m;
  private boolean n = true;
  
  static
  {
    if (!x.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      k = bool;
      return;
    }
  }
  
  public x(u paramu)
  {
    this.l = paramu;
  }
  
  private void o()
  {
    this.m.a(new aa(this));
  }
  
  private void p()
  {
    if (!this.n) {}
    do
    {
      return;
      this.n = false;
      if ((!k) && (this.l.e().a("Content-Type") == null)) {
        throw new AssertionError();
      }
    } while ((k) || (this.l.e().a("Transfer-Encoding") != null) || (az.a(this.l.e()) != -1));
    throw new AssertionError();
  }
  
  public s a(int paramInt)
  {
    this.g = paramInt;
    return this;
  }
  
  public s a(ao paramao)
  {
    this.j = paramao;
    return this;
  }
  
  public s a(av paramav)
  {
    this.e = paramav;
    return this;
  }
  
  public s a(String paramString)
  {
    this.h = paramString;
    return this;
  }
  
  public void a()
  {
    throw new AssertionError("end called?");
  }
  
  public void a(com.d.a.a.a parama)
  {
    this.j.a(parama);
  }
  
  public void a(h paramh)
  {
    this.j.a(paramh);
  }
  
  void a(af paramaf)
  {
    this.m = paramaf;
    if (this.m == null) {
      return;
    }
    this.m.b(this.d);
  }
  
  public void a(ai paramai)
  {
    p();
    this.j.a(paramai);
  }
  
  protected void a(Exception paramException)
  {
    super.a(paramException);
    o();
    this.m.a(null);
    this.m.a(null);
    this.m.b(null);
    this.f = true;
  }
  
  public s b(al paramal)
  {
    a(paramal);
    return this;
  }
  
  public s b(String paramString)
  {
    this.i = paramString;
    return this;
  }
  
  protected void b() {}
  
  protected void b(Exception paramException) {}
  
  public void d()
  {
    super.d();
    o();
  }
  
  public af e()
  {
    return this.m;
  }
  
  public av f_()
  {
    return this.e;
  }
  
  public h g()
  {
    return this.j.g();
  }
  
  public String g_()
  {
    return this.h;
  }
  
  public ao h_()
  {
    return this.j;
  }
  
  public boolean i()
  {
    return this.j.i();
  }
  
  public q l()
  {
    return this.m.l();
  }
  
  public int m()
  {
    return this.g;
  }
  
  protected void n()
  {
    com.d.a.c.a.a locala = this.l.g();
    if (locala != null)
    {
      locala.a(this.l, this, new z(this));
      return;
    }
    b(null);
  }
  
  public String toString()
  {
    if (this.e == null) {
      return super.toString();
    }
    return this.e.e(this.h + " " + this.g + " " + this.i);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */