package org.a.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class r
  extends l
{
  private Vector a = new Vector();
  
  private ar a(Enumeration paramEnumeration)
  {
    ar localar = (ar)paramEnumeration.nextElement();
    paramEnumeration = localar;
    if (localar == null) {
      paramEnumeration = bb.a;
    }
    return paramEnumeration;
  }
  
  public static r a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof r))) {
      return (r)paramObject;
    }
    if ((paramObject instanceof byte[])) {
      try
      {
        paramObject = a(l.a((byte[])paramObject));
        return (r)paramObject;
      }
      catch (IOException paramObject)
      {
        throw new IllegalArgumentException("failed to construct sequence from byte[]: " + ((IOException)paramObject).getMessage());
      }
    }
    throw new IllegalArgumentException("unknown object in getInstance: " + paramObject.getClass().getName());
  }
  
  public ar a(int paramInt)
  {
    return (ar)this.a.elementAt(paramInt);
  }
  
  protected void a(ar paramar)
  {
    this.a.addElement(paramar);
  }
  
  abstract void a(bh parambh);
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof r)) {}
    do
    {
      return false;
      localObject1 = (r)parambd;
    } while (f() != ((r)localObject1).f());
    parambd = e();
    Object localObject1 = ((r)localObject1).e();
    for (;;)
    {
      if (!parambd.hasMoreElements()) {
        break label91;
      }
      Object localObject3 = a(parambd);
      Object localObject2 = a((Enumeration)localObject1);
      localObject3 = ((ar)localObject3).c();
      localObject2 = ((ar)localObject2).c();
      if (localObject3 != localObject2) {
        if (!((bd)localObject3).equals(localObject2)) {
          break;
        }
      }
    }
    label91:
    return true;
  }
  
  public Enumeration e()
  {
    return this.a.elements();
  }
  
  public int f()
  {
    return this.a.size();
  }
  
  public int hashCode()
  {
    Enumeration localEnumeration = e();
    for (int i = f(); localEnumeration.hasMoreElements(); i = i * 17 ^ a(localEnumeration).hashCode()) {}
    return i;
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */