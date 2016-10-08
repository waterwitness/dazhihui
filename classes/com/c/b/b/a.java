package com.c.b.b;

import com.c.b.a.d;
import com.c.b.a.f;
import com.c.b.b.a.r;
import com.c.b.e;
import com.c.b.i;
import com.c.b.j;
import com.c.b.l;
import com.c.b.m;
import java.util.Map;

public class a
  implements j
{
  private static final com.c.b.n[] a = new com.c.b.n[0];
  private final com.c.b.b.a.n b = new com.c.b.b.a.n();
  
  private static float a(int[] paramArrayOfInt, com.c.b.a.a parama)
  {
    int m = parama.d();
    int n = parama.c();
    int j = paramArrayOfInt[0];
    int i = paramArrayOfInt[1];
    int i1 = 1;
    int k = 0;
    if ((j < n) && (i < m))
    {
      if (i1 == parama.a(j, i)) {
        break label112;
      }
      k += 1;
      if (k != 5) {}
    }
    else
    {
      if ((j != n) && (i != m)) {
        break label102;
      }
      throw i.a();
    }
    if (i1 == 0) {
      i1 = 1;
    }
    label102:
    label112:
    for (;;)
    {
      j += 1;
      i += 1;
      break;
      i1 = 0;
      continue;
      return (j - paramArrayOfInt[0]) / 7.0F;
    }
  }
  
  private static com.c.b.a.a a(com.c.b.a.a parama)
  {
    Object localObject = parama.a();
    int[] arrayOfInt = parama.b();
    if ((localObject == null) || (arrayOfInt == null)) {
      throw i.a();
    }
    float f = a((int[])localObject, parama);
    int i3 = localObject[1];
    int m = arrayOfInt[1];
    int k = localObject[0];
    int j = arrayOfInt[0];
    if ((k >= j) || (i3 >= m)) {
      throw i.a();
    }
    int i = j;
    if (m - i3 != j - k) {
      i = m - i3 + k;
    }
    int n = Math.round((i - k + 1) / f);
    int i1 = Math.round((m - i3 + 1) / f);
    if ((n <= 0) || (i1 <= 0)) {
      throw i.a();
    }
    if (i1 != n) {
      throw i.a();
    }
    int i2 = (int)(f / 2.0F);
    j = i3 + i2;
    k += i2;
    i = (int)((n - 1) * f) + k - i;
    if (i > 0) {
      if (i > i2) {
        throw i.a();
      }
    }
    for (i = k - i;; i = k)
    {
      k = (int)((i1 - 1) * f) + j - m;
      if (k > 0)
      {
        if (k > i2) {
          throw i.a();
        }
        j -= k;
      }
      for (;;)
      {
        localObject = new com.c.b.a.a(n, i1);
        k = 0;
        while (k < i1)
        {
          i2 = (int)(k * f);
          m = 0;
          while (m < n)
          {
            if (parama.a((int)(m * f) + i, j + i2)) {
              ((com.c.b.a.a)localObject).b(m, k);
            }
            m += 1;
          }
          k += 1;
        }
        return (com.c.b.a.a)localObject;
      }
    }
  }
  
  public final l a(com.c.b.c paramc, Map<e, ?> paramMap)
  {
    if ((paramMap != null) && (paramMap.containsKey(e.b)))
    {
      paramc = a(paramc.a());
      paramc = this.b.a(paramc, paramMap);
    }
    Object localObject;
    for (paramMap = a;; paramMap = ((f)localObject).b())
    {
      if ((paramc.e() instanceof r)) {
        ((r)paramc.e()).a(paramMap);
      }
      paramMap = new l(paramc.b(), paramc.a(), paramMap, com.c.b.a.l);
      localObject = paramc.c();
      if (localObject != null) {
        paramMap.a(m.c, localObject);
      }
      localObject = paramc.d();
      if (localObject != null) {
        paramMap.a(m.d, localObject);
      }
      if (paramc.f())
      {
        paramMap.a(m.j, Integer.valueOf(paramc.h()));
        paramMap.a(m.k, Integer.valueOf(paramc.g()));
      }
      return paramMap;
      localObject = new com.c.b.b.b.c(paramc.a()).a(paramMap);
      paramc = this.b.a(((f)localObject).a(), paramMap);
    }
  }
  
  public void a() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */