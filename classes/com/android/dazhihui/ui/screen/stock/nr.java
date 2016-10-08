package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;

class nr
  implements View.OnClickListener
{
  nr(OptionListActivity paramOptionListActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    paramView.putString("code", OptionListActivity.a(this.a));
    paramView.putString("name", OptionListActivity.b(this.a));
    StockVo localStockVo = new StockVo(OptionListActivity.b(this.a), OptionListActivity.a(this.a), -1, false);
    r.a(this.a, localStockVo, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */