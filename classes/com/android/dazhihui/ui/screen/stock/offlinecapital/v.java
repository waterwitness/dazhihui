package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.BaseAdapter;
import com.android.dazhihui.c.a.d;
import java.util.Vector;

class v
  implements DialogInterface.OnClickListener
{
  v(u paramu, int paramInt) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = ((n)OfflineCapitalMine.a(this.b.a).get(this.a)).c();
    String str = ((n)OfflineCapitalMine.a(this.b.a).get(this.a)).b();
    paramDialogInterface = new n(paramDialogInterface, "0", ah.a().n(), str, "0", "0", "0");
    OfflineCapitalMine.b(this.b.a).a(paramDialogInterface);
    OfflineCapitalMine.b(this.b.a).g();
    this.b.a.n();
    OfflineCapitalMine.c(this.b.a).notifyDataSetChanged();
    if (OfflineCapitalMine.d(this.b.a) == 0)
    {
      OfflineCapitalMine.b(this.b.a).a("offline_capital_state", 0);
      OfflineCapitalMine.b(this.b.a).g();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */