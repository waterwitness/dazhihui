package com.c.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t
  extends w
  implements Iterable<w>
{
  private final List<w> a = new ArrayList();
  
  public Number a()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).a();
    }
    throw new IllegalStateException();
  }
  
  public void a(w paramw)
  {
    Object localObject = paramw;
    if (paramw == null) {
      localObject = y.a;
    }
    this.a.add(localObject);
  }
  
  public String b()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).b();
    }
    throw new IllegalStateException();
  }
  
  public double c()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).c();
    }
    throw new IllegalStateException();
  }
  
  public long d()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).d();
    }
    throw new IllegalStateException();
  }
  
  public int e()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).e();
    }
    throw new IllegalStateException();
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof t)) && (((t)paramObject).a.equals(this.a)));
  }
  
  public boolean f()
  {
    if (this.a.size() == 1) {
      return ((w)this.a.get(0)).f();
    }
    throw new IllegalStateException();
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public Iterator<w> iterator()
  {
    return this.a.iterator();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */