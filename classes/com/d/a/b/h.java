package com.d.a.b;

import java.util.ArrayList;

public class h<T>
  extends l<T>
{
  ArrayList<g<T>> a;
  final g<T> b = new i(this);
  
  public h<T> c(g<T> paramg)
  {
    try
    {
      if (this.a == null) {
        this.a = new ArrayList();
      }
      this.a.add(paramg);
      super.d(this.b);
      return this;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */