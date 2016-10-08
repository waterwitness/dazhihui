package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter;

class sy
  extends BroadcastReceiver
{
  sy(sk paramsk) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (sk.h(this.a).a() <= ta.d.a())
    {
      if (sk.d(this.a) != null) {
        sk.d(this.a).updateFromSelfStockManager();
      }
      this.a.b();
      sk.i(this.a).sendEmptyMessage(2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */