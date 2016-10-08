package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.b.b;
import com.c.a.b.f;
import com.c.a.c.a;
import java.lang.reflect.Type;
import java.util.Map;

public final class k
  implements am
{
  private final f a;
  private final boolean b;
  
  public k(f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }
  
  private al<?> a(com.c.a.k paramk, Type paramType)
  {
    if ((paramType == Boolean.TYPE) || (paramType == Boolean.class)) {
      return y.f;
    }
    return paramk.a(a.get(paramType));
  }
  
  public <T> al<T> a(com.c.a.k paramk, a<T> parama)
  {
    Object localObject = parama.getType();
    if (!Map.class.isAssignableFrom(parama.getRawType())) {
      return null;
    }
    localObject = b.b((Type)localObject, b.e((Type)localObject));
    al localal1 = a(paramk, localObject[0]);
    al localal2 = paramk.a(a.get(localObject[1]));
    parama = this.a.a(parama);
    return new l(this, paramk, localObject[0], localal1, localObject[1], localal2, parama);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */