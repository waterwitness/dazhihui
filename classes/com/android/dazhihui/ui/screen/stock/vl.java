package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;

class vl
  implements AdapterView.OnItemClickListener
{
  vl(uv paramuv) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = uv.e(this.a).getType();
    paramAdapterView = uv.e(this.a).getCode();
    paramView = uv.e(this.a).getName();
    Bundle localBundle = new Bundle();
    if (n.f(i, n.o(paramAdapterView))) {
      switch (paramInt)
      {
      }
    }
    do
    {
      return;
      this.a.g();
      return;
      localBundle.putString("nexturl", n.a(paramAdapterView, i, false));
      localBundle.putBoolean("ISSHOWTITLE", false);
      localBundle.putInt("BACK_GROUND_COLOR", 1);
      n.a(paramAdapterView, 1156);
      uv.b(this.a).getCurrentContainer().a(i.class, localBundle, 9998);
      return;
      uv.a(this.a).h();
      return;
      if ((i == 7) || (i == 8) || (i == 17))
      {
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          this.a.refresh();
          return;
        }
        localBundle.putString("nexturl", n.a(paramAdapterView, i, false));
        localBundle.putBoolean("ISSHOWTITLE", false);
        localBundle.putInt("BACK_GROUND_COLOR", 1);
        uv.b(this.a).getCurrentContainer().a(i.class, localBundle, 9998);
        return;
      }
      if ((i == 6) || (i == 3) || (i == 12) || (i == 18) || (i == 15) || (n.o(paramAdapterView) == 11))
      {
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          this.a.refresh();
          return;
        case 1: 
          n.a(paramAdapterView, 1143);
          localBundle.putString("name", paramView);
          localBundle.putString("code", paramAdapterView);
          localBundle.putInt("type", i);
          uv.b(this.a).getCurrentContainer().a(nz.class, localBundle, 9999);
          return;
        }
        localBundle.putString("nexturl", n.a(paramAdapterView, i, false));
        localBundle.putBoolean("ISSHOWTITLE", false);
        localBundle.putInt("BACK_GROUND_COLOR", 1);
        n.a(paramAdapterView, 1156);
        uv.b(this.a).getCurrentContainer().a(i.class, localBundle, 9998);
        return;
      }
      if (i == 5)
      {
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          this.a.refresh();
          return;
        }
        this.a.g();
        return;
      }
      if ((i != 1) && (i != 16)) {
        break;
      }
      if ((o.r()) && (o.y == o.w))
      {
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          n.a(paramAdapterView, 1379);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 3);
          return;
        case 1: 
          n.a(paramAdapterView, 1362);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 5);
          return;
        case 2: 
          n.a(paramAdapterView, 1380);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 4);
          return;
        case 3: 
          n.a(paramAdapterView, 1363);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 6);
          return;
        case 4: 
          n.a(paramAdapterView, 1381);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 8);
          return;
        case 5: 
          n.a(paramAdapterView, 1382);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 9);
          return;
        }
        n.a(paramAdapterView, 1142);
        o.a(this.a.getActivity(), i, null, null, 7);
        return;
      }
      if ((o.r()) && (o.y == o.x))
      {
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          n.a(paramAdapterView, 1142);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 19);
          return;
        case 1: 
          n.a(paramAdapterView, 1142);
          o.a(this.a.getActivity(), i, paramAdapterView, null, 20);
          return;
        }
        n.a(paramAdapterView, 1142);
        o.a(this.a.getActivity(), i, null, null, 21);
        return;
      }
    } while ((!o.r()) || (o.y != o.v));
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      n.a(paramAdapterView, 1142);
      o.a(this.a.getActivity(), i, paramAdapterView, null, 0);
      return;
    case 1: 
      n.a(paramAdapterView, 1142);
      o.a(this.a.getActivity(), i, paramAdapterView, null, 1);
      return;
    }
    n.a(paramAdapterView, 1142);
    o.a(this.a.getActivity(), i, null, null, 10);
    return;
    if (n.g(i))
    {
      switch (paramInt)
      {
      default: 
        return;
      case 0: 
        n.a(paramAdapterView, 1142);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 11);
        return;
      }
      n.a(paramAdapterView, 1142);
      o.a(this.a.getActivity(), i, paramAdapterView, null, 13);
      return;
    }
    this.a.refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */