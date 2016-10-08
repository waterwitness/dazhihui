package com.d.a.c;

import android.net.Uri;
import com.d.a.af;
import com.d.a.al;
import com.d.a.q;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

class f
  extends x
{
  f(a parama, u paramu1, i parami, u paramu2, com.d.a.c.b.a parama1, r paramr, int paramInt)
  {
    super(paramu1);
  }
  
  public void a(al arg1)
  {
    this.o.d = ???;
    for (;;)
    {
      synchronized (this.d.a)
      {
        Object localObject1 = this.d.a.iterator();
        String str2;
        if (!((Iterator)localObject1).hasNext())
        {
          super.a(this.o.d);
          ??? = this.e;
          int i = m();
          if (((i != 301) && (i != 302) && (i != 307)) || (!this.m.f())) {
            break;
          }
          str2 = ???.a("Location");
        }
        try
        {
          localObject1 = Uri.parse(str2);
          ??? = (al)localObject1;
          if (((Uri)localObject1).getScheme() == null) {
            ??? = Uri.parse(new URL(new URL(this.m.d().toString()), str2).toString());
          }
          if (!this.m.c().equals("HEAD")) {
            break label354;
          }
          localObject1 = "HEAD";
          ??? = new u(???, (String)localObject1);
          ???.g = this.m.g;
          ???.f = this.m.f;
          ???.e = this.m.e;
          ???.c = this.m.c;
          ???.d = this.m.d;
          a.b(???);
          a.a(this.m, ???, "User-Agent");
          a.a(this.m, ???, "Range");
          this.m.a("Redirecting");
          ???.a("Redirected");
          a.b(this.d, ???, this.p + 1, this.l, this.n);
          a(new com.d.a.a.f());
          return;
        }
        catch (Exception ???)
        {
          a.a(this.d, this.l, ???, this, this.m, this.n);
          return;
        }
        ((k)((Iterator)localObject1).next()).a(this.o);
      }
      label354:
      String str1 = "GET";
    }
    this.m.b("Final (post cache response) headers:\n" + toString());
    a.a(this.d, this.l, null, this, this.m, this.n);
  }
  
  protected void a(Exception arg1)
  {
    if (??? != null) {
      this.m.a("exception during response", ???);
    }
    if (this.l.isCancelled()) {}
    Object localObject1;
    do
    {
      do
      {
        return;
        if (!(??? instanceof com.d.a.f)) {
          break;
        }
        this.m.a("SSL Exception", ???);
        localObject1 = (com.d.a.f)???;
        this.m.a((com.d.a.f)localObject1);
      } while (((com.d.a.f)localObject1).a());
      localObject1 = e();
    } while (localObject1 == null);
    super.a(???);
    if (((!((af)localObject1).i()) || (??? != null)) && (f_() == null) && (??? != null)) {
      a.a(this.d, this.l, ???, null, this.m, this.n);
    }
    this.o.k = ???;
    for (;;)
    {
      synchronized (this.d.a)
      {
        localObject1 = this.d.a.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          return;
        }
      }
      ((k)((Iterator)localObject2).next()).a(this.o);
    }
  }
  
  protected void b()
  {
    super.b();
    if (this.l.isCancelled()) {
      return;
    }
    if (this.l.c != null) {
      this.d.e.a(this.l.b);
    }
    this.m.b("Received headers:\n" + toString());
    for (;;)
    {
      synchronized (this.d.a)
      {
        Iterator localIterator = this.d.a.iterator();
        if (!localIterator.hasNext()) {
          return;
        }
      }
      ((k)((Iterator)localObject).next()).a(this.o);
    }
  }
  
  protected void b(Exception arg1)
  {
    if (??? != null) {
      a.a(this.d, this.l, ???, null, this.m, this.n);
    }
    do
    {
      return;
      this.m.b("request completed");
    } while (this.l.isCancelled());
    if ((this.l.c != null) && (this.e == null))
    {
      this.d.e.a(this.l.b);
      this.l.b = this.d.e.a(this.l.c, a.a(this.m));
    }
    for (;;)
    {
      synchronized (this.d.a)
      {
        Iterator localIterator = this.d.a.iterator();
        if (!localIterator.hasNext()) {
          return;
        }
      }
      ((k)((Iterator)localObject).next()).a(this.o);
    }
  }
  
  public af c()
  {
    this.m.c("Detaching socket");
    af localaf = e();
    if (localaf == null) {
      return null;
    }
    localaf.a(null);
    localaf.a(null);
    localaf.b(null);
    localaf.a(null);
    a(null);
    return localaf;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */