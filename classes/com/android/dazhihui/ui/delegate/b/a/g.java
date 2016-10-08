package com.android.dazhihui.ui.delegate.b.a;

final class g
{
  private static byte[] i = { 0, 0, -1, -1 };
  int a;
  int b;
  long[] c = new long[1];
  long d;
  int e;
  int f;
  int g;
  d h;
  
  int a(l paraml)
  {
    if ((paraml == null) || (paraml.k == null)) {
      return -2;
    }
    paraml.h = 0L;
    paraml.d = 0L;
    paraml.i = null;
    g localg = paraml.k;
    if (paraml.k.f != 0) {}
    for (int j = 7;; j = 0)
    {
      localg.a = j;
      paraml.k.h.a(paraml, null);
      return 0;
    }
  }
  
  int a(l paraml, int paramInt)
  {
    Object localObject = null;
    paraml.i = null;
    this.h = null;
    this.f = 0;
    int j = paramInt;
    if (paramInt < 0)
    {
      j = -paramInt;
      this.f = 1;
    }
    if ((j < 8) || (j > 15))
    {
      b(paraml);
      return -2;
    }
    this.g = j;
    g localg = paraml.k;
    if (paraml.k.f != 0) {}
    for (;;)
    {
      localg.h = new d(paraml, localObject, 1 << j);
      a(paraml);
      return 0;
      localObject = this;
    }
  }
  
  int b(l paraml)
  {
    if (this.h != null) {
      this.h.a(paraml);
    }
    this.h = null;
    return 0;
  }
  
  int b(l paraml, int paramInt)
  {
    if ((paraml == null) || (paraml.k == null) || (paraml.a == null)) {
      j = -2;
    }
    label37:
    int k;
    int i2;
    int i3;
    int i4;
    int i5;
    label453:
    do
    {
      do
      {
        do
        {
          return j;
          if (paramInt == 4)
          {
            paramInt = -5;
            j = -5;
          }
          for (;;)
          {
            k = j;
            m = j;
            n = j;
            i1 = j;
            i2 = j;
            i3 = j;
            i4 = j;
            i5 = j;
            switch (paraml.k.a)
            {
            default: 
              return -2;
              paramInt = 0;
              break;
            case 0: 
              if (paraml.c == 0) {
                break;
              }
              paraml.c -= 1;
              paraml.d += 1L;
              localObject = paraml.k;
              arrayOfByte = paraml.a;
              j = paraml.b;
              paraml.b = (j + 1);
              j = arrayOfByte[j];
              ((g)localObject).b = j;
              if ((j & 0xF) != 8)
              {
                paraml.k.a = 13;
                paraml.i = "unknown compression method";
                paraml.k.e = 5;
                j = paramInt;
              }
              else if ((paraml.k.b >> 4) + 8 > paraml.k.g)
              {
                paraml.k.a = 13;
                paraml.i = "invalid window size";
                paraml.k.e = 5;
                j = paramInt;
              }
              else
              {
                paraml.k.a = 1;
                k = paramInt;
              }
              break;
            case 1: 
              j = k;
              if (paraml.c == 0) {
                break;
              }
              paraml.c -= 1;
              paraml.d += 1L;
              localObject = paraml.a;
              j = paraml.b;
              paraml.b = (j + 1);
              j = localObject[j] & 0xFF;
              if (((paraml.k.b << 8) + j) % 31 != 0)
              {
                paraml.k.a = 13;
                paraml.i = "incorrect header check";
                paraml.k.e = 5;
                j = paramInt;
              }
              else
              {
                if ((j & 0x20) != 0) {
                  break label453;
                }
                paraml.k.a = 7;
                j = paramInt;
              }
              break;
            }
          }
          paraml.k.a = 2;
          int m = paramInt;
          j = m;
        } while (paraml.c == 0);
        paraml.c -= 1;
        paraml.d += 1L;
        localObject = paraml.k;
        arrayOfByte = paraml.a;
        j = paraml.b;
        paraml.b = (j + 1);
        ((g)localObject).d = ((arrayOfByte[j] & 0xFF) << 24 & 0xFF000000);
        paraml.k.a = 3;
        int n = paramInt;
        j = n;
      } while (paraml.c == 0);
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      l = ((g)localObject).d;
      arrayOfByte = paraml.a;
      j = paraml.b;
      paraml.b = (j + 1);
      ((g)localObject).d = (l + ((arrayOfByte[j] & 0xFF) << 16 & 0xFF0000));
      paraml.k.a = 4;
      int i1 = paramInt;
      j = i1;
    } while (paraml.c == 0);
    paraml.c -= 1;
    paraml.d += 1L;
    Object localObject = paraml.k;
    long l = ((g)localObject).d;
    byte[] arrayOfByte = paraml.a;
    int j = paraml.b;
    paraml.b = (j + 1);
    ((g)localObject).d = (l + ((arrayOfByte[j] & 0xFF) << 8 & 0xFF00));
    paraml.k.a = 5;
    for (;;)
    {
      if (paraml.c == 0) {
        return paramInt;
      }
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      l = ((g)localObject).d;
      arrayOfByte = paraml.a;
      paramInt = paraml.b;
      paraml.b = (paramInt + 1);
      ((g)localObject).d = (l + (arrayOfByte[paramInt] & 0xFF));
      paraml.l = paraml.k.d;
      paraml.k.a = 6;
      return 2;
      paraml.k.a = 13;
      paraml.i = "need dictionary";
      paraml.k.e = 0;
      return -2;
      j = paraml.k.h.a(paraml, j);
      if (j == -3)
      {
        paraml.k.a = 13;
        paraml.k.e = 0;
        break label37;
      }
      k = j;
      if (j == 0) {
        k = paramInt;
      }
      j = k;
      if (k != 1) {
        break;
      }
      paraml.k.h.a(paraml, paraml.k.c);
      if (paraml.k.f != 0)
      {
        paraml.k.a = 12;
        j = paramInt;
        break label37;
      }
      paraml.k.a = 8;
      i2 = paramInt;
      j = i2;
      if (paraml.c == 0) {
        break;
      }
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      arrayOfByte = paraml.a;
      j = paraml.b;
      paraml.b = (j + 1);
      ((g)localObject).d = ((arrayOfByte[j] & 0xFF) << 24 & 0xFF000000);
      paraml.k.a = 9;
      i3 = paramInt;
      j = i3;
      if (paraml.c == 0) {
        break;
      }
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      l = ((g)localObject).d;
      arrayOfByte = paraml.a;
      j = paraml.b;
      paraml.b = (j + 1);
      ((g)localObject).d = (l + ((arrayOfByte[j] & 0xFF) << 16 & 0xFF0000));
      paraml.k.a = 10;
      i4 = paramInt;
      j = i4;
      if (paraml.c == 0) {
        break;
      }
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      l = ((g)localObject).d;
      arrayOfByte = paraml.a;
      j = paraml.b;
      paraml.b = (j + 1);
      ((g)localObject).d = (l + ((arrayOfByte[j] & 0xFF) << 8 & 0xFF00));
      paraml.k.a = 11;
      i5 = paramInt;
      j = i5;
      if (paraml.c == 0) {
        break;
      }
      paraml.c -= 1;
      paraml.d += 1L;
      localObject = paraml.k;
      l = ((g)localObject).d;
      arrayOfByte = paraml.a;
      j = paraml.b;
      paraml.b = (j + 1);
      ((g)localObject).d = (l + (arrayOfByte[j] & 0xFF));
      if ((int)paraml.k.c[0] != (int)paraml.k.d)
      {
        paraml.k.a = 13;
        paraml.i = "incorrect data check";
        paraml.k.e = 5;
        j = paramInt;
        break label37;
      }
      paraml.k.a = 12;
      return 1;
      return -3;
      paramInt = j;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */