package tencent.tls.platform;

import tencent.tls.account.acc_status;
import tencent.tls.report.QLog;

class TLSHelper$6
  implements TLSGuestRegListener
{
  TLSHelper$6(TLSHelper paramTLSHelper, TLSGuestLoginListener paramTLSGuestLoginListener) {}
  
  public void OnGuestRegFail(TLSErrInfo paramTLSErrInfo)
  {
    this.val$listener.OnGuestLoginFail(paramTLSErrInfo);
  }
  
  public void OnGuestRegSuccess(TLSUserInfo paramTLSUserInfo)
  {
    this.this$0.clearUserInfo(this.this$0.getGuestIdentifier());
    QLog.i("user:" + paramTLSUserInfo.identifier + " TLSGuestLogin ..." + TLSHelper.access$100(this.this$0));
    TLSHelper.access$1002(this.this$0, 0L);
    TLSHelper.access$1300(this.this$0, paramTLSUserInfo.identifier, acc_status.mpasswd.getBytes(), false, this.val$listener);
  }
  
  public void OnGuestRegTimeout(TLSErrInfo paramTLSErrInfo)
  {
    this.val$listener.OnGuestLoginTimeout(paramTLSErrInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */