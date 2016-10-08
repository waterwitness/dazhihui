package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;
import java.util.Vector;

class ba
  implements DialogInterface.OnClickListener
{
  ba(ax paramax) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.b();
    ax.E(this.a).removeAllElements();
    ax.F(this.a).removeAllElements();
    ax.g(this.a).removeAllElements();
    ax.G(this.a).notifyDataSetChanged();
    this.a.f(o.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */