package com.tencent.qalsdk.service;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.MsfServiceBindInfo;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.i;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.k;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.im_open.UserData.QALUserData;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import qalsdk.ak;
import qalsdk.av;
import qalsdk.u;

public class d
{
  private static String a = "MSF.S.ReqHandler";
  
  private void a(ToServiceMsg paramToServiceMsg)
  {
    QalService.core.c.e().remove(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()));
    paramToServiceMsg = (Runnable)paramToServiceMsg.getAttributes().remove("to_timeoutCallbacker");
    QalService.core.m().b().removeCallbacks(paramToServiceMsg);
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[paramInt] = ((byte)(int)(paramLong >> 24));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)paramLong);
  }
  
  private void b(ToServiceMsg paramToServiceMsg)
  {
    j.a().d().d();
  }
  
  private void c(ToServiceMsg paramToServiceMsg)
  {
    QalService.appVersion = (String)paramToServiceMsg.getAttribute("appVersion");
    QalService.appChannel = (String)paramToServiceMsg.getAttribute("appChannel");
  }
  
  private void d(ToServiceMsg paramToServiceMsg)
  {
    int i = ((Integer)paramToServiceMsg.getAttribute("logLevel")).intValue();
    QalService.getCore().a(i);
    QLog.setOutputLogLevel(i);
  }
  
  private void e(ToServiceMsg paramToServiceMsg)
  {
    if ((QalService.core.c == null) || (QalService.core.c.a == null)) {}
    while (QalService.core.c.a.l.get()) {
      return;
    }
    QalService.core.c.a.l.set(true);
    for (;;)
    {
      UserData.QALUserData localQALUserData;
      try
      {
        localQALUserData = new UserData.QALUserData();
        localQALUserData.sdk_version.set("1.4.1");
        if (QalService.appVersion != null) {
          localQALUserData.app_version.set(QalService.appVersion);
        }
        if (QalService.appChannel != null) {
          localQALUserData.app_channel.set(QalService.appChannel);
        }
        if ((m.e()) || ((!m.d()) && (m.l() == null)))
        {
          localQALUserData.apn.set("wifi");
          localQALUserData.os.set(1);
          localQALUserData.os_version.set(Build.VERSION.RELEASE);
          localQALUserData.device.set(Build.MODEL);
          localQALUserData.brand.set(Build.MANUFACTURER);
          Object localObject = (WindowManager)QalService.context.getSystemService("window");
          localQALUserData.screen_width.set(((WindowManager)localObject).getDefaultDisplay().getWidth());
          localQALUserData.screen_height.set(((WindowManager)localObject).getDefaultDisplay().getHeight());
          if (k.a() != null) {
            localQALUserData.imei.set(k.a());
          }
          if (k.b() != null) {
            localQALUserData.imsi.set(Long.valueOf(k.b()).longValue());
          }
          localObject = localQALUserData.toByteArray();
          paramToServiceMsg = new ToServiceMsg("", paramToServiceMsg.getUin(), "qal.userdata");
          paramToServiceMsg.setRequestSsoSeq(j.f());
          paramToServiceMsg.putWupBuffer(o.b((byte[])localObject));
          paramToServiceMsg.setUinType(20);
          paramToServiceMsg.setNeedCallback(false);
          paramToServiceMsg.setAppId(537046243);
          paramToServiceMsg.setTimeout(15000L);
          QalService.core.a(paramToServiceMsg);
          paramToServiceMsg = new StringBuilder();
          QLog.d(a, "report userdata:" + paramToServiceMsg.append(localQALUserData.sdk_version.get()).append("|").append(localQALUserData.app_version.get()).append("|").append(localQALUserData.app_channel.get()).append("|").append(localQALUserData.apn.get()).append("|").append(localQALUserData.radio_access.get()).append("|").append(localQALUserData.os.get()).append("|").append(localQALUserData.os_version.get()).append("|").append(localQALUserData.device.get()).append("|").append(localQALUserData.brand.get()).append("|").append(localQALUserData.screen_height.get()).append("|").append(localQALUserData.screen_width.get()).append("|").append(localQALUserData.imei.get()).append("|").append(localQALUserData.imsi.get()).toString());
          return;
        }
      }
      catch (Exception paramToServiceMsg)
      {
        paramToServiceMsg.printStackTrace();
        return;
      }
      localQALUserData.apn.set(ak.b());
      localQALUserData.radio_access.set(ak.c());
    }
  }
  
  void a(Context paramContext, ToServiceMsg paramToServiceMsg, int paramInt)
  {
    if (paramToServiceMsg == null) {
      return;
    }
    String str = g.b(paramToServiceMsg);
    paramToServiceMsg.addAttribute("__timestamp_app2msf", Long.valueOf(System.currentTimeMillis()));
    switch (e.a[paramToServiceMsg.getMsfCommand().ordinal()])
    {
    default: 
      e(paramToServiceMsg);
      QalService.core.a(paramToServiceMsg);
      return;
    case 1: 
      paramContext = (MsfServiceBindInfo)paramToServiceMsg.getAttributes().get("intent_bindServiceInfo");
      c.a(paramContext.getProcessName(), paramContext.getBootBoradcastName(), paramContext.getMsfServiceCallbacker(), paramToServiceMsg.getAppId());
      j.a(g.b(paramToServiceMsg), paramToServiceMsg.getAppId());
      return;
    case 2: 
      paramContext = Boolean.valueOf(true);
      if (paramToServiceMsg.extraData.containsKey("to_stop_wake_process")) {
        paramContext = Boolean.valueOf(paramToServiceMsg.extraData.getBoolean("to_stop_wake_process"));
      }
      c.a(str, paramContext);
      return;
    case 3: 
      QalService.core.b(paramToServiceMsg);
      return;
    case 4: 
      QalService.core.c(paramToServiceMsg);
      return;
    case 5: 
      QalService.core.d(paramToServiceMsg);
      return;
    case 6: 
      QalService.core.f(paramToServiceMsg);
      return;
    case 7: 
      QalService.core.e(paramToServiceMsg);
      return;
    case 8: 
      paramContext = o.m();
      FromServiceMsg localFromServiceMsg = g.a(paramToServiceMsg);
      localFromServiceMsg.addAttribute(paramToServiceMsg.getServiceCmd(), paramContext);
      localFromServiceMsg.setMsgSuccess();
      c.a(str, paramToServiceMsg, localFromServiceMsg);
      return;
    case 9: 
      a(paramToServiceMsg);
      return;
    case 10: 
      c(paramToServiceMsg);
      return;
    case 11: 
      d(paramToServiceMsg);
      return;
    }
    b(paramToServiceMsg);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */