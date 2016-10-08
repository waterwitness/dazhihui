package org.a.a.b;

import org.a.a.ar;
import org.a.a.bd;
import org.a.a.bp;
import org.a.a.c;
import org.a.a.d;
import org.a.a.n;
import org.a.a.x;

public class h
  extends d
  implements c
{
  private ar a;
  
  public h(f paramf)
  {
    this.a = paramf;
  }
  
  public h(bd parambd)
  {
    this.a = parambd;
  }
  
  public h(n paramn)
  {
    this.a = new bp(false, 0, paramn);
  }
  
  public static h a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof h))) {
      return (h)paramObject;
    }
    if ((paramObject instanceof f)) {
      return new h((f)paramObject);
    }
    if ((paramObject instanceof n)) {
      return new h((n)paramObject);
    }
    if ((paramObject instanceof bd)) {
      return new h((bd)paramObject);
    }
    throw new IllegalArgumentException("Illegal object in SignerIdentifier: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    return this.a.c();
  }
  
  public boolean e()
  {
    return this.a instanceof x;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */