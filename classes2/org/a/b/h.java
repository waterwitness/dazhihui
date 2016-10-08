package org.a.b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.a.ac;
import org.a.a.ar;
import org.a.a.bl;
import org.a.a.t;

public class h
  extends j
{
  private List x = new ArrayList();
  
  private void a(PrivateKey paramPrivateKey, org.a.a.b.h paramh, String paramString1, String paramString2, b paramb1, b paramb2, org.a.a.b.b paramb)
  {
    this.x.add(new i(this, paramPrivateKey, paramh, paramString2, paramString1, paramb1, paramb2, paramb));
  }
  
  public g a(String paramString1, d paramd, boolean paramBoolean, String paramString2)
  {
    return a(paramString1, paramd, paramBoolean, n.a(paramString2), true);
  }
  
  public g a(String paramString, d paramd, boolean paramBoolean1, Provider paramProvider, boolean paramBoolean2)
  {
    Object localObject2 = null;
    org.a.a.e locale1 = new org.a.a.e();
    org.a.a.e locale2 = new org.a.a.e();
    this.v.clear();
    Object localObject1 = this.t.iterator();
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (s)((Iterator)localObject1).next();
      locale1.a(k.a.a(((s)localObject3).a()));
      locale2.a(((s)localObject3).b());
    }
    int i;
    if (paramString == null)
    {
      i = 1;
      if (i == 0) {
        break label197;
      }
    }
    label197:
    for (paramString = null;; paramString = new org.a.a.m(paramString))
    {
      localObject1 = this.u.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (r)((Iterator)localObject1).next();
        OutputStream localOutputStream;
        if (paramd != null) {
          localOutputStream = ((r)localObject3).a();
        }
        try
        {
          paramd.a(localOutputStream);
          localOutputStream.close();
          localObject3 = ((r)localObject3).a(paramString);
          locale1.a(((org.a.a.b.i)localObject3).f());
          locale2.a((ar)localObject3);
        }
        catch (IOException paramString)
        {
          throw new c("data processing exception: " + paramString.getMessage(), paramString);
        }
      }
      i = 0;
      break;
    }
    localObject1 = this.x.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (i)((Iterator)localObject1).next();
      try
      {
        locale1.a(((i)localObject3).a());
        locale2.a(((i)localObject3).a(paramString, paramd, this.w, paramProvider, paramBoolean2));
      }
      catch (IOException paramString)
      {
        throw new c("encoding error.", paramString);
      }
      catch (InvalidKeyException paramString)
      {
        throw new c("key inappropriate for signature.", paramString);
      }
      catch (SignatureException paramString)
      {
        throw new c("error creating signature.", paramString);
      }
      catch (CertificateEncodingException paramString)
      {
        throw new c("error creating sid.", paramString);
      }
    }
    if (this.r.size() != 0) {}
    for (paramProvider = n.a(this.r);; paramProvider = null)
    {
      if (this.s.size() != 0) {}
      for (localObject1 = n.a(this.s);; localObject1 = null)
      {
        if (paramBoolean1)
        {
          localObject2 = new ByteArrayOutputStream();
          if (paramd == null) {}
        }
        try
        {
          paramd.a((OutputStream)localObject2);
          localObject2 = new ac(((ByteArrayOutputStream)localObject2).toByteArray());
          paramString = new org.a.a.b.e(paramString, (ar)localObject2);
          paramString = new org.a.a.b.g(new bl(locale1), paramString, paramProvider, (t)localObject1, new bl(locale2));
          return new g(paramd, new org.a.a.b.e(org.a.a.b.d.b, paramString));
        }
        catch (IOException paramString)
        {
          throw new c("encapsulation error.", paramString);
        }
      }
    }
  }
  
  public g a(d paramd, boolean paramBoolean, String paramString)
  {
    if ((paramd instanceof m)) {
      return a(((m)paramd).a().e(), paramd, paramBoolean, paramString);
    }
    return a(a, paramd, paramBoolean, paramString);
  }
  
  public void a(PrivateKey paramPrivateKey, X509Certificate paramX509Certificate, String paramString)
  {
    a(paramPrivateKey, paramX509Certificate, a(paramPrivateKey, paramString), paramString);
  }
  
  public void a(PrivateKey paramPrivateKey, X509Certificate paramX509Certificate, String paramString1, String paramString2)
  {
    a(paramPrivateKey, a(paramX509Certificate), paramString1, paramString2, new o(), null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */