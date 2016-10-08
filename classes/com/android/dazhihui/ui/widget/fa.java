package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.uv;

class fa
  implements View.OnClickListener
{
  fa(ez paramez) {}
  
  public void onClick(View paramView)
  {
    n.a(IndexStockChartBottomWidget.h(this.a.a).u().getCode(), 20311);
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.ay);
    paramView.putExtras(localBundle);
    paramView.setClass(IndexStockChartBottomWidget.r(this.a.a), BrowserActivity.class);
    IndexStockChartBottomWidget.r(this.a.a).startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */