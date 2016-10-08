package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import com.android.dazhihui.ui.widget.adv.p;

class tu
  implements p
{
  tu(ti paramti, View paramView) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1) {
      this.a.postDelayed(new tv(this), 1000L);
    }
    while (paramInt != 2) {
      return;
    }
    this.a.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */