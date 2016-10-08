package com.tencent.av.Message;

import com.tencent.TIMCallBack;
import com.tencent.TIMUser;
import java.util.ArrayList;
import java.util.List;

public abstract class AvMsg
{
  int authType;
  int auth_id;
  int bussType;
  private AvMsg.Type msgType;
  private List<TIMUser> receivers;
  private TIMUser sender;
  
  public void addReceivers(TIMUser paramTIMUser)
  {
    if (this.receivers == null) {
      this.receivers = new ArrayList();
    }
    this.receivers.add(paramTIMUser);
  }
  
  public AvMsg.Type getMsgType()
  {
    return this.msgType;
  }
  
  public List<TIMUser> getReceivers()
  {
    return this.receivers;
  }
  
  public TIMUser getSender()
  {
    return this.sender;
  }
  
  public abstract void receive(byte[] paramArrayOfByte);
  
  public abstract void response(TIMCallBack paramTIMCallBack);
  
  public abstract void send(TIMCallBack paramTIMCallBack);
  
  public void setMsgType(AvMsg.Type paramType)
  {
    this.msgType = paramType;
  }
  
  public void setReceivers(List<TIMUser> paramList)
  {
    this.receivers = paramList;
  }
  
  public void setSender(TIMUser paramTIMUser)
  {
    this.sender = paramTIMUser;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\Message\AvMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */