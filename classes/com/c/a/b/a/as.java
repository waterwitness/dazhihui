package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.c.a;
import com.c.a.k;

final class as
  implements am
{
  public <T> al<T> a(k paramk, a<T> parama)
  {
    parama = parama.getRawType();
    if ((!Enum.class.isAssignableFrom(parama)) || (parama == Enum.class)) {
      return null;
    }
    paramk = parama;
    if (!parama.isEnum()) {
      paramk = parama.getSuperclass();
    }
    return new bf(paramk);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */