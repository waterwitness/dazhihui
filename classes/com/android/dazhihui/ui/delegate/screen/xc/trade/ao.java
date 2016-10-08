package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.b.o;
import java.util.Vector;

class ao
  implements DialogInterface.OnClickListener
{
  ao(af paramaf) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    af.j(this.a).removeAllElements();
    af.k(this.a).removeAllElements();
    af.l(this.a).removeAllElements();
    af.m(this.a).addFooterView(af.c(this.a).a());
    this.a.c(o.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */