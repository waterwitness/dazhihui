package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class cm
  implements View.OnClickListener
{
  cm(TradeQuery paramTradeQuery) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558777: 
      TradeQuery.g(this.a);
      if (o.l())
      {
        TradeQuery.a(this.a, "");
        TradeQuery.c(this.a, true);
        return;
      }
      if (o.m())
      {
        TradeQuery.b(this.a, "");
        TradeQuery.b(this.a, true);
        return;
      }
      TradeQuery.a(this.a, true);
      return;
    case 2131558775: 
      TradeQuery.h(this.a);
      TradeQuery.i(this.a);
      TradeQuery.j(this.a);
      new DatePickerDialog(this.a, TradeQuery.k(this.a), TradeQuery.h(this.a), TradeQuery.i(this.a) - 1, TradeQuery.j(this.a)).show();
      return;
    }
    TradeQuery.l(this.a);
    TradeQuery.m(this.a);
    TradeQuery.n(this.a);
    new DatePickerDialog(this.a, TradeQuery.o(this.a), TradeQuery.l(this.a), TradeQuery.m(this.a) - 1, TradeQuery.n(this.a)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */