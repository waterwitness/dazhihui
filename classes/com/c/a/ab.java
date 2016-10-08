package com.c.a;

import com.c.a.b.a;
import com.c.a.b.v;
import java.math.BigInteger;

public final class ab
  extends w
{
  private static final Class<?>[] a = { Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
  private Object b;
  
  public ab(Boolean paramBoolean)
  {
    a(paramBoolean);
  }
  
  public ab(Number paramNumber)
  {
    a(paramNumber);
  }
  
  public ab(String paramString)
  {
    a(paramString);
  }
  
  private static boolean a(ab paramab)
  {
    if ((paramab.b instanceof Number))
    {
      paramab = (Number)paramab.b;
      return ((paramab instanceof BigInteger)) || ((paramab instanceof Long)) || ((paramab instanceof Integer)) || ((paramab instanceof Short)) || ((paramab instanceof Byte));
    }
    return false;
  }
  
  private static boolean b(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return true;
    }
    paramObject = paramObject.getClass();
    Class[] arrayOfClass = a;
    int j = arrayOfClass.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label45;
      }
      if (arrayOfClass[i].isAssignableFrom((Class)paramObject)) {
        break;
      }
      i += 1;
    }
    label45:
    return false;
  }
  
  public Number a()
  {
    if ((this.b instanceof String)) {
      return new v((String)this.b);
    }
    return (Number)this.b;
  }
  
  void a(Object paramObject)
  {
    if ((paramObject instanceof Character))
    {
      this.b = String.valueOf(((Character)paramObject).charValue());
      return;
    }
    if (((paramObject instanceof Number)) || (b(paramObject))) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool);
      this.b = paramObject;
      return;
    }
  }
  
  public String b()
  {
    if (p()) {
      return a().toString();
    }
    if (o()) {
      return n().toString();
    }
    return (String)this.b;
  }
  
  public double c()
  {
    if (p()) {
      return a().doubleValue();
    }
    return Double.parseDouble(b());
  }
  
  public long d()
  {
    if (p()) {
      return a().longValue();
    }
    return Long.parseLong(b());
  }
  
  public int e()
  {
    if (p()) {
      return a().intValue();
    }
    return Integer.parseInt(b());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if ((paramObject == null) || (getClass() != paramObject.getClass())) {
          return false;
        }
        paramObject = (ab)paramObject;
        if (this.b != null) {
          break;
        }
      } while (((ab)paramObject).b == null);
      return false;
      if ((!a(this)) || (!a((ab)paramObject))) {
        break;
      }
    } while (a().longValue() == ((ab)paramObject).a().longValue());
    return false;
    if (((this.b instanceof Number)) && ((((ab)paramObject).b instanceof Number)))
    {
      double d1 = a().doubleValue();
      double d2 = ((ab)paramObject).a().doubleValue();
      boolean bool1;
      if (d1 != d2)
      {
        bool1 = bool2;
        if (Double.isNaN(d1))
        {
          bool1 = bool2;
          if (!Double.isNaN(d2)) {}
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    return this.b.equals(((ab)paramObject).b);
  }
  
  public boolean f()
  {
    if (o()) {
      return n().booleanValue();
    }
    return Boolean.parseBoolean(b());
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 31;
    }
    long l;
    if (a(this))
    {
      l = a().longValue();
      return (int)(l ^ l >>> 32);
    }
    if ((this.b instanceof Number))
    {
      l = Double.doubleToLongBits(a().doubleValue());
      return (int)(l ^ l >>> 32);
    }
    return this.b.hashCode();
  }
  
  Boolean n()
  {
    return (Boolean)this.b;
  }
  
  public boolean o()
  {
    return this.b instanceof Boolean;
  }
  
  public boolean p()
  {
    return this.b instanceof Number;
  }
  
  public boolean q()
  {
    return this.b instanceof String;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */