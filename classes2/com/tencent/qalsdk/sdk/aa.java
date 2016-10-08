package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IMsfServiceCallbacker.Stub;
import com.tencent.qalsdk.base.remote.ToServiceMsg;

class aa
  extends IMsfServiceCallbacker.Stub
{
  aa(z paramz) {}
  
  public void onRecvPushResp(FromServiceMsg paramFromServiceMsg)
  {
    z.a(this.a, paramFromServiceMsg);
  }
  
  public void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    z.a(this.a, paramToServiceMsg, paramFromServiceMsg);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */