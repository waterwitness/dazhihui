package com.c.b.b.a;

final class b
{
  private final int a;
  private final byte[] b;
  
  private b(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  static b[] a(byte[] paramArrayOfByte, s params, o paramo)
  {
    if (paramArrayOfByte.length != params.c()) {
      throw new IllegalArgumentException();
    }
    params = params.a(paramo);
    paramo = params.b();
    int k = paramo.length;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      j += paramo[i].a();
      i += 1;
    }
    b[] arrayOfb = new b[j];
    int m = paramo.length;
    k = 0;
    int n;
    for (j = 0; k < m; j = i)
    {
      Object localObject = paramo[k];
      i = j;
      j = 0;
      while (j < ((t)localObject).a())
      {
        n = ((t)localObject).b();
        arrayOfb[i] = new b(n, new byte[params.a() + n]);
        j += 1;
        i += 1;
      }
      k += 1;
    }
    k = arrayOfb[0].b.length;
    i = arrayOfb.length - 1;
    int i1;
    if ((i < 0) || (arrayOfb[i].b.length == k))
    {
      i1 = i + 1;
      n = k - params.a();
      k = 0;
      i = 0;
    }
    for (;;)
    {
      if (k >= n) {
        break label287;
      }
      m = 0;
      for (;;)
      {
        if (m < j)
        {
          arrayOfb[m].b[k] = paramArrayOfByte[i];
          m += 1;
          i += 1;
          continue;
          i -= 1;
          break;
        }
      }
      k += 1;
    }
    label287:
    m = i1;
    k = i;
    while (m < j)
    {
      arrayOfb[m].b[n] = paramArrayOfByte[k];
      m += 1;
      k += 1;
    }
    int i2 = arrayOfb[0].b.length;
    i = n;
    while (i < i2)
    {
      m = 0;
      if (m < j)
      {
        if (m < i1) {}
        for (n = i;; n = i + 1)
        {
          arrayOfb[m].b[n] = paramArrayOfByte[k];
          m += 1;
          k += 1;
          break;
        }
      }
      i += 1;
    }
    return arrayOfb;
  }
  
  int a()
  {
    return this.a;
  }
  
  byte[] b()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */