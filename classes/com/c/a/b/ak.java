package com.c.a.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ak
{
  public static ak a()
  {
    try
    {
      Object localObject1 = Class.forName("sun.misc.Unsafe");
      Object localObject4 = ((Class)localObject1).getDeclaredField("theUnsafe");
      ((Field)localObject4).setAccessible(true);
      localObject4 = ((Field)localObject4).get(null);
      localObject1 = new al(((Class)localObject1).getMethod("allocateInstance", new Class[] { Class.class }), localObject4);
      return (ak)localObject1;
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject2 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
        ((Method)localObject2).setAccessible(true);
        localObject2 = new am((Method)localObject2);
        return (ak)localObject2;
      }
      catch (Exception localException2)
      {
        try
        {
          Object localObject3 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
          ((Method)localObject3).setAccessible(true);
          int i = ((Integer)((Method)localObject3).invoke(null, new Object[] { Object.class })).intValue();
          localObject3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Integer.TYPE });
          ((Method)localObject3).setAccessible(true);
          localObject3 = new an((Method)localObject3, i);
          return (ak)localObject3;
        }
        catch (Exception localException3) {}
      }
    }
    return new ao();
  }
  
  public abstract <T> T a(Class<T> paramClass);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */