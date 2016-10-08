package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import java.util.Vector;

class an
  implements DialogInterface.OnClickListener
{
  an(af paramaf) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (o.i())
    {
      af.b(this.a, 0);
      af.a(this.a, 20);
      af.b(this.a).a();
    }
    for (;;)
    {
      af.a(this.a, true);
      return;
      af.j(this.a).removeAllElements();
      af.k(this.a).removeAllElements();
      af.l(this.a).removeAllElements();
      af.m(this.a).addFooterView(af.c(this.a).a());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */