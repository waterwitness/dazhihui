package com.android.dazhihui.ui.model.stock;

import a.a.a.a.b;
import a.a.a.a.c;
import a.a.a.a.d;
import a.a.a.e;

public class PinyinGen
{
  private static String[][] DoExchange(String[][] paramArrayOfString)
  {
    int m = 2;
    int n = paramArrayOfString.length;
    Object localObject = paramArrayOfString;
    if (n >= 2)
    {
      int i1 = paramArrayOfString[0].length;
      int i2 = paramArrayOfString[1].length;
      localObject = new String[i1 * i2];
      int j = 0;
      int i = 0;
      while (j < i1)
      {
        int k = 0;
        while (k < i2)
        {
          localObject[i] = (paramArrayOfString[0][j] + paramArrayOfString[1][k]);
          i += 1;
          k += 1;
        }
        j += 1;
      }
      String[][] arrayOfString = new String[n - 1][];
      i = m;
      while (i < n)
      {
        arrayOfString[(i - 1)] = paramArrayOfString[i];
        i += 1;
      }
      arrayOfString[0] = localObject;
      localObject = DoExchange(arrayOfString);
    }
    return (String[][])localObject;
  }
  
  private static String[] Exchange(String[][] paramArrayOfString)
  {
    return DoExchange(paramArrayOfString)[0];
  }
  
  private static String[] getHeaderLetters(char paramChar, b paramb)
  {
    String[] arrayOfString = e.a(paramChar, paramb);
    Object localObject = null;
    paramb = (b)localObject;
    if (arrayOfString != null)
    {
      paramb = (b)localObject;
      if (arrayOfString.length > 0)
      {
        paramb = new String[arrayOfString.length];
        int i = 0;
        while (i < paramb.length)
        {
          paramb[i] = arrayOfString[i].substring(0, 1);
          i += 1;
        }
      }
    }
    return paramb;
  }
  
  public static String[] getPinyins(String paramString)
  {
    if ((paramString != null) && (!paramString.trim().equalsIgnoreCase("")))
    {
      char[] arrayOfChar = paramString.toCharArray();
      b localb = new b();
      localb.a(a.a.a.a.a.a);
      localb.a(c.b);
      localb.a(d.b);
      paramString = new String[paramString.length()][];
      int i = 0;
      if (i < arrayOfChar.length)
      {
        char c = arrayOfChar[i];
        if (String.valueOf(c).matches("[\\u4E00-\\u9FA5]+")) {}
        for (;;)
        {
          try
          {
            paramString[i] = getHeaderLetters(arrayOfChar[i], localb);
            i += 1;
          }
          catch (a.a.a.a.a.a locala)
          {
            locala.printStackTrace();
            continue;
          }
          if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))) {
            paramString[i] = { String.valueOf(arrayOfChar[i]) };
          } else {
            paramString[i] = { "" };
          }
        }
      }
      return Exchange(paramString);
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\PinyinGen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */