package com.d.a.c;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.af;
import com.d.a.h;
import com.d.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

public class ac
  extends ai
{
  protected SSLContext a;
  protected TrustManager[] b;
  protected HostnameVerifier c;
  protected List<ab> d = new ArrayList();
  
  public ac(a parama)
  {
    super(parama, "https", 443);
  }
  
  protected c a(l paraml, Uri paramUri, int paramInt, boolean paramBoolean, c paramc)
  {
    return new ae(this, paramc, paramBoolean, paraml, paramUri, paramInt);
  }
  
  protected o a(l paraml, c paramc)
  {
    return new ad(this, paramc);
  }
  
  public SSLContext a()
  {
    if (this.a != null) {
      return this.a;
    }
    return h.c();
  }
  
  protected SSLEngine a(l paraml, String paramString, int paramInt)
  {
    SSLEngine localSSLEngine = a().createSSLEngine();
    Iterator localIterator = this.d.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localSSLEngine;
      }
      ((ab)localIterator.next()).a(localSSLEngine, paraml, paramString, paramInt);
    }
  }
  
  protected void a(af paramaf, l paraml, Uri paramUri, int paramInt, c paramc)
  {
    h.a(paramaf, paramUri.getHost(), paramInt, a(paraml, paramUri.getHost(), paramInt), this.b, this.c, true, a(paraml, paramc));
  }
  
  public void a(ab paramab)
  {
    this.d.add(paramab);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */