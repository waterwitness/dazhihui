package com.tencent.qalsdk.util;

import tencent.tls.platform.TLSErrInfo;
import tencent.tls.platform.TLSSSOGuestLoginListener;
import tencent.tls.platform.TLSUserInfo;

class e
  implements TLSSSOGuestLoginListener
{
  e(GuestHelper paramGuestHelper) {}
  
  public void OnGuestLoginFail(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("GuestHelper", 1, "OnGuestLoginFail:" + paramTLSErrInfo.ErrCode + ":" + paramTLSErrInfo.Msg);
  }
  
  public void OnGuestLoginSuccess(TLSUserInfo paramTLSUserInfo)
  {
    com.tencent.qalsdk.sdk.e.b().a(paramTLSUserInfo.identifier);
    QLog.d("GuestHelper", 1, "OnGuestLoginSuccess:" + paramTLSUserInfo.identifier);
    com.tencent.qalsdk.sdk.e.b().b(paramTLSUserInfo.identifier, new f(this));
  }
  
  public void OnGuestLoginTimeout(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("GuestHelper", 1, "OnGuestLoginTimeout:" + paramTLSErrInfo.ErrCode + ":" + paramTLSErrInfo.Msg);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */