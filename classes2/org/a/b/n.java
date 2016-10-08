package org.a.b;

import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.a.a.ai;
import org.a.a.ar;
import org.a.a.b.f;
import org.a.a.ba;
import org.a.a.e;
import org.a.a.k.c;
import org.a.a.l;
import org.a.a.t;

class n
{
  private static final Runtime a = ;
  
  public static Provider a(String paramString)
  {
    if (paramString != null)
    {
      Provider localProvider = Security.getProvider(paramString);
      if (localProvider != null) {
        return localProvider;
      }
      throw new NoSuchProviderException("provider " + paramString + " not found.");
    }
    return null;
  }
  
  static c a(X509Certificate paramX509Certificate)
  {
    try
    {
      paramX509Certificate = c.a(l.a(paramX509Certificate.getTBSCertificate()));
      return paramX509Certificate;
    }
    catch (Exception paramX509Certificate)
    {
      throw new IllegalArgumentException("can't extract TBS structure from this cert");
    }
  }
  
  static t a(List paramList)
  {
    e locale = new e();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      locale.a((ar)paramList.next());
    }
    return new ai(locale);
  }
  
  static f b(X509Certificate paramX509Certificate)
  {
    paramX509Certificate = a(paramX509Certificate);
    return new f(paramX509Certificate.f(), paramX509Certificate.e().e());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */