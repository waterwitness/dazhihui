package com.alipay.sdk.app.a;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.j.h;
import java.io.IOException;

final class b
  implements Runnable
{
  b(Context paramContext, String paramString) {}
  
  public final void run()
  {
    com.alipay.sdk.f.a.b localb = new com.alipay.sdk.f.a.b();
    try
    {
      String str = h.b(this.a, "alipay_cashier_statistic_record", null);
      if ((!TextUtils.isEmpty(str)) && (localb.a(this.a, str) != null)) {
        h.a(this.a, "alipay_cashier_statistic_record");
      }
      try
      {
        if (!TextUtils.isEmpty(this.b)) {
          localb.a(this.a, this.b);
        }
        return;
      }
      catch (IOException localIOException)
      {
        h.a(this.a, "alipay_cashier_statistic_record", this.b);
        return;
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */