package org.a.a.k;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.a.a.ar;
import org.a.a.bd;
import org.a.a.be;
import org.a.a.bj;
import org.a.a.bl;
import org.a.a.bn;
import org.a.a.bs;
import org.a.a.l;
import org.a.a.r;
import org.a.a.t;
import org.a.e.b;

public class h
  extends org.a.a.d
{
  public static final be A;
  public static final be B;
  public static final be C;
  public static final be D;
  public static final be E;
  public static final be F;
  public static final be G;
  public static final be H;
  public static final be I;
  public static boolean J;
  public static final Hashtable K;
  public static final Hashtable L;
  public static final Hashtable M;
  public static final Hashtable N;
  public static final Hashtable O;
  public static final Hashtable P;
  private static final Boolean Q;
  private static final Boolean R;
  public static final be a = new be("2.5.4.6");
  public static final be b = new be("2.5.4.10");
  public static final be c = new be("2.5.4.11");
  public static final be d = new be("2.5.4.12");
  public static final be e = new be("2.5.4.3");
  public static final be f = new be("2.5.4.5");
  public static final be g = new be("2.5.4.9");
  public static final be h = f;
  public static final be i = new be("2.5.4.7");
  public static final be j = new be("2.5.4.8");
  public static final be k = new be("2.5.4.4");
  public static final be l = new be("2.5.4.42");
  public static final be m = new be("2.5.4.43");
  public static final be n = new be("2.5.4.44");
  public static final be o = new be("2.5.4.45");
  public static final be p = new be("2.5.4.15");
  public static final be q = new be("2.5.4.17");
  public static final be r = new be("2.5.4.46");
  public static final be s = new be("2.5.4.65");
  public static final be t = new be("1.3.6.1.5.5.7.9.1");
  public static final be u = new be("1.3.6.1.5.5.7.9.2");
  public static final be v = new be("1.3.6.1.5.5.7.9.3");
  public static final be w = new be("1.3.6.1.5.5.7.9.4");
  public static final be x = new be("1.3.6.1.5.5.7.9.5");
  public static final be y = new be("1.3.36.8.3.14");
  public static final be z = new be("2.5.4.16");
  private i S = null;
  private Vector T = new Vector();
  private Vector U = new Vector();
  private Vector V = new Vector();
  private r W;
  private boolean X;
  private int Y;
  
  static
  {
    A = new be("2.5.4.54");
    B = k.g;
    C = k.c_;
    D = org.a.a.h.c.T;
    E = org.a.a.h.c.U;
    F = org.a.a.h.c.aa;
    G = D;
    H = new be("0.9.2342.19200300.100.1.25");
    I = new be("0.9.2342.19200300.100.1.1");
    J = false;
    K = new Hashtable();
    L = new Hashtable();
    M = new Hashtable();
    N = new Hashtable();
    O = K;
    P = N;
    Q = new Boolean(true);
    R = new Boolean(false);
    K.put(a, "C");
    K.put(b, "O");
    K.put(d, "T");
    K.put(c, "OU");
    K.put(e, "CN");
    K.put(i, "L");
    K.put(j, "ST");
    K.put(f, "SERIALNUMBER");
    K.put(D, "E");
    K.put(H, "DC");
    K.put(I, "UID");
    K.put(g, "STREET");
    K.put(k, "SURNAME");
    K.put(l, "GIVENNAME");
    K.put(m, "INITIALS");
    K.put(n, "GENERATION");
    K.put(F, "unstructuredAddress");
    K.put(E, "unstructuredName");
    K.put(o, "UniqueIdentifier");
    K.put(r, "DN");
    K.put(s, "Pseudonym");
    K.put(z, "PostalAddress");
    K.put(y, "NameAtBirth");
    K.put(w, "CountryOfCitizenship");
    K.put(x, "CountryOfResidence");
    K.put(v, "Gender");
    K.put(u, "PlaceOfBirth");
    K.put(t, "DateOfBirth");
    K.put(q, "PostalCode");
    K.put(p, "BusinessCategory");
    K.put(B, "TelephoneNumber");
    K.put(C, "Name");
    L.put(a, "C");
    L.put(b, "O");
    L.put(c, "OU");
    L.put(e, "CN");
    L.put(i, "L");
    L.put(j, "ST");
    L.put(g, "STREET");
    L.put(H, "DC");
    L.put(I, "UID");
    M.put(a, "C");
    M.put(b, "O");
    M.put(c, "OU");
    M.put(e, "CN");
    M.put(i, "L");
    M.put(j, "ST");
    M.put(g, "STREET");
    N.put("c", a);
    N.put("o", b);
    N.put("t", d);
    N.put("ou", c);
    N.put("cn", e);
    N.put("l", i);
    N.put("st", j);
    N.put("sn", f);
    N.put("serialnumber", f);
    N.put("street", g);
    N.put("emailaddress", G);
    N.put("dc", H);
    N.put("e", G);
    N.put("uid", I);
    N.put("surname", k);
    N.put("givenname", l);
    N.put("initials", m);
    N.put("generation", n);
    N.put("unstructuredaddress", F);
    N.put("unstructuredname", E);
    N.put("uniqueidentifier", o);
    N.put("dn", r);
    N.put("pseudonym", s);
    N.put("postaladdress", z);
    N.put("nameofbirth", y);
    N.put("countryofcitizenship", w);
    N.put("countryofresidence", x);
    N.put("gender", v);
    N.put("placeofbirth", u);
    N.put("dateofbirth", t);
    N.put("postalcode", q);
    N.put("businesscategory", p);
    N.put("telephonenumber", B);
    N.put("name", C);
  }
  
  protected h() {}
  
  public h(String paramString)
  {
    this(J, N, paramString);
  }
  
  public h(r paramr)
  {
    this.W = paramr;
    Enumeration localEnumeration = paramr.e();
    if (localEnumeration.hasMoreElements())
    {
      t localt = t.a(((ar)localEnumeration.nextElement()).c());
      int i1 = 0;
      label82:
      label209:
      Vector localVector;
      if (i1 < localt.f())
      {
        paramr = r.a(localt.a(i1));
        if (paramr.f() != 2) {
          throw new IllegalArgumentException("badly sized pair");
        }
        this.T.addElement(be.a(paramr.a(0)));
        paramr = paramr.a(1);
        if ((!(paramr instanceof bn)) || ((paramr instanceof bs))) {
          break label250;
        }
        paramr = ((bn)paramr).i_();
        if ((paramr.length() <= 0) || (paramr.charAt(0) != '#')) {
          break label239;
        }
        this.U.addElement("\\" + paramr);
        localVector = this.V;
        if (i1 == 0) {
          break label295;
        }
      }
      label239:
      label250:
      label295:
      for (paramr = Q;; paramr = R)
      {
        localVector.addElement(paramr);
        i1 += 1;
        break label82;
        break;
        this.U.addElement(paramr);
        break label209;
        this.U.addElement("#" + a(org.a.e.a.d.a(paramr.c().b())));
        break label209;
      }
    }
  }
  
  public h(boolean paramBoolean, Hashtable paramHashtable, String paramString)
  {
    this(paramBoolean, paramHashtable, paramString, new e());
  }
  
  public h(boolean paramBoolean, Hashtable paramHashtable, String paramString, i parami)
  {
    this.S = parami;
    paramString = new j(paramString);
    int i1;
    while (paramString.a())
    {
      Object localObject = paramString.b();
      i1 = ((String)localObject).indexOf('=');
      if (i1 == -1) {
        throw new IllegalArgumentException("badly formated directory string");
      }
      parami = ((String)localObject).substring(0, i1);
      String str = ((String)localObject).substring(i1 + 1);
      localObject = a(parami, paramHashtable);
      if (str.indexOf('+') > 0)
      {
        parami = new j(str, '+');
        str = parami.b();
        this.T.addElement(localObject);
        this.U.addElement(str);
        this.V.addElement(R);
        while (parami.a())
        {
          str = parami.b();
          i1 = str.indexOf('=');
          localObject = str.substring(0, i1);
          str = str.substring(i1 + 1);
          this.T.addElement(a((String)localObject, paramHashtable));
          this.U.addElement(str);
          this.V.addElement(Q);
        }
      }
      else
      {
        this.T.addElement(localObject);
        this.U.addElement(str);
        this.V.addElement(R);
      }
    }
    if (paramBoolean)
    {
      paramHashtable = new Vector();
      paramString = new Vector();
      parami = new Vector();
      int i2 = 0;
      i1 = 1;
      if (i2 < this.T.size())
      {
        if (((Boolean)this.V.elementAt(i2)).booleanValue())
        {
          paramHashtable.insertElementAt(this.T.elementAt(i2), i1);
          paramString.insertElementAt(this.U.elementAt(i2), i1);
          parami.insertElementAt(this.V.elementAt(i2), i1);
          i1 += 1;
        }
        for (;;)
        {
          i2 += 1;
          break;
          paramHashtable.insertElementAt(this.T.elementAt(i2), 0);
          paramString.insertElementAt(this.U.elementAt(i2), 0);
          parami.insertElementAt(this.V.elementAt(i2), 0);
          i1 = 1;
        }
      }
      this.T = paramHashtable;
      this.U = paramString;
      this.V = parami;
    }
  }
  
  private String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length];
    int i1 = 0;
    while (i1 != arrayOfChar.length)
    {
      arrayOfChar[i1] = ((char)(paramArrayOfByte[i1] & 0xFF));
      i1 += 1;
    }
    return new String(arrayOfChar);
  }
  
  private be a(String paramString, Hashtable paramHashtable)
  {
    if (b.b(paramString).startsWith("OID.")) {
      paramHashtable = new be(paramString.substring(4));
    }
    be localbe;
    do
    {
      return paramHashtable;
      if ((paramString.charAt(0) >= '0') && (paramString.charAt(0) <= '9')) {
        return new be(paramString);
      }
      localbe = (be)paramHashtable.get(b.c(paramString));
      paramHashtable = localbe;
    } while (localbe != null);
    throw new IllegalArgumentException("Unknown object id - " + paramString + " - passed to distinguished name");
  }
  
  public static h a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof h))) {
      return (h)paramObject;
    }
    if ((paramObject instanceof org.a.a.j.c)) {
      return new h(r.a(((org.a.a.j.c)paramObject).c()));
    }
    if (paramObject != null) {
      return new h(r.a(paramObject));
    }
    return null;
  }
  
  private void a(StringBuffer paramStringBuffer, Hashtable paramHashtable, be parambe, String paramString)
  {
    paramHashtable = (String)paramHashtable.get(parambe);
    if (paramHashtable != null) {
      paramStringBuffer.append(paramHashtable);
    }
    for (;;)
    {
      paramStringBuffer.append('=');
      int i4 = paramStringBuffer.length();
      paramStringBuffer.append(paramString);
      int i3 = paramStringBuffer.length();
      int i2 = i3;
      int i1 = i4;
      if (paramString.length() >= 2)
      {
        i2 = i3;
        i1 = i4;
        if (paramString.charAt(0) == '\\')
        {
          i2 = i3;
          i1 = i4;
          if (paramString.charAt(1) == '#') {
            i1 = i4 + 2;
          }
        }
      }
      for (i2 = i3; i1 != i2; i2 = i3)
      {
        if ((paramStringBuffer.charAt(i1) != ',') && (paramStringBuffer.charAt(i1) != '"') && (paramStringBuffer.charAt(i1) != '\\') && (paramStringBuffer.charAt(i1) != '+') && (paramStringBuffer.charAt(i1) != '=') && (paramStringBuffer.charAt(i1) != '<') && (paramStringBuffer.charAt(i1) != '>'))
        {
          i3 = i2;
          i4 = i1;
          if (paramStringBuffer.charAt(i1) != ';') {}
        }
        else
        {
          paramStringBuffer.insert(i1, "\\");
          i4 = i1 + 1;
          i3 = i2 + 1;
        }
        i1 = i4 + 1;
      }
      paramStringBuffer.append(parambe.e());
    }
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    paramString1 = b(paramString1);
    paramString2 = b(paramString2);
    return (paramString1.equals(paramString2)) || (d(paramString1).equals(d(paramString2)));
  }
  
  private String b(String paramString)
  {
    paramString = b.c(paramString.trim());
    if ((paramString.length() > 0) && (paramString.charAt(0) == '#'))
    {
      l locall = c(paramString);
      if ((locall instanceof bn)) {
        return b.c(((bn)locall).i_().trim());
      }
    }
    return paramString;
  }
  
  private l c(String paramString)
  {
    try
    {
      paramString = l.a(org.a.e.a.d.a(paramString.substring(1)));
      return paramString;
    }
    catch (IOException paramString)
    {
      throw new IllegalStateException("unknown encoding in name: " + paramString);
    }
  }
  
  private String d(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString.length() != 0)
    {
      char c1 = paramString.charAt(0);
      localStringBuffer.append(c1);
      int i1 = 1;
      for (char c2 = c1; i1 < paramString.length(); c2 = c1)
      {
        c1 = paramString.charAt(i1);
        if ((c2 != ' ') || (c1 != ' ')) {
          localStringBuffer.append(c1);
        }
        i1 += 1;
      }
    }
    return localStringBuffer.toString();
  }
  
  public String a(boolean paramBoolean, Hashtable paramHashtable)
  {
    StringBuffer localStringBuffer2 = new StringBuffer();
    Vector localVector = new Vector();
    StringBuffer localStringBuffer1 = null;
    int i1 = 0;
    if (i1 < this.T.size())
    {
      if (((Boolean)this.V.elementAt(i1)).booleanValue())
      {
        localStringBuffer1.append('+');
        a(localStringBuffer1, paramHashtable, (be)this.T.elementAt(i1), (String)this.U.elementAt(i1));
      }
      for (;;)
      {
        i1 += 1;
        break;
        localStringBuffer1 = new StringBuffer();
        a(localStringBuffer1, paramHashtable, (be)this.T.elementAt(i1), (String)this.U.elementAt(i1));
        localVector.addElement(localStringBuffer1);
      }
    }
    int i2;
    if (paramBoolean)
    {
      i1 = localVector.size() - 1;
      i2 = 1;
      if (i1 >= 0)
      {
        if (i2 != 0) {
          i2 = 0;
        }
        for (;;)
        {
          localStringBuffer2.append(localVector.elementAt(i1).toString());
          i1 -= 1;
          break;
          localStringBuffer2.append(',');
        }
      }
    }
    else
    {
      i1 = 0;
      i2 = 1;
      if (i1 < localVector.size())
      {
        if (i2 != 0) {
          i2 = 0;
        }
        for (;;)
        {
          localStringBuffer2.append(localVector.elementAt(i1).toString());
          i1 += 1;
          break;
          localStringBuffer2.append(',');
        }
      }
    }
    return localStringBuffer2.toString();
  }
  
  public bd d()
  {
    if (this.W == null)
    {
      org.a.a.e locale2 = new org.a.a.e();
      org.a.a.e locale1 = new org.a.a.e();
      Object localObject = null;
      int i1 = 0;
      if (i1 != this.T.size())
      {
        org.a.a.e locale3 = new org.a.a.e();
        be localbe = (be)this.T.elementAt(i1);
        locale3.a(localbe);
        String str = (String)this.U.elementAt(i1);
        locale3.a(this.S.a(localbe, str));
        if ((localObject == null) || (((Boolean)this.V.elementAt(i1)).booleanValue())) {
          locale1.a(new bj(locale3));
        }
        for (;;)
        {
          i1 += 1;
          localObject = localbe;
          break;
          locale2.a(new bl(locale1));
          locale1 = new org.a.a.e();
          locale1.a(new bj(locale3));
        }
      }
      locale2.a(new bl(locale1));
      this.W = new bj(locale2);
    }
    return this.W;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      return bool1;
      if ((paramObject instanceof h)) {
        break;
      }
      bool1 = bool2;
    } while (!(paramObject instanceof r));
    Object localObject = ((ar)paramObject).c();
    if (c().equals(localObject)) {
      return true;
    }
    for (;;)
    {
      try
      {
        paramObject = a(paramObject);
        int i5 = this.T.size();
        bool1 = bool2;
        if (i5 != ((h)paramObject).T.size()) {
          break;
        }
        localObject = new boolean[i5];
        int i2;
        int i3;
        int i1;
        be localbe;
        String str;
        if (this.T.elementAt(0).equals(((h)paramObject).T.elementAt(0)))
        {
          i2 = 1;
          i3 = i5;
          i1 = 0;
          if (i1 == i3) {
            continue;
          }
          localbe = (be)this.T.elementAt(i1);
          str = (String)this.U.elementAt(i1);
          i4 = 0;
          if (i4 >= i5) {
            break label269;
          }
          if (localObject[i4] != 0)
          {
            i4 += 1;
            continue;
          }
        }
        else
        {
          i1 = i5 - 1;
          i2 = -1;
          i3 = -1;
          continue;
        }
        if ((!localbe.equals((be)((h)paramObject).T.elementAt(i4))) || (!a(str, (String)((h)paramObject).U.elementAt(i4)))) {
          continue;
        }
        localObject[i4] = 1;
        i4 = 1;
        bool1 = bool2;
        if (i4 == 0) {
          break;
        }
        i1 += i2;
        continue;
        return true;
      }
      catch (IllegalArgumentException paramObject)
      {
        return false;
      }
      label269:
      int i4 = 0;
    }
  }
  
  public int hashCode()
  {
    if (this.X) {
      return this.Y;
    }
    this.X = true;
    int i1 = 0;
    while (i1 != this.T.size())
    {
      String str = d(b((String)this.U.elementAt(i1)));
      this.Y ^= this.T.elementAt(i1).hashCode();
      int i2 = this.Y;
      this.Y = (str.hashCode() ^ i2);
      i1 += 1;
    }
    return this.Y;
  }
  
  public String toString()
  {
    return a(J, K);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */