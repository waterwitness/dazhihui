package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.a;

class ag
  implements View.OnClickListener
{
  ag(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    if ((EntrustNew.h(this.a).getText().toString() != null) && (!EntrustNew.h(this.a).getText().toString().equals("")))
    {
      if ((EntrustNew.c(this.a).getText().toString() == null) || (EntrustNew.c(this.a).getText().toString().equals(""))) {
        break label209;
      }
      double d = a.d(EntrustNew.c(this.a).getText().toString());
      EntrustNew.c(this.a).setText(a.a(d + 0.01D, "0.00"));
    }
    for (;;)
    {
      if ((EntrustNew.i(this.a) > 0.0D) && (a.d(EntrustNew.c(this.a).getText().toString()) > 0.0D)) {
        EntrustNew.j(this.a).setText((int)(EntrustNew.i(this.a) / a.d(EntrustNew.c(this.a).getText().toString()) / 100.0D) * 100 + "股");
      }
      return;
      label209:
      EntrustNew.c(this.a).setText("0.01");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */