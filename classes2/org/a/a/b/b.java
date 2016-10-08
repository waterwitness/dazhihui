package org.a.a.b;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.a.a.be;
import org.a.a.e;

public class b
{
  private Hashtable a = new Hashtable();
  
  public b(Hashtable paramHashtable) {}
  
  private Hashtable a(Hashtable paramHashtable)
  {
    Hashtable localHashtable = new Hashtable();
    Enumeration localEnumeration = paramHashtable.keys();
    while (localEnumeration.hasMoreElements())
    {
      Object localObject = localEnumeration.nextElement();
      localHashtable.put(localObject, paramHashtable.get(localObject));
    }
    return localHashtable;
  }
  
  public Hashtable a()
  {
    return a(this.a);
  }
  
  public a a(be parambe)
  {
    parambe = this.a.get(parambe);
    if ((parambe instanceof Vector)) {
      return (a)((Vector)parambe).elementAt(0);
    }
    return (a)parambe;
  }
  
  public e b()
  {
    e locale = new e();
    Enumeration localEnumeration = this.a.elements();
    while (localEnumeration.hasMoreElements())
    {
      Object localObject = localEnumeration.nextElement();
      if ((localObject instanceof Vector))
      {
        localObject = ((Vector)localObject).elements();
        while (((Enumeration)localObject).hasMoreElements()) {
          locale.a(a.a(((Enumeration)localObject).nextElement()));
        }
      }
      else
      {
        locale.a(a.a(localObject));
      }
    }
    return locale;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */