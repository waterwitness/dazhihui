package com.c.a.b;

import java.lang.reflect.Type;

class j
  implements ae<T>
{
  private final ak d = ak.a();
  
  j(f paramf, Class paramClass, Type paramType) {}
  
  public T a()
  {
    try
    {
      Object localObject = this.d.a(this.a);
      return (T)localObject;
    }
    catch (Exception localException)
    {
      throw new RuntimeException("Unable to invoke no-args constructor for " + this.b + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */