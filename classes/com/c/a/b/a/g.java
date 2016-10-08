package com.c.a.b.a;

import com.c.a.ab;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.t;
import com.c.a.y;
import com.c.a.z;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class g
  extends a
{
  private static final Reader a = new h();
  private static final Object b = new Object();
  private final List<Object> c;
  
  private void a(c paramc)
  {
    if (f() != paramc) {
      throw new IllegalStateException("Expected " + paramc + " but was " + f());
    }
  }
  
  private Object q()
  {
    return this.c.get(this.c.size() - 1);
  }
  
  private Object r()
  {
    return this.c.remove(this.c.size() - 1);
  }
  
  public void a()
  {
    a(c.a);
    t localt = (t)q();
    this.c.add(localt.iterator());
  }
  
  public void b()
  {
    a(c.b);
    r();
    r();
  }
  
  public void c()
  {
    a(c.c);
    z localz = (z)q();
    this.c.add(localz.o().iterator());
  }
  
  public void close()
  {
    this.c.clear();
    this.c.add(b);
  }
  
  public void d()
  {
    a(c.d);
    r();
    r();
  }
  
  public boolean e()
  {
    c localc = f();
    return (localc != c.d) && (localc != c.b);
  }
  
  public c f()
  {
    if (this.c.isEmpty()) {
      return c.j;
    }
    Object localObject = q();
    if ((localObject instanceof Iterator))
    {
      boolean bool = this.c.get(this.c.size() - 2) instanceof z;
      localObject = (Iterator)localObject;
      if (((Iterator)localObject).hasNext())
      {
        if (bool) {
          return c.e;
        }
        this.c.add(((Iterator)localObject).next());
        return f();
      }
      if (bool) {
        return c.d;
      }
      return c.b;
    }
    if ((localObject instanceof z)) {
      return c.c;
    }
    if ((localObject instanceof t)) {
      return c.a;
    }
    if ((localObject instanceof ab))
    {
      localObject = (ab)localObject;
      if (((ab)localObject).q()) {
        return c.f;
      }
      if (((ab)localObject).o()) {
        return c.h;
      }
      if (((ab)localObject).p()) {
        return c.g;
      }
      throw new AssertionError();
    }
    if ((localObject instanceof y)) {
      return c.i;
    }
    if (localObject == b) {
      throw new IllegalStateException("JsonReader is closed");
    }
    throw new AssertionError();
  }
  
  public String g()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    return (String)localEntry.getKey();
  }
  
  public String h()
  {
    c localc = f();
    if ((localc != c.f) && (localc != c.g)) {
      throw new IllegalStateException("Expected " + c.f + " but was " + localc);
    }
    return ((ab)r()).b();
  }
  
  public boolean i()
  {
    a(c.h);
    return ((ab)r()).f();
  }
  
  public void j()
  {
    a(c.i);
    r();
  }
  
  public double k()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    double d = ((ab)q()).c();
    if ((!p()) && ((Double.isNaN(d)) || (Double.isInfinite(d)))) {
      throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
    }
    r();
    return d;
  }
  
  public long l()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    long l = ((ab)q()).d();
    r();
    return l;
  }
  
  public int m()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    int i = ((ab)q()).e();
    r();
    return i;
  }
  
  public void n()
  {
    if (f() == c.e)
    {
      g();
      return;
    }
    r();
  }
  
  public void o()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    this.c.add(new ab((String)localEntry.getKey()));
  }
  
  public String toString()
  {
    return getClass().getSimpleName();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */