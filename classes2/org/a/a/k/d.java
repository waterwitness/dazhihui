package org.a.a.k;

import org.a.a.ay;
import org.a.a.bd;
import org.a.a.bq;
import org.a.a.c;

public class d
  extends org.a.a.d
  implements c
{
  bd a;
  
  public d(bd parambd)
  {
    if ((!(parambd instanceof bq)) && (!(parambd instanceof ay))) {
      throw new IllegalArgumentException("unknown object passed to Time");
    }
    this.a = parambd;
  }
  
  public static d a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof d))) {
      return (d)paramObject;
    }
    if ((paramObject instanceof bq)) {
      return new d((bq)paramObject);
    }
    if ((paramObject instanceof ay)) {
      return new d((ay)paramObject);
    }
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    return this.a;
  }
  
  public String e()
  {
    if ((this.a instanceof bq)) {
      return ((bq)this.a).g();
    }
    return ((ay)this.a).e();
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */