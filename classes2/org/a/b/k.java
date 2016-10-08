package org.a.b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import org.a.a.bb;
import org.a.a.be;
import org.a.a.h.c;
import org.a.a.m;

class k
{
  static final k a = new k();
  private static final Map b = new HashMap();
  private static final Map c = new HashMap();
  private static final Map d = new HashMap();
  
  static
  {
    a(org.a.a.f.a.C, "SHA224", "DSA");
    a(org.a.a.f.a.D, "SHA256", "DSA");
    a(org.a.a.f.a.E, "SHA384", "DSA");
    a(org.a.a.f.a.F, "SHA512", "DSA");
    a(org.a.a.g.a.j, "SHA1", "DSA");
    a(org.a.a.g.a.a, "MD4", "RSA");
    a(org.a.a.g.a.c, "MD4", "RSA");
    a(org.a.a.g.a.b, "MD5", "RSA");
    a(org.a.a.g.a.k, "SHA1", "RSA");
    a(c.i_, "MD2", "RSA");
    a(c.d, "MD4", "RSA");
    a(c.e, "MD5", "RSA");
    a(c.j_, "SHA1", "RSA");
    a(c.p_, "SHA224", "RSA");
    a(c.m_, "SHA256", "RSA");
    a(c.n_, "SHA384", "RSA");
    a(c.o_, "SHA512", "RSA");
    a(org.a.a.l.a.i, "SHA1", "ECDSA");
    a(org.a.a.l.a.m, "SHA224", "ECDSA");
    a(org.a.a.l.a.n, "SHA256", "ECDSA");
    a(org.a.a.l.a.o, "SHA384", "ECDSA");
    a(org.a.a.l.a.p, "SHA512", "ECDSA");
    a(org.a.a.l.a.V, "SHA1", "DSA");
    a(org.a.a.d.a.q, "SHA1", "ECDSA");
    a(org.a.a.d.a.r, "SHA224", "ECDSA");
    a(org.a.a.d.a.s, "SHA256", "ECDSA");
    a(org.a.a.d.a.t, "SHA384", "ECDSA");
    a(org.a.a.d.a.u, "SHA512", "ECDSA");
    a(org.a.a.d.a.l, "SHA1", "RSA");
    a(org.a.a.d.a.m, "SHA256", "RSA");
    a(org.a.a.d.a.n, "SHA1", "RSAandMGF1");
    a(org.a.a.d.a.o, "SHA256", "RSAandMGF1");
    b.put(org.a.a.l.a.U.e(), "DSA");
    b.put(c.h_.e(), "RSA");
    b.put(org.a.a.i.a.e, "RSA");
    b.put(org.a.a.k.k.l.e(), "RSA");
    b.put(h.o, "RSAandMGF1");
    b.put(org.a.a.c.a.c.e(), "GOST3410");
    b.put(org.a.a.c.a.d.e(), "ECGOST3410");
    b.put("1.3.6.1.4.1.5849.1.6.2", "ECGOST3410");
    b.put("1.3.6.1.4.1.5849.1.1.5", "GOST3410");
    b.put(org.a.a.c.a.f.e(), "ECGOST3410");
    b.put(org.a.a.c.a.e.e(), "GOST3410");
    c.put(c.E.e(), "MD2");
    c.put(c.F.e(), "MD4");
    c.put(c.G.e(), "MD5");
    c.put(org.a.a.g.a.i.e(), "SHA1");
    c.put(org.a.a.f.a.e.e(), "SHA224");
    c.put(org.a.a.f.a.b.e(), "SHA256");
    c.put(org.a.a.f.a.c.e(), "SHA384");
    c.put(org.a.a.f.a.d.e(), "SHA512");
    c.put(org.a.a.i.a.c.e(), "RIPEMD128");
    c.put(org.a.a.i.a.b.e(), "RIPEMD160");
    c.put(org.a.a.i.a.d.e(), "RIPEMD256");
    c.put(org.a.a.c.a.a.e(), "GOST3411");
    c.put("1.3.6.1.4.1.5849.1.2.1", "GOST3411");
    d.put("SHA1", new String[] { "SHA-1" });
    d.put("SHA224", new String[] { "SHA-224" });
    d.put("SHA256", new String[] { "SHA-256" });
    d.put("SHA384", new String[] { "SHA-384" });
    d.put("SHA512", new String[] { "SHA-512" });
  }
  
  private static void a(be parambe, String paramString1, String paramString2)
  {
    c.put(parambe.e(), paramString1);
    b.put(parambe.e(), paramString2);
  }
  
  private MessageDigest c(String paramString, Provider paramProvider)
  {
    if (paramProvider != null) {
      return MessageDigest.getInstance(paramString, paramProvider);
    }
    return MessageDigest.getInstance(paramString);
  }
  
  String a(String paramString)
  {
    String str = (String)c.get(paramString);
    if (str != null) {
      return str;
    }
    return paramString;
  }
  
  MessageDigest a(String paramString, Provider paramProvider)
  {
    try
    {
      MessageDigest localMessageDigest1 = c(paramString, paramProvider);
      return localMessageDigest1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException1)
    {
      String[] arrayOfString = b(paramString);
      int i = 0;
      while (i != arrayOfString.length) {
        try
        {
          MessageDigest localMessageDigest2 = c(arrayOfString[i], paramProvider);
          return localMessageDigest2;
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
        {
          i += 1;
        }
      }
      if (paramProvider != null) {
        return a(paramString, null);
      }
      throw localNoSuchAlgorithmException1;
    }
  }
  
  org.a.a.k.a a(org.a.a.k.a parama)
  {
    org.a.a.k.a locala = parama;
    if (parama.g() == null) {
      locala = new org.a.a.k.a(parama.f(), bb.a);
    }
    return locala;
  }
  
  Signature b(String paramString, Provider paramProvider)
  {
    if (paramProvider != null) {
      return Signature.getInstance(paramString, paramProvider);
    }
    return Signature.getInstance(paramString);
  }
  
  String[] b(String paramString)
  {
    paramString = (String[])d.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return new String[0];
  }
  
  String c(String paramString)
  {
    String str = (String)b.get(paramString);
    if (str != null) {
      return str;
    }
    return paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */