package com.c.b.b.b;

import java.io.Serializable;
import java.util.Comparator;

final class g
  implements Serializable, Comparator<d>
{
  private final float a;
  
  private g(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public int a(d paramd1, d paramd2)
  {
    if (paramd2.d() == paramd1.d())
    {
      float f1 = Math.abs(paramd2.c() - this.a);
      float f2 = Math.abs(paramd1.c() - this.a);
      if (f1 < f2) {
        return 1;
      }
      if (f1 == f2) {
        return 0;
      }
      return -1;
    }
    return paramd2.d() - paramd1.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */