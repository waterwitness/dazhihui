package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.util.QLog;
import qalsdk.aa;
import qalsdk.ab;
import qalsdk.ac;
import qalsdk.ad;
import qalsdk.ae;
import qalsdk.x;

public class y
{
  public static final String a = "MsfRespHandleUtil";
  qalsdk.y b;
  aa c;
  ad d;
  ab e;
  ac f;
  ae g;
  
  public y(x[] paramArrayOfx)
  {
    if (paramArrayOfx != null)
    {
      int j = paramArrayOfx.length;
      int i = 0;
      if (i < j)
      {
        x localx = paramArrayOfx[i];
        if ((localx instanceof qalsdk.y)) {
          this.b = ((qalsdk.y)localx);
        }
        for (;;)
        {
          i += 1;
          break;
          if ((localx instanceof aa)) {
            this.c = ((aa)localx);
          } else if ((localx instanceof ad)) {
            this.d = ((ad)localx);
          } else if ((localx instanceof ab)) {
            this.e = ((ab)localx);
          } else if ((localx instanceof ac)) {
            this.f = ((ac)localx);
          } else if ((localx instanceof ae)) {
            this.g = ((ae)localx);
          }
        }
      }
    }
  }
  
  public boolean a(FromServiceMsg paramFromServiceMsg)
  {
    for (;;)
    {
      try
      {
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand.onConnOpened)
        {
          com.tencent.qalsdk.core.NetConnInfoCenter.socketConnState = 2;
          if (this.g == null) {
            break label298;
          }
          this.g.b(paramFromServiceMsg);
          bool1 = true;
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.onRecvConfigPush)
          {
            bool2 = bool1;
            if (this.g != null)
            {
              this.g.a(paramFromServiceMsg);
              bool2 = true;
            }
            if (bool2) {
              continue;
            }
            if (this.e == null) {
              continue;
            }
            this.e.a(paramFromServiceMsg);
            return true;
          }
        }
        else
        {
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.onReceFirstResp)
          {
            com.tencent.qalsdk.core.NetConnInfoCenter.socketConnState = 4;
            if (this.g == null) {
              break label298;
            }
            this.g.d(paramFromServiceMsg);
            bool1 = true;
            continue;
          }
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.onOepnConnAllFailed)
          {
            com.tencent.qalsdk.core.NetConnInfoCenter.socketConnState = 3;
            if (this.g == null) {
              break label298;
            }
            this.g.e(paramFromServiceMsg);
            bool1 = true;
            continue;
          }
          if (paramFromServiceMsg.getMsfCommand() != MsfCommand.onConnClosed) {
            break label298;
          }
          com.tencent.qalsdk.core.NetConnInfoCenter.socketConnState = 1;
          if (this.g == null) {
            break label298;
          }
          this.g.c(paramFromServiceMsg);
          bool1 = true;
          continue;
        }
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerPush)
        {
          bool2 = bool1;
          if (this.e == null) {
            continue;
          }
          this.e.a(null, paramFromServiceMsg);
          bool2 = true;
          continue;
        }
        boolean bool2 = bool1;
        if (paramFromServiceMsg.getMsfCommand() != MsfCommand.onTicketChanged) {
          continue;
        }
        bool2 = bool1;
        if (this.e == null) {
          continue;
        }
        this.e.a();
        bool2 = true;
        continue;
        return false;
        return bool2;
      }
      catch (Exception paramFromServiceMsg)
      {
        QLog.d("MsfRespHandleUtil", 1, "handle push msg error " + paramFromServiceMsg, paramFromServiceMsg);
        return true;
      }
      label298:
      boolean bool1 = false;
    }
  }
  
  public boolean a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    for (;;)
    {
      try
      {
        paramFromServiceMsg.getResultCode();
        paramFromServiceMsg.getBusinessFailCode();
        paramFromServiceMsg.getBusinessFailMsg();
        if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerPush)
        {
          if (this.e == null) {
            break label201;
          }
          this.e.a(paramToServiceMsg, paramFromServiceMsg);
          bool = true;
          if (bool) {
            continue;
          }
          if (this.b != null)
          {
            this.b.a(paramToServiceMsg, paramFromServiceMsg);
            return true;
          }
        }
        else
        {
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.unRegisterPush)
          {
            if (this.e == null) {
              break label201;
            }
            this.e.b(paramToServiceMsg, paramFromServiceMsg);
            bool = true;
            continue;
          }
          if (paramFromServiceMsg.getMsfCommand() == MsfCommand.registerCmdCallback)
          {
            if (this.e == null) {
              break label201;
            }
            this.e.c(paramToServiceMsg, paramFromServiceMsg);
            bool = true;
            continue;
          }
          if ((paramFromServiceMsg.getMsfCommand() != MsfCommand.resetCmdCallback) || (this.e == null)) {
            break label201;
          }
          this.e.d(paramToServiceMsg, paramFromServiceMsg);
          bool = true;
          continue;
        }
        return false;
        return bool;
      }
      catch (Exception paramToServiceMsg)
      {
        QLog.d("MsfRespHandleUtil", 1, "handle resp msg error " + paramToServiceMsg, paramToServiceMsg);
        return true;
      }
      label201:
      boolean bool = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */