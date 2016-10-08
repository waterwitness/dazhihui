package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class cj
  implements DatePickerDialog.OnDateSetListener
{
  cj(TradeQuery paramTradeQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    TradeQuery.f(this.a, paramInt1);
    TradeQuery.g(this.a, paramInt2 + 1);
    TradeQuery.h(this.a, paramInt3);
    TradeQuery.q(this.a).setText(new StringBuilder().append(TradeQuery.l(this.a)).append("-").append(TradeQuery.m(this.a)).append("-").append(TradeQuery.n(this.a)));
    TradeQuery.d(this.a, TradeQuery.l(this.a) * 10000 + TradeQuery.m(this.a) * 100 + TradeQuery.n(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */