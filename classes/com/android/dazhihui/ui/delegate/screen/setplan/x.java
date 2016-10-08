package com.android.dazhihui.ui.delegate.screen.setplan;

import com.android.dazhihui.ui.delegate.b.h;

public class x
{
  public static String[] a;
  public static String[] b;
  public static String[] c;
  public static String[] d;
  public static String[] e;
  public static String[] f;
  public static String[] g;
  public static String[] h;
  public static String[] i;
  public static String[] j;
  
  public static h a(h paramh)
  {
    String str1 = paramh.a("1325");
    int k = str1.indexOf(",");
    String str2 = str1.substring(0, k);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12849").append(",");
    localStringBuilder2.append("12861").append(",");
    localStringBuilder2.append("12863").append(",");
    localStringBuilder2.append("12865").append(",");
    localStringBuilder2.append("12855");
    int m = Integer.valueOf(str2).intValue();
    str1 = str1.substring(k + 1, str1.length());
    localStringBuilder1.append(m + 5).append(",");
    localStringBuilder1.append(str1).append(",");
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
  
  public static void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramString.equals("12849"))
    {
      a = paramArrayOfString1;
      b = paramArrayOfString2;
    }
    do
    {
      return;
      if (paramString.equals("12861"))
      {
        c = paramArrayOfString1;
        d = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12863"))
      {
        e = paramArrayOfString1;
        f = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12865"))
      {
        g = paramArrayOfString1;
        h = paramArrayOfString2;
        return;
      }
    } while (!paramString.equals("12855"));
    i = paramArrayOfString1;
    j = paramArrayOfString2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */