package com.d.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class a<E>
  extends AbstractCollection<E>
  implements ar<E>, Serializable, Cloneable
{
  private transient Object[] b = new Object[16];
  private transient int c;
  private transient int d;
  
  static
  {
    if (!a.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private boolean a(int paramInt)
  {
    j();
    Object[] arrayOfObject = this.b;
    int i = arrayOfObject.length - 1;
    int j = this.c;
    int k = this.d;
    int m = paramInt - j & i;
    int n = k - paramInt & i;
    if (m >= (k - j & i)) {
      throw new ConcurrentModificationException();
    }
    if (m < n)
    {
      if (j <= paramInt) {
        System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, m);
      }
      for (;;)
      {
        arrayOfObject[j] = null;
        this.c = (j + 1 & i);
        return false;
        System.arraycopy(arrayOfObject, 0, arrayOfObject, 1, paramInt);
        arrayOfObject[0] = arrayOfObject[i];
        System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, i - j);
      }
    }
    if (paramInt < k) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, n);
    }
    for (this.d = (k - 1);; this.d = (k - 1 & i))
    {
      return true;
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt);
      arrayOfObject[i] = arrayOfObject[0];
      System.arraycopy(arrayOfObject, 1, arrayOfObject, 0, k);
    }
  }
  
  private <T> T[] a(T[] paramArrayOfT)
  {
    if (this.c < this.d) {
      System.arraycopy(this.b, this.c, paramArrayOfT, 0, size());
    }
    while (this.c <= this.d) {
      return paramArrayOfT;
    }
    int i = this.b.length - this.c;
    System.arraycopy(this.b, this.c, paramArrayOfT, 0, i);
    System.arraycopy(this.b, 0, paramArrayOfT, i, this.d);
    return paramArrayOfT;
  }
  
  private void i()
  {
    if ((!a) && (this.c != this.d)) {
      throw new AssertionError();
    }
    int i = this.c;
    int j = this.b.length;
    int k = j - i;
    int m = j << 1;
    if (m < 0) {
      throw new IllegalStateException("Sorry, deque too big");
    }
    Object[] arrayOfObject = new Object[m];
    System.arraycopy(this.b, i, arrayOfObject, 0, k);
    System.arraycopy(this.b, 0, arrayOfObject, k, i);
    this.b = arrayOfObject;
    this.c = 0;
    this.d = j;
  }
  
  private void j()
  {
    if ((!a) && (this.b[this.d] != null)) {
      throw new AssertionError();
    }
    if (!a) {
      if (this.c == this.d)
      {
        if (this.b[this.c] == null) {}
      }
      else {
        while ((this.b[this.c] == null) || (this.b[(this.d - 1 & this.b.length - 1)] == null)) {
          throw new AssertionError();
        }
      }
    }
    if ((!a) && (this.b[(this.c - 1 & this.b.length - 1)] != null)) {
      throw new AssertionError();
    }
  }
  
  public E a()
  {
    Object localObject = b();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public void a(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException("e == null");
    }
    Object[] arrayOfObject = this.b;
    int i = this.c - 1 & this.b.length - 1;
    this.c = i;
    arrayOfObject[i] = paramE;
    if (this.c == this.d) {
      i();
    }
  }
  
  public boolean add(E paramE)
  {
    b(paramE);
    return true;
  }
  
  public E b()
  {
    int i = this.c;
    Object localObject = this.b[i];
    if (localObject == null) {
      return null;
    }
    this.b[i] = null;
    this.c = (i + 1 & this.b.length - 1);
    return (E)localObject;
  }
  
  public void b(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException("e == null");
    }
    this.b[this.d] = paramE;
    int i = this.d + 1 & this.b.length - 1;
    this.d = i;
    if (i == this.c) {
      i();
    }
  }
  
  public E c()
  {
    Object localObject = this.b[this.c];
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean c(E paramE)
  {
    b(paramE);
    return true;
  }
  
  public void clear()
  {
    int i = this.c;
    int k = this.d;
    if (i != k)
    {
      this.d = 0;
      this.c = 0;
      int m = this.b.length;
      int j;
      do
      {
        this.b[i] = null;
        j = i + 1 & m - 1;
        i = j;
      } while (j != k);
    }
  }
  
  public boolean contains(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    int j = this.b.length;
    for (int i = this.c;; i = i + 1 & j - 1)
    {
      Object localObject = this.b[i];
      if (localObject == null) {
        return false;
      }
      if (paramObject.equals(localObject)) {
        return true;
      }
    }
  }
  
  public E d()
  {
    Object localObject = this.b[(this.d - 1 & this.b.length - 1)];
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean d(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    int j = this.b.length;
    for (int i = this.c;; i = i + 1 & j - 1)
    {
      Object localObject = this.b[i];
      if (localObject == null) {
        return false;
      }
      if (paramObject.equals(localObject))
      {
        a(i);
        return true;
      }
    }
  }
  
  public E e()
  {
    return (E)this.b[this.c];
  }
  
  public void e(E paramE)
  {
    a(paramE);
  }
  
  public E element()
  {
    return (E)c();
  }
  
  public E f()
  {
    return (E)this.b[(this.d - 1 & this.b.length - 1)];
  }
  
  public E g()
  {
    return (E)a();
  }
  
  public a<E> h()
  {
    try
    {
      a locala = (a)super.clone();
      System.arraycopy(this.b, 0, locala.b, 0, this.b.length);
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public boolean isEmpty()
  {
    return this.c == this.d;
  }
  
  public Iterator<E> iterator()
  {
    return new b(this, null);
  }
  
  public boolean offer(E paramE)
  {
    return c(paramE);
  }
  
  public E peek()
  {
    return (E)e();
  }
  
  public E poll()
  {
    return (E)b();
  }
  
  public E remove()
  {
    return (E)a();
  }
  
  public boolean remove(Object paramObject)
  {
    return d(paramObject);
  }
  
  public int size()
  {
    return this.d - this.c & this.b.length - 1;
  }
  
  public Object[] toArray()
  {
    return a(new Object[size()]);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    int i = size();
    if (paramArrayOfT.length < i) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    }
    for (;;)
    {
      a(paramArrayOfT);
      if (paramArrayOfT.length > i) {
        paramArrayOfT[i] = null;
      }
      return paramArrayOfT;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */