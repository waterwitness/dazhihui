package com.c.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public final class w<K, V>
  extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> g;
  Comparator<? super K> a;
  ad<K, V> b;
  int c = 0;
  int d = 0;
  final ad<K, V> e = new ad();
  private w<K, V>.y h;
  private w<K, V>.aa i;
  
  static
  {
    if (!w.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      g = new x();
      return;
    }
  }
  
  public w()
  {
    this(g);
  }
  
  public w(Comparator<? super K> paramComparator)
  {
    if (paramComparator != null) {}
    for (;;)
    {
      this.a = paramComparator;
      return;
      paramComparator = g;
    }
  }
  
  private void a(ad<K, V> paramad)
  {
    int m = 0;
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = localad2.b;
    ad localad4 = localad2.c;
    paramad.c = localad3;
    if (localad3 != null) {
      localad3.a = paramad;
    }
    a(paramad, localad2);
    localad2.b = paramad;
    paramad.a = localad2;
    int j;
    if (localad1 != null)
    {
      j = localad1.h;
      if (localad3 == null) {
        break label135;
      }
    }
    label135:
    for (int k = localad3.h;; k = 0)
    {
      paramad.h = (Math.max(j, k) + 1);
      k = paramad.h;
      j = m;
      if (localad4 != null) {
        j = localad4.h;
      }
      localad2.h = (Math.max(k, j) + 1);
      return;
      j = 0;
      break;
    }
  }
  
  private void a(ad<K, V> paramad1, ad<K, V> paramad2)
  {
    ad localad = paramad1.a;
    paramad1.a = null;
    if (paramad2 != null) {
      paramad2.a = localad;
    }
    if (localad != null)
    {
      if (localad.b == paramad1)
      {
        localad.b = paramad2;
        return;
      }
      if ((!f) && (localad.c != paramad1)) {
        throw new AssertionError();
      }
      localad.c = paramad2;
      return;
    }
    this.b = paramad2;
  }
  
  private boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  private void b(ad<K, V> paramad)
  {
    int m = 0;
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = localad1.b;
    ad localad4 = localad1.c;
    paramad.b = localad4;
    if (localad4 != null) {
      localad4.a = paramad;
    }
    a(paramad, localad1);
    localad1.c = paramad;
    paramad.a = localad1;
    int j;
    if (localad2 != null)
    {
      j = localad2.h;
      if (localad4 == null) {
        break label135;
      }
    }
    label135:
    for (int k = localad4.h;; k = 0)
    {
      paramad.h = (Math.max(j, k) + 1);
      k = paramad.h;
      j = m;
      if (localad3 != null) {
        j = localad3.h;
      }
      localad1.h = (Math.max(k, j) + 1);
      return;
      j = 0;
      break;
    }
  }
  
  private void b(ad<K, V> paramad, boolean paramBoolean)
  {
    ad localad1;
    ad localad2;
    int j;
    int k;
    label37:
    int m;
    ad localad3;
    if (paramad != null)
    {
      localad1 = paramad.b;
      localad2 = paramad.c;
      if (localad1 == null) {
        break label118;
      }
      j = localad1.h;
      if (localad2 == null) {
        break label124;
      }
      k = localad2.h;
      m = j - k;
      if (m != -2) {
        break label176;
      }
      localad1 = localad2.b;
      localad3 = localad2.c;
      if (localad3 == null) {
        break label130;
      }
      j = localad3.h;
      label76:
      if (localad1 == null) {
        break label136;
      }
      k = localad1.h;
      label86:
      j = k - j;
      if ((j != -1) && ((j != 0) || (paramBoolean))) {
        break label142;
      }
      a(paramad);
    }
    for (;;)
    {
      if (!paramBoolean) {
        break label249;
      }
      label117:
      return;
      label118:
      j = 0;
      break;
      label124:
      k = 0;
      break label37;
      label130:
      j = 0;
      break label76;
      label136:
      k = 0;
      break label86;
      label142:
      if ((!f) && (j != 1)) {
        throw new AssertionError();
      }
      b(localad2);
      a(paramad);
    }
    label176:
    if (m == 2)
    {
      localad2 = localad1.b;
      localad3 = localad1.c;
      if (localad3 != null)
      {
        j = localad3.h;
        label206:
        if (localad2 == null) {
          break label263;
        }
        k = localad2.h;
        label218:
        j = k - j;
        if ((j != 1) && ((j != 0) || (paramBoolean))) {
          break label269;
        }
        b(paramad);
        label245:
        if (paramBoolean) {
          break label300;
        }
      }
    }
    label249:
    label263:
    label269:
    label300:
    label320:
    do
    {
      do
      {
        paramad = paramad.a;
        break;
        j = 0;
        break label206;
        k = 0;
        break label218;
        if ((!f) && (j != -1)) {
          throw new AssertionError();
        }
        a(localad1);
        b(paramad);
        break label245;
        break label117;
        if (m != 0) {
          break label320;
        }
        paramad.h = (j + 1);
      } while (!paramBoolean);
      return;
      if ((!f) && (m != -1) && (m != 1)) {
        throw new AssertionError();
      }
      paramad.h = (Math.max(j, k) + 1);
    } while (paramBoolean);
  }
  
  ad<K, V> a(Object paramObject)
  {
    ad localad = null;
    if (paramObject != null) {}
    try
    {
      localad = a(paramObject, false);
      return localad;
    }
    catch (ClassCastException paramObject) {}
    return null;
  }
  
  ad<K, V> a(K paramK, boolean paramBoolean)
  {
    Object localObject3 = null;
    Comparator localComparator = this.a;
    Object localObject1 = this.b;
    int j;
    Object localObject2;
    if (localObject1 != null)
    {
      Comparable localComparable;
      if (localComparator == g)
      {
        localComparable = (Comparable)paramK;
        if (localComparable == null) {
          break label67;
        }
      }
      label58:
      label67:
      for (j = localComparable.compareTo(((ad)localObject1).f);; j = localComparator.compare(paramK, ((ad)localObject1).f))
      {
        if (j != 0) {
          break label84;
        }
        localObject2 = localObject1;
        return (ad<K, V>)localObject2;
        localComparable = null;
        break;
      }
      label84:
      if (j < 0)
      {
        localObject2 = ((ad)localObject1).b;
        label95:
        if (localObject2 != null) {
          break label175;
        }
      }
    }
    for (;;)
    {
      localObject2 = localObject3;
      if (!paramBoolean) {
        break label58;
      }
      localObject2 = this.e;
      if (localObject1 == null)
      {
        if ((localComparator == g) && (!(paramK instanceof Comparable)))
        {
          throw new ClassCastException(paramK.getClass().getName() + " is not Comparable");
          localObject2 = ((ad)localObject1).c;
          break label95;
          label175:
          localObject1 = localObject2;
          break;
        }
        paramK = new ad((ad)localObject1, paramK, (ad)localObject2, ((ad)localObject2).e);
        this.b = paramK;
        this.c += 1;
        this.d += 1;
        return paramK;
      }
      paramK = new ad((ad)localObject1, paramK, (ad)localObject2, ((ad)localObject2).e);
      if (j < 0) {
        ((ad)localObject1).b = paramK;
      }
      for (;;)
      {
        b((ad)localObject1, true);
        break;
        ((ad)localObject1).c = paramK;
      }
      j = 0;
    }
  }
  
  ad<K, V> a(Map.Entry<?, ?> paramEntry)
  {
    ad localad = a(paramEntry.getKey());
    if ((localad != null) && (a(localad.g, paramEntry.getValue()))) {}
    for (int j = 1; j != 0; j = 0) {
      return localad;
    }
    return null;
  }
  
  void a(ad<K, V> paramad, boolean paramBoolean)
  {
    int k = 0;
    if (paramBoolean)
    {
      paramad.e.d = paramad.d;
      paramad.d.e = paramad.e;
    }
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = paramad.a;
    int j;
    if ((localad1 != null) && (localad2 != null)) {
      if (localad1.h > localad2.h)
      {
        localad1 = localad1.b();
        a(localad1, false);
        localad2 = paramad.b;
        if (localad2 == null) {
          break label249;
        }
        j = localad2.h;
        localad1.b = localad2;
        localad2.a = localad1;
        paramad.b = null;
      }
    }
    for (;;)
    {
      localad2 = paramad.c;
      if (localad2 != null)
      {
        k = localad2.h;
        localad1.c = localad2;
        localad2.a = localad1;
        paramad.c = null;
      }
      localad1.h = (Math.max(j, k) + 1);
      a(paramad, localad1);
      return;
      localad1 = localad2.a();
      break;
      if (localad1 != null)
      {
        a(paramad, localad1);
        paramad.b = null;
      }
      for (;;)
      {
        b(localad3, false);
        this.c -= 1;
        this.d += 1;
        return;
        if (localad2 != null)
        {
          a(paramad, localad2);
          paramad.c = null;
        }
        else
        {
          a(paramad, null);
        }
      }
      label249:
      j = 0;
    }
  }
  
  ad<K, V> b(Object paramObject)
  {
    paramObject = a(paramObject);
    if (paramObject != null) {
      a((ad)paramObject, true);
    }
    return (ad<K, V>)paramObject;
  }
  
  public void clear()
  {
    this.b = null;
    this.c = 0;
    this.d += 1;
    ad localad = this.e;
    localad.e = localad;
    localad.d = localad;
  }
  
  public boolean containsKey(Object paramObject)
  {
    return a(paramObject) != null;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    y localy = this.h;
    if (localy != null) {
      return localy;
    }
    localy = new y(this);
    this.h = localy;
    return localy;
  }
  
  public V get(Object paramObject)
  {
    paramObject = a(paramObject);
    if (paramObject != null) {
      return (V)((ad)paramObject).g;
    }
    return null;
  }
  
  public Set<K> keySet()
  {
    aa localaa = this.i;
    if (localaa != null) {
      return localaa;
    }
    localaa = new aa(this);
    this.i = localaa;
    return localaa;
  }
  
  public V put(K paramK, V paramV)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    paramK = a(paramK, true);
    Object localObject = paramK.g;
    paramK.g = paramV;
    return (V)localObject;
  }
  
  public V remove(Object paramObject)
  {
    paramObject = b(paramObject);
    if (paramObject != null) {
      return (V)((ad)paramObject).g;
    }
    return null;
  }
  
  public int size()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */