package com.iflytek.sunflower;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.iflytek.sunflower.c.b;
import com.iflytek.sunflower.c.g;
import java.util.HashMap;
import org.json.JSONObject;

public class FlowerCollector
{
  public static void flush(Context paramContext)
  {
    g.b("Collector", "flush");
    if (paramContext == null)
    {
      g.a("Collector", "context is null in flush");
      return;
    }
    a.a(paramContext).c();
  }
  
  public static String getOnlineParams(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in getOnlineParams");
      return "";
    }
    return d.b(paramContext).getString(paramString, "");
  }
  
  public static void onError(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onError");
      return;
    }
    a.a(paramContext).a(paramString);
  }
  
  public static void onEvent(Context paramContext, String paramString)
  {
    g.b("Collector", "onEvent id:" + paramString);
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEvent");
      return;
    }
    a.a(paramContext).a(paramString, null, null, 0L);
  }
  
  public static void onEvent(Context paramContext, String paramString1, String paramString2)
  {
    g.b("Collector", "onEvent id:" + paramString1 + ", label:" + paramString2);
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEvent");
      return;
    }
    a.a(paramContext).a(paramString1, paramString2, null, 0L);
  }
  
  public static void onEvent(Context paramContext, String paramString, HashMap<String, String> paramHashMap)
  {
    g.b("Collector", "onEvent id:" + paramString + ", map:" + paramHashMap);
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEvent");
      return;
    }
    a.a(paramContext).a(paramString, null, paramHashMap, 0L);
  }
  
  public static void onEventBegin(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in onEventBegin");
      return;
    }
    a.a(paramContext).b(paramString, null, null, 0L);
  }
  
  public static void onEventBegin(Context paramContext, String paramString, HashMap<String, String> paramHashMap)
  {
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in onEventBegin");
      return;
    }
    a.a(paramContext).b(paramString, null, paramHashMap, 0L);
  }
  
  public static void onEventDuration(Context paramContext, String paramString, long paramLong)
  {
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEventDuration");
      return;
    }
    if (paramLong <= 0L)
    {
      g.a("Collector", "duration is not valid in onEventDuration");
      return;
    }
    a.a(paramContext).a(paramString, null, null, paramLong);
  }
  
  public static void onEventDuration(Context paramContext, String paramString1, String paramString2, long paramLong)
  {
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEventDuration");
      return;
    }
    if (paramLong <= 0L)
    {
      g.a("Collector", "duration is not valid in onEventDuration");
      return;
    }
    a.a(paramContext).a(paramString1, paramString2, null, paramLong);
  }
  
  public static void onEventDuration(Context paramContext, String paramString, HashMap<String, String> paramHashMap, long paramLong)
  {
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onEventDuration");
      return;
    }
    if (paramLong <= 0L)
    {
      g.a("Collector", "duration is not valid in onEventDuration");
      return;
    }
    a.a(paramContext).a(paramString, null, paramHashMap, paramLong);
  }
  
  public static void onEventEnd(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in onEventEnd");
      return;
    }
    a.a(paramContext).c(paramString, null, null, 0L);
  }
  
  public static void onLog(Context paramContext, JSONObject paramJSONObject, String paramString, HashMap<String, String> paramHashMap)
  {
    g.b("Collector", "onLog businessType:" + paramString);
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in onEventEnd");
      return;
    }
    a.a(paramContext).a(paramJSONObject, paramString, paramHashMap);
  }
  
  public static void onPageEnd(String paramString)
  {
    g.b("Collector", "onPageEnd:" + paramString);
    if (!TextUtils.isEmpty(paramString))
    {
      if (!b.a(paramString, com.iflytek.sunflower.config.a.p))
      {
        g.a("Collector", "pageName is large than " + com.iflytek.sunflower.config.a.p);
        return;
      }
      a.a(null).c(paramString);
      return;
    }
    g.a("Collector", "pageName is null or empty");
  }
  
  public static void onPageStart(String paramString)
  {
    g.b("Collector", "onPageStart:" + paramString);
    if (!TextUtils.isEmpty(paramString))
    {
      if (!b.a(paramString, com.iflytek.sunflower.config.a.p))
      {
        g.a("Collector", "pageName is large than " + com.iflytek.sunflower.config.a.p);
        return;
      }
      a.a(null).b(paramString);
      return;
    }
    g.a("Collector", "pageName is null or empty");
  }
  
  public static void onPause(Context paramContext)
  {
    g.b("Collector", "onPause");
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onPause");
      return;
    }
    a.a(paramContext).b();
  }
  
  public static void onResume(Context paramContext)
  {
    g.b("Collector", "onResume");
    if (paramContext == null)
    {
      g.a("Collector", "context is null in onResume");
      return;
    }
    a.a(paramContext).a();
  }
  
  public static void openPageMode(Boolean paramBoolean)
  {
    com.iflytek.sunflower.config.a.i = paramBoolean;
  }
  
  public static void setAge(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = d.a(paramContext);
      if ((paramInt < 0) || (paramInt > 200))
      {
        g.a("Collector", "input Age is not valid ");
        return;
      }
      paramContext.edit().putInt("age", paramInt).commit();
      return;
    }
    catch (Exception paramContext)
    {
      g.a("Collector", "input age error:" + paramContext);
    }
  }
  
  public static void setAppid(String paramString)
  {
    com.iflytek.sunflower.config.a.b = paramString;
  }
  
  public static void setAutoLocation(boolean paramBoolean)
  {
    com.iflytek.sunflower.config.a.n = Boolean.valueOf(paramBoolean);
  }
  
  public static void setCaptureUncaughtException(Boolean paramBoolean)
  {
    com.iflytek.sunflower.config.a.j = paramBoolean;
  }
  
  public static void setChannel(String paramString)
  {
    com.iflytek.sunflower.config.a.e = paramString;
  }
  
  public static void setDebugMode(boolean paramBoolean)
  {
    g.a(paramBoolean);
  }
  
  public static void setGender(Context paramContext, FlowerCollector.Gender paramGender)
  {
    int j = 0;
    if (paramGender == null)
    {
      g.a("Collector", "input Gender is null ");
      return;
    }
    for (;;)
    {
      try
      {
        paramContext = d.a(paramContext);
        i = j;
        switch (FlowerCollector.1.a[paramGender.ordinal()])
        {
        case 3: 
          paramContext.edit().putInt("gender", i).commit();
          return;
        }
      }
      catch (Exception paramContext)
      {
        g.a("Collector", "input Gender error:" + paramContext);
        return;
      }
      int i = 1;
      continue;
      i = 2;
      continue;
      i = j;
    }
  }
  
  public static void setParameter(String paramString1, String paramString2)
  {
    a.a(null).a(paramString1, paramString2);
  }
  
  public static void setSessionContinueMillis(long paramLong)
  {
    if (paramLong <= 0L)
    {
      g.a("Collector", "input millis is not valid ");
      return;
    }
    com.iflytek.sunflower.config.a.a = paramLong;
  }
  
  public static void setUserID(Context paramContext, String paramString)
  {
    try
    {
      paramContext = d.a(paramContext);
      if (TextUtils.isEmpty(paramString))
      {
        g.a("Collector", "input userID is null or empty");
        return;
      }
      if (!b.a(paramString, com.iflytek.sunflower.config.a.p))
      {
        g.a("Collector", "input userID is large than " + com.iflytek.sunflower.config.a.p);
        return;
      }
    }
    catch (Exception paramContext)
    {
      g.a("Collector", "input userId error:" + paramContext);
      return;
    }
    paramContext.edit().putString("user_id", paramString).commit();
  }
  
  public static void updateOnlineConfig(Context paramContext, OnlineConfigListener paramOnlineConfigListener)
  {
    if (paramContext == null)
    {
      g.a("Collector", "unexpected null context in updateOnlineConfig");
      return;
    }
    a.a(paramContext).a(paramOnlineConfigListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\FlowerCollector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */