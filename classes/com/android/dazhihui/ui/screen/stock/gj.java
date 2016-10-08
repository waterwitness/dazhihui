package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import com.android.dazhihui.ui.widget.adv.p;

class gj
  implements p
{
  gj(gg paramgg) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1) {
      gg.b(this.a).postDelayed(new gk(this), 1000L);
    }
    while (paramInt != 2) {
      return;
    }
    gg.b(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */