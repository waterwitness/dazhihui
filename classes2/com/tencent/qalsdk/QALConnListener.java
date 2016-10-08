package com.tencent.qalsdk;

public abstract interface QALConnListener
{
  public abstract void onConnected();
  
  public abstract void onDisconnected(int paramInt, String paramString);
  
  public abstract void onWifiNeedAuth(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\QALConnListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */