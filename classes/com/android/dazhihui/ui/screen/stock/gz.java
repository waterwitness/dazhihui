package com.android.dazhihui.ui.screen.stock;

import android.util.Base64;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.b.c;
import com.android.dazhihui.d.a.b;
import com.android.dazhihui.wxapi.WXEntryActivity;

class gz
  extends s
{
  gz(gx paramgx, i parami, String paramString1, String paramString2)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    String str2 = FingerprintLoginScreen.a(gx.b(this.c));
    Object localObject = c.c(gx.b(this.c), "mobileMD5");
    String str1 = "";
    if (localObject != null) {
      str1 = new String((byte[])localObject);
    }
    localObject = com.android.dazhihui.g.a().u();
    x localx1 = new x(3009);
    localx1.b(2);
    x localx2 = new x(101);
    String str3 = Base64.encodeToString(com.android.dazhihui.g.a().k().a(WXEntryActivity.a().getBytes()), 0);
    localx2.a(" {\"type\":\"qqid\",\"openid\":\"" + this.a + "\",\"upass\":\"" + str3 + "\",\"access_token\":\"" + this.b + "\",\"imei\":\"" + str2 + "\",\"mobile_md5\":\"" + str1 + "\",\"qudao_id\":\"" + (String)localObject + "\"}");
    localx1.a(localx2);
    gx.a(this.c, new m(localx1));
    gx.c(this.c).a(this.c);
    com.android.dazhihui.a.g.a().a(gx.c(this.c));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */