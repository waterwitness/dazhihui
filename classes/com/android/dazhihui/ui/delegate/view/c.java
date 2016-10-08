package com.android.dazhihui.ui.delegate.view;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.delegate.a;
import java.util.ArrayList;

class c
  implements AdapterView.OnItemClickListener
{
  c(TradeAccountSwitchView paramTradeAccountSwitchView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((f)TradeAccountSwitchView.a(this.a).get(paramInt)).a();
    paramView = ((f)TradeAccountSwitchView.a(this.a).get(paramInt)).b();
    String str = ((f)TradeAccountSwitchView.a(this.a).get(paramInt)).c();
    com.android.dazhihui.ui.delegate.c.c localc = a.a().c();
    if ((localc != null) && (localc.d().equals(((f)TradeAccountSwitchView.a(this.a).get(paramInt)).b())) && (localc.c().equals(paramAdapterView))) {
      if (TradeAccountSwitchView.b(this.a).isShowing()) {
        TradeAccountSwitchView.b(this.a).cancel();
      }
    }
    do
    {
      return;
      if (TradeAccountSwitchView.c(this.a) != null) {
        TradeAccountSwitchView.c(this.a).a(paramAdapterView, paramView, str);
      }
    } while (!TradeAccountSwitchView.b(this.a).isShowing());
    TradeAccountSwitchView.b(this.a).cancel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */