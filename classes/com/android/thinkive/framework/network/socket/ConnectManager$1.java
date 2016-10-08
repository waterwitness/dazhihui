package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.network.packet.BeatPacket;
import com.android.thinkive.framework.network.packet.IPacket;
import java.io.IOException;

class ConnectManager$1
  implements Runnable
{
  ConnectManager$1(ConnectManager paramConnectManager) {}
  
  public void run()
  {
    try
    {
      while (ConnectManager.access$0(this.this$0))
      {
        if (!ConnectManager.access$1(this.this$0)) {
          return;
        }
        Thread.sleep(5000L);
        if (ConnectManager.access$2(this.this$0) == null) {
          ConnectManager.access$3(this.this$0).interrupt();
        }
        synchronized (ConnectManager.access$2(this.this$0))
        {
          ConnectManager.access$4(this.this$0, new BeatPacket());
          ConnectManager.access$5(this.this$0).sendPacket(ConnectManager.access$2(this.this$0));
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      ConnectManager.access$6(this.this$0, new SocketException("网络异常,请稍后再试!", SocketException.ExceptionType.IO));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\ConnectManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */