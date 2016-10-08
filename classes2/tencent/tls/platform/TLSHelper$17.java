package tencent.tls.platform;

import tencent.tls.request.WorkThread.When;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.tlvs.tlv_t105;

class TLSHelper$17
  implements WorkThread.When
{
  TLSHelper$17(TLSHelper paramTLSHelper, req_global paramreq_global, TLSPwdLoginListener paramTLSPwdLoginListener, TLSUserInfo paramTLSUserInfo) {}
  
  public void done(int paramInt)
  {
    Object localObject = req_global.get_async_data(this.val$thisG._seq);
    TLSErrInfo localTLSErrInfo = ((async_context)localObject)._last_err_msg;
    if (paramInt == 0)
    {
      this.val$listener.OnPwdLoginSuccess(this.val$userInfo);
      return;
    }
    if (paramInt == 2)
    {
      TLSHelper.access$1002(this.this$0, this.val$thisG._seq);
      localObject = ((async_context)localObject)._t105.get_pic();
      this.val$listener.OnPwdLoginNeedImgcode((byte[])localObject, localTLSErrInfo);
      return;
    }
    if (paramInt == 64536)
    {
      this.val$listener.OnPwdLoginTimeout(localTLSErrInfo);
      return;
    }
    this.val$listener.OnPwdLoginFail(localTLSErrInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$17.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */