package com.android.dazhihui.ui.screen.stock.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class bm
  extends BroadcastReceiver
{
  bm(bl parambl) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    this.a.refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */