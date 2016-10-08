package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.b.af;
import com.c.a.b.f;
import com.c.a.c.a;
import com.c.a.j;
import com.c.a.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class p
  implements am
{
  private final f a;
  private final j b;
  private final com.c.a.b.s c;
  
  public p(f paramf, j paramj, com.c.a.b.s params)
  {
    this.a = paramf;
    this.b = paramj;
    this.c = params;
  }
  
  private s a(k paramk, Field paramField, String paramString, a<?> parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new q(this, paramString, paramBoolean1, paramBoolean2, paramk, parama, paramField, af.a(parama.getRawType()));
  }
  
  private String a(Field paramField)
  {
    com.c.a.a.b localb = (com.c.a.a.b)paramField.getAnnotation(com.c.a.a.b.class);
    if (localb == null) {
      return this.b.a(paramField);
    }
    return localb.a();
  }
  
  private Map<String, s> a(k paramk, a<?> parama, Class<?> paramClass)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramClass.isInterface()) {
      return localLinkedHashMap;
    }
    Type localType1 = parama.getType();
    while (paramClass != Object.class)
    {
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      if (i < j)
      {
        Object localObject = arrayOfField[i];
        boolean bool1 = a((Field)localObject, true);
        boolean bool2 = a((Field)localObject, false);
        if ((!bool1) && (!bool2)) {}
        do
        {
          i += 1;
          break;
          ((Field)localObject).setAccessible(true);
          Type localType2 = com.c.a.b.b.a(parama.getType(), paramClass, ((Field)localObject).getGenericType());
          localObject = a(paramk, (Field)localObject, a((Field)localObject), a.get(localType2), bool1, bool2);
          localObject = (s)localLinkedHashMap.put(((s)localObject).g, localObject);
        } while (localObject == null);
        throw new IllegalArgumentException(localType1 + " declares multiple JSON fields named " + ((s)localObject).g);
      }
      parama = a.get(com.c.a.b.b.a(parama.getType(), paramClass, paramClass.getGenericSuperclass()));
      paramClass = parama.getRawType();
    }
    return localLinkedHashMap;
  }
  
  public <T> al<T> a(k paramk, a<T> parama)
  {
    Class localClass = parama.getRawType();
    if (!Object.class.isAssignableFrom(localClass)) {
      return null;
    }
    return new r(this.a.a(parama), a(paramk, parama, localClass), null);
  }
  
  public boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */