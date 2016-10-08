package com.android.dazhihui.richscan.a;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class d
{
  private static final String a = d.class.getSimpleName();
  private static final Object b = c();
  private static final Method c = a(b);
  
  static
  {
    if (b == null)
    {
      Log.v(a, "This device does supports control of a flashlight");
      return;
    }
    Log.v(a, "This device does not support control of a flashlight");
  }
  
  private static Class<?> a(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w(a, "Unexpected error while finding class " + paramString, localRuntimeException);
      return null;
    }
    catch (ClassNotFoundException paramString) {}
    return null;
  }
  
  private static Object a(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.w(a, "Unexpected error while invoking " + paramMethod, (Throwable)paramObject);
      return null;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.w(a, "Unexpected error while invoking " + paramMethod, ((InvocationTargetException)paramObject).getCause());
      return null;
    }
    catch (RuntimeException paramObject)
    {
      Log.w(a, "Unexpected error while invoking " + paramMethod, (Throwable)paramObject);
    }
    return null;
  }
  
  private static Method a(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, paramVarArgs);
      return paramClass;
    }
    catch (RuntimeException paramClass)
    {
      Log.w(a, "Unexpected error while finding method " + paramString, paramClass);
      return null;
    }
    catch (NoSuchMethodException paramClass) {}
    return null;
  }
  
  private static Method a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return a(paramObject.getClass(), "setFlashlightEnabled", new Class[] { Boolean.TYPE });
  }
  
  static void a()
  {
    a(true);
  }
  
  private static void a(boolean paramBoolean)
  {
    if (b != null) {
      a(c, b, new Object[] { Boolean.valueOf(paramBoolean) });
    }
  }
  
  static void b()
  {
    a(false);
  }
  
  private static Object c()
  {
    Object localObject1 = a("android.os.ServiceManager");
    if (localObject1 == null) {}
    Object localObject2;
    do
    {
      do
      {
        do
        {
          do
          {
            return null;
            localObject1 = a((Class)localObject1, "getService", new Class[] { String.class });
          } while (localObject1 == null);
          localObject1 = a((Method)localObject1, null, new Object[] { "hardware" });
        } while (localObject1 == null);
        localObject2 = a("android.os.IHardwareService$Stub");
      } while (localObject2 == null);
      localObject2 = a((Class)localObject2, "asInterface", new Class[] { IBinder.class });
    } while (localObject2 == null);
    return a((Method)localObject2, null, new Object[] { localObject1 });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */