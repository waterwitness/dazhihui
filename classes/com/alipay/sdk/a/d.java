package com.alipay.sdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONObject;

public final class d
{
  c a;
  Context b;
  
  public d(Context paramContext, c paramc)
  {
    this.b = paramContext;
    this.a = paramc;
  }
  
  public final void a(a parama)
  {
    if (TextUtils.isEmpty(parama.c))
    {
      a(parama.a, b.c);
      return;
    }
    parama = new e(this, parama);
    if (Looper.getMainLooper() == Looper.myLooper()) {}
    for (int i = 1; i != 0; i = 0)
    {
      parama.run();
      return;
    }
    new Handler(Looper.getMainLooper()).post(parama);
  }
  
  public final void a(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("error", paramInt - 1);
    a locala = new a("callback");
    locala.e = localJSONObject;
    locala.a = paramString;
    this.a.a(locala);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */