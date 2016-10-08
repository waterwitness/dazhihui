package com.tencent;

public abstract interface TIMConnListener
{
  public abstract void onConnected();
  
  public abstract void onDisconnected(int paramInt, String paramString);
  
  public abstract void onWifiNeedAuth(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConnListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */