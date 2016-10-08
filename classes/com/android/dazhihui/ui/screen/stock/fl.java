package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter;

class fl
  extends BroadcastReceiver
{
  fl(eu parameu) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (eu.i(this.a).a() <= fp.d.a())
    {
      if (eu.f(this.a) != null) {
        eu.f(this.a).updateFromSelfStockManager();
      }
      this.a.b();
      eu.j(this.a).sendEmptyMessage(2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */