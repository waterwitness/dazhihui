package com.alipay.b.b.a.a;

import java.lang.reflect.Proxy;

public final class ah
{
  private p a;
  private aj b;
  
  public ah(p paramp)
  {
    this.a = paramp;
    this.b = new aj(this);
  }
  
  public final p a()
  {
    return this.a;
  }
  
  public final <T> T a(Class<T> paramClass)
  {
    ClassLoader localClassLoader = paramClass.getClassLoader();
    ai localai = new ai(this.a, paramClass, this.b);
    return (T)Proxy.newProxyInstance(localClassLoader, new Class[] { paramClass }, localai);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */