package org.a.a.j;

import org.a.a.bd;
import org.a.a.d;
import org.a.a.t;

public class b
  extends d
{
  private t a;
  
  private b(t paramt)
  {
    this.a = paramt;
  }
  
  public static b a(Object paramObject)
  {
    if ((paramObject instanceof b)) {
      return (b)paramObject;
    }
    if (paramObject != null) {
      return new b(t.a(paramObject));
    }
    return null;
  }
  
  public bd d()
  {
    return this.a;
  }
  
  public boolean e()
  {
    return this.a.f() > 1;
  }
  
  public a f()
  {
    if (this.a.f() == 0) {
      return null;
    }
    return a.a(this.a.a(0));
  }
  
  public a[] g()
  {
    a[] arrayOfa = new a[this.a.f()];
    int i = 0;
    while (i != arrayOfa.length)
    {
      arrayOfa[i] = a.a(this.a.a(i));
      i += 1;
    }
    return arrayOfa;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\j\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */