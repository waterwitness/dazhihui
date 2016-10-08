package com.tencent.qalsdk.sdk;

import android.os.Handler;
import com.tencent.qalsdk.QALValueCallBack;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener.Stub;
import com.tencent.qalsdk.base.remote.ToServiceMsg;

class i
  extends IBaseActionListener.Stub
{
  i(e parame, QALValueCallBack paramQALValueCallBack) {}
  
  public void onActionResult(FromServiceMsg paramFromServiceMsg) {}
  
  public void onRecvFromMsg(FromServiceMsg paramFromServiceMsg) {}
  
  public void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    e.r().post(new j(this, paramFromServiceMsg));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */