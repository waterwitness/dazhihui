package com.c.a.b.a;

import com.c.a.al;
import com.c.a.b.ae;
import com.c.a.d.a;
import com.c.a.d.c;
import com.c.a.k;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class d<E>
  extends al<Collection<E>>
{
  private final al<E> a;
  private final ae<? extends Collection<E>> b;
  
  public d(k paramk, Type paramType, al<E> paramal, ae<? extends Collection<E>> paramae)
  {
    this.a = new x(paramk, paramal, paramType);
    this.b = paramae;
  }
  
  public Collection<E> a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Collection localCollection = (Collection)this.b.a();
    parama.a();
    while (parama.e()) {
      localCollection.add(this.a.b(parama));
    }
    parama.b();
    return localCollection;
  }
  
  public void a(com.c.a.d.d paramd, Collection<E> paramCollection)
  {
    if (paramCollection == null)
    {
      paramd.f();
      return;
    }
    paramd.b();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Object localObject = paramCollection.next();
      this.a.a(paramd, localObject);
    }
    paramd.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */