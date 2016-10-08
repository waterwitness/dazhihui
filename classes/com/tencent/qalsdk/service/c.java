package com.tencent.qalsdk.service;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IMsfServiceCallbacker;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.l;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.w;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class c
{
  static final String a = "MSF.S.AppProcessManager";
  public static final String b = "app_process_info_";
  static ConcurrentHashMap<String, b> c = new ConcurrentHashMap();
  static a d = new a();
  static j e;
  
  public static b a(String paramString)
  {
    return (b)c.get(paramString);
  }
  
  public static void a(Context paramContext)
  {
    String[] arrayOfString1 = l.a().getConfigList("app_process_info_");
    QLog.d("MSF.S.AppProcessManager", "start loadAppProcessInfos:" + arrayOfString1.length);
    int j = arrayOfString1.length;
    int i = 0;
    while (i < j)
    {
      paramContext = arrayOfString1[i];
      QLog.d("MSF.S.AppProcessManager", "loadAppProcessInfo proInfo:" + paramContext);
      String[] arrayOfString2 = paramContext.split(",");
      String str = arrayOfString2[0];
      paramContext = "";
      if (arrayOfString2.length > 1) {
        paramContext = arrayOfString2[1];
      }
      a(str, paramContext, null, 0);
      i += 1;
    }
  }
  
  public static void a(Context paramContext, j paramj)
  {
    e = paramj;
    d.setName("MsfServiceAppMsgHandler");
    d.start();
    try
    {
      a(paramContext);
      return;
    }
    catch (UnsatisfiedLinkError paramContext)
    {
      QLog.e("MSF.S.AppProcessManager", "so init error:" + paramContext.getMessage());
    }
  }
  
  public static void a(String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      if (QLog.isColorLevel()) {
        QLog.e("MSF.S.AppProcessManager", 2, "find null processName msg to app " + paramToServiceMsg + " " + paramFromServiceMsg);
      }
      if ((paramFromServiceMsg != null) && (paramFromServiceMsg.getServiceCmd() != null) && (paramFromServiceMsg.getServiceCmd().equals("SharpSvr.s2c"))) {}
      return;
    }
    if (paramString.equals("*"))
    {
      paramString = c.entrySet().iterator();
      while (paramString.hasNext())
      {
        localObject = (Map.Entry)paramString.next();
        MsfSdkUtils.addFromMsgProcessName((String)((Map.Entry)localObject).getKey(), paramFromServiceMsg);
        ((b)((Map.Entry)localObject).getValue()).g.add(new w(paramToServiceMsg, paramFromServiceMsg));
      }
    }
    Object localObject = (b)c.get(paramString);
    if (localObject != null) {
      ((b)localObject).g.add(new w(paramToServiceMsg, paramFromServiceMsg));
    }
    for (;;)
    {
      d.a();
      return;
      if ((paramFromServiceMsg != null) && (paramFromServiceMsg.getServiceCmd() != null) && (paramFromServiceMsg.getServiceCmd().equals("SharpSvr.s2c"))) {}
      QLog.e("MSF.S.AppProcessManager", 1, "can not find " + paramString + " to receive msg to:" + paramToServiceMsg + " from:" + paramFromServiceMsg);
    }
  }
  
  public static void a(String paramString, Boolean paramBoolean)
  {
    b localb = (b)c.get(paramString);
    if (localb != null) {
      localb.d();
    }
    if (!paramBoolean.booleanValue()) {
      if (QLog.isColorLevel())
      {
        paramBoolean = new StringBuilder().append("unregister process :").append(paramString).append(" ");
        if (localb != null) {
          break label76;
        }
        paramString = "failed";
        QLog.d("MSF.S.AppProcessManager", 2, paramString);
      }
    }
    label76:
    do
    {
      return;
      paramString = "succ";
      break;
      localb = (b)c.remove(paramString);
      l.a().removeConfig("app_process_info_" + paramString);
    } while (!QLog.isColorLevel());
    paramBoolean = new StringBuilder().append("remove process :").append(paramString).append(" ");
    if (localb == null) {}
    for (paramString = "failed";; paramString = "succ")
    {
      QLog.d("MSF.S.AppProcessManager", 2, paramString);
      return;
    }
  }
  
  public static void a(String paramString1, String paramString2, IMsfServiceCallbacker paramIMsfServiceCallbacker, int paramInt)
  {
    if (paramString1.equals(QalService.getProccessName())) {
      QLog.e("MSF.S.AppProcessManager", "WARNING, bind self:" + paramString1);
    }
    if (!c.containsKey(paramString1))
    {
      c.putIfAbsent(paramString1, new b());
      if (QLog.isColorLevel()) {
        QLog.d("MSF.S.AppProcessManager", 2, "add bootName " + paramString1);
      }
    }
    ((b)c.get(paramString1)).a(paramString1, paramString2, paramIMsfServiceCallbacker);
    l.a().setConfig("app_process_info_" + paramString1, ((b)c.get(paramString1)).a());
    QLog.i("MSF.S.AppProcessManager", "onRegisterApp: " + paramString1);
    d.a();
  }
  
  public static void a(HashMap<String, String> paramHashMap)
  {
    ActivityManager localActivityManager = (ActivityManager)QalService.context.getSystemService("activity");
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    localActivityManager.getMemoryInfo(localMemoryInfo);
    paramHashMap.put("availMem", String.valueOf(localMemoryInfo.availMem));
    paramHashMap.put("lowMemory", String.valueOf(localMemoryInfo.lowMemory));
  }
  
  public static boolean b(String paramString)
  {
    b localb = (b)c.get(paramString);
    if ((localb != null) && (localb.c() != null))
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.S.AppProcessManager", 2, "process " + paramString + " also registed,can not unregister by proxy.");
      }
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */