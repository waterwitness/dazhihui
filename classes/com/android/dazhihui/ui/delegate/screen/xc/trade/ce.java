package com.android.dazhihui.ui.delegate.screen.xc.trade;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class ce
  implements lz
{
  ce(TradeQuery paramTradeQuery) {}
  
  public void a()
  {
    TradeQuery.a(this.a, 20);
    TradeQuery.b(this.a, 0);
    TradeQuery.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= TradeQuery.a(this.a))
    {
      TradeQuery.b(this.a).d();
      return;
    }
    TradeQuery.a(this.a, 10);
    TradeQuery.b(this.a, paramInt);
    TradeQuery.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */