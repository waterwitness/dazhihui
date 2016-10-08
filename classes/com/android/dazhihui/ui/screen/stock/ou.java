package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

class ou
  implements AdapterView.OnItemClickListener
{
  ou(ProfitExpectedScreen paramProfitExpectedScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Vector();
    int i = 0;
    while (i < ProfitExpectedScreen.b(this.a).size())
    {
      paramAdapterView.add(new StockVo((String)((HashMap)ProfitExpectedScreen.b(this.a).get(i)).get(Integer.valueOf(0)), (String)((HashMap)ProfitExpectedScreen.b(this.a).get(i)).get(Integer.valueOf(1)), 1, false));
      i += 1;
    }
    if ((paramInt < 0) || (paramInt >= paramAdapterView.size())) {
      return;
    }
    paramView = new Bundle();
    paramView.putParcelable("stock_vo", (Parcelable)paramAdapterView.get(paramInt));
    r.a(this.a, paramAdapterView, paramInt, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */