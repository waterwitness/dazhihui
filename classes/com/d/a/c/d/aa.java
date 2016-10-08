package com.d.a.c.d;

import java.util.Arrays;

final class aa
{
  private int a;
  private int b;
  private int c;
  private final int[] d = new int[10];
  
  public aa a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= this.d.length) {
      return this;
    }
    int i = 1 << paramInt1;
    this.a |= i;
    if ((paramInt2 & 0x1) != 0)
    {
      this.b |= i;
      if ((paramInt2 & 0x2) == 0) {
        break label86;
      }
    }
    label86:
    for (this.c = (i | this.c);; this.c = ((i ^ 0xFFFFFFFF) & this.c))
    {
      this.d[paramInt1] = paramInt3;
      return this;
      this.b &= (i ^ 0xFFFFFFFF);
      break;
    }
  }
  
  public void a()
  {
    this.c = 0;
    this.b = 0;
    this.a = 0;
    Arrays.fill(this.d, 0);
  }
  
  public void a(aa paramaa)
  {
    int i = 0;
    if (i >= 10) {
      return;
    }
    if (!paramaa.a(i)) {}
    for (;;)
    {
      i += 1;
      break;
      a(i, paramaa.c(i), paramaa.b(i));
    }
  }
  
  boolean a(int paramInt)
  {
    return (1 << paramInt & this.a) != 0;
  }
  
  int b()
  {
    return Integer.bitCount(this.a);
  }
  
  int b(int paramInt)
  {
    return this.d[paramInt];
  }
  
  int c()
  {
    if ((0x2 & this.a) != 0) {
      return this.d[1];
    }
    return -1;
  }
  
  int c(int paramInt)
  {
    int i = 0;
    if (f(paramInt)) {
      i = 2;
    }
    int j = i;
    if (e(paramInt)) {
      j = i | 0x1;
    }
    return j;
  }
  
  public int d(int paramInt)
  {
    if ((0x80 & this.a) != 0) {
      paramInt = this.d[7];
    }
    return paramInt;
  }
  
  boolean e(int paramInt)
  {
    return (1 << paramInt & this.b) != 0;
  }
  
  boolean f(int paramInt)
  {
    return (1 << paramInt & this.c) != 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */