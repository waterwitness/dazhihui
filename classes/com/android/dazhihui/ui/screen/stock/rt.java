package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.ha;

class rt
  implements ha
{
  rt(SearchStockScreen paramSearchStockScreen) {}
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      SearchStockScreen.b(this.a, true);
      this.a.e();
      return;
    }
    SearchStockScreen.b(this.a, false);
    this.a.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */