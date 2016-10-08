package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;
import java.util.Vector;

class ap
  implements DialogInterface.OnClickListener
{
  ap(af paramaf) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    af.j(this.a).removeAllElements();
    af.k(this.a).removeAllElements();
    af.l(this.a).removeAllElements();
    af.m(this.a).addFooterView(af.c(this.a).a());
    af.b(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */