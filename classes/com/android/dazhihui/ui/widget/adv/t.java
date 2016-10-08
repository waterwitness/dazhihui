package com.android.dazhihui.ui.widget.adv;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class t
  extends Thread
{
  private Bitmap A;
  private aa B = null;
  private boolean C = false;
  private byte[] D = new byte['Ā'];
  private int E = 0;
  private int F = 0;
  private int G = 0;
  private boolean H = false;
  private int I = 0;
  private int J;
  private short[] K;
  private byte[] L;
  private byte[] M;
  private byte[] N;
  private aa O;
  private int P;
  private u Q = null;
  private byte[] R = null;
  public int a;
  public int b;
  private InputStream c;
  private int d;
  private boolean e;
  private int f;
  private int g = 1;
  private int[] h;
  private int[] i;
  private int[] j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private Bitmap z;
  
  public t(InputStream paramInputStream, u paramu)
  {
    this.c = paramInputStream;
    this.Q = paramu;
  }
  
  private int[] c(int paramInt)
  {
    int i2 = 0;
    int i3 = paramInt * 3;
    Object localObject = null;
    byte[] arrayOfByte = new byte[i3];
    int i1;
    int[] arrayOfInt;
    try
    {
      i1 = this.c.read(arrayOfByte);
      if (i1 < i3)
      {
        this.d = 1;
        return (int[])localObject;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        i1 = 0;
      }
      arrayOfInt = new int['Ā'];
      i3 = 0;
      i1 = i2;
      i2 = i3;
    }
    for (;;)
    {
      localObject = arrayOfInt;
      if (i1 >= paramInt) {
        break;
      }
      int i5 = i2 + 1;
      i3 = arrayOfByte[i2];
      int i4 = i5 + 1;
      i5 = arrayOfByte[i5];
      i2 = i4 + 1;
      arrayOfInt[i1] = ((i3 & 0xFF) << 16 | 0xFF000000 | (i5 & 0xFF) << 8 | arrayOfByte[i4] & 0xFF);
      i1 += 1;
    }
  }
  
  private void d()
  {
    int i6 = 0;
    int[] arrayOfInt = new int[this.a * this.b];
    int i1;
    if (this.G > 0) {
      if (this.G == 3)
      {
        i1 = this.P - 2;
        if (i1 > 0) {
          this.A = a(i1 - 1);
        }
      }
      else
      {
        if (this.A == null) {
          break label179;
        }
        this.A.getPixels(arrayOfInt, 0, this.a, 0, 0, this.a, this.b);
        if (this.G != 2) {
          break label179;
        }
        if (this.H) {
          break label469;
        }
      }
    }
    label179:
    label460:
    label469:
    for (int i2 = this.m;; i2 = 0)
    {
      int i3 = 0;
      for (;;)
      {
        if (i3 >= this.y) {
          break label179;
        }
        i4 = (this.w + i3) * this.a + this.v;
        i5 = this.x;
        i1 = i4;
        for (;;)
        {
          if (i1 < i5 + i4)
          {
            arrayOfInt[i1] = i2;
            i1 += 1;
            continue;
            this.A = null;
            break;
          }
        }
        i3 += 1;
      }
      int i4 = 8;
      int i5 = 1;
      i1 = 0;
      i3 = i6;
      i6 = i1;
      int i7;
      if (i3 < this.u)
      {
        if (!this.p) {
          break label460;
        }
        i1 = i6;
        i2 = i4;
        i7 = i5;
        if (i6 >= this.u) {
          i7 = i5 + 1;
        }
        switch (i7)
        {
        default: 
          i2 = i4;
          i1 = i6;
          i6 = i1 + i2;
          i5 = i7;
        }
      }
      for (;;)
      {
        i1 += this.s;
        if (i1 < this.b)
        {
          int i8 = this.a * i1;
          i7 = i8 + this.r;
          i4 = this.t + i7;
          i1 = i4;
          if (this.a + i8 < i4) {
            i1 = this.a + i8;
          }
          i4 = this.t * i3;
          for (;;)
          {
            if (i7 < i1)
            {
              i8 = this.N[i4];
              i8 = this.j[(i8 & 0xFF)];
              if (i8 != 0) {
                arrayOfInt[i7] = i8;
              }
              i7 += 1;
              i4 += 1;
              continue;
              i1 = 4;
              i2 = i4;
              break;
              i1 = 2;
              i2 = 4;
              break;
              i1 = 1;
              i2 = 2;
              break;
            }
          }
        }
        i3 += 1;
        i4 = i2;
        break;
        this.z = Bitmap.createBitmap(arrayOfInt, this.a, this.b, Bitmap.Config.ARGB_4444);
        return;
        i1 = i3;
        i2 = i4;
      }
    }
  }
  
  private int e()
  {
    this.c = new ByteArrayInputStream(this.R);
    this.R = null;
    return f();
  }
  
  private int f()
  {
    i();
    if (this.c != null)
    {
      n();
      if (!h())
      {
        l();
        if (this.P >= 0) {
          break label61;
        }
        this.d = 1;
        this.Q.parseOk(false, -1);
      }
    }
    for (;;)
    {
      try
      {
        this.c.close();
        return this.d;
        label61:
        this.d = -1;
        this.Q.parseOk(true, -1);
        continue;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      this.d = 2;
      this.Q.parseOk(false, -1);
    }
  }
  
  private void g()
  {
    int i16 = this.t * this.u;
    if ((this.N == null) || (this.N.length < i16)) {
      this.N = new byte[i16];
    }
    if (this.K == null) {
      this.K = new short['က'];
    }
    if (this.L == null) {
      this.L = new byte['က'];
    }
    if (this.M == null) {
      this.M = new byte['ခ'];
    }
    int i17 = j();
    int i18 = 1 << i17;
    int i7 = i18 + 2;
    int i2 = i17 + 1;
    int i3 = (1 << i2) - 1;
    int i1 = 0;
    while (i1 < i18)
    {
      this.K[i1] = 0;
      this.L[i1] = ((byte)i1);
      i1 += 1;
    }
    int i10 = 0;
    int i4 = 0;
    int i8 = 0;
    int i5 = 0;
    int i13 = 0;
    int i11 = 0;
    int i6 = 0;
    i1 = -1;
    int i12 = 0;
    int i9;
    if (i13 < i16)
    {
      if (i4 != 0) {
        break label666;
      }
      if (i6 >= i2) {
        break label276;
      }
      i9 = i11;
      if (i11 != 0) {
        break label235;
      }
      i9 = k();
      if (i9 > 0) {
        break label232;
      }
    }
    label232:
    label235:
    label276:
    int i14;
    int i15;
    for (;;)
    {
      if (i10 < i16)
      {
        this.N[i10] = 0;
        i10 += 1;
        continue;
        i12 = 0;
        i5 += ((this.D[i12] & 0xFF) << i6);
        i6 += 8;
        i12 += 1;
        i11 = i9 - 1;
        break;
        i9 = i5 & i3;
        i14 = i5 >> i2;
        i6 -= i2;
        if ((i9 <= i7) && (i9 != i18 + 1))
        {
          if (i9 == i18)
          {
            i2 = i17 + 1;
            i3 = (1 << i2) - 1;
            i7 = i18 + 2;
            i1 = -1;
            i5 = i14;
            break;
          }
          if (i1 == -1)
          {
            this.M[i4] = this.L[i9];
            i4 += 1;
            i1 = i9;
            i8 = i9;
            i5 = i14;
            break;
          }
          if (i9 != i7) {
            break label659;
          }
          byte[] arrayOfByte = this.M;
          i15 = i4 + 1;
          arrayOfByte[i4] = ((byte)i8);
          i5 = i1;
          i4 = i15;
          label416:
          while (i5 > i18)
          {
            this.M[i4] = this.L[i5];
            i5 = this.K[i5];
            i4 += 1;
          }
          i15 = this.L[i5] & 0xFF;
          if (i7 < 4096)
          {
            this.M[i4] = ((byte)i15);
            this.K[i7] = ((short)i1);
            this.L[i7] = ((byte)i15);
            i8 = i7 + 1;
            i1 = i2;
            i5 = i3;
            if ((i8 & i3) == 0)
            {
              i1 = i2;
              i5 = i3;
              if (i8 < 4096)
              {
                i1 = i2 + 1;
                i5 = i3 + i8;
              }
            }
            i3 = i14;
            i7 = i5;
            i5 = i15;
            i14 = i4 + 1;
            i2 = i8;
            i4 = i7;
            i7 = i1;
            i1 = i9;
            i8 = i14;
          }
        }
      }
    }
    for (;;)
    {
      i15 = i8 - 1;
      this.N[i10] = this.M[i15];
      i13 += 1;
      i14 = i10 + 1;
      i8 = i7;
      i9 = i3;
      i10 = i15;
      i7 = i2;
      i2 = i8;
      i3 = i4;
      i4 = i10;
      i8 = i5;
      i5 = i9;
      i10 = i14;
      break;
      return;
      label659:
      i5 = i9;
      break label416;
      label666:
      i9 = i3;
      i3 = i8;
      i8 = i4;
      i4 = i5;
      i14 = i7;
      i5 = i3;
      i3 = i4;
      i7 = i2;
      i4 = i9;
      i2 = i14;
    }
  }
  
  private boolean h()
  {
    return this.d != 0;
  }
  
  private void i()
  {
    this.d = 0;
    this.P = 0;
    this.O = null;
    this.h = null;
    this.i = null;
  }
  
  private int j()
  {
    try
    {
      int i1 = this.c.read();
      return i1;
    }
    catch (Exception localException)
    {
      this.d = 1;
    }
    return 0;
  }
  
  private int k()
  {
    this.E = j();
    int i2 = 0;
    int i1 = 0;
    if (this.E > 0) {}
    for (;;)
    {
      try
      {
        if (i1 < this.E)
        {
          i2 = this.c.read(this.D, i1, this.E - i1);
          if (i2 != -1) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      i2 = i1;
      if (i1 < this.E)
      {
        this.d = 1;
        i2 = i1;
      }
      return i2;
      i1 += i2;
    }
  }
  
  private void l()
  {
    int i1 = 0;
    while ((i1 == 0) && (!h())) {
      switch (j())
      {
      case 0: 
      default: 
        this.d = 1;
        break;
      case 44: 
        o();
        break;
      case 33: 
        switch (j())
        {
        default: 
          t();
          break;
        case 249: 
          m();
          break;
        case 255: 
          k();
          String str = "";
          int i2 = 0;
          while (i2 < 11)
          {
            str = str + (char)this.D[i2];
            i2 += 1;
          }
          if (str.equals("NETSCAPE2.0")) {
            q();
          } else {
            t();
          }
          break;
        }
        break;
      case 59: 
        i1 = 1;
      }
    }
  }
  
  private void m()
  {
    boolean bool = true;
    j();
    int i1 = j();
    this.F = ((i1 & 0x1C) >> 2);
    if (this.F == 0) {
      this.F = 1;
    }
    if ((i1 & 0x1) != 0) {}
    for (;;)
    {
      this.H = bool;
      this.I = (r() * 10);
      this.J = j();
      j();
      return;
      bool = false;
    }
  }
  
  private void n()
  {
    String str = "";
    int i1 = 0;
    while (i1 < 6)
    {
      str = str + (char)j();
      i1 += 1;
    }
    if (!str.startsWith("GIF")) {
      this.d = 1;
    }
    do
    {
      return;
      p();
    } while ((!this.e) || (h()));
    this.h = c(this.f);
    this.l = this.h[this.k];
  }
  
  private void o()
  {
    int i1 = 0;
    this.r = r();
    this.s = r();
    this.t = r();
    this.u = r();
    int i2 = j();
    boolean bool;
    if ((i2 & 0x80) != 0)
    {
      bool = true;
      this.o = bool;
      if ((i2 & 0x40) == 0) {
        break label162;
      }
      bool = true;
      label66:
      this.p = bool;
      this.q = (2 << (i2 & 0x7));
      if (!this.o) {
        break label168;
      }
      this.i = c(this.q);
      this.j = this.i;
      label109:
      if (this.H)
      {
        i1 = this.j[this.J];
        this.j[this.J] = 0;
      }
      if (this.j == null) {
        this.d = 1;
      }
      if (!h()) {
        break label195;
      }
    }
    label162:
    label168:
    label195:
    do
    {
      return;
      bool = false;
      break;
      bool = false;
      break label66;
      this.j = this.h;
      if (this.k != this.J) {
        break label109;
      }
      this.l = 0;
      break label109;
      g();
      t();
    } while (h());
    this.P += 1;
    this.z = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_4444);
    d();
    if (this.O == null)
    {
      this.O = new aa(this.z, this.I);
      this.B = this.O;
    }
    for (;;)
    {
      if (this.H) {
        this.j[this.J] = i1;
      }
      s();
      this.Q.parseOk(true, this.P);
      return;
      for (aa localaa = this.O; localaa.c != null; localaa = localaa.c) {}
      localaa.c = new aa(this.z, this.I);
    }
  }
  
  private void p()
  {
    this.a = r();
    this.b = r();
    int i1 = j();
    if ((i1 & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      this.f = (2 << (i1 & 0x7));
      this.k = j();
      this.n = j();
      return;
    }
  }
  
  private void q()
  {
    do
    {
      k();
      if (this.D[0] == 1) {
        this.g = (this.D[1] & 0xFF | (this.D[2] & 0xFF) << 8);
      }
    } while ((this.E > 0) && (!h()));
  }
  
  private int r()
  {
    return j() | j() << 8;
  }
  
  private void s()
  {
    this.G = this.F;
    this.v = this.r;
    this.w = this.s;
    this.x = this.t;
    this.y = this.u;
    this.A = this.z;
    this.m = this.l;
    this.F = 0;
    this.H = false;
    this.I = 0;
    this.i = null;
  }
  
  private void t()
  {
    do
    {
      k();
    } while ((this.E > 0) && (!h()));
  }
  
  public Bitmap a(int paramInt)
  {
    aa localaa = b(paramInt);
    if (localaa == null) {
      return null;
    }
    return localaa.a;
  }
  
  public aa a(boolean paramBoolean)
  {
    if (!this.C)
    {
      this.C = true;
      return this.O;
    }
    if (this.d == 0) {
      if (this.B.c == null) {}
    }
    for (this.B = this.B.c;; this.B = this.O) {
      do
      {
        return this.B;
        this.B = this.B.c;
      } while ((this.B != null) || (!paramBoolean));
    }
  }
  
  public void a()
  {
    for (aa localaa = this.O; localaa != null; localaa = this.O)
    {
      localaa.a = null;
      this.O = this.O.c;
    }
    if (this.c != null) {}
    try
    {
      this.c.close();
      this.c = null;
      this.R = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public int b()
  {
    return this.P;
  }
  
  public aa b(int paramInt)
  {
    aa localaa = this.O;
    int i1 = 0;
    while (localaa != null)
    {
      if (i1 == paramInt) {
        return localaa;
      }
      localaa = localaa.c;
      i1 += 1;
    }
    return null;
  }
  
  public Bitmap c()
  {
    return a(0);
  }
  
  public void run()
  {
    if (this.c != null) {
      f();
    }
    while (this.R == null) {
      return;
    }
    e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */