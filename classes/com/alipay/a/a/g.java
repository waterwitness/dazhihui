package com.alipay.a.a;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;
import org.b.a.c;

public final class g
  implements i, j
{
  public final Object a(Object paramObject)
  {
    TreeMap localTreeMap = new TreeMap();
    Class localClass = paramObject.getClass();
    for (Field[] arrayOfField = localClass.getDeclaredFields(); !localClass.equals(Object.class); arrayOfField = localClass.getDeclaredFields())
    {
      if ((arrayOfField != null) && (arrayOfField.length > 0))
      {
        int j = arrayOfField.length;
        int i = 0;
        if (i < j)
        {
          Field localField = arrayOfField[i];
          Object localObject;
          if ((localField == null) || (paramObject == null)) {
            localObject = null;
          }
          for (;;)
          {
            if (localObject != null) {
              localTreeMap.put(localField.getName(), localObject);
            }
            i += 1;
            break;
            if ("this$0".equals(localField.getName()))
            {
              localObject = null;
            }
            else
            {
              boolean bool = localField.isAccessible();
              localField.setAccessible(true);
              localObject = localField.get(paramObject);
              if (localObject == null)
              {
                localObject = null;
              }
              else
              {
                localField.setAccessible(bool);
                localObject = f.b(localObject);
              }
            }
          }
        }
      }
      localClass = localClass.getSuperclass();
    }
    return localTreeMap;
  }
  
  public final Object a(Object paramObject, Type paramType)
  {
    if (!paramObject.getClass().equals(c.class))
    {
      paramType = null;
      return paramType;
    }
    c localc = (c)paramObject;
    paramObject = (Class)paramType;
    Object localObject1 = ((Class)paramObject).newInstance();
    for (;;)
    {
      paramType = (Type)localObject1;
      if (paramObject.equals(Object.class)) {
        break;
      }
      paramType = ((Class)paramObject).getDeclaredFields();
      if ((paramType != null) && (paramType.length > 0))
      {
        int j = paramType.length;
        int i = 0;
        while (i < j)
        {
          Object localObject2 = paramType[i];
          String str = ((Field)localObject2).getName();
          Type localType = ((Field)localObject2).getGenericType();
          if (localc.b(str))
          {
            ((Field)localObject2).setAccessible(true);
            ((Field)localObject2).set(localObject1, e.a(localc.a(str), localType));
          }
          i += 1;
        }
      }
      paramObject = ((Class)paramObject).getSuperclass();
    }
  }
  
  public final boolean a(Class<?> paramClass)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */