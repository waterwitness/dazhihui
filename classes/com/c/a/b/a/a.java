package com.c.a.b.a;

import com.c.a.al;
import com.c.a.am;
import com.c.a.d.c;
import com.c.a.d.d;
import com.c.a.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a<E>
  extends al<Object>
{
  public static final am a = new b();
  private final Class<E> b;
  private final al<E> c;
  
  public a(k paramk, al<E> paramal, Class<E> paramClass)
  {
    this.c = new x(paramk, paramal, paramClass);
    this.b = paramClass;
  }
  
  public void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    paramd.b();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      this.c.a(paramd, localObject);
      i += 1;
    }
    paramd.c();
  }
  
  public Object b(com.c.a.d.a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    parama.a();
    while (parama.e()) {
      localArrayList.add(this.c.b(parama));
    }
    parama.b();
    parama = Array.newInstance(this.b, localArrayList.size());
    int i = 0;
    while (i < localArrayList.size())
    {
      Array.set(parama, i, localArrayList.get(i));
      i += 1;
    }
    return parama;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */