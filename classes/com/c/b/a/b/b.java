package com.c.b.a.b;

final class b
{
  private final a a;
  private final int[] b;
  
  b(a parama, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0) {
      throw new IllegalArgumentException();
    }
    this.a = parama;
    int j = paramArrayOfInt.length;
    if ((j > 1) && (paramArrayOfInt[0] == 0))
    {
      int i = 1;
      while ((i < j) && (paramArrayOfInt[i] == 0)) {
        i += 1;
      }
      if (i == j)
      {
        this.b = new int[] { 0 };
        return;
      }
      this.b = new int[j - i];
      System.arraycopy(paramArrayOfInt, i, this.b, 0, this.b.length);
      return;
    }
    this.b = paramArrayOfInt;
  }
  
  int a()
  {
    return this.b.length - 1;
  }
  
  int a(int paramInt)
  {
    return this.b[(this.b.length - 1 - paramInt)];
  }
  
  b a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException();
    }
    if (paramInt2 == 0) {
      return this.a.a();
    }
    int i = this.b.length;
    int[] arrayOfInt = new int[i + paramInt1];
    paramInt1 = 0;
    while (paramInt1 < i)
    {
      arrayOfInt[paramInt1] = this.a.c(this.b[paramInt1], paramInt2);
      paramInt1 += 1;
    }
    return new b(this.a, arrayOfInt);
  }
  
  b a(b paramb)
  {
    if (!this.a.equals(paramb.a)) {
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }
    if (b()) {
      return paramb;
    }
    if (paramb.b()) {
      return this;
    }
    Object localObject = this.b;
    int[] arrayOfInt = paramb.b;
    if (localObject.length > arrayOfInt.length) {
      paramb = arrayOfInt;
    }
    for (;;)
    {
      arrayOfInt = new int[localObject.length];
      int j = localObject.length - paramb.length;
      System.arraycopy(localObject, 0, arrayOfInt, 0, j);
      int i = j;
      while (i < localObject.length)
      {
        arrayOfInt[i] = a.b(paramb[(i - j)], localObject[i]);
        i += 1;
      }
      return new b(this.a, arrayOfInt);
      paramb = (b)localObject;
      localObject = arrayOfInt;
    }
  }
  
  int b(int paramInt)
  {
    int j = 0;
    int i;
    if (paramInt == 0)
    {
      i = a(0);
      return i;
    }
    int m = this.b.length;
    if (paramInt == 1)
    {
      int[] arrayOfInt = this.b;
      k = arrayOfInt.length;
      paramInt = 0;
      for (;;)
      {
        i = paramInt;
        if (j >= k) {
          break;
        }
        paramInt = a.b(paramInt, arrayOfInt[j]);
        j += 1;
      }
    }
    j = this.b[0];
    int k = 1;
    for (;;)
    {
      i = j;
      if (k >= m) {
        break;
      }
      j = a.b(this.a.c(paramInt, j), this.b[k]);
      k += 1;
    }
  }
  
  b b(b paramb)
  {
    if (!this.a.equals(paramb.a)) {
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }
    if ((b()) || (paramb.b())) {
      return this.a.a();
    }
    int[] arrayOfInt1 = this.b;
    int k = arrayOfInt1.length;
    paramb = paramb.b;
    int m = paramb.length;
    int[] arrayOfInt2 = new int[k + m - 1];
    int i = 0;
    while (i < k)
    {
      int n = arrayOfInt1[i];
      int j = 0;
      while (j < m)
      {
        arrayOfInt2[(i + j)] = a.b(arrayOfInt2[(i + j)], this.a.c(n, paramb[j]));
        j += 1;
      }
      i += 1;
    }
    return new b(this.a, arrayOfInt2);
  }
  
  boolean b()
  {
    boolean bool = false;
    if (this.b[0] == 0) {
      bool = true;
    }
    return bool;
  }
  
  b c(int paramInt)
  {
    if (paramInt == 0) {
      localObject = this.a.a();
    }
    do
    {
      return (b)localObject;
      localObject = this;
    } while (paramInt == 1);
    int j = this.b.length;
    Object localObject = new int[j];
    int i = 0;
    while (i < j)
    {
      localObject[i] = this.a.c(this.b[i], paramInt);
      i += 1;
    }
    return new b(this.a, (int[])localObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(a() * 8);
    int i = a();
    if (i >= 0)
    {
      int k = a(i);
      int j;
      if (k != 0)
      {
        if (k >= 0) {
          break label104;
        }
        localStringBuilder.append(" - ");
        j = -k;
        label52:
        if ((i == 0) || (j != 1))
        {
          j = this.a.b(j);
          if (j != 0) {
            break label127;
          }
          localStringBuilder.append('1');
        }
        label81:
        if (i != 0)
        {
          if (i != 1) {
            break label158;
          }
          localStringBuilder.append('x');
        }
      }
      for (;;)
      {
        i -= 1;
        break;
        label104:
        j = k;
        if (localStringBuilder.length() <= 0) {
          break label52;
        }
        localStringBuilder.append(" + ");
        j = k;
        break label52;
        label127:
        if (j == 1)
        {
          localStringBuilder.append('a');
          break label81;
        }
        localStringBuilder.append("a^");
        localStringBuilder.append(j);
        break label81;
        label158:
        localStringBuilder.append("x^");
        localStringBuilder.append(i);
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */