package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.a;

class bk
  implements View.OnClickListener
{
  bk(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    if ((EntrustNew.h(this.a).getText().toString() != null) && (!EntrustNew.h(this.a).getText().toString().equals("")) && (EntrustNew.c(this.a).getText().toString() != null) && (!EntrustNew.c(this.a).getText().toString().equals("")))
    {
      double d = a.d(EntrustNew.c(this.a).getText().toString());
      if (d > 0.0D) {
        EntrustNew.c(this.a).setText(a.a(d - 0.01D, "0.00"));
      }
      if ((EntrustNew.i(this.a) > 0.0D) && (a.d(EntrustNew.c(this.a).getText().toString()) > 0.0D)) {
        EntrustNew.j(this.a).setText((int)(EntrustNew.i(this.a) / a.d(EntrustNew.c(this.a).getText().toString()) / 100.0D) * 100 + "股");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */