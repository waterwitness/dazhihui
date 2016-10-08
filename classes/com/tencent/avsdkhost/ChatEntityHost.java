package com.tencent.avsdkhost;

public class ChatEntityHost
{
  public String AccountLevel;
  public String event;
  public String hongbaoUrl;
  public ChatEntityHost.ChatHostType messageType;
  public String user;
  public String userAccount;
  public String userImg;
  
  public ChatEntityHost(ChatEntityHost.ChatHostType paramChatHostType)
  {
    this.messageType = paramChatHostType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatEntityHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */