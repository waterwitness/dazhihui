package com.c.a.b.a;

import com.c.a.a.b;
import com.c.a.al;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.d.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bf<T extends Enum<T>>
  extends al<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();
  
  public bf(Class<T> paramClass)
  {
    for (;;)
    {
      try
      {
        Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
        int j = arrayOfEnum.length;
        int i = 0;
        if (i < j)
        {
          Enum localEnum = arrayOfEnum[i];
          String str = localEnum.name();
          b localb = (b)paramClass.getField(str).getAnnotation(b.class);
          if (localb != null)
          {
            str = localb.a();
            this.a.put(str, localEnum);
            this.b.put(localEnum, str);
            i += 1;
          }
        }
        else
        {
          return;
        }
      }
      catch (NoSuchFieldException paramClass)
      {
        throw new AssertionError();
      }
    }
  }
  
  public T a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    return (Enum)this.a.get(parama.h());
  }
  
  public void a(d paramd, T paramT)
  {
    if (paramT == null) {}
    for (paramT = null;; paramT = (String)this.b.get(paramT))
    {
      paramd.b(paramT);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */