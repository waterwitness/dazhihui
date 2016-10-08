package com.android.dazhihui.ui.delegate.b.a;

public final class b
{
  private static final c[] ad = new c[10];
  private static final String[] ae = { "need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", "" };
  int A;
  int B;
  int C;
  int D;
  int E;
  int F;
  int G;
  int H;
  short[] I;
  short[] J;
  short[] K;
  i L;
  i M;
  i N;
  short[] O;
  int[] P;
  int Q;
  int R;
  byte[] S;
  int T;
  int U;
  int V;
  int W;
  int X;
  int Y;
  int Z;
  l a;
  int aa;
  short ab;
  int ac;
  int b;
  byte[] c;
  int d;
  int e;
  int f;
  int g;
  byte h;
  int i;
  int j;
  int k;
  int l;
  byte[] m;
  int n;
  short[] o;
  short[] p;
  int q;
  int r;
  int s;
  int t;
  int u;
  int v;
  int w;
  int x;
  int y;
  int z;
  
  static
  {
    ad[0] = new c(0, 0, 0, 0, 0);
    ad[1] = new c(4, 4, 8, 4, 1);
    ad[2] = new c(4, 5, 16, 8, 1);
    ad[3] = new c(4, 6, 32, 32, 1);
    ad[4] = new c(4, 4, 16, 16, 2);
    ad[5] = new c(8, 16, 32, 32, 2);
    ad[6] = new c(8, 16, 128, 128, 2);
    ad[7] = new c(8, 32, 128, 256, 2);
    ad[8] = new c(32, 128, 258, 1024, 2);
    ad[9] = new c(32, 258, 258, 4096, 2);
  }
  
  static boolean a(short[] paramArrayOfShort, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i1 = paramArrayOfShort[(paramInt1 * 2)];
    int i2 = paramArrayOfShort[(paramInt2 * 2)];
    return (i1 < i2) || ((i1 == i2) && (paramArrayOfByte[paramInt1] <= paramArrayOfByte[paramInt2]));
  }
  
  int a(l paraml, int paramInt)
  {
    int i2 = 0;
    int i1;
    if ((paramInt > 4) || (paramInt < 0)) {
      i1 = -2;
    }
    label468:
    do
    {
      do
      {
        return i1;
        if ((paraml.e == null) || ((paraml.a == null) && (paraml.c != 0)) || ((this.b == 666) && (paramInt != 4)))
        {
          paraml.i = ae[4];
          return -2;
        }
        if (paraml.g == 0)
        {
          paraml.i = ae[7];
          return -5;
        }
        this.a = paraml;
        int i4 = this.i;
        this.i = paramInt;
        if (this.b == 42)
        {
          int i5 = this.k;
          int i3 = (this.E - 1 & 0xFF) >> 1;
          i1 = i3;
          if (i3 > 3) {
            i1 = 3;
          }
          i3 = i1 << 6 | (i5 - 8 << 4) + 8 << 8;
          i1 = i3;
          if (this.y != 0) {
            i1 = i3 | 0x20;
          }
          this.b = 113;
          b(i1 + (31 - i1 % 31));
          if (this.y != 0)
          {
            b((int)(paraml.l >>> 16));
            b((int)(paraml.l & 0xFFFF));
          }
          paraml.l = paraml.m.a(0L, null, 0, 0);
        }
        if (this.f != 0)
        {
          paraml.a();
          if (paraml.g == 0)
          {
            this.i = -1;
            return 0;
          }
        }
        else if ((paraml.c == 0) && (paramInt <= i4) && (paramInt != 4))
        {
          paraml.i = ae[7];
          return -5;
        }
        if ((this.b == 666) && (paraml.c != 0))
        {
          paraml.i = ae[7];
          return -5;
        }
        if ((paraml.c != 0) || (this.A != 0) || ((paramInt != 0) && (this.b != 666)))
        {
          switch (ad[this.E].e)
          {
          default: 
            i1 = -1;
          }
          for (;;)
          {
            if ((i1 == 2) || (i1 == 3)) {
              this.b = 666;
            }
            if ((i1 != 0) && (i1 != 2)) {
              break label468;
            }
            i1 = i2;
            if (paraml.g != 0) {
              break;
            }
            this.i = -1;
            return 0;
            i1 = c(paramInt);
            continue;
            i1 = d(paramInt);
            continue;
            i1 = e(paramInt);
          }
          if (i1 == 1)
          {
            if (paramInt == 1) {
              c();
            }
            for (;;)
            {
              paraml.a();
              if (paraml.g != 0) {
                break;
              }
              this.i = -1;
              return 0;
              b(0, 0, false);
              if (paramInt == 3)
              {
                i1 = 0;
                while (i1 < this.r)
                {
                  this.p[i1] = 0;
                  i1 += 1;
                }
              }
            }
          }
        }
        i1 = i2;
      } while (paramInt != 4);
      if (this.g != 0) {
        return 1;
      }
      b((int)(paraml.l >>> 16));
      b((int)(paraml.l & 0xFFFF));
      paraml.a();
      this.g = -1;
      i1 = i2;
    } while (this.f != 0);
    return 1;
  }
  
  void a()
  {
    int i1 = 0;
    while (i1 < 286)
    {
      this.I[(i1 * 2)] = 0;
      i1 += 1;
    }
    i1 = 0;
    while (i1 < 30)
    {
      this.J[(i1 * 2)] = 0;
      i1 += 1;
    }
    i1 = 0;
    while (i1 < 19)
    {
      this.K[(i1 * 2)] = 0;
      i1 += 1;
    }
    this.I['Ȁ'] = 1;
    this.Y = 0;
    this.X = 0;
    this.Z = 0;
    this.V = 0;
  }
  
  final void a(byte paramByte)
  {
    byte[] arrayOfByte = this.c;
    int i1 = this.f;
    this.f = (i1 + 1);
    arrayOfByte[i1] = paramByte;
  }
  
  final void a(int paramInt)
  {
    a((byte)paramInt);
    a((byte)(paramInt >>> 8));
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (this.ac > 16 - paramInt2)
    {
      this.ab = ((short)(this.ab | paramInt1 << this.ac & 0xFFFF));
      a(this.ab);
      this.ab = ((short)(paramInt1 >>> 16 - this.ac));
      this.ac += paramInt2 - 16;
      return;
    }
    this.ab = ((short)(this.ab | paramInt1 << this.ac & 0xFFFF));
    this.ac += paramInt2;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1 - 257, 5);
    a(paramInt2 - 1, 5);
    a(paramInt3 - 4, 4);
    int i1 = 0;
    while (i1 < paramInt3)
    {
      a(this.K[(i.d[i1] * 2 + 1)], 3);
      i1 += 1;
    }
    c(this.I, paramInt1 - 1);
    c(this.J, paramInt2 - 1);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    f();
    this.aa = 8;
    if (paramBoolean)
    {
      a((short)paramInt2);
      a((short)(paramInt2 ^ 0xFFFFFFFF));
    }
    a(this.m, paramInt1, paramInt2);
  }
  
  final void a(int paramInt, short[] paramArrayOfShort)
  {
    paramInt *= 2;
    a(paramArrayOfShort[paramInt] & 0xFFFF, paramArrayOfShort[(paramInt + 1)] & 0xFFFF);
  }
  
  void a(boolean paramBoolean)
  {
    if (this.u >= 0) {}
    for (int i1 = this.u;; i1 = -1)
    {
      c(i1, this.y - this.u, paramBoolean);
      this.u = this.y;
      this.a.a();
      return;
    }
  }
  
  final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(paramArrayOfByte, paramInt1, this.c, this.f, paramInt2);
    this.f += paramInt2;
  }
  
  void a(short[] paramArrayOfShort, int paramInt)
  {
    int i3 = this.P[paramInt];
    int i2 = paramInt << 1;
    int i1 = paramInt;
    paramInt = i2;
    if (paramInt <= this.Q)
    {
      if ((paramInt >= this.Q) || (!a(paramArrayOfShort, this.P[(paramInt + 1)], this.P[paramInt], this.S))) {
        break label116;
      }
      paramInt += 1;
    }
    label116:
    for (;;)
    {
      if (a(paramArrayOfShort, i3, this.P[paramInt], this.S))
      {
        this.P[i1] = i3;
        return;
      }
      this.P[i1] = this.P[paramInt];
      i2 = paramInt << 1;
      i1 = paramInt;
      paramInt = i2;
      break;
    }
  }
  
  void a(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int i1 = 0;
    int i3;
    int i4;
    int i2;
    if (this.V != 0)
    {
      i3 = this.c[(this.W + i1 * 2)] << 8 & 0xFF00 | this.c[(this.W + i1 * 2 + 1)] & 0xFF;
      i4 = this.c[(this.T + i1)] & 0xFF;
      i2 = i1 + 1;
      if (i3 != 0) {
        break label114;
      }
      a(i4, paramArrayOfShort1);
    }
    for (;;)
    {
      i1 = i2;
      if (i2 < this.V) {
        break;
      }
      a(256, paramArrayOfShort1);
      this.aa = paramArrayOfShort1['ȁ'];
      return;
      label114:
      i1 = i.f[i4];
      a(i1 + 256 + 1, paramArrayOfShort1);
      int i5 = i.a[i1];
      if (i5 != 0) {
        a(i4 - i.g[i1], i5);
      }
      i1 = i3 - 1;
      i3 = i.a(i1);
      a(i3, paramArrayOfShort2);
      i4 = i.b[i3];
      if (i4 != 0) {
        a(i1 - i.h[i3], i4);
      }
    }
  }
  
  int b()
  {
    b(this.I, this.L.j);
    b(this.J, this.M.j);
    this.N.b(this);
    int i1 = 18;
    for (;;)
    {
      if ((i1 < 3) || (this.K[(i.d[i1] * 2 + 1)] != 0))
      {
        this.X += (i1 + 1) * 3 + 5 + 5 + 4;
        return i1;
      }
      i1 -= 1;
    }
  }
  
  final void b(int paramInt)
  {
    a((byte)(paramInt >> 8));
    a((byte)paramInt);
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      a(i1 + 0, 3);
      a(paramInt1, paramInt2, true);
      return;
    }
  }
  
  void b(short[] paramArrayOfShort, int paramInt)
  {
    int i4 = -1;
    int i1 = paramArrayOfShort[1];
    int i3;
    int i2;
    if (i1 == 0)
    {
      i3 = 138;
      i2 = 3;
    }
    for (;;)
    {
      paramArrayOfShort[((paramInt + 1) * 2 + 1)] = -1;
      int i6 = 0;
      int i5 = 0;
      if (i5 <= paramInt)
      {
        int i7 = paramArrayOfShort[((i5 + 1) * 2 + 1)];
        i6 += 1;
        if ((i6 < i3) && (i1 == i7)) {
          i1 = i6;
        }
        for (;;)
        {
          int i8 = i5 + 1;
          i5 = i7;
          i6 = i1;
          i1 = i5;
          i5 = i8;
          break;
          short[] arrayOfShort;
          if (i6 < i2)
          {
            arrayOfShort = this.K;
            i2 = i1 * 2;
            arrayOfShort[i2] = ((short)(i6 + arrayOfShort[i2]));
          }
          for (;;)
          {
            if (i7 != 0) {
              break label259;
            }
            i3 = 138;
            i6 = 0;
            i4 = i1;
            i2 = 3;
            i1 = i6;
            break;
            if (i1 != 0)
            {
              if (i1 != i4)
              {
                arrayOfShort = this.K;
                i2 = i1 * 2;
                arrayOfShort[i2] = ((short)(arrayOfShort[i2] + 1));
              }
              arrayOfShort = this.K;
              arrayOfShort[32] = ((short)(arrayOfShort[32] + 1));
            }
            else if (i6 <= 10)
            {
              arrayOfShort = this.K;
              arrayOfShort[34] = ((short)(arrayOfShort[34] + 1));
            }
            else
            {
              arrayOfShort = this.K;
              arrayOfShort[36] = ((short)(arrayOfShort[36] + 1));
            }
          }
          label259:
          if (i1 == i7)
          {
            i3 = 6;
            i6 = 0;
            i4 = i1;
            i2 = 3;
            i1 = i6;
          }
          else
          {
            i2 = 4;
            i3 = 7;
            i6 = 0;
            i4 = i1;
            i1 = i6;
          }
        }
      }
      return;
      i2 = 4;
      i3 = 7;
    }
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    this.c[(this.W + this.V * 2)] = ((byte)(paramInt1 >>> 8));
    this.c[(this.W + this.V * 2 + 1)] = ((byte)paramInt1);
    this.c[(this.T + this.V)] = ((byte)paramInt2);
    this.V += 1;
    short[] arrayOfShort;
    if (paramInt1 == 0)
    {
      arrayOfShort = this.I;
      paramInt1 = paramInt2 * 2;
      arrayOfShort[paramInt1] = ((short)(arrayOfShort[paramInt1] + 1));
    }
    while (((this.V & 0x1FFF) == 0) && (this.E > 2))
    {
      paramInt2 = this.V * 8;
      int i1 = this.y;
      int i2 = this.u;
      paramInt1 = 0;
      for (;;)
      {
        if (paramInt1 < 30)
        {
          paramInt2 = (int)(paramInt2 + this.J[(paramInt1 * 2)] * (5L + i.b[paramInt1]));
          paramInt1 += 1;
          continue;
          this.Z += 1;
          arrayOfShort = this.I;
          paramInt2 = (i.f[paramInt2] + 256 + 1) * 2;
          arrayOfShort[paramInt2] = ((short)(arrayOfShort[paramInt2] + 1));
          arrayOfShort = this.J;
          paramInt1 = i.a(paramInt1 - 1) * 2;
          arrayOfShort[paramInt1] = ((short)(arrayOfShort[paramInt1] + 1));
          break;
        }
      }
      if ((this.Z < this.V / 2) && (paramInt2 >>> 3 < (i1 - i2) / 2)) {
        return true;
      }
    }
    return this.V == this.U - 1;
  }
  
  int c(int paramInt)
  {
    int i2 = 1;
    int i1 = 65535;
    if (65535 > this.d - 5) {
      i1 = this.d - 5;
    }
    if (this.A <= 1)
    {
      g();
      if ((this.A == 0) && (paramInt == 0)) {
        label46:
        return 0;
      }
      if (this.A == 0) {
        if (paramInt != 4) {
          break label197;
        }
      }
    }
    label197:
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      if (this.a.g != 0) {
        break label203;
      }
      if (paramInt != 4) {
        break label46;
      }
      return 2;
      this.y += this.A;
      this.A = 0;
      int i3 = this.u + i1;
      if ((this.y == 0) || (this.y >= i3))
      {
        this.A = (this.y - i3);
        this.y = i3;
        a(false);
        if (this.a.g == 0) {
          break label46;
        }
      }
      if (this.y - this.u < this.j - 262) {
        break;
      }
      a(false);
      if (this.a.g != 0) {
        break;
      }
      return 0;
    }
    label203:
    i1 = i2;
    if (paramInt == 4) {
      i1 = 3;
    }
    return i1;
  }
  
  void c()
  {
    a(2, 3);
    a(256, h.a);
    e();
    if (this.aa + 1 + 10 - this.ac < 9)
    {
      a(2, 3);
      a(256, h.a);
      e();
    }
    this.aa = 7;
  }
  
  void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i6 = 1;
    int i5 = 1;
    int i7;
    int i4;
    int i1;
    if (this.E > 0)
    {
      if (this.h == 2) {
        d();
      }
      this.L.b(this);
      this.M.b(this);
      i7 = b();
      int i8 = this.X + 3 + 7 >>> 3;
      int i3 = this.Y + 3 + 7 >>> 3;
      i2 = i7;
      i4 = i3;
      i1 = i8;
      if (i3 <= i8)
      {
        i1 = i3;
        i4 = i3;
      }
    }
    for (int i2 = i7; (paramInt2 + 4 <= i1) && (paramInt1 != -1); i2 = 0)
    {
      b(paramInt1, paramInt2, paramBoolean);
      a();
      if (paramBoolean) {
        f();
      }
      return;
      i1 = paramInt2 + 5;
      i4 = i1;
    }
    if (i4 == i1)
    {
      if (paramBoolean) {}
      for (paramInt1 = i5;; paramInt1 = 0)
      {
        a(paramInt1 + 2, 3);
        a(h.a, h.b);
        break;
      }
    }
    if (paramBoolean) {}
    for (paramInt1 = i6;; paramInt1 = 0)
    {
      a(paramInt1 + 4, 3);
      a(this.L.j + 1, this.M.j + 1, i2 + 1);
      a(this.I, this.J);
      break;
    }
  }
  
  void c(short[] paramArrayOfShort, int paramInt)
  {
    int i6 = -1;
    int i3 = paramArrayOfShort[1];
    int i1;
    if (i3 == 0) {
      i1 = 3;
    }
    for (int i2 = 138;; i2 = 7)
    {
      int i5 = 0;
      int i4 = i1;
      int i7 = 0;
      i1 = i3;
      i3 = i2;
      i2 = i4;
      if (i5 <= paramInt)
      {
        int i8 = paramArrayOfShort[((i5 + 1) * 2 + 1)];
        i4 = i7 + 1;
        if ((i4 < i3) && (i1 == i8))
        {
          i1 = i3;
          i3 = i4;
          i7 = i2;
          i4 = i6;
          i2 = i1;
          i1 = i7;
        }
        for (;;)
        {
          int i9 = i5 + 1;
          i5 = i8;
          i6 = i2;
          i7 = i3;
          i2 = i1;
          i3 = i6;
          i6 = i4;
          i1 = i5;
          i5 = i9;
          break;
          if (i4 < i2) {
            do
            {
              a(i1, this.K);
              i2 = i4 - 1;
              i4 = i2;
            } while (i2 != 0);
          }
          for (;;)
          {
            if (i8 != 0) {
              break label297;
            }
            i6 = 3;
            i2 = 138;
            i3 = 0;
            i4 = i1;
            i1 = i6;
            break;
            if (i1 != 0)
            {
              i2 = i4;
              if (i1 != i6)
              {
                a(i1, this.K);
                i2 = i4 - 1;
              }
              a(16, this.K);
              a(i2 - 3, 2);
            }
            else if (i4 <= 10)
            {
              a(17, this.K);
              a(i4 - 3, 3);
            }
            else
            {
              a(18, this.K);
              a(i4 - 11, 7);
            }
          }
          label297:
          if (i1 == i8)
          {
            i2 = 6;
            i3 = 0;
            i4 = i1;
            i1 = 3;
          }
          else
          {
            i6 = 4;
            i2 = 7;
            i3 = 0;
            i4 = i1;
            i1 = i6;
          }
        }
      }
      return;
      i1 = 4;
    }
  }
  
  int d(int paramInt)
  {
    int i3 = 1;
    int i2 = 0;
    boolean bool;
    if (this.A < 262)
    {
      g();
      if ((this.A < 262) && (paramInt == 0)) {}
      label50:
      do
      {
        return 0;
        if (this.A != 0) {
          break;
        }
        if (paramInt != 4) {
          break label543;
        }
        bool = true;
        a(bool);
        if (this.a.g != 0) {
          break label549;
        }
      } while (paramInt != 4);
      return 2;
    }
    int i1;
    if (this.A >= 3)
    {
      this.q = ((this.q << this.t ^ this.m[(this.y + 2)] & 0xFF) & this.s);
      i1 = this.p[this.q] & 0xFFFF;
      this.o[(this.y & this.l)] = this.p[this.q];
      this.p[this.q] = ((short)this.y);
    }
    for (;;)
    {
      if ((i1 != 0L) && ((this.y - i1 & 0xFFFF) <= this.j - 262) && (this.F != 2)) {
        this.v = f(i1);
      }
      if (this.v >= 3)
      {
        bool = b(this.y - this.z, this.v - 3);
        this.A -= this.v;
        if ((this.v <= this.D) && (this.A >= 3))
        {
          this.v -= 1;
          do
          {
            this.y += 1;
            this.q = ((this.q << this.t ^ this.m[(this.y + 2)] & 0xFF) & this.s);
            i1 = this.p[this.q];
            this.o[(this.y & this.l)] = this.p[this.q];
            this.p[this.q] = ((short)this.y);
            i2 = this.v - 1;
            this.v = i2;
          } while (i2 != 0);
          this.y += 1;
          i1 &= 0xFFFF;
        }
      }
      for (;;)
      {
        i2 = i1;
        if (!bool) {
          break;
        }
        a(false);
        i2 = i1;
        if (this.a.g != 0) {
          break;
        }
        return 0;
        this.y += this.v;
        this.v = 0;
        this.q = (this.m[this.y] & 0xFF);
        this.q = ((this.q << this.t ^ this.m[(this.y + 1)] & 0xFF) & this.s);
        continue;
        bool = b(0, this.m[this.y] & 0xFF);
        this.A -= 1;
        this.y += 1;
      }
      label543:
      bool = false;
      break label50;
      label549:
      i1 = i3;
      if (paramInt == 4) {
        i1 = 3;
      }
      return i1;
      i1 = i2;
    }
  }
  
  void d()
  {
    int i6 = 0;
    int i1 = 0;
    int i2 = 0;
    while (i2 < 7)
    {
      i1 += this.I[(i2 * 2)];
      i2 += 1;
    }
    for (;;)
    {
      int i4 = i1;
      int i5 = i2;
      int i3;
      if (i2 < 128)
      {
        i3 += this.I[(i2 * 2)];
        i2 += 1;
      }
      else
      {
        while (i5 < 256)
        {
          i4 += this.I[(i5 * 2)];
          i5 += 1;
        }
        if (i4 > i3 >>> 2) {}
        for (i1 = i6;; i1 = 1)
        {
          this.h = ((byte)i1);
          return;
        }
        i3 = 0;
      }
    }
  }
  
  int e(int paramInt)
  {
    int i3 = 1;
    int i2 = 0;
    if (this.A < 262)
    {
      g();
      if ((this.A < 262) && (paramInt == 0)) {
        label33:
        return 0;
      }
      if (this.A == 0)
      {
        if (this.x != 0)
        {
          b(0, this.m[(this.y - 1)] & 0xFF);
          this.x = 0;
        }
        if (paramInt != 4) {
          break label676;
        }
      }
    }
    label676:
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      if (this.a.g != 0) {
        break label682;
      }
      if (paramInt != 4) {
        break label33;
      }
      return 2;
      i1 = i2;
      if (this.A >= 3)
      {
        this.q = ((this.q << this.t ^ this.m[(this.y + 2)] & 0xFF) & this.s);
        i1 = this.p[this.q] & 0xFFFF;
        this.o[(this.y & this.l)] = this.p[this.q];
        this.p[this.q] = ((short)this.y);
      }
      this.B = this.v;
      this.w = this.z;
      this.v = 2;
      if ((i1 != 0) && (this.B < this.D) && ((this.y - i1 & 0xFFFF) <= this.j - 262))
      {
        if (this.F != 2) {
          this.v = f(i1);
        }
        if ((this.v <= 5) && ((this.F == 1) || ((this.v == 3) && (this.y - this.z > 4096)))) {
          this.v = 2;
        }
      }
      if ((this.B >= 3) && (this.v <= this.B))
      {
        int i4 = this.y;
        int i5 = this.A;
        bool = b(this.y - 1 - this.w, this.B - 3);
        this.A -= this.B - 1;
        this.B -= 2;
        i2 = i1;
        int i6;
        do
        {
          i6 = this.y + 1;
          this.y = i6;
          i1 = i2;
          if (i6 <= i4 + i5 - 3)
          {
            this.q = ((this.q << this.t ^ this.m[(this.y + 2)] & 0xFF) & this.s);
            i1 = this.p[this.q] & 0xFFFF;
            this.o[(this.y & this.l)] = this.p[this.q];
            this.p[this.q] = ((short)this.y);
          }
          i6 = this.B - 1;
          this.B = i6;
          i2 = i1;
        } while (i6 != 0);
        this.x = 0;
        this.v = 2;
        this.y += 1;
        i2 = i1;
        if (!bool) {
          break;
        }
        a(false);
        i2 = i1;
        if (this.a.g != 0) {
          break;
        }
        return 0;
      }
      if (this.x != 0)
      {
        if (b(0, this.m[(this.y - 1)] & 0xFF)) {
          a(false);
        }
        this.y += 1;
        this.A -= 1;
        i2 = i1;
        if (this.a.g != 0) {
          break;
        }
        return 0;
      }
      this.x = 1;
      this.y += 1;
      this.A -= 1;
      i2 = i1;
      break;
    }
    label682:
    int i1 = i3;
    if (paramInt == 4) {
      i1 = 3;
    }
    return i1;
  }
  
  void e()
  {
    if (this.ac == 16)
    {
      a(this.ab);
      this.ab = 0;
      this.ac = 0;
    }
    while (this.ac < 8) {
      return;
    }
    a((byte)this.ab);
    this.ab = ((short)(this.ab >>> 8));
    this.ac -= 8;
  }
  
  int f(int paramInt)
  {
    int i6 = this.C;
    int i3 = this.y;
    int i4 = this.B;
    int i7;
    int i8;
    int i13;
    int i14;
    int i5;
    int i2;
    int i1;
    int i9;
    if (this.y > this.j - 262)
    {
      i7 = this.y - (this.j - 262);
      i8 = this.H;
      i13 = this.l;
      i14 = this.y + 258;
      i5 = this.m[(i3 + i4 - 1)];
      i2 = this.m[(i3 + i4)];
      i1 = i6;
      if (this.B >= this.G) {
        i1 = i6 >> 2;
      }
      if (i8 <= this.A) {
        break label798;
      }
      i8 = this.A;
      i6 = i5;
      i9 = paramInt;
      i5 = i3;
      i3 = i6;
    }
    for (;;)
    {
      label145:
      int i10 = i2;
      int i11 = i3;
      paramInt = i4;
      i6 = i5;
      byte[] arrayOfByte;
      if (this.m[(i9 + i4)] == i2)
      {
        i10 = i2;
        i11 = i3;
        paramInt = i4;
        i6 = i5;
        if (this.m[(i9 + i4 - 1)] == i3)
        {
          i10 = i2;
          i11 = i3;
          paramInt = i4;
          i6 = i5;
          if (this.m[i9] == this.m[i5])
          {
            arrayOfByte = this.m;
            paramInt = i9 + 1;
            if (arrayOfByte[paramInt] == this.m[(i5 + 1)]) {
              break label353;
            }
            i6 = i5;
            paramInt = i4;
            i11 = i3;
            i10 = i2;
          }
        }
      }
      for (;;)
      {
        label279:
        i9 = this.o[(i9 & i13)] & 0xFFFF;
        i2 = paramInt;
        if (i9 > i7)
        {
          int i12 = i1 - 1;
          i2 = i10;
          i3 = i11;
          i4 = paramInt;
          i5 = i6;
          i1 = i12;
          if (i12 != 0) {
            break label145;
          }
          i2 = paramInt;
        }
        for (;;)
        {
          if (i2 <= this.A)
          {
            return i2;
            i7 = 0;
            break;
            label353:
            i6 = i5 + 2;
            paramInt += 1;
            do
            {
              arrayOfByte = this.m;
              i5 = i6 + 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 = paramInt + 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              arrayOfByte = this.m;
              i5 += 1;
              i10 = arrayOfByte[i5];
              arrayOfByte = this.m;
              i6 += 1;
              paramInt = i5;
              if (i10 != arrayOfByte[i6]) {
                break;
              }
              paramInt = i6;
              i6 = i5;
            } while (i5 < i14);
            paramInt = i5;
            i5 = 258 - (i14 - paramInt);
            paramInt = i14 - 258;
            if (i5 <= i4) {
              break label781;
            }
            this.z = i9;
            if (i5 >= i8)
            {
              i2 = i5;
            }
            else
            {
              i11 = this.m[(paramInt + i5 - 1)];
              i10 = this.m[(paramInt + i5)];
              i6 = paramInt;
              paramInt = i5;
              break label279;
            }
          }
        }
        return this.A;
        label781:
        i6 = paramInt;
        i10 = i2;
        i11 = i3;
        paramInt = i4;
      }
      label798:
      i6 = i3;
      i3 = i5;
      i5 = i6;
      i9 = paramInt;
    }
  }
  
  void f()
  {
    if (this.ac > 8) {
      a(this.ab);
    }
    for (;;)
    {
      this.ab = 0;
      this.ac = 0;
      return;
      if (this.ac > 0) {
        a((byte)this.ab);
      }
    }
  }
  
  void g()
  {
    int i4 = this.n - this.A - this.y;
    int i2;
    if ((i4 == 0) && (this.y == 0) && (this.A == 0)) {
      i2 = this.j;
    }
    for (;;)
    {
      if (this.a.c == 0) {}
      label196:
      label223:
      do
      {
        return;
        if (i4 == -1)
        {
          i2 = i4 - 1;
          break;
        }
        if (this.y < this.j + this.j - 262) {
          break label415;
        }
        System.arraycopy(this.m, this.j, this.m, 0, this.j);
        this.z -= this.j;
        this.y -= this.j;
        this.u -= this.j;
        int i3 = this.r;
        i2 = i3;
        do
        {
          arrayOfShort = this.p;
          i3 -= 1;
          i5 = arrayOfShort[i3] & 0xFFFF;
          arrayOfShort = this.p;
          if (i5 < this.j) {
            break;
          }
          i1 = (short)(i5 - this.j);
          arrayOfShort[i3] = i1;
          i5 = i2 - 1;
          i2 = i5;
        } while (i5 != 0);
        i3 = this.j;
        i2 = i3;
        short[] arrayOfShort = this.o;
        i3 -= 1;
        int i5 = arrayOfShort[i3] & 0xFFFF;
        arrayOfShort = this.o;
        if (i5 >= this.j) {}
        for (int i1 = (short)(i5 - this.j);; i1 = 0)
        {
          arrayOfShort[i3] = i1;
          i5 = i2 - 1;
          i2 = i5;
          if (i5 != 0) {
            break label223;
          }
          i2 = this.j + i4;
          break;
          i1 = 0;
          break label196;
        }
        this.A = (this.a.a(this.m, this.y + this.A, i2) + this.A);
        if (this.A >= 3)
        {
          this.q = (this.m[this.y] & 0xFF);
          this.q = ((this.q << this.t ^ this.m[(this.y + 1)] & 0xFF) & this.s);
        }
      } while (this.A >= 262);
      if (this.a.c != 0) {
        break;
      }
      return;
      label415:
      i2 = i4;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */