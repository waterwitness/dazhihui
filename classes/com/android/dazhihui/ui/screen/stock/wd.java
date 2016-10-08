package com.android.dazhihui.ui.screen.stock;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.w;

class wd
  implements CompoundButton.OnCheckedChangeListener
{
  wd(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if ((paramBoolean) && (!w.a().l()))
    {
      this.a.showShortToast("你未登录,不能设置云同步!");
      SystemSetingScreen.a(this.a).setChecked(false);
      return;
    }
    if (paramBoolean)
    {
      SystemSetingScreen.a(this.a.getString(2131166338), this.a, SystemSetingScreen.a(this.a), false);
      return;
    }
    m.a().b().setNeedSynchro(2);
    d.a().a("SYNCHRO_AUTO", m.a().b().getNeedSynchro());
    d.a().g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */