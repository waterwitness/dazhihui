package tencent.tls.platform;

import tencent.tls.request.WorkThread.When;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;

class TLSHelper$3
  implements WorkThread.When
{
  TLSHelper$3(TLSHelper paramTLSHelper, req_global paramreq_global, Object paramObject, TLSUserInfo paramTLSUserInfo) {}
  
  public void done(int paramInt)
  {
    TLSErrInfo localTLSErrInfo = req_global.get_async_data(this.val$thisG._seq)._last_err_msg;
    req_global.remove_async_data(this.val$thisG._seq);
    TLSRefreshUserSigListener localTLSRefreshUserSigListener = (TLSRefreshUserSigListener)this.val$listener;
    if (paramInt == 0)
    {
      localTLSRefreshUserSigListener.OnRefreshUserSigSuccess(this.val$userInfo);
      return;
    }
    if (paramInt == 64536)
    {
      localTLSRefreshUserSigListener.OnRefreshUserSigTimeout(localTLSErrInfo);
      return;
    }
    localTLSErrInfo.ErrCode = paramInt;
    localTLSRefreshUserSigListener.OnRefreshUserSigFail(localTLSErrInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */