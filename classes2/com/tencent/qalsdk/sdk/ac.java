package com.tencent.qalsdk.sdk;

import android.content.Context;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import qalsdk.w;

public class ac
  extends ad
{
  private static ac h = new ac();
  private static final String i = "MsfServiceSdk";
  z a;
  public volatile boolean b = false;
  
  public static ac a()
  {
    return h;
  }
  
  private void c(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return;
    }
    paramToServiceMsg.setAppId(this.c);
    paramToServiceMsg.setTimeout(15000L);
    MsfSdkUtils.addToMsgProcessName(this.e, paramToServiceMsg);
  }
  
  public ToServiceMsg a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = new ToServiceMsg(b(), paramString1, "push.proxyUnRegister");
    paramString1.setMsfCommand(MsfCommand.proxyUnRegisterPush);
    paramString1.getAttributes().put(paramString1.getServiceCmd(), paramString2);
    c(paramString1);
    return paramString1;
  }
  
  public ToServiceMsg a(c paramc)
  {
    ToServiceMsg localToServiceMsg = new ToServiceMsg(b(), paramc.a, "push.cmdRegister");
    localToServiceMsg.setMsfCommand(MsfCommand.registerCmdCallback);
    ai.a(localToServiceMsg, paramc);
    c(localToServiceMsg);
    return localToServiceMsg;
  }
  
  public ToServiceMsg a(String paramString)
  {
    paramString = new ToServiceMsg(b(), paramString, "cmd_refreshTickets");
    paramString.setMsfCommand(MsfCommand.refreshTickets);
    c(paramString);
    return paramString;
  }
  
  public ToServiceMsg a(String paramString, c paramc)
  {
    paramString = new ToServiceMsg(b(), paramString, "push.resetCmds");
    paramString.setMsfCommand(MsfCommand.resetCmdCallback);
    ai.a(paramString, paramc);
    c(paramString);
    return paramString;
  }
  
  public void a(Context paramContext, int paramInt, String paramString1, String paramString2, w paramw, String paramString3)
  {
    this.a = new z(paramString2);
    this.a.a(this);
    super.a(paramString3, paramInt, paramString1, paramw);
    this.b = true;
  }
  
  public void a(ToServiceMsg paramToServiceMsg)
  {
    this.a.b(paramToServiceMsg);
  }
  
  public void a(Boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public int b(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return -1;
    }
    QLog.d("MsfServiceSdk", "sdk sendMsg. ssoCmd:" + paramToServiceMsg.getServiceCmd() + " msfCmd:" + paramToServiceMsg.getMsfCommand() + " appSeq:" + paramToServiceMsg.getAppSeq());
    if (paramToServiceMsg.getServiceName().equals(b())) {
      return this.a.c(paramToServiceMsg);
    }
    return b.a(paramToServiceMsg);
  }
  
  public ToServiceMsg b(String paramString)
  {
    paramString = new ToServiceMsg(b(), paramString, "ConfigService.ClientReq");
    paramString.setMsfCommand(MsfCommand.getPluginConfig);
    c(paramString);
    return paramString;
  }
  
  public String b()
  {
    if (this.b == true) {
      return this.a.a.d;
    }
    this.a = new z("com.tencent.mobileqq.msf.service.MsfService");
    this.a.a(this);
    this.b = true;
    this.c = 88886666;
    return this.a.a.d;
  }
  
  public void c()
  {
    this.a.a();
    this.a.b();
  }
  
  public void d()
  {
    this.a.a();
  }
  
  public void e()
  {
    this.a.b();
  }
  
  public void f()
  {
    this.a.f();
  }
  
  public void g()
  {
    this.a.a(Boolean.valueOf(true));
  }
  
  public void h()
  {
    this.a.e();
    this.a.g();
  }
  
  public void i()
  {
    this.a.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */