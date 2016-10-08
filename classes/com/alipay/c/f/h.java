package com.alipay.c.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.alipay.d.a.a.a.a;
import com.alipay.d.a.a.a.a.b;
import java.util.UUID;

public final class h
{
  private static String a = "";
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = com.alipay.d.a.a.d.c.a(paramContext, "vkeyid_settings", "last_apdid_env", "");
      if (a.a(paramContext)) {
        return "";
      }
      String str = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), paramContext);
      paramContext = str;
      if (a.a(str)) {
        return "";
      }
    }
    catch (Throwable paramContext)
    {
      paramContext = "";
    }
    return paramContext;
  }
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("vkeyid_settings", 0).edit();
      if (paramContext != null)
      {
        paramContext.putString("last_apdid_env", com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), paramString));
        paramContext.commit();
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, String paramString, long paramLong)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("vkeyid_settings", 0).edit();
      if (paramContext != null)
      {
        String str = com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), String.valueOf(paramLong));
        paramContext.putString("vkey_valid" + paramString, str);
        paramContext.commit();
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("vkeyid_settings", 0).edit();
      if (localEditor != null)
      {
        if (paramBoolean) {}
        for (paramContext = com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), "1");; paramContext = com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), "0"))
        {
          localEditor.putString("log_switch", paramContext);
          localEditor.commit();
          return;
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void b(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("vkeyid_settings", 0).edit();
      if (paramContext != null)
      {
        paramContext.putString("agent_switch", com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), paramString));
        paramContext.commit();
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static boolean b(Context paramContext)
  {
    try
    {
      paramContext = com.alipay.d.a.a.d.c.a(paramContext, "vkeyid_settings", "log_switch", "");
      if (a.a(paramContext)) {
        return false;
      }
      paramContext = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), paramContext);
      if (!a.a(paramContext))
      {
        boolean bool = paramContext.equals("1");
        return bool;
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static long c(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("vkeyid_settings", 0).getString("vkey_valid" + paramString, "");
      if (a.a(paramContext)) {
        return 0L;
      }
      paramContext = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), paramContext);
      if (!a.a(paramContext))
      {
        long l = Long.parseLong(paramContext);
        return l;
      }
    }
    catch (Throwable paramContext) {}
    return 0L;
  }
  
  public static String c(Context paramContext)
  {
    try
    {
      if (a.a(a))
      {
        String str = com.alipay.d.a.a.d.c.a(paramContext, "alipay_vkey_random", "random", "");
        a = str;
        if (a.a(str))
        {
          a = b.a(UUID.randomUUID().toString());
          str = a;
          if (str != null)
          {
            paramContext = paramContext.getSharedPreferences("alipay_vkey_random", 0).edit();
            if (paramContext != null)
            {
              paramContext.clear();
              paramContext.putString("random", str);
              paramContext.commit();
            }
          }
        }
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */