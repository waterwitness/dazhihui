package org.a.a.b;

import org.a.a.ag;
import org.a.a.ak;
import org.a.a.ar;
import org.a.a.bd;
import org.a.a.m;
import org.a.a.r;
import org.a.a.x;

public class e
  extends org.a.a.d
  implements d
{
  private m k;
  private ar l;
  
  public e(m paramm, ar paramar)
  {
    this.k = paramm;
    this.l = paramar;
  }
  
  public e(r paramr)
  {
    if ((paramr.f() < 1) || (paramr.f() > 2)) {
      throw new IllegalArgumentException("Bad sequence size: " + paramr.f());
    }
    this.k = ((m)paramr.a(0));
    if (paramr.f() > 1)
    {
      paramr = (x)paramr.a(1);
      if ((!paramr.f()) || (paramr.e() != 0)) {
        throw new IllegalArgumentException("Bad tag for 'content'");
      }
      this.l = paramr.h();
    }
  }
  
  public static e a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof e))) {
      return (e)paramObject;
    }
    if ((paramObject instanceof r)) {
      return new e((r)paramObject);
    }
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    org.a.a.e locale = new org.a.a.e();
    locale.a(this.k);
    if (this.l != null) {
      locale.a(new ak(0, this.l));
    }
    return new ag(locale);
  }
  
  public m e()
  {
    return this.k;
  }
  
  public ar f()
  {
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */