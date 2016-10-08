package com.tencent.statistics;

import android.content.Context;
import com.tencent.TIMManager;
import com.tencent.imsdk.QLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class BeaconUtil
{
  static final String TAG = "statistics.BeaconUtil";
  private static String appKey;
  private static String appVersion;
  private static boolean beaconFuncEnable = false;
  private static Method beaconOnUserAction = null;
  private static boolean enable = false;
  private static boolean isTest;
  
  static
  {
    appKey = "0S2007DKQC1FC53C";
    appVersion = "imsdkV" + TIMManager.getInstance().getVersion();
    isTest = false;
  }
  
  public static void Init(Context paramContext)
  {
    if (!enable) {}
    for (;;)
    {
      return;
      try
      {
        Class localClass = Class.forName("com.tencent.beaconimsdk.event.UserAction");
        beaconFuncEnable = true;
        localClass.getMethod("setAppkey", new Class[] { String.class }).invoke(null, new Object[] { appKey });
        localClass.getMethod("setAPPVersion", new Class[] { String.class }).invoke(null, new Object[] { appVersion });
        localClass.getMethod("initUserAction", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
        if (isTest)
        {
          localClass.getMethod("setLogAble", new Class[] { Boolean.TYPE, Boolean.TYPE }).invoke(null, new Object[] { Boolean.valueOf(true), Boolean.valueOf(true) });
          return;
        }
      }
      catch (ClassNotFoundException paramContext)
      {
        QLog.d("statistics.BeaconUtil", 1, "enable beacon failed,do not have jar");
        return;
      }
      catch (NoSuchMethodException paramContext)
      {
        QLog.d("statistics.BeaconUtil", 1, "enable beacon failed|NoSuchMethodException");
        return;
      }
      catch (InvocationTargetException paramContext)
      {
        QLog.d("statistics.BeaconUtil", 1, "enable beacon failed|InvocationTargetException");
        return;
      }
      catch (IllegalAccessException paramContext)
      {
        QLog.d("statistics.BeaconUtil", 1, "enable beacon failed|IllegalAccessException");
        return;
      }
      catch (Exception paramContext)
      {
        QLog.d("statistics.BeaconUtil", 1, "enable beacon failed|" + paramContext.toString());
      }
    }
  }
  
  public static void onEvent(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    if (!enable) {}
    while (!beaconFuncEnable) {
      return;
    }
    try
    {
      if (beaconOnUserAction == null) {
        beaconOnUserAction = Class.forName("com.tencent.beaconimsdk.event.UserAction").getMethod("onUserAction", new Class[] { String.class, Boolean.TYPE, Long.TYPE, Long.TYPE, Map.class, Boolean.TYPE });
      }
      beaconOnUserAction.invoke(null, new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), paramMap, Boolean.valueOf(paramBoolean2) });
      return;
    }
    catch (ClassNotFoundException paramString)
    {
      QLog.d("statistics.BeaconUtil", 1, "beancon onUserAction failed,do not have jar");
      return;
    }
    catch (NoSuchMethodException paramString)
    {
      QLog.d("statistics.BeaconUtil", 1, "beancon onUserAction failed|NoSuchMethodException");
      return;
    }
    catch (InvocationTargetException paramString)
    {
      QLog.d("statistics.BeaconUtil", 1, "beancon onUserAction failed|InvocationTargetException");
      return;
    }
    catch (IllegalAccessException paramString)
    {
      QLog.d("statistics.BeaconUtil", 1, "beancon onUserAction failed|IllegalAccessException");
      return;
    }
    catch (Exception paramString)
    {
      QLog.d("statistics.BeaconUtil", 1, "beancon onUserAction failed|" + paramString.toString());
    }
  }
  
  public static void setEnable(boolean paramBoolean)
  {
    enable = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\statistics\BeaconUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */