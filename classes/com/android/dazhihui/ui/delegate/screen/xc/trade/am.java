package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class am
  implements DialogInterface.OnClickListener
{
  am(af paramaf) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (o.l())
    {
      af.e(this.a);
      return;
    }
    if (o.m())
    {
      this.a.a(o.g, af.f(this.a), af.g(this.a), af.h(this.a));
      return;
    }
    af.i(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */