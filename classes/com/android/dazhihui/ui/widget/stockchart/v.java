package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.StockAllNewsActivity;

class v
  implements View.OnClickListener
{
  v(t paramt) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("stock_vo", t.a(this.a));
    localBundle.putString("stockCode", t.a(this.a).getCode());
    paramView.putExtras(localBundle);
    paramView.setClass(this.a.getRootView().getContext(), StockAllNewsActivity.class);
    this.a.getRootView().getContext().startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */