package com.d.a.c;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.d.a.q;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static a g;
  final ArrayList<k> a = new ArrayList();
  com.d.a.c.d.ai b;
  ai c;
  ax d;
  q e;
  
  static
  {
    if (!a.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      return;
    }
  }
  
  public a(q paramq)
  {
    this.e = paramq;
    paramq = new ai(this);
    this.c = paramq;
    a(paramq);
    paramq = new com.d.a.c.d.ai(this);
    this.b = paramq;
    a(paramq);
    paramq = new ax();
    this.d = paramq;
    a(paramq);
    this.b.a(new br());
  }
  
  public static a a()
  {
    if (g == null) {
      g = new a(q.a());
    }
    return g;
  }
  
  private void a(i parami, Exception paramException, x paramx, u paramu, com.d.a.c.b.a parama)
  {
    if ((!f) && (parama == null)) {
      throw new AssertionError();
    }
    this.e.a(parami.b);
    if (paramException != null) {
      paramu.a("Connection error", paramException);
    }
    for (boolean bool = parami.a(paramException); bool; bool = parami.b(paramx))
    {
      parama.a(paramException, paramx);
      if ((f) || (paramException != null) || (paramx.e() == null) || (paramx.f() != null) || (paramx.k())) {
        return;
      }
      throw new AssertionError();
      paramu.c("Connection successful");
    }
    if (paramx != null)
    {
      paramx.a(new com.d.a.a.f());
      paramx.d();
    }
  }
  
  private void a(u paramu, int paramInt, i parami, com.d.a.c.b.a parama)
  {
    if (this.e.c())
    {
      b(paramu, paramInt, parami, parama);
      return;
    }
    this.e.a(new b(this, paramu, paramInt, parami, parama));
  }
  
  private void a(u arg1, int paramInt, i parami, com.d.a.c.b.a parama, r paramr)
  {
    ??? = new f(this, ???, parami, ???, parama, paramr, paramInt);
    paramr.g = new g(this, ???);
    paramr.h = new h(this, ???);
    paramr.f = ???;
    ???.a(paramr.e);
    synchronized (this.a)
    {
      parami = this.a.iterator();
      do
      {
        if (!parami.hasNext()) {
          return;
        }
      } while (!((k)parami.next()).a(paramr));
    }
  }
  
  private void b(u paramu, int paramInt, i parami, com.d.a.c.b.a parama)
  {
    if ((!f) && (!this.e.c())) {
      throw new AssertionError();
    }
    if (paramInt > 15)
    {
      a(parami, new bq("too many redirects"), null, paramu, parama);
      return;
    }
    paramu.d();
    Object localObject = new r();
    paramu.g = System.currentTimeMillis();
    ((r)localObject).j = paramu;
    paramu.c("Executing request.");
    for (;;)
    {
      Iterator localIterator;
      synchronized (this.a)
      {
        localIterator = this.a.iterator();
        if (!localIterator.hasNext())
        {
          if (paramu.h() > 0)
          {
            parami.c = new d(this, (r)localObject, parami, paramu, parama);
            parami.b = this.e.a(parami.c, d(paramu));
          }
          ((r)localObject).a = new e(this, paramu, parami, parama, (r)localObject, paramInt);
          c(paramu);
          if ((paramu.g() != null) && (paramu.e().a("Content-Type") == null)) {
            paramu.e().a("Content-Type", paramu.g().a());
          }
        }
      }
      synchronized (this.a)
      {
        localIterator = this.a.iterator();
        com.d.a.b.a locala;
        do
        {
          if (!localIterator.hasNext())
          {
            localObject = new IllegalArgumentException("invalid uri=" + paramu.d() + " middlewares=" + this.a);
            a(parami, (Exception)localObject, null, paramu, parama);
            return;
            ((k)localIterator.next()).a((p)localObject);
            break;
            paramu = finally;
            throw paramu;
          }
          locala = ((k)localIterator.next()).a((l)localObject);
        } while (locala == null);
        ((r)localObject).b = locala;
        parami.c(locala);
        return;
      }
    }
  }
  
  private static void b(u paramu1, u paramu2, String paramString)
  {
    paramu1 = paramu1.e().a(paramString);
    if (!TextUtils.isEmpty(paramu1)) {
      paramu2.e().a(paramString, paramu1);
    }
  }
  
  @SuppressLint({"NewApi"})
  private static void c(u paramu)
  {
    if (paramu.c != null) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = ProxySelector.getDefault().select(URI.create(paramu.d().toString()));
        if (((List)localObject).isEmpty()) {
          continue;
        }
        localObject = (Proxy)((List)localObject).get(0);
        if ((((Proxy)localObject).type() != Proxy.Type.HTTP) || (!(((Proxy)localObject).address() instanceof InetSocketAddress))) {
          continue;
        }
        InetSocketAddress localInetSocketAddress = (InetSocketAddress)((Proxy)localObject).address();
        if (Build.VERSION.SDK_INT >= 14) {
          localObject = localInetSocketAddress.getHostString();
        }
        for (;;)
        {
          paramu.a((String)localObject, localInetSocketAddress.getPort());
          return;
          localObject = localInetSocketAddress.getAddress();
          if (localObject != null) {
            localObject = ((InetAddress)localObject).getHostAddress();
          } else {
            localObject = localInetSocketAddress.getHostName();
          }
        }
        return;
      }
      catch (Exception paramu) {}
    }
  }
  
  private static long d(u paramu)
  {
    return paramu.h();
  }
  
  public com.d.a.b.f<w> a(u paramu, com.d.a.c.b.a parama)
  {
    i locali = new i(this, null);
    a(paramu, 0, locali, parama);
    return locali;
  }
  
  public com.d.a.b.f<bu> a(u paramu, String paramString, j paramj)
  {
    bz.a(paramu, paramString);
    paramString = new com.d.a.b.l();
    paramString.c(a(paramu, new c(this, paramString, paramj, paramu)));
    return paramString;
  }
  
  public com.d.a.b.f<bu> a(String paramString1, String paramString2, j paramj)
  {
    return a(new t(paramString1.replace("ws://", "http://").replace("wss://", "https://")), paramString2, paramj);
  }
  
  public void a(k paramk)
  {
    this.a.add(0, paramk);
  }
  
  public q b()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */