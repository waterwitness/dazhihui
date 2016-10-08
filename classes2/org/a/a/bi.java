package org.a.a;

public class bi
  extends l
  implements bn
{
  String a;
  
  public bi(String paramString)
  {
    this(paramString, false);
  }
  
  public bi(String paramString, boolean paramBoolean)
  {
    if ((paramBoolean) && (!b(paramString))) {
      throw new IllegalArgumentException("string contains illegal characters");
    }
    this.a = paramString;
  }
  
  public bi(byte[] paramArrayOfByte)
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
    if (i >= 0)
    {
      int j = paramString.charAt(i);
      if (j > 127) {
        return false;
      }
      if ((97 <= j) && (j <= 122)) {}
      while (((65 <= j) && (j <= 90)) || ((48 <= j) && (j <= 57)))
      {
        i -= 1;
        break;
      }
      switch (j)
      {
      }
      return false;
    }
    return true;
  }
  
  void a(bh parambh)
  {
    parambh.a(19, e());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof bi)) {
      return false;
    }
    parambd = (bi)parambd;
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */