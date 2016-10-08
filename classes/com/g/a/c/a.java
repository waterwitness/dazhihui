package com.g.a.c;

import android.opengl.GLES10;
import com.g.a.b.a.f;
import com.g.a.b.a.i;

public final class a
{
  private static f a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    GLES10.glGetIntegerv(3379, arrayOfInt, 0);
    int i = Math.max(arrayOfInt[0], 2048);
    a = new f(i, i);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = a.a();
    int j = a.b();
    while ((paramInt1 / paramInt3 > i) || (paramInt2 / paramInt3 > j)) {
      if (paramBoolean) {
        paramInt3 *= 2;
      } else {
        paramInt3 += 1;
      }
    }
    return paramInt3;
  }
  
  public static int a(f paramf)
  {
    int i = paramf.a();
    int j = paramf.b();
    int k = a.a();
    int m = a.b();
    return Math.max((int)Math.ceil(i / k), (int)Math.ceil(j / m));
  }
  
  public static int a(f paramf1, f paramf2, i parami, boolean paramBoolean)
  {
    int k = 1;
    int m = paramf1.a();
    int n = paramf1.b();
    int i1 = paramf2.a();
    int i2 = paramf2.b();
    int i;
    switch (b.a[parami.ordinal()])
    {
    default: 
      i = 1;
      if (i < 1) {
        i = k;
      }
      break;
    }
    for (;;)
    {
      return a(m, n, i, paramBoolean);
      int i3;
      int i4;
      int j;
      if (paramBoolean)
      {
        i3 = m / 2;
        i4 = n / 2;
        j = 1;
        for (;;)
        {
          if (i3 / j <= i1)
          {
            i = j;
            if (i4 / j <= i2) {
              break;
            }
          }
          j *= 2;
        }
      }
      i = Math.max(m / i1, n / i2);
      break;
      if (paramBoolean)
      {
        i3 = m / 2;
        i4 = n / 2;
        j = 1;
        for (;;)
        {
          i = j;
          if (i3 / j <= i1) {
            break;
          }
          i = j;
          if (i4 / j <= i2) {
            break;
          }
          j *= 2;
        }
      }
      i = Math.min(m / i1, n / i2);
      break;
    }
  }
  
  public static f a(com.g.a.b.e.a parama, f paramf)
  {
    int j = parama.a();
    int i = j;
    if (j <= 0) {
      i = paramf.a();
    }
    int k = parama.b();
    j = k;
    if (k <= 0) {
      j = paramf.b();
    }
    return new f(i, j);
  }
  
  public static float b(f paramf1, f paramf2, i parami, boolean paramBoolean)
  {
    int k = paramf1.a();
    int m = paramf1.b();
    int i = paramf2.a();
    int j = paramf2.b();
    float f1 = k / i;
    float f2 = m / j;
    if (((parami == i.a) && (f1 >= f2)) || ((parami == i.b) && (f1 < f2))) {
      j = (int)(m / f1);
    }
    for (;;)
    {
      f2 = 1.0F;
      if ((paramBoolean) || (i >= k) || (j >= m))
      {
        f1 = f2;
        if (paramBoolean)
        {
          f1 = f2;
          if (i != k)
          {
            f1 = f2;
            if (j == m) {}
          }
        }
      }
      else
      {
        f1 = i / k;
      }
      return f1;
      i = (int)(k / f2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */