package com.tencent.qalsdk;

public abstract interface QALUserStatusListener
{
  public abstract void onForceOffline(String paramString);
  
  public abstract void onRegisterFail(String paramString1, int paramInt, String paramString2);
  
  public abstract void onRegisterSucc(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\QALUserStatusListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */