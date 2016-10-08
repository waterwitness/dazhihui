package com.c.b.b.a;

import com.c.b.a.a;

abstract class c
{
  private static final c[] a = { new e(null), new f(null), new g(null), new h(null), new i(null), new j(null), new k(null), new l(null) };
  
  static c a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 7)) {
      throw new IllegalArgumentException();
    }
    return a[paramInt];
  }
  
  final void a(a parama, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = 0;
      while (j < paramInt)
      {
        if (a(i, j)) {
          parama.c(j, i);
        }
        j += 1;
      }
      i += 1;
    }
  }
  
  abstract boolean a(int paramInt1, int paramInt2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */