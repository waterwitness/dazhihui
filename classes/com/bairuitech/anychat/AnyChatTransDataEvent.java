package com.bairuitech.anychat;

public abstract interface AnyChatTransDataEvent
{
  public abstract void OnAnyChatSDKFilterData(byte[] paramArrayOfByte, int paramInt);
  
  public abstract void OnAnyChatTransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public abstract void OnAnyChatTransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public abstract void OnAnyChatTransFile(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatTransDataEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */