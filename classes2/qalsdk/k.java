package qalsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.im_open.common.CmdErrorCode;
import com.tencent.qalsdk.im_open.stat_hello.ReqBody;
import com.tencent.qalsdk.im_open.stat_hello.RspBody;
import com.tencent.qalsdk.im_open.stat_reg.ReqBody;
import com.tencent.qalsdk.im_open.stat_reg.RspBody;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.service.g;
import com.tencent.qalsdk.util.QLog;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class k
{
  public static String d = "im_open_status.stat_hello";
  private static byte g = 0;
  aj a;
  long b = 0L;
  int c = 0;
  long e = 0L;
  int f = 0;
  private final String h = "unrtime";
  
  public k(aj paramaj)
  {
    this.a = paramaj;
  }
  
  long a(String paramString)
  {
    return QalService.context.getSharedPreferences("unrtime", 0).getLong(paramString, 0L);
  }
  
  void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    ((Long)paramToServiceMsg.getAttribute("__timestamp_app2msf")).longValue();
    String str2 = g.b(paramToServiceMsg) + paramToServiceMsg.getUin();
    int k = -1;
    long l2 = -1L;
    int n = -1;
    for (;;)
    {
      int j;
      long l1;
      Object localObject1;
      int i;
      int m;
      try
      {
        Object localObject2;
        Object localObject3;
        if (!paramFromServiceMsg.isSuccess())
        {
          j = 0;
          l1 = -1L;
          localObject1 = null;
          i = -1;
          if ((paramToServiceMsg == null) || (!paramToServiceMsg.getAttributes().containsKey("regPushReason"))) {
            break label1177;
          }
          localObject2 = (String)paramToServiceMsg.getAttribute("regPushReason");
          if (j == 0) {
            break label1103;
          }
          this.c = 0;
          this.e = System.currentTimeMillis();
          if (paramToServiceMsg.getMsfCommand() == MsfCommand._msf_UnRegPush)
          {
            QLog.d("MSF.C.PushManager:PushCoder", 1, "handlerPush unregister push succ");
            localObject3 = (j)this.a.e.get(str2);
            if (localObject3 != null)
            {
              ((j)localObject3).o = 0;
              ((j)localObject3).i = this.a.a.s;
              ((j)localObject3).f = System.currentTimeMillis();
              if (localObject1 == null) {
                break label1046;
              }
              if (QLog.isColorLevel()) {
                QLog.d("MSF.C.PushManager:PushCoder", 2, "recv register push resp.iInterval=" + ((stat_reg.RspBody)localObject1).uint32_hello_interval.get() + ", queryIntervTime=" + this.a.e() + ", next query time is " + aj.d.format(Long.valueOf(System.currentTimeMillis() + ((stat_reg.RspBody)localObject1).uint32_hello_interval.get() * 1000)));
              }
              this.a.o = (((stat_reg.RspBody)localObject1).uint32_hello_interval.get() * 1000);
              if (paramToServiceMsg.getMsfCommand() == MsfCommand._msf_RegPush)
              {
                localObject1 = (Boolean)this.a.f.get(((j)localObject3).k.a);
                if ((localObject1 == null) || (!((Boolean)localObject1).booleanValue())) {
                  this.a.a(this.a.e(), str2);
                }
              }
            }
            this.a.f.put(paramToServiceMsg.getUin(), Boolean.valueOf(true));
            if (paramToServiceMsg.getMsfCommand() != MsfCommand._msf_RegPush) {
              break label1125;
            }
            paramFromServiceMsg.setMsfCommand(MsfCommand.registerPush);
            paramFromServiceMsg.addAttribute("to_conn_apn", ak.b());
            paramFromServiceMsg.addAttribute("to_conn_radioType", Integer.valueOf(ak.c()));
            paramFromServiceMsg.addAttribute("to_conn_serverIP", this.a.a.c.a.m().a());
            paramFromServiceMsg.addAttribute("to_conn_gateIP", com.tencent.qalsdk.core.j.q);
            if (!((String)localObject2).equals("appRegister")) {
              break label1156;
            }
            if (!paramToServiceMsg.getAttributes().containsKey("to_srcCmd")) {
              break label1191;
            }
            this.a.a.a(paramToServiceMsg, paramFromServiceMsg);
          }
        }
        else
        {
          if ((paramFromServiceMsg.getWupBuffer() == null) || (paramFromServiceMsg.getWupBuffer().length < 5)) {
            break label1192;
          }
          localObject1 = new stat_reg.RspBody();
          i = n;
          l1 = l2;
          j = k;
          try
          {
            localObject2 = paramFromServiceMsg.getWupBuffer();
            i = n;
            l1 = l2;
            j = k;
            localObject3 = new byte[localObject2.length - 4];
            i = n;
            l1 = l2;
            j = k;
            System.arraycopy(localObject2, 4, localObject3, 0, localObject2.length - 4);
            i = n;
            l1 = l2;
            j = k;
            ((stat_reg.RspBody)localObject1).mergeFrom((byte[])localObject3);
            i = n;
            l1 = l2;
            j = k;
            com.tencent.qalsdk.core.o.b(((stat_reg.RspBody)localObject1).str_client_ip.get());
            i = n;
            l1 = l2;
            j = k;
            com.tencent.qalsdk.core.o.b(((stat_reg.RspBody)localObject1).uint32_client_port.get());
            i = n;
            l1 = l2;
            j = k;
            com.tencent.qalsdk.core.j.q = ((stat_reg.RspBody)localObject1).str_client_ip.get();
            i = n;
            l1 = l2;
            j = k;
            m = (byte)((stat_reg.RspBody)localObject1).uint32_update_flag.get();
            i = n;
            l1 = l2;
            j = m;
            l2 = ((stat_reg.RspBody)localObject1).uint32_timestamp.get();
            i = n;
            l1 = l2;
            j = m;
            n = (byte)((stat_reg.RspBody)localObject1).enum_cmd_error_code.uint32_code.get();
            if (n == 0) {
              break label1185;
            }
            i = n;
            l1 = l2;
            j = m;
            QLog.e("MSF.C.PushManager:PushCoder", 1, "register pushresp error code: " + ((stat_reg.RspBody)localObject1).enum_cmd_error_code.uint32_code.get() + "msg:" + ((stat_reg.RspBody)localObject1).str_errmsg.get() + "sso seq:" + paramFromServiceMsg.getRequestSsoSeq());
            k = 0;
            i = n;
            l1 = l2;
            j = m;
            NetConnInfoCenter.handleGetServerTimeResp(((stat_reg.RspBody)localObject1).uint32_server_time.get());
            i = n;
            l1 = l2;
            j = m;
            if (QLog.isDevelopLevel())
            {
              i = n;
              l1 = l2;
              j = m;
              QLog.d("MSF.C.PushManager:PushCoder", 4, "pushresp servertime is " + ((stat_reg.RspBody)localObject1).uint32_server_time.get() + this.a.a.m.format(Integer.valueOf(((stat_reg.RspBody)localObject1).uint32_server_time.get() * 1000)));
            }
            j = k;
            i = n;
            l1 = l2;
            k = m;
          }
          catch (Exception localException)
          {
            if (!QLog.isColorLevel()) {
              break label1208;
            }
          }
          QLog.d("MSF.C.PushManager:PushCoder", 2, "decodeRegisterPushResp error", localException);
          break label1208;
        }
        QLog.d("MSF.C.PushManager:PushCoder", 1, "handlerPush register push succ  bUpdateFlag:" + k + " timeStamp:" + l1 + " cReplyCode:" + i);
        continue;
        if (!QLog.isColorLevel()) {
          break label1084;
        }
      }
      catch (Throwable paramToServiceMsg)
      {
        this.a.a(this.a.e(), str2);
        paramToServiceMsg.printStackTrace();
        return;
      }
      label1046:
      QLog.d("MSF.C.PushManager:PushCoder", 2, "recv null register push resp, use default intervTime " + this.a.e());
      label1084:
      this.a.a(this.a.e(), str2);
      continue;
      label1103:
      this.a.f.put(paramToServiceMsg.getUin(), Boolean.valueOf(false));
      continue;
      label1125:
      if (paramToServiceMsg.getMsfCommand() == MsfCommand._msf_UnRegPush)
      {
        paramFromServiceMsg.setMsfCommand(MsfCommand.unRegisterPush);
      }
      else
      {
        paramFromServiceMsg.setMsfCommand(paramToServiceMsg.getMsfCommand());
        continue;
        label1156:
        MsfSdkUtils.addFromMsgProcessName(g.b(paramToServiceMsg), paramFromServiceMsg);
        this.a.a.a(null, paramFromServiceMsg);
        return;
        label1177:
        String str1 = "unknown";
        continue;
        label1185:
        k = 1;
        continue;
        label1191:
        return;
        label1192:
        j = 0;
        l1 = -1L;
        localObject1 = null;
        i = -1;
        continue;
        label1208:
        m = 0;
        k = j;
        j = m;
      }
    }
  }
  
  void a(String paramString, long paramLong)
  {
    QalService.context.getSharedPreferences("unrtime", 0).edit().putLong(paramString, paramLong).commit();
  }
  
  void a(String paramString, j paramj, boolean paramBoolean)
  {
    if ((ah.b) && (!paramBoolean))
    {
      long l = this.a.d(paramj.k.a) + this.a.e();
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager:PushCoder", 2, "sendMsgPushQuery, check time now=" + aj.d.format(Long.valueOf(System.currentTimeMillis())) + ", shouldSendQueryTime=" + aj.d.format(Long.valueOf(l)));
      }
      if (System.currentTimeMillis() < l) {
        this.a.a(l - System.currentTimeMillis(), paramString);
      }
    }
    do
    {
      for (;;)
      {
        return;
        if (paramj.k != null) {
          if ((paramj.k.a != null) && (paramj.c > 0L))
          {
            paramString = this.a.b + "|" + m.n() + "|" + m.l() + "|" + (System.currentTimeMillis() - this.e);
            Object localObject = new stat_hello.ReqBody();
            ((stat_hello.ReqBody)localObject).uint32_status.set(paramj.k.c);
            ((stat_hello.ReqBody)localObject).bytes_guid.set(ByteStringMicro.copyFrom(com.tencent.qalsdk.core.j.a().c()));
            ((stat_hello.ReqBody)localObject).str_dev_name.set(Build.MODEL);
            ((stat_hello.ReqBody)localObject).str_dev_type.set(Build.MODEL);
            ((stat_hello.ReqBody)localObject).str_os_ver.set(Build.VERSION.RELEASE);
            ((stat_hello.ReqBody)localObject).str_firmware_ver.set("");
            ((stat_hello.ReqBody)localObject).vender_appid.set(0);
            ToServiceMsg localToServiceMsg = new ToServiceMsg("", paramj.k.a, d);
            localObject = ((stat_hello.ReqBody)localObject).toByteArray();
            localToServiceMsg.setAppId(paramj.a);
            localToServiceMsg.setTimeout(15000L);
            localToServiceMsg.setMsfCommand(MsfCommand._msf_queryPush);
            localToServiceMsg.setRequestSsoSeq(com.tencent.qalsdk.core.j.f());
            localToServiceMsg.putWupBuffer(com.tencent.qalsdk.core.o.b((byte[])localObject));
            MsfSdkUtils.addToMsgProcessName(paramj.b, localToServiceMsg);
            try
            {
              this.a.a.a(localToServiceMsg);
              if (QLog.isColorLevel())
              {
                QLog.d("MSF.C.PushManager:PushCoder", 2, "send " + paramj.k.a + " query push id " + paramj.c + " model:" + paramString);
                return;
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                QLog.w("MSF.C.PushManager:PushCoder", 1, "query push error " + localException, localException);
              }
            }
          }
        }
      }
    } while (!QLog.isColorLevel());
    QLog.d("MSF.C.PushManager:PushCoder", 2, "pushUin is " + paramj.k.a + ", queryPushId is " + paramj.c + ". no query");
  }
  
  void a(j paramj, ToServiceMsg paramToServiceMsg, boolean paramBoolean, o paramo)
  {
    if (paramj.k == null) {}
    boolean bool;
    do
    {
      return;
      bool = a(paramo);
      if ((!ah.t()) || (ah.a(paramj.k.a))) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("MSF.C.PushManager:PushCoder", 2, paramj.k.a + " is booting and can not autoRegisterPush,return.");
    return;
    if ((!bool) && (!paramBoolean) && (paramj.o == 1) && (System.currentTimeMillis() - paramj.e < 30000L))
    {
      QLog.i("MSF.C.PushManager:PushCoder", 1, "is in registting, no need send register again, return. ");
      return;
    }
    if (paramBoolean) {}
    try
    {
      a(paramToServiceMsg.getUin(), System.currentTimeMillis());
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.PushManager:PushCoder", 2, "ConfigManager.isAutoStarting():" + ah.t());
        }
        try
        {
          localReqBody = new stat_reg.ReqBody();
          localReqBody.uint64_bid.set(paramj.c);
          localReqBody.uint32_conn_type.set(g);
          localReqBody.uint32_status.set(paramj.k.c);
          localReqBody.uint32_kick_pc.set(paramj.k.d);
          localReqBody.uint32_timestamp.set((int)paramj.k.f);
          localObject = localReqBody.uint32_regtype;
          if ((paramo == o.b) || (paramo == o.g)) {
            break label858;
          }
          if (paramo != o.h) {
            break;
          }
        }
        catch (Exception paramj)
        {
          for (;;)
          {
            stat_reg.ReqBody localReqBody;
            Object localObject;
            int i;
            ToServiceMsg localToServiceMsg;
            QLog.d("MSF.C.PushManager:PushCoder", 1, "send registerPush error " + paramj, paramj);
            continue;
            localToServiceMsg.setMsfCommand(MsfCommand._msf_RegPush);
            continue;
            if (paramo == o.i)
            {
              localToServiceMsg.setNeedCallback(false);
              continue;
              paramj.o = 1;
              QLog.i("MSF.C.PushManager:PushCoder", 1, "send register. push id " + paramj.c + " pushStatus:" + paramj.k.c + " bRegType:" + localException.uint32_regtype.get() + " timeStamp:" + localException.uint32_timestamp.get() + ":" + paramj.e);
              continue;
              i = 0;
            }
          }
        }
        ((PBUInt32Field)localObject).set((byte)i);
        localReqBody.bytes_guid.set(ByteStringMicro.copyFrom(com.tencent.qalsdk.core.j.a().c()));
        localReqBody.str_dev_name.set(Build.MODEL);
        localReqBody.str_dev_type.set(Build.MODEL);
        localReqBody.str_os_ver.set(Build.VERSION.RELEASE);
        localReqBody.str_build_ver.set(Build.VERSION.SDK);
        localReqBody.vender_appid.set(0);
        localReqBody.uint64_tinyid.set(Long.parseLong(paramj.k.a));
        localObject = localReqBody.toByteArray();
        localToServiceMsg = new ToServiceMsg("", paramj.k.a, "im_open_status.stat_reg");
        localToServiceMsg.setAppId(paramj.a);
        if (paramToServiceMsg == null) {
          break label684;
        }
        localToServiceMsg.setAppSeq(paramToServiceMsg.getAppSeq());
        localToServiceMsg.addAttribute("to_srcCmd", paramToServiceMsg.getServiceCmd());
        localToServiceMsg.setRequestSsoSeq(com.tencent.qalsdk.core.j.f());
        localToServiceMsg.putWupBuffer(com.tencent.qalsdk.core.o.b((byte[])localObject));
        localToServiceMsg.setTimeout(15000L);
        localToServiceMsg.addAttribute("regPushReason", paramo.toString());
        if (!paramBoolean) {
          break label730;
        }
        localToServiceMsg.setMsfCommand(MsfCommand._msf_UnRegPush);
        MsfSdkUtils.addToMsgProcessName(paramj.b, localToServiceMsg);
        this.b = System.currentTimeMillis();
        if (paramo != o.b) {
          break label741;
        }
        localToServiceMsg.setActionListener(paramToServiceMsg.getActionListener());
        this.a.a.a(localToServiceMsg);
        paramj.e = System.currentTimeMillis();
        if (!paramBoolean) {
          break label758;
        }
        QLog.i("MSF.C.PushManager:PushCoder", 1, "send unregister.push id " + paramj.c + " pushStatus:" + paramj.k.c + " bRegType:" + localReqBody.uint32_regtype.get());
        this.a.a();
        return;
        if ((paramToServiceMsg != null) && (a(paramToServiceMsg.getUin()) != 0L)) {
          a(paramToServiceMsg.getUin(), 0L);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        QLog.d("MSF.C.PushManager:PushCoder", 1, "get reginterv error " + localException, localException);
        continue;
        i = 1;
        continue;
        label684:
        localToServiceMsg.addAttribute("to_srcCmd", "im_open_status.stat_reg");
      }
    }
  }
  
  boolean a(o paramo)
  {
    return (paramo == o.b) || (paramo == o.g) || (paramo == o.h);
  }
  
  void b(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    paramToServiceMsg = g.b(paramToServiceMsg) + paramToServiceMsg.getUin();
    if ((j)this.a.e.get(paramToServiceMsg) != null) {
      try
      {
        if (paramFromServiceMsg.isSuccess())
        {
          stat_hello.RspBody localRspBody = new stat_hello.RspBody();
          paramFromServiceMsg = paramFromServiceMsg.getWupBuffer();
          byte[] arrayOfByte = new byte[paramFromServiceMsg.length - 4];
          System.arraycopy(paramFromServiceMsg, 4, arrayOfByte, 0, paramFromServiceMsg.length - 4);
          localRspBody.mergeFrom(arrayOfByte);
          this.f = 0;
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.PushManager:PushCoder", 2, "recv query push resp.iInterval=" + localRspBody.uint32_hello_interval.get() + ", queryIntervTime=" + this.a.e() + ", next query time is " + aj.d.format(Long.valueOf(System.currentTimeMillis() + localRspBody.uint32_hello_interval.get() * 1000)));
          }
          this.a.o = (localRspBody.uint32_hello_interval.get() * 1000);
          this.a.a(this.a.e(), paramToServiceMsg);
          com.tencent.qalsdk.core.o.b(localRspBody.str_client_ip.get());
          return;
        }
        this.a.a(180000L, paramToServiceMsg);
        return;
      }
      catch (Throwable paramFromServiceMsg)
      {
        paramFromServiceMsg.printStackTrace();
        this.a.a(this.a.e(), paramToServiceMsg);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */