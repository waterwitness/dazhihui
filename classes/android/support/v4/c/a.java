package android.support.v4.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V>
  extends q<K, V>
  implements Map<K, V>
{
  h<K, V> a;
  
  private h<K, V> b()
  {
    if (this.a == null) {
      this.a = new b(this);
    }
    return this.a;
  }
  
  public boolean a(Collection<?> paramCollection)
  {
    return h.c(this, paramCollection);
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    return b().d();
  }
  
  public Set<K> keySet()
  {
    return b().e();
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.h + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    return b().f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */