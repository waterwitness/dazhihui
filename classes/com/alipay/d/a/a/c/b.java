package com.alipay.d.a.a.c;

import android.content.Context;
import com.alipay.b.b.a.a.ag;
import com.alipay.b.b.a.a.e;
import com.alipay.b.b.a.a.q;
import org.json.JSONObject;

public final class b
  implements a
{
  private static b d = null;
  private static com.alipay.g.a.a.b.b.b e;
  private ag a = null;
  private com.alipay.g.a.a.a.a b = null;
  private com.alipay.g.a.a.b.a c = null;
  
  private b(Context paramContext, String paramString)
  {
    e locale = new e();
    locale.a(paramString);
    this.a = new q(paramContext);
    this.b = ((com.alipay.g.a.a.a.a)this.a.a(com.alipay.g.a.a.a.a.class, locale));
    this.c = ((com.alipay.g.a.a.b.a)this.a.a(com.alipay.g.a.a.b.a.class, locale));
  }
  
  public static b a(Context paramContext, String paramString)
  {
    try
    {
      if (d == null) {
        d = new b(paramContext, paramString);
      }
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  public final com.alipay.g.a.a.b.b.b a(com.alipay.g.a.a.b.a.a parama)
  {
    if (this.c != null)
    {
      e = null;
      new Thread(new c(this, parama)).start();
      int i = 300000;
      while ((e == null) && (i >= 0))
      {
        Thread.sleep(50L);
        i -= 50;
      }
    }
    return e;
  }
  
  public final boolean a(String paramString)
  {
    if (com.alipay.d.a.a.a.a.a(paramString)) {
      return false;
    }
    Object localObject;
    if (this.b != null) {
      localObject = null;
    }
    for (;;)
    {
      try
      {
        paramString = this.b.a(com.alipay.d.a.a.a.a.e(paramString));
        if (!com.alipay.d.a.a.a.a.a(paramString))
        {
          bool = ((Boolean)new JSONObject(paramString).get("success")).booleanValue();
          return bool;
        }
      }
      catch (Exception paramString)
      {
        paramString = (String)localObject;
        continue;
      }
      boolean bool = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */