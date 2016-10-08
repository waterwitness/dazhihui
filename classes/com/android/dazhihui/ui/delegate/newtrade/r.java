package com.android.dazhihui.ui.delegate.newtrade;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget.KlineView;
import com.android.dazhihui.ui.widget.k;
import java.math.BigDecimal;

class r
  implements DatePickerDialog.OnDateSetListener
{
  r(TradeDetialScreen paramTradeDetialScreen) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    paramDatePicker = paramInt1 * 10000 + (paramInt2 + 1) * 100 + paramInt3 + "";
    if (n.i(paramDatePicker, TradeDetialScreen.b(this.a)).intValue() < 0)
    {
      paramDatePicker = new k();
      paramDatePicker.a("提示");
      paramDatePicker.b("请正确设置时间区间");
      paramDatePicker.b("确认", new s(this));
      paramDatePicker.a(this.a);
      return;
    }
    if (n.i(paramDatePicker, o.y()).intValue() > 0)
    {
      paramDatePicker = new k();
      paramDatePicker.a("提示");
      paramDatePicker.b("请正确设置时间区间");
      paramDatePicker.b("确认", new t(this));
      paramDatePicker.a(this.a);
      return;
    }
    TradeDetialScreen.c(this.a, paramDatePicker);
    TradeDetialScreen.e(this.a).setText(TradeDetialScreen.b(this.a, TradeDetialScreen.a(this.a)));
    TradeDetialScreen.d(this.a).a(TradeDetialScreen.b(this.a), TradeDetialScreen.a(this.a));
    this.a.a(TradeDetialScreen.a(this.a), 1);
    this.a.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */