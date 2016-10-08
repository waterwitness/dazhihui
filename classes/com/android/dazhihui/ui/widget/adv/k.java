package com.android.dazhihui.ui.widget.adv;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class k
  implements AdapterView.OnItemClickListener
{
  k(AdvertView paramAdvertView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((AdvertView.a(this.a).advList == null) || (AdvertView.a(this.a).advList.size() == 0)) {
      return;
    }
    paramView = (AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(paramInt);
    if ((AdvertView.a(this.a).isDSP) && (AdvertView.b(this.a) != null) && (AdvertView.b(this.a).clktracks != null))
    {
      paramAdapterView = AdvertView.b(this.a).clktracks.iterator();
      while (paramAdapterView.hasNext()) {
        ad.a((String)paramAdapterView.next());
      }
    }
    if (this.a.getRootView() != null) {}
    for (paramAdapterView = this.a.getRootView().getContext();; paramAdapterView = this.a.getContext())
    {
      r.a(paramView.callurl, paramAdapterView, paramView.countid, null);
      if ((!AdvertView.a(this.a).closetype.equals("4")) && (!AdvertView.a(this.a).closetype.equals("5")) && (!AdvertView.a(this.a).closetype.equals("6"))) {
        break;
      }
      this.a.f();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */