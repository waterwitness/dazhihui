package org.a.a.j;

import org.a.a.bd;
import org.a.a.bj;
import org.a.a.d;
import org.a.a.e;
import org.a.a.m;
import org.a.a.r;

public class a
  extends d
{
  private m a;
  private d b;
  
  private a(r paramr)
  {
    this.a = ((m)paramr.a(0));
    this.b = ((d)paramr.a(1));
  }
  
  public static a a(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      return (a)paramObject;
    }
    if (paramObject != null) {
      return new a(r.a(paramObject));
    }
    throw new IllegalArgumentException("null value in getInstance()");
  }
  
  public bd d()
  {
    e locale = new e();
    locale.a(this.a);
    locale.a(this.b);
    return new bj(locale);
  }
  
  public m e()
  {
    return this.a;
  }
  
  public d f()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */