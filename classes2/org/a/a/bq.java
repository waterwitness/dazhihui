package org.a.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bq
  extends l
{
  String a;
  
  public bq(String paramString)
  {
    this.a = paramString;
    try
    {
      e();
      return;
    }
    catch (ParseException paramString)
    {
      throw new IllegalArgumentException("invalid date string: " + paramString.getMessage());
    }
  }
  
  bq(byte[] paramArrayOfByte)
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
  
  private byte[] h()
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
  
  void a(bh parambh)
  {
    parambh.a(23, h());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof bq)) {
      return false;
    }
    return this.a.equals(((bq)parambd).a);
  }
  
  public Date e()
  {
    return new SimpleDateFormat("yyMMddHHmmssz").parse(f());
  }
  
  public String f()
  {
    if ((this.a.indexOf('-') < 0) && (this.a.indexOf('+') < 0))
    {
      if (this.a.length() == 11) {
        return this.a.substring(0, 10) + "00GMT+00:00";
      }
      return this.a.substring(0, 12) + "GMT+00:00";
    }
    int j = this.a.indexOf('-');
    int i = j;
    if (j < 0) {
      i = this.a.indexOf('+');
    }
    String str2 = this.a;
    String str1 = str2;
    if (i == this.a.length() - 3) {
      str1 = str2 + "00";
    }
    if (i == 10) {
      return str1.substring(0, 10) + "00GMT" + str1.substring(10, 13) + ":" + str1.substring(13, 15);
    }
    return str1.substring(0, 12) + "GMT" + str1.substring(12, 15) + ":" + str1.substring(15, 17);
  }
  
  public String g()
  {
    String str = f();
    if (str.charAt(0) < '5') {
      return "20" + str;
    }
    return "19" + str;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */