package org.a.a.k;

import org.a.a.ap;
import org.a.a.ba;
import org.a.a.bd;
import org.a.a.bp;
import org.a.a.r;
import org.a.a.x;

public class c
  extends org.a.a.d
  implements org.a.a.h.c, k
{
  ba bA;
  a bB;
  h bC;
  d bD;
  d bE;
  h bF;
  b bG;
  ap bH;
  ap bI;
  g bJ;
  r by;
  ba bz;
  
  public c(r paramr)
  {
    this.by = paramr;
    int i;
    Object localObject;
    int j;
    if ((paramr.a(0) instanceof bp))
    {
      this.bz = ba.a((x)paramr.a(0), true);
      i = 0;
      this.bA = ba.a(paramr.a(i + 1));
      this.bB = a.a(paramr.a(i + 2));
      this.bC = h.a(paramr.a(i + 3));
      localObject = (r)paramr.a(i + 4);
      this.bD = d.a(((r)localObject).a(0));
      this.bE = d.a(((r)localObject).a(1));
      this.bF = h.a(paramr.a(i + 5));
      this.bG = b.a(paramr.a(i + 6));
      j = paramr.f() - (i + 6) - 1;
      label157:
      if (j <= 0) {
        return;
      }
      localObject = (bp)paramr.a(i + 6 + j);
      switch (((bp)localObject).e())
      {
      }
    }
    for (;;)
    {
      j -= 1;
      break label157;
      this.bz = new ba(0);
      i = -1;
      break;
      this.bH = ap.a((x)localObject, false);
      continue;
      this.bI = ap.a((x)localObject, false);
      continue;
      this.bJ = g.a(localObject);
    }
  }
  
  public static c a(Object paramObject)
  {
    if ((paramObject instanceof c)) {
      return (c)paramObject;
    }
    if (paramObject != null) {
      return new c(r.a(paramObject));
    }
    return null;
  }
  
  public bd d()
  {
    return this.by;
  }
  
  public ba e()
  {
    return this.bA;
  }
  
  public h f()
  {
    return this.bC;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */