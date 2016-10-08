package com.c.b.b.a;

import com.c.b.f;

final class a
{
  private final com.c.b.a.a a;
  private s b;
  private p c;
  private boolean d;
  
  a(com.c.b.a.a parama)
  {
    int i = parama.d();
    if ((i < 21) || ((i & 0x3) != 1)) {
      throw f.a();
    }
    this.a = parama;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.d) {}
    for (boolean bool = this.a.a(paramInt2, paramInt1); bool; bool = this.a.a(paramInt1, paramInt2)) {
      return paramInt3 << 1 | 0x1;
    }
    return paramInt3 << 1;
  }
  
  p a()
  {
    int k = 0;
    if (this.c != null) {
      return this.c;
    }
    int i = 0;
    int j = 0;
    while (i < 6)
    {
      j = a(i, 8, j);
      i += 1;
    }
    j = a(8, 7, a(8, 8, a(7, 8, j)));
    i = 5;
    while (i >= 0)
    {
      j = a(8, i, j);
      i -= 1;
    }
    int n = this.a.d();
    int m = n - 1;
    i = k;
    k = m;
    while (k >= n - 7)
    {
      i = a(8, k, i);
      k -= 1;
    }
    m = n - 8;
    k = i;
    i = m;
    while (i < n)
    {
      k = a(i, 8, k);
      i += 1;
    }
    this.c = p.b(j, k);
    if (this.c != null) {
      return this.c;
    }
    throw f.a();
  }
  
  void a(boolean paramBoolean)
  {
    this.b = null;
    this.c = null;
    this.d = paramBoolean;
  }
  
  s b()
  {
    if (this.b != null) {
      return this.b;
    }
    int m = this.a.d();
    int i = (m - 17) / 4;
    if (i <= 6) {
      return s.b(i);
    }
    int n = m - 11;
    i = 5;
    int j = 0;
    int k;
    while (i >= 0)
    {
      k = m - 9;
      while (k >= n)
      {
        j = a(k, i, j);
        k -= 1;
      }
      i -= 1;
    }
    s locals = s.c(j);
    if ((locals != null) && (locals.d() == m))
    {
      this.b = locals;
      return locals;
    }
    j = 0;
    i = 5;
    while (i >= 0)
    {
      k = m - 9;
      while (k >= n)
      {
        j = a(i, k, j);
        k -= 1;
      }
      i -= 1;
    }
    locals = s.c(j);
    if ((locals != null) && (locals.d() == m))
    {
      this.b = locals;
      return locals;
    }
    throw f.a();
  }
  
  byte[] c()
  {
    Object localObject = a();
    s locals = b();
    localObject = c.a(((p)localObject).b());
    int i7 = this.a.d();
    ((c)localObject).a(this.a, i7);
    localObject = locals.e();
    byte[] arrayOfByte = new byte[locals.c()];
    int i = i7 - 1;
    int j = 0;
    int k = 0;
    int i4 = 0;
    int n = 1;
    while (i > 0)
    {
      int i1 = i;
      if (i == 6) {
        i1 = i - 1;
      }
      i = 0;
      while (i < i7)
      {
        if (n != 0) {}
        int m;
        int i6;
        for (int i2 = i7 - 1 - i;; i2 = i)
        {
          int i3 = 0;
          m = k;
          i6 = j;
          while (i3 < 2)
          {
            k = i6;
            j = m;
            int i5 = i4;
            if (!((com.c.b.a.a)localObject).a(i1 - i3, i2))
            {
              i6 += 1;
              j = m << 1;
              m = j;
              if (this.a.a(i1 - i3, i2)) {
                m = j | 0x1;
              }
              k = i6;
              j = m;
              i5 = i4;
              if (i6 == 8)
              {
                arrayOfByte[i4] = ((byte)m);
                j = 0;
                i5 = i4 + 1;
                k = 0;
              }
            }
            i3 += 1;
            i6 = k;
            m = j;
            i4 = i5;
          }
        }
        i += 1;
        j = i6;
        k = m;
      }
      i = i1 - 2;
      n ^= 0x1;
    }
    if (i4 != locals.c()) {
      throw f.a();
    }
    return arrayOfByte;
  }
  
  void d()
  {
    if (this.c == null) {
      return;
    }
    c localc = c.a(this.c.b());
    int i = this.a.d();
    localc.a(this.a, i);
  }
  
  void e()
  {
    int i = 0;
    while (i < this.a.c())
    {
      int j = i + 1;
      while (j < this.a.d())
      {
        if (this.a.a(i, j) != this.a.a(j, i))
        {
          this.a.c(j, i);
          this.a.c(i, j);
        }
        j += 1;
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */