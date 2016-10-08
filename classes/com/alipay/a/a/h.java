package com.alipay.a.a;

import com.alipay.a.b.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.b.a.c;

public final class h
  implements i, j
{
  private static Map<Object, Object> a(Type paramType)
  {
    for (;;)
    {
      if (paramType == Properties.class) {
        return new Properties();
      }
      if (paramType == Hashtable.class) {
        return new Hashtable();
      }
      if (paramType == IdentityHashMap.class) {
        return new IdentityHashMap();
      }
      if ((paramType == SortedMap.class) || (paramType == TreeMap.class)) {
        return new TreeMap();
      }
      if ((paramType == ConcurrentMap.class) || (paramType == ConcurrentHashMap.class)) {
        return new ConcurrentHashMap();
      }
      if ((paramType == Map.class) || (paramType == HashMap.class)) {
        return new HashMap();
      }
      if (paramType == LinkedHashMap.class) {
        return new LinkedHashMap();
      }
      if (!(paramType instanceof ParameterizedType)) {
        break;
      }
      paramType = ((ParameterizedType)paramType).getRawType();
    }
    Object localObject = (Class)paramType;
    if (((Class)localObject).isInterface()) {
      throw new IllegalArgumentException("unsupport type " + paramType);
    }
    try
    {
      localObject = (Map)((Class)localObject).newInstance();
      return (Map<Object, Object>)localObject;
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException("unsupport type " + paramType, localException);
    }
  }
  
  public final Object a(Object paramObject)
  {
    TreeMap localTreeMap = new TreeMap();
    paramObject = ((Map)paramObject).entrySet().iterator();
    while (((Iterator)paramObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
      if (!(localEntry.getKey() instanceof String)) {
        throw new IllegalArgumentException("Map key must be String!");
      }
      localTreeMap.put((String)localEntry.getKey(), f.b(localEntry.getValue()));
    }
    return localTreeMap;
  }
  
  public final Object a(Object paramObject, Type paramType)
  {
    if (!paramObject.getClass().equals(c.class)) {
      return null;
    }
    paramObject = (c)paramObject;
    Map localMap = a(paramType);
    if ((paramType instanceof ParameterizedType))
    {
      paramType = (ParameterizedType)paramType;
      Object localObject = paramType.getActualTypeArguments()[0];
      paramType = paramType.getActualTypeArguments()[1];
      if (String.class == localObject)
      {
        localObject = ((c)paramObject).a();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if (a.a((Class)paramType)) {
            localMap.put(str, ((c)paramObject).a(str));
          } else {
            localMap.put(str, e.a(((c)paramObject).a(str), paramType));
          }
        }
      }
      throw new IllegalArgumentException("Deserialize Map Key must be String.class");
    }
    throw new IllegalArgumentException("Deserialize Map must be Generics!");
    return localMap;
  }
  
  public final boolean a(Class<?> paramClass)
  {
    return Map.class.isAssignableFrom(paramClass);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */