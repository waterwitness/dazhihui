package com.c.a.b;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class y
  extends AbstractSet<Map.Entry<K, V>>
{
  y(w paramw) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return ((paramObject instanceof Map.Entry)) && (this.a.a((Map.Entry)paramObject) != null);
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new z(this);
  }
  
  public boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry)) {}
    do
    {
      return false;
      paramObject = this.a.a((Map.Entry)paramObject);
    } while (paramObject == null);
    this.a.a((ad)paramObject, true);
    return true;
  }
  
  public int size()
  {
    return this.a.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */