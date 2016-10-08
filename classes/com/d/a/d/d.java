package com.d.a.d;

import java.util.ArrayList;

public class d<T>
  extends ArrayList<T>
{
  private Object a;
  
  public <V> V a()
  {
    try
    {
      Object localObject1 = this.a;
      return (V)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public <V> void a(V paramV)
  {
    try
    {
      if (this.a == null) {
        this.a = paramV;
      }
      return;
    }
    finally
    {
      paramV = finally;
      throw paramV;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */