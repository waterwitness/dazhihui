package com.tencent.qalsdk.base.remote;

import android.os.IInterface;

public abstract interface IBaseService
  extends IInterface
{
  public abstract FromServiceMsg sendSyncToServiceMsg(ToServiceMsg paramToServiceMsg);
  
  public abstract int sendToServiceMsg(ToServiceMsg paramToServiceMsg);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\base\remote\IBaseService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */