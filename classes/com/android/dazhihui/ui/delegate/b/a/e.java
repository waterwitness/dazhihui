package com.android.dazhihui.ui.delegate.b.a;

final class e
{
  private static final int[] o = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535 };
  int a;
  int b;
  int[] c;
  int d = 0;
  int e;
  int f;
  int g;
  int h;
  byte i;
  byte j;
  int[] k;
  int l;
  int[] m;
  int n;
  
  int a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int[] paramArrayOfInt2, int paramInt4, d paramd, l paraml)
  {
    int i7 = paraml.b;
    int i6 = paraml.c;
    int i3 = paramd.l;
    int i2 = paramd.k;
    int i5 = paramd.q;
    if (i5 < paramd.p) {}
    int i12;
    int i13;
    int i4;
    for (int i1 = paramd.p - i5 - 1;; i1 = paramd.o - i5)
    {
      i12 = o[paramInt1];
      i13 = o[paramInt2];
      i4 = i1;
      paramInt1 = i7;
      paramInt2 = i6;
      i1 = i5;
      while (i2 < 20)
      {
        paramInt2 -= 1;
        i3 |= (paraml.a[paramInt1] & 0xFF) << i2;
        i2 += 8;
        paramInt1 += 1;
      }
    }
    int i9 = i3 & i12;
    int i10 = (paramInt3 + i9) * 3;
    int i11 = paramArrayOfInt1[i10];
    i5 = i10;
    i6 = i2;
    i7 = i3;
    int i8 = i11;
    byte[] arrayOfByte1;
    if (i11 == 0)
    {
      i7 = paramArrayOfInt1[(i10 + 1)];
      i8 = paramArrayOfInt1[(i10 + 1)];
      arrayOfByte1 = paramd.n;
      i6 = i1 + 1;
      arrayOfByte1[i1] = ((byte)paramArrayOfInt1[(i10 + 2)]);
      i5 = i4 - 1;
      i1 = i2 - i8;
      i4 = i3 >> i7;
      i3 = paramInt2;
      i2 = i6;
      paramInt2 = paramInt1;
      paramInt1 = i3;
      i3 = i5;
      label262:
      if ((i3 < 258) || (paramInt1 < 10))
      {
        paramInt4 = paraml.c - paramInt1;
        paramInt3 = paramInt4;
        if (i1 >> 3 < paramInt4) {
          paramInt3 = i1 >> 3;
        }
        paramInt2 -= paramInt3;
        paramd.l = i4;
        paramd.k = (i1 - (paramInt3 << 3));
        paraml.c = (paramInt1 + paramInt3);
        paraml.d += paramInt2 - paraml.b;
        paraml.b = paramInt2;
        paramd.q = i2;
        return 0;
      }
    }
    else
    {
      label371:
      i2 = i7 >> paramArrayOfInt1[(i5 + 1)];
      i3 = i6 - paramArrayOfInt1[(i5 + 1)];
      if ((i8 & 0x10) != 0)
      {
        i6 = i8 & 0xF;
        i8 = paramArrayOfInt1[(i5 + 2)] + (o[i6] & i2);
        i5 = i2 >> i6;
        i6 = i3 - i6;
        i2 = paramInt1;
        i3 = paramInt2;
        paramInt2 = i5;
        paramInt1 = i6;
        while (paramInt1 < 15)
        {
          i3 -= 1;
          paramInt2 |= (paraml.a[i2] & 0xFF) << paramInt1;
          paramInt1 += 8;
          i2 += 1;
        }
        i7 = paramInt2 & i13;
        i9 = (paramInt4 + i7) * 3;
        i6 = paramArrayOfInt2[i9];
        i5 = paramInt1;
        paramInt1 = i9;
        label523:
        paramInt2 >>= paramArrayOfInt2[(paramInt1 + 1)];
        i5 -= paramArrayOfInt2[(paramInt1 + 1)];
        if ((i6 & 0x10) != 0)
        {
          i7 = i6 & 0xF;
          i6 = i5;
          i5 = paramInt2;
          paramInt2 = i6;
          while (paramInt2 < i7)
          {
            i3 -= 1;
            i5 |= (paraml.a[i2] & 0xFF) << paramInt2;
            paramInt2 += 8;
            i2 += 1;
          }
          paramInt1 = paramArrayOfInt2[(paramInt1 + 2)] + (o[i7] & i5);
          i5 >>= i7;
          i6 = paramInt2 - i7;
          i4 -= i8;
          if (i1 >= paramInt1)
          {
            paramInt1 = i1 - paramInt1;
            if ((i1 - paramInt1 > 0) && (2 > i1 - paramInt1))
            {
              arrayOfByte1 = paramd.n;
              paramInt2 = i1 + 1;
              byte[] arrayOfByte2 = paramd.n;
              i7 = paramInt1 + 1;
              arrayOfByte1[i1] = arrayOfByte2[paramInt1];
              arrayOfByte1 = paramd.n;
              i1 = paramInt2 + 1;
              arrayOfByte2 = paramd.n;
              paramInt1 = i7 + 1;
              arrayOfByte1[paramInt2] = arrayOfByte2[i7];
              paramInt2 = i8 - 2;
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((i1 - paramInt1 > 0) && (paramInt2 > i1 - paramInt1))
      {
        label762:
        arrayOfByte1 = paramd.n;
        i7 = i1 + 1;
        arrayOfByte1[i1] = paramd.n[paramInt1];
        paramInt2 -= 1;
        if (paramInt2 != 0) {
          break label1593;
        }
        paramInt1 = i4;
        paramInt2 = i3;
        i1 = i6;
        i4 = i5;
        i3 = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i2;
        i2 = i7;
        break label262;
        System.arraycopy(paramd.n, paramInt1, paramd.n, i1, 2);
        i1 += 2;
        paramInt1 += 2;
        paramInt2 = i8 - 2;
        continue;
        paramInt2 = i1 - paramInt1;
        do
        {
          paramInt1 = paramInt2 + paramd.o;
          paramInt2 = paramInt1;
        } while (paramInt1 < 0);
        i9 = paramd.o - paramInt1;
        if (i8 <= i9) {
          break label1614;
        }
        if ((i1 - paramInt1 > 0) && (i9 > i1 - paramInt1))
        {
          paramInt2 = i1;
          i1 = i9;
        }
      }
      for (;;)
      {
        arrayOfByte1 = paramd.n;
        i7 = paramInt2 + 1;
        arrayOfByte1[paramInt2] = paramd.n[paramInt1];
        i1 -= 1;
        if (i1 == 0)
        {
          for (paramInt1 = i7;; paramInt1 = i1 + i9)
          {
            paramInt2 = 0;
            i7 = i8 - i9;
            i1 = paramInt1;
            paramInt1 = paramInt2;
            paramInt2 = i7;
            break;
            System.arraycopy(paramd.n, paramInt1, paramd.n, i1, i9);
          }
          System.arraycopy(paramd.n, paramInt1, paramd.n, i1, paramInt2);
          i7 = i1 + paramInt2;
          paramInt1 = i4;
          paramInt2 = i3;
          i1 = i6;
          i4 = i5;
          i3 = paramInt1;
          paramInt1 = paramInt2;
          paramInt2 = i2;
          i2 = i7;
          break label262;
          if ((i6 & 0x40) == 0)
          {
            i7 = paramArrayOfInt2[(paramInt1 + 2)] + i7 + (o[i6] & paramInt2);
            paramInt1 = (paramInt4 + i7) * 3;
            i6 = paramArrayOfInt2[paramInt1];
            break label523;
          }
          paraml.i = "invalid distance code";
          paramInt3 = paraml.c - i3;
          paramInt1 = paramInt3;
          if (i5 >> 3 < paramInt3) {
            paramInt1 = i5 >> 3;
          }
          paramInt3 = i2 - paramInt1;
          paramd.l = paramInt2;
          paramd.k = (i5 - (paramInt1 << 3));
          paraml.c = (i3 + paramInt1);
          paraml.d += paramInt3 - paraml.b;
          paraml.b = paramInt3;
          paramd.q = i1;
          return -3;
          if ((i8 & 0x40) == 0)
          {
            i9 = paramArrayOfInt1[(i5 + 2)] + i9 + (o[i8] & i2);
            i10 = (paramInt3 + i9) * 3;
            i11 = paramArrayOfInt1[i10];
            i5 = i10;
            i6 = i3;
            i7 = i2;
            i8 = i11;
            if (i11 != 0) {
              break label371;
            }
            i6 = paramArrayOfInt1[(i10 + 1)];
            i8 = paramArrayOfInt1[(i10 + 1)];
            arrayOfByte1 = paramd.n;
            i5 = i1 + 1;
            arrayOfByte1[i1] = ((byte)paramArrayOfInt1[(i10 + 2)]);
            i7 = i4 - 1;
            i4 = i3 - i8;
            i6 = i2 >> i6;
            i1 = paramInt1;
            i3 = i7;
            paramInt1 = paramInt2;
            paramInt2 = i1;
            i1 = i4;
            i2 = i5;
            i4 = i6;
            break label262;
          }
          if ((i8 & 0x20) != 0)
          {
            paramInt4 = paraml.c - paramInt2;
            paramInt3 = paramInt4;
            if (i3 >> 3 < paramInt4) {
              paramInt3 = i3 >> 3;
            }
            paramInt1 -= paramInt3;
            paramd.l = i2;
            paramd.k = (i3 - (paramInt3 << 3));
            paraml.c = (paramInt2 + paramInt3);
            paraml.d += paramInt1 - paraml.b;
            paraml.b = paramInt1;
            paramd.q = i1;
            return 1;
          }
          paraml.i = "invalid literal/length code";
          paramInt4 = paraml.c - paramInt2;
          paramInt3 = paramInt4;
          if (i3 >> 3 < paramInt4) {
            paramInt3 = i3 >> 3;
          }
          paramInt1 -= paramInt3;
          paramd.l = i2;
          paramd.k = (i3 - (paramInt3 << 3));
          paraml.c = (paramInt2 + paramInt3);
          paraml.d += paramInt1 - paraml.b;
          paraml.b = paramInt1;
          paramd.q = i1;
          return -3;
          i5 = i3;
          i6 = paramInt2;
          i3 = i4;
          paramInt2 = i2;
          i2 = i1;
          i1 = paramInt2;
          paramInt2 = paramInt1;
          paramInt1 = i6;
          i4 = i5;
          break;
          label1593:
          i1 = i7;
          paramInt1 += 1;
          break label762;
        }
        paramInt2 = i7;
        paramInt1 += 1;
      }
      label1614:
      paramInt2 = i8;
    }
  }
  
  int a(d paramd, l paraml, int paramInt)
  {
    int i2 = paraml.b;
    int i1 = paraml.c;
    int i4 = paramd.l;
    int i3 = paramd.k;
    int i5 = paramd.q;
    int i6;
    if (i5 < paramd.p) {
      i6 = paramd.p - i5 - 1;
    }
    int i9;
    int i10;
    int i8;
    int i27;
    int i26;
    int i25;
    int i24;
    for (;;)
    {
      int i23 = i6;
      int i22 = i5;
      i9 = i1;
      i10 = i2;
      int i16 = i3;
      i8 = i4;
      int i11 = paramInt;
      int i13 = i1;
      int i14 = i2;
      int i17 = i3;
      int i12 = i4;
      int i15 = paramInt;
      i21 = i1;
      i20 = i2;
      i19 = i3;
      i18 = i4;
      i7 = paramInt;
      i27 = i5;
      i26 = i1;
      i25 = i2;
      i24 = i3;
      switch (this.a)
      {
      default: 
        paramd.l = i4;
        paramd.k = i3;
        paraml.c = i1;
        paraml.d += i2 - paraml.b;
        paraml.b = i2;
        paramd.q = i5;
        return paramd.b(paraml, -2);
        i6 = paramd.o - i5;
        break;
      case 0: 
        i7 = i6;
        i12 = i5;
        i9 = i1;
        i10 = i2;
        i16 = i3;
        i8 = i4;
        i11 = paramInt;
        if (i6 >= 258)
        {
          i7 = i6;
          i12 = i5;
          i9 = i1;
          i10 = i2;
          i16 = i3;
          i8 = i4;
          i11 = paramInt;
          if (i1 >= 10)
          {
            paramd.l = i4;
            paramd.k = i3;
            paraml.c = i1;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            paramd.q = i5;
            paramInt = a(this.i, this.j, this.k, this.l, this.m, this.n, paramd, paraml);
            i2 = paraml.b;
            i1 = paraml.c;
            i4 = paramd.l;
            i3 = paramd.k;
            i5 = paramd.q;
            if (i5 < paramd.p)
            {
              i6 = paramd.p - i5 - 1;
              i7 = i6;
              i12 = i5;
              i9 = i1;
              i10 = i2;
              i16 = i3;
              i8 = i4;
              i11 = paramInt;
              if (paramInt == 0) {
                break label520;
              }
              if (paramInt != 1) {
                break label513;
              }
            }
            for (i7 = 7;; i7 = 9)
            {
              this.a = i7;
              break;
              i6 = paramd.o - i5;
              break label452;
            }
          }
        }
        this.e = this.i;
        this.c = this.k;
        this.d = this.l;
        this.a = 1;
        i22 = i12;
        i23 = i7;
      case 1: 
        i4 = this.e;
        i3 = i16;
        paramInt = i11;
        i2 = i10;
        i1 = i9;
        while (i3 < i4) {
          if (i1 != 0)
          {
            paramInt = 0;
            i1 -= 1;
            i8 |= (paraml.a[i2] & 0xFF) << i3;
            i3 += 8;
            i2 += 1;
          }
          else
          {
            paramd.l = i8;
            paramd.k = i3;
            paraml.c = i1;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            paramd.q = i22;
            return paramd.b(paraml, paramInt);
          }
        }
        i5 = (this.d + (o[i4] & i8)) * 3;
        i4 = i8 >>> this.c[(i5 + 1)];
        i3 -= this.c[(i5 + 1)];
        i6 = this.c[i5];
        if (i6 == 0)
        {
          this.f = this.c[(i5 + 2)];
          this.a = 6;
          i6 = i23;
          i5 = i22;
        }
        else if ((i6 & 0x10) != 0)
        {
          this.g = (i6 & 0xF);
          this.b = this.c[(i5 + 2)];
          this.a = 2;
          i6 = i23;
          i5 = i22;
        }
        else if ((i6 & 0x40) == 0)
        {
          this.e = i6;
          this.d = (i5 / 3 + this.c[(i5 + 2)]);
          i6 = i23;
          i5 = i22;
        }
        else if ((i6 & 0x20) != 0)
        {
          this.a = 7;
          i6 = i23;
          i5 = i22;
        }
        else
        {
          this.a = 9;
          paraml.i = "invalid literal/length code";
          paramd.l = i4;
          paramd.k = i3;
          paraml.c = i1;
          paraml.d += i2 - paraml.b;
          paraml.b = i2;
          paramd.q = i22;
          return paramd.b(paraml, -3);
        }
        break;
      case 2: 
        i7 = this.g;
        while (i3 < i7) {
          if (i1 != 0)
          {
            paramInt = 0;
            i1 -= 1;
            i4 |= (paraml.a[i2] & 0xFF) << i3;
            i3 += 8;
            i2 += 1;
          }
          else
          {
            paramd.l = i4;
            paramd.k = i3;
            paraml.c = i1;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            paramd.q = i5;
            return paramd.b(paraml, paramInt);
          }
        }
        this.b += (o[i7] & i4);
        i12 = i4 >> i7;
        i17 = i3 - i7;
        this.e = this.j;
        this.c = this.m;
        this.d = this.n;
        this.a = 3;
        i15 = paramInt;
        i14 = i2;
        i13 = i1;
      case 3: 
        label452:
        label513:
        label520:
        i4 = this.e;
        i3 = i17;
        paramInt = i15;
        i2 = i14;
        i1 = i13;
        while (i3 < i4) {
          if (i1 != 0)
          {
            paramInt = 0;
            i1 -= 1;
            i12 |= (paraml.a[i2] & 0xFF) << i3;
            i3 += 8;
            i2 += 1;
          }
          else
          {
            paramd.l = i12;
            paramd.k = i3;
            paraml.c = i1;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            paramd.q = i5;
            return paramd.b(paraml, paramInt);
          }
        }
        i7 = (this.d + (o[i4] & i12)) * 3;
        i4 = i12 >> this.c[(i7 + 1)];
        i3 -= this.c[(i7 + 1)];
        i8 = this.c[i7];
        if ((i8 & 0x10) != 0)
        {
          this.g = (i8 & 0xF);
          this.h = this.c[(i7 + 2)];
          this.a = 4;
        }
        else
        {
          if ((i8 & 0x40) != 0) {
            break label1403;
          }
          this.e = i8;
          this.d = (i7 / 3 + this.c[(i7 + 2)]);
        }
        break;
      }
    }
    label1403:
    this.a = 9;
    paraml.i = "invalid distance code";
    paramd.l = i4;
    paramd.k = i3;
    paraml.c = i1;
    paraml.d += i2 - paraml.b;
    paraml.b = i2;
    paramd.q = i5;
    return paramd.b(paraml, -3);
    int i7 = this.g;
    while (i3 < i7) {
      if (i1 != 0)
      {
        paramInt = 0;
        i1 -= 1;
        i4 |= (paraml.a[i2] & 0xFF) << i3;
        i3 += 8;
        i2 += 1;
      }
      else
      {
        paramd.l = i4;
        paramd.k = i3;
        paraml.c = i1;
        paraml.d += i2 - paraml.b;
        paraml.b = i2;
        paramd.q = i5;
        return paramd.b(paraml, paramInt);
      }
    }
    this.h += (o[i7] & i4);
    int i18 = i4 >> i7;
    int i19 = i3 - i7;
    this.a = 5;
    i7 = paramInt;
    int i20 = i2;
    int i21 = i1;
    i2 = i5 - this.h;
    for (;;)
    {
      i1 = i6;
      paramInt = i5;
      i9 = i2;
      i8 = i7;
      if (i2 >= 0) {
        break;
      }
      i2 += paramd.o;
    }
    label1674:
    byte[] arrayOfByte1 = paramd.n;
    byte[] arrayOfByte2 = paramd.n;
    paramInt = i9 + 1;
    arrayOfByte1[i3] = arrayOfByte2[i9];
    if (paramInt == paramd.o) {
      paramInt = 0;
    }
    for (;;)
    {
      this.b -= 1;
      i1 = i4 - 1;
      i2 = i3 + 1;
      i8 = i6;
      i9 = paramInt;
      paramInt = i2;
      if (this.b != 0)
      {
        i4 = i1;
        i3 = paramInt;
        i6 = i8;
        if (i1 != 0) {
          break label1674;
        }
        i2 = i1;
        i5 = paramInt;
        if (paramInt == paramd.o)
        {
          i2 = i1;
          i5 = paramInt;
          if (paramd.p != 0)
          {
            i5 = 0;
            if (paramd.p >= 0) {
              break label1992;
            }
            i2 = paramd.p - 0 - 1;
          }
        }
        label1815:
        i4 = i2;
        i3 = i5;
        i6 = i8;
        if (i2 != 0) {
          break label1674;
        }
        paramd.q = i5;
        i5 = paramd.b(paraml, i8);
        i3 = paramd.q;
        if (i3 < paramd.p)
        {
          i2 = paramd.p - i3 - 1;
          label1873:
          paramInt = i2;
          i1 = i3;
          if (i3 == paramd.o)
          {
            paramInt = i2;
            i1 = i3;
            if (paramd.p != 0)
            {
              i1 = 0;
              if (paramd.p >= 0) {
                break label2015;
              }
            }
          }
        }
        label1992:
        label2015:
        for (paramInt = paramd.p - 0 - 1;; paramInt = paramd.o - 0)
        {
          i4 = paramInt;
          i3 = i1;
          i6 = i5;
          if (paramInt != 0) {
            break;
          }
          paramd.l = i18;
          paramd.k = i19;
          paraml.c = i21;
          paraml.d += i20 - paraml.b;
          paraml.b = i20;
          paramd.q = i1;
          return paramd.b(paraml, i5);
          i2 = paramd.o - 0;
          break label1815;
          i2 = paramd.o - i3;
          break label1873;
        }
      }
      this.a = 0;
      i6 = i1;
      i5 = paramInt;
      i1 = i21;
      i2 = i20;
      i3 = i19;
      i4 = i18;
      paramInt = i8;
      break;
      i8 = i6;
      i9 = i5;
      if (i6 == 0)
      {
        i7 = i6;
        i10 = i5;
        if (i5 == paramd.o)
        {
          i7 = i6;
          i10 = i5;
          if (paramd.p != 0)
          {
            i10 = 0;
            if (paramd.p >= 0) {
              break label2292;
            }
            i7 = paramd.p - 0 - 1;
          }
        }
        i8 = i7;
        i9 = i10;
        if (i7 == 0)
        {
          paramd.q = i10;
          i10 = paramd.b(paraml, paramInt);
          i7 = paramd.q;
          if (i7 < paramd.p)
          {
            i6 = paramd.p - i7 - 1;
            label2177:
            paramInt = i6;
            i5 = i7;
            if (i7 == paramd.o)
            {
              paramInt = i6;
              i5 = i7;
              if (paramd.p != 0)
              {
                i5 = 0;
                if (paramd.p >= 0) {
                  break label2315;
                }
              }
            }
          }
          label2292:
          label2315:
          for (paramInt = paramd.p - 0 - 1;; paramInt = paramd.o - 0)
          {
            i8 = paramInt;
            i9 = i5;
            if (paramInt != 0) {
              break label2325;
            }
            paramd.l = i4;
            paramd.k = i3;
            paraml.c = i1;
            paraml.d += i2 - paraml.b;
            paraml.b = i2;
            paramd.q = i5;
            return paramd.b(paraml, i10);
            i7 = paramd.o - 0;
            break;
            i6 = paramd.o - i7;
            break label2177;
          }
        }
      }
      label2325:
      paramInt = 0;
      arrayOfByte1 = paramd.n;
      i5 = i9 + 1;
      arrayOfByte1[i9] = ((byte)this.f);
      i6 = i8 - 1;
      this.a = 0;
      break;
      i6 = i1;
      i7 = i2;
      i8 = i3;
      if (i3 > 7)
      {
        i8 = i3 - 8;
        i6 = i1 + 1;
        i7 = i2 - 1;
      }
      paramd.q = i5;
      paramInt = paramd.b(paraml, paramInt);
      i27 = paramd.q;
      if (i27 < paramd.p) {}
      for (i1 = paramd.p; paramd.p != paramd.q; i1 = paramd.o)
      {
        paramd.l = i4;
        paramd.k = i8;
        paraml.c = i6;
        paraml.d += i7 - paraml.b;
        paraml.b = i7;
        paramd.q = i27;
        return paramd.b(paraml, paramInt);
      }
      this.a = 8;
      i24 = i8;
      i25 = i7;
      i26 = i6;
      paramd.l = i4;
      paramd.k = i24;
      paraml.c = i26;
      paraml.d += i25 - paraml.b;
      paraml.b = i25;
      paramd.q = i27;
      return paramd.b(paraml, 1);
      paramd.l = i4;
      paramd.k = i3;
      paraml.c = i1;
      paraml.d += i2 - paraml.b;
      paraml.b = i2;
      paramd.q = i5;
      return paramd.b(paraml, -3);
    }
  }
  
  void a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int[] paramArrayOfInt2, int paramInt4, l paraml)
  {
    this.a = 0;
    this.i = ((byte)paramInt1);
    this.j = ((byte)paramInt2);
    this.k = paramArrayOfInt1;
    this.l = paramInt3;
    this.m = paramArrayOfInt2;
    this.n = paramInt4;
    this.c = null;
  }
  
  void a(l paraml) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */