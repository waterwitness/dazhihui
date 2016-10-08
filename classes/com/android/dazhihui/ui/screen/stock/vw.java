package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.SynchroType;

final class vw
  implements DialogInterface.OnClickListener
{
  vw(Activity paramActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (SystemSetingScreen.c() != null)
    {
      m.a().b().setNeedSynchro(1);
      m.a().b().setNeedSynchroType(SystemSetingScreen.c());
      d.a().a("SYNCHRO_AUTO", 1);
      d.a().a("SYNCHRO_AUTO_TYPE", m.a().b().getNeedSynchroType().getValue());
      d.a().g();
      Log.i("asdzxc", "手动设置开启同步 type=" + SystemSetingScreen.c());
      m.a().b().syncSelfStockByProtocol_3003_110();
    }
    for (;;)
    {
      if (((this.a instanceof LoginMainScreen)) && (!this.a.isFinishing())) {
        this.a.finish();
      }
      return;
      m.a().b().setNeedSynchro(2);
      d.a().a("SYNCHRO_AUTO", 2);
      d.a().g();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */