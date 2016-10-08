package com.android.dazhihui.ui.delegate.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.stock.TipActivity;

class l
  implements Runnable
{
  l(k paramk) {}
  
  public void run()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", 5);
    if ((b.a().f() instanceof DelegateBaseActivity)) {
      localBundle.putBoolean("gottradelogin", true);
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(localBundle);
      localIntent.setClass(k.a(this.a), TipActivity.class);
      localIntent.addFlags(268435456);
      k.a(this.a).startActivity(localIntent);
      return;
      localBundle.putBoolean("gottradelogin", false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */