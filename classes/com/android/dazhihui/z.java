package com.android.dazhihui;

import android.os.Handler;
import android.util.Log;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.SynchroType;

class z
  extends s
{
  z(w paramw, i parami)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    if (m.a().b().getNeedSynchro() != 1)
    {
      m.a().b().setNeedSynchro(1);
      m.a().b().setNeedSynchroType(SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER);
      d.a().a("SYNCHRO_AUTO", 1);
      d.a().a("SYNCHRO_AUTO_TYPE", m.a().b().getNeedSynchroType().getValue());
      d.a().g();
      Log.i("asdzxc", "手动登录自动开启同步1 type=" + m.a().b().getNeedSynchroType());
    }
    for (;;)
    {
      w.a(this.a).sendEmptyMessage(1);
      return;
      Log.i("asdzxc", "手动登录自动开启同步2 type=" + m.a().b().getNeedSynchroType());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */