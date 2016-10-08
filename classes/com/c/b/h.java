package com.c.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class h
  implements j
{
  private Map<e, ?> a;
  private j[] b;
  
  private l b(c paramc)
  {
    if (this.b != null)
    {
      j[] arrayOfj = this.b;
      int j = arrayOfj.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = arrayOfj[i];
        try
        {
          localObject = ((j)localObject).a(paramc, this.a);
          return (l)localObject;
        }
        catch (k localk)
        {
          i += 1;
        }
      }
    }
    throw i.a();
  }
  
  public l a(c paramc)
  {
    if (this.b == null) {
      a(null);
    }
    return b(paramc);
  }
  
  public l a(c paramc, Map<e, ?> paramMap)
  {
    a(paramMap);
    return b(paramc);
  }
  
  public void a()
  {
    if (this.b != null)
    {
      j[] arrayOfj = this.b;
      int j = arrayOfj.length;
      int i = 0;
      while (i < j)
      {
        arrayOfj[i].a();
        i += 1;
      }
    }
  }
  
  public void a(Map<e, ?> paramMap)
  {
    this.a = paramMap;
    if (((paramMap == null) || (!paramMap.containsKey(e.d))) || (paramMap == null)) {}
    for (paramMap = null;; paramMap = (Collection)paramMap.get(e.c))
    {
      ArrayList localArrayList = new ArrayList();
      if ((paramMap != null) && (((paramMap.contains(a.o)) || (paramMap.contains(a.p)) || (paramMap.contains(a.h)) || (paramMap.contains(a.g)) || (paramMap.contains(a.b)) || (paramMap.contains(a.c)) || (paramMap.contains(a.d)) || (paramMap.contains(a.e)) || (paramMap.contains(a.i)) || (paramMap.contains(a.m)) || (!paramMap.contains(a.n))) || (paramMap.contains(a.l)))) {
        localArrayList.add(new com.c.b.b.a());
      }
      if (localArrayList.isEmpty()) {
        localArrayList.add(new com.c.b.b.a());
      }
      this.b = ((j[])localArrayList.toArray(new j[localArrayList.size()]));
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */