package com.android.thinkive.framework.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CommonUtil
{
  public static void chmod(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = "chmod " + paramString1 + " " + paramString2;
      Runtime.getRuntime().exec(paramString1);
      return;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static String getProcessName(Context paramContext, int paramInt)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.iterator();
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    do
    {
      if (!paramContext.hasNext()) {
        return null;
      }
      localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
    } while (localRunningAppProcessInfo.pid != paramInt);
    return localRunningAppProcessInfo.processName;
  }
  
  public static String getThinkiveFrameworkVersionName()
  {
    return "thinkive-framework-1.0.5";
  }
  
  public static String getTopActivity(Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if (paramContext != null) {
      return ((ActivityManager.RunningTaskInfo)paramContext.get(0)).topActivity.getClassName();
    }
    return null;
  }
  
  public static boolean isTopActivity(Context paramContext, String paramString)
  {
    boolean bool = false;
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if (paramString.equals(getTopActivity(paramContext))) {
      bool = true;
    }
    Log.d("activity = " + paramString + " isTop = " + bool);
    return bool;
  }
  
  public static void sendSms(Context paramContext, String paramString1, String paramString2)
  {
    if (PhoneNumberUtils.isGlobalPhoneNumber(paramString1))
    {
      paramString1 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + paramString1));
      paramString1.putExtra("sms_body", paramString2);
      paramString1.addFlags(268435456);
      paramContext.startActivity(paramString1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\CommonUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */