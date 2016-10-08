package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class wx
  implements DialogInterface.OnClickListener
{
  wx(TipActivity paramTipActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    o.o = false;
    o.r = false;
    if (TipActivity.a(this.a)) {
      o.a(this.a);
    }
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */