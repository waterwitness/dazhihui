package com.h.a.b.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class h
  implements c
{
  private final Map<String, Object> b = new HashMap();
  private boolean c = false;
  
  public h(g paramg) {}
  
  public c a()
  {
    try
    {
      this.c = true;
      return this;
    }
    finally {}
  }
  
  public c a(String paramString)
  {
    try
    {
      this.b.put(paramString, this);
      return this;
    }
    finally {}
  }
  
  public c a(String paramString, float paramFloat)
  {
    try
    {
      this.b.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    finally {}
  }
  
  public c a(String paramString, int paramInt)
  {
    try
    {
      this.b.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    finally {}
  }
  
  public c a(String paramString, long paramLong)
  {
    try
    {
      this.b.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    finally {}
  }
  
  public c a(String paramString1, String paramString2)
  {
    try
    {
      this.b.put(paramString1, paramString2);
      return this;
    }
    finally {}
  }
  
  public c a(String paramString, boolean paramBoolean)
  {
    try
    {
      this.b.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    finally {}
  }
  
  public boolean b()
  {
    int i = 0;
    for (;;)
    {
      Object localObject6;
      Object localObject5;
      synchronized (f.a())
      {
        if (g.a(this.a).size() > 0) {
          i = 1;
        }
        if (i == 0) {
          break label338;
        }
        localArrayList = new ArrayList();
        HashSet localHashSet = new HashSet(g.a(this.a).keySet());
        try
        {
          if (this.c)
          {
            g.b(this.a).clear();
            this.c = false;
          }
          localIterator = this.b.entrySet().iterator();
          if (!localIterator.hasNext())
          {
            this.b.clear();
            boolean bool = g.c(this.a);
            if (bool) {
              this.a.a(true);
            }
            if (i != 0)
            {
              i = localArrayList.size() - 1;
              if (i >= 0) {
                break label267;
              }
            }
            return bool;
          }
          localObject6 = (Map.Entry)localIterator.next();
          localObject5 = (String)((Map.Entry)localObject6).getKey();
          localObject6 = ((Map.Entry)localObject6).getValue();
          if (localObject6 == this)
          {
            g.b(this.a).remove(localObject5);
            if (i == 0) {
              continue;
            }
            localArrayList.add(localObject5);
            continue;
            localObject2 = finally;
          }
        }
        finally {}
      }
      g.b(this.a).put(localObject5, localObject6);
      continue;
      label267:
      ??? = (String)localArrayList.get(i);
      Iterator localIterator = ((Set)localObject2).iterator();
      for (;;)
      {
        if (!localIterator.hasNext())
        {
          i -= 1;
          break;
        }
        localObject5 = (d)localIterator.next();
        if (localObject5 != null) {
          ((d)localObject5).a(this.a, (String)???);
        }
      }
      label338:
      Object localObject3 = null;
      ArrayList localArrayList = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\b\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */