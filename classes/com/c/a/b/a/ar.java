package com.c.a.b.a;

import com.c.a.ab;
import com.c.a.al;
import com.c.a.b.v;
import com.c.a.d.a;
import com.c.a.d.d;
import com.c.a.t;
import com.c.a.w;
import com.c.a.y;
import com.c.a.z;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class ar
  extends al<w>
{
  public w a(a parama)
  {
    switch (ay.a[parama.f().ordinal()])
    {
    default: 
      throw new IllegalArgumentException();
    case 3: 
      return new ab(parama.h());
    case 1: 
      return new ab(new v(parama.h()));
    case 2: 
      return new ab(Boolean.valueOf(parama.i()));
    case 4: 
      parama.j();
      return y.a;
    case 5: 
      localObject = new t();
      parama.a();
      while (parama.e()) {
        ((t)localObject).a(a(parama));
      }
      parama.b();
      return (w)localObject;
    }
    Object localObject = new z();
    parama.c();
    while (parama.e()) {
      ((z)localObject).a(parama.g(), a(parama));
    }
    parama.d();
    return (w)localObject;
  }
  
  public void a(d paramd, w paramw)
  {
    if ((paramw == null) || (paramw.j()))
    {
      paramd.f();
      return;
    }
    if (paramw.i())
    {
      paramw = paramw.m();
      if (paramw.p())
      {
        paramd.a(paramw.a());
        return;
      }
      if (paramw.o())
      {
        paramd.a(paramw.f());
        return;
      }
      paramd.b(paramw.b());
      return;
    }
    if (paramw.g())
    {
      paramd.b();
      paramw = paramw.l().iterator();
      while (paramw.hasNext()) {
        a(paramd, (w)paramw.next());
      }
      paramd.c();
      return;
    }
    if (paramw.h())
    {
      paramd.d();
      paramw = paramw.k().o().iterator();
      while (paramw.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramw.next();
        paramd.a((String)localEntry.getKey());
        a(paramd, (w)localEntry.getValue());
      }
      paramd.e();
      return;
    }
    throw new IllegalArgumentException("Couldn't write " + paramw.getClass());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */