package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.c.a.d;
import com.android.dazhihui.w;

public class pq
{
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    d locald = d.a();
    locald.a("guh_kanhaokankong" + paramString1 + str, new String[] { paramString2, paramString3, paramString4, paramString5, paramString6 });
    locald.g();
  }
  
  public static void a(String paramString, String[] paramArrayOfString)
  {
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    d locald = d.a();
    paramString = locald.f("guh_kanhaokankong" + paramString + str);
    locald.g();
    if ((paramString == null) || (paramString.length <= 0))
    {
      paramArrayOfString[0] = "0";
      paramArrayOfString[1] = "";
      paramArrayOfString[2] = "0";
      paramArrayOfString[3] = "0";
      paramArrayOfString[4] = "0";
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramString.length)
      {
        paramArrayOfString[i] = paramString[i];
        i += 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */