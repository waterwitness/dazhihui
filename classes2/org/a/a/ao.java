package org.a.a;

public class ao
  extends l
  implements bn
{
  String a;
  
  public ao(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length / 2];
    int i = 0;
    while (i != arrayOfChar.length)
    {
      arrayOfChar[i] = ((char)(paramArrayOfByte[(i * 2)] << 8 | paramArrayOfByte[(i * 2 + 1)] & 0xFF));
      i += 1;
    }
    this.a = new String(arrayOfChar);
  }
  
  void a(bh parambh)
  {
    char[] arrayOfChar = this.a.toCharArray();
    byte[] arrayOfByte = new byte[arrayOfChar.length * 2];
    int i = 0;
    while (i != arrayOfChar.length)
    {
      arrayOfByte[(i * 2)] = ((byte)(arrayOfChar[i] >> '\b'));
      arrayOfByte[(i * 2 + 1)] = ((byte)arrayOfChar[i]);
      i += 1;
    }
    parambh.a(30, arrayOfByte);
  }
  
  protected boolean a(bd parambd)
  {
    if (!(parambd instanceof ao)) {
      return false;
    }
    parambd = (ao)parambd;
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */