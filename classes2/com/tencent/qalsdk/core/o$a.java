package com.tencent.qalsdk.core;

import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.x;
import com.tencent.qalsdk.util.CodecWarpper;
import com.tencent.qalsdk.util.QLog;
import com.tencent.qalsdk.util.ZLibUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import qalsdk.at;
import qalsdk.av;

class o$a
  extends CodecWarpper
{
  o$a(o paramo) {}
  
  private CloseConnReason a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return CloseConnReason.closeForOtherReason;
    case -2: 
      return CloseConnReason.closeByDecryptFailOnce;
    case -3: 
      return CloseConnReason.closeByDecryptFailTwice;
    case -4: 
      return CloseConnReason.closeByDecryptFailEmpty;
    case -5: 
      return CloseConnReason.invalidData;
    case -6: 
      return CloseConnReason.closeByZlibDataLengthTooShort;
    case -7: 
      return CloseConnReason.closeByZlibUncompressException;
    }
    return CloseConnReason.closeByPbUnpackFailInLoginMerge;
  }
  
  private void a(FromServiceMsg paramFromServiceMsg, int paramInt)
  {
    paramFromServiceMsg.addAttribute("__timestamp_net2msf", Long.valueOf(System.currentTimeMillis()));
    paramFromServiceMsg.addAttribute("__timestamp_net2msf_boot", Long.valueOf(SystemClock.elapsedRealtime()));
    Object localObject = paramFromServiceMsg.getMsgCookie();
    if ((localObject != null) && (localObject.length > 0)) {
      this.a.o.c.a((byte[])localObject);
    }
    if ((!paramFromServiceMsg.isSuccess()) && (paramFromServiceMsg.getBusinessFailCode() == 55528)) {
      o.a(paramFromServiceMsg.getUin(), false);
    }
    paramFromServiceMsg.setRequestSsoSeq(paramFromServiceMsg.getAppSeq());
    if (m.k()) {
      m.b(false);
    }
    ToServiceMsg localToServiceMsg = this.a.o.c.a(paramFromServiceMsg.getRequestSsoSeq());
    if ((localToServiceMsg != null) && (localToServiceMsg.getAttribute("__timestamp_msf2net") != null) && (paramFromServiceMsg != null) && (paramFromServiceMsg.getAttribute("__timestamp_net2msf") != null))
    {
      l2 = ((Long)paramFromServiceMsg.getAttribute("__timestamp_net2msf")).longValue() - ((Long)localToServiceMsg.getAttribute("__timestamp_msf2net")).longValue();
      long l1 = l2;
      if (l2 < 0L) {
        l1 = 0L;
      }
      l2 = l1;
      if (l1 <= 2147483647L) {}
    }
    for (long l2 = 0L;; l2 = 0L)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      if (QLog.isDevelopLevel()) {
        if (l2 == 0L) {
          localObject = String.valueOf(l2);
        }
      }
      for (;;)
      {
        if (paramFromServiceMsg.getResultCode() != 1000)
        {
          QLog.e("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(paramFromServiceMsg.getUin()) + " cmd:" + paramFromServiceMsg.getServiceCmd() + " len:" + paramInt + " cost time:" + (String)localObject + " code:" + paramFromServiceMsg.getResultCode() + " failMsg:" + paramFromServiceMsg.getBusinessFailMsg());
          label335:
          paramFromServiceMsg.addAttribute("_tag_LOGSTR", o.p + "|" + paramFromServiceMsg.getRequestSsoSeq() + "|" + paramFromServiceMsg.getServiceCmd() + "|");
          paramFromServiceMsg.addAttribute("_tag_socket", o.p);
          paramFromServiceMsg.addAttribute("_tag_localsocket", o.q);
          if (localToServiceMsg == null) {}
        }
        try
        {
          this.a.a.a(paramFromServiceMsg, localToServiceMsg);
          if ((this.a.o.l.get()) && (this.a.o.c.a()))
          {
            this.a.a.m().a(CloseConnReason.pushNeedReConn);
            this.a.o.l.set(false);
          }
          if (localToServiceMsg != null)
          {
            paramFromServiceMsg.setAppSeq(localToServiceMsg.getAppSeq());
            paramFromServiceMsg.setMsfCommand(localToServiceMsg.getMsfCommand());
            paramFromServiceMsg.setAppId(localToServiceMsg.getAppId());
            if (!paramFromServiceMsg.isSuccess())
            {
              int i = paramFromServiceMsg.getBusinessFailCode();
              paramInt = i;
              if (i == 302)
              {
                paramFromServiceMsg.setBusinessFail(65234);
                paramInt = 65234;
              }
              if (paramInt == 65234)
              {
                this.a.a.m().a(CloseConnReason.connFull);
                this.a.o.g(localToServiceMsg);
                return;
                localObject = l2 + NetConnInfoCenter.getSignalStrengthsLog();
                continue;
                QLog.i("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(paramFromServiceMsg.getUin()) + " cmd:" + paramFromServiceMsg.getServiceCmd() + " len:" + paramInt + " cost time:" + (String)localObject);
                break label335;
                if (paramFromServiceMsg.getResultCode() != 1000)
                {
                  QLog.e("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(paramFromServiceMsg.getUin()) + " cmd:" + paramFromServiceMsg.getServiceCmd() + new StringBuilder().append(" ").append(paramFromServiceMsg.getRequestSsoSeq() + paramInt).toString() + " code:" + paramFromServiceMsg.getResultCode() + " failMsg:" + paramFromServiceMsg.getBusinessFailMsg());
                  break label335;
                }
                QLog.i("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(paramFromServiceMsg.getUin()) + " cmd:" + paramFromServiceMsg.getServiceCmd() + new StringBuilder().append(" ").append(paramFromServiceMsg.getRequestSsoSeq() + paramInt).toString());
              }
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            this.a.a.b();
            QLog.d(tag, 1, "call firstResponseGetted error " + localException, localException);
          }
          if (paramInt == 55528)
          {
            if (!x.a(localToServiceMsg))
            {
              localToServiceMsg.getAttributes().put("_attr_msg_has_resend_by_10008", Boolean.valueOf(true));
              this.a.o.g(localToServiceMsg);
              return;
            }
            QLog.d(tag, 1, "This msg has already resend by -10008, won't resend again!");
          }
        }
      }
      if (o.n().get()) {
        QLog.e(tag, 1, "invalidSign, " + paramFromServiceMsg + " is droped.");
      }
      for (;;)
      {
        NetConnInfoCenter.impl.p();
        return;
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand._msf_HeartbeatAlive)
        {
          this.a.a(paramFromServiceMsg, localToServiceMsg);
        }
        else
        {
          o.m.set(0);
          this.a.o.g().a(localToServiceMsg, paramFromServiceMsg);
        }
      }
    }
  }
  
  public void onInvalidData(int paramInt1, int paramInt2)
  {
    QLog.d(tag, 1, "MSF.C.CodecWarpper onInvalidData " + paramInt1 + " size is " + paramInt2 + ", try to closeConn");
    this.a.a.m().a(a(paramInt1));
    try
    {
      this.a.a.d();
      return;
    }
    catch (Exception localException)
    {
      QLog.d(tag, 1, "call findResponseDataError error " + localException);
    }
  }
  
  public void onInvalidSign()
  {
    QLog.d(tag, 1, "MSF.C.CodecWarpper onInvalidSign");
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(this.a.o.i(), j.f(), "0", "cmd_InvalidSign");
    localFromServiceMsg.setBusinessFail(2014, "onInvalidSign");
    localFromServiceMsg.setMsfCommand(MsfCommand.onInvalidSign);
    MsfSdkUtils.addFromMsgProcessName("*", localFromServiceMsg);
    this.a.o.a(null, localFromServiceMsg);
    o.n().set(true);
  }
  
  public void onResponse(int paramInt1, Object paramObject, int paramInt2)
  {
    Object localObject2;
    if (paramObject != null) {
      try
      {
        if (o.z != -1) {
          o.z = -1;
        }
        this.a.x = System.currentTimeMillis();
        o.y = this.a.x;
        Object localObject1 = (FromServiceMsg)paramObject;
        paramInt1 = ((FromServiceMsg)localObject1).getWupBuffer().length;
        if (((FromServiceMsg)localObject1).getServiceCmd().equals("SSO.LoginMerge"))
        {
          ((FromServiceMsg)localObject1).setRequestSsoSeq(((FromServiceMsg)localObject1).getAppSeq());
          if (!((FromServiceMsg)localObject1).isSuccess())
          {
            QLog.d("MSF.C.NetConnTag", 1, "failed merge netRecv ssoSeq:" + ((FromServiceMsg)localObject1).getRequestSsoSeq() + " scmd: " + ((FromServiceMsg)localObject1).getServiceCmd() + " len: " + ((FromServiceMsg)localObject1).getWupBuffer().length);
            localObject2 = (ArrayList)o.c(this.a).remove(Integer.valueOf(((FromServiceMsg)localObject1).getRequestSsoSeq()));
            if (((FromServiceMsg)localObject1).getBusinessFailCode() == 55429)
            {
              if (this.a.j) {
                this.a.j = false;
              }
              QLog.d("MSF.C.NetConnTag", 1, "merge not support, " + Arrays.toString(((ArrayList)localObject2).toArray()) + "resend, close merge.");
            }
            if (localObject2 != null)
            {
              localObject1 = ((ArrayList)localObject2).iterator();
              while (((Iterator)localObject1).hasNext())
              {
                paramInt1 = ((Integer)((Iterator)localObject1).next()).intValue();
                localObject2 = this.a.o.c.a(paramInt1);
                if (localObject2 != null) {
                  o.a(this.a, (ToServiceMsg)localObject2);
                }
              }
              return;
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        if (QLog.isColorLevel()) {
          QLog.d(tag, 2, "handleSsoResp " + paramObject + " error " + localThrowable.toString(), localThrowable);
        }
      }
    }
    do
    {
      do
      {
        if ((localThrowable.getFlag() & 0x1) != 0)
        {
          localObject2 = localThrowable.getWupBuffer();
          paramInt1 = localObject2.length;
          if (paramInt1 <= 4) {
            break;
          }
          paramInt1 = (localObject2[0] & 0xFF) << 24 | 0x0 | (localObject2[1] & 0xFF) << 16 | (localObject2[2] & 0xFF) << 8 | localObject2[3] & 0xFF;
        }
        try
        {
          byte[] arrayOfByte1 = new byte[paramInt1];
          System.arraycopy(localObject2, 4, arrayOfByte1, 0, paramInt1 - 4);
          arrayOfByte1 = ZLibUtils.decompress(arrayOfByte1);
          byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 4];
          arrayOfByte2[0] = ((byte)(arrayOfByte1.length + 4 >> 24 & 0xFF));
          arrayOfByte2[1] = ((byte)(arrayOfByte1.length + 4 >> 16 & 0xFF));
          arrayOfByte2[2] = ((byte)(arrayOfByte1.length + 4 >> 8 & 0xFF));
          arrayOfByte2[3] = ((byte)(arrayOfByte1.length + 4 & 0xFF));
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
          localThrowable.putWupBuffer(arrayOfByte2);
          a(localThrowable, paramInt2);
          return;
        }
        catch (Exception localException)
        {
          if (QLog.isColorLevel()) {
            QLog.d(tag, 2, "uncompress data failed " + localException);
          }
        }
      } while (localThrowable.getServiceCmd().equals("SSO.LoginMerge"));
      onInvalidData(-7, localObject2.length);
      return;
    } while (localThrowable.getServiceCmd().equals("SSO.LoginMerge"));
    onInvalidData(-6, localObject2.length);
  }
  
  public void onSSOPingResponse()
  {
    QLog.i("MSF.C.NetConnTag", 1, "netRecv cmd:qal.hello");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\o$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */