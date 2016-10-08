package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import com.android.dazhihui.ui.widget.adv.p;

class ts
  implements p
{
  ts(ti paramti, View paramView) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1)
    {
      this.a.setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */