package com.alipay.sdk.j;

import android.content.pm.Signature;
import android.text.TextUtils;
import com.alipay.sdk.app.a.a;

public final class k
{
  public Signature[] a;
  public int b;
  
  public final boolean a()
  {
    if ((this.a == null) || (this.a.length <= 0)) {}
    for (;;)
    {
      return false;
      int i = 0;
      while (i < this.a.length)
      {
        String str = j.a(this.a[i].toByteArray());
        if ((str != null) && (!TextUtils.equals(str, "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649")))
        {
          a.a("biz", "PublicKeyUnmatch", str);
          return true;
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */