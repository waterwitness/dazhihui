package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.android.dazhihui.ui.delegate.b.o;

class g
  implements DialogInterface.OnClickListener
{
  g(a parama) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    o.u();
    com.android.dazhihui.ui.delegate.a.a().d();
    o.a(this.a.getActivity());
    this.a.getActivity().finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */