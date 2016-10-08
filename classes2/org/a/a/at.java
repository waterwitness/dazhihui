package org.a.a;

import org.a.e.a;

public class at
  extends l
{
  byte[] a;
  
  public at(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  void a(bh parambh)
  {
    parambh.a(10, this.a);
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof at)) {
      return false;
    }
    parambd = (at)parambd;
    return a.a(this.a, parambd.a);
  }
  
  public int hashCode()
  {
    return a.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */