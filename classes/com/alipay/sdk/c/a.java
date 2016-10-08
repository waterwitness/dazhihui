package com.alipay.sdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.j.h;
import org.json.JSONObject;

public final class a
{
  private static a c;
  int a = 3500;
  public String b = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";
  
  public static a b()
  {
    a locala;
    Object localObject;
    if (c == null)
    {
      locala = new a();
      c = locala;
      localObject = h.b(com.alipay.sdk.h.b.a().a, "alipay_cashier_dynamic_config", null);
      if (TextUtils.isEmpty((CharSequence)localObject)) {}
    }
    try
    {
      localObject = new JSONObject((String)localObject);
      locala.a = ((JSONObject)localObject).optInt("timeout", 3500);
      locala.b = ((JSONObject)localObject).optString("tbreturl", "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&").trim();
      return c;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
  
  public final int a()
  {
    if ((this.a < 1000) || (this.a > 20000)) {
      return 3500;
    }
    new StringBuilder("DynamicConfig::getJumpTimeout >").append(this.a);
    return this.a;
  }
  
  public final void a(Context paramContext)
  {
    new Thread(new b(this, paramContext)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */