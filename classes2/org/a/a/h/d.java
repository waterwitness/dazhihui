package org.a.a.h;

import org.a.a.ba;
import org.a.a.bb;
import org.a.a.bd;
import org.a.a.bj;
import org.a.a.bp;
import org.a.a.e;

public class d
  extends org.a.a.d
{
  public static final org.a.a.k.a a = new org.a.a.k.a(org.a.a.g.a.i, new bb());
  public static final org.a.a.k.a b = new org.a.a.k.a(c.l_, a);
  public static final ba c = new ba(20);
  public static final ba d = new ba(1);
  private org.a.a.k.a e;
  private org.a.a.k.a f;
  private ba g;
  private ba h;
  
  public d()
  {
    this.e = a;
    this.f = b;
    this.g = c;
    this.h = d;
  }
  
  public d(org.a.a.k.a parama1, org.a.a.k.a parama2, ba paramba1, ba paramba2)
  {
    this.e = parama1;
    this.f = parama2;
    this.g = paramba1;
    this.h = paramba2;
  }
  
  public bd d()
  {
    e locale = new e();
    if (!this.e.equals(a)) {
      locale.a(new bp(true, 0, this.e));
    }
    if (!this.f.equals(b)) {
      locale.a(new bp(true, 1, this.f));
    }
    if (!this.g.equals(c)) {
      locale.a(new bp(true, 2, this.g));
    }
    if (!this.h.equals(d)) {
      locale.a(new bp(true, 3, this.h));
    }
    return new bj(locale);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */