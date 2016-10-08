package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class pz
  extends BroadcastReceiver
{
  pz(RecentBrowseStockScreen paramRecentBrowseStockScreen) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    RecentBrowseStockScreen.a(this.a);
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */