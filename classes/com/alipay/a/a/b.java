package com.alipay.a.a;

import com.alipay.a.b.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public final class b
  implements i, j
{
  private static Collection<Object> a(Class<?> paramClass, Type paramType)
  {
    if (paramClass == AbstractCollection.class) {
      return new ArrayList();
    }
    if (paramClass.isAssignableFrom(HashSet.class)) {
      return new HashSet();
    }
    if (paramClass.isAssignableFrom(LinkedHashSet.class)) {
      return new LinkedHashSet();
    }
    if (paramClass.isAssignableFrom(TreeSet.class)) {
      return new TreeSet();
    }
    if (paramClass.isAssignableFrom(ArrayList.class)) {
      return new ArrayList();
    }
    if (paramClass.isAssignableFrom(EnumSet.class))
    {
      if ((paramType instanceof ParameterizedType)) {}
      for (paramClass = ((ParameterizedType)paramType).getActualTypeArguments()[0];; paramClass = Object.class) {
        return EnumSet.noneOf((Class)paramClass);
      }
    }
    try
    {
      paramType = (Collection)paramClass.newInstance();
      return paramType;
    }
    catch (Exception paramType)
    {
      throw new IllegalArgumentException("create instane error, class " + paramClass.getName());
    }
  }
  
  public final Object a(Object paramObject)
  {
    ArrayList localArrayList = new ArrayList();
    paramObject = ((Iterable)paramObject).iterator();
    while (((Iterator)paramObject).hasNext()) {
      localArrayList.add(f.b(((Iterator)paramObject).next()));
    }
    return localArrayList;
  }
  
  public final Object a(Object paramObject, Type paramType)
  {
    int i = 0;
    if (!paramObject.getClass().equals(org.b.a.b.class)) {
      return null;
    }
    Object localObject = a.a(paramType);
    paramObject = (org.b.a.b)paramObject;
    localObject = a((Class)localObject, paramType);
    if ((paramType instanceof ParameterizedType))
    {
      paramType = ((ParameterizedType)paramType).getActualTypeArguments()[0];
      while (i < ((org.b.a.b)paramObject).a())
      {
        ((Collection)localObject).add(e.a(((org.b.a.b)paramObject).a(i), paramType));
        i += 1;
      }
    }
    throw new IllegalArgumentException("Does not support the implement for generics.");
    return localObject;
  }
  
  public final boolean a(Class<?> paramClass)
  {
    return Collection.class.isAssignableFrom(paramClass);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */