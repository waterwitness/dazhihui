package com.baidu.location.f.a;

import android.content.Context;
import android.text.TextUtils;

public class a
{
  private static final String a = a.class.getSimpleName();
  
  public static String a(Context paramContext)
  {
    String str2 = b(paramContext);
    String str1 = b.b(paramContext);
    paramContext = str1;
    if (TextUtils.isEmpty(str1)) {
      paramContext = "0";
    }
    paramContext = new StringBuffer(paramContext).reverse().toString();
    return str2 + "|" + paramContext;
  }
  
  private static String b(Context paramContext)
  {
    return b.a(paramContext);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */