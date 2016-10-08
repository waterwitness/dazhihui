package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.view.a;
import java.util.HashMap;

class gp
  implements a
{
  private gp(TradeOutsideScreen paramTradeOutsideScreen) {}
  
  public void a(String paramString)
  {
    int j;
    int i;
    if ((TradeOutsideScreen.c(this.a) != null) && (TradeOutsideScreen.c(this.a).get(paramString) != null) && (TradeOutsideScreen.d(this.a) != null))
    {
      j = ((Integer)TradeOutsideScreen.c(this.a).get(paramString)).intValue();
      i = TradeOutsideScreen.e(this.a).a(j);
      if (j <= TradeOutsideScreen.d(this.a).length - 1) {}
    }
    else
    {
      return;
    }
    paramString = TradeOutsideScreen.f(this.a);
    if (i > 0) {
      i -= 1;
    }
    for (;;)
    {
      paramString.setSelection(i);
      TradeOutsideScreen.b(this.a).setText(TradeOutsideScreen.d(this.a)[j]);
      TradeOutsideScreen.b(this.a).setVisibility(0);
      TradeOutsideScreen.h(this.a).removeCallbacks(TradeOutsideScreen.g(this.a));
      TradeOutsideScreen.h(this.a).postDelayed(TradeOutsideScreen.g(this.a), 1500L);
      return;
      i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */