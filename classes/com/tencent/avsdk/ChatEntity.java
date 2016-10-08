package com.tencent.avsdk;

public class ChatEntity
{
  public String AccountLevel;
  public String event;
  public String hongbaoUrl;
  public ChatEntity.ChatGuestType messageType;
  public String user;
  public String userAccount;
  public String userImg;
  
  public ChatEntity(ChatEntity.ChatGuestType paramChatGuestType)
  {
    this.messageType = paramChatGuestType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\ChatEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */