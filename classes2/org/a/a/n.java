package org.a.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.a.e.a;
import org.a.e.a.d;

public abstract class n
  extends l
  implements o
{
  byte[] a;
  
  public n(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("string cannot be null");
    }
    this.a = paramArrayOfByte;
  }
  
  public static n a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof n))) {
      return (n)paramObject;
    }
    if ((paramObject instanceof x)) {
      return a(((x)paramObject).h());
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  abstract void a(bh parambh);
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof n)) {
      return false;
    }
    parambd = (n)parambd;
    return a.a(this.a, parambd.a);
  }
  
  public InputStream e()
  {
    return new ByteArrayInputStream(this.a);
  }
  
  public byte[] f()
  {
    return this.a;
  }
  
  public bd g()
  {
    return c();
  }
  
  public int hashCode()
  {
    return a.a(f());
  }
  
  public String toString()
  {
    return "#" + new String(d.a(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */