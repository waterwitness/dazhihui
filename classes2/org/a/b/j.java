package org.a.b;

import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.a.a.b.b;
import org.a.a.b.d;
import org.a.a.b.h;
import org.a.a.bb;
import org.a.a.be;
import org.a.a.bl;
import org.a.a.h.c;
import org.a.a.l;
import org.a.a.m;
import org.a.a.t;

public class j
{
  private static final String A;
  private static final String B;
  private static final Set C;
  private static final Map D;
  public static final String a = d.a.e();
  public static final String b = org.a.a.g.a.i.e();
  public static final String c = org.a.a.f.a.e.e();
  public static final String d = org.a.a.f.a.b.e();
  public static final String e = org.a.a.f.a.c.e();
  public static final String f = org.a.a.f.a.d.e();
  public static final String g = c.G.e();
  public static final String h = org.a.a.c.a.a.e();
  public static final String i = org.a.a.i.a.c.e();
  public static final String j = org.a.a.i.a.b.e();
  public static final String k = org.a.a.i.a.d.e();
  public static final String l = c.h_.e();
  public static final String m = org.a.a.l.a.V.e();
  public static final String n = org.a.a.l.a.i.e();
  public static final String o = c.k.e();
  public static final String p = org.a.a.c.a.c.e();
  public static final String q = org.a.a.c.a.d.e();
  private static final String x = org.a.a.l.a.i.e();
  private static final String y = org.a.a.l.a.m.e();
  private static final String z = org.a.a.l.a.n.e();
  protected List r = new ArrayList();
  protected List s = new ArrayList();
  protected List t = new ArrayList();
  protected List u = new ArrayList();
  protected Map v = new HashMap();
  protected final SecureRandom w;
  
  static
  {
    A = org.a.a.l.a.o.e();
    B = org.a.a.l.a.p.e();
    C = new HashSet();
    D = new HashMap();
    C.add(m);
    C.add(n);
    C.add(x);
    C.add(y);
    C.add(z);
    C.add(A);
    C.add(B);
    D.put(b, x);
    D.put(c, y);
    D.put(d, z);
    D.put(e, A);
    D.put(f, B);
  }
  
  protected j()
  {
    this(new SecureRandom());
  }
  
  protected j(SecureRandom paramSecureRandom)
  {
    this.w = paramSecureRandom;
  }
  
  static h a(X509Certificate paramX509Certificate)
  {
    return new h(n.b(paramX509Certificate));
  }
  
  protected String a(PrivateKey paramPrivateKey, String paramString)
  {
    Object localObject = null;
    if (((paramPrivateKey instanceof RSAPrivateKey)) || ("RSA".equalsIgnoreCase(paramPrivateKey.getAlgorithm()))) {
      localObject = l;
    }
    do
    {
      do
      {
        do
        {
          return (String)localObject;
          if ((!(paramPrivateKey instanceof DSAPrivateKey)) && (!"DSA".equalsIgnoreCase(paramPrivateKey.getAlgorithm()))) {
            break;
          }
          localObject = m;
        } while (paramString.equals(b));
        throw new IllegalArgumentException("can't mix DSA with anything but SHA1");
        if ((!"ECDSA".equalsIgnoreCase(paramPrivateKey.getAlgorithm())) && (!"EC".equalsIgnoreCase(paramPrivateKey.getAlgorithm()))) {
          break;
        }
        paramPrivateKey = (String)D.get(paramString);
        localObject = paramPrivateKey;
      } while (paramPrivateKey != null);
      throw new IllegalArgumentException("can't mix ECDSA with anything but SHA family digests");
      if (((paramPrivateKey instanceof org.a.c.a.a)) || ("GOST3410".equalsIgnoreCase(paramPrivateKey.getAlgorithm()))) {
        return p;
      }
    } while (!"ECGOST3410".equalsIgnoreCase(paramPrivateKey.getAlgorithm()));
    return q;
  }
  
  protected Map a(be parambe, org.a.a.k.a parama, byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("contentType", parambe);
    localHashMap.put("digestAlgID", parama);
    localHashMap.put("digest", paramArrayOfByte.clone());
    return localHashMap;
  }
  
  protected org.a.a.k.a a(String paramString, Signature paramSignature)
  {
    if (C.contains(paramString)) {
      return new org.a.a.k.a(new be(paramString));
    }
    if (paramString.equals(o))
    {
      paramSignature = paramSignature.getParameters();
      return new org.a.a.k.a(new be(paramString), l.a(paramSignature.getEncoded()));
    }
    return new org.a.a.k.a(new be(paramString), new bb());
  }
  
  protected t a(b paramb)
  {
    if (paramb != null) {
      return new bl(paramb.b());
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */