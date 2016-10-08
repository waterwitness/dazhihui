package com.bairuitech.anychat;

public abstract interface AnyChatBaseEvent
{
  public abstract void OnAnyChatConnectMessage(boolean paramBoolean);
  
  public abstract void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2);
  
  public abstract void OnAnyChatLinkCloseMessage(int paramInt);
  
  public abstract void OnAnyChatLoginMessage(int paramInt1, int paramInt2);
  
  public abstract void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2);
  
  public abstract void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatBaseEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */