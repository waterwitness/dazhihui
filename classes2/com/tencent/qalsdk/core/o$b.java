package com.tencent.qalsdk.core;

import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.a;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.ae;
import com.tencent.qalsdk.util.CodecWarpper;
import com.tencent.qalsdk.util.QLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import qalsdk.ah;
import qalsdk.at;
import qalsdk.av;

class o$b
  extends Thread
{
  long a = 0L;
  
  o$b(o paramo) {}
  
  private void a(ToServiceMsg paramToServiceMsg, String paramString1, String paramString2)
  {
    this.b.a(paramToServiceMsg.getRequestSsoSeq());
  }
  
  public void run()
  {
    ToServiceMsg localToServiceMsg;
    Object localObject2;
    int i;
    String str;
    long l1;
    long l2;
    byte b1;
    label145:
    label165:
    label228:
    boolean bool1;
    for (;;)
    {
      byte b2;
      Object localObject1;
      try
      {
        localToServiceMsg = (ToServiceMsg)o.a(this.b).k();
        if (localToServiceMsg != null)
        {
          try
          {
            localObject2 = localToServiceMsg.getServiceCmd();
            i = ((String)localObject2).indexOf("#");
            if (i == -1) {
              break;
            }
            str = ((String)localObject2).substring(i + 1, ((String)localObject2).length()) + "_new";
            localObject2 = ((String)localObject2).substring(0, i);
            l1 = ((Long)localToServiceMsg.getAttribute("__timestamp_addSendQueue", Long.valueOf(0L))).longValue();
            l2 = System.currentTimeMillis();
            this.b.o.e.a(localToServiceMsg, l2);
            if (localToServiceMsg.getWupBuffer() == null) {
              break label637;
            }
            b2 = 0;
            if (!m.e()) {
              break label428;
            }
            b1 = 1;
            if (localToServiceMsg.getMsfCommand() != MsfCommand.qal_Hello) {
              break label580;
            }
            arrayOfByte1 = localToServiceMsg.getWupBuffer();
          }
          catch (Throwable localThrowable1)
          {
            byte[] arrayOfByte1;
            if (!QLog.isColorLevel()) {
              continue;
            }
            QLog.d("MSF.C.NetConnTag", 2, localThrowable1.toString(), localThrowable1);
            a(localToServiceMsg, "发送错误", localThrowable1.toString());
            o.a(this.b).remove(localToServiceMsg);
          }
          if (arrayOfByte1 != null) {
            break label1341;
          }
          this.b.a(localToServiceMsg.getRequestSsoSeq());
          continue;
          localObject1 = localToServiceMsg.getMsfCommand();
          localObject2 = MsfCommand._msf_kickedAndCleanTokenResp;
          if (localObject1 != localObject2) {}
        }
      }
      catch (Throwable localThrowable2) {}
      try
      {
        localObject1 = (FromServiceMsg)localToServiceMsg.getAttribute(localToServiceMsg.getServiceCmd());
        ((FromServiceMsg)localObject1).setBusinessFail(2012, ((FromServiceMsg)localObject1).getBusinessFailMsg());
        bool1 = false;
        if (localToServiceMsg.getAttributes().containsKey("_attr_sameDevice")) {
          bool1 = ((Boolean)localToServiceMsg.getAttribute("_attr_sameDevice")).booleanValue();
        }
        if (localToServiceMsg.getAttributes().containsKey("_attr_kickInfo")) {
          ((FromServiceMsg)localObject1).addAttribute("_attr_kickInfo", localToServiceMsg.getAttribute("_attr_kickInfo"));
        }
        if (localToServiceMsg.getAttributes().containsKey("_attr_kickTitle")) {
          ((FromServiceMsg)localObject1).addAttribute("_attr_kickTitle", localToServiceMsg.getAttribute("_attr_kickTitle"));
        }
        ((FromServiceMsg)localObject1).addAttribute("_attr_sameDevice", Boolean.valueOf(bool1));
        MsfSdkUtils.addFromMsgProcessName("*", (FromServiceMsg)localObject1);
        this.b.o.a(null, (FromServiceMsg)localObject1);
        this.b.a.a(CloseConnReason.appCall);
      }
      catch (Exception localException2)
      {
        label428:
        int j;
        label580:
        byte[] arrayOfByte2;
        label637:
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("MSF.C.NetConnTag", 2, "send offlineMsg to app error " + localException2.toString());
        continue;
      }
      Thread.sleep(10L);
      continue;
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetConnTag", 2, localThrowable2.toString(), localThrowable2);
        continue;
        if (m.f())
        {
          j = m.j() + 100;
          i = j;
          if (j <= 254) {
            break label1334;
          }
          j = 254;
          i = j;
          if (!QLog.isColorLevel()) {
            break label1334;
          }
          QLog.d("MSF.C.NetConnTag", 2, "error,netWorkType is " + 254);
          i = j;
          break label1334;
        }
        if (this.a != 0L)
        {
          b1 = b2;
          if (l2 - this.a <= 60000L) {}
        }
        else
        {
          this.a = l2;
          try
          {
            NetConnInfoCenter.checkConnInfo(j.a().r, true);
            b1 = b2;
          }
          catch (Exception localException1)
          {
            QLog.d("MSF.C.NetConnTag", 1, "checkConnInfo " + localException1);
            b1 = b2;
          }
          continue;
          arrayOfByte2 = CodecWarpper.encodeRequest(localToServiceMsg.getRequestSsoSeq(), k.a(), k.c(), k.d(), "", (String)localObject2, this.b.b(), localToServiceMsg.getAppId(), o.l, localToServiceMsg.getUin(), localToServiceMsg.getUinType(), b1, localToServiceMsg.getWupBuffer());
          break label1331;
          arrayOfByte2 = new byte[0];
        }
      }
    }
    for (;;)
    {
      if (bool1) {
        break label228;
      }
      l2 = System.currentTimeMillis();
      if (l2 - l1 > localToServiceMsg.getTimeout())
      {
        QLog.i("MSF.C.NetConnTag", localToServiceMsg.getServiceCmd() + " [is already sendTimeout,break.]");
        break label228;
      }
      if ((o.y != 0L) && (l2 - o.y > ah.n()) && (this.b.a.a()))
      {
        if (o.y >= this.b.a.m().b())
        {
          o.y = 0L;
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "lastMessageTimeTooLong Close socket now. System.currentTimeMillis() - lastRecvSsoRespTime :" + (System.currentTimeMillis() - o.y) + " getNetIdleTimeInterval()" + ah.n());
          }
          this.b.a(CloseConnReason.lastMessageTimeTooLong);
        }
      }
      else if ((o.y != 0L) && (l2 - o.y > 360000L) && (this.b.a.a()) && (o.y >= this.b.a.m().b()) && (!this.b.u.get()))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "no receive data for 5 minutes, start fast net detect now.");
        }
        o.b(this.b);
      }
      boolean bool2;
      try
      {
        localToServiceMsg.addAttribute("__timestamp_msf2net_boot", Long.valueOf(SystemClock.elapsedRealtime()));
        localToServiceMsg.addAttribute("__timestamp_msf2net", Long.valueOf(0L));
        localToServiceMsg.addAttribute("_tag_socket", o.p);
        localToServiceMsg.addAttribute("_tag_localsocket", o.q);
        bool2 = this.b.a.a(localToServiceMsg.getAppId(), localToServiceMsg.getAppSeq(), (String)localObject2, str, localToServiceMsg.getMsfCommand(), localToServiceMsg.getUin(), localToServiceMsg.getRequestSsoSeq(), arrayOfByte2);
        if (!bool2)
        {
          localToServiceMsg.getAttributes().remove("__timestamp_msf2net_boot");
          localToServiceMsg.getAttributes().remove("__timestamp_msf2net");
          localToServiceMsg.getAttributes().remove("_tag_socket");
          localToServiceMsg.getAttributes().remove("_tag_localsocket");
          this.b.a.a(CloseConnReason.writeError);
          try
          {
            Thread.sleep(a.an);
            bool1 = bool2;
          }
          catch (Exception localException3)
          {
            bool1 = bool2;
          }
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.d("MSF.C.NetConnTag", 2, localException3.toString(), localException3);
          bool1 = bool2;
          continue;
          o.y = 0L;
        }
      }
      catch (Throwable localThrowable3)
      {
        for (;;)
        {
          bool2 = bool1;
          if (QLog.isColorLevel())
          {
            QLog.d("MSF.C.NetConnTag", 2, "send msg error " + localThrowable3, localThrowable3);
            bool2 = bool1;
          }
        }
        localToServiceMsg.addAttribute("__timestamp_msf2net", Long.valueOf(System.currentTimeMillis()));
        if (localToServiceMsg.getServiceCmd().startsWith("SharpSvr.c2s")) {
          o.s = SystemClock.elapsedRealtime();
        }
        bool1 = bool2;
      }
      if (this.b.H.get())
      {
        bool1 = bool2;
        if (this.b.G == -1)
        {
          this.b.G = localToServiceMsg.getRequestSsoSeq();
          QLog.d("MSF.C.NetConnTag", 1, "set afterReloadD2SendSeq " + this.b.G);
          bool1 = bool2;
          continue;
          str = null;
          break;
          label1331:
          break label165;
          label1334:
          b1 = (byte)i;
          break label145;
          label1341:
          bool1 = false;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\o$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */