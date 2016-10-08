package org.a.a;

import org.a.e.b;

public class br
  extends l
  implements bn
{
  String a;
  
  public br(String paramString)
  {
    this.a = paramString;
  }
  
  public br(byte[] paramArrayOfByte)
  {
    try
    {
      this.a = b.a(paramArrayOfByte);
      return;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
    {
      throw new IllegalArgumentException("UTF8 encoding invalid");
    }
  }
  
  void a(bh parambh)
  {
    parambh.a(12, b.a(this.a));
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof br)) {
      return false;
    }
    parambd = (br)parambd;
    return i_().equals(parambd.i_());
  }
  
  public int hashCode()
  {
    return i_().hashCode();
  }
  
  public String i_()
  {
    return this.a;
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */