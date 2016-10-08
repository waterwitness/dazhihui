package com.android.dazhihui.ui.delegate.screen.newstock;

import com.android.dazhihui.ui.delegate.b.h;

public class a
{
  public static String[] a = { "" };
  public static String[] b = { "" };
  public static String[] c = { "" };
  public static String[] d = { "" };
  public static String[] e = { "" };
  public static String[] f = { "" };
  public static String[] g = { "" };
  public static String[] h = { "" };
  public static String[] i = { "" };
  public static String[] j = { "" };
  public static String[] k = { "" };
  public static String[] l = { "" };
  public static String[] m = { "" };
  public static String[] n = { "" };
  public static String[] o = { "" };
  public static String[] p = { "" };
  public static String[] q = { "" };
  public static String[] r = { "" };
  public static String[] s = { "" };
  public static String[] t = { "" };
  
  public static h a(h paramh)
  {
    String str1 = paramh.a("1325");
    int i1 = str1.indexOf(",");
    String str2 = str1.substring(0, i1);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12935").append(",");
    localStringBuilder2.append("12927").append(",");
    localStringBuilder2.append("12925");
    int i2 = Integer.valueOf(str2).intValue();
    str1 = str1.substring(i1 + 1, str1.length());
    localStringBuilder1.append(i2 + 3).append(",");
    localStringBuilder1.append(str1).append(",");
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
  
  public static void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramString.equals("11149"))
    {
      a = paramArrayOfString1;
      b = paramArrayOfString2;
    }
    do
    {
      return;
      if (paramString.equals("12025"))
      {
        c = paramArrayOfString1;
        d = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12935"))
      {
        e = paramArrayOfString1;
        f = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12927"))
      {
        g = paramArrayOfString1;
        h = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12925"))
      {
        i = paramArrayOfString1;
        j = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12939"))
      {
        k = paramArrayOfString1;
        l = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12511"))
      {
        m = paramArrayOfString1;
        n = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12523"))
      {
        o = paramArrayOfString1;
        p = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12941"))
      {
        q = paramArrayOfString1;
        r = paramArrayOfString2;
        return;
      }
    } while (!paramString.equals("12949"));
    s = paramArrayOfString1;
    t = paramArrayOfString2;
  }
  
  public static h b(h paramh)
  {
    String str1 = paramh.a("1325");
    int i1 = str1.indexOf(",");
    String str2 = str1.substring(0, i1);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12939").append(",");
    localStringBuilder2.append("12511").append(",");
    localStringBuilder2.append("12523");
    int i2 = Integer.valueOf(str2).intValue();
    str1 = str1.substring(i1 + 1, str1.length());
    localStringBuilder1.append(i2 + 3).append(",");
    localStringBuilder1.append(str1).append(",");
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */