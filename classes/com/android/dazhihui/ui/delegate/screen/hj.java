package com.android.dazhihui.ui.delegate.screen;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class hj
  implements View.OnClickListener
{
  hj(TransferMenuNew paramTransferMenuNew, int paramInt, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    if ((this.a == 0) || (this.a == 1)) {
      if (o.l()) {
        this.c.k();
      }
    }
    for (;;)
    {
      this.b.dismiss();
      return;
      if (o.m())
      {
        if (this.a == 0) {
          this.c.l();
        } else {
          this.c.m();
        }
      }
      else
      {
        this.c.j();
        continue;
        if (o.l()) {
          this.c.o();
        } else if (o.m()) {
          this.c.p();
        } else {
          this.c.n();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */