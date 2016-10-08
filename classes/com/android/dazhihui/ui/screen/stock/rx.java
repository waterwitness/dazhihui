package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import java.util.Vector;

class rx
  implements View.OnClickListener
{
  rx(rv paramrv, int paramInt) {}
  
  public void onClick(View paramView)
  {
    m.a().b().removeSelfStock(SearchStockScreen.h(this.b.a)[this.a]);
    new Vector().add(SearchStockScreen.h(this.b.a)[this.a]);
    rv.a(this.b)[this.a] = 0;
    this.b.notifyDataSetChanged();
    SearchStockScreen.d(this.b.a, true);
    SearchStockScreen.a(this.b.a, "");
    SearchStockScreen.d(this.b.a).setText(SearchStockScreen.c(this.b.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */