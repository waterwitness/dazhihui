package org.a.a;

public class bo
  extends l
  implements bn
{
  String a;
  
  public bo(byte[] paramArrayOfByte)
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
    parambh.a(20, e());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof bo)) {
      return false;
    }
    return i_().equals(((bo)parambd).i_());
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */