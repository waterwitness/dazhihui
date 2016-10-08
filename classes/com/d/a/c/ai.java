package com.d.a.c;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.af;
import com.d.a.b.f;
import com.d.a.b.j;
import com.d.a.d.e;
import com.d.a.q;
import java.util.Hashtable;

public class ai
  extends bt
{
  String e;
  int f;
  int g = 300000;
  protected a h;
  boolean i;
  String j;
  int k;
  Hashtable<String, aq> l = new Hashtable();
  int m = Integer.MAX_VALUE;
  
  public ai(a parama)
  {
    this(parama, "http", 80);
  }
  
  public ai(a parama, String paramString, int paramInt)
  {
    this.h = parama;
    this.e = paramString;
    this.f = paramInt;
  }
  
  private aq a(String paramString)
  {
    aq localaq2 = (aq)this.l.get(paramString);
    aq localaq1 = localaq2;
    if (localaq2 == null)
    {
      localaq1 = new aq();
      this.l.put(paramString, localaq1);
    }
    return localaq1;
  }
  
  private void a(af paramaf)
  {
    paramaf.b(new ao(this, paramaf));
    paramaf.a(null);
    paramaf.a(new ap(this, paramaf));
  }
  
  private void a(af paramaf, u paramu)
  {
    if (paramaf == null) {
      return;
    }
    Object localObject = paramu.d();
    paramu = a((Uri)localObject, a((Uri)localObject), paramu.i(), paramu.j());
    localObject = new ar(this, paramaf);
    try
    {
      com.d.a.a locala = a(paramu).c;
      locala.e(localObject);
      paramaf.a(new an(this, locala, (ar)localObject, paramu));
      return;
    }
    finally {}
  }
  
  private void a(u paramu)
  {
    Object localObject = paramu.d();
    paramu = a((Uri)localObject, a((Uri)localObject), paramu.i(), paramu.j());
    for (;;)
    {
      try
      {
        localObject = (aq)this.l.get(paramu);
        if (localObject == null) {
          return;
        }
        ((aq)localObject).a -= 1;
        if ((((aq)localObject).a >= this.m) || (((aq)localObject).b.size() <= 0))
        {
          b(paramu);
          return;
        }
      }
      finally {}
      l locall = (l)((aq)localObject).b.remove();
      j localj = (j)locall.b;
      if (!localj.isCancelled()) {
        localj.b(a(locall));
      }
    }
  }
  
  private void b(String paramString)
  {
    aq localaq = (aq)this.l.get(paramString);
    if (localaq == null) {}
    label122:
    for (;;)
    {
      return;
      ar localar = (ar)localaq.c.f();
      af localaf = localar.a;
      if (localar.b + this.g > System.currentTimeMillis()) {}
      for (;;)
      {
        if ((localaq.a != 0) || (!localaq.b.isEmpty()) || (!localaq.c.isEmpty())) {
          break label122;
        }
        this.l.remove(paramString);
        return;
        localaq.c.g();
        localaf.a(null);
        localaf.d();
        if (!localaq.c.isEmpty()) {
          break;
        }
      }
    }
  }
  
  public int a(Uri paramUri)
  {
    if ((paramUri.getScheme() == null) || (!paramUri.getScheme().equals(this.e))) {
      return -1;
    }
    if (paramUri.getPort() == -1) {
      return this.f;
    }
    return paramUri.getPort();
  }
  
  protected c a(l paraml, Uri paramUri, int paramInt, boolean paramBoolean, c paramc)
  {
    return paramc;
  }
  
  public com.d.a.b.a a(l paraml)
  {
    Object localObject2 = paraml.j.d();
    int i1 = a(paraml.j.d());
    if (i1 == -1) {
      return null;
    }
    paraml.i.a("socket-owner", this);
    Object localObject1 = a(a((Uri)localObject2, i1, paraml.j.i(), paraml.j.j()));
    try
    {
      if (((aq)localObject1).a >= this.m)
      {
        localObject2 = new j();
        ((aq)localObject1).b.add(paraml);
        return (com.d.a.b.a)localObject2;
      }
    }
    finally {}
    ((aq)localObject1).a += 1;
    boolean bool;
    int n;
    if (((aq)localObject1).c.isEmpty())
    {
      if ((this.i) && (this.j == null) && (paraml.j.i() == null)) {
        break label406;
      }
      paraml.j.c("Connecting socket");
      bool = false;
      if ((paraml.j.i() == null) && (this.j != null)) {
        paraml.j.a(this.j, this.k);
      }
      if (paraml.j.i() == null) {
        break label394;
      }
      localObject1 = paraml.j.i();
      n = paraml.j.j();
      bool = true;
    }
    for (;;)
    {
      if (bool) {
        paraml.j.b("Using proxy: " + (String)localObject1 + ":" + n);
      }
      return this.h.b().a((String)localObject1, n, a(paraml, (Uri)localObject2, i1, bool, paraml.a));
      ar localar = (ar)((aq)localObject1).c.g();
      af localaf = localar.a;
      if (localar.b + this.g < System.currentTimeMillis())
      {
        localaf.a(null);
        localaf.d();
        break;
      }
      if (!localaf.i()) {
        break;
      }
      paraml.j.c("Reusing keep-alive socket");
      paraml.a.a(null, localaf);
      paraml = new j();
      paraml.e();
      return paraml;
      label394:
      localObject1 = ((Uri)localObject2).getHost();
      n = i1;
    }
    label406:
    paraml.j.b("Resolving domain and connecting to all available addresses");
    return (com.d.a.b.a)this.h.b().a(((Uri)localObject2).getHost()).b(new aj(this, paraml, (Uri)localObject2, i1));
  }
  
  String a(Uri paramUri, int paramInt1, String paramString, int paramInt2)
  {
    if (paramString != null) {}
    for (String str = paramString + ":" + paramInt2;; str = "")
    {
      if (paramString != null) {
        str = paramString + ":" + paramInt2;
      }
      return paramUri.getScheme() + "//" + paramUri.getHost() + ":" + paramInt1 + "?proxy=" + str;
    }
  }
  
  public void a(r paramr)
  {
    if (paramr.i.a("socket-owner") != this) {
      return;
    }
    try
    {
      a(paramr.e);
      if ((paramr.k != null) || (!paramr.e.i()))
      {
        paramr.j.b("closing out socket (exception)");
        paramr.e.a(null);
        paramr.e.d();
      }
      for (;;)
      {
        return;
        if ((az.a(paramr.f.g_(), paramr.f.f_())) && (az.a(bn.b, paramr.j.e()))) {
          break;
        }
        paramr.j.b("closing out socket (not keep alive)");
        paramr.e.a(null);
        paramr.e.d();
      }
      paramr.j.c("Recycling keep-alive socket");
    }
    finally
    {
      a(paramr.j);
    }
    a(paramr.e, paramr.j);
    a(paramr.j);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */