package com.c.a.b;

import com.c.a.x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

class n
  implements ae<T>
{
  n(f paramf, Type paramType) {}
  
  public T a()
  {
    if ((this.a instanceof ParameterizedType))
    {
      Type localType = ((ParameterizedType)this.a).getActualTypeArguments()[0];
      if ((localType instanceof Class)) {
        return EnumSet.noneOf((Class)localType);
      }
      throw new x("Invalid EnumSet type: " + this.a.toString());
    }
    throw new x("Invalid EnumSet type: " + this.a.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */