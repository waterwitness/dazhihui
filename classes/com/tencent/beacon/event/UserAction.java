package com.tencent.beacon.event;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.beacon.a.f;
import com.tencent.beacon.a.h;
import com.tencent.beacon.a.i;
import com.tencent.beacon.a.j;
import com.tencent.beacon.e.c;
import com.tencent.beacon.upload.InitHandleListener;
import com.tencent.beacon.upload.UploadHandleListener;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
  private static void a(Context paramContext, UploadHandleListener paramUploadHandleListener, boolean paramBoolean, long paramLong, InitHandleListener paramInitHandleListener)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.c(" the context is null! init beacon sdk failed!", new Object[0]);
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
    {
      b = localContext;
      if (paramLong > 0L)
      {
        long l = paramLong;
        if (paramLong > 10000L) {
          l = 10000L;
        }
        com.tencent.beacon.a.b.d.a(l);
      }
      paramLong = new Date().getTime();
      if (Integer.valueOf(Build.VERSION.SDK).intValue() < 14) {
        break label219;
      }
      paramContext = new i();
      ((Application)b).registerActivityLifecycleCallbacks(paramContext);
    }
    for (;;)
    {
      com.tencent.beacon.e.b.c("API Level: %s", new Object[] { Build.VERSION.SDK });
      com.tencent.beacon.e.b.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      paramContext = p.a(b, paramBoolean);
      p.a(b, true, paramContext, paramUploadHandleListener, paramInitHandleListener);
      com.tencent.beacon.b.d.a(b, paramContext);
      com.tencent.beacon.e.b.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      return;
      b = paramContext;
      break;
      label219:
      paramContext = new com.tencent.beacon.a.a(b);
      com.tencent.beacon.a.e.a().a(paramContext);
    }
  }
  
  public static void clearAppTotalConsume(Context paramContext)
  {
    j.e(paramContext.getApplicationContext());
  }
  
  public static void clearSDKTotalConsume(Context paramContext)
  {
    j.d(paramContext.getApplicationContext());
  }
  
  public static void closeUseInfoEvent()
  {
    p localp = p.d();
    if (localp != null) {
      localp.f();
    }
  }
  
  public static void doUploadRecords()
  {
    com.tencent.beacon.a.e.a().a(f);
  }
  
  public static String getAPN()
  {
    if (b == null)
    {
      com.tencent.beacon.e.b.d("please initUserAction first!", new Object[0]);
      return "unknown";
    }
    return c.c(b);
  }
  
  public static String getAppkey()
  {
    return e;
  }
  
  public static String getCloudParas(String paramString)
  {
    String str = null;
    Map localMap = com.tencent.beacon.a.b.e.a().d();
    if (localMap != null) {
      str = (String)localMap.get(paramString);
    }
    return str;
  }
  
  public static String getGatewayIP()
  {
    f localf = f.m();
    if (localf != null) {
      return localf.g();
    }
    return "unknown";
  }
  
  public static String getNetWorkType()
  {
    if (b == null)
    {
      com.tencent.beacon.e.b.d("please initUserAction first!", new Object[0]);
      return "unknown";
    }
    h.a(b);
    return h.l(b);
  }
  
  public static String getQIMEI()
  {
    String str;
    if ((b == null) || (p.d() == null))
    {
      com.tencent.beacon.e.b.d("please initUserAction first!", new Object[0]);
      str = "";
      if (b == null) {}
    }
    try
    {
      h.a(b);
      str = h.b(b);
      return str;
    }
    catch (Exception localException) {}
    return com.tencent.beacon.b.a.a(b).a();
    return "";
  }
  
  public static String getQQ()
  {
    return c;
  }
  
  public static long getSDKTotalConsume(Context paramContext, boolean paramBoolean)
  {
    paramContext = j.b(paramContext.getApplicationContext());
    if (paramContext != null)
    {
      if (paramBoolean) {
        return paramContext.e;
      }
      long l = paramContext.d;
      return paramContext.e + l;
    }
    return -1L;
  }
  
  public static String getSDKVersion()
  {
    return "1.9.9";
  }
  
  public static g getUserActionRuntimeStrategy()
  {
    try
    {
      g localg = p.d().i();
      return localg;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String getUserID()
  {
    return d;
  }
  
  @Deprecated
  public static boolean heartbeatEvent()
  {
    com.tencent.beacon.e.b.c(" heartbeatEvent is Deprecated !", new Object[0]);
    return true;
  }
  
  public static void initUserAction(Context paramContext)
  {
    a(paramContext, null, true, 0L, null);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, null, paramBoolean, 0L, null);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean, long paramLong)
  {
    a(paramContext, null, paramBoolean, paramLong, null);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean, long paramLong, InitHandleListener paramInitHandleListener)
  {
    a(paramContext, null, paramBoolean, paramLong, paramInitHandleListener);
  }
  
  public static void initUserAction(Context paramContext, boolean paramBoolean, long paramLong, UploadHandleListener paramUploadHandleListener)
  {
    a(paramContext, paramUploadHandleListener, paramBoolean, paramLong, null);
  }
  
  public static boolean loginEvent(boolean paramBoolean, long paramLong, Map<String, String> paramMap)
  {
    return p.a("rqd_wgLogin", paramBoolean, paramLong, 0L, paramMap, true);
  }
  
  public static void onAppExited() {}
  
  @Deprecated
  public static boolean onMergeUserAction(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, boolean paramBoolean2, d... paramVarArgs)
  {
    if ((paramString == null) || ("".equals(paramString.trim()))) {
      com.tencent.beacon.e.b.c("param eventName is null or \"\", please check it, return false! ", new Object[0]);
    }
    while (h.b(paramString) == null) {
      return false;
    }
    return p.a(paramString, paramBoolean1, paramLong1, paramLong2, paramBoolean2, paramVarArgs);
  }
  
  public static boolean onUserAction(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    return onUserAction(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, false);
  }
  
  public static boolean onUserAction(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      com.tencent.beacon.e.b.c("param eventName is null or \"\", please check it, return false! ", new Object[0]);
      return false;
    }
    paramString = h.b(paramString);
    if (paramString == null) {
      return false;
    }
    return p.a(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, paramBoolean3);
  }
  
  public static void setAPPVersion(String paramString)
  {
    if ((paramString != null) && (!paramString.trim().equals(""))) {
      com.tencent.beacon.a.b.a(paramString);
    }
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
  
  public static void setAppKey(Context paramContext, String paramString)
  {
    com.tencent.beacon.e.b.a(" setAppKey:" + paramString, new Object[0]);
    if (paramContext == null) {
      com.tencent.beacon.e.b.c(" the context is null! setAppKey failed!", new Object[0]);
    }
    label113:
    label119:
    for (;;)
    {
      return;
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null)
      {
        b = localContext;
        if ((paramString == null) || (paramString.trim().length() <= 0) || (paramString.trim().length() >= 20)) {
          break;
        }
        paramContext = f.m();
        if (paramContext != null) {
          break label113;
        }
        f.a(b);
        paramContext = f.m();
      }
      for (;;)
      {
        if (paramContext == null) {
          break label119;
        }
        paramContext.e(paramString);
        return;
        b = paramContext;
        break;
        paramContext.e(paramString);
      }
    }
    com.tencent.beacon.e.b.c(" setAppKey: appkey is null or not available!", new Object[0]);
    throw new RuntimeException("appkey is null or not available! please check it!");
  }
  
  public static void setAppkey(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      e = paramString;
    }
  }
  
  @Deprecated
  public static void setAutoLaunchEventUsable(boolean paramBoolean) {}
  
  public static void setChannelID(String paramString)
  {
    f localf2 = f.m();
    f localf1 = localf2;
    if (localf2 == null)
    {
      f.a(b);
      localf1 = f.m();
    }
    if (localf1 == null)
    {
      com.tencent.beacon.e.b.d("please set the channelID after call initUserAction!", new Object[0]);
      return;
    }
    localf1.d(h.d(paramString));
  }
  
  public static void setInitChannelPath(Context paramContext, String paramString)
  {
    if (b == null)
    {
      com.tencent.beacon.a.b.a(paramContext.getApplicationContext(), paramString);
      return;
    }
    com.tencent.beacon.e.b.d("please set the channel path before call initUserAction!", new Object[0]);
    throw new RuntimeException("please set the channel path before call initUserAction!");
  }
  
  public static void setLogAble(boolean paramBoolean1, boolean paramBoolean2)
  {
    com.tencent.beacon.e.b.a = paramBoolean1;
    com.tencent.beacon.e.b.b = paramBoolean2;
  }
  
  @Deprecated
  public static void setNetSpeedMonitorUsable(boolean paramBoolean)
  {
    com.tencent.beacon.e.b.c(" SpeedMonitorModule is Deprecated !", new Object[0]);
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
        com.tencent.beacon.e.b.c(" setQQ: set qq is not available !", new Object[0]);
        return;
      }
    }
    com.tencent.beacon.e.b.c(" setQQ: set qq is null !", new Object[0]);
  }
  
  public static void setUploadMode(boolean paramBoolean)
  {
    p localp = p.d();
    if (localp != null)
    {
      localp.b(paramBoolean);
      return;
    }
    com.tencent.beacon.e.b.c(" UserActionRecord.getInstance is null, please initUserAction first!", new Object[0]);
  }
  
  public static void setUserActionUsable(boolean paramBoolean)
  {
    p localp = p.d();
    if (localp != null)
    {
      localp.a(paramBoolean);
      return;
    }
    com.tencent.beacon.e.b.c(" UserActionRecord.getInstance is null, please initUserAction first!", new Object[0]);
  }
  
  public static void setUserID(String paramString)
  {
    com.tencent.beacon.e.b.a(" setUserID:" + paramString, new Object[0]);
    if ((paramString != null) && (paramString.trim().length() > 0) && (!"10000".equals(paramString)) && (!"10000".equals(h.c(paramString)))) {
      d = paramString;
    }
  }
  
  public static boolean testSpeedDomain(List<String> paramList)
  {
    p localp = p.d();
    if (localp != null) {
      return localp.b(paramList);
    }
    return false;
  }
  
  public static boolean testSpeedIp(List<String> paramList)
  {
    p localp = p.d();
    if (localp != null) {
      return localp.a(paramList);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\UserAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */