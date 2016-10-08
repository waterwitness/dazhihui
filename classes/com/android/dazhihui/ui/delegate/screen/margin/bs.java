package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class bs
  implements View.OnClickListener
{
  bs(MarginQuery paramMarginQuery) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558777: 
      MarginQuery.e(this.a);
      MarginQuery.a(this.a, true);
      return;
    case 2131559792: 
      if (MarginQuery.f(this.a).getText().toString().length() < 6)
      {
        this.a.b(0);
        return;
      }
      MarginQuery.e(this.a);
      MarginQuery.a(this.a, MarginQuery.f(this.a).getText().toString());
      return;
    case 2131558775: 
      MarginQuery.g(this.a);
      MarginQuery.h(this.a);
      MarginQuery.i(this.a);
      new DatePickerDialog(this.a, MarginQuery.j(this.a), MarginQuery.g(this.a), MarginQuery.h(this.a) - 1, MarginQuery.i(this.a)).show();
      return;
    }
    MarginQuery.k(this.a);
    MarginQuery.l(this.a);
    MarginQuery.m(this.a);
    new DatePickerDialog(this.a, MarginQuery.n(this.a), MarginQuery.k(this.a), MarginQuery.l(this.a) - 1, MarginQuery.m(this.a)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */