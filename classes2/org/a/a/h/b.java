package org.a.a.h;

import org.a.a.ba;
import org.a.a.bd;
import org.a.a.bj;
import org.a.a.bp;
import org.a.a.d;
import org.a.a.e;
import org.a.a.k.h;
import org.a.a.t;

public class b
  extends d
{
  ba a = new ba(0);
  h b;
  org.a.a.k.b c;
  t d = null;
  
  public b(h paramh, org.a.a.k.b paramb, t paramt)
  {
    this.b = paramh;
    this.c = paramb;
    this.d = paramt;
    if ((paramh == null) || (this.a == null) || (this.c == null)) {
      throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
    }
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
    return new bj(locale);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */