package com.c.a.b;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class c
  implements Serializable, GenericArrayType
{
  private final Type a;
  
  public c(Type paramType)
  {
    this.a = b.d(paramType);
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof GenericArrayType)) && (b.a(this, (GenericArrayType)paramObject));
  }
  
  public Type getGenericComponentType()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return b.f(this.a) + "[]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */