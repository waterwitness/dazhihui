package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.ui.delegate.b.o;

class df
  implements DialogInterface.OnCancelListener
{
  df(RegionTable paramRegionTable) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    o.a(this.a);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */