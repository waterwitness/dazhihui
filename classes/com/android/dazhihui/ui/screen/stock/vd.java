package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.StockVo;

class vd
  implements AdapterView.OnItemClickListener
{
  vd(uv paramuv) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    uv.c(this.a).dismiss();
    int i = uv.e(this.a).getType();
    paramAdapterView = uv.e(this.a).getCode();
    new Bundle();
    if ((i == 1) || (i == 16)) {
      if ((o.r()) && (o.y == o.w)) {
        switch (paramInt)
        {
        }
      }
    }
    while (!n.g(i))
    {
      do
      {
        return;
        n.a(paramAdapterView, 1379);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 3);
        return;
        n.a(paramAdapterView, 1362);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 5);
        return;
        n.a(paramAdapterView, 1380);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 4);
        return;
        n.a(paramAdapterView, 1363);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 6);
        return;
        n.a(paramAdapterView, 1381);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 8);
        return;
        n.a(paramAdapterView, 1382);
        o.a(this.a.getActivity(), i, paramAdapterView, null, 9);
        return;
        n.a(paramAdapterView, 1142);
        o.a(this.a.getActivity(), i, null, null, 7);
        return;
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
    }
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
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */