package com.c.b.b.a;

final class p
{
  private static final int[][] a;
  private static final int[] b = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
  private final o c;
  private final byte d;
  
  static
  {
    int[] arrayOfInt1 = { 17913, 4 };
    int[] arrayOfInt2 = { 20375, 6 };
    int[] arrayOfInt3 = { 32170, 10 };
    int[] arrayOfInt4 = { 30877, 11 };
    int[] arrayOfInt5 = { 25368, 13 };
    int[] arrayOfInt6 = { 5054, 17 };
    int[] arrayOfInt7 = { 6608, 19 };
    int[] arrayOfInt8 = { 2107, 23 };
    int[] arrayOfInt9 = { 9396, 28 };
    int[] arrayOfInt10 = { 8579, 29 };
    int[] arrayOfInt11 = { 11994, 30 };
    int[] arrayOfInt12 = { 11245, 31 };
    a = new int[][] { { 21522, 0 }, { 20773, 1 }, { 24188, 2 }, { 23371, 3 }, arrayOfInt1, { 16590, 5 }, arrayOfInt2, { 19104, 7 }, { 30660, 8 }, { 29427, 9 }, arrayOfInt3, arrayOfInt4, { 26159, 12 }, arrayOfInt5, { 27713, 14 }, { 26998, 15 }, { 5769, 16 }, arrayOfInt6, { 7399, 18 }, arrayOfInt7, { 1890, 20 }, { 597, 21 }, { 3340, 22 }, arrayOfInt8, { 13663, 24 }, { 12392, 25 }, { 16177, 26 }, { 14854, 27 }, arrayOfInt9, arrayOfInt10, arrayOfInt11, arrayOfInt12 };
  }
  
  private p(int paramInt)
  {
    this.c = o.a(paramInt >> 3 & 0x3);
    this.d = ((byte)(paramInt & 0x7));
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    paramInt1 ^= paramInt2;
    paramInt2 = b[(paramInt1 & 0xF)];
    int i = b[(paramInt1 >>> 4 & 0xF)];
    int j = b[(paramInt1 >>> 8 & 0xF)];
    int k = b[(paramInt1 >>> 12 & 0xF)];
    int m = b[(paramInt1 >>> 16 & 0xF)];
    int n = b[(paramInt1 >>> 20 & 0xF)];
    int i1 = b[(paramInt1 >>> 24 & 0xF)];
    return b[(paramInt1 >>> 28 & 0xF)] + (paramInt2 + i + j + k + m + n + i1);
  }
  
  static p b(int paramInt1, int paramInt2)
  {
    p localp = c(paramInt1, paramInt2);
    if (localp != null) {
      return localp;
    }
    return c(paramInt1 ^ 0x5412, paramInt2 ^ 0x5412);
  }
  
  private static p c(int paramInt1, int paramInt2)
  {
    int j = Integer.MAX_VALUE;
    int[][] arrayOfInt = a;
    int n = arrayOfInt.length;
    int k = 0;
    int i = 0;
    int[] arrayOfInt1;
    int i1;
    int m;
    if (k < n)
    {
      arrayOfInt1 = arrayOfInt[k];
      i1 = arrayOfInt1[0];
      if ((i1 == paramInt1) || (i1 == paramInt2)) {
        return new p(arrayOfInt1[1]);
      }
      m = a(paramInt1, i1);
      if (m >= j) {
        break label141;
      }
      i = arrayOfInt1[1];
      j = m;
    }
    label141:
    for (;;)
    {
      if (paramInt1 != paramInt2)
      {
        m = a(paramInt2, i1);
        if (m < j)
        {
          i = arrayOfInt1[1];
          j = m;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        if (j <= 3) {
          return new p(i);
        }
        return null;
      }
    }
  }
  
  o a()
  {
    return this.c;
  }
  
  byte b()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof p)) {}
    do
    {
      return false;
      paramObject = (p)paramObject;
    } while ((this.c != ((p)paramObject).c) || (this.d != ((p)paramObject).d));
    return true;
  }
  
  public int hashCode()
  {
    return this.c.ordinal() << 3 | this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */