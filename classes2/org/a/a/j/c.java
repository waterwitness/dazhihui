package org.a.a.j;

import java.util.Enumeration;
import org.a.a.ar;
import org.a.a.bd;
import org.a.a.bj;
import org.a.a.j.a.a;
import org.a.a.k.h;
import org.a.a.r;

public class c
  extends org.a.a.d
  implements org.a.a.c
{
  private static d a = a.a;
  private boolean b;
  private int c;
  private d d;
  private b[] e;
  
  private c(d paramd, r paramr)
  {
    this.d = paramd;
    this.e = new b[paramr.f()];
    int i = 0;
    paramd = paramr.e();
    while (paramd.hasMoreElements())
    {
      this.e[i] = b.a(paramd.nextElement());
      i += 1;
    }
  }
  
  private c(r paramr)
  {
    this(a, paramr);
  }
  
  public static c a(Object paramObject)
  {
    if ((paramObject instanceof c)) {
      return (c)paramObject;
    }
    if ((paramObject instanceof h)) {
      return new c(r.a(((h)paramObject).c()));
    }
    if (paramObject != null) {
      return new c(r.a(paramObject));
    }
    return null;
  }
  
  public bd d()
  {
    return new bj(this.e);
  }
  
  public b[] e()
  {
    b[] arrayOfb = new b[this.e.length];
    System.arraycopy(this.e, 0, arrayOfb, 0, arrayOfb.length);
    return arrayOfb;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((!(paramObject instanceof c)) && (!(paramObject instanceof r))) {
      return false;
    }
    bd localbd = ((ar)paramObject).c();
    if (c().equals(localbd)) {
      return true;
    }
    try
    {
      boolean bool = this.d.a(this, new c(r.a(((ar)paramObject).c())));
      return bool;
    }
    catch (Exception paramObject) {}
    return false;
  }
  
  public int hashCode()
  {
    if (this.b) {
      return this.c;
    }
    this.b = true;
    this.c = this.d.a(this);
    return this.c;
  }
  
  public String toString()
  {
    return this.d.b(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\j\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */