package com.c.b.b.b;

import com.c.b.a.a;
import com.c.b.n;
import com.c.b.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
{
  private final a a;
  private final List<d> b;
  private boolean c;
  private final int[] d;
  private final o e;
  
  public e(a parama, o paramo)
  {
    this.a = parama;
    this.b = new ArrayList();
    this.d = new int[5];
    this.e = paramo;
  }
  
  private static float a(int[] paramArrayOfInt, int paramInt)
  {
    return paramInt - paramArrayOfInt[4] - paramArrayOfInt[3] - paramArrayOfInt[2] / 2.0F;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int[] arrayOfInt = a();
    int i = 0;
    while ((paramInt1 >= i) && (paramInt2 >= i) && (this.a.a(paramInt2 - i, paramInt1 - i)))
    {
      arrayOfInt[2] += 1;
      i += 1;
    }
    int j;
    if (paramInt1 >= i)
    {
      j = i;
      if (paramInt2 >= i) {}
    }
    else
    {
      return false;
    }
    while ((paramInt1 >= j) && (paramInt2 >= j) && (!this.a.a(paramInt2 - j, paramInt1 - j)) && (arrayOfInt[1] <= paramInt3))
    {
      arrayOfInt[1] += 1;
      j += 1;
    }
    if ((paramInt1 < j) || (paramInt2 < j) || (arrayOfInt[1] > paramInt3)) {
      return false;
    }
    while ((paramInt1 >= j) && (paramInt2 >= j) && (this.a.a(paramInt2 - j, paramInt1 - j)) && (arrayOfInt[0] <= paramInt3))
    {
      arrayOfInt[0] += 1;
      j += 1;
    }
    if (arrayOfInt[0] > paramInt3) {
      return false;
    }
    int k = this.a.d();
    int m = this.a.c();
    i = 1;
    while ((paramInt1 + i < k) && (paramInt2 + i < m) && (this.a.a(paramInt2 + i, paramInt1 + i)))
    {
      arrayOfInt[2] += 1;
      i += 1;
    }
    if (paramInt1 + i < k)
    {
      j = i;
      if (paramInt2 + i < m) {}
    }
    else
    {
      return false;
    }
    while ((paramInt1 + j < k) && (paramInt2 + j < m) && (!this.a.a(paramInt2 + j, paramInt1 + j)) && (arrayOfInt[3] < paramInt3))
    {
      arrayOfInt[3] += 1;
      j += 1;
    }
    if ((paramInt1 + j >= k) || (paramInt2 + j >= m) || (arrayOfInt[3] >= paramInt3)) {
      return false;
    }
    while ((paramInt1 + j < k) && (paramInt2 + j < m) && (this.a.a(paramInt2 + j, paramInt1 + j)) && (arrayOfInt[4] < paramInt3))
    {
      arrayOfInt[4] += 1;
      j += 1;
    }
    if (arrayOfInt[4] >= paramInt3) {
      return false;
    }
    return (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] - paramInt4) < paramInt4 * 2) && (a(arrayOfInt));
  }
  
  protected static boolean a(int[] paramArrayOfInt)
  {
    boolean bool = true;
    int i = 0;
    int j = 0;
    if (i < 5)
    {
      k = paramArrayOfInt[i];
      if (k != 0) {}
    }
    while (j < 7)
    {
      int k;
      return false;
      j += k;
      i += 1;
      break;
    }
    float f1 = j / 7.0F;
    float f2 = f1 / 2.0F;
    if ((Math.abs(f1 - paramArrayOfInt[0]) < f2) && (Math.abs(f1 - paramArrayOfInt[1]) < f2) && (Math.abs(3.0F * f1 - paramArrayOfInt[2]) < 3.0F * f2) && (Math.abs(f1 - paramArrayOfInt[3]) < f2) && (Math.abs(f1 - paramArrayOfInt[4]) < f2)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  private int[] a()
  {
    this.d[0] = 0;
    this.d[1] = 0;
    this.d[2] = 0;
    this.d[3] = 0;
    this.d[4] = 0;
    return this.d;
  }
  
  private float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = this.a;
    int k = locala.d();
    int[] arrayOfInt = a();
    int i = paramInt1;
    while ((i >= 0) && (locala.a(paramInt2, i)))
    {
      arrayOfInt[2] += 1;
      i -= 1;
    }
    int j = i;
    if (i < 0) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return NaN.0F;
              while ((j >= 0) && (!locala.a(paramInt2, j)) && (arrayOfInt[1] <= paramInt3))
              {
                arrayOfInt[1] += 1;
                j -= 1;
              }
            } while ((j < 0) || (arrayOfInt[1] > paramInt3));
            while ((j >= 0) && (locala.a(paramInt2, j)) && (arrayOfInt[0] <= paramInt3))
            {
              arrayOfInt[0] += 1;
              j -= 1;
            }
          } while (arrayOfInt[0] > paramInt3);
          paramInt1 += 1;
          while ((paramInt1 < k) && (locala.a(paramInt2, paramInt1)))
          {
            arrayOfInt[2] += 1;
            paramInt1 += 1;
          }
        } while (paramInt1 == k);
        while ((paramInt1 < k) && (!locala.a(paramInt2, paramInt1)) && (arrayOfInt[3] < paramInt3))
        {
          arrayOfInt[3] += 1;
          paramInt1 += 1;
        }
      } while ((paramInt1 == k) || (arrayOfInt[3] >= paramInt3));
      while ((paramInt1 < k) && (locala.a(paramInt2, paramInt1)) && (arrayOfInt[4] < paramInt3))
      {
        arrayOfInt[4] += 1;
        paramInt1 += 1;
      }
    } while ((arrayOfInt[4] >= paramInt3) || (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] - paramInt4) * 5 >= paramInt4 * 2) || (!a(arrayOfInt)));
    return a(arrayOfInt, paramInt1);
  }
  
  private int b()
  {
    if (this.b.size() <= 1) {
      return 0;
    }
    Object localObject = null;
    Iterator localIterator = this.b.iterator();
    d locald;
    if (localIterator.hasNext())
    {
      locald = (d)localIterator.next();
      if (locald.d() < 2) {
        break label99;
      }
      if (localObject == null) {
        localObject = locald;
      }
    }
    label99:
    for (;;)
    {
      break;
      this.c = true;
      return (int)(Math.abs(((n)localObject).a() - locald.a()) - Math.abs(((n)localObject).b() - locald.b())) / 2;
      return 0;
    }
  }
  
  private float c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = this.a;
    int k = locala.c();
    int[] arrayOfInt = a();
    int i = paramInt1;
    while ((i >= 0) && (locala.a(i, paramInt2)))
    {
      arrayOfInt[2] += 1;
      i -= 1;
    }
    int j = i;
    if (i < 0) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return NaN.0F;
              while ((j >= 0) && (!locala.a(j, paramInt2)) && (arrayOfInt[1] <= paramInt3))
              {
                arrayOfInt[1] += 1;
                j -= 1;
              }
            } while ((j < 0) || (arrayOfInt[1] > paramInt3));
            while ((j >= 0) && (locala.a(j, paramInt2)) && (arrayOfInt[0] <= paramInt3))
            {
              arrayOfInt[0] += 1;
              j -= 1;
            }
          } while (arrayOfInt[0] > paramInt3);
          paramInt1 += 1;
          while ((paramInt1 < k) && (locala.a(paramInt1, paramInt2)))
          {
            arrayOfInt[2] += 1;
            paramInt1 += 1;
          }
        } while (paramInt1 == k);
        while ((paramInt1 < k) && (!locala.a(paramInt1, paramInt2)) && (arrayOfInt[3] < paramInt3))
        {
          arrayOfInt[3] += 1;
          paramInt1 += 1;
        }
      } while ((paramInt1 == k) || (arrayOfInt[3] >= paramInt3));
      while ((paramInt1 < k) && (locala.a(paramInt1, paramInt2)) && (arrayOfInt[4] < paramInt3))
      {
        arrayOfInt[4] += 1;
        paramInt1 += 1;
      }
    } while ((arrayOfInt[4] >= paramInt3) || (Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3] + arrayOfInt[4] - paramInt4) * 5 >= paramInt4) || (!a(arrayOfInt)));
    return a(arrayOfInt, paramInt1);
  }
  
  private boolean c()
  {
    float f2 = 0.0F;
    int j = this.b.size();
    Iterator localIterator = this.b.iterator();
    float f1 = 0.0F;
    int i = 0;
    if (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.d() < 2) {
        break label147;
      }
      f1 = locald.c() + f1;
      i += 1;
    }
    label147:
    for (;;)
    {
      break;
      if (i < 3) {}
      do
      {
        return false;
        float f3 = f1 / j;
        localIterator = this.b.iterator();
        while (localIterator.hasNext()) {
          f2 += Math.abs(((d)localIterator.next()).c() - f3);
        }
      } while (f2 > 0.05F * f1);
      return true;
    }
  }
  
  private d[] d()
  {
    float f3 = 0.0F;
    int i = this.b.size();
    if (i < 3) {
      throw com.c.b.i.a();
    }
    Iterator localIterator;
    float f1;
    if (i > 3)
    {
      localIterator = this.b.iterator();
      f1 = 0.0F;
      float f2 = 0.0F;
      while (localIterator.hasNext())
      {
        float f4 = ((d)localIterator.next()).c();
        f2 += f4;
        f1 = f4 * f4 + f1;
      }
      f2 /= i;
      f1 = (float)Math.sqrt(f1 / i - f2 * f2);
      Collections.sort(this.b, new h(f2, null));
      f1 = Math.max(0.2F * f2, f1);
      int j;
      for (i = 0; (i < this.b.size()) && (this.b.size() > 3); i = j + 1)
      {
        j = i;
        if (Math.abs(((d)this.b.get(i)).c() - f2) > f1)
        {
          this.b.remove(i);
          j = i - 1;
        }
      }
    }
    if (this.b.size() > 3)
    {
      localIterator = this.b.iterator();
      for (f1 = f3; localIterator.hasNext(); f1 += ((d)localIterator.next()).c()) {}
      f1 /= this.b.size();
      Collections.sort(this.b, new g(f1, null));
      this.b.subList(3, this.b.size()).clear();
    }
    return new d[] { (d)this.b.get(0), (d)this.b.get(1), (d)this.b.get(2) };
  }
  
  final i a(Map<com.c.b.e, ?> paramMap)
  {
    int j;
    boolean bool3;
    label37:
    int i2;
    boolean bool1;
    int k;
    int n;
    int m;
    if ((paramMap != null) && (paramMap.containsKey(com.c.b.e.d)))
    {
      j = 1;
      if ((paramMap == null) || (!paramMap.containsKey(com.c.b.e.b))) {
        break label189;
      }
      bool3 = true;
      int i1 = this.a.d();
      i2 = this.a.c();
      i = i1 * 3 / 228;
      if ((i < 3) || (j != 0)) {
        i = 3;
      }
      bool1 = false;
      paramMap = new int[5];
      k = i - 1;
      if ((k >= i1) || (bool1)) {
        break label464;
      }
      paramMap[0] = 0;
      paramMap[1] = 0;
      paramMap[2] = 0;
      paramMap[3] = 0;
      paramMap[4] = 0;
      n = 0;
      j = 0;
      m = i;
      i = n;
      label130:
      if (j >= i2) {
        break label391;
      }
      if (!this.a.a(j, k)) {
        break label195;
      }
      n = i;
      if ((i & 0x1) == 1) {
        n = i + 1;
      }
      paramMap[n] += 1;
    }
    for (int i = n;; i = 0)
    {
      label177:
      j += 1;
      break label130;
      j = 0;
      break;
      label189:
      bool3 = false;
      break label37;
      label195:
      if ((i & 0x1) != 0) {
        break label380;
      }
      if (i != 4) {
        break label365;
      }
      if (!a(paramMap)) {
        break label334;
      }
      if (!a(paramMap, k, j, bool3)) {
        break label303;
      }
      m = 2;
      if (!this.c) {
        break label267;
      }
      bool1 = c();
      label242:
      paramMap[0] = 0;
      paramMap[1] = 0;
      paramMap[2] = 0;
      paramMap[3] = 0;
      paramMap[4] = 0;
    }
    label267:
    i = b();
    if (i > paramMap[2])
    {
      j = k + (i - paramMap[2] - 2);
      i = i2 - 1;
    }
    for (;;)
    {
      k = j;
      j = i;
      break label242;
      label303:
      paramMap[0] = paramMap[2];
      paramMap[1] = paramMap[3];
      paramMap[2] = paramMap[4];
      paramMap[3] = 1;
      paramMap[4] = 0;
      i = 3;
      break label177;
      label334:
      paramMap[0] = paramMap[2];
      paramMap[1] = paramMap[3];
      paramMap[2] = paramMap[4];
      paramMap[3] = 1;
      paramMap[4] = 0;
      i = 3;
      break label177;
      label365:
      i += 1;
      paramMap[i] += 1;
      break label177;
      label380:
      paramMap[i] += 1;
      break label177;
      label391:
      boolean bool2 = bool1;
      i = m;
      if (a(paramMap))
      {
        bool2 = bool1;
        i = m;
        if (a(paramMap, k, i2, bool3))
        {
          j = paramMap[0];
          bool2 = bool1;
          i = j;
          if (this.c)
          {
            bool2 = c();
            i = j;
          }
        }
      }
      k += i;
      bool1 = bool2;
      break;
      label464:
      paramMap = d();
      n.a(paramMap);
      return new i(paramMap);
      i = j;
      j = k;
    }
  }
  
  protected final boolean a(int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool2 = false;
    int i = 0;
    int j = paramArrayOfInt[0] + paramArrayOfInt[1] + paramArrayOfInt[2] + paramArrayOfInt[3] + paramArrayOfInt[4];
    float f2 = a(paramArrayOfInt, paramInt2);
    float f1 = b(paramInt1, (int)f2, paramArrayOfInt[2], j);
    boolean bool1 = bool2;
    float f3;
    if (!Float.isNaN(f1))
    {
      f2 = c((int)f2, (int)f1, paramArrayOfInt[2], j);
      bool1 = bool2;
      if (!Float.isNaN(f2)) {
        if (paramBoolean)
        {
          bool1 = bool2;
          if (!a((int)f1, (int)f2, paramArrayOfInt[2], j)) {}
        }
        else
        {
          f3 = j / 7.0F;
          paramInt1 = 0;
        }
      }
    }
    for (;;)
    {
      paramInt2 = i;
      if (paramInt1 < this.b.size())
      {
        paramArrayOfInt = (d)this.b.get(paramInt1);
        if (paramArrayOfInt.a(f3, f1, f2))
        {
          this.b.set(paramInt1, paramArrayOfInt.b(f1, f2, f3));
          paramInt2 = 1;
        }
      }
      else
      {
        if (paramInt2 == 0)
        {
          paramArrayOfInt = new d(f2, f1, f3);
          this.b.add(paramArrayOfInt);
          if (this.e != null) {
            this.e.a(paramArrayOfInt);
          }
        }
        bool1 = true;
        return bool1;
      }
      paramInt1 += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */