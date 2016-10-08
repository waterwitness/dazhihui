package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.uv;

class fd
  implements View.OnClickListener
{
  fd(ez paramez, fh paramfh) {}
  
  public void onClick(View paramView)
  {
    if (d.a().e())
    {
      if (d.a().d(false))
      {
        this.a.e.setImageResource(2130837523);
        return;
      }
      paramView = new Intent();
      localBundle = new Bundle();
      localBundle.putString("nexturl", f.aA);
      paramView.putExtras(localBundle);
      paramView.setClass(IndexStockChartBottomWidget.r(this.b.a), BrowserActivity.class);
      IndexStockChartBottomWidget.r(this.b.a).startActivity(paramView);
      return;
    }
    if (d.a().d(true))
    {
      n.a(IndexStockChartBottomWidget.h(this.b.a).u().getCode(), 20313);
      this.a.e.setImageResource(2130837524);
      IndexStockChartBottomWidget.v(this.b.a);
      return;
    }
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.aA);
    paramView.putExtras(localBundle);
    paramView.setClass(IndexStockChartBottomWidget.r(this.b.a), BrowserActivity.class);
    IndexStockChartBottomWidget.r(this.b.a).startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */