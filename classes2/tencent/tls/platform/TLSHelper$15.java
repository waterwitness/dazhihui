package tencent.tls.platform;

import tencent.tls.request.WorkThread.When;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;

class TLSHelper$15
  implements WorkThread.When
{
  TLSHelper$15(TLSHelper paramTLSHelper, req_global paramreq_global, TLSSmsLoginListener paramTLSSmsLoginListener) {}
  
  public void done(int paramInt)
  {
    TLSErrInfo localTLSErrInfo = req_global.get_async_data(this.val$thisG._seq)._last_err_msg;
    if (paramInt == 0)
    {
      this.val$listener.OnSmsLoginVerifyCodeSuccess();
      return;
    }
    if (paramInt == 64536)
    {
      this.val$listener.OnSmsLoginTimeout(localTLSErrInfo);
      return;
    }
    this.val$listener.OnSmsLoginFail(localTLSErrInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */