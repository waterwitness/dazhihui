package org.a.b;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import org.a.a.ar;
import org.a.a.b.a;
import org.a.a.b.c;
import org.a.a.b.j;
import org.a.a.be;
import org.a.a.bf;
import org.a.a.bl;

public class o
  implements b
{
  private final Hashtable a = new Hashtable();
  
  public org.a.a.b.b a(Map paramMap)
  {
    return new org.a.a.b.b(b(paramMap));
  }
  
  protected Hashtable b(Map paramMap)
  {
    Hashtable localHashtable = (Hashtable)this.a.clone();
    Object localObject;
    if (!localHashtable.containsKey(c.a))
    {
      localObject = (be)paramMap.get("contentType");
      if (localObject != null)
      {
        localObject = new a(c.a, new bl((ar)localObject));
        localHashtable.put(((a)localObject).e(), localObject);
      }
    }
    if (!localHashtable.containsKey(c.c))
    {
      localObject = new Date();
      localObject = new a(c.c, new bl(new j((Date)localObject)));
      localHashtable.put(((a)localObject).e(), localObject);
    }
    if (!localHashtable.containsKey(c.b))
    {
      paramMap = (byte[])paramMap.get("digest");
      paramMap = new a(c.b, new bl(new bf(paramMap)));
      localHashtable.put(paramMap.e(), paramMap);
    }
    return localHashtable;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */