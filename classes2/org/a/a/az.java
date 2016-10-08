package org.a.a;

public class az
  extends l
  implements bn
{
  String a;
  
  public az(String paramString)
  {
    this(paramString, false);
  }
  
  public az(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      throw new NullPointerException("string cannot be null");
    }
    if ((paramBoolean) && (!b(paramString))) {
      throw new IllegalArgumentException("string contains illegal characters");
    }
    this.a = paramString;
  }
  
  public az(byte[] paramArrayOfByte)
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
  
  public static boolean b(String paramString)
  {
    int i = paramString.length() - 1;
    while (i >= 0)
    {
      if (paramString.charAt(i) > '') {
        return false;
      }
      i -= 1;
    }
    return true;
  }
  
  void a(bh parambh)
  {
    parambh.a(22, e());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof az)) {
      return false;
    }
    parambd = (az)parambd;
    return i_().equals(parambd.i_());
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */