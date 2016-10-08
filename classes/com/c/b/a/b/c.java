package com.c.b.a.b;

public final class c
{
  private final a a;
  
  public c(a parama)
  {
    this.a = parama;
  }
  
  private int[] a(b paramb)
  {
    int j = 0;
    int i = 1;
    int m = paramb.a();
    if (m == 1) {
      return new int[] { paramb.a(1) };
    }
    int[] arrayOfInt = new int[m];
    while ((i < this.a.c()) && (j < m))
    {
      int k = j;
      if (paramb.b(i) == 0)
      {
        arrayOfInt[j] = this.a.c(i);
        k = j + 1;
      }
      i += 1;
      j = k;
    }
    if (j != m) {
      throw new d("Error locator degree does not match number of roots");
    }
    return arrayOfInt;
  }
  
  private int[] a(b paramb, int[] paramArrayOfInt)
  {
    int n = paramArrayOfInt.length;
    int[] arrayOfInt = new int[n];
    int j = 0;
    int i1;
    int i;
    int k;
    label38:
    int m;
    if (j < n)
    {
      i1 = this.a.c(paramArrayOfInt[j]);
      i = 1;
      k = 0;
      if (k < n)
      {
        if (j == k) {
          break label176;
        }
        m = this.a.c(paramArrayOfInt[k], i1);
        if ((m & 0x1) == 0)
        {
          m |= 0x1;
          label80:
          i = this.a.c(i, m);
        }
      }
    }
    label176:
    for (;;)
    {
      k += 1;
      break label38;
      m &= 0xFFFFFFFE;
      break label80;
      arrayOfInt[j] = this.a.c(paramb.b(i1), this.a.c(i));
      if (this.a.d() != 0) {
        arrayOfInt[j] = this.a.c(arrayOfInt[j], i1);
      }
      j += 1;
      break;
      return arrayOfInt;
    }
  }
  
  private b[] a(b paramb1, b paramb2, int paramInt)
  {
    if (paramb1.a() < paramb2.a()) {}
    for (;;)
    {
      Object localObject = this.a.a();
      b localb1 = this.a.b();
      while (paramb1.a() >= paramInt / 2)
      {
        if (paramb1.b()) {
          throw new d("r_{i-1} was zero");
        }
        b localb2 = this.a.a();
        int i = paramb1.a(paramb1.a());
        i = this.a.c(i);
        while ((paramb2.a() >= paramb1.a()) && (!paramb2.b()))
        {
          int j = paramb2.a() - paramb1.a();
          int k = this.a.c(paramb2.a(paramb2.a()), i);
          localb2 = localb2.a(this.a.a(j, k));
          paramb2 = paramb2.a(paramb1.a(j, k));
        }
        localObject = localb2.b(localb1).a((b)localObject);
        if (paramb2.a() >= paramb1.a()) {
          throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
        }
        localb2 = paramb1;
        paramb1 = paramb2;
        paramb2 = (b)localObject;
        localObject = localb1;
        localb1 = paramb2;
        paramb2 = localb2;
      }
      paramInt = localb1.a(0);
      if (paramInt == 0) {
        throw new d("sigmaTilde(0) was zero");
      }
      paramInt = this.a.c(paramInt);
      return new b[] { localb1.c(paramInt), paramb1.c(paramInt) };
      localb1 = paramb1;
      paramb1 = paramb2;
      paramb2 = localb1;
    }
  }
  
  public void a(int[] paramArrayOfInt, int paramInt)
  {
    int k = 0;
    Object localObject1 = new b(this.a, paramArrayOfInt);
    Object localObject2 = new int[paramInt];
    int i = 0;
    int j = 1;
    while (i < paramInt)
    {
      int m = ((b)localObject1).b(this.a.a(this.a.d() + i));
      localObject2[(localObject2.length - 1 - i)] = m;
      if (m != 0) {
        j = 0;
      }
      i += 1;
    }
    if (j != 0) {}
    for (;;)
    {
      return;
      localObject1 = new b(this.a, (int[])localObject2);
      localObject2 = a(this.a.a(paramInt, 1), (b)localObject1, paramInt);
      localObject1 = localObject2[0];
      localObject2 = localObject2[1];
      localObject1 = a((b)localObject1);
      localObject2 = a((b)localObject2, (int[])localObject1);
      paramInt = k;
      while (paramInt < localObject1.length)
      {
        i = paramArrayOfInt.length - 1 - this.a.b(localObject1[paramInt]);
        if (i < 0) {
          throw new d("Bad error location");
        }
        paramArrayOfInt[i] = a.b(paramArrayOfInt[i], localObject2[paramInt]);
        paramInt += 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */