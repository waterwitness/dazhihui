package com.android.dazhihui.ui.delegate.screen.fund;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class bz
{
  public static String a(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  public static String a(String paramString, int paramInt)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    try
    {
      paramString = localSimpleDateFormat.parse(paramString);
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTime(paramString);
      localCalendar.add(5, paramInt);
      paramString = localSimpleDateFormat.format(localCalendar.getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return "";
  }
  
  public static String a(String[][] paramArrayOfString, String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramArrayOfString.length) {
      if (paramArrayOfString[i][paramInt1].equals(paramString)) {
        paramArrayOfString = paramArrayOfString[i][paramInt2];
      }
    }
    do
    {
      return paramArrayOfString;
      i += 1;
      break;
      paramArrayOfString = paramString;
    } while (paramString != null);
    return "";
  }
  
  public static boolean a(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  public static int b(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return 0;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = paramString.toCharArray();
    while (i < paramString.length)
    {
      if (a(paramString[i])) {
        localStringBuilder.append(paramString[i]);
      }
      i += 1;
    }
    return Integer.valueOf(localStringBuilder.toString()).intValue();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */