package com.tencent.qalsdk;

public abstract interface QALPushListener
{
  public abstract void onError(String paramString1, int paramInt, String paramString2);
  
  public abstract void onSuccess(String paramString, byte[] paramArrayOfByte);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\QALPushListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */