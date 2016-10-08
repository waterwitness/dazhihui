package com.c.b.a.b;

public final class a
{
  public static final a a = new a(4201, 4096, 1);
  public static final a b = new a(1033, 1024, 1);
  public static final a c = new a(67, 64, 1);
  public static final a d = new a(19, 16, 1);
  public static final a e = new a(285, 256, 0);
  public static final a f = new a(301, 256, 1);
  public static final a g = f;
  public static final a h = c;
  private final int[] i;
  private final int[] j;
  private final b k;
  private final b l;
  private final int m;
  private final int n;
  private final int o;
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.n = paramInt1;
    this.m = paramInt2;
    this.o = paramInt3;
    this.i = new int[paramInt2];
    this.j = new int[paramInt2];
    int i1 = 0;
    paramInt3 = 1;
    while (i1 < paramInt2)
    {
      this.i[i1] = paramInt3;
      int i2 = paramInt3 * 2;
      paramInt3 = i2;
      if (i2 >= paramInt2) {
        paramInt3 = (i2 ^ paramInt1) & paramInt2 - 1;
      }
      i1 += 1;
    }
    paramInt1 = 0;
    while (paramInt1 < paramInt2 - 1)
    {
      this.j[this.i[paramInt1]] = paramInt1;
      paramInt1 += 1;
    }
    this.k = new b(this, new int[] { 0 });
    this.l = new b(this, new int[] { 1 });
  }
  
  static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }
  
  int a(int paramInt)
  {
    return this.i[paramInt];
  }
  
  b a()
  {
    return this.k;
  }
  
  b a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException();
    }
    if (paramInt2 == 0) {
      return this.k;
    }
    int[] arrayOfInt = new int[paramInt1 + 1];
    arrayOfInt[0] = paramInt2;
    return new b(this, arrayOfInt);
  }
  
  int b(int paramInt)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException();
    }
    return this.j[paramInt];
  }
  
  b b()
  {
    return this.l;
  }
  
  public int c()
  {
    return this.m;
  }
  
  int c(int paramInt)
  {
    if (paramInt == 0) {
      throw new ArithmeticException();
    }
    return this.i[(this.m - this.j[paramInt] - 1)];
  }
  
  int c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return 0;
    }
    return this.i[((this.j[paramInt1] + this.j[paramInt2]) % (this.m - 1))];
  }
  
  public int d()
  {
    return this.o;
  }
  
  public String toString()
  {
    return "GF(0x" + Integer.toHexString(this.n) + ',' + this.m + ')';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */