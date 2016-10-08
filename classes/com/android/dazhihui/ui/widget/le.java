package com.android.dazhihui.ui.widget;

import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import java.io.PrintStream;
import java.util.ArrayList;

class le
  implements Runnable
{
  le(ld paramld) {}
  
  public void run()
  {
    System.out.println("run...");
    if ((StockChartViewflow.d(this.a.a) != null) && (StockChartViewflow.d(this.a.a).size() > 1) && (StockChartViewflow.e(this.a.a)) && (StockChartViewflow.c(this.a.a) != null)) {
      StockChartViewflow.c(this.a.a).setText(((HotVideoPushStockVo)StockChartViewflow.d(this.a.a).get(1)).getOwnerName());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\le.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */