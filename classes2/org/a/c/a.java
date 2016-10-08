package org.a.c;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.a.a.ap;
import org.a.a.ar;
import org.a.a.ba;
import org.a.a.bb;
import org.a.a.be;
import org.a.a.h.c;
import org.a.a.h.d;
import org.a.a.k.h;
import org.a.a.l;
import org.a.a.r;
import org.a.a.t;

public class a
  extends org.a.a.h.a
{
  private static Hashtable d = new Hashtable();
  private static Hashtable e = new Hashtable();
  private static Hashtable f = new Hashtable();
  private static Hashtable g = new Hashtable();
  private static Set h = new HashSet();
  
  static
  {
    d.put("MD2WITHRSAENCRYPTION", new be("1.2.840.113549.1.1.2"));
    d.put("MD2WITHRSA", new be("1.2.840.113549.1.1.2"));
    d.put("MD5WITHRSAENCRYPTION", new be("1.2.840.113549.1.1.4"));
    d.put("MD5WITHRSA", new be("1.2.840.113549.1.1.4"));
    d.put("RSAWITHMD5", new be("1.2.840.113549.1.1.4"));
    d.put("SHA1WITHRSAENCRYPTION", new be("1.2.840.113549.1.1.5"));
    d.put("SHA1WITHRSA", new be("1.2.840.113549.1.1.5"));
    d.put("SHA224WITHRSAENCRYPTION", c.p_);
    d.put("SHA224WITHRSA", c.p_);
    d.put("SHA256WITHRSAENCRYPTION", c.m_);
    d.put("SHA256WITHRSA", c.m_);
    d.put("SHA384WITHRSAENCRYPTION", c.n_);
    d.put("SHA384WITHRSA", c.n_);
    d.put("SHA512WITHRSAENCRYPTION", c.o_);
    d.put("SHA512WITHRSA", c.o_);
    d.put("SHA1WITHRSAANDMGF1", c.k);
    d.put("SHA224WITHRSAANDMGF1", c.k);
    d.put("SHA256WITHRSAANDMGF1", c.k);
    d.put("SHA384WITHRSAANDMGF1", c.k);
    d.put("SHA512WITHRSAANDMGF1", c.k);
    d.put("RSAWITHSHA1", new be("1.2.840.113549.1.1.5"));
    d.put("RIPEMD128WITHRSAENCRYPTION", org.a.a.i.a.g);
    d.put("RIPEMD128WITHRSA", org.a.a.i.a.g);
    d.put("RIPEMD160WITHRSAENCRYPTION", org.a.a.i.a.f);
    d.put("RIPEMD160WITHRSA", org.a.a.i.a.f);
    d.put("RIPEMD256WITHRSAENCRYPTION", org.a.a.i.a.h);
    d.put("RIPEMD256WITHRSA", org.a.a.i.a.h);
    d.put("SHA1WITHDSA", new be("1.2.840.10040.4.3"));
    d.put("DSAWITHSHA1", new be("1.2.840.10040.4.3"));
    d.put("SHA224WITHDSA", org.a.a.f.a.C);
    d.put("SHA256WITHDSA", org.a.a.f.a.D);
    d.put("SHA384WITHDSA", org.a.a.f.a.E);
    d.put("SHA512WITHDSA", org.a.a.f.a.F);
    d.put("SHA1WITHECDSA", org.a.a.l.a.i);
    d.put("SHA224WITHECDSA", org.a.a.l.a.m);
    d.put("SHA256WITHECDSA", org.a.a.l.a.n);
    d.put("SHA384WITHECDSA", org.a.a.l.a.o);
    d.put("SHA512WITHECDSA", org.a.a.l.a.p);
    d.put("ECDSAWITHSHA1", org.a.a.l.a.i);
    d.put("GOST3411WITHGOST3410", org.a.a.c.a.e);
    d.put("GOST3410WITHGOST3411", org.a.a.c.a.e);
    d.put("GOST3411WITHECGOST3410", org.a.a.c.a.f);
    d.put("GOST3411WITHECGOST3410-2001", org.a.a.c.a.f);
    d.put("GOST3411WITHGOST3410-2001", org.a.a.c.a.f);
    g.put(new be("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
    g.put(c.p_, "SHA224WITHRSA");
    g.put(c.m_, "SHA256WITHRSA");
    g.put(c.n_, "SHA384WITHRSA");
    g.put(c.o_, "SHA512WITHRSA");
    g.put(org.a.a.c.a.e, "GOST3411WITHGOST3410");
    g.put(org.a.a.c.a.f, "GOST3411WITHECGOST3410");
    g.put(new be("1.2.840.113549.1.1.4"), "MD5WITHRSA");
    g.put(new be("1.2.840.113549.1.1.2"), "MD2WITHRSA");
    g.put(new be("1.2.840.10040.4.3"), "SHA1WITHDSA");
    g.put(org.a.a.l.a.i, "SHA1WITHECDSA");
    g.put(org.a.a.l.a.m, "SHA224WITHECDSA");
    g.put(org.a.a.l.a.n, "SHA256WITHECDSA");
    g.put(org.a.a.l.a.o, "SHA384WITHECDSA");
    g.put(org.a.a.l.a.p, "SHA512WITHECDSA");
    g.put(org.a.a.g.a.k, "SHA1WITHRSA");
    g.put(org.a.a.g.a.j, "SHA1WITHDSA");
    g.put(org.a.a.f.a.C, "SHA224WITHDSA");
    g.put(org.a.a.f.a.D, "SHA256WITHDSA");
    f.put(c.h_, "RSA");
    f.put(org.a.a.l.a.U, "DSA");
    h.add(org.a.a.l.a.i);
    h.add(org.a.a.l.a.m);
    h.add(org.a.a.l.a.n);
    h.add(org.a.a.l.a.o);
    h.add(org.a.a.l.a.p);
    h.add(org.a.a.l.a.V);
    h.add(org.a.a.f.a.C);
    h.add(org.a.a.f.a.D);
    h.add(org.a.a.c.a.e);
    h.add(org.a.a.c.a.f);
    org.a.a.k.a locala = new org.a.a.k.a(org.a.a.g.a.i, new bb());
    e.put("SHA1WITHRSAANDMGF1", a(locala, 20));
    locala = new org.a.a.k.a(org.a.a.f.a.e, new bb());
    e.put("SHA224WITHRSAANDMGF1", a(locala, 28));
    locala = new org.a.a.k.a(org.a.a.f.a.b, new bb());
    e.put("SHA256WITHRSAANDMGF1", a(locala, 32));
    locala = new org.a.a.k.a(org.a.a.f.a.c, new bb());
    e.put("SHA384WITHRSAANDMGF1", a(locala, 48));
    locala = new org.a.a.k.a(org.a.a.f.a.d, new bb());
    e.put("SHA512WITHRSAANDMGF1", a(locala, 64));
  }
  
  public a(String paramString, h paramh, PublicKey paramPublicKey, t paramt, PrivateKey paramPrivateKey)
  {
    this(paramString, paramh, paramPublicKey, paramt, paramPrivateKey, org.a.c.b.a.a);
  }
  
  public a(String paramString1, h paramh, PublicKey paramPublicKey, t paramt, PrivateKey paramPrivateKey, String paramString2)
  {
    String str = org.a.e.b.b(paramString1);
    be localbe = (be)d.get(str);
    if (localbe == null) {}
    for (;;)
    {
      try
      {
        localbe = new be(str);
        if (paramh == null) {
          throw new IllegalArgumentException("subject must not be null");
        }
      }
      catch (Exception paramString1)
      {
        throw new IllegalArgumentException("Unknown signature type requested");
      }
      if (paramPublicKey == null) {
        throw new IllegalArgumentException("public key must not be null");
      }
      if (h.contains(localbe)) {
        this.b = new org.a.a.k.a(localbe);
      }
      for (;;)
      {
        try
        {
          this.a = new org.a.a.h.b(paramh, new org.a.a.k.b((r)l.a(paramPublicKey.getEncoded())), paramt);
          if (paramString2 == null)
          {
            paramString1 = Signature.getInstance(paramString1);
            paramString1.initSign(paramPrivateKey);
          }
        }
        catch (IOException paramString1)
        {
          throw new IllegalArgumentException("can't encode public key");
        }
        try
        {
          paramString1.update(this.a.a("DER"));
          this.c = new ap(paramString1.sign());
          return;
        }
        catch (Exception paramString1)
        {
          throw new IllegalArgumentException("exception encoding TBS cert request - " + paramString1);
        }
        if (e.containsKey(str))
        {
          this.b = new org.a.a.k.a(localbe, (ar)e.get(str));
        }
        else
        {
          this.b = new org.a.a.k.a(localbe, bb.a);
          continue;
          paramString1 = Signature.getInstance(paramString1, paramString2);
        }
      }
    }
  }
  
  private static d a(org.a.a.k.a parama, int paramInt)
  {
    return new d(parama, new org.a.a.k.a(c.l_, parama), new ba(paramInt), new ba(1));
  }
  
  public byte[] a()
  {
    try
    {
      byte[] arrayOfByte = a("DER");
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException.toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */