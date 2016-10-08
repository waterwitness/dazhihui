package com.android.dazhihui.ui.widget;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.List;

class gd
  implements View.OnClickListener
{
  gd(gc paramgc, int paramInt) {}
  
  public void onClick(View paramView)
  {
    paramView = (ga)IndexTopWidget.b().get(this.a);
    paramView = new StockVo(paramView.b, paramView.a, paramView.d, false);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("stock_vo", paramView);
    r.a(this.b.a.getContext(), paramView, localBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */