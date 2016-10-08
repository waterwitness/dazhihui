package org.a.a;

public class bu
  extends l
  implements bn
{
  String a;
  
  public bu(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length];
    int i = 0;
    while (i != arrayOfChar.length)
    {
      arrayOfChar[i] = ((char)(paramArrayOfByte[i] & 0xFF));
      i += 1;
    }
    this.a = new String(arrayOfChar);
  }
  
  void a(bh parambh)
  {
    parambh.a(26, e());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof bu)) {
      return false;
    }
    return i_().equals(((bu)parambd).i_());
  }
  
  public byte[] e()
  {
    char[] arrayOfChar = this.a.toCharArray();
    byte[] arrayOfByte = new byte[arrayOfChar.length];
    int i = 0;
    while (i != arrayOfChar.length)
    {
      arrayOfByte[i] = ((byte)arrayOfChar[i]);
      i += 1;
    }
    return arrayOfByte;
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */