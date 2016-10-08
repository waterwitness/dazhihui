package com.tencent.qalsdk.core;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.support.v4.content.a;
import android.telephony.TelephonyManager;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.QLog;
import java.io.File;
import java.util.Properties;
import java.util.Random;

public class k
{
  public static final String a = "MSF.C.Util";
  private static String b = "";
  private static String c = "";
  private static String d = "";
  private static String e = "";
  
  public static FromServiceMsg a(ToServiceMsg paramToServiceMsg)
  {
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(paramToServiceMsg.getUin(), paramToServiceMsg.getServiceCmd());
    localFromServiceMsg.setAppId(paramToServiceMsg.getAppId());
    localFromServiceMsg.setAppSeq(paramToServiceMsg.getAppSeq());
    localFromServiceMsg.setRequestSsoSeq(paramToServiceMsg.getRequestSsoSeq());
    localFromServiceMsg.setMsfCommand(paramToServiceMsg.getMsfCommand());
    localFromServiceMsg.addAttribute("to_SenderProcessName", paramToServiceMsg.getAttribute("to_SenderProcessName"));
    localFromServiceMsg.addAttribute("__timestamp_net2msf", Long.valueOf(System.currentTimeMillis()));
    return localFromServiceMsg;
  }
  
  public static String a()
  {
    return b;
  }
  
  public static void a(Context paramContext)
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        if ((Build.VERSION.SDK_INT >= 23) && (a.a(QalService.context, "android.permission.READ_PHONE_STATE") != 0)) {
          continue;
        }
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        c = paramContext.getSubscriberId();
        paramContext = paramContext.getDeviceId();
        if ((paramContext != null) && (paramContext.length() > 0))
        {
          b = paramContext;
          a(paramContext);
          QLog.i("MSF.C.Util", 2, "read sys imei:" + b);
        }
      }
      catch (Exception paramContext)
      {
        QLog.d("MSF.C.Util", 1, "read sys imei error " + paramContext, paramContext);
        continue;
      }
      if ((b == null) || (b.length() == 0))
      {
        b = e();
        QLog.i("MSF.C.Util", 2, "load imei:" + b);
      }
      return;
      c = null;
      paramContext = (Context)localObject;
    }
  }
  
  public static void a(String paramString)
  {
    Object localObject = new File(j.a().h);
    try
    {
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      if (((File)localObject).exists())
      {
        localObject = MsfSdkUtils.loadConfig(j.a().h);
        ((Properties)localObject).put("imei", paramString);
        MsfSdkUtils.saveConfig(j.a().h, (Properties)localObject);
        return;
      }
      QLog.d("MSF.C.Util", 1, "can not create imei file");
      return;
    }
    catch (Exception paramString)
    {
      QLog.d("MSF.C.Util", 1, "save sys imei error", paramString);
    }
  }
  
  public static String b()
  {
    return c;
  }
  
  public static String c()
  {
    return d;
  }
  
  public static String d()
  {
    return e;
  }
  
  public static String e()
  {
    String str = null;
    localFile = new File(j.a().h);
    try
    {
      if (localFile.exists())
      {
        QLog.i("MSF.C.Util", "file exit:" + j.a().h);
        str = MsfSdkUtils.loadConfig(j.a().h).getProperty("imei");
      }
      if (str == null) {
        break label94;
      }
      i = str.length();
      if (i <= 0) {
        break label94;
      }
      localObject2 = str;
    }
    catch (Exception localException1)
    {
      Object localObject1;
      do
      {
        int i;
        QLog.d("MSF.C.Util", 1, "load sys imei error", localException1);
        Object localObject2 = f();
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new StringBuffer();
          i = 0;
          while (i < 15)
          {
            ((StringBuffer)localObject1).append(new Random().nextInt(10));
            i += 1;
          }
          localObject1 = ((StringBuffer)localObject1).toString();
        }
        try
        {
          if (!localFile.exists()) {
            localFile.createNewFile();
          }
          if (localFile.exists())
          {
            localObject2 = MsfSdkUtils.loadConfig(j.a().h);
            ((Properties)localObject2).put("imei", localObject1);
            MsfSdkUtils.saveConfig(j.a().h, (Properties)localObject2);
            QLog.i("MSF.C.Util", 2, "write imei " + (String)localObject1);
            return (String)localObject1;
          }
        }
        catch (Exception localException2)
        {
          QLog.d("MSF.C.Util", 1, "load imei error", localException2);
          return (String)localObject1;
        }
        Object localObject3 = localObject1;
      } while (!QLog.isColorLevel());
      QLog.d("MSF.C.Util", 2, "can not create imei file");
      return (String)localObject1;
    }
    return (String)localObject2;
  }
  
  private static String f()
  {
    String str2 = Settings.Secure.getString(QalService.context.getContentResolver(), "android_id");
    QLog.i("MSF.C.Util", "ANDROID_ID:" + str2);
    String str1 = str2;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.equals("9774d56d682e549c")) {
        str1 = null;
      }
    }
    return str1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */