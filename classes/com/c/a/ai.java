package com.c.a;

import com.c.a.b.ag;
import com.c.a.d.d;

final class ai<T>
  extends al<T>
{
  private final ad<T> a;
  private final v<T> b;
  private final k c;
  private final com.c.a.c.a<T> d;
  private final am e;
  private al<T> f;
  
  private ai(ad<T> paramad, v<T> paramv, k paramk, com.c.a.c.a<T> parama, am paramam)
  {
    this.a = paramad;
    this.b = paramv;
    this.c = paramk;
    this.d = parama;
    this.e = paramam;
  }
  
  private al<T> a()
  {
    al localal = this.f;
    if (localal != null) {
      return localal;
    }
    localal = this.c.a(this.e, this.d);
    this.f = localal;
    return localal;
  }
  
  public static am a(com.c.a.c.a<?> parama, Object paramObject)
  {
    return new ak(paramObject, parama, false, null, null);
  }
  
  public void a(d paramd, T paramT)
  {
    if (this.a == null)
    {
      a().a(paramd, paramT);
      return;
    }
    if (paramT == null)
    {
      paramd.f();
      return;
    }
    ag.a(this.a.a(paramT, this.d.getType(), this.c.b), paramd);
  }
  
  public T b(com.c.a.d.a parama)
  {
    if (this.b == null) {
      return (T)a().b(parama);
    }
    parama = ag.a(parama);
    if (parama.j()) {
      return null;
    }
    return (T)this.b.b(parama, this.d.getType(), this.c.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */