package com.tencent.qalsdk.base.remote;

import android.os.IInterface;

public abstract interface IMsfServiceCallbacker
  extends IInterface
{
  public abstract void onRecvPushResp(FromServiceMsg paramFromServiceMsg);
  
  public abstract void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\base\remote\IMsfServiceCallbacker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */