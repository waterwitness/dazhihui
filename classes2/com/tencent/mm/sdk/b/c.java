package com.tencent.mm.sdk.b;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class c<K, V>
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int size;
  private final LinkedHashMap<K, V> u;
  private int v;
  
  private void trimToSize(int paramInt)
  {
    try
    {
      if ((this.size < 0) || ((this.u.isEmpty()) && (this.size != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.size <= paramInt) || (this.u.isEmpty())) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)this.u.entrySet().iterator().next();
      Object localObject2 = localEntry.getKey();
      localEntry.getValue();
      this.u.remove(localObject2);
      this.size -= 1;
      this.B += 1;
    }
  }
  
  public final boolean a(K paramK)
  {
    try
    {
      boolean bool = this.u.containsKey(paramK);
      return bool;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public final V get(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    try
    {
      paramK = this.u.get(paramK);
      if (paramK != null)
      {
        this.C += 1;
        return paramK;
      }
      this.D += 1;
      return null;
    }
    finally {}
  }
  
  public final V put(K paramK, V paramV)
  {
    if ((paramK == null) || (paramV == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.A += 1;
      this.size += 1;
      paramK = this.u.put(paramK, paramV);
      if (paramK != null) {
        this.size -= 1;
      }
      trimToSize(this.v);
      return paramK;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.C + this.D;
      if (j != 0) {
        i = this.C * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.v), Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */