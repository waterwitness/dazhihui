package com.alipay.sdk.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.app.a.a;
import com.alipay.sdk.d.e;

public final class h
{
  private static String a = null;
  
  private static String a(Context paramContext)
  {
    String str;
    if (TextUtils.isEmpty(a)) {
      str = "";
    }
    try
    {
      paramContext = paramContext.getApplicationContext().getPackageName();
      a = (paramContext + "0000000000000000000000000000").substring(0, 24);
      return a;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext = str;
      }
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      PreferenceManager.getDefaultSharedPreferences(paramContext).edit().remove(paramString).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      String str = e.a(a(paramContext), paramString2);
      if ((!TextUtils.isEmpty(paramString2)) && (TextUtils.isEmpty(str))) {
        a.a("cp", "TriDesDecryptError", String.format("%s,%s", new Object[] { paramString1, paramString2 }));
      }
      PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putString(paramString1, str).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = localObject2;
    try
    {
      String str = PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramString1, paramString2);
      paramString2 = (String)localObject3;
      localObject1 = localObject2;
      if (!TextUtils.isEmpty(str))
      {
        localObject1 = localObject2;
        paramString2 = e.b(a(paramContext), str);
      }
      localObject1 = paramString2;
      if (!TextUtils.isEmpty(str))
      {
        localObject1 = paramString2;
        if (TextUtils.isEmpty(paramString2))
        {
          localObject1 = paramString2;
          a.a("cp", "TriDesEncryptError", String.format("%s,%s", new Object[] { paramString1, str }));
        }
      }
      return paramString2;
    }
    catch (Exception paramContext) {}
    return (String)localObject1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */