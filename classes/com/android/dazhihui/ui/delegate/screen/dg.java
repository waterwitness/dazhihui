package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class dg
  implements DialogInterface.OnClickListener
{
  dg(RegionTable paramRegionTable) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    o.a(this.a);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */