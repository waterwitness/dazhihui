package org.a.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class ay
  extends l
{
  String a;
  
  public ay(String paramString)
  {
    this.a = paramString;
    try
    {
      f();
      return;
    }
    catch (ParseException paramString)
    {
      throw new IllegalArgumentException("invalid date string: " + paramString.getMessage());
    }
  }
  
  ay(byte[] paramArrayOfByte)
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
  
  private String a(int paramInt)
  {
    if (paramInt < 10) {
      return "0" + paramInt;
    }
    return Integer.toString(paramInt);
  }
  
  private String g()
  {
    String str = "+";
    TimeZone localTimeZone = TimeZone.getDefault();
    int i = localTimeZone.getRawOffset();
    int j = i;
    if (i < 0)
    {
      str = "-";
      j = -i;
    }
    i = j / 3600000;
    int k = (j - i * 60 * 60 * 1000) / 60000;
    for (;;)
    {
      try
      {
        if ((!localTimeZone.useDaylightTime()) || (!localTimeZone.inDaylightTime(f()))) {
          continue;
        }
        boolean bool = str.equals("+");
        if (!bool) {
          continue;
        }
        j = 1;
        i = j + i;
      }
      catch (ParseException localParseException)
      {
        continue;
        continue;
      }
      return "GMT" + str + a(i) + ":" + a(k);
      j = -1;
    }
  }
  
  private boolean h()
  {
    return this.a.indexOf('.') == 14;
  }
  
  private byte[] i()
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
    parambh.a(24, i());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof ay)) {
      return false;
    }
    return this.a.equals(((ay)parambd).a);
  }
  
  public String e()
  {
    if (this.a.charAt(this.a.length() - 1) == 'Z') {
      return this.a.substring(0, this.a.length() - 1) + "GMT+00:00";
    }
    int i = this.a.length() - 5;
    int j = this.a.charAt(i);
    if ((j == 45) || (j == 43)) {
      return this.a.substring(0, i) + "GMT" + this.a.substring(i, i + 3) + ":" + this.a.substring(i + 3);
    }
    i = this.a.length() - 3;
    j = this.a.charAt(i);
    if ((j == 45) || (j == 43)) {
      return this.a.substring(0, i) + "GMT" + this.a.substring(i) + ":00";
    }
    return this.a + g();
  }
  
  public Date f()
  {
    Object localObject2 = this.a;
    Object localObject1;
    Object localObject3;
    String str;
    int i;
    if (this.a.endsWith("Z")) {
      if (h())
      {
        localObject1 = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
        ((SimpleDateFormat)localObject1).setTimeZone(new SimpleTimeZone(0, "Z"));
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject1;
        if (h())
        {
          str = ((String)localObject1).substring(14);
          i = 1;
          label72:
          if (i < str.length())
          {
            int j = str.charAt(i);
            if ((48 <= j) && (j <= 57)) {
              break label323;
            }
          }
          if (i - 1 <= 3) {
            break label332;
          }
          localObject2 = str.substring(0, 4) + str.substring(i);
          localObject2 = ((String)localObject1).substring(0, 14) + (String)localObject2;
        }
      }
    }
    for (;;)
    {
      return ((SimpleDateFormat)localObject3).parse((String)localObject2);
      localObject1 = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
      break;
      if ((this.a.indexOf('-') > 0) || (this.a.indexOf('+') > 0))
      {
        localObject2 = e();
        if (h()) {}
        for (localObject1 = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");; localObject1 = new SimpleDateFormat("yyyyMMddHHmmssz"))
        {
          ((SimpleDateFormat)localObject1).setTimeZone(new SimpleTimeZone(0, "Z"));
          localObject3 = localObject1;
          localObject1 = localObject2;
          break;
        }
      }
      if (h()) {}
      for (localObject1 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");; localObject1 = new SimpleDateFormat("yyyyMMddHHmmss"))
      {
        ((SimpleDateFormat)localObject1).setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        localObject3 = localObject1;
        localObject1 = localObject2;
        break;
      }
      label323:
      i += 1;
      break label72;
      label332:
      if (i - 1 == 1)
      {
        localObject2 = str.substring(0, i) + "00" + str.substring(i);
        localObject2 = ((String)localObject1).substring(0, 14) + (String)localObject2;
      }
      else
      {
        localObject2 = localObject1;
        if (i - 1 == 2)
        {
          localObject2 = str.substring(0, i) + "0" + str.substring(i);
          localObject2 = ((String)localObject1).substring(0, 14) + (String)localObject2;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */