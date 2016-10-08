package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.CheckBox;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;

final class vu
  implements DialogInterface.OnCancelListener
{
  vu(CheckBox paramCheckBox, Activity paramActivity) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    m.a().b().setNeedSynchro(2);
    d.a().a("SYNCHRO_AUTO", 2);
    d.a().g();
    if (this.a != null) {
      this.a.setChecked(false);
    }
    if (((this.b instanceof LoginMainScreen)) && (!this.b.isFinishing())) {
      this.b.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */