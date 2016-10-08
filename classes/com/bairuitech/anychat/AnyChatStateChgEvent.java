package com.bairuitech.anychat;

public abstract interface AnyChatStateChgEvent
{
  public abstract void OnAnyChatActiveStateChgMessage(int paramInt1, int paramInt2);
  
  public abstract void OnAnyChatCameraStateChgMessage(int paramInt1, int paramInt2);
  
  public abstract void OnAnyChatChatModeChgMessage(int paramInt, boolean paramBoolean);
  
  public abstract void OnAnyChatMicStateChgMessage(int paramInt, boolean paramBoolean);
  
  public abstract void OnAnyChatP2PConnectStateMessage(int paramInt1, int paramInt2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatStateChgEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */