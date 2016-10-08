package com.c.b.b.b;

import com.c.b.i;
import com.c.b.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
{
  private final com.c.b.a.a a;
  private final List<a> b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final float g;
  private final int[] h;
  private final o i;
  
  b(com.c.b.a.a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, o paramo)
  {
    this.a = parama;
    this.b = new ArrayList(5);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramFloat;
    this.h = new int[3];
    this.i = paramo;
  }
  
  private float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    com.c.b.a.a locala = this.a;
    int k = locala.d();
    int[] arrayOfInt = this.h;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    int j = paramInt1;
    while ((j >= 0) && (locala.a(paramInt2, j)) && (arrayOfInt[1] <= paramInt3))
    {
      arrayOfInt[1] += 1;
      j -= 1;
    }
    if ((j < 0) || (arrayOfInt[1] > paramInt3)) {}
    do
    {
      do
      {
        do
        {
          return NaN.0F;
          while ((j >= 0) && (!locala.a(paramInt2, j)) && (arrayOfInt[0] <= paramInt3))
          {
            arrayOfInt[0] += 1;
            j -= 1;
          }
        } while (arrayOfInt[0] > paramInt3);
        paramInt1 += 1;
        while ((paramInt1 < k) && (locala.a(paramInt2, paramInt1)) && (arrayOfInt[1] <= paramInt3))
        {
          arrayOfInt[1] += 1;
          paramInt1 += 1;
        }
      } while ((paramInt1 == k) || (arrayOfInt[1] > paramInt3));
      while ((paramInt1 < k) && (!locala.a(paramInt2, paramInt1)) && (arrayOfInt[2] <= paramInt3))
      {
        arrayOfInt[2] += 1;
        paramInt1 += 1;
      }
    } while ((arrayOfInt[2] > paramInt3) || (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] - paramInt4) * 5 >= paramInt4 * 2) || (!a(arrayOfInt)));
    return a(arrayOfInt, paramInt1);
  }
  
  private static float a(int[] paramArrayOfInt, int paramInt)
  {
    return paramInt - paramArrayOfInt[2] - paramArrayOfInt[1] / 2.0F;
  }
  
  private a a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int j = paramArrayOfInt[0];
    int k = paramArrayOfInt[1];
    int m = paramArrayOfInt[2];
    float f1 = a(paramArrayOfInt, paramInt2);
    float f2 = a(paramInt1, (int)f1, paramArrayOfInt[1] * 2, j + k + m);
    if (!Float.isNaN(f2))
    {
      float f3 = (paramArrayOfInt[0] + paramArrayOfInt[1] + paramArrayOfInt[2]) / 3.0F;
      paramArrayOfInt = this.b.iterator();
      while (paramArrayOfInt.hasNext())
      {
        a locala = (a)paramArrayOfInt.next();
        if (locala.a(f3, f2, f1)) {
          return locala.b(f2, f1, f3);
        }
      }
      paramArrayOfInt = new a(f1, f2, f3);
      this.b.add(paramArrayOfInt);
      if (this.i != null) {
        this.i.a(paramArrayOfInt);
      }
    }
    return null;
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    float f1 = this.g;
    float f2 = f1 / 2.0F;
    int j = 0;
    while (j < 3)
    {
      if (Math.abs(f1 - paramArrayOfInt[j]) >= f2) {
        return false;
      }
      j += 1;
    }
    return true;
  }
  
  a a()
  {
    int i1 = this.c;
    int i2 = this.f;
    int i3 = i1 + this.e;
    int i4 = this.d;
    int i5 = i2 / 2;
    int[] arrayOfInt = new int[3];
    int m = 0;
    while (m < i2)
    {
      if ((m & 0x1) == 0) {}
      int i6;
      for (int j = (m + 1) / 2;; j = -((m + 1) / 2))
      {
        i6 = i4 + i5 + j;
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        arrayOfInt[2] = 0;
        j = i1;
        while ((j < i3) && (!this.a.a(j, i6))) {
          j += 1;
        }
      }
      int k = 0;
      int n = j;
      j = k;
      Object localObject;
      for (;;)
      {
        if (n < i3) {
          if (this.a.a(n, i6))
          {
            if (j == 1)
            {
              arrayOfInt[j] += 1;
              n += 1;
              continue;
            }
            if (j == 2) {
              if (a(arrayOfInt))
              {
                localObject = a(arrayOfInt, i6, n);
                if (localObject == null) {
                  break;
                }
              }
            }
          }
        }
      }
      a locala;
      do
      {
        return (a)localObject;
        arrayOfInt[0] = arrayOfInt[2];
        arrayOfInt[1] = 1;
        arrayOfInt[2] = 0;
        j = 1;
        break;
        j += 1;
        arrayOfInt[j] += 1;
        break;
        k = j;
        if (j == 1) {
          k = j + 1;
        }
        arrayOfInt[k] += 1;
        j = k;
        break;
        if (!a(arrayOfInt)) {
          break label313;
        }
        locala = a(arrayOfInt, i6, i3);
        localObject = locala;
      } while (locala != null);
      label313:
      m += 1;
    }
    if (!this.b.isEmpty()) {
      return (a)this.b.get(0);
    }
    throw i.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */