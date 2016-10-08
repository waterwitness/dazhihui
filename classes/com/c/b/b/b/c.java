package com.c.b.b.b;

import com.c.b.a.f;
import com.c.b.a.h;
import com.c.b.a.j;
import com.c.b.b.a.s;
import com.c.b.n;
import com.c.b.o;
import java.util.Map;

public class c
{
  private final com.c.b.a.a a;
  private o b;
  
  public c(com.c.b.a.a parama)
  {
    this.a = parama;
  }
  
  private float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    float f2 = b(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt3 = paramInt1 - (paramInt3 - paramInt1);
    float f1;
    if (paramInt3 < 0)
    {
      f1 = paramInt1 / (paramInt1 - paramInt3);
      paramInt3 = 0;
    }
    for (;;)
    {
      paramInt4 = (int)(paramInt2 - f1 * (paramInt4 - paramInt2));
      if (paramInt4 < 0)
      {
        f1 = paramInt2 / (paramInt2 - paramInt4);
        paramInt4 = i;
      }
      for (;;)
      {
        float f3 = paramInt1;
        return b(paramInt1, paramInt2, (int)(f1 * (paramInt3 - paramInt1) + f3), paramInt4) + f2 - 1.0F;
        if (paramInt3 < this.a.c()) {
          break label194;
        }
        f1 = (this.a.c() - 1 - paramInt1) / (paramInt3 - paramInt1);
        paramInt3 = this.a.c();
        paramInt3 -= 1;
        break;
        if (paramInt4 >= this.a.d())
        {
          f1 = (this.a.d() - 1 - paramInt2) / (paramInt4 - paramInt2);
          paramInt4 = this.a.d() - 1;
        }
        else
        {
          f1 = 1.0F;
        }
      }
      label194:
      f1 = 1.0F;
    }
  }
  
  private float a(n paramn1, n paramn2)
  {
    float f1 = a((int)paramn1.a(), (int)paramn1.b(), (int)paramn2.a(), (int)paramn2.b());
    float f2 = a((int)paramn2.a(), (int)paramn2.b(), (int)paramn1.a(), (int)paramn1.b());
    if (Float.isNaN(f1)) {
      return f2 / 7.0F;
    }
    if (Float.isNaN(f2)) {
      return f1 / 7.0F;
    }
    return (f1 + f2) / 14.0F;
  }
  
  private static int a(n paramn1, n paramn2, n paramn3, float paramFloat)
  {
    int i = (com.c.b.a.a.a.a(n.a(paramn1, paramn2) / paramFloat) + com.c.b.a.a.a.a(n.a(paramn1, paramn3) / paramFloat)) / 2 + 7;
    switch (i & 0x3)
    {
    case 1: 
    default: 
      return i;
    case 0: 
      return i + 1;
    case 2: 
      return i - 1;
    }
    throw com.c.b.i.a();
  }
  
  private static com.c.b.a.a a(com.c.b.a.a parama, j paramj, int paramInt)
  {
    return h.a().a(parama, paramInt, paramInt, paramj);
  }
  
  private static j a(n paramn1, n paramn2, n paramn3, n paramn4, int paramInt)
  {
    float f1 = paramInt - 3.5F;
    float f4;
    float f5;
    float f3;
    if (paramn4 != null)
    {
      f4 = paramn4.a();
      f5 = paramn4.b();
      f3 = f1 - 3.0F;
    }
    for (float f2 = f3;; f2 = f1)
    {
      return j.a(3.5F, 3.5F, f1, 3.5F, f2, f3, 3.5F, f1, paramn1.a(), paramn1.b(), paramn2.a(), paramn2.b(), f4, f5, paramn3.a(), paramn3.b());
      f4 = paramn2.a() - paramn1.a() + paramn3.a();
      f5 = paramn2.b() - paramn1.b() + paramn3.b();
      f3 = f1;
    }
  }
  
  private float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k;
    int n;
    int m;
    int i;
    if (Math.abs(paramInt4 - paramInt2) > Math.abs(paramInt3 - paramInt1))
    {
      k = 1;
      if (k == 0) {
        break label266;
      }
      n = paramInt4;
      m = paramInt3;
      i = paramInt2;
      paramInt4 = paramInt1;
    }
    for (;;)
    {
      int i5 = Math.abs(n - i);
      int i6 = Math.abs(m - paramInt4);
      int j = -i5 / 2;
      int i1;
      label74:
      int i2;
      label84:
      int i3;
      label109:
      int i4;
      label117:
      int i7;
      if (i < n)
      {
        i1 = 1;
        if (paramInt4 >= m) {
          break label168;
        }
        i2 = 1;
        paramInt3 = 0;
        paramInt2 = i;
        paramInt1 = paramInt4;
        if (paramInt2 == n + i1) {
          break label263;
        }
        if (k == 0) {
          break label174;
        }
        i3 = paramInt1;
        if (k == 0) {
          break label180;
        }
        i4 = paramInt2;
        if (paramInt3 != 1) {
          break label186;
        }
        i7 = 1;
      }
      for (;;)
      {
        if (i7 == this.a.a(i3, i4))
        {
          if (paramInt3 == 2)
          {
            return com.c.b.a.a.a.a(paramInt2, paramInt1, i, paramInt4);
            k = 0;
            break;
            i1 = -1;
            break label74;
            label168:
            i2 = -1;
            break label84;
            label174:
            i3 = paramInt2;
            break label109;
            label180:
            i4 = paramInt1;
            break label117;
            label186:
            i7 = 0;
            continue;
          }
          paramInt3 += 1;
          label196:
          j += i6;
          if (j > 0) {
            if (paramInt1 != m) {}
          }
        }
      }
      label263:
      for (;;)
      {
        if (paramInt3 == 2)
        {
          return com.c.b.a.a.a.a(n + i1, m, i, paramInt4);
          paramInt1 += i2;
          j -= i5;
        }
        for (;;)
        {
          paramInt2 += i1;
          break;
          return NaN.0F;
        }
        break label196;
      }
      label266:
      m = paramInt4;
      paramInt4 = paramInt2;
      i = paramInt1;
      n = paramInt3;
    }
  }
  
  protected final float a(n paramn1, n paramn2, n paramn3)
  {
    return (a(paramn1, paramn2) + a(paramn1, paramn3)) / 2.0F;
  }
  
  protected final f a(i parami)
  {
    d locald1 = parami.b();
    d locald2 = parami.c();
    d locald3 = parami.a();
    float f1 = a(locald1, locald2, locald3);
    if (f1 < 1.0F) {
      throw com.c.b.i.a();
    }
    int j = a(locald1, locald2, locald3, f1);
    s locals = s.a(j);
    int i = locals.d();
    Object localObject = null;
    parami = (i)localObject;
    float f2;
    int k;
    int m;
    if (locals.b().length > 0)
    {
      f2 = locald2.a();
      float f3 = locald1.a();
      float f4 = locald3.a();
      float f5 = locald2.b();
      float f6 = locald1.b();
      float f7 = locald3.b();
      float f8 = 1.0F - 3.0F / (i - 7);
      float f9 = locald1.a();
      k = (int)((f2 - f3 + f4 - locald1.a()) * f8 + f9);
      m = (int)(locald1.b() + f8 * (f5 - f6 + f7 - locald1.b()));
      i = 4;
      parami = (i)localObject;
      if (i <= 16) {
        f2 = i;
      }
    }
    for (;;)
    {
      try
      {
        parami = a(f1, k, m, f2);
        localObject = a(locald1, locald2, locald3, parami, j);
        localObject = a(this.a, (j)localObject, j);
        if (parami != null) {
          break label289;
        }
        parami = new n[3];
        parami[0] = locald3;
        parami[1] = locald1;
        parami[2] = locald2;
        return new f((com.c.b.a.a)localObject, parami);
      }
      catch (com.c.b.i parami)
      {
        i <<= 1;
      }
      break;
      label289:
      parami = new n[] { locald3, locald1, locald2, parami };
    }
  }
  
  public final f a(Map<com.c.b.e, ?> paramMap)
  {
    if (paramMap == null) {}
    for (o localo = null;; localo = (o)paramMap.get(com.c.b.e.j))
    {
      this.b = localo;
      return a(new e(this.a, this.b).a(paramMap));
    }
  }
  
  protected final a a(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2)
  {
    int j = (int)(paramFloat2 * paramFloat1);
    int i = Math.max(0, paramInt1 - j);
    paramInt1 = Math.min(this.a.c() - 1, paramInt1 + j);
    if (paramInt1 - i < paramFloat1 * 3.0F) {
      throw com.c.b.i.a();
    }
    int k = Math.max(0, paramInt2 - j);
    paramInt2 = Math.min(this.a.d() - 1, j + paramInt2);
    if (paramInt2 - k < paramFloat1 * 3.0F) {
      throw com.c.b.i.a();
    }
    return new b(this.a, i, k, paramInt1 - i, paramInt2 - k, paramFloat1, this.b).a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */