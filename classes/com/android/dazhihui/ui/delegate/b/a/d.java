package com.android.dazhihui.ui.delegate.b.a;

final class d
{
  static final int[] a = { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15 };
  private static final int[] u = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535 };
  int b;
  int c;
  int d;
  int e;
  int[] f;
  int[] g = new int[1];
  int[] h = new int[1];
  e i = new e();
  int j;
  int k;
  int l;
  int[] m = new int['რ'];
  byte[] n;
  int o;
  int p;
  int q;
  Object r;
  long s;
  f t = new f();
  
  d(l paraml, Object paramObject, int paramInt)
  {
    this.n = new byte[paramInt];
    this.o = paramInt;
    this.r = paramObject;
    this.b = 0;
    a(paraml, null);
  }
  
  int a(l paraml, int paramInt)
  {
    int i8 = paraml.b;
    int i7 = paraml.c;
    int i2 = this.l;
    int i3 = this.k;
    int i5 = this.q;
    if (i5 < this.p) {}
    int i4;
    int i6;
    int i15;
    int i16;
    int i20;
    int i21;
    int i19;
    int i17;
    int i18;
    int i9;
    int i14;
    int i13;
    int i12;
    int i11;
    int i10;
    for (int i1 = this.p - i5 - 1;; i1 = this.o - i5)
    {
      i4 = paramInt;
      i6 = i1;
      i1 = i8;
      paramInt = i7;
      i15 = paramInt;
      i16 = i1;
      i20 = i3;
      i21 = i2;
      i19 = i4;
      i7 = paramInt;
      i8 = i1;
      i17 = i3;
      i18 = i2;
      i9 = i4;
      i14 = paramInt;
      i13 = i1;
      i12 = i3;
      i11 = i2;
      i10 = i4;
      switch (this.b)
      {
      default: 
        this.l = i2;
        this.k = i3;
        paraml.c = paramInt;
        paraml.d += i1 - paraml.b;
        paraml.b = i1;
        this.q = i5;
        return b(paraml, -2);
      }
    }
    for (;;)
    {
      if (paramInt < 3)
      {
        if (i2 != 0)
        {
          i4 = 0;
          i2 -= 1;
          i1 |= (paraml.a[i3] & 0xFF) << paramInt;
          paramInt += 8;
          i3 += 1;
        }
        else
        {
          this.l = i1;
          this.k = paramInt;
          paraml.c = i2;
          paraml.d += i3 - paraml.b;
          paraml.b = i3;
          this.q = i5;
          return b(paraml, i4);
        }
      }
      else
      {
        i7 = i1 & 0x7;
        this.j = (i7 & 0x1);
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        Object localObject1;
        Object localObject2;
        switch (i7 >>> 1)
        {
        default: 
        case 0: 
        case 1: 
        case 2: 
          for (;;)
          {
            i7 = paramInt;
            i8 = i1;
            paramInt = i2;
            i1 = i3;
            i3 = i7;
            i2 = i8;
            break;
            paramInt -= 3;
            i7 = paramInt & 0x7;
            i1 = i1 >>> 3 >>> i7;
            paramInt -= i7;
            this.b = 1;
            continue;
            arrayOfInt1 = new int[1];
            arrayOfInt2 = new int[1];
            localObject1 = new int[1][];
            localObject2 = new int[1][];
            f.a(arrayOfInt1, arrayOfInt2, (int[][])localObject1, (int[][])localObject2, paraml);
            this.i.a(arrayOfInt1[0], arrayOfInt2[0], localObject1[0], 0, localObject2[0], 0, paraml);
            i1 >>>= 3;
            paramInt -= 3;
            this.b = 6;
            continue;
            i1 >>>= 3;
            paramInt -= 3;
            this.b = 3;
          }
        }
        this.b = 9;
        paraml.i = "invalid block type";
        this.l = (i1 >>> 3);
        this.k = (paramInt - 3);
        paraml.c = i2;
        paraml.d += i3 - paraml.b;
        paraml.b = i3;
        this.q = i5;
        return b(paraml, -3);
        while (i20 < 32) {
          if (i15 != 0)
          {
            i19 = 0;
            i15 -= 1;
            i21 |= (paraml.a[i16] & 0xFF) << i20;
            i20 += 8;
            i16 += 1;
          }
          else
          {
            this.l = i21;
            this.k = i20;
            paraml.c = i15;
            paraml.d += i16 - paraml.b;
            paraml.b = i16;
            this.q = i5;
            return b(paraml, i19);
          }
        }
        if (((i21 ^ 0xFFFFFFFF) >>> 16 & 0xFFFF) != (0xFFFF & i21))
        {
          this.b = 9;
          paraml.i = "invalid stored block lengths";
          this.l = i21;
          this.k = i20;
          paraml.c = i15;
          paraml.d += i16 - paraml.b;
          paraml.b = i16;
          this.q = i5;
          return b(paraml, -3);
        }
        this.c = (0xFFFF & i21);
        if (this.c != 0) {
          paramInt = 2;
        }
        for (;;)
        {
          this.b = paramInt;
          i3 = 0;
          i2 = 0;
          paramInt = i15;
          i1 = i16;
          i4 = i19;
          break;
          if (this.j != 0) {
            paramInt = 7;
          } else {
            paramInt = 0;
          }
        }
        if (paramInt == 0)
        {
          this.l = i2;
          this.k = i3;
          paraml.c = paramInt;
          paraml.d += i1 - paraml.b;
          paraml.b = i1;
          this.q = i5;
          return b(paraml, i4);
        }
        i7 = i6;
        i8 = i5;
        if (i6 == 0)
        {
          i10 = i6;
          i9 = i5;
          if (i5 == this.o)
          {
            i10 = i6;
            i9 = i5;
            if (this.p != 0)
            {
              i9 = 0;
              if (this.p >= 0) {
                break label1163;
              }
              i5 = this.p - 0 - 1;
              i10 = i5;
            }
          }
          i7 = i10;
          i8 = i9;
          if (i10 == 0)
          {
            this.q = i9;
            i6 = b(paraml, i4);
            i5 = this.q;
            if (i5 < this.p)
            {
              i4 = this.p - i5 - 1;
              label1060:
              if ((i5 != this.o) || (this.p == 0)) {
                break label3354;
              }
              i5 = 0;
              if (this.p >= 0) {
                break label1186;
              }
            }
            label1163:
            label1186:
            for (i4 = this.p - 0 - 1;; i4 = this.o - 0)
            {
              i7 = i4;
              i8 = i5;
              if (i4 != 0) {
                break label1197;
              }
              this.l = i2;
              this.k = i3;
              paraml.c = paramInt;
              paraml.d += i1 - paraml.b;
              paraml.b = i1;
              this.q = i5;
              return b(paraml, i6);
              i5 = this.o - 0;
              break;
              i4 = this.o - i5;
              break label1060;
            }
          }
        }
        label1197:
        i9 = 0;
        i5 = this.c;
        i4 = i5;
        if (i5 > paramInt) {
          i4 = paramInt;
        }
        if (i4 > i7)
        {
          i5 = i7;
          label1230:
          System.arraycopy(paraml.a, i1, this.n, i8, i5);
          i1 += i5;
          paramInt -= i5;
          i4 = i8 + i5;
          i6 = i7 - i5;
          i5 = this.c - i5;
          this.c = i5;
          if (i5 != 0)
          {
            i5 = i4;
            i4 = i9;
            break;
          }
          if (this.j != 0) {}
          for (i5 = 7;; i5 = 0)
          {
            this.b = i5;
            i5 = i4;
            i4 = i9;
            break;
          }
          while (i17 < 14) {
            if (i7 != 0)
            {
              i9 = 0;
              i7 -= 1;
              i18 |= (paraml.a[i8] & 0xFF) << i17;
              i17 += 8;
              i8 += 1;
            }
            else
            {
              this.l = i18;
              this.k = i17;
              paraml.c = i7;
              paraml.d += i8 - paraml.b;
              paraml.b = i8;
              this.q = i5;
              return b(paraml, i9);
            }
          }
          paramInt = i18 & 0x3FFF;
          this.d = paramInt;
          if (((paramInt & 0x1F) > 29) || ((paramInt >> 5 & 0x1F) > 29))
          {
            this.b = 9;
            paraml.i = "too many length or distance symbols";
            this.l = i18;
            this.k = i17;
            paraml.c = i7;
            paraml.d += i8 - paraml.b;
            paraml.b = i8;
            this.q = i5;
            return b(paraml, -3);
          }
          i1 = (paramInt & 0x1F) + 258 + (paramInt >> 5 & 0x1F);
          if ((this.f == null) || (this.f.length < i1))
          {
            this.f = new int[i1];
            i11 = i18 >>> 14;
            i12 = i17 - 14;
            this.e = 0;
            this.b = 4;
            i10 = i9;
            i13 = i8;
            i14 = i7;
            i3 = i14;
            i2 = i13;
            paramInt = i12;
            i1 = i11;
            i4 = i10;
          }
          for (;;)
          {
            if (this.e >= (this.d >>> 10) + 4) {
              break label1875;
            }
            i6 = i3;
            i7 = i2;
            i2 = i1;
            i3 = paramInt;
            paramInt = i7;
            i1 = i6;
            for (;;)
            {
              if (i3 < 3)
              {
                if (i1 != 0)
                {
                  i4 = 0;
                  i1 -= 1;
                  i2 |= (paraml.a[paramInt] & 0xFF) << i3;
                  i3 += 8;
                  paramInt += 1;
                  continue;
                  paramInt = 0;
                  while (paramInt < i1)
                  {
                    this.f[paramInt] = 0;
                    paramInt += 1;
                  }
                  break;
                }
                this.l = i2;
                this.k = i3;
                paraml.c = i1;
                paraml.d += paramInt - paraml.b;
                paraml.b = paramInt;
                this.q = i5;
                return b(paraml, i4);
              }
            }
            arrayOfInt1 = this.f;
            arrayOfInt2 = a;
            i6 = this.e;
            this.e = (i6 + 1);
            arrayOfInt1[arrayOfInt2[i6]] = (i2 & 0x7);
            i6 = i3 - 3;
            i7 = i2 >>> 3;
            i3 = i1;
            i2 = paramInt;
            paramInt = i6;
            i1 = i7;
          }
          label1875:
          while (this.e < 19)
          {
            arrayOfInt1 = this.f;
            arrayOfInt2 = a;
            i6 = this.e;
            this.e = (i6 + 1);
            arrayOfInt1[arrayOfInt2[i6]] = 0;
          }
          this.g[0] = 7;
          i6 = this.t.a(this.f, this.g, this.h, this.m, paraml);
          if (i6 != 0)
          {
            if (i6 == -3)
            {
              this.f = null;
              this.b = 9;
            }
            this.l = i1;
            this.k = paramInt;
            paraml.c = i3;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            this.q = i5;
            return b(paraml, i6);
          }
          this.e = 0;
          this.b = 5;
          i6 = i3;
          i7 = i2;
          i3 = i1;
          i2 = paramInt;
          i1 = i7;
          paramInt = i6;
          for (;;)
          {
            label2062:
            i6 = this.d;
            if (this.e >= (i6 >> 5 & 0x1F) + ((i6 & 0x1F) + 258))
            {
              this.h[0] = -1;
              arrayOfInt1 = new int[1];
              arrayOfInt2 = new int[1];
              localObject1 = new int[1];
              localObject2 = new int[1];
              arrayOfInt1[0] = 9;
              arrayOfInt2[0] = 6;
              i6 = this.d;
              i6 = this.t.a((i6 & 0x1F) + 257, (i6 >> 5 & 0x1F) + 1, this.f, arrayOfInt1, arrayOfInt2, (int[])localObject1, (int[])localObject2, this.m, paraml);
              if (i6 == 0) {
                break label2902;
              }
              if (i6 == -3)
              {
                this.f = null;
                this.b = 9;
              }
              this.l = i3;
              this.k = i2;
              paraml.c = paramInt;
              paraml.d += i1 - paraml.b;
              paraml.b = i1;
              this.q = i5;
              return b(paraml, i6);
            }
            i7 = this.g[0];
            i6 = paramInt;
            paramInt = i1;
            i1 = i6;
            while (i2 < i7) {
              if (i1 != 0)
              {
                i4 = 0;
                i1 -= 1;
                i3 |= (paraml.a[paramInt] & 0xFF) << i2;
                i2 += 8;
                paramInt += 1;
              }
              else
              {
                this.l = i3;
                this.k = i2;
                paraml.c = i1;
                paraml.d += paramInt - paraml.b;
                paraml.b = paramInt;
                this.q = i5;
                return b(paraml, i4);
              }
            }
            if (this.h[0] == -1) {}
            arrayOfInt1 = this.m;
            i6 = this.h[0];
            i8 = arrayOfInt1[(((u[i7] & i3) + i6) * 3 + 1)];
            i9 = this.m[((this.h[0] + (u[i8] & i3)) * 3 + 2)];
            if (i9 >= 16) {
              break;
            }
            i3 >>>= i8;
            i6 = i2 - i8;
            arrayOfInt1 = this.f;
            i2 = this.e;
            this.e = (i2 + 1);
            arrayOfInt1[i2] = i9;
            i2 = i3;
            i3 = i6;
            i6 = paramInt;
            i7 = i2;
            paramInt = i1;
            i1 = i6;
            i2 = i3;
            i3 = i7;
          }
          if (i9 == 18)
          {
            i6 = 7;
            if (i9 != 18) {
              break label2616;
            }
            i7 = 11;
          }
          for (;;)
          {
            if (i2 < i8 + i6)
            {
              if (i1 != 0)
              {
                i4 = 0;
                i1 -= 1;
                i3 |= (paraml.a[paramInt] & 0xFF) << i2;
                i2 += 8;
                paramInt += 1;
                continue;
                i6 = i9 - 14;
                break;
                label2616:
                i7 = 3;
                continue;
              }
              this.l = i3;
              this.k = i2;
              paraml.c = i1;
              paraml.d += paramInt - paraml.b;
              paraml.b = paramInt;
              this.q = i5;
              return b(paraml, i4);
            }
          }
          i10 = i3 >>> i8;
          i3 = (u[i6] & i10) + i7;
          i7 = i10 >>> i6;
          i8 = i2 - i8 - i6;
          i6 = this.e;
          i2 = this.d;
          if ((i6 + i3 > (i2 >> 5 & 0x1F) + ((i2 & 0x1F) + 258)) || ((i9 == 16) && (i6 < 1)))
          {
            this.f = null;
            this.b = 9;
            paraml.i = "invalid bit length repeat";
            this.l = i7;
            this.k = i8;
            paraml.c = i1;
            paraml.d += paramInt - paraml.b;
            paraml.b = paramInt;
            this.q = i5;
            return b(paraml, -3);
          }
          if (i9 == 16) {}
          for (i2 = this.f[(i6 - 1)];; i2 = 0)
          {
            label2851:
            arrayOfInt1 = this.f;
            i9 = i6 + 1;
            arrayOfInt1[i6] = i2;
            i3 -= 1;
            if (i3 != 0) {
              break label3340;
            }
            this.e = i9;
            i3 = i8;
            i2 = i7;
            break;
          }
          label2902:
          this.i.a(arrayOfInt1[0], arrayOfInt2[0], this.m, localObject1[0], this.m, localObject2[0], paraml);
          this.b = 6;
          label2939:
          this.l = i3;
          this.k = i2;
          paraml.c = paramInt;
          paraml.d += i1 - paraml.b;
          paraml.b = i1;
          this.q = i5;
          paramInt = this.i.a(this, paraml, i4);
          if (paramInt != 1) {
            return b(paraml, paramInt);
          }
          i6 = 0;
          i7 = 0;
          this.i.a(paraml);
          i1 = paraml.b;
          i4 = paraml.c;
          i2 = this.l;
          i3 = this.k;
          i5 = this.q;
          if (i5 < this.p) {}
          for (paramInt = this.p - i5 - 1;; paramInt = this.o - i5)
          {
            if (this.j != 0) {
              break label3108;
            }
            this.b = 0;
            i6 = paramInt;
            paramInt = i4;
            i4 = i7;
            break;
          }
          label3108:
          this.b = 7;
          paramInt = i4;
          label3117:
          this.q = i5;
          i4 = b(paraml, i6);
          i5 = this.q;
          if (i5 < this.p) {}
          for (i6 = this.p; this.p != this.q; i6 = this.o)
          {
            this.l = i2;
            this.k = i3;
            paraml.c = paramInt;
            paraml.d += i1 - paraml.b;
            paraml.b = i1;
            this.q = i5;
            return b(paraml, i4);
          }
          this.b = 8;
        }
        for (;;)
        {
          this.l = i2;
          this.k = i3;
          paraml.c = paramInt;
          paraml.d += i1 - paraml.b;
          paraml.b = i1;
          this.q = i5;
          return b(paraml, 1);
          this.l = i2;
          this.k = i3;
          paraml.c = paramInt;
          paraml.d += i1 - paraml.b;
          paraml.b = i1;
          this.q = i5;
          return b(paraml, -3);
          label3340:
          i6 = i9;
          break label2851;
          i5 = i4;
          break label1230;
          label3354:
          break;
          i6 = i2;
          i2 = i3;
          i3 = i6;
          break label2062;
          i6 = i2;
          i2 = i3;
          i3 = i6;
          break label2939;
          i6 = i4;
          break label3117;
        }
        i7 = i3;
        i8 = i2;
        i2 = paramInt;
        i3 = i1;
        paramInt = i7;
        i1 = i8;
      }
    }
  }
  
  void a(l paraml)
  {
    a(paraml, null);
    this.n = null;
    this.m = null;
  }
  
  void a(l paraml, long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null) {
      paramArrayOfLong[0] = this.s;
    }
    if (((this.b == 4) || (this.b != 5)) || (this.b == 6)) {
      this.i.a(paraml);
    }
    this.b = 0;
    this.k = 0;
    this.l = 0;
    this.q = 0;
    this.p = 0;
    if (this.r != null)
    {
      long l1 = paraml.m.a(0L, null, 0, 0);
      this.s = l1;
      paraml.l = l1;
    }
  }
  
  int b(l paraml, int paramInt)
  {
    int i3 = paraml.f;
    int i4 = this.p;
    int i1;
    int i2;
    if (i4 <= this.q)
    {
      i1 = this.q;
      i1 -= i4;
      i2 = i1;
      if (i1 > paraml.g) {
        i2 = paraml.g;
      }
      i1 = paramInt;
      if (i2 != 0)
      {
        i1 = paramInt;
        if (paramInt == -5) {
          i1 = 0;
        }
      }
      paraml.g -= i2;
      paraml.h += i2;
      long l1;
      if (this.r != null)
      {
        l1 = paraml.m.a(this.s, this.n, i4, i2);
        this.s = l1;
        paraml.l = l1;
      }
      System.arraycopy(this.n, i4, paraml.e, i3, i2);
      i3 += i2;
      paramInt = i4 + i2;
      if (paramInt != this.o) {
        break label344;
      }
      if (this.q == this.o) {
        this.q = 0;
      }
      paramInt = this.q - 0;
      i2 = paramInt;
      if (paramInt > paraml.g) {
        i2 = paraml.g;
      }
      paramInt = i1;
      if (i2 != 0)
      {
        paramInt = i1;
        if (i1 == -5) {
          paramInt = 0;
        }
      }
      paraml.g -= i2;
      paraml.h += i2;
      if (this.r != null)
      {
        l1 = paraml.m.a(this.s, this.n, 0, i2);
        this.s = l1;
        paraml.l = l1;
      }
      System.arraycopy(this.n, 0, paraml.e, i3, i2);
      i3 += i2;
      i4 = 0 + i2;
      i1 = paramInt;
      i2 = i3;
      paramInt = i4;
    }
    for (;;)
    {
      paraml.f = i2;
      this.p = paramInt;
      return i1;
      i1 = this.o;
      break;
      label344:
      i2 = i3;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */