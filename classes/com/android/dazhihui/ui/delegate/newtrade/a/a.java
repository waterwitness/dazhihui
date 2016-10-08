package com.android.dazhihui.ui.delegate.newtrade.a;

import com.android.dazhihui.g;
import com.android.dazhihui.ui.delegate.b.o;
import java.util.List;

public class a
{
  public static String[] a;
  public static String b = "大智慧测试";
  public static String c = null;
  public static boolean d = false;
  public static String e;
  public static List<com.android.dazhihui.ui.delegate.newtrade.b.a> f = null;
  public static List<com.android.dazhihui.ui.delegate.newtrade.b.a> g = null;
  public static List<com.android.dazhihui.ui.delegate.newtrade.b.a> h = null;
  public static List<com.android.dazhihui.ui.delegate.newtrade.b.a> i = null;
  public static List<com.android.dazhihui.ui.delegate.newtrade.b.a> j = null;
  private static com.android.dazhihui.ui.delegate.b.h k;
  private static String[] l = { "2003", "1017", "1005", "2002", "1205", "1203", "9006", "6129", "1202", "6130", "6131" };
  
  public static com.android.dazhihui.ui.delegate.b.h a(String paramString)
  {
    paramString = new com.android.dazhihui.ui.delegate.b.h(paramString);
    int m = 0;
    while (m < l.length)
    {
      paramString.a(l[m], k.a(l[m]));
      m += 1;
    }
    if (o.y == o.w) {
      paramString.a("1552", "1");
    }
    while (o.y != o.v) {
      return paramString;
    }
    paramString.a("1552", "0");
    return paramString;
  }
  
  public static void a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    k = paramh;
  }
  
  public static boolean a()
  {
    return com.android.dazhihui.ui.a.h.a().b() == 3;
  }
  
  public static void b()
  {
    f = null;
    g = null;
    h = null;
    i = null;
    j = null;
  }
  
  public static void c()
  {
    a = null;
    c = null;
    b();
    b.a();
    com.android.dazhihui.ui.delegate.b.a.j.b = null;
    g.a().g(null);
    k = null;
    d = false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */