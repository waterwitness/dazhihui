package com.tencent.beaconimsdk.event;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.beaconimsdk.a.b;
import com.tencent.beaconimsdk.a.b.d;
import com.tencent.beaconimsdk.a.e;
import com.tencent.beaconimsdk.a.f;
import com.tencent.beaconimsdk.upload.UploadHandleListener;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserAction
{
  protected static Map<String, String> a = null;
  private static Context b = null;
  private static String c = "";
  private static String d = "10000";
  private static String e = "";
  private static Runnable f = new UserAction.1();
  
  @TargetApi(14)
  private static void a(Context paramContext, UploadHandleListener paramUploadHandleListener, long paramLong)
  {
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.c(" the context is null! init beacon sdk failed!", new Object[0]);
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (b = localContext;; b = paramContext)
    {
      if (paramLong > 0L)
      {
        long l = paramLong;
        if (paramLong > 10000L) {
          l = 10000L;
        }
        com.tencent.beaconimsdk.a.b.c.a(l);
      }
      paramLong = new Date().getTime();
      if (Integer.valueOf(Build.VERSION.SDK).intValue() >= 14)
      {
        paramContext = new f();
        ((Application)b).registerActivityLifecycleCallbacks(paramContext);
      }
      com.tencent.beaconimsdk.c.a.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      paramContext = j.a(b);
      j.a(b, paramContext, paramUploadHandleListener);
      com.tencent.beaconimsdk.c.a.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      return;
    }
  }
  
  public static void doUploadRecords()
  {
    b.a().a(f);
  }
  
  public static void flushObjectsToDB(boolean paramBoolean)
  {
    j.c(paramBoolean);
  }
  
  public static String getAPN()
  {
    if (b == null)
    {
      com.tencent.beaconimsdk.c.a.d("please initUserAction first!", new Object[0]);
      return "unknown";
    }
    return e.n(b);
  }
  
  public static String getAppkey()
  {
    return e;
  }
  
  public static String getBeaconSDKVersion()
  {
    return "1.5.3";
  }
  
  public static String getCloudParas(String paramString)
  {
    String str = null;
    Map localMap = d.a().d();
    if (localMap != null) {
      str = (String)localMap.get(paramString);
    }
    return str;
  }
  
  public static String getNetWorkType()
  {
    if (b == null)
    {
      com.tencent.beaconimsdk.c.a.d("please initUserAction first!", new Object[0]);
      return "unknown";
    }
    e.a(b);
    return e.g(b);
  }
  
  public static String getQIMEI()
  {
    String str3;
    String str1;
    String str2;
    if ((b == null) || (j.d() == null))
    {
      com.tencent.beaconimsdk.c.a.d("please initUserAction first!", new Object[0]);
      str3 = "";
      str1 = str3;
      if (b != null) {
        str2 = str3;
      }
    }
    try
    {
      e.a(b);
      str2 = str3;
      str3 = e.b(b);
      str1 = str3;
      str2 = str3;
      if ("".equals(str3))
      {
        str2 = str3;
        e.a(b);
        str2 = str3;
        str1 = e.d(b);
      }
      return str1;
    }
    catch (Exception localException) {}
    return c.a(b).f();
    return str2;
  }
  
  public static String getQQ()
  {
    return c;
  }
  
  public static String getUserID()
  {
    return d;
  }
  
  public static void initUserAction(Context paramContext)
  {
    a(paramContext, null, 0L);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, null, 0L);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean, long paramLong)
  {
    a(paramContext, null, paramLong);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean, long paramLong, UploadHandleListener paramUploadHandleListener)
  {
    a(paramContext, paramUploadHandleListener, paramLong);
  }
  
  public static boolean onUserAction(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    return onUserAction(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, false);
  }
  
  public static boolean onUserAction(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      com.tencent.beaconimsdk.c.a.c("param eventName is null or \"\", please check it, return false! ", new Object[0]);
      return false;
    }
    String str2 = paramString.replace('|', '_').trim();
    String str1;
    if (str2.length() == 0)
    {
      com.tencent.beaconimsdk.c.a.c("eventName is invalid!! eventName length == 0!", new Object[0]);
      str1 = null;
    }
    while (str1 == null)
    {
      return false;
      if (e.d(str2))
      {
        str1 = str2;
        if (str2.length() > 128)
        {
          com.tencent.beaconimsdk.c.a.c("eventName is invalid!! eventName length should be less than 128! eventName:" + paramString, new Object[0]);
          str1 = str2.substring(0, 128);
        }
      }
      else
      {
        com.tencent.beaconimsdk.c.a.c("eventName is invalid!! eventName should be ASCII code in 32-126! eventName:" + paramString, new Object[0]);
        str1 = null;
      }
    }
    return j.a(str1, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, paramBoolean3);
  }
  
  public static void setAdditionalInfo(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() <= 20))
    {
      HashMap localHashMap = new HashMap();
      a = localHashMap;
      localHashMap.putAll(paramMap);
    }
  }
  
  public static void setAppkey(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      e = paramString;
    }
  }
  
  public static void setChannelID(String paramString)
  {
    com.tencent.beaconimsdk.a.c localc2 = com.tencent.beaconimsdk.a.c.m();
    com.tencent.beaconimsdk.a.c localc1 = localc2;
    if (localc2 == null)
    {
      com.tencent.beaconimsdk.a.c.a(b);
      localc1 = com.tencent.beaconimsdk.a.c.m();
    }
    if (localc1 == null)
    {
      com.tencent.beaconimsdk.c.a.d("please set the channelID after call initUserAction!", new Object[0]);
      return;
    }
    e.c(paramString);
    localc1.k();
  }
  
  public static void setLogAble(boolean paramBoolean1, boolean paramBoolean2)
  {
    com.tencent.beaconimsdk.c.a.a = paramBoolean1;
    com.tencent.beaconimsdk.c.a.b = paramBoolean2;
  }
  
  public static void setQQ(String paramString)
  {
    if (paramString != null) {
      try
      {
        if (Long.parseLong(paramString) > 10000L) {
          c = paramString;
        }
        return;
      }
      catch (Exception paramString)
      {
        com.tencent.beaconimsdk.c.a.c(" setQQ: set qq is not available !", new Object[0]);
        return;
      }
    }
    com.tencent.beaconimsdk.c.a.c(" setQQ: set qq is null !", new Object[0]);
  }
  
  public static void setSDKVersion(String paramString)
  {
    if ((paramString != null) && (!paramString.trim().equals(""))) {
      com.tencent.beaconimsdk.a.a.a(paramString);
    }
  }
  
  public static void setUploadMode(boolean paramBoolean)
  {
    j localj = j.d();
    if (localj != null)
    {
      localj.b(paramBoolean);
      return;
    }
    com.tencent.beaconimsdk.c.a.c(" UserActionRecord.getInstance is null, please initUserAction first!", new Object[0]);
  }
  
  public static void setUserActionUsable(boolean paramBoolean)
  {
    j localj = j.d();
    if (localj != null)
    {
      localj.a(paramBoolean);
      return;
    }
    com.tencent.beaconimsdk.c.a.c(" UserActionRecord.getInstance is null, please initUserAction first!", new Object[0]);
  }
  
  public static void setUserID(String paramString)
  {
    com.tencent.beaconimsdk.c.a.a(" setUserID:" + paramString, new Object[0]);
    if ((paramString != null) && (paramString.trim().length() > 0) && (!"10000".equals(paramString)) && (!"10000".equals(e.b(paramString)))) {
      d = paramString;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\UserAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */