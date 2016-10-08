package com.c.a.b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class ac<T>
  implements Iterator<T>
{
  ad<K, V> b = this.e.e.d;
  ad<K, V> c = null;
  int d = this.e.d;
  
  private ac(w paramw) {}
  
  final ad<K, V> b()
  {
    ad localad = this.b;
    if (localad == this.e.e) {
      throw new NoSuchElementException();
    }
    if (this.e.d != this.d) {
      throw new ConcurrentModificationException();
    }
    this.b = localad.d;
    this.c = localad;
    return localad;
  }
  
  public final boolean hasNext()
  {
    return this.b != this.e.e;
  }
  
  public final void remove()
  {
    if (this.c == null) {
      throw new IllegalStateException();
    }
    this.e.a(this.c, true);
    this.c = null;
    this.d = this.e.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */