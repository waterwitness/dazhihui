package com.android.dazhihui.ui.widget.stockchart;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.NewsDetailInfo;

class u
  implements View.OnClickListener
{
  u(t paramt, StockNewItem paramStockNewItem) {}
  
  public void onClick(View paramView)
  {
    paramView = this.a.getUrl();
    String str2 = String.valueOf(this.a.getType());
    paramView = paramView.substring(paramView.indexOf("wap"), paramView.length());
    String str1 = "http://mnews.gw.com.cn/" + paramView;
    paramView = "";
    if (str2.equals("1")) {
      paramView = this.b.getResources().getString(2131165992);
    }
    for (;;)
    {
      NewsDetailInfo.a(this.b.getRootView().getContext(), str1, this.a.getId(), this.a.getTitle(), paramView, "", "", t.a(this.b).getCode(), this.a.getAdvTypeShare());
      return;
      if (str2.equals("2")) {
        paramView = this.b.getResources().getString(2131165993);
      } else if (str2.equals("3")) {
        paramView = this.b.getResources().getString(2131165990);
      } else if (str2.equals("4")) {
        paramView = this.b.getResources().getString(2131165989);
      } else if (str2.equals("5")) {
        paramView = this.b.getResources().getString(2131165994);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */