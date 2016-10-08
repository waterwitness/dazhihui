package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;

class dt
  implements DialogInterface.OnClickListener
{
  dt(TradeChecklistMenu paramTradeChecklistMenu) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    o.u();
    a.a().d();
    this.a.finish();
    if (TradeChecklistMenu.c() != null) {
      TradeChecklistMenu.c().finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */