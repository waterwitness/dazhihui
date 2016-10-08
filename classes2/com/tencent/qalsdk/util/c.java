package com.tencent.qalsdk.util;

import com.tencent.qalsdk.sdk.e;
import tencent.tls.platform.TLSErrInfo;
import tencent.tls.platform.TLSRefreshUserSigListener;
import tencent.tls.platform.TLSUserInfo;

class c
  implements TLSRefreshUserSigListener
{
  c(GuestHelper paramGuestHelper, String paramString, boolean paramBoolean) {}
  
  public void OnRefreshUserSigFail(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("GuestHelper", 1, "OnRefreshUserSigFail:" + this.a + ":" + this.b);
  }
  
  public void OnRefreshUserSigSuccess(TLSUserInfo paramTLSUserInfo)
  {
    QLog.i("GuestHelper", 1, "TLSRefreshUserSig succ:" + this.a + ":" + this.b);
    if (this.b) {
      e.b().b(this.a, new d(this));
    }
  }
  
  public void OnRefreshUserSigTimeout(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("GuestHelper", 1, "OnRefreshUserSigTimeout:" + this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */