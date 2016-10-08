package com.android.dazhihui.ui.widget;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.NewsDetailInfo;
import java.io.PrintStream;
import java.util.Vector;

class id
  implements View.OnClickListener
{
  id(hv paramhv) {}
  
  public void onClick(View paramView)
  {
    n.a("", 20091);
    String str1 = paramView.getTag().toString();
    if ((str1 != null) && (str1.equals("GUH")))
    {
      str1 = paramView.getTag(2131558470).toString();
      str2 = paramView.getTag(2131558471).toString();
      System.out.println("R.id.tag_first = " + str1);
      System.out.println("R.id.tag_second = " + str2);
      localBundle = new Bundle();
      localVector = new Vector();
      if (n.l(str2))
      {
        paramView = new StockVo(str1, str2, 0, false);
        localVector.add(paramView);
        localBundle.putParcelable("stock_vo", paramView);
        localBundle.putString("code", str2);
        localBundle.putString("name", str1);
        localBundle.putBoolean("go_guba", true);
        r.a(hv.f(this.a), localVector, 0, localBundle);
      }
    }
    while ((str1 == null) || (!str1.equals("ZX"))) {
      for (;;)
      {
        String str2;
        Bundle localBundle;
        Vector localVector;
        return;
        paramView = new StockVo(str1, str2, 1, false);
      }
    }
    paramView = paramView.getTag(2131558470).toString();
    NewsDetailInfo.a(hv.f(this.a), paramView, "", "资讯", "资讯", "", "", "", "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */