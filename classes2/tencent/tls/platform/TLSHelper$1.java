package tencent.tls.platform;

import tencent.tls.account.TLSOpenAccountInfo;

class TLSHelper$1
  implements TLSExchangeTicketListener
{
  TLSHelper$1(TLSHelper paramTLSHelper, TLSRefreshUserSigListener paramTLSRefreshUserSigListener, TLSOpenAccountInfo paramTLSOpenAccountInfo) {}
  
  public void OnExchangeTicketFail(TLSErrInfo paramTLSErrInfo)
  {
    this.val$listener.OnRefreshUserSigFail(paramTLSErrInfo);
    TLSHelper.access$002(this.this$0, this.val$savedOpenAccountInfo);
  }
  
  public void OnExchangeTicketSuccess(TLSUserInfo paramTLSUserInfo)
  {
    this.val$listener.OnRefreshUserSigSuccess(paramTLSUserInfo);
    TLSHelper.access$002(this.this$0, this.val$savedOpenAccountInfo);
  }
  
  public void OnExchangeTicketTimeout(TLSErrInfo paramTLSErrInfo)
  {
    this.val$listener.OnRefreshUserSigTimeout(paramTLSErrInfo);
    TLSHelper.access$002(this.this$0, this.val$savedOpenAccountInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */