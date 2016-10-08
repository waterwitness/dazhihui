package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.QALCallBack;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener.Stub;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.util.QLog;

class l
  extends IBaseActionListener.Stub
{
  l(e parame, String paramString, QALCallBack paramQALCallBack) {}
  
  public void onActionResult(FromServiceMsg paramFromServiceMsg) {}
  
  public void onRecvFromMsg(FromServiceMsg paramFromServiceMsg) {}
  
  public void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    QLog.i("CoreWrapper", this.a + " unregister resp." + paramToServiceMsg.getServiceCmd() + ":" + paramFromServiceMsg.getResultCode() + ":" + paramToServiceMsg.getRequestSsoSeq());
    e.a(this.c, paramToServiceMsg, paramFromServiceMsg, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */