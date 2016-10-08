package org.a.a.k;

import org.a.a.ar;
import org.a.a.bb;
import org.a.a.bd;
import org.a.a.be;
import org.a.a.bj;
import org.a.a.d;
import org.a.a.e;
import org.a.a.m;
import org.a.a.r;

public class a
  extends d
{
  private be a;
  private ar b;
  private boolean c = false;
  
  public a(String paramString)
  {
    this.a = new be(paramString);
  }
  
  public a(be parambe)
  {
    this.a = parambe;
  }
  
  public a(be parambe, ar paramar)
  {
    this.c = true;
    this.a = parambe;
    this.b = paramar;
  }
  
  public a(r paramr)
  {
    if ((paramr.f() < 1) || (paramr.f() > 2)) {
      throw new IllegalArgumentException("Bad sequence size: " + paramr.f());
    }
    this.a = be.a(paramr.a(0));
    if (paramr.f() == 2)
    {
      this.c = true;
      this.b = paramr.a(1);
      return;
    }
    this.b = null;
  }
  
  public static a a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof a))) {
      return (a)paramObject;
    }
    if ((paramObject instanceof be)) {
      return new a((be)paramObject);
    }
    if ((paramObject instanceof String)) {
      return new a((String)paramObject);
    }
    if ((paramObject instanceof r)) {
      return new a((r)paramObject);
    }
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    e locale = new e();
    locale.a(this.a);
    if (this.c)
    {
      if (this.b == null) {
        break label47;
      }
      locale.a(this.b);
    }
    for (;;)
    {
      return new bj(locale);
      label47:
      locale.a(bb.a);
    }
  }
  
  public m e()
  {
    return new m(this.a.e());
  }
  
  public be f()
  {
    return this.a;
  }
  
  public ar g()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */