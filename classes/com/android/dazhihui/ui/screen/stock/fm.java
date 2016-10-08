package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.a.u;

class fm
  implements u
{
  fm(eu parameu) {}
  
  public void finishMarketDispatch()
  {
    if ((this.a.isVisible()) && (eu.k(this.a)))
    {
      this.a.b();
      eu.j(this.a).sendEmptyMessageDelayed(2, 3000L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */