package com.c.a.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class l
  implements ae<T>
{
  l(f paramf, Constructor paramConstructor) {}
  
  public T a()
  {
    try
    {
      Object localObject = this.a.newInstance(null);
      return (T)localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException("Failed to invoke " + this.a + " with no args", localInstantiationException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException("Failed to invoke " + this.a + " with no args", localInvocationTargetException.getTargetException());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */