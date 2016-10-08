package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.view.View.OnClickListener;

class cc
  implements View.OnClickListener
{
  cc(HKTradeCommon paramHKTradeCommon) {}
  
  public void onClick(View paramView)
  {
    int i = 1;
    switch (paramView.getId())
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      this.a.a(i, false);
      label67:
      do
      {
        do
        {
          do
          {
            break label67;
            do
            {
              return;
            } while (HKTradeCommon.a(this.a) == 0);
            i = 0;
            break;
            if (HKTradeCommon.a(this.a) != 1) {
              break;
            }
            return;
          } while (HKTradeCommon.a(this.a) == 2);
          i = 2;
          break;
        } while (HKTradeCommon.a(this.a) == 3);
        i = 3;
        break;
      } while (HKTradeCommon.a(this.a) == 4);
      i = 4;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */