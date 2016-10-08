package com.alipay.d.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
{
  public static String a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getString(paramString2, paramString3);
  }
  
  public static void a(Context paramContext, String paramString, Map<String, String> paramMap)
  {
    paramContext = paramContext.getSharedPreferences(paramString, 0).edit();
    if (paramContext != null)
    {
      paramContext.clear();
      paramString = paramMap.keySet().iterator();
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramContext.putString(str, (String)paramMap.get(str));
      }
      paramContext.commit();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */