package com.tencent.qalsdk.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseService;
import com.tencent.qalsdk.base.remote.IMsfServiceCallbacker;
import com.tencent.qalsdk.base.remote.MsfServiceBindInfo;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class z
  extends aj
{
  private static final String p = "MsfServiceProxy";
  ac a;
  protected volatile boolean b = false;
  IMsfServiceCallbacker c = new aa(this);
  
  public z(String paramString)
  {
    super(paramString);
  }
  
  private void a(FromServiceMsg paramFromServiceMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.d("MsfServiceProxy", 2, " onRecvPushResp " + paramFromServiceMsg);
    }
    if (!b(null, paramFromServiceMsg))
    {
      if (paramFromServiceMsg.getMsfCommand() != MsfCommand.pushSetConfig) {
        break label107;
      }
      NetConnInfoCenter.socketConnState = ((Integer)paramFromServiceMsg.getAttribute("_attr_socket_connstate")).intValue();
      NetConnInfoCenter.servetTimeSecondInterv = ((Long)paramFromServiceMsg.getAttribute("_attr_server")).longValue();
      QLog.d("MsfServiceProxy", "server interval time:" + NetConnInfoCenter.servetTimeSecondInterv);
    }
    label107:
    do
    {
      return;
      if (this.b)
      {
        QLog.d("MsfServiceProxy", 2, "onRecvServicePushResp  SsoCmd:" + paramFromServiceMsg.getServiceCmd() + " ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq());
        this.a.a(paramFromServiceMsg);
        return;
      }
    } while (!QLog.isColorLevel());
    QLog.d("MsfServiceProxy", 2, " close msfServiceConn. push msg is droped." + paramFromServiceMsg);
  }
  
  private void d(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    ToServiceMsg localToServiceMsg;
    if (paramToServiceMsg.isHttpReq())
    {
      localToServiceMsg = (ToServiceMsg)g.get(Integer.valueOf(paramToServiceMsg.getAppSeq()));
      if (localToServiceMsg == null) {
        break label205;
      }
      QLog.d("MsfServiceProxy", "onReceiveResp SsoCmd:" + paramToServiceMsg.getServiceCmd() + " ssoSeq:" + paramToServiceMsg.getRequestSsoSeq());
      if (!b(paramToServiceMsg, paramFromServiceMsg))
      {
        if (!this.b) {
          break label161;
        }
        if (QLog.isColorLevel()) {
          QLog.d("MsfServiceProxy", 2, "add queue req:" + paramToServiceMsg + " from:" + paramFromServiceMsg);
        }
        this.a.a(new w(paramToServiceMsg, paramFromServiceMsg));
      }
    }
    label161:
    while (!QLog.isColorLevel())
    {
      return;
      localToServiceMsg = (ToServiceMsg)g.remove(Integer.valueOf(paramToServiceMsg.getAppSeq()));
      break;
    }
    QLog.d("MsfServiceProxy", 2, " close msfServiceConn. msg is droped." + paramToServiceMsg.getRequestSsoSeq() + " " + paramFromServiceMsg);
    return;
    label205:
    QLog.d("MsfServiceProxy", 2, " found timeout resp to:" + paramToServiceMsg + " from:" + paramFromServiceMsg);
  }
  
  protected int a(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return -1;
    }
    paramToServiceMsg.setAppId(this.a.c);
    paramToServiceMsg.getAttributes().put("to_SendTime", Long.valueOf(System.currentTimeMillis()));
    paramToServiceMsg.getAttributes().put("to_SenderProcessName", this.a.e);
    if (QLog.isColorLevel()) {
      QLog.d("MsfServiceProxy", 2, " send req to msfService:" + paramToServiceMsg);
    }
    return this.d.sendToServiceMsg(paramToServiceMsg);
  }
  
  public int a(Boolean paramBoolean)
  {
    ToServiceMsg localToServiceMsg = new ToServiceMsg(this.a.d, "0", "cmd_UnRegisterMsfService");
    localToServiceMsg.setMsfCommand(MsfCommand.unRegisterMsfService);
    localToServiceMsg.extraData.putBoolean("to_stop_wake_process", paramBoolean.booleanValue());
    this.b = false;
    return c(localToServiceMsg);
  }
  
  void a()
  {
    try
    {
      ComponentName localComponentName = new ComponentName(QALSDKManager.getInstance().getContext().getPackageName(), this.a.d);
      Intent localIntent = new Intent();
      localIntent.setComponent(localComponentName);
      localIntent.putExtra("to_SenderProcessName", this.a.e);
      QALSDKManager.getInstance().getContext().startService(localIntent);
      QLog.d("MsfServiceProxy", 1, "start service finish");
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MsfServiceProxy", 1, " " + localException, localException);
    }
  }
  
  protected void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    c(paramToServiceMsg, paramFromServiceMsg);
  }
  
  public void a(ac paramac)
  {
    this.a = paramac;
    paramac.d = this.n;
  }
  
  public void b(ToServiceMsg paramToServiceMsg)
  {
    g.remove(Integer.valueOf(paramToServiceMsg.getAppSeq()));
  }
  
  boolean b()
  {
    try
    {
      ComponentName localComponentName = new ComponentName(QALSDKManager.getInstance().getContext().getPackageName(), this.a.d);
      Intent localIntent = new Intent();
      localIntent.putExtra("to_SenderProcessName", this.a.e);
      localIntent.setComponent(localComponentName);
      bool = QALSDKManager.getInstance().getContext().bindService(localIntent, this.o, 1);
      QLog.d("MsfServiceProxy", 1, " " + localException1, localException1);
    }
    catch (Exception localException1)
    {
      try
      {
        QLog.d("MsfServiceProxy", 1, "threadID:" + Thread.currentThread().getId() + ", threadName: " + Thread.currentThread().getName() + " bind " + this.a.d + " service finished " + bool);
        return bool;
      }
      catch (Exception localException2)
      {
        boolean bool;
        for (;;) {}
      }
      localException1 = localException1;
      bool = false;
    }
    return bool;
  }
  
  public boolean b(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    int i = paramFromServiceMsg.getBusinessFailCode();
    if (paramFromServiceMsg.getAttributes().containsKey("_attr_sameDevice")) {}
    for (boolean bool = ((Boolean)paramFromServiceMsg.getAttribute("_attr_sameDevice")).booleanValue();; bool = false)
    {
      switch (i)
      {
      case 2002: 
      case 2003: 
      case 2004: 
      case 2005: 
      case 2006: 
      case 2007: 
      case 2008: 
      case 2010: 
      default: 
        return false;
      case 2001: 
        QLog.d("MsfServiceProxy", 1, "BaseConstants.CODE_NO_LOGIN " + paramFromServiceMsg.hashCode());
        this.a.g.a(paramToServiceMsg, paramFromServiceMsg, bool);
        return true;
      case 2011: 
        this.a.g.b(paramToServiceMsg, paramFromServiceMsg, bool);
        return true;
      case 2012: 
        this.a.g.c(paramToServiceMsg, paramFromServiceMsg, bool);
        return true;
      case 2013: 
        this.a.g.d(paramToServiceMsg, paramFromServiceMsg, bool);
        return true;
      case 2009: 
        this.a.g.e(paramToServiceMsg, paramFromServiceMsg, bool);
        return true;
      }
      this.a.g.a(bool);
      return true;
    }
  }
  
  protected void c(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.d("MsfServiceProxy", 2, "add fail queue req:" + paramToServiceMsg + " from:" + paramFromServiceMsg);
    }
    this.a.a(new w(paramToServiceMsg, paramFromServiceMsg));
  }
  
  public boolean c()
  {
    try
    {
      ComponentName localComponentName = new ComponentName(QALSDKManager.getInstance().getContext().getPackageName(), this.a.d);
      Intent localIntent = new Intent();
      localIntent.setComponent(localComponentName);
      localIntent.putExtra("to_SenderProcessName", this.a.e);
      boolean bool = QALSDKManager.getInstance().getContext().stopService(localIntent);
      if (QLog.isColorLevel()) {
        QLog.d("MsfServiceProxy", 2, " stopService service finished " + bool);
      }
      return bool;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  protected void d()
  {
    int i = f();
    if (QLog.isColorLevel()) {
      QLog.d("MsfServiceProxy", 2, " registerMsfService result:" + i);
    }
    ab localab = new ab(this);
    localab.setName("handleWaitSendProxyMsgThread");
    try
    {
      localab.start();
      return;
    }
    catch (Throwable localThrowable)
    {
      QLog.d("MsfServiceProxy", 1, "error: " + localThrowable, localThrowable);
      e();
    }
  }
  
  public void e()
  {
    while (!f.isEmpty())
    {
      ToServiceMsg localToServiceMsg = (ToServiceMsg)f.poll();
      if (localToServiceMsg != null) {
        try
        {
          a(localToServiceMsg);
        }
        catch (Exception localException)
        {
          c(localToServiceMsg, a(localToServiceMsg, localToServiceMsg.getServiceName() + "sendMsgToServiceFailed，" + localException.toString()));
        }
      }
    }
  }
  
  public int f()
  {
    ToServiceMsg localToServiceMsg = new ToServiceMsg(this.a.d, "0", "cmd_RegisterMsfService");
    localToServiceMsg.setMsfCommand(MsfCommand.registerMsfService);
    MsfServiceBindInfo localMsfServiceBindInfo = new MsfServiceBindInfo(this.a.c, this.a.e, this.a.k(), this.c);
    localToServiceMsg.getAttributes().put("intent_bindServiceInfo", localMsfServiceBindInfo);
    localToServiceMsg.setNeedCallback(false);
    this.b = true;
    return c(localToServiceMsg);
  }
  
  public void g()
  {
    super.g();
    this.c = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */