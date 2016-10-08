package org.a.b;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import org.a.a.b.c;
import org.a.a.bb;
import org.a.a.be;
import org.a.a.bf;
import org.a.a.bh;
import org.a.a.k.a;

class i
{
  final PrivateKey a;
  final org.a.a.b.h b;
  final String c;
  final String d;
  final b e;
  final b f;
  final org.a.a.b.b g;
  
  i(h paramh, PrivateKey paramPrivateKey, org.a.a.b.h paramh1, String paramString1, String paramString2, b paramb1, b paramb2, org.a.a.b.b paramb)
  {
    this.a = paramPrivateKey;
    this.b = paramh1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramb1;
    this.f = paramb2;
    this.g = paramb;
  }
  
  org.a.a.b.i a(be parambe, d paramd, SecureRandom paramSecureRandom, Provider paramProvider, boolean paramBoolean)
  {
    a locala = a();
    Object localObject1 = k.a.a(this.c);
    Object localObject2 = (String)localObject1 + "with" + k.a.c(this.d);
    localObject2 = k.a.b((String)localObject2, paramProvider);
    paramProvider = k.a.a((String)localObject1, paramProvider);
    localObject1 = this.h.a(this.d, (Signature)localObject2);
    if (paramd != null) {
      paramd.a(new p(paramProvider));
    }
    byte[] arrayOfByte = paramProvider.digest();
    this.h.v.put(this.c, arrayOfByte.clone());
    if (paramBoolean)
    {
      paramProvider = this.h.a(parambe, locala, arrayOfByte);
      if (this.e != null)
      {
        paramProvider = this.e.a(Collections.unmodifiableMap(paramProvider));
        ((Signature)localObject2).initSign(this.a, paramSecureRandom);
        paramSecureRandom = new BufferedOutputStream(new q((Signature)localObject2));
        if (paramProvider == null) {
          break label386;
        }
        paramd = paramProvider;
        if (parambe == null)
        {
          paramd = paramProvider;
          if (paramProvider.a(c.a) != null)
          {
            paramd = paramProvider.a();
            paramd.remove(c.a);
            paramd = new org.a.a.b.b(paramd);
          }
        }
        paramd = this.h.a(paramd);
        new bh(paramSecureRandom).a(paramd);
        label279:
        paramSecureRandom.close();
        paramSecureRandom = ((Signature)localObject2).sign();
        if (this.f == null) {
          break label402;
        }
        parambe = this.h.a(parambe, locala, arrayOfByte);
        parambe.put("encryptedDigest", paramSecureRandom.clone());
        parambe = this.f.a(Collections.unmodifiableMap(parambe));
      }
    }
    label386:
    label402:
    for (parambe = this.h.a(parambe);; parambe = null)
    {
      return new org.a.a.b.i(this.b, locala, paramd, (a)localObject1, new bf(paramSecureRandom), parambe);
      paramProvider = null;
      break;
      paramProvider = this.g;
      break;
      if (paramd != null) {
        paramd.a(paramSecureRandom);
      }
      paramd = null;
      break label279;
    }
  }
  
  a a()
  {
    return new a(new be(this.c), new bb());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */