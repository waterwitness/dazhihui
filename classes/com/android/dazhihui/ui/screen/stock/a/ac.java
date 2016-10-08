package com.android.dazhihui.ui.screen.stock.a;

import android.util.Log;
import com.android.dazhihui.a.u;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.stock.MainScreen;

class ac
  implements u
{
  ac(ab paramab) {}
  
  public void finishMarketDispatch()
  {
    if ((this.a.getActivity() != null) && ((this.a.getActivity() instanceof MainScreen)) && (this.a.L) && (this.a.isResumed()) && (this.a.isVisible()))
    {
      this.a.refresh();
      if (g.a().L()) {
        Log.i("s2978", "市场-沪深 finishMarketDispatch");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */