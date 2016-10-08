package com.tencent.qalhttp;

import android.os.SystemClock;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener.Stub;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.sdk.e;
import com.tencent.qalsdk.util.QLog;

class b
  extends IBaseActionListener.Stub
{
  b(QALHttpHelper paramQALHttpHelper, QALHttpValueCallBack paramQALHttpValueCallBack) {}
  
  public void onActionResult(FromServiceMsg paramFromServiceMsg) {}
  
  public void onRecvFromMsg(FromServiceMsg paramFromServiceMsg) {}
  
  public void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if (!paramFromServiceMsg.isSuccess())
    {
      QALHttpHelper.access$000(this.b, paramToServiceMsg);
      if (paramFromServiceMsg.getResultCode() == 1002) {}
      for (paramToServiceMsg = "resp timeout!";; paramToServiceMsg = "server failed!")
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = QALHttpHelper.access$100(this.b);
        QLog.e("QALHttpHelper", QALHttpHelper.access$200(this.b) + "|http resp error:" + paramFromServiceMsg.getResultCode() + "|" + paramToServiceMsg);
        QALHttpHelper.access$300(this.b, this.a, paramFromServiceMsg.getResultCode(), paramToServiceMsg);
        QALHttpHelper.access$400(this.b, QALHttpHelper.cacheHelper.d, l1 - l2, paramFromServiceMsg.getResultCode(), paramToServiceMsg, false);
        return;
      }
    }
    paramFromServiceMsg = e.a(paramFromServiceMsg);
    this.b.onHttpResp(paramFromServiceMsg, paramToServiceMsg, this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */