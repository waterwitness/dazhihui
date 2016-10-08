package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import java.util.Vector;

class bd
  implements DialogInterface.OnClickListener
{
  bd(ax paramax) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.b();
    if (o.i()) {
      ax.a(this.a).a();
    }
    for (;;)
    {
      ax.a(this.a, true);
      return;
      ax.E(this.a).removeAllElements();
      ax.F(this.a).removeAllElements();
      ax.g(this.a).removeAllElements();
      ax.G(this.a).notifyDataSetChanged();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */