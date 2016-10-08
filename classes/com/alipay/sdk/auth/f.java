package com.alipay.sdk.auth;

import android.webkit.SslErrorHandler;
import com.alipay.sdk.k.e;

final class f
  implements Runnable
{
  f(a parama, SslErrorHandler paramSslErrorHandler) {}
  
  public final void run()
  {
    e.a(this.b.a, "安全警告", "由于您的设备缺少根证书，将无法校验该访问站点的安全性，可能存在风险，请选择是否继续？", "继续", new g(this), "退出", new h(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */