package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;

class uh
  implements DialogInterface.OnClickListener
{
  uh(SettingThirdScreen paramSettingThirdScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new com.android.dazhihui.c.a.a(this.a.getApplication()).b();
    o.u();
    com.android.dazhihui.ui.delegate.a.a().d();
    SettingThirdScreen.f(this.a);
    SettingThirdScreen.e(this.a);
    ah.a().o();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */