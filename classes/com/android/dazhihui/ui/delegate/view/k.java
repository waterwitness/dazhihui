package com.android.dazhihui.ui.delegate.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.delegate.screen.ggt.CustomTextView;
import java.util.ArrayList;

class k
  implements AdapterView.OnItemClickListener
{
  k(TradeHeader paramTradeHeader) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (com.android.dazhihui.ui.delegate.b.o.r())
    {
      paramAdapterView = ((t)TradeHeader.e(this.a).get(paramInt)).a();
      paramView = ((t)TradeHeader.e(this.a).get(paramInt)).b();
      String str = ((t)TradeHeader.e(this.a).get(paramInt)).c();
      if ((TradeHeader.c(this.a) != null) && ((!paramView.equals(TradeHeader.f(this.a).getText().toString())) || (!paramAdapterView.equals(TradeHeader.g(this.a).getText().toString())))) {
        TradeHeader.c(this.a).a(false, paramAdapterView, paramView, str);
      }
    }
    for (;;)
    {
      if (TradeHeader.d(this.a).isShowing()) {
        TradeHeader.d(this.a).dismiss();
      }
      return;
      paramAdapterView = (String)TradeHeader.h(this.a).get(paramInt);
      if ((TradeHeader.c(this.a) != null) && (!paramAdapterView.equals(TradeHeader.g(this.a).getText().toString()))) {
        TradeHeader.c(this.a).a(false, paramAdapterView, "", "");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */