package org.a.a.j.a;

import java.util.Hashtable;
import org.a.a.k.k;
import org.a.a.m;

public class a
  implements org.a.a.j.d
{
  public static final m A;
  public static final m B;
  public static final m C;
  public static final m D;
  public static final m E;
  public static final m F;
  public static final m G;
  public static final m H;
  public static final m I;
  public static final m J;
  private static final Hashtable K;
  private static final Hashtable L;
  public static final org.a.a.j.d a = new a();
  public static final m b = new m("2.5.4.6");
  public static final m c = new m("2.5.4.10");
  public static final m d = new m("2.5.4.11");
  public static final m e = new m("2.5.4.12");
  public static final m f = new m("2.5.4.3");
  public static final m g = new m("2.5.4.5");
  public static final m h = new m("2.5.4.9");
  public static final m i = g;
  public static final m j = new m("2.5.4.7");
  public static final m k = new m("2.5.4.8");
  public static final m l = new m("2.5.4.4");
  public static final m m = new m("2.5.4.42");
  public static final m n = new m("2.5.4.43");
  public static final m o = new m("2.5.4.44");
  public static final m p = new m("2.5.4.45");
  public static final m q = new m("2.5.4.15");
  public static final m r = new m("2.5.4.17");
  public static final m s = new m("2.5.4.46");
  public static final m t = new m("2.5.4.65");
  public static final m u = new m("1.3.6.1.5.5.7.9.1");
  public static final m v = new m("1.3.6.1.5.5.7.9.2");
  public static final m w = new m("1.3.6.1.5.5.7.9.3");
  public static final m x = new m("1.3.6.1.5.5.7.9.4");
  public static final m y = new m("1.3.6.1.5.5.7.9.5");
  public static final m z = new m("1.3.36.8.3.14");
  
  static
  {
    A = new m("2.5.4.16");
    B = new m("2.5.4.54");
    C = k.g;
    D = k.c_;
    E = org.a.a.h.c.T;
    F = org.a.a.h.c.U;
    G = org.a.a.h.c.aa;
    H = E;
    I = new m("0.9.2342.19200300.100.1.25");
    J = new m("0.9.2342.19200300.100.1.1");
    K = new Hashtable();
    L = new Hashtable();
    K.put(b, "C");
    K.put(c, "O");
    K.put(e, "T");
    K.put(d, "OU");
    K.put(f, "CN");
    K.put(j, "L");
    K.put(k, "ST");
    K.put(g, "SERIALNUMBER");
    K.put(E, "E");
    K.put(I, "DC");
    K.put(J, "UID");
    K.put(h, "STREET");
    K.put(l, "SURNAME");
    K.put(m, "GIVENNAME");
    K.put(n, "INITIALS");
    K.put(o, "GENERATION");
    K.put(G, "unstructuredAddress");
    K.put(F, "unstructuredName");
    K.put(p, "UniqueIdentifier");
    K.put(s, "DN");
    K.put(t, "Pseudonym");
    K.put(A, "PostalAddress");
    K.put(z, "NameAtBirth");
    K.put(x, "CountryOfCitizenship");
    K.put(y, "CountryOfResidence");
    K.put(w, "Gender");
    K.put(v, "PlaceOfBirth");
    K.put(u, "DateOfBirth");
    K.put(r, "PostalCode");
    K.put(q, "BusinessCategory");
    K.put(C, "TelephoneNumber");
    K.put(D, "Name");
    L.put("c", b);
    L.put("o", c);
    L.put("t", e);
    L.put("ou", d);
    L.put("cn", f);
    L.put("l", j);
    L.put("st", k);
    L.put("sn", g);
    L.put("serialnumber", g);
    L.put("street", h);
    L.put("emailaddress", H);
    L.put("dc", I);
    L.put("e", H);
    L.put("uid", J);
    L.put("surname", l);
    L.put("givenname", m);
    L.put("initials", n);
    L.put("generation", o);
    L.put("unstructuredaddress", G);
    L.put("unstructuredname", F);
    L.put("uniqueidentifier", p);
    L.put("dn", s);
    L.put("pseudonym", t);
    L.put("postaladdress", A);
    L.put("nameofbirth", z);
    L.put("countryofcitizenship", x);
    L.put("countryofresidence", y);
    L.put("gender", w);
    L.put("placeofbirth", v);
    L.put("dateofbirth", u);
    L.put("postalcode", r);
    L.put("businesscategory", q);
    L.put("telephonenumber", C);
    L.put("name", D);
  }
  
  private int a(org.a.a.d paramd)
  {
    return b.a(b.a(paramd)).hashCode();
  }
  
  private boolean a(org.a.a.j.a parama1, org.a.a.j.a parama2)
  {
    if (parama1 == parama2) {}
    do
    {
      return true;
      if (parama1 == null) {
        return false;
      }
      if (parama2 == null) {
        return false;
      }
      if (!parama1.e().equals(parama2.e())) {
        return false;
      }
    } while (b.a(b.a(parama1.f())).equals(b.a(b.a(parama2.f()))));
    return false;
  }
  
  private boolean a(boolean paramBoolean, org.a.a.j.b paramb, org.a.a.j.b[] paramArrayOfb)
  {
    boolean bool = false;
    if (paramBoolean)
    {
      i1 = paramArrayOfb.length - 1;
      for (;;)
      {
        paramBoolean = bool;
        if (i1 >= 0)
        {
          if ((paramArrayOfb[i1] != null) && (a(paramb, paramArrayOfb[i1])))
          {
            paramArrayOfb[i1] = null;
            paramBoolean = true;
          }
        }
        else {
          return paramBoolean;
        }
        i1 -= 1;
      }
    }
    int i1 = 0;
    for (;;)
    {
      paramBoolean = bool;
      if (i1 == paramArrayOfb.length) {
        break;
      }
      if ((paramArrayOfb[i1] != null) && (a(paramb, paramArrayOfb[i1])))
      {
        paramArrayOfb[i1] = null;
        return true;
      }
      i1 += 1;
    }
  }
  
  public int a(org.a.a.j.c paramc)
  {
    paramc = paramc.e();
    int i2 = 0;
    int i1 = 0;
    if (i2 != paramc.length)
    {
      if (paramc[i2].e())
      {
        org.a.a.j.a[] arrayOfa = paramc[i2].g();
        int i3 = 0;
        while (i3 != arrayOfa.length)
        {
          i1 = i1 ^ arrayOfa[i3].e().hashCode() ^ a(arrayOfa[i3].f());
          i3 += 1;
        }
      }
      for (;;)
      {
        i2 += 1;
        break;
        i1 = i1 ^ paramc[i2].f().e().hashCode() ^ a(paramc[i2].f().f());
      }
    }
    return i1;
  }
  
  protected boolean a(org.a.a.j.b paramb1, org.a.a.j.b paramb2)
  {
    if (paramb1.e()) {
      if (paramb2.e())
      {
        paramb1 = paramb1.g();
        paramb2 = paramb2.g();
        if (paramb1.length == paramb2.length) {
          break label33;
        }
      }
    }
    label33:
    while (paramb2.e())
    {
      return false;
      int i1 = 0;
      for (;;)
      {
        if (i1 == paramb1.length) {
          break label81;
        }
        if (!a(paramb1[i1], paramb2[i1])) {
          break;
        }
        i1 += 1;
      }
    }
    return a(paramb1.f(), paramb2.f());
    label81:
    return true;
  }
  
  public boolean a(org.a.a.j.c paramc1, org.a.a.j.c paramc2)
  {
    paramc1 = paramc1.e();
    paramc2 = paramc2.e();
    if (paramc1.length != paramc2.length) {
      return false;
    }
    boolean bool;
    if ((paramc1[0].f() != null) && (paramc2[0].f() != null)) {
      if (!paramc1[0].f().e().equals(paramc2[0].f().e())) {
        bool = true;
      }
    }
    for (;;)
    {
      label64:
      int i1 = 0;
      for (;;)
      {
        if (i1 != paramc1.length)
        {
          if (!a(bool, paramc1[i1], paramc2)) {
            break;
          }
          i1 += 1;
          continue;
          bool = false;
          break label64;
        }
      }
      return true;
      bool = false;
    }
  }
  
  public String b(org.a.a.j.c paramc)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramc = paramc.e();
    int i1 = 0;
    int i2 = 1;
    while (i1 < paramc.length)
    {
      org.a.a.j.a[] arrayOfa;
      int i3;
      if (i2 != 0)
      {
        i2 = 0;
        if (!paramc[i1].e()) {
          break label113;
        }
        arrayOfa = paramc[i1].g();
        i3 = 0;
        int i4 = 1;
        label58:
        if (i3 == arrayOfa.length) {
          break label127;
        }
        if (i4 == 0) {
          break label103;
        }
        i4 = 0;
      }
      for (;;)
      {
        b.a(localStringBuffer, arrayOfa[i3], K);
        i3 += 1;
        break label58;
        localStringBuffer.append(',');
        break;
        label103:
        localStringBuffer.append('+');
      }
      label113:
      b.a(localStringBuffer, paramc[i1].f(), K);
      label127:
      i1 += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\j\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */