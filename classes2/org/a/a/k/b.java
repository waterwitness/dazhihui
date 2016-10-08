package org.a.a.k;

import java.util.Enumeration;
import org.a.a.ap;
import org.a.a.bd;
import org.a.a.bj;
import org.a.a.d;
import org.a.a.e;
import org.a.a.r;

public class b
  extends d
{
  private a a;
  private ap b;
  
  public b(r paramr)
  {
    if (paramr.f() != 2) {
      throw new IllegalArgumentException("Bad sequence size: " + paramr.f());
    }
    paramr = paramr.e();
    this.a = a.a(paramr.nextElement());
    this.b = ap.a(paramr.nextElement());
  }
  
  public static b a(Object paramObject)
  {
    if ((paramObject instanceof b)) {
      return (b)paramObject;
    }
    if (paramObject != null) {
      return new b(r.a(paramObject));
    }
    return null;
  }
  
  public bd d()
  {
    e locale = new e();
    locale.a(this.a);
    locale.a(this.b);
    return new bj(locale);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */