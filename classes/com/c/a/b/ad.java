package com.c.a.b;

import java.util.Map.Entry;

final class ad<K, V>
  implements Map.Entry<K, V>
{
  ad<K, V> a;
  ad<K, V> b;
  ad<K, V> c;
  ad<K, V> d;
  ad<K, V> e;
  final K f;
  V g;
  int h;
  
  ad()
  {
    this.f = null;
    this.e = this;
    this.d = this;
  }
  
  ad(ad<K, V> paramad1, K paramK, ad<K, V> paramad2, ad<K, V> paramad3)
  {
    this.a = paramad1;
    this.f = paramK;
    this.h = 1;
    this.d = paramad2;
    this.e = paramad3;
    paramad3.d = this;
    paramad2.e = this;
  }
  
  public ad<K, V> a()
  {
    Object localObject1 = this.b;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      ad localad = ((ad)localObject1).b;
      localObject2 = localObject1;
      localObject1 = localad;
    }
    return (ad<K, V>)localObject2;
  }
  
  public ad<K, V> b()
  {
    Object localObject1 = this.c;
    Object localObject2 = this;
    while (localObject1 != null)
    {
      ad localad = ((ad)localObject1).c;
      localObject2 = localObject1;
      localObject1 = localad;
    }
    return (ad<K, V>)localObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if (this.f != null) {
        break label56;
      }
      bool1 = bool2;
      if (((Map.Entry)paramObject).getKey() == null)
      {
        if (this.g != null) {
          break label77;
        }
        bool1 = bool2;
        if (((Map.Entry)paramObject).getValue() != null) {}
      }
    }
    for (;;)
    {
      bool1 = true;
      label56:
      label77:
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (!this.f.equals(((Map.Entry)paramObject).getKey()));
        break;
        bool1 = bool2;
      } while (!this.g.equals(((Map.Entry)paramObject).getValue()));
    }
  }
  
  public K getKey()
  {
    return (K)this.f;
  }
  
  public V getValue()
  {
    return (V)this.g;
  }
  
  public int hashCode()
  {
    int j = 0;
    int i;
    if (this.f == null)
    {
      i = 0;
      if (this.g != null) {
        break label33;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.f.hashCode();
      break;
      label33:
      j = this.g.hashCode();
    }
  }
  
  public V setValue(V paramV)
  {
    Object localObject = this.g;
    this.g = paramV;
    return (V)localObject;
  }
  
  public String toString()
  {
    return this.f + "=" + this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */