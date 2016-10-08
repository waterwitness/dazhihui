package com.android.dazhihui.ui.widget;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.AdvList;
import com.android.dazhihui.ui.model.stock.StockVo;

class ge
  implements View.OnClickListener
{
  ge(gc paramgc, GroupAdvertVo.AdvList paramAdvList) {}
  
  public void onClick(View paramView)
  {
    if (this.a.urlPage.contains("dzh_browser_url"))
    {
      r.a(this.a.urlPage, this.b.a.getContext(), this.a.countid, null);
      return;
    }
    paramView = IndexTopWidget.a(this.b.a, this.a.content);
    paramView = new StockVo(paramView.b, paramView.a, paramView.d, false);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("stock_vo", paramView);
    r.a(this.b.a.getContext(), paramView, localBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */