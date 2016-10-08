package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.android.dazhihui.c.a.a;

class gt
  implements AdapterView.OnItemClickListener
{
  gt(TradeOutsideScreen paramTradeOutsideScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ("".equals(((TextView)paramView.findViewById(2131561234)).getText().toString())) {}
    label97:
    for (;;)
    {
      return;
      paramAdapterView = (TextView)paramView.findViewById(2131561234);
      paramInt = 0;
      if (paramInt < a.F.length) {
        if (!a.F[paramInt].equals(paramAdapterView.getText().toString())) {}
      }
      for (;;)
      {
        if (paramInt < 0) {
          break label97;
        }
        TradeOutsideScreen.a(this.a, paramAdapterView.getText().toString());
        return;
        paramInt += 1;
        break;
        paramInt = -1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */