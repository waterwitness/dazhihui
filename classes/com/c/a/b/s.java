package com.c.a.b;

import com.c.a.a.d;
import com.c.a.al;
import com.c.a.am;
import com.c.a.b;
import com.c.a.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class s
  implements am, Cloneable
{
  public static final s a = new s();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private boolean e;
  private List<b> f = Collections.emptyList();
  private List<b> g = Collections.emptyList();
  
  private boolean a(com.c.a.a.c paramc)
  {
    return (paramc == null) || (paramc.a() <= this.b);
  }
  
  private boolean a(com.c.a.a.c paramc, d paramd)
  {
    return (a(paramc)) && (a(paramd));
  }
  
  private boolean a(d paramd)
  {
    return (paramd == null) || (paramd.a() > this.b);
  }
  
  private boolean a(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }
  
  private boolean b(Class<?> paramClass)
  {
    return (paramClass.isMemberClass()) && (!c(paramClass));
  }
  
  private boolean c(Class<?> paramClass)
  {
    return (paramClass.getModifiers() & 0x8) != 0;
  }
  
  public <T> al<T> a(k paramk, com.c.a.c.a<T> parama)
  {
    Class localClass = parama.getRawType();
    boolean bool1 = a(localClass, true);
    boolean bool2 = a(localClass, false);
    if ((!bool1) && (!bool2)) {
      return null;
    }
    return new t(this, bool2, bool1, paramk, parama);
  }
  
  protected s a()
  {
    try
    {
      s locals = (s)super.clone();
      return locals;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    if ((this.b != -1.0D) && (!a((com.c.a.a.c)paramClass.getAnnotation(com.c.a.a.c.class), (d)paramClass.getAnnotation(d.class)))) {
      return true;
    }
    if ((!this.d) && (b(paramClass))) {
      return true;
    }
    if (a(paramClass)) {
      return true;
    }
    if (paramBoolean) {}
    for (Object localObject = this.f;; localObject = this.g)
    {
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((b)((Iterator)localObject).next()).a(paramClass));
      return true;
    }
    return false;
  }
  
  public boolean a(Field paramField, boolean paramBoolean)
  {
    if ((this.c & paramField.getModifiers()) != 0) {
      return true;
    }
    if ((this.b != -1.0D) && (!a((com.c.a.a.c)paramField.getAnnotation(com.c.a.a.c.class), (d)paramField.getAnnotation(d.class)))) {
      return true;
    }
    if (paramField.isSynthetic()) {
      return true;
    }
    if (this.e)
    {
      localObject = (com.c.a.a.a)paramField.getAnnotation(com.c.a.a.a.class);
      if (localObject != null)
      {
        if (!paramBoolean) {
          break label97;
        }
        if (((com.c.a.a.a)localObject).a()) {
          break label106;
        }
      }
      label97:
      while (!((com.c.a.a.a)localObject).b()) {
        return true;
      }
    }
    label106:
    if ((!this.d) && (b(paramField.getType()))) {
      return true;
    }
    if (a(paramField.getType())) {
      return true;
    }
    if (paramBoolean) {}
    for (Object localObject = this.f; !((List)localObject).isEmpty(); localObject = this.g)
    {
      paramField = new com.c.a.c(paramField);
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((b)((Iterator)localObject).next()).a(paramField));
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */