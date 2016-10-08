package com.c.a.b.a;

import com.c.a.ab;
import com.c.a.al;
import com.c.a.b.ag;
import com.c.a.b.u;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;
import com.c.a.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class l<K, V>
  extends al<Map<K, V>>
{
  private final al<K> b;
  private final al<V> c;
  private final com.c.a.b.ae<? extends Map<K, V>> d;
  
  public l(com.c.a.k paramk, Type paramType1, al<K> paramal, Type paramType2, al<V> paramal1, com.c.a.b.ae<? extends Map<K, V>> paramae)
  {
    this.b = new x(paramType1, paramType2, paramal);
    this.c = new x(paramType1, paramae, paramal1);
    com.c.a.b.ae localae;
    this.d = localae;
  }
  
  private String a(w paramw)
  {
    if (paramw.i())
    {
      paramw = paramw.m();
      if (paramw.p()) {
        return String.valueOf(paramw.a());
      }
      if (paramw.o()) {
        return Boolean.toString(paramw.f());
      }
      if (paramw.q()) {
        return paramw.b();
      }
      throw new AssertionError();
    }
    if (paramw.j()) {
      return "null";
    }
    throw new AssertionError();
  }
  
  public Map<K, V> a(a parama)
  {
    Object localObject = parama.f();
    if (localObject == c.i)
    {
      parama.j();
      return null;
    }
    Map localMap = (Map)this.d.a();
    if (localObject == c.a)
    {
      parama.a();
      while (parama.e())
      {
        parama.a();
        localObject = this.b.b(parama);
        if (localMap.put(localObject, this.c.b(parama)) != null) {
          throw new com.c.a.ae("duplicate key: " + localObject);
        }
        parama.b();
      }
      parama.b();
      return localMap;
    }
    parama.c();
    while (parama.e())
    {
      u.a.a(parama);
      localObject = this.b.b(parama);
      if (localMap.put(localObject, this.c.b(parama)) != null) {
        throw new com.c.a.ae("duplicate key: " + localObject);
      }
    }
    parama.d();
    return localMap;
  }
  
  public void a(d paramd, Map<K, V> paramMap)
  {
    int m = 0;
    int k = 0;
    if (paramMap == null)
    {
      paramd.f();
      return;
    }
    if (!k.a(this.a))
    {
      paramd.d();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        localObject = (Map.Entry)paramMap.next();
        paramd.a(String.valueOf(((Map.Entry)localObject).getKey()));
        this.c.a(paramd, ((Map.Entry)localObject).getValue());
      }
      paramd.e();
      return;
    }
    Object localObject = new ArrayList(paramMap.size());
    ArrayList localArrayList = new ArrayList(paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    int i = 0;
    if (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      w localw = this.b.a(localEntry.getKey());
      ((List)localObject).add(localw);
      localArrayList.add(localEntry.getValue());
      if ((localw.g()) || (localw.h())) {}
      for (int j = 1;; j = 0)
      {
        i = j | i;
        break;
      }
    }
    if (i != 0)
    {
      paramd.b();
      i = k;
      while (i < ((List)localObject).size())
      {
        paramd.b();
        ag.a((w)((List)localObject).get(i), paramd);
        this.c.a(paramd, localArrayList.get(i));
        paramd.c();
        i += 1;
      }
      paramd.c();
      return;
    }
    paramd.d();
    i = m;
    while (i < ((List)localObject).size())
    {
      paramd.a(a((w)((List)localObject).get(i)));
      this.c.a(paramd, localArrayList.get(i));
      i += 1;
    }
    paramd.e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */