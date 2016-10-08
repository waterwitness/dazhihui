package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class ci
  implements DatePickerDialog.OnDateSetListener
{
  ci(TradeQuery paramTradeQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    TradeQuery.c(this.a, paramInt1);
    TradeQuery.d(this.a, paramInt2 + 1);
    TradeQuery.e(this.a, paramInt3);
    TradeQuery.p(this.a).setText(new StringBuilder().append(TradeQuery.h(this.a)).append("-").append(TradeQuery.i(this.a)).append("-").append(TradeQuery.j(this.a)));
    TradeQuery.c(this.a, TradeQuery.h(this.a) * 10000 + TradeQuery.i(this.a) * 100 + TradeQuery.j(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */