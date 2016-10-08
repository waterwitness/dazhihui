package com.android.dazhihui.ui.widget;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.ArrayList;

class fn
  implements AdapterView.OnItemClickListener
{
  fn(IndexTopLayout paramIndexTopLayout) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((IndexTopLayout.g(this.a) != null) && (IndexTopLayout.g(this.a).size() > paramInt) && (paramInt >= 0))
    {
      if (paramInt != 0) {
        break label144;
      }
      n.a("", 1244);
    }
    for (;;)
    {
      paramAdapterView = new StockVo(((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getStockName(), ((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getStockCode(), ((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getType(), ((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).isLoanable());
      paramView = new Bundle();
      paramView.putParcelable("stock_vo", paramAdapterView);
      r.a(IndexTopLayout.a(this.a), paramAdapterView, paramView);
      return;
      label144:
      if (paramInt == 1) {
        n.a("", 1245);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */