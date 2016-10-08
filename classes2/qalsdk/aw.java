package qalsdk;

import com.tencent.qalsdk.util.QLog;
import java.net.InetSocketAddress;
import java.net.Socket;

public class aw
{
  public String a = "";
  public byte b = 1;
  public String c = "";
  
  public aw(av paramav) {}
  
  public void a()
  {
    this.b = 1;
    this.c = "";
    Object localObject = this.a;
    if (localObject == null) {}
    for (;;)
    {
      return;
      String str = localObject.split(":")[0].trim();
      int i = Integer.parseInt(localObject.split(":")[1].trim());
      this.b = 2;
      try
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "start send checkNetConnectByConnectSSO server:" + str + " port:" + i);
        }
        localObject = new Socket();
        InetSocketAddress localInetSocketAddress = new InetSocketAddress(str, i);
        ((Socket)localObject).setSoTimeout(10000);
        ((Socket)localObject).setTcpNoDelay(true);
        ((Socket)localObject).setKeepAlive(true);
        ((Socket)localObject).connect(localInetSocketAddress, 10000);
        this.b = 3;
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "checkNetConnectByConnectSSO connect server:" + str + " port:" + i + " success");
        }
        ((Socket)localObject).close();
        return;
      }
      catch (Throwable localThrowable)
      {
        if (localThrowable != null) {
          this.c = localThrowable.toString().toLowerCase();
        }
        if (this.c.indexOf("timeoutexception") > -1) {
          break label237;
        }
      }
      if (this.c.indexOf(") after") > -1) {}
      label237:
      for (this.b = 5; QLog.isColorLevel(); this.b = 4)
      {
        QLog.d("MSF.C.NetConnTag", 2, "checkNetConnectByConnectSSO Throwable connect server:" + str + " port:" + i + " failed" + localThrowable, localThrowable);
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */