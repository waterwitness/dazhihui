package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.b.b;
import com.c.a.b.f;
import com.c.a.c.a;
import com.c.a.k;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
  implements am
{
  private final f a;
  
  public c(f paramf)
  {
    this.a = paramf;
  }
  
  public <T> al<T> a(k paramk, a<T> parama)
  {
    Type localType = parama.getType();
    Class localClass = parama.getRawType();
    if (!Collection.class.isAssignableFrom(localClass)) {
      return null;
    }
    localType = b.a(localType, localClass);
    return new d(paramk, localType, paramk.a(a.get(localType)), this.a.a(parama));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */