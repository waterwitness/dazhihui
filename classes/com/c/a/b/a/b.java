package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.k;
import java.lang.reflect.GenericArrayType;

final class b
  implements am
{
  public <T> al<T> a(k paramk, com.c.a.c.a<T> parama)
  {
    parama = parama.getType();
    if ((!(parama instanceof GenericArrayType)) && ((!(parama instanceof Class)) || (!((Class)parama).isArray()))) {
      return null;
    }
    parama = com.c.a.b.b.g(parama);
    return new a(paramk, paramk.a(com.c.a.c.a.get(parama)), com.c.a.b.b.e(parama));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */