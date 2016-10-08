package com.alipay.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class f
{
  private static List<j> a;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    localArrayList.add(new l());
    a.add(new d());
    a.add(new c());
    a.add(new h());
    a.add(new b());
    a.add(new a());
    a.add(new g());
  }
  
  public static String a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    paramObject = b(paramObject);
    if (com.alipay.a.b.a.a(paramObject.getClass())) {
      return org.b.a.c.c(paramObject.toString());
    }
    if (Collection.class.isAssignableFrom(paramObject.getClass())) {
      return new org.b.a.b((List)paramObject).toString();
    }
    if (Map.class.isAssignableFrom(paramObject.getClass())) {
      return new org.b.a.c((Map)paramObject).toString();
    }
    throw new IllegalArgumentException("Unsupported Class : " + paramObject.getClass());
  }
  
  public static Object b(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (j)localIterator.next();
      if (((j)localObject).a(paramObject.getClass()))
      {
        localObject = ((j)localObject).a(paramObject);
        if (localObject != null) {
          return localObject;
        }
      }
    }
    throw new IllegalArgumentException("Unsupported Class : " + paramObject.getClass());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */