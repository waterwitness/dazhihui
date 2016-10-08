package com.alipay.b.b.a.a;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class t
{
  private static final Pattern a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");
  private static final Pattern b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");
  
  public static long a(String paramString)
  {
    int m = 1;
    Object localObject = a.matcher(paramString);
    int k;
    int j;
    int i;
    if (((Matcher)localObject).find())
    {
      k = b(((Matcher)localObject).group(1));
      j = c(((Matcher)localObject).group(2));
      i = d(((Matcher)localObject).group(3));
      paramString = e(((Matcher)localObject).group(4));
      if (i < 2038) {
        break label171;
      }
      i = 2038;
      j = 0;
      k = m;
    }
    label171:
    for (;;)
    {
      localObject = new Time("UTC");
      ((Time)localObject).set(paramString.c, paramString.b, paramString.a, k, j, i);
      return ((Time)localObject).toMillis(false);
      localObject = b.matcher(paramString);
      if (((Matcher)localObject).find())
      {
        j = c(((Matcher)localObject).group(1));
        k = b(((Matcher)localObject).group(2));
        paramString = e(((Matcher)localObject).group(3));
        i = d(((Matcher)localObject).group(4));
        break;
      }
      throw new IllegalArgumentException();
    }
  }
  
  private static int b(String paramString)
  {
    if (paramString.length() == 2) {
      return (paramString.charAt(0) - '0') * 10 + (paramString.charAt(1) - '0');
    }
    return paramString.charAt(0) - '0';
  }
  
  private static int c(String paramString)
  {
    int i = 0;
    switch (Character.toLowerCase(paramString.charAt(0)) + Character.toLowerCase(paramString.charAt(1)) + Character.toLowerCase(paramString.charAt(2)) - 291)
    {
    default: 
      throw new IllegalArgumentException();
    case 10: 
      i = 1;
    case 22: 
      return i;
    case 29: 
      return 2;
    case 32: 
      return 3;
    case 36: 
      return 4;
    case 42: 
      return 5;
    case 40: 
      return 6;
    case 26: 
      return 7;
    case 37: 
      return 8;
    case 35: 
      return 9;
    case 48: 
      return 10;
    }
    return 11;
  }
  
  private static int d(String paramString)
  {
    if (paramString.length() == 2)
    {
      int i = (paramString.charAt(0) - '0') * 10 + (paramString.charAt(1) - '0');
      if (i >= 70) {
        return i + 1900;
      }
      return i + 2000;
    }
    if (paramString.length() == 3) {
      return (paramString.charAt(0) - '0') * 100 + (paramString.charAt(1) - '0') * 10 + (paramString.charAt(2) - '0') + 1900;
    }
    if (paramString.length() == 4) {
      return (paramString.charAt(0) - '0') * 1000 + (paramString.charAt(1) - '0') * 100 + (paramString.charAt(2) - '0') * 10 + (paramString.charAt(3) - '0');
    }
    return 1970;
  }
  
  private static u e(String paramString)
  {
    int i = paramString.charAt(0) - '0';
    int j;
    if (paramString.charAt(1) != ':')
    {
      j = 2;
      i = i * 10 + (paramString.charAt(1) - '0');
    }
    for (;;)
    {
      int k = j + 1;
      j = k + 1;
      k = paramString.charAt(k);
      int m = paramString.charAt(j);
      j = j + 1 + 1;
      return new u(i, (k - 48) * 10 + (m - 48), (paramString.charAt(j) - '0') * 10 + (paramString.charAt(j + 1) - '0'));
      j = 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */