package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import java.util.ArrayList;

class ra
  implements AdapterView.OnItemClickListener
{
  ra(SearchPeopleFragment paramSearchPeopleFragment) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramView.getId() == 2131560284) {
      return;
    }
    r.a(((HotVideoPushStockVo)this.a.m.get(paramInt - 1)).getClickUrl(), this.a.getContext(), "", null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */