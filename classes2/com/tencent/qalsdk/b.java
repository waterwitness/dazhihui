package com.tencent.qalsdk;

import com.tencent.qalsdk.util.QLog;
import tencent.tls.platform.TLSErrInfo;
import tencent.tls.platform.TLSExchangeTicketListener;
import tencent.tls.platform.TLSUserInfo;

class b
  implements TLSExchangeTicketListener
{
  b(QALSDKManager paramQALSDKManager, String paramString, QALCallBack paramQALCallBack) {}
  
  public void OnExchangeTicketFail(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("QALSDKManager", 1, "[TLSExchangeTicket] fail:" + this.a + ":" + paramTLSErrInfo.ErrCode + ":" + paramTLSErrInfo.ExtraMsg);
    this.b.onError(paramTLSErrInfo.ErrCode, paramTLSErrInfo.ExtraMsg);
  }
  
  public void OnExchangeTicketSuccess(TLSUserInfo paramTLSUserInfo)
  {
    this.c.bindID(paramTLSUserInfo.identifier, this.b);
  }
  
  public void OnExchangeTicketTimeout(TLSErrInfo paramTLSErrInfo)
  {
    this.b.onError(paramTLSErrInfo.ErrCode, paramTLSErrInfo.ExtraMsg);
    QLog.e("QALSDKManager", 1, "[TLSExchangeTicket] Timeout:" + this.a + ":" + paramTLSErrInfo.ErrCode + ":" + paramTLSErrInfo.ExtraMsg);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */