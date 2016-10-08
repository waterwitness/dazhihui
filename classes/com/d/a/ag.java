package com.d.a;

import com.d.a.a.a;
import com.d.a.a.h;

public class ag
  implements ao
{
  ao a;
  ai b = new ai();
  h c;
  int d = Integer.MAX_VALUE;
  boolean e;
  
  static
  {
    if (!ag.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      return;
    }
  }
  
  public ag(ao paramao)
  {
    a(paramao);
  }
  
  private void e()
  {
    if (this.b.e())
    {
      this.a.a(this.b);
      if ((this.b.d() == 0) && (this.e)) {
        this.a.a();
      }
    }
    if ((!this.b.e()) && (this.c != null)) {
      this.c.a();
    }
  }
  
  public void a()
  {
    if (this.b.e())
    {
      this.e = true;
      return;
    }
    this.a.a();
  }
  
  public void a(int paramInt)
  {
    if ((!f) && (paramInt < 0)) {
      throw new AssertionError();
    }
    this.d = paramInt;
  }
  
  public void a(a parama)
  {
    this.a.a(parama);
  }
  
  public void a(h paramh)
  {
    this.c = paramh;
  }
  
  public void a(ai paramai)
  {
    a(paramai, false);
  }
  
  protected void a(ai paramai, boolean paramBoolean)
  {
    if (!this.b.e()) {
      this.a.a(paramai);
    }
    if (paramai.d() > 0)
    {
      int i = Math.min(paramai.d(), this.d);
      if (paramBoolean) {
        i = paramai.d();
      }
      if (i > 0) {
        paramai.a(this.b, i);
      }
    }
  }
  
  public void a(ao paramao)
  {
    this.a = paramao;
    this.a.a(new ah(this));
  }
  
  public boolean b()
  {
    return this.b.e();
  }
  
  public int c()
  {
    return this.b.d();
  }
  
  public int d()
  {
    return this.d;
  }
  
  public h g()
  {
    return this.c;
  }
  
  public boolean i()
  {
    return this.a.i();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */