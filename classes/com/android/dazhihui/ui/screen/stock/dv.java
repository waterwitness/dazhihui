package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class dv
  implements b
{
  dv(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    GUHDetailBZTJ.a(this.a);
    if (GUHDetailBZTJ.b(this.a) != null) {
      GUHDetailBZTJ.b(this.a).b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */