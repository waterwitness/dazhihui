package com.c.a.b.a;

import com.c.a.ab;
import com.c.a.d.d;
import com.c.a.t;
import com.c.a.w;
import com.c.a.y;
import com.c.a.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class i
  extends d
{
  private static final Writer a = new j();
  private static final ab b = new ab("closed");
  private final List<w> c = new ArrayList();
  private String d;
  private w e = y.a;
  
  public i()
  {
    super(a);
  }
  
  private void a(w paramw)
  {
    if (this.d != null)
    {
      if ((!paramw.j()) || (i())) {
        ((z)j()).a(this.d, paramw);
      }
      this.d = null;
      return;
    }
    if (this.c.isEmpty())
    {
      this.e = paramw;
      return;
    }
    w localw = j();
    if ((localw instanceof t))
    {
      ((t)localw).a(paramw);
      return;
    }
    throw new IllegalStateException();
  }
  
  private w j()
  {
    return (w)this.c.get(this.c.size() - 1);
  }
  
  public d a(long paramLong)
  {
    a(new ab(Long.valueOf(paramLong)));
    return this;
  }
  
  public d a(Number paramNumber)
  {
    if (paramNumber == null) {
      return f();
    }
    if (!g())
    {
      double d1 = paramNumber.doubleValue();
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1))) {
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramNumber);
      }
    }
    a(new ab(paramNumber));
    return this;
  }
  
  public d a(String paramString)
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof z))
    {
      this.d = paramString;
      return this;
    }
    throw new IllegalStateException();
  }
  
  public d a(boolean paramBoolean)
  {
    a(new ab(Boolean.valueOf(paramBoolean)));
    return this;
  }
  
  public w a()
  {
    if (!this.c.isEmpty()) {
      throw new IllegalStateException("Expected one JSON element but was " + this.c);
    }
    return this.e;
  }
  
  public d b()
  {
    t localt = new t();
    a(localt);
    this.c.add(localt);
    return this;
  }
  
  public d b(String paramString)
  {
    if (paramString == null) {
      return f();
    }
    a(new ab(paramString));
    return this;
  }
  
  public d c()
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof t))
    {
      this.c.remove(this.c.size() - 1);
      return this;
    }
    throw new IllegalStateException();
  }
  
  public void close()
  {
    if (!this.c.isEmpty()) {
      throw new IOException("Incomplete document");
    }
    this.c.add(b);
  }
  
  public d d()
  {
    z localz = new z();
    a(localz);
    this.c.add(localz);
    return this;
  }
  
  public d e()
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof z))
    {
      this.c.remove(this.c.size() - 1);
      return this;
    }
    throw new IllegalStateException();
  }
  
  public d f()
  {
    a(y.a);
    return this;
  }
  
  public void flush() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */