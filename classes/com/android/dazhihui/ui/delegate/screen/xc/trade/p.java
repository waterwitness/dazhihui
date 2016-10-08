package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.Vector;

class p
  implements View.OnClickListener
{
  int a;
  
  p(a parama) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131560807: 
      for (;;)
      {
        a.o(this.b).notifyDataSetChanged();
        if ((a.k(this.b) != -1) && (a.k(this.b) == a.i(this.b).size() - 1)) {
          a.p(this.b).setSelection(a.k(this.b));
        }
        if ((a.k(this.b) == -1) && (this.a == a.i(this.b).size() - 1)) {
          this.b.f.sendEmptyMessageDelayed(0, 100L);
        }
        return;
        if (a.k(this.b) != this.a) {
          a.a(this.b, this.a);
        } else {
          a.a(this.b, -1);
        }
      }
    case 2131560711: 
      if (o.i)
      {
        a.a(this.b, ((String[])a.i(this.b).get(this.a))[9]);
        a.b(this.b, ((String[])a.i(this.b).get(this.a))[8]);
      }
      for (;;)
      {
        ((TradeCommonStock)this.b.getActivity()).b = a.l(this.b);
        ((TradeCommonStock)this.b.getActivity()).c = a.m(this.b);
        ((TradeCommonStock)this.b.getActivity()).a(0);
        break;
        a.a(this.b, ((String[])a.i(this.b).get(this.a))[8]);
        a.b(this.b, ((String[])a.i(this.b).get(this.a))[9]);
      }
    case 2131560712: 
      if (o.i)
      {
        a.a(this.b, ((String[])a.i(this.b).get(this.a))[9]);
        a.b(this.b, ((String[])a.i(this.b).get(this.a))[8]);
      }
      for (;;)
      {
        ((TradeCommonStock)this.b.getActivity()).b = a.l(this.b);
        ((TradeCommonStock)this.b.getActivity()).c = a.m(this.b);
        ((TradeCommonStock)this.b.getActivity()).a(1);
        break;
        a.a(this.b, ((String[])a.i(this.b).get(this.a))[8]);
        a.b(this.b, ((String[])a.i(this.b).get(this.a))[9]);
      }
    }
    Bundle localBundle = new Bundle();
    if (o.l())
    {
      paramView = ((String[])a.i(this.b).get(this.a))[8];
      label586:
      if ((!paramView.startsWith("0")) && (!paramView.startsWith("1")) && (!paramView.startsWith("2")) && (!paramView.startsWith("3")) && (!paramView.startsWith("4"))) {
        break label772;
      }
    }
    label772:
    for (paramView = "SZ" + paramView;; paramView = "SH" + paramView)
    {
      a.c(this.b, ((String[])a.i(this.b).get(this.a))[0]);
      paramView = new StockVo(a.n(this.b), paramView, 1, false);
      localBundle.putParcelable("stock_vo", paramView);
      r.a(this.b.getActivity(), paramView, localBundle);
      break;
      if (o.m())
      {
        paramView = ((String[])a.i(this.b).get(this.a))[9];
        break label586;
      }
      paramView = ((String[])a.i(this.b).get(this.a))[8];
      break label586;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */