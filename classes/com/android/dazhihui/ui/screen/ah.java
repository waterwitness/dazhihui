package com.android.dazhihui.ui.screen;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.screen.stock.NewsDetailInfo;
import java.util.ArrayList;

class ah
  implements AdapterView.OnItemClickListener
{
  ah(StockAllNewsActivity paramStockAllNewsActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((StockAllNewsActivity.c(this.a) == null) || (paramInt > StockAllNewsActivity.c(this.a).size() - 1)) {
      return;
    }
    paramAdapterView = ((StockNewItem)StockAllNewsActivity.c(this.a).get(paramInt)).getUrl();
    String str = String.valueOf(((StockNewItem)StockAllNewsActivity.c(this.a).get(paramInt)).getType());
    paramAdapterView = paramAdapterView.substring(paramAdapterView.indexOf("wap"), paramAdapterView.length());
    paramView = "http://mnews.gw.com.cn/" + paramAdapterView;
    paramAdapterView = "";
    if (str.equals("1")) {
      paramAdapterView = this.a.getResources().getString(2131165992);
    }
    for (;;)
    {
      NewsDetailInfo.a(this.a, paramView, ((StockNewItem)StockAllNewsActivity.c(this.a).get(paramInt)).getId(), ((StockNewItem)StockAllNewsActivity.c(this.a).get(paramInt)).getTitle(), paramAdapterView, "", "", StockAllNewsActivity.d(this.a), ((StockNewItem)StockAllNewsActivity.c(this.a).get(paramInt)).getAdvTypeShare());
      return;
      if (str.equals("2")) {
        paramAdapterView = this.a.getResources().getString(2131165993);
      } else if (str.equals("3")) {
        paramAdapterView = this.a.getResources().getString(2131165990);
      } else if (str.equals("4")) {
        paramAdapterView = this.a.getResources().getString(2131165989);
      } else if (str.equals("5")) {
        paramAdapterView = this.a.getResources().getString(2131165994);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */