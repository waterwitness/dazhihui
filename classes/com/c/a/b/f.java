package com.c.a.b;

import com.c.a.c.a;
import com.c.a.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class f
{
  private final Map<Type, s<?>> a;
  
  public f(Map<Type, s<?>> paramMap)
  {
    this.a = paramMap;
  }
  
  private <T> ae<T> a(Class<? super T> paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredConstructor(new Class[0]);
      if (!paramClass.isAccessible()) {
        paramClass.setAccessible(true);
      }
      paramClass = new l(this, paramClass);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass) {}
    return null;
  }
  
  private <T> ae<T> a(Type paramType, Class<? super T> paramClass)
  {
    if (Collection.class.isAssignableFrom(paramClass))
    {
      if (SortedSet.class.isAssignableFrom(paramClass)) {
        return new m(this);
      }
      if (EnumSet.class.isAssignableFrom(paramClass)) {
        return new n(this, paramType);
      }
      if (Set.class.isAssignableFrom(paramClass)) {
        return new o(this);
      }
      if (Queue.class.isAssignableFrom(paramClass)) {
        return new p(this);
      }
      return new q(this);
    }
    if (Map.class.isAssignableFrom(paramClass))
    {
      if (SortedMap.class.isAssignableFrom(paramClass)) {
        return new r(this);
      }
      if (((paramType instanceof ParameterizedType)) && (!String.class.isAssignableFrom(a.get(((ParameterizedType)paramType).getActualTypeArguments()[0]).getRawType()))) {
        return new h(this);
      }
      return new i(this);
    }
    return null;
  }
  
  private <T> ae<T> b(Type paramType, Class<? super T> paramClass)
  {
    return new j(this, paramClass, paramType);
  }
  
  public <T> ae<T> a(a<T> parama)
  {
    Type localType = parama.getType();
    Class localClass = parama.getRawType();
    parama = (s)this.a.get(localType);
    if (parama != null) {
      parama = new g(this, parama, localType);
    }
    ae localae;
    do
    {
      do
      {
        return parama;
        parama = (s)this.a.get(localClass);
        if (parama != null) {
          return new k(this, parama, localType);
        }
        localae = a(localClass);
        parama = localae;
      } while (localae != null);
      localae = a(localType, localClass);
      parama = localae;
    } while (localae != null);
    return b(localType, localClass);
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */