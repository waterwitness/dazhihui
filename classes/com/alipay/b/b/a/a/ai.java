package com.alipay.b.b.a.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class ai
  implements InvocationHandler
{
  protected p a;
  protected Class<?> b;
  protected aj c;
  
  public ai(p paramp, Class<?> paramClass, aj paramaj)
  {
    this.a = paramp;
    this.b = paramClass;
    this.c = paramaj;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = this.c;
    Class localClass = this.b;
    return ((aj)paramObject).a(paramMethod, paramArrayOfObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */