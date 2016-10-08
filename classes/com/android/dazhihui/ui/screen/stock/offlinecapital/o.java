package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.screen.BaseActivity;

class o
  implements DialogInterface.OnClickListener
{
  o(OfflineCapitalInitActivity paramOfflineCapitalInitActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    com.android.dazhihui.ui.delegate.b.o.u();
    a.a().d();
    com.android.dazhihui.ui.delegate.b.o.a(this.a.getApplicationContext());
    ((BaseActivity)this.a.getApplicationContext()).finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */