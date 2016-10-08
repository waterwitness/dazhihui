package com.tencent.qalsdk.base.remote;

import android.os.IInterface;

public abstract interface IBaseActionListener
  extends IInterface
{
  public abstract void onActionResult(FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRecvFromMsg(FromServiceMsg paramFromServiceMsg);
  
  public abstract void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\base\remote\IBaseActionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */