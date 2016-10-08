package tencent.tls.platform;

import tencent.tls.request.WorkThread.When;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;

class TLSHelper$11
  implements WorkThread.When
{
  TLSHelper$11(TLSHelper paramTLSHelper, req_global paramreq_global, TLSSmsLoginListener paramTLSSmsLoginListener) {}
  
  public void done(int paramInt)
  {
    async_context localasync_context = req_global.get_async_data(this.val$thisG._seq);
    TLSErrInfo localTLSErrInfo = localasync_context._last_err_msg;
    if (paramInt == 0)
    {
      this.val$listener.OnSmsLoginReaskCodeSuccess(localasync_context._smslogin_reask, localasync_context._smslogin_expire);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */