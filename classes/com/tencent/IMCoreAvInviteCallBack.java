package com.tencent;

import com.tencent.av.TIMAvManager;
import com.tencent.imcore.IAvInviteCallBack;

public class IMCoreAvInviteCallBack
  extends IAvInviteCallBack
{
  private String identifer;
  
  public IMCoreAvInviteCallBack(String paramString)
  {
    this.identifer = paramString;
    swigReleaseOwnership();
  }
  
  public void onAvInviteBuf(byte[] paramArrayOfByte)
  {
    TIMAvManager.getInstanceById(this.identifer).MsgNotify(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreAvInviteCallBack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */