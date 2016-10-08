package org.a.a.b;

import org.a.a.bd;
import org.a.a.be;
import org.a.a.bj;
import org.a.a.d;
import org.a.a.e;
import org.a.a.r;
import org.a.a.t;

public class a
  extends d
{
  private be a;
  private t b;
  
  public a(be parambe, t paramt)
  {
    this.a = parambe;
    this.b = paramt;
  }
  
  public a(r paramr)
  {
    this.a = ((be)paramr.a(0));
    this.b = ((t)paramr.a(1));
  }
  
  public static a a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof a))) {
      return (a)paramObject;
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
    locale.a(this.b);
    return new bj(locale);
  }
  
  public be e()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */