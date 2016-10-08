package com.c.b.a;

import java.util.Arrays;

public final class a
  implements Cloneable
{
  private final int a;
  private final int b;
  private final int c;
  private final int[] d;
  
  public a(int paramInt)
  {
    this(paramInt, paramInt);
  }
  
  public a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 1) || (paramInt2 < 1)) {
      throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = ((paramInt1 + 31) / 32);
    this.d = new int[this.c * paramInt2];
  }
  
  private a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramArrayOfInt;
  }
  
  public String a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, System.getProperty("line.separator"));
  }
  
  public String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(this.b * (this.a + 1));
    int i = 0;
    while (i < this.b)
    {
      int j = 0;
      if (j < this.a)
      {
        if (a(j, i)) {}
        for (String str = paramString1;; str = paramString2)
        {
          localStringBuilder.append(str);
          j += 1;
          break;
        }
      }
      localStringBuilder.append(paramString3);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 < 0) || (paramInt1 < 0)) {
      throw new IllegalArgumentException("Left and top must be nonnegative");
    }
    if ((paramInt4 < 1) || (paramInt3 < 1)) {
      throw new IllegalArgumentException("Height and width must be at least 1");
    }
    int i = paramInt1 + paramInt3;
    paramInt4 = paramInt2 + paramInt4;
    if ((paramInt4 > this.b) || (i > this.a)) {
      throw new IllegalArgumentException("The region must fit inside the matrix");
    }
    for (;;)
    {
      paramInt2 += 1;
      if (paramInt2 >= paramInt4) {
        break;
      }
      int j = this.c;
      paramInt3 = paramInt1;
      while (paramInt3 < i)
      {
        int[] arrayOfInt = this.d;
        int k = paramInt3 / 32 + paramInt2 * j;
        arrayOfInt[k] |= 1 << (paramInt3 & 0x1F);
        paramInt3 += 1;
      }
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    int i = this.c;
    int j = paramInt1 / 32;
    return (this.d[(i * paramInt2 + j)] >>> (paramInt1 & 0x1F) & 0x1) != 0;
  }
  
  public int[] a()
  {
    int i = 0;
    while ((i < this.d.length) && (this.d[i] == 0)) {
      i += 1;
    }
    if (i == this.d.length) {
      return null;
    }
    int k = i / this.c;
    int m = this.c;
    int n = this.d[i];
    int j = 0;
    while (n << 31 - j == 0) {
      j += 1;
    }
    return new int[] { i % m * 32 + j, k };
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    paramInt2 = this.c * paramInt2 + paramInt1 / 32;
    int[] arrayOfInt = this.d;
    arrayOfInt[paramInt2] |= 1 << (paramInt1 & 0x1F);
  }
  
  public int[] b()
  {
    int i = this.d.length - 1;
    while ((i >= 0) && (this.d[i] == 0)) {
      i -= 1;
    }
    if (i < 0) {
      return null;
    }
    int k = i / this.c;
    int m = this.c;
    int n = this.d[i];
    int j = 31;
    while (n >>> j == 0) {
      j -= 1;
    }
    return new int[] { i % m * 32 + j, k };
  }
  
  public int c()
  {
    return this.a;
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    paramInt2 = this.c * paramInt2 + paramInt1 / 32;
    int[] arrayOfInt = this.d;
    arrayOfInt[paramInt2] ^= 1 << (paramInt1 & 0x1F);
  }
  
  public int d()
  {
    return this.b;
  }
  
  public a e()
  {
    return new a(this.a, this.b, this.c, (int[])this.d.clone());
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {}
    do
    {
      return false;
      paramObject = (a)paramObject;
    } while ((this.a != ((a)paramObject).a) || (this.b != ((a)paramObject).b) || (this.c != ((a)paramObject).c) || (!Arrays.equals(this.d, ((a)paramObject).d)));
    return true;
  }
  
  public int hashCode()
  {
    return (((this.a * 31 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d);
  }
  
  public String toString()
  {
    return a("X ", "  ");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */