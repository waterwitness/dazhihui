package com.android.dazhihui.ui.delegate.screen.otc;

import com.android.dazhihui.ui.delegate.b.h;

public class w
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
  public static String[] k;
  public static String[] l;
  public static String[] m;
  public static String[] n;
  public static String[] o;
  public static String[] p;
  
  public static h a(h paramh)
  {
    String str1 = paramh.a("1325");
    int i1 = str1.indexOf(",");
    String str2 = str1.substring(0, i1);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12693").append(",");
    localStringBuilder2.append("12699").append(",");
    localStringBuilder2.append("12703").append(",");
    localStringBuilder2.append("12705").append(",");
    localStringBuilder2.append("12709").append(",");
    localStringBuilder2.append("12707").append(",");
    localStringBuilder2.append("12697").append(",");
    localStringBuilder2.append("12711");
    int i2 = Integer.valueOf(str2).intValue();
    str1 = str1.substring(i1 + 1, str1.length());
    localStringBuilder1.append(i2 + 8).append(",");
    localStringBuilder1.append(str1).append(",");
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
  
  public static void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramString.equals("12693"))
    {
      a = paramArrayOfString1;
      b = paramArrayOfString2;
    }
    do
    {
      return;
      if (paramString.equals("12699"))
      {
        c = paramArrayOfString1;
        d = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12703"))
      {
        e = paramArrayOfString1;
        f = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12705"))
      {
        g = paramArrayOfString1;
        h = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12709"))
      {
        i = paramArrayOfString1;
        j = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12707"))
      {
        k = paramArrayOfString1;
        l = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12697"))
      {
        m = paramArrayOfString1;
        n = paramArrayOfString2;
        return;
      }
    } while (!paramString.equals("12711"));
    o = paramArrayOfString1;
    p = paramArrayOfString2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */