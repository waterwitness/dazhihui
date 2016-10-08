package com.c.a;

class ak
  implements am
{
  private final com.c.a.c.a<?> a;
  private final boolean b;
  private final Class<?> c;
  private final ad<?> d;
  private final v<?> e;
  
  private ak(Object paramObject, com.c.a.c.a<?> parama, boolean paramBoolean, Class<?> paramClass)
  {
    ad localad;
    if ((paramObject instanceof ad))
    {
      localad = (ad)paramObject;
      this.d = localad;
      if (!(paramObject instanceof v)) {
        break label85;
      }
      paramObject = (v)paramObject;
      label35:
      this.e = ((v)paramObject);
      if ((this.d == null) && (this.e == null)) {
        break label90;
      }
    }
    label85:
    label90:
    for (boolean bool = true;; bool = false)
    {
      com.c.a.b.a.a(bool);
      this.a = parama;
      this.b = paramBoolean;
      this.c = paramClass;
      return;
      localad = null;
      break;
      paramObject = null;
      break label35;
    }
  }
  
  public <T> al<T> a(k paramk, com.c.a.c.a<T> parama)
  {
    boolean bool;
    if (this.a != null) {
      if ((this.a.equals(parama)) || ((this.b) && (this.a.getType() == parama.getRawType()))) {
        bool = true;
      }
    }
    while (bool)
    {
      return new ai(this.d, this.e, paramk, parama, this, null);
      bool = false;
      continue;
      bool = this.c.isAssignableFrom(parama.getRawType());
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */