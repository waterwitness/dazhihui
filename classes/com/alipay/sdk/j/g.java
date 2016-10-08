package com.alipay.sdk.j;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.alipay.b.a.e;

final class g
  extends e
{
  g(d paramd) {}
  
  public final void a(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    try
    {
      localBundle.putInt("CallingPid", paramInt);
      localIntent.putExtras(localBundle);
      localIntent.setClassName(paramString1, paramString2);
      if (d.b(this.a) != null) {
        d.b(this.a).startActivity(localIntent);
      }
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  public final void a(boolean paramBoolean, String paramString) {}
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */