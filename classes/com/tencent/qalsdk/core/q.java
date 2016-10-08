package com.tencent.qalsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.im_open.stat_forceoffline.ReqBody;
import com.tencent.qalsdk.im_open.stat_forceoffline.RspBody;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import qalsdk.ah;
import qalsdk.aj;
import qalsdk.ak;
import qalsdk.at;
import qalsdk.av;
import qalsdk.u;

public class q
{
  public static final int a = 210;
  public static final int b = -12003;
  public static final int c = -10001;
  public static final int d = -10003;
  public static final int e = -10004;
  public static final int f = -10005;
  public static final int g = -10006;
  public static final int h = -10000;
  public static final int i = -10007;
  public static final int j = -10009;
  public static final int k = -10101;
  public static final int l = -10102;
  public static final int m = -10103;
  public static final int n = -10104;
  public static final int o = -10105;
  public static final int p = -10106;
  static final String q = "OverLoadPush.notify";
  private static final String u = "MSF.C.SSORespHandler";
  private static final int v = 1000;
  j r;
  long s = -1L;
  long t = -1L;
  private Handler w = new r(this);
  
  public q(j paramj)
  {
    this.r = paramj;
  }
  
  private void a(ToServiceMsg paramToServiceMsg)
  {
    paramToServiceMsg = new FromServiceMsg(this.r.i(), j.f(), "0", "cmd_connInfo");
    paramToServiceMsg.setMsgSuccess();
    paramToServiceMsg.setMsfCommand(MsfCommand.onConnInfo);
    paramToServiceMsg.addAttribute("to_conn_apn", ak.b());
    paramToServiceMsg.addAttribute("to_conn_radioType", Integer.valueOf(ak.c()));
    paramToServiceMsg.addAttribute("to_conn_serverIP", this.r.c.a.m().a());
    paramToServiceMsg.addAttribute("to_conn_gateIP", j.q);
    paramToServiceMsg.getAttributes().put("to_SenderProcessName", "*");
    QLog.d("MSF.C.SSORespHandler", "send conn info:" + ak.b() + ":" + ak.c() + ":" + this.r.c.a.m().a() + ":" + j.q);
    this.r.a(null, paramToServiceMsg);
  }
  
  public void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if (paramToServiceMsg != null) {
      paramToServiceMsg.getAttributes().remove("to_timeoutCallbacker");
    }
    long l1;
    if (paramFromServiceMsg.getServiceCmd().startsWith("SharpSvr."))
    {
      l1 = SystemClock.elapsedRealtime();
      if ((o.s <= 0L) || (l1 - o.s <= 0L) || (l1 - o.s > 30000L)) {
        break label98;
      }
      paramFromServiceMsg.addAttribute("__timestamp_msf2net_boot_sharp_c2s", Long.valueOf(o.s));
    }
    while (a(paramFromServiceMsg, paramToServiceMsg))
    {
      if (paramFromServiceMsg.getServiceCmd().startsWith("wtlogin.")) {}
      return;
      label98:
      paramFromServiceMsg.addAttribute("__timestamp_msf2net_boot_sharp_c2s", Integer.valueOf(-1));
    }
    if ((ah.b) && (paramToServiceMsg != null) && (paramToServiceMsg.getMsfCommand() != MsfCommand._msf_RegPush) && (paramToServiceMsg.getMsfCommand() != MsfCommand._msf_queryPush) && (this.r.d != null)) {
      this.r.d.a(paramToServiceMsg.getUin(), System.currentTimeMillis());
    }
    if (paramFromServiceMsg.getServiceCmd().equals("OnlinePush.SidTicketExpired"))
    {
      Object localObject = new ToServiceMsg("", paramFromServiceMsg.getUin(), paramFromServiceMsg.getServiceCmd());
      ((ToServiceMsg)localObject).setRequestSsoSeq(paramFromServiceMsg.getRequestSsoSeq());
      ((ToServiceMsg)localObject).setAppId(this.r.i());
      ((ToServiceMsg)localObject).setNeedCallback(false);
      ((ToServiceMsg)localObject).setTimeout(15000L);
      this.r.a((ToServiceMsg)localObject);
      localObject = this.w.obtainMessage();
      ((Message)localObject).what = 1000;
      ((Message)localObject).obj = paramFromServiceMsg.getUin();
      if (this.w.hasMessages(1000)) {
        this.w.removeMessages(1000);
      }
      this.w.sendMessageDelayed((Message)localObject, 3000L);
    }
    if (paramToServiceMsg == null)
    {
      if (paramFromServiceMsg.getServiceCmd().equals("ConfigPushSvc.PushReq"))
      {
        ah.a(j.a(paramFromServiceMsg));
        return;
      }
      this.r.d.a(paramFromServiceMsg);
      return;
    }
    long l2;
    switch (s.a[paramToServiceMsg.getMsfCommand().ordinal()])
    {
    default: 
      paramFromServiceMsg.setAppId(paramToServiceMsg.getAppId());
      paramFromServiceMsg.setAppSeq(paramToServiceMsg.getAppSeq());
      paramFromServiceMsg.setMsfCommand(paramToServiceMsg.getMsfCommand());
      this.r.a(paramToServiceMsg, paramFromServiceMsg);
      return;
    case 1: 
      this.r.d.a(paramToServiceMsg, paramFromServiceMsg);
      a(paramToServiceMsg);
      return;
    case 2: 
      this.r.d.a(paramToServiceMsg, paramFromServiceMsg);
      return;
    case 3: 
      this.r.d.b(paramToServiceMsg, paramFromServiceMsg);
      return;
    case 4: 
      l2 = System.currentTimeMillis() / 1000L;
      l1 = l2;
      try
      {
        if (paramFromServiceMsg.isSuccess())
        {
          int i1 = MsfSdkUtils.convertBytes2Int(paramFromServiceMsg.getWupBuffer(), 4);
          l1 = i1;
        }
      }
      catch (Exception paramToServiceMsg)
      {
        for (;;)
        {
          l1 = l2;
          if (QLog.isDevelopLevel())
          {
            QLog.d("MSF.C.SSORespHandler", 4, "handle serverTime error " + paramToServiceMsg);
            l1 = l2;
          }
        }
      }
      NetConnInfoCenter.handleGetServerTimeResp(l1);
      return;
    }
    this.r.o.a(paramFromServiceMsg);
  }
  
  protected boolean a(int paramInt)
  {
    return (paramInt == 53533) || (paramInt == 210) || (paramInt == 55535) || (paramInt == 55533) || (paramInt == 55532) || (paramInt == 55530) || (paramInt == 55430);
  }
  
  protected boolean a(FromServiceMsg paramFromServiceMsg, ToServiceMsg paramToServiceMsg)
  {
    int i1 = paramFromServiceMsg.getBusinessFailCode();
    boolean bool2 = a(i1);
    boolean bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (i1 == 55531)
      {
        if (this.s == -1L) {
          this.s = System.currentTimeMillis();
        }
        if (this.r.c.H.get()) {
          break label95;
        }
        bool1 = bool2;
      }
    }
    if (bool1)
    {
      MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
      this.r.a(paramToServiceMsg, paramFromServiceMsg);
    }
    label95:
    label226:
    do
    {
      return true;
      if ((paramToServiceMsg != null) && (this.r.c.G != -1) && (paramToServiceMsg.getRequestSsoSeq() >= this.r.c.G))
      {
        if (!QLog.isColorLevel()) {
          break label226;
        }
        QLog.i("MSF.C.SSORespHandler", 2, "set userTokenExpired. afterReloadD2SendSeq is " + this.r.c.G);
        bool1 = true;
        break;
      }
      bool1 = bool2;
      if (this.s == -1L) {
        break;
      }
      bool1 = bool2;
      if (System.currentTimeMillis() - this.s <= 60000L) {
        break;
      }
      if (QLog.isColorLevel()) {
        QLog.i("MSF.C.SSORespHandler", 2, "set userTokenExpired after so long wait. ");
      }
      bool1 = true;
      break;
      if (i1 == 55435)
      {
        paramFromServiceMsg.setBusinessFail(2011, paramFromServiceMsg.getBusinessFailMsg());
        MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
        this.r.a(paramToServiceMsg, paramFromServiceMsg);
        return true;
      }
      if (i1 == 55434)
      {
        this.r.j();
        paramFromServiceMsg.setBusinessFail(2009, paramFromServiceMsg.getBusinessFailMsg());
        MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
        this.r.a(paramToServiceMsg, paramFromServiceMsg);
        return true;
      }
      if (i1 == 55527)
      {
        paramFromServiceMsg.setBusinessFail(2015, paramFromServiceMsg.getBusinessFailMsg());
        MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
        this.r.a(paramToServiceMsg, paramFromServiceMsg);
        this.r.c.a(CloseConnReason.ssoInvalidCookie);
        return true;
      }
      if (i1 == 55432)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.SSORespHandler", 2, "get CODE_SSO_FORCEQUIT kill " + this.r.r.getPackageName() + ":qq now");
        }
        MsfSdkUtils.killProcess(this.r.r, this.r.r.getPackageName());
        return true;
      }
      if (i1 == 55431)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.SSORespHandler", 2, "get CODE_SSO_FORCEQUITSDK kill " + this.r.r.getPackageName() + ":msf now");
        }
        MsfSdkUtils.killProcess(this.r.r, this.r.r.getPackageName() + ":MSF");
        return true;
      }
      if (!paramFromServiceMsg.getServiceCmd().equals("MessageSvc.PushForceOffline")) {
        break label637;
      }
      try
      {
        this.r.d.b(paramFromServiceMsg.getUin());
        paramFromServiceMsg.addAttribute("_attr_sameDevice", Boolean.valueOf(false));
        paramFromServiceMsg.setBusinessFail(2013, paramFromServiceMsg.getBusinessFailMsg());
        MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
        this.r.a(paramToServiceMsg, paramFromServiceMsg);
        return true;
      }
      catch (Exception paramFromServiceMsg) {}
    } while (!QLog.isColorLevel());
    QLog.e("MSF.C.SSORespHandler", 2, "handle forceLogout error " + paramFromServiceMsg);
    return true;
    label637:
    if (paramFromServiceMsg.getServiceCmd().equals("openqq.stat_forceoffline")) {
      for (;;)
      {
        try
        {
          this.r.d.b(paramFromServiceMsg.getUin());
          stat_forceoffline.ReqBody localReqBody = new stat_forceoffline.ReqBody();
          Object localObject = new byte[paramFromServiceMsg.getWupBuffer().length - 4];
          System.arraycopy(paramFromServiceMsg.getWupBuffer(), 4, localObject, 0, localObject.length);
          localReqBody.mergeFrom((byte[])localObject);
          if (localReqBody.uint32_clear_sig.get() == 0)
          {
            this.r.d.b(paramFromServiceMsg.getUin());
            paramFromServiceMsg.addAttribute("_attr_sameDevice", Integer.valueOf(localReqBody.uint32_same_device.get()));
            paramFromServiceMsg.addAttribute("_attr_kickInfo", localReqBody.str_info.get());
            paramFromServiceMsg.addAttribute("_attr_kickTitle", localReqBody.str_title.get());
            paramFromServiceMsg.setBusinessFail(2013, localReqBody.str_info.get());
            MsfSdkUtils.addFromMsgProcessName("*", paramFromServiceMsg);
            this.r.a(paramToServiceMsg, paramFromServiceMsg);
          }
          paramToServiceMsg = new ToServiceMsg("", paramFromServiceMsg.getUin(), "openqq.stat_forceoffline");
          paramToServiceMsg.addAttribute("_attr_sameDevice", Integer.valueOf(localReqBody.uint32_same_device.get()));
          paramToServiceMsg.addAttribute("_attr_kickInfo", localReqBody.str_info.get());
          paramToServiceMsg.addAttribute("_attr_kickTitle", localReqBody.str_title.get());
          localObject = new stat_forceoffline.RspBody();
          ((stat_forceoffline.RspBody)localObject).uint32_seqno.set(localReqBody.uint32_seqno.get());
          ((stat_forceoffline.RspBody)localObject).uint32_result.set(0);
          localObject = ((stat_forceoffline.RspBody)localObject).toByteArray();
          if (localReqBody.uint32_clear_sig.get() == 0) {
            break label1026;
          }
          paramToServiceMsg.setMsfCommand(MsfCommand._msf_kickedAndCleanTokenResp);
          paramToServiceMsg.setNeedCallback(false);
          paramToServiceMsg.putWupBuffer(o.b((byte[])localObject));
          paramToServiceMsg.setRequestSsoSeq(j.f());
          paramToServiceMsg.setAppId(this.r.i());
          paramToServiceMsg.setTimeout(15000L);
          paramToServiceMsg.addAttribute(paramToServiceMsg.getServiceCmd(), paramFromServiceMsg);
          this.r.c.b(paramToServiceMsg);
          return true;
        }
        catch (Exception paramFromServiceMsg) {}
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.e("MSF.C.SSORespHandler", 2, "send offlineResp error " + paramFromServiceMsg);
        return true;
        label1026:
        paramToServiceMsg.setMsfCommand(MsfCommand._msf_kickedResp);
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */