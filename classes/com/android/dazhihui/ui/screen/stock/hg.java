package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.FrameLayout;
import com.android.dazhihui.g;

class hg
  extends BroadcastReceiver
{
  hg(MainScreen paramMainScreen) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.android.dazhihui.handleupgrade".equals(paramIntent.getAction())))
    {
      Log.i("GUH", "MainScreen upgradeReceiver mUpdateHandle=" + MainScreen.a(this.a));
      if ((MainScreen.b(this.a) != null) && (!MainScreen.a(this.a)) && (!this.a.isFinishing())) {}
    }
    do
    {
      do
      {
        return;
        MainScreen.b(this.a).postDelayed(new hh(this), 15000L);
        return;
      } while ((paramIntent == null) || (!"com.android.dazhihui.bullet".equals(paramIntent.getAction())));
      Log.i("GUH", "MainScreen upgradeReceiver mBulletCRC=" + MainScreen.c(this.a).N() + ",mBulletType=" + MainScreen.c(this.a).O() + ",string=" + MainScreen.c(this.a).M());
    } while ((MainScreen.b(this.a) == null) || (this.a.isFinishing()));
    MainScreen.b(this.a).postDelayed(new hi(this), 1000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */