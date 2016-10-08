package com.alipay.a.a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  static List<i> a;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    localArrayList.add(new l());
    a.add(new d());
    a.add(new c());
    a.add(new h());
    a.add(new k());
    a.add(new b());
    a.add(new a());
    a.add(new g());
  }
  
  public static final <T> T a(Object paramObject, Type paramType)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (i)localIterator.next();
      if (((i)localObject).a(com.alipay.a.b.a.a(paramType)))
      {
        localObject = ((i)localObject).a(paramObject, paramType);
        if (localObject != null) {
          return (T)localObject;
        }
      }
    }
    return null;
  }
  
  public static final Object a(String paramString, Type paramType)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    paramString = paramString.trim();
    if ((paramString.startsWith("[")) && (paramString.endsWith("]"))) {
      return a(new org.b.a.b(paramString), paramType);
    }
    if ((paramString.startsWith("{")) && (paramString.endsWith("}"))) {
      return a(new org.b.a.c(paramString), paramType);
    }
    return a(paramString, paramType);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */