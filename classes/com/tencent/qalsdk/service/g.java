package com.tencent.qalsdk.service;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class g
{
  public static final String a = "MSF.S.Util";
  
  public static FromServiceMsg a(ToServiceMsg paramToServiceMsg)
  {
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(paramToServiceMsg.getUin(), paramToServiceMsg.getServiceCmd());
    localFromServiceMsg.setAppId(paramToServiceMsg.getAppId());
    localFromServiceMsg.setAppSeq(paramToServiceMsg.getAppSeq());
    localFromServiceMsg.setRequestSsoSeq(paramToServiceMsg.getRequestSsoSeq());
    localFromServiceMsg.setMsfCommand(paramToServiceMsg.getMsfCommand());
    MsfSdkUtils.addFromMsgProcessName(b(paramToServiceMsg), localFromServiceMsg);
    return localFromServiceMsg;
  }
  
  public static String a(FromServiceMsg paramFromServiceMsg)
  {
    if (paramFromServiceMsg.getAttributes().get("to_SenderProcessName") != null) {
      return (String)paramFromServiceMsg.getAttributes().get("to_SenderProcessName");
    }
    return "";
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    Intent localIntent = new Intent(paramString3);
    localIntent.putExtra("uin", paramString2);
    localIntent.putExtra("istatus", paramInt);
    localIntent.putExtra("gatewayip", o.m());
    try
    {
      if (paramString3.toLowerCase().indexOf("activity", 0) != -1)
      {
        localIntent.setFlags(268435456);
        paramContext.startActivity(localIntent);
      }
      localIntent.setFlags(32);
      paramContext.sendBroadcast(localIntent);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        QLog.d("MSF.S.Util", 1, "sendBootAction " + paramContext);
      }
    }
    QLog.d("MSF.S.Util", 1, "send bootAction " + paramString3 + " for " + paramString1 + " uin:" + MsfSdkUtils.getShortUin(paramString2) + " istatus:" + paramInt);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, byte[] paramArrayOfByte)
  {
    Intent localIntent = new Intent(paramString3);
    localIntent.putExtra("offlineMsgID", paramString2);
    localIntent.putExtra("istatus", paramInt);
    localIntent.putExtra("gatewayip", o.m());
    localIntent.putExtra("offlineMsgCmd", paramString4);
    localIntent.putExtra("offlineMsgContent", paramArrayOfByte);
    try
    {
      if (paramString3.toLowerCase().indexOf("activity", 0) != -1)
      {
        localIntent.setFlags(268435456);
        paramContext.startActivity(localIntent);
      }
      localIntent.setFlags(32);
      paramContext.sendBroadcast(localIntent);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        QLog.d("MSF.S.Util", 1, "sendBootAction " + paramContext);
      }
    }
    QLog.d("MSF.S.Util", 1, "send bootAction " + paramString3 + " for " + paramString1 + " uin:" + paramString2 + " istatus:" + paramInt);
  }
  
  public static boolean a()
  {
    for (;;)
    {
      try
      {
        Object localObject = ((ActivityManager)QalService.context.getSystemService("activity")).getRunningAppProcesses();
        if (localObject == null)
        {
          if (!QLog.isColorLevel()) {
            break;
          }
          QLog.d("MSF.S.Util", 2, "can not load appProcesses.");
          break;
        }
        String str = MsfSdkUtils.getProcessName(QalService.context);
        if ((str != null) && (str.indexOf(":") > 0))
        {
          str = str.substring(0, str.indexOf(":"));
          localObject = ((List)localObject).iterator();
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
          boolean bool = ((ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next()).processName.equals(str);
          if (bool) {
            return true;
          }
        }
      }
      catch (Exception localException)
      {
        QLog.d("MSF.S.Util", 1, "check isMainProcessRunning error " + localException);
        return false;
      }
    }
    return false;
  }
  
  public static String b()
  {
    b localb = c.a(QalService.context.getPackageName());
    String str = "com.tencent.qalsdk.broadcast.qal";
    if (localb != null) {
      str = localb.b();
    }
    return str;
  }
  
  public static String b(ToServiceMsg paramToServiceMsg)
  {
    if ((paramToServiceMsg != null) && (paramToServiceMsg.getAttributes().get("to_SenderProcessName") != null)) {
      return (String)paramToServiceMsg.getAttributes().get("to_SenderProcessName");
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */