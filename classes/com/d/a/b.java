package com.d.a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class b
  implements Iterator<E>
{
  private int b;
  private int c;
  private int d;
  
  private b(a parama)
  {
    this.b = a.a(parama);
    this.c = a.b(parama);
    this.d = -1;
  }
  
  public boolean hasNext()
  {
    return this.b != this.c;
  }
  
  public E next()
  {
    if (this.b == this.c) {
      throw new NoSuchElementException();
    }
    Object localObject = a.c(this.a)[this.b];
    if ((a.b(this.a) != this.c) || (localObject == null)) {
      throw new ConcurrentModificationException();
    }
    this.d = this.b;
    this.b = (this.b + 1 & a.c(this.a).length - 1);
    return (E)localObject;
  }
  
  public void remove()
  {
    if (this.d < 0) {
      throw new IllegalStateException();
    }
    if (a.a(this.a, this.d))
    {
      this.b = (this.b - 1 & a.c(this.a).length - 1);
      this.c = a.b(this.a);
    }
    this.d = -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */