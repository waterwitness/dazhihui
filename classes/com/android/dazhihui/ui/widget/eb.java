package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import java.util.ArrayList;

class eb
  implements AdapterView.OnItemClickListener
{
  eb(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    r.a(((HotVideoPushStockVo)HotVideoViewFlow.b(this.a).get(paramInt)).getClickUrl(), b.a().f(), null, null);
    n.a(((HotVideoPushStockVo)HotVideoViewFlow.b(this.a).get(paramInt)).getOwnerName(), 20267);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */