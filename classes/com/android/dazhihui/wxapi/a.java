package com.android.dazhihui.wxapi;

import android.util.Base64;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.b.c;
import com.android.dazhihui.d.a.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.stock.FingerprintLoginScreen;

class a
  extends s
{
  a(WXEntryActivity paramWXEntryActivity, i parami, String paramString)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    String str2 = FingerprintLoginScreen.a(this.b);
    Object localObject = c.c(this.b, "mobileMD5");
    String str1 = "";
    if (localObject != null) {
      str1 = new String((byte[])localObject);
    }
    localObject = g.a().u();
    x localx1 = new x(3009);
    localx1.b(2);
    x localx2 = new x(101);
    String str3 = Base64.encodeToString(g.a().k().a(WXEntryActivity.a().getBytes()), 0);
    localx2.a(" {\"type\":\"wxid\",\"appid\":\"" + WXEntryActivity.a + "\",\"upass\":\"" + str3 + "\",\"code\":\"" + this.a + "\",\"imei\":\"" + str2 + "\",\"mobile_md5\":\"" + str1 + "\",\"qudao_id\":\"" + (String)localObject + "\"}");
    localx1.a(localx2);
    WXEntryActivity.a(this.b, new m(localx1));
    this.b.registRequestListener(WXEntryActivity.a(this.b));
    this.b.sendRequest(WXEntryActivity.a(this.b));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\wxapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */