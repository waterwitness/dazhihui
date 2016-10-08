package com.iflytek.thirdparty;

public class ax
{
  public static final String[] a = { "134", "135", "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "182", "187", "188" };
  public static final String[] b = { "130", "131", "132", "155", "156", "185", "186" };
  public static final String[] c = { "133", "153", "180", "189" };
  
  public static String a(String paramString)
  {
    String str = paramString;
    StringBuilder localStringBuilder;
    if (paramString != null)
    {
      paramString = paramString.replaceAll(" ", "").replaceAll("-", "");
      localStringBuilder = new StringBuilder(paramString);
      str = paramString;
      if (localStringBuilder.length() > 5)
      {
        if ((!localStringBuilder.substring(0, 3).equals("+86")) && (!localStringBuilder.substring(0, 3).equals("086"))) {
          break label81;
        }
        str = localStringBuilder.substring(3, localStringBuilder.length());
      }
    }
    label81:
    do
    {
      return str;
      if (localStringBuilder.substring(0, 2).equals("86")) {
        return localStringBuilder.substring(2, localStringBuilder.length());
      }
      if ((localStringBuilder.substring(0, 5).equals("12530")) || (localStringBuilder.substring(0, 5).equals("12520")) || (localStringBuilder.substring(0, 5).equals("17951")) || (localStringBuilder.substring(0, 5).equals("17911"))) {
        break;
      }
      str = paramString;
    } while (!localStringBuilder.subSequence(0, 5).equals("12593"));
    return localStringBuilder.substring(5, localStringBuilder.length());
  }
  
  public static String a(String[] paramArrayOfString, char paramChar)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        if (str != null)
        {
          localStringBuilder.append(str);
          localStringBuilder.append(paramChar);
        }
        i += 1;
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */