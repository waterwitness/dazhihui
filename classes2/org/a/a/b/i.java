package org.a.a.b;

import java.util.Enumeration;
import org.a.a.ba;
import org.a.a.bd;
import org.a.a.bf;
import org.a.a.bj;
import org.a.a.bp;
import org.a.a.d;
import org.a.a.e;
import org.a.a.k.a;
import org.a.a.n;
import org.a.a.r;
import org.a.a.t;
import org.a.a.x;

public class i
  extends d
{
  private ba a;
  private h b;
  private a c;
  private t d;
  private a e;
  private n f;
  private t g;
  
  public i(h paramh, a parama1, t paramt1, a parama2, n paramn, t paramt2)
  {
    if (paramh.e()) {}
    for (this.a = new ba(3);; this.a = new ba(1))
    {
      this.b = paramh;
      this.c = parama1;
      this.d = paramt1;
      this.e = parama2;
      this.f = paramn;
      this.g = paramt2;
      return;
    }
  }
  
  public i(r paramr)
  {
    paramr = paramr.e();
    this.a = ((ba)paramr.nextElement());
    this.b = h.a(paramr.nextElement());
    this.c = a.a(paramr.nextElement());
    Object localObject = paramr.nextElement();
    if ((localObject instanceof x)) {
      this.d = t.a((x)localObject, false);
    }
    for (this.e = a.a(paramr.nextElement());; this.e = a.a(localObject))
    {
      this.f = bf.a(paramr.nextElement());
      if (!paramr.hasMoreElements()) {
        break;
      }
      this.g = t.a((x)paramr.nextElement(), false);
      return;
      this.d = null;
    }
    this.g = null;
  }
  
  public static i a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof i))) {
      return (i)paramObject;
    }
    if ((paramObject instanceof r)) {
      return new i((r)paramObject);
    }
    throw new IllegalArgumentException("unknown object in factory: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    e locale = new e();
    locale.a(this.a);
    locale.a(this.b);
    locale.a(this.c);
    if (this.d != null) {
      locale.a(new bp(false, 0, this.d));
    }
    locale.a(this.e);
    locale.a(this.f);
    if (this.g != null) {
      locale.a(new bp(false, 1, this.g));
    }
    return new bj(locale);
  }
  
  public ba e()
  {
    return this.a;
  }
  
  public a f()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */