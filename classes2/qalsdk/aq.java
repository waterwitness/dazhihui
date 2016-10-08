package qalsdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.ae;
import com.tencent.qalsdk.util.QLog;

public class aq
{
  private static ae<ar> a = new ae(100);
  private static long b = System.currentTimeMillis() - 180000L;
  
  public static void a(as paramas)
  {
    if (!m.b()) {}
    long l;
    do
    {
      return;
      if (a.size() >= 100)
      {
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException NetExceptionEvent count = " + a.size() + "too much drop");
        return;
      }
      ar localar = new ar();
      localar.a = paramas;
      l = System.currentTimeMillis();
      localar.b = l;
      try
      {
        a.b(localar);
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException NetExceptionEvent count = " + a.size() + "");
        try
        {
          for (;;)
          {
            paramas = (ar)a.peek();
            if ((paramas == null) || (l - paramas.b < ah.q())) {
              break;
            }
            a.a();
          }
        }
        catch (Exception paramas)
        {
          paramas.printStackTrace();
        }
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException after remove expire event NetExceptionEvent count = " + a.size());
      }
      catch (Exception paramas)
      {
        paramas.printStackTrace();
        return;
      }
    } while ((l - b <= ah.q()) || (a.size() < ah.r()));
    QLog.d("MSF.C.NetExceptionStat", 2, "NetExceptionEvent count = " + a.size() + " report to ui now");
    paramas = new FromServiceMsg(m.b.i(), j.f(), "0", "cmd_connWeakNet");
    paramas.setMsgSuccess();
    paramas.setMsfCommand(MsfCommand.onConnWeakNet);
    MsfSdkUtils.addFromMsgProcessName("*", paramas);
    m.b.a(null, paramas);
    b = l;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */