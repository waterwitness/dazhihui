package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.util.Log;

public class ReconnectionThread
  extends Thread
{
  private ConnectManager mConnectManager;
  private int port;
  private String serverIp;
  private int waiting;
  
  ReconnectionThread(ConnectManager paramConnectManager, String paramString, int paramInt)
  {
    this.mConnectManager = paramConnectManager;
    this.waiting = 0;
    this.serverIp = paramString;
    this.port = paramInt;
  }
  
  private int waiting()
  {
    if (this.waiting > 20) {
      return 600;
    }
    if (this.waiting > 13) {
      return 300;
    }
    if (this.waiting <= 7) {
      return 10;
    }
    return 60;
  }
  
  public void run()
  {
    try
    {
      while (!isInterrupted())
      {
        if (this.mConnectManager.isAuthed()) {
          return;
        }
        Thread.sleep(waiting() * 1000L);
        Log.d("断线重连！！！");
        this.mConnectManager.connect(this.serverIp, this.port);
        this.waiting += 1;
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\ReconnectionThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */