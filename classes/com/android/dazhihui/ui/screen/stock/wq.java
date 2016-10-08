package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;

class wq
  implements DialogInterface.OnClickListener
{
  wq(TipActivity paramTipActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    m.a().b(false);
    paramDialogInterface = d.a();
    paramDialogInterface.a("FIRST_WARN", 1);
    paramDialogInterface.g();
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */