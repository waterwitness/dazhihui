package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class t
  extends l
{
  protected Vector a = new Vector();
  
  private ar a(Enumeration paramEnumeration)
  {
    ar localar = (ar)paramEnumeration.nextElement();
    paramEnumeration = localar;
    if (localar == null) {
      paramEnumeration = bb.a;
    }
    return paramEnumeration;
  }
  
  public static t a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof t))) {
      return (t)paramObject;
    }
    throw new IllegalArgumentException("unknown object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static t a(x paramx, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!paramx.f()) {
        throw new IllegalArgumentException("object implicit - explicit expected.");
      }
      return (t)paramx.h();
    }
    if (paramx.f()) {
      return new bl(paramx.h());
    }
    if ((paramx.h() instanceof t)) {
      return (t)paramx.h();
    }
    e locale = new e();
    if ((paramx.h() instanceof r))
    {
      paramx = ((r)paramx.h()).e();
      while (paramx.hasMoreElements()) {
        locale.a((ar)paramx.nextElement());
      }
      return new bl(locale, false);
    }
    throw new IllegalArgumentException("unknown object in getInstance: " + paramx.getClass().getName());
  }
  
  private boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j = Math.min(paramArrayOfByte1.length, paramArrayOfByte2.length);
    int i = 0;
    if (i != j) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        if ((paramArrayOfByte1[i] & 0xFF) >= (paramArrayOfByte2[i] & 0xFF)) {}
      }
    }
    while (j == paramArrayOfByte1.length)
    {
      return true;
      return false;
      i += 1;
      break;
    }
    return false;
  }
  
  private byte[] b(ar paramar)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    p localp = new p(localByteArrayOutputStream);
    try
    {
      localp.a(paramar);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramar)
    {
      throw new IllegalArgumentException("cannot encode object added to SET");
    }
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
    if (!(parambd instanceof t)) {}
    do
    {
      return false;
      localObject1 = (t)parambd;
    } while (f() != ((t)localObject1).f());
    parambd = e();
    Object localObject1 = ((t)localObject1).e();
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
  
  protected void g()
  {
    if (this.a.size() > 1)
    {
      int m = this.a.size() - 1;
      int i = 1;
      while (i != 0)
      {
        Object localObject1 = b((ar)this.a.elementAt(0));
        int j = 0;
        int k = 0;
        i = 0;
        if (k != m)
        {
          Object localObject2 = b((ar)this.a.elementAt(k + 1));
          int n;
          if (a((byte[])localObject1, (byte[])localObject2))
          {
            n = j;
            j = i;
            i = n;
            localObject1 = localObject2;
          }
          for (;;)
          {
            k += 1;
            n = j;
            j = i;
            i = n;
            break;
            localObject2 = this.a.elementAt(k);
            this.a.setElementAt(this.a.elementAt(k + 1), k);
            this.a.setElementAt(localObject2, k + 1);
            j = 1;
            i = k;
          }
        }
        m = j;
      }
    }
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */