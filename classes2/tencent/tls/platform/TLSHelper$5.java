package tencent.tls.platform;

import tencent.tls.request.WorkThread.When;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.tlvs.tlv_t105;

class TLSHelper$5
  implements WorkThread.When
{
  TLSHelper$5(TLSHelper paramTLSHelper, req_global paramreq_global, Object paramObject, TLSUserInfo paramTLSUserInfo) {}
  
  public void done(int paramInt)
  {
    Object localObject = req_global.get_async_data(this.val$thisG._seq);
    TLSErrInfo localTLSErrInfo = ((async_context)localObject)._last_err_msg;
    if ((this.val$listener instanceof TLSSmsLoginListener))
    {
      localObject = (TLSSmsLoginListener)this.val$listener;
      if (paramInt == 0) {
        ((TLSSmsLoginListener)localObject).OnSmsLoginSuccess(this.val$userInfo);
      }
    }
    do
    {
      return;
      if (paramInt == 64536)
      {
        ((TLSSmsLoginListener)localObject).OnSmsLoginTimeout(localTLSErrInfo);
        return;
      }
      localTLSErrInfo.ErrCode = paramInt;
      ((TLSSmsLoginListener)localObject).OnSmsLoginFail(localTLSErrInfo);
      return;
      if ((this.val$listener instanceof TLSPwdLoginListener))
      {
        TLSPwdLoginListener localTLSPwdLoginListener = (TLSPwdLoginListener)this.val$listener;
        if (paramInt == 0)
        {
          localTLSPwdLoginListener.OnPwdLoginSuccess(this.val$userInfo);
          return;
        }
        if (paramInt == 2)
        {
          TLSHelper.access$1002(this.this$0, this.val$thisG._seq);
          localTLSPwdLoginListener.OnPwdLoginNeedImgcode(((async_context)localObject)._t105.get_pic(), localTLSErrInfo);
          return;
        }
        if (paramInt == 64536)
        {
          localTLSPwdLoginListener.OnPwdLoginTimeout(localTLSErrInfo);
          return;
        }
        localTLSErrInfo.ErrCode = paramInt;
        localTLSPwdLoginListener.OnPwdLoginFail(localTLSErrInfo);
        return;
      }
      if ((this.val$listener instanceof TLSGuestLoginListener))
      {
        localObject = (TLSGuestLoginListener)this.val$listener;
        if (paramInt == 0)
        {
          this.val$thisG.put_guest(this.val$thisG._userid, this.val$thisG._uin);
          TLSHelper.access$1102(this.val$thisG._userid);
          ((TLSGuestLoginListener)localObject).OnGuestLoginSuccess(this.val$userInfo);
          return;
        }
        if (paramInt == 64536)
        {
          ((TLSGuestLoginListener)localObject).OnGuestLoginTimeout(localTLSErrInfo);
          return;
        }
        ((TLSGuestLoginListener)localObject).OnGuestLoginFail(localTLSErrInfo);
        return;
      }
    } while (!(this.val$listener instanceof TLSSSOGuestLoginListener));
    localObject = (TLSSSOGuestLoginListener)this.val$listener;
    if (paramInt == 0)
    {
      this.val$thisG.put_sso_guest(this.val$thisG._userid, this.val$thisG._uin);
      TLSHelper.access$1202(this.val$thisG._userid);
      ((TLSSSOGuestLoginListener)localObject).OnGuestLoginSuccess(this.val$userInfo);
      return;
    }
    if (paramInt == 64536)
    {
      ((TLSSSOGuestLoginListener)localObject).OnGuestLoginTimeout(localTLSErrInfo);
      return;
    }
    ((TLSSSOGuestLoginListener)localObject).OnGuestLoginFail(localTLSErrInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */