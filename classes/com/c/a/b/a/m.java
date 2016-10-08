package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.b.w;
import com.c.a.d.a;
import com.c.a.d.d;
import com.c.a.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class m
  extends al<Object>
{
  public static final am a = new n();
  private final k b;
  
  private m(k paramk)
  {
    this.b = paramk;
  }
  
  public void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    al localal = this.b.a(paramObject.getClass());
    if ((localal instanceof m))
    {
      paramd.d();
      paramd.e();
      return;
    }
    localal.a(paramd, paramObject);
  }
  
  public Object b(a parama)
  {
    Object localObject = parama.f();
    switch (o.a[localObject.ordinal()])
    {
    default: 
      throw new IllegalStateException();
    case 1: 
      localObject = new ArrayList();
      parama.a();
      while (parama.e()) {
        ((List)localObject).add(b(parama));
      }
      parama.b();
      return localObject;
    case 2: 
      localObject = new w();
      parama.c();
      while (parama.e()) {
        ((Map)localObject).put(parama.g(), b(parama));
      }
      parama.d();
      return localObject;
    case 3: 
      return parama.h();
    case 4: 
      return Double.valueOf(parama.k());
    case 5: 
      return Boolean.valueOf(parama.i());
    }
    parama.j();
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */