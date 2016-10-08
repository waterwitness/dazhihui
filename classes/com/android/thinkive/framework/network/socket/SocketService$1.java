package com.android.thinkive.framework.network.socket;

class SocketService$1
  extends Thread
{
  SocketService$1(SocketService paramSocketService, ConnectManager paramConnectManager, String paramString, int paramInt) {}
  
  public void run()
  {
    this.val$connectManager.connect(this.val$host, this.val$port);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketService$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */