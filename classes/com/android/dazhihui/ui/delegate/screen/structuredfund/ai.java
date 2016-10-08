package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;

class ai
  implements View.OnClickListener
{
  ai(StructuredFundQuery paramStructuredFundQuery) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558777: 
      StructuredFundQuery.c(this.a);
      StructuredFundQuery.a(this.a, true);
      return;
    case 2131558775: 
      StructuredFundQuery.d(this.a);
      StructuredFundQuery.e(this.a);
      StructuredFundQuery.f(this.a);
      new DatePickerDialog(this.a, StructuredFundQuery.g(this.a), StructuredFundQuery.d(this.a), StructuredFundQuery.e(this.a) - 1, StructuredFundQuery.f(this.a)).show();
      return;
    }
    StructuredFundQuery.h(this.a);
    StructuredFundQuery.i(this.a);
    StructuredFundQuery.j(this.a);
    new DatePickerDialog(this.a, StructuredFundQuery.k(this.a), StructuredFundQuery.h(this.a), StructuredFundQuery.i(this.a) - 1, StructuredFundQuery.j(this.a)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */