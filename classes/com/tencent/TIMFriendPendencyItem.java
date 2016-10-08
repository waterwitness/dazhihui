package com.tencent;

import com.tencent.imcore.FriendPendencyItem;
import java.io.UnsupportedEncodingException;

public class TIMFriendPendencyItem
{
  private String addSource;
  private long addTime;
  private String addWording;
  private String identifier;
  private String nickname;
  TIMPendencyGetType type;
  
  TIMFriendPendencyItem(FriendPendencyItem paramFriendPendencyItem)
  {
    try
    {
      setAddTime(paramFriendPendencyItem.getDdwAddTime());
      setIdentifier(paramFriendPendencyItem.getSIdentifier());
      setType(paramFriendPendencyItem.getIType());
      setAddSource(new String(paramFriendPendencyItem.getSAddSource(), "utf-8"));
      setAddWording(new String(paramFriendPendencyItem.getSAddWording(), "utf-8"));
      setNickname(new String(paramFriendPendencyItem.getSNickname(), "utf-8"));
      return;
    }
    catch (UnsupportedEncodingException paramFriendPendencyItem)
    {
      paramFriendPendencyItem.printStackTrace();
    }
  }
  
  public String getAddSource()
  {
    return this.addSource;
  }
  
  public long getAddTime()
  {
    return this.addTime;
  }
  
  public String getAddWording()
  {
    return this.addWording;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public String getNickname()
  {
    return this.nickname;
  }
  
  public TIMPendencyGetType getType()
  {
    return this.type;
  }
  
  public void setAddSource(String paramString)
  {
    this.addSource = paramString;
  }
  
  public void setAddTime(long paramLong)
  {
    this.addTime = paramLong;
  }
  
  public void setAddWording(String paramString)
  {
    this.addWording = paramString;
  }
  
  public void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  public void setNickname(String paramString)
  {
    this.nickname = paramString;
  }
  
  void setType(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      this.type = TIMPendencyGetType.TIM_PENDENCY_GET_COME_IN;
      return;
    case 1: 
      this.type = TIMPendencyGetType.TIM_PENDENCY_GET_COME_IN;
      return;
    case 2: 
      this.type = TIMPendencyGetType.TIM_PENDENCY_GET_SEND_OUT;
      return;
    }
    this.type = TIMPendencyGetType.TIM_PENDENCY_GET_BOTH;
  }
  
  public void setType(TIMPendencyGetType paramTIMPendencyGetType)
  {
    this.type = paramTIMPendencyGetType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendPendencyItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */