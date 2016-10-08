package com.alipay.a.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a
{
  public static Class<?> a(Type paramType)
  {
    for (;;)
    {
      if ((paramType instanceof Class)) {
        return (Class)paramType;
      }
      if (!(paramType instanceof ParameterizedType)) {
        break;
      }
      paramType = ((ParameterizedType)paramType).getRawType();
    }
    throw new IllegalArgumentException("TODO");
  }
  
  public static boolean a(Class<?> paramClass)
  {
    if (paramClass.isPrimitive()) {}
    while ((paramClass.equals(String.class)) || (paramClass.equals(Integer.class)) || (paramClass.equals(Long.class)) || (paramClass.equals(Double.class)) || (paramClass.equals(Float.class)) || (paramClass.equals(Boolean.class)) || (paramClass.equals(Short.class)) || (paramClass.equals(Character.class)) || (paramClass.equals(Byte.class)) || (paramClass.equals(Void.class))) {
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */