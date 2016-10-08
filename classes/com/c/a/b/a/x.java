package com.c.a.b.a;

import com.c.a.al;
import com.c.a.d.d;
import com.c.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class x<T>
  extends al<T>
{
  private final k a;
  private final al<T> b;
  private final Type c;
  
  x(k paramk, al<T> paramal, Type paramType)
  {
    this.a = paramk;
    this.b = paramal;
    this.c = paramType;
  }
  
  private Type a(Type paramType, Object paramObject)
  {
    Object localObject = paramType;
    if (paramObject != null) {
      if ((paramType != Object.class) && (!(paramType instanceof TypeVariable)))
      {
        localObject = paramType;
        if (!(paramType instanceof Class)) {}
      }
      else
      {
        localObject = paramObject.getClass();
      }
    }
    return (Type)localObject;
  }
  
  public void a(d paramd, T paramT)
  {
    al localal = this.b;
    Type localType = a(this.c, paramT);
    if (localType != this.c)
    {
      localal = this.a.a(com.c.a.c.a.get(localType));
      if ((localal instanceof r)) {
        break label52;
      }
    }
    for (;;)
    {
      localal.a(paramd, paramT);
      return;
      label52:
      if (!(this.b instanceof r)) {
        localal = this.b;
      }
    }
  }
  
  public T b(com.c.a.d.a parama)
  {
    return (T)this.b.b(parama);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */