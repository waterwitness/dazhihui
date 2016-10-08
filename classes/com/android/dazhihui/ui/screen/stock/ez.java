package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.widget.stockchart.FastDealsView;
import com.android.dazhihui.ui.widget.stockchart.f;

class ez
  implements View.OnClickListener
{
  ez(eu parameu, f paramf) {}
  
  public void onClick(View paramView)
  {
    if (this.a == f.a)
    {
      ah.a().a(eu.o(this.b).getDealPrice(), eu.o(this.b).getDealCount(), 0, eu.p(this.b).getCode().substring(2, eu.p(this.b).getCode().length()));
      this.b.a(eu.o(this.b).getDealPrice(), 0);
    }
    for (;;)
    {
      eu.n(this.b).dismiss();
      eu.o(this.b).c();
      eu.o(this.b).setVisibility(8);
      eu.o(this.b).setKeyViewVisibility(8);
      return;
      ah.a().a(eu.o(this.b).getDealPrice(), eu.o(this.b).getDealCount(), 1, eu.p(this.b).getCode().substring(2, eu.p(this.b).getCode().length()));
      this.b.a(eu.o(this.b).getDealPrice(), 1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */