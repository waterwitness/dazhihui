package org.a.a.k;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.a.a.aq;
import org.a.a.bd;
import org.a.a.bj;
import org.a.a.d;
import org.a.a.e;
import org.a.a.m;
import org.a.a.n;
import org.a.a.r;
import org.a.a.x;

public class g
  extends d
{
  public static final m A = new m("1.3.6.1.5.5.7.1.2");
  public static final m B = new m("1.3.6.1.5.5.7.1.3");
  public static final m C = new m("1.3.6.1.5.5.7.1.4");
  public static final m D = new m("2.5.29.56");
  public static final m E = new m("2.5.29.55");
  public static final m a = new m("2.5.29.9");
  public static final m b = new m("2.5.29.14");
  public static final m c = new m("2.5.29.15");
  public static final m d = new m("2.5.29.16");
  public static final m e = new m("2.5.29.17");
  public static final m f = new m("2.5.29.18");
  public static final m g = new m("2.5.29.19");
  public static final m h = new m("2.5.29.20");
  public static final m i = new m("2.5.29.21");
  public static final m j = new m("2.5.29.23");
  public static final m k = new m("2.5.29.24");
  public static final m l = new m("2.5.29.27");
  public static final m m = new m("2.5.29.28");
  public static final m n = new m("2.5.29.29");
  public static final m o = new m("2.5.29.30");
  public static final m p = new m("2.5.29.31");
  public static final m q = new m("2.5.29.32");
  public static final m r = new m("2.5.29.33");
  public static final m s = new m("2.5.29.35");
  public static final m t = new m("2.5.29.36");
  public static final m u = new m("2.5.29.37");
  public static final m v = new m("2.5.29.46");
  public static final m w = new m("2.5.29.54");
  public static final m x = new m("1.3.6.1.5.5.7.1.1");
  public static final m y = new m("1.3.6.1.5.5.7.1.11");
  public static final m z = new m("1.3.6.1.5.5.7.1.12");
  private Hashtable F = new Hashtable();
  private Vector G = new Vector();
  
  public g(r paramr)
  {
    paramr = paramr.e();
    if (paramr.hasMoreElements())
    {
      r localr = r.a(paramr.nextElement());
      if (localr.f() == 3) {
        this.F.put(localr.a(0), new f(aq.a(localr.a(1)), n.a(localr.a(2))));
      }
      for (;;)
      {
        this.G.addElement(localr.a(0));
        break;
        if (localr.f() != 2) {
          break label149;
        }
        this.F.put(localr.a(0), new f(false, n.a(localr.a(1))));
      }
      label149:
      throw new IllegalArgumentException("Bad sequence size: " + localr.f());
    }
  }
  
  public static g a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof g))) {
      return (g)paramObject;
    }
    if ((paramObject instanceof r)) {
      return new g((r)paramObject);
    }
    if ((paramObject instanceof x)) {
      return a(((x)paramObject).h());
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public bd d()
  {
    e locale1 = new e();
    Enumeration localEnumeration = this.G.elements();
    while (localEnumeration.hasMoreElements())
    {
      m localm = (m)localEnumeration.nextElement();
      f localf = (f)this.F.get(localm);
      e locale2 = new e();
      locale2.a(localm);
      if (localf.a()) {
        locale2.a(new aq(true));
      }
      locale2.a(localf.b());
      locale1.a(new bj(locale2));
    }
    return new bj(locale1);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */