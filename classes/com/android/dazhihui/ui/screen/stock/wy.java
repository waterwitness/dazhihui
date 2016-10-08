package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.ui.delegate.b.o;

class wy
  implements DialogInterface.OnCancelListener
{
  wy(TipActivity paramTipActivity) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    o.o = false;
    o.r = false;
    if (TipActivity.a(this.a)) {
      o.a(this.a);
    }
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */